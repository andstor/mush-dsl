package tdt4250.mush.xtext.generator

class MushGeneratorUtils {

    def static String replaceLast(String find, String replace, String string) {
        var lastIndex = string.lastIndexOf(find);

        if (lastIndex == -1) {
            return string;
        }

        var beginString = string.substring(0, lastIndex);
        var endString = string.substring(lastIndex + find.length());

        return beginString + replace + endString;
    }

    def static String escape(String s) {
        return s.replace("\\", "\\\\").replace("\t", "\\t").replace("\b", "\\b").replace("\n", "\\n").replace("\r",
            "\\r").replace("\f", "\\f").replace("\'", "\\'").replace("\"", "\\\"");
    }
}
