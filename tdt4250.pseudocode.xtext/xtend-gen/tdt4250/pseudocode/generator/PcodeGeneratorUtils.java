package tdt4250.pseudocode.generator;

@SuppressWarnings("all")
public class PcodeGeneratorUtils {
  public static String replaceLast(final String find, final String replace, final String string) {
    int lastIndex = string.lastIndexOf(find);
    if ((lastIndex == (-1))) {
      return string;
    }
    String beginString = string.substring(0, lastIndex);
    int _length = find.length();
    int _plus = (lastIndex + _length);
    String endString = string.substring(_plus);
    return ((beginString + replace) + endString);
  }
  
  public static String escape(final String s) {
    return s.replace("\\", "\\\\").replace("\t", "\\t").replace("\b", "\\b").replace("\n", "\\n").replace("\r", 
      "\\r").replace("\f", "\\f").replace("\'", "\\\'").replace("\"", "\\\"");
  }
}
