package tdt4250.pseudocode.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringJoiner;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import tdt4250.pseudocode.AndOrExpression;
import tdt4250.pseudocode.ArithmeticSigned;
import tdt4250.pseudocode.BooleanLiteral;
import tdt4250.pseudocode.BooleanNegation;
import tdt4250.pseudocode.Collection;
import tdt4250.pseudocode.CollectionAccessor;
import tdt4250.pseudocode.Comparison;
import tdt4250.pseudocode.DoubleLiteral;
import tdt4250.pseudocode.Equals;
import tdt4250.pseudocode.Expression;
import tdt4250.pseudocode.Function;
import tdt4250.pseudocode.FunctionCall;
import tdt4250.pseudocode.List;
import tdt4250.pseudocode.ListLitteral;
import tdt4250.pseudocode.Minus;
import tdt4250.pseudocode.MultiOrDiv;
import tdt4250.pseudocode.NumberLiteral;
import tdt4250.pseudocode.Plus;
import tdt4250.pseudocode.SetLitteral;
import tdt4250.pseudocode.SizeExpression;
import tdt4250.pseudocode.Stop;
import tdt4250.pseudocode.StringLiteral;
import tdt4250.pseudocode.Type;
import tdt4250.pseudocode.Variable;
import tdt4250.pseudocode.VariableReference;

@SuppressWarnings("all")
public class PcodeTypeInferencer {
  protected String _infer(final Function e) {
    String type = "";
    HashSet<String> returnTypes = new HashSet<String>();
    Iterable<Stop> _filter = Iterables.<Stop>filter(IteratorExtensions.<EObject>toIterable(e.eAllContents()), Stop.class);
    for (final Stop stop : _filter) {
      if ((Objects.equal(stop.getType(), "return") && (stop.getValue() != null))) {
        returnTypes.add(this.infer(stop.getValue()));
      }
    }
    boolean _isEmpty = returnTypes.isEmpty();
    if (_isEmpty) {
      type = "void";
    } else {
      type = IterableExtensions.<String>last(returnTypes);
    }
    return type;
  }
  
  protected String _infer(final Expression e) {
    return null;
  }
  
  protected String _infer(final Variable e) {
    Type _type = e.getType();
    boolean _tripleNotEquals = (_type != null);
    if (_tripleNotEquals) {
      return this.infer(e.getType());
    } else {
      return this.infer(e.getValue());
    }
  }
  
  protected String _infer(final List e) {
    String _autobox = this.autobox(this.infer(e.getType()));
    String _plus = ("List<" + _autobox);
    return (_plus + ">");
  }
  
  public String toJvmType(final String type) {
    String _lowerCase = type.toLowerCase();
    if (_lowerCase != null) {
      switch (_lowerCase) {
        case "number":
          return "int";
        case "text":
          return "String";
        case "decimal":
          return "double";
        case "array":
        case "list":
        case "table":
          return "List";
        case "set":
          return "Set";
        default:
          return type;
      }
    } else {
      return type;
    }
  }
  
  public String autobox(final String type) {
    String _lowerCase = type.toLowerCase();
    if (_lowerCase != null) {
      switch (_lowerCase) {
        case "boolean":
          return "Boolean";
        case "int":
          return "Integer";
        case "double":
          return "Double";
        default:
          return type;
      }
    } else {
      return type;
    }
  }
  
  public String unbox(final String type) {
    String _lowerCase = type.toLowerCase();
    if (_lowerCase != null) {
      switch (_lowerCase) {
        case "boolean":
          return "boolean";
        case "integer":
          return "int";
        case "double":
          return "double";
        default:
          return type;
      }
    } else {
      return type;
    }
  }
  
  protected String _infer(final SetLitteral e) {
    String _autobox = this.autobox(this.toJvmType(this.infer(e.getElements().get(0)).toString()));
    String _plus = ("Set<" + _autobox);
    return (_plus + ">");
  }
  
  protected String _infer(final ListLitteral e) {
    String _autobox = this.autobox(this.toJvmType(this.infer(e.getElements().get(0)).toString()));
    String _plus = ("List<" + _autobox);
    return (_plus + ">");
  }
  
  protected String _infer(final CollectionAccessor e) {
    Expression _value = e.getCollection().getValue();
    Collection v = ((Collection) _value);
    Variable _collection = e.getCollection();
    Variable variable = ((Variable) _collection);
    Type _type = variable.getType();
    boolean _tripleNotEquals = (_type != null);
    if (_tripleNotEquals) {
      Type _type_1 = variable.getType();
      Type varType = ((Type) _type_1);
      return this.unbox(this.toJvmType(varType.getTypes().get(((Object[])Conversions.unwrapArray(e.getAccessor(), Object.class)).length)));
    }
    Expression element = v.getElements().get(0);
    if ((element instanceof Collection)) {
      v = ((Collection) element);
      String _autobox = this.autobox(this.toJvmType(this.infer(v.getElements().get(0))));
      String _plus = ("List<" + _autobox);
      return (_plus + ">");
    } else {
      return this.infer(element);
    }
  }
  
