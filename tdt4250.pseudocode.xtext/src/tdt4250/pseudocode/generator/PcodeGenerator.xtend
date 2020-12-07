/*
 * generated by Xtext 2.22.0
 */
package tdt4250.pseudocode.generator

import java.util.ArrayList
import java.util.HashSet
import java.util.StringJoiner
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import tdt4250.pseudocode.AndOrExpression
import tdt4250.pseudocode.ArithmeticSigned
import tdt4250.pseudocode.BooleanLiteral
import tdt4250.pseudocode.BooleanNegation
import tdt4250.pseudocode.CollectionAccessor
import tdt4250.pseudocode.CollectionAdd
import tdt4250.pseudocode.CollectionRemove
import tdt4250.pseudocode.Comparison
import tdt4250.pseudocode.DoubleLiteral
import tdt4250.pseudocode.Equals
import tdt4250.pseudocode.Expression
import tdt4250.pseudocode.ForExpression
import tdt4250.pseudocode.Function
import tdt4250.pseudocode.FunctionCall
import tdt4250.pseudocode.IfExpression
import tdt4250.pseudocode.List
import tdt4250.pseudocode.ListLitteral
import tdt4250.pseudocode.Minus
import tdt4250.pseudocode.Model
import tdt4250.pseudocode.MultiOrDiv
import tdt4250.pseudocode.NumberLiteral
import tdt4250.pseudocode.ParenthesizedExpression
import tdt4250.pseudocode.Plus
import tdt4250.pseudocode.Print
import tdt4250.pseudocode.SetLitteral
import tdt4250.pseudocode.Statement
import tdt4250.pseudocode.Stop
import tdt4250.pseudocode.StringLiteral
import tdt4250.pseudocode.ValueExchange
import tdt4250.pseudocode.Variable
import tdt4250.pseudocode.VariableReference
import tdt4250.pseudocode.WhileExpression

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PcodeGenerator extends AbstractGenerator {

    var typeInferencer = new PcodeTypeInferencer()
    var varCounter = 0
    var varList = new ArrayList<String>
    var importTypes = new HashSet<String>
    var packageName = ''

    /**
     * Da burde det meste funke ;)
     * Vi genererer korrekt java kode!!!
     * 
     * Eneste som mangler er:
     * +=, -=, ++, --
     * reassignments of variables. altså i = 2, også senere i=1... Her må vi ikke ha med type 2 gangen..
     * i=i rekursjerer evig... Den prøver å finne en type for i... Her må vi kjøre en sjekk om det neste rekursjonskallet er den samme variabelen elns..
     * list og listLiteral og setLitteral lager ett ekstra komma!
     * 
     * 
     * Formateringen av Java koden er litt rar.. dette er pga. ''' ''' templates greierne... de legger til newlines
     * (men koden kan testes ;) bare  trykk shift + command + f så formaterer  eclipse automatisk ! men koden må være riktig da! 
     * Foreslår at vi generere vanlige strenger? Evt. string builder?
     * 
     */
    /*Da tror jeg  reassignments av variabler skal fungere fint!
     * Lagret navnene på variablene i en tabel varList, og når en variabel lages sjekker den typen variabel
     * Jeg la også til en op type i variabel modellen, da får vi lett satt hvordan forskjellige typer kan brukes
     * så lov til i = 9 og i += 2 og i++, men ikke i ++ 9 
     * Det er bare å gjøre det på en annen måte hvis du ikke liker denne :)
     * 
     * Må også fikse print da den kun tar et element
     * */
    /**
     * Da er vi vel mer eller mindre good!
     * 
     * Har fikset opp litt av hvert. Blant annet så er vel mer eller mindre all 
     * automatisk type gjenfinning ok :) Sets funker også. Diverse java typer blir 
     * automatisk importert om man bruker set eller list.
     * Formatering bør også nå se bra ut !
     * Fikset lister med ekstra komma.
     * 
     * 
     * Det som står igjen er:
     * 
     * - print tar kun et element
     * - auto importering av genererte klasse filer hvis de refereres til
     * - kunne skrive mer avanserte typer i parametere (i FUNCTION(her!!! lol) )
     *      vi trenger f.eks list of list of number
     * 
     * - + gjøre eCore modellen finere? med andre ord, legge til abstrakte klasser og liknende? 
     *      kanskje vi kan flytte logikken i typeInferencer til operasjoner på selve ecore objektene?
     *      eks. getType? idk...
     * 
     * - ellers så er det generell koderydding også validering da... Dette gjøres i tdt4250.pseudocode.validation
     *      formatering også er kanskje nyttig?  : i tdt4250.pseudocode.formatting2
     * 
     * - også må vi selvfølgelig lage en (eller flere :) ) readme filer som beskriver prosjektene...
     *      ta en titt på denne ;) https://github.com/andstor/tdt4250
     */
    /**
     * Da har jeg fått ordnet litt til :)
     * Kanskje vi kan ta et lite møte på søndag kl 2?
     * Bare å ringe meg om jeg fortsatt er i koma xD 91601472
     * 
     * - auto import virker nå som det skal
     * - avanserte variabel typer funker nå ;) eks "list with list with number" = List<List<Integer>
     * - Formatering - når en starter en eclipse instans så har nå editoren auto formatering av innrykk ;) 
     *     Men man MÅ skrive første innrykket etter funksjoner eller if osv.. Pga. BEGIN og END.. har prøvd mye men får det ikke helt til.
     *     Ser på nett at det er tydeligvis noe bugs i xtext...
     *     ellers så er det rom  for forbedring her!!!!
     * - Pakker - la inn pakke som man KAN spesifisere i starten av filen. Dette lager
     *     java pakker (mappe struktur) og importering virker. Det virker å lage flere .pcode filer og 
     *     referere til funksjoner i de !! :)
     * 
     * Tror at print er ok uten komma... Btw så gjorde jeg den om til System.out.print istedenfor println.
     *     ettersom det bare er å skrive \n for linje.
     * 
     * Så da står igjen (se forrige kommentar over)
     * - litt fiksing/rydding i ecore modellen
     * - validering - spes typer.. eks kan ikke si at en int variabel skal plusse på  en  String senere...
     * - Readme filer
     * - formatering - diverse
     * - function call without assignment
     * - formatering av features
     * - Skifte navn på ifExpression, for osv til ifStatement
     * - keyword: times
     */
     
     
    /**
     * Da har jeg  fikset litt til :)
     * 
     * - Parametere i funksjonskall funker
     * - Main fuunksjon er da good to go! Ble ganske fancy :)  Va litt jobb her ettersom man kan kalle main med  argumenter 
     *     (gjøres i Run Configuration,eller når man  kjører via kommandolinje)
     *     Har pr. nå støtte for String, int, double og boolean. Dette er dynamisk  basert på parameterene til funksjonen som er satt til "executable".
     *     Man kan ikke lage ister som argument (har brukt mye tid på dette, men d gikk ikke .. ARRRG!) 
     * - Man  kan nå skrive print line "xxx"  og  det svarer til System.out.println. \n er også nå riktig escapet.
     * 
     * 
     * Prøvde å fikse times og divide keywords, men  dette tror jeg vi må gjøre med enums ;) .... ble veldig rotete
     * Skal få satt opp readme struktur i morra (den 7. des.).
     * 
     * 
     * Så også på  validering med Acceleo query language (AQL) (constraints),  men dette viste seg å være VELDIG
     * vankselig å koble inn  i xtext prosjektet... Så tror vi dropper dette...
     * Det får holde  med enums (og forhåpentligvis operasjoner når jeg kommer så langt) :)
     * 
     * btw så kom jeg på at man kan lage TYPER i ecore... Er dette noe vi kunna brukt? (må isåfall sjekke at typer faktisk virker i Xtext)
     * eks for TypeLiteral? - istedenfor enums? åsså kan vi heller ha enums til eks operasjons tegn ol.? eks for =,  + "pluss", - "minus"?? idk..
     * Du får styre på slik du vill ;)
     *  
     * 
     * Snakes!
     * 
     */
    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

        var resPrint = ""

        for (e : resource.allContents.toIterable.filter(Function)) {
            varCounter = 0 // Reset counter
            varList.clear() // Empty variable list
            importTypes.clear() // Empty import list
            packageName = null
            packageName = (e.eContainer as Model).package
            var folder = ''
            if (packageName !== null) {
                folder += packageName.replace('.', '/') + '/'
            }
            var res = e.generate
            resPrint += res
            fsa.generateFile(folder + e.name + '.java', res)
        }
        // TODO: remove prints below before delivery
        println(resPrint)
        println("--------------------------------------------------")
        println('Variable counter: ' + varCounter)
        println('Variables: ' + varList)
        println('Import types: ' + importTypes)
    }

    def generate(Function e) {
        var string = ''
        var type = typeInferencer.infer(e)
        var params = ''
        if (!e.parameters.isEmpty) {
            params += e.parameters.generateParameters
        }
        var body = ''
        for (f : e.features) {
            body += f.generateFeature
        }

        var main = ''
        if(e.executable) main = generateMainFunction(e)

        string += '''
            «IF packageName !== null» package «packageName»;«ENDIF»
            
            «FOR importType : importTypes»
                import «importType»;
            «ENDFOR»
            
            public class «e.name» {
                public static «type» run(«params») {
                    «body»
                }
                
                «main»
            }
        '''
        return string
    }

    def generateMainFunction(Function function) {
        var string = ''
        var argString = ''
        var argList = new StringJoiner(",");

        if (!function.parameters.isEmpty) {
            for (var i = 0; i < function.parameters.length; i++) {
                var param = function.parameters.get(i)
                val variable = param as Variable
                val type = typeInferencer.infer(variable.type)
                val convertedType = generateTypeConvertionCode('args[' + i + ']', type)

                var arg = 'ARG' + i
                argString += type + ' ' + arg + ' = ' + convertedType + ';\n'

                argList.add(arg)
            }
        }

        string += '''
            public static void main(final String[] args) {
                «argString»
                run(«argList.toString»);
            }
        '''
    }

    def generateTypeConvertionCode(String value, String type) {
        switch (type) {
            case 'String':
                return value
            case 'int':
                return 'Integer.parseInt(' + value + ')'
            case 'double':
                return 'Double.parseDouble(' + value + ')'
            case 'boolean':
                return 'Boolean.parseBoolean(' + value + ')'
            default: {
                return value
            }
        }
    }

    def generateParameters(EList<Expression> variables) {
        var parameters = ""
        for (v : variables) {
            val variable = v as Variable
            val type = typeInferencer.infer(variable.type)
            // if( !varList.contains(variable.name)){ parameters += typeInferencer.toJvmType(type.name) + " " + variable.name + ", "}
            parameters += typeInferencer.toJvmType(type) + " " + variable.name + ", "
            varList.add(variable.name)
        }
        parameters = parameters.substring(0, parameters.length - 2)
        return parameters
    }

    def dispatch generateFeature(Statement e) '''
    «e.generateStatement»'''

    def dispatch generateFeature(Expression e) '''
    «e.generateExpression»'''

    def dispatch generateStatement(IfExpression e) '''
        if («e.condition.LiteralExpression») {
            «FOR f : e.then»
                «f.generateFeature»
            «ENDFOR»
        }«IF !e.otherwise.isEmpty» else {
                                                            «FOR f : e.otherwise»«f.generateFeature»«ENDFOR»
        }«ENDIF»
    '''

    def dispatch generateStatement(ForExpression e) {
        var variable = uniqueVariable();
        return '''
            for (int «variable» = «e.from.LiteralExpression»; «variable» <= «e.to.LiteralExpression»; «variable»++) {
                «FOR b : e.block»
                    «b.generateFeature»
                «ENDFOR»
            }
        '''
    }

    def uniqueVariable() {
        return 'VAR' + varCounter++
    }

    def dispatch generateStatement(WhileExpression e) '''
        while («e.condition.LiteralExpression») {
        	«FOR b : e.block»
        	    «b.generateFeature»
        	«ENDFOR»
        }
    '''

    def dispatch generateStatement(Stop e) {
        var string = ''
        string += e.type
        if (e.value !== null) {
            string += ' ' + e.value.LiteralExpression + ';'
        }
        return string

    }

    def printvarList() {
        var v = varList.size()
        return '''«v»'''
    }

    def dispatch generateExpression(Variable e) {
        var string = ''
        if (!varList.contains(e.name)) {
            string += typeInferencer.infer(e.value) + ' ' + e.name + ' = ' + e.value.LiteralExpression + ';'
            varList.add(e.name)
        } else {
            if (e.op.equals('++') || e.op.equals('--')) {
                string += e.name + e.op
            } else {
                string += e.name + ' ' + e.op + ' ' + e.value.LiteralExpression + ';'
            }
        }
        return string + '\n'
    }

    def dispatch generateExpression(Print e) {
        if (e.newline) {
            return '''
                System.out.println(«e.value.LiteralExpression»);
            '''
        } else {
            return '''
                System.out.print(«e.value.LiteralExpression»);
            '''
        }

    }

    def dispatch generateExpression(CollectionAdd e) '''
    «e.collection.name».add(«e.value.LiteralExpression»);'''

    def dispatch generateExpression(CollectionRemove e) '''
    «e.collection.name».remove(«e.value.LiteralExpression»);'''

    def dispatch generateExpression(ValueExchange e) {
        var variable1 = uniqueVariable();
        var variable2 = uniqueVariable();
        var exp1 = e.collection.LiteralExpression.toString
        var exp2 = e.value.LiteralExpression.toString

        if (e.collection instanceof CollectionAccessor) {
            exp1 = PcodeGeneratorUtils.replaceLast('get', 'set', exp1)
            exp1 = PcodeGeneratorUtils.replaceLast(')', ',' + variable2 + ')', exp1)
        } else {
            exp1 = exp1 + '=' + variable2
        }

        if (e.value instanceof CollectionAccessor) {
            exp2 = PcodeGeneratorUtils.replaceLast('get', 'set', exp2)
            exp2 = PcodeGeneratorUtils.replaceLast(')', ',' + variable1 + ')', exp2)

        } else {
            exp2 = exp2 + '=' + variable1
        }

        return '''
            «typeInferencer.infer(e.collection)» «variable1» = «e.collection.LiteralExpression»;
            «typeInferencer.infer(e.value)» «variable2» = «e.value.LiteralExpression»;
            «exp1»;
            «exp2»;
        '''
    }

    // LiteralExpression
    // TODO: trim last comma ","
    def dispatch String LiteralExpression(List e) {
        var string = ''
        var listType = typeInferencer.autobox(typeInferencer.infer(e.type))
        string += 'new ArrayList<' + listType + '>'
        importTypes.add('java.util.ArrayList')
        importTypes.add('java.util.List')
        if (e.elements.isEmpty) {
            string += '()'
        } else {
            string += '(Arrays.asList('
            importTypes.add('java.util.Arrays')
            var joiner = new StringJoiner(",");
            for (element : e.elements) {
                joiner.add(element.LiteralExpression.toString)
            }
            string += joiner.toString + '))'
        }

        return string
    }

    def dispatch LiteralExpression(SetLitteral e) {
        var string = ''
        var listType = typeInferencer.autobox(typeInferencer.infer(e.elements.get(0)).toString)
        string += 'new HashSet<' + listType + '>'
        importTypes.add('java.util.HashSet')
        importTypes.add('java.util.Set')
        if (e.elements.isEmpty) {
            string += '()'
        } else {
            string += '(Arrays.asList('
            importTypes.add('java.util.Arrays')
            var joiner = new StringJoiner(",");
            for (element : e.elements) {
                joiner.add(element.LiteralExpression.toString)
            }
            string += joiner.toString + '))'
        }
        return string
    }

    // TODO: trim last comma ","
    def dispatch LiteralExpression(ListLitteral e) {
        var string = ''
        var listType = typeInferencer.autobox(typeInferencer.infer(e.elements.get(0)).toString)
        string += 'new ArrayList<' + listType + '>'
        if (e.elements.isEmpty) {
            string += '()'
        } else {
            string += '(Arrays.asList('
            var joiner = new StringJoiner(",");
            for (element : e.elements) {
                joiner.add(element.LiteralExpression.toString)
            }
            string += joiner.toString + '))'
        }
        return string
    }

    def dispatch LiteralExpression(CollectionAccessor e) {
        var string = ''
        string += e.collection.name
        for (accessor : e.accessor) {
            string += '.get(' + accessor.LiteralExpression + ')'
        }
        return string
    }

    def dispatch LiteralExpression(AndOrExpression e) '''
    «e.left.LiteralExpression»«e.op»«e.right.LiteralExpression»'''

    def dispatch LiteralExpression(Comparison e) '''
    «e.left.LiteralExpression»«e.op»«e.right.LiteralExpression»'''

    def dispatch LiteralExpression(Equals e) '''
    «e.left.LiteralExpression»«e.op»«e.right.LiteralExpression»'''

    // ArithmeticExpression
    def dispatch LiteralExpression(ParenthesizedExpression e) '''
    («e.expression.LiteralExpression»)'''

    def dispatch LiteralExpression(Plus e) '''
    «e.left.LiteralExpression»+«e.right.LiteralExpression»'''

    def dispatch LiteralExpression(Minus e) '''
    «e.left.LiteralExpression»-«e.right.LiteralExpression»'''

    def dispatch LiteralExpression(MultiOrDiv e) '''
    «e.left.LiteralExpression»«e.op»«e.right.LiteralExpression»'''

    // TODO fix convert to float and support keywords divide and times
    def dispatch LiteralExpression(BooleanNegation e) '''
    !«e.expression.LiteralExpression»'''

    def dispatch LiteralExpression(ArithmeticSigned e) '''
    -«e.expression.LiteralExpression»'''

    def dispatch LiteralExpression(NumberLiteral e) { return e.value }

    def dispatch LiteralExpression(DoubleLiteral e) { return e.value }

    def dispatch LiteralExpression(StringLiteral e) { return '"' + PcodeGeneratorUtils.escape(e.value) + '"' }

    def dispatch LiteralExpression(BooleanLiteral e) { return e.value }

    def dispatch LiteralExpression(VariableReference e) '''
    «e.ref.name»'''

    def dispatch LiteralExpression(FunctionCall e) {
        var string = ''
        string += e.ref.name + '.run('
        var refPackageName = (e.ref.eContainer as Model).package

        // Don't add import if call is to function in current file.
        if (refPackageName !== null && !refPackageName.equals(packageName)) {
            importTypes.add(refPackageName + '.' + e.ref.name)
        }

        if (!e.arguments.isEmpty) {
            var joiner = new StringJoiner(",");
            for (param : e.arguments) {
                joiner.add(param.LiteralExpression.toString)
            }
            string += joiner.toString
        }
        string += ')'
        return string
    }
}
