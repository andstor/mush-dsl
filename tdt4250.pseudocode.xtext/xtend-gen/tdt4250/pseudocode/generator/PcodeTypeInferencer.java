package tdt4250.pseudocode.generator;

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import tdt4250.pseudocode.AndOrExpression;
import tdt4250.pseudocode.ArithmeticSigned;
import tdt4250.pseudocode.BooleanNegation;
import tdt4250.pseudocode.Collection;
import tdt4250.pseudocode.CollectionAccessor;
import tdt4250.pseudocode.Comparison;
import tdt4250.pseudocode.Equals;
import tdt4250.pseudocode.Expression;
import tdt4250.pseudocode.Identifier;
import tdt4250.pseudocode.List;
import tdt4250.pseudocode.ListLitteral;
import tdt4250.pseudocode.MultiOrDiv;
import tdt4250.pseudocode.NumberLiteral;
import tdt4250.pseudocode.Plus;
import tdt4250.pseudocode.SetLitteral;
import tdt4250.pseudocode.StringLiteral;
import tdt4250.pseudocode.TypeLiteral;
import tdt4250.pseudocode.Variable;
import tdt4250.pseudocode.VariableReference;

@SuppressWarnings("all")
public class PcodeTypeInferencer {
  protected Object _infer(final Expression e) {
    return null;
  }
  
  protected Object _infer(final Variable e) {
    Identifier _type = e.getType();
    boolean _tripleNotEquals = (_type != null);
    if (_tripleNotEquals) {
      return this.infer(e.getType());
    } else {
      return this.infer(e.getValue());
    }
  }
  
  protected Object _infer(final List e) {
    String _autobox = this.autobox(this.toJvmType(e.getType()));
    String _plus = ("ArrayList<" + _autobox);
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
          return "float";
        case "array":
        case "list":
        case "table":
          return "ArrayList";
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
        case "float":
          return "Float";
        default:
          return type;
      }
    } else {
      return type;
    }
  }
  
  protected Object _infer(final SetLitteral e) {
    return this.autobox(this.toJvmType(this.infer(e.getElements().get(0)).toString()));
  }
  
  protected Object _infer(final ListLitteral e) {
    String _autobox = this.autobox(this.toJvmType(this.infer(e.getElements().get(0)).toString()));
    String _plus = ("ArrayList<" + _autobox);
    return (_plus + ">");
  }
  
  protected Object _infer(final CollectionAccessor e) {
    Expression _value = e.getCollection().getValue();
    Collection v = ((Collection) _value);
    for (int i = 0; (i <= ((Object[])Conversions.unwrapArray(e.getAccessor(), Object.class)).length); i++) {
      {
        Expression element = v.getElements().get(0);
        if ((element instanceof Collection)) {
          v = ((Collection) element);
        } else {
          return this.infer(element);
        }
      }
    }
    return null;
  }
  
  protected Object _infer(final AndOrExpression e) {
    return this.infer(e.getLeft());
  }
  
  protected Object _infer(final Comparison e) {
    return this.infer(e.getLeft());
  }
  
  protected Object _infer(final Equals e) {
    return this.infer(e.getLeft());
  }
  
  protected Object _infer(final Plus e) {
    return this.infer(e.getLeft());
  }
  
  protected Object _infer(final MultiOrDiv e) {
    return this.infer(e.getLeft());
  }
  
  protected Object _infer(final BooleanNegation e) {
    return this.infer(e.getExpression());
  }
  
  protected Object _infer(final ArithmeticSigned e) {
    return this.infer(e.getExpression());
  }
  
  protected Object _infer(final NumberLiteral e) {
    return "int";
  }
  
  protected Object _infer(final StringLiteral e) {
    return "String";
  }
  
  protected Object _infer(final VariableReference e) {
    return this.infer(e.getRef());
  }
  
  protected Object _infer(final TypeLiteral e) {
    return this.toJvmType(e.getName());
  }
  
  public Object infer(final EObject e) {
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
    } else if (e instanceof BooleanNegation) {
      return _infer((BooleanNegation)e);
    } else if (e instanceof CollectionAccessor) {
      return _infer((CollectionAccessor)e);
    } else if (e instanceof Comparison) {
      return _infer((Comparison)e);
    } else if (e instanceof Equals) {
      return _infer((Equals)e);
    } else if (e instanceof MultiOrDiv) {
      return _infer((MultiOrDiv)e);
    } else if (e instanceof NumberLiteral) {
      return _infer((NumberLiteral)e);
    } else if (e instanceof Plus) {
      return _infer((Plus)e);
    } else if (e instanceof StringLiteral) {
      return _infer((StringLiteral)e);
    } else if (e instanceof Variable) {
      return _infer((Variable)e);
    } else if (e instanceof VariableReference) {
      return _infer((VariableReference)e);
    } else if (e instanceof Expression) {
      return _infer((Expression)e);
    } else if (e instanceof TypeLiteral) {
      return _infer((TypeLiteral)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