  protected String _infer(final AndOrExpression e) {
    return this.infer(e.getLeft());
  }
  
  protected String _infer(final Comparison e) {
    return this.infer(e.getLeft());
  }
  
  protected String _infer(final Equals e) {
    return this.infer(e.getLeft());
  }
  
  protected String _infer(final Plus e) {
    String leftType = this.infer(e.getLeft());
    String rightType = this.infer(e.getRight());
    if (((leftType != rightType) && (Objects.equal(leftType, "String") || Objects.equal(rightType, "String")))) {
      return "String";
    }
    if ((Objects.equal(leftType, "double") || Objects.equal(rightType, "double"))) {
      return "double";
    }
    return leftType;
  }
  
  protected String _infer(final Minus e) {
    String leftType = this.infer(e.getLeft());
    String rightType = this.infer(e.getRight());
    if ((Objects.equal(leftType, "double") || Objects.equal(rightType, "double"))) {
      return "double";
    }
    return this.infer(e.getLeft());
  }
  
  protected String _infer(final MultiOrDiv e) {
    return this.infer(e.getLeft());
  }
  
  protected String _infer(final BooleanNegation e) {
    return this.infer(e.getExpression());
  }
  
  protected String _infer(final ArithmeticSigned e) {
    return this.infer(e.getExpression());
  }
  
  protected String _infer(final NumberLiteral e) {
    return "int";
  }
  
  protected String _infer(final DoubleLiteral e) {
    return "double";
  }
  
  protected String _infer(final StringLiteral e) {
    return "String";
  }
  
  protected String _infer(final BooleanLiteral e) {
    return "boolean";
  }
  
  protected String _infer(final VariableReference e) {
    return this.infer(e.getRef());
  }
  
  protected String _infer(final FunctionCall e) {
    return this.infer(e.getRef());
  }
  
  protected String _infer(final SizeExpression e) {
    return "int";
  }
  
  protected String _infer(final Type e) {
    String string = "";
    int _length = ((Object[])Conversions.unwrapArray(e.getTypes(), Object.class)).length;
    boolean _greaterThan = (_length > 1);
    if (_greaterThan) {
      StringJoiner joiner = new StringJoiner("<");
      EList<String> _types = e.getTypes();
      for (final String type : _types) {
        joiner.add(this.autobox(this.toJvmType(type)));
      }
      String endString = "";
      for (int i = 0; (i < (e.getTypes().size() - 1)); i++) {
        String _endString = endString;
        endString = (_endString + ">");
      }
      String _string = string;
      String _string_1 = joiner.toString();
      String _plus = (_string_1 + endString);
      string = (_string + _plus);
    } else {
      String _string_2 = string;
      String _jvmType = this.toJvmType(e.getTypes().get(0));
      string = (_string_2 + _jvmType);
    }
    return string;
  }
  
  public String infer(final EObject e) {
    if (e instanceof List) {
      return _infer((List)e);
    } else if (e instanceof ListLitteral) {
      return _infer((ListLitteral)e);
    } else if (e instanceof SetLitteral) {
      return _infer((SetLitteral)e);
    } else if (e instanceof AndOrExpression) {
      return _infer((AndOrExpression)e);
    } else if (e instanceof ArithmeticSigned) {
      return _infer((ArithmeticSigned)e);
    } else if (e instanceof BooleanLiteral) {
      return _infer((BooleanLiteral)e);
    } else if (e instanceof BooleanNegation) {
      return _infer((BooleanNegation)e);
    } else if (e instanceof CollectionAccessor) {
      return _infer((CollectionAccessor)e);
    } else if (e instanceof Comparison) {
      return _infer((Comparison)e);
    } else if (e instanceof DoubleLiteral) {
      return _infer((DoubleLiteral)e);
    } else if (e instanceof Equals) {
      return _infer((Equals)e);
    } else if (e instanceof FunctionCall) {
      return _infer((FunctionCall)e);
    } else if (e instanceof Minus) {
      return _infer((Minus)e);
    } else if (e instanceof MultiOrDiv) {
      return _infer((MultiOrDiv)e);
    } else if (e instanceof NumberLiteral) {
      return _infer((NumberLiteral)e);
    } else if (e instanceof Plus) {
      return _infer((Plus)e);
    } else if (e instanceof SizeExpression) {
      return _infer((SizeExpression)e);
    } else if (e instanceof StringLiteral) {
      return _infer((StringLiteral)e);
    } else if (e instanceof Variable) {
      return _infer((Variable)e);
    } else if (e instanceof VariableReference) {
      return _infer((VariableReference)e);
    } else if (e instanceof Expression) {
      return _infer((Expression)e);
    } else if (e instanceof Function) {
      return _infer((Function)e);
    } else if (e instanceof Type) {
      return _infer((Type)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
