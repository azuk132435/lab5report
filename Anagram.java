import java.util.Arrays;

public class Anagram {
  static class Check {
    public boolean isAnagram(String s, String t) {
      char[] sArray = s.toCharArray();
      char[] tArray = t.toCharArray();
      Arrays.sort(sArray);
      Arrays.srot(tArray);
      return Arrays.equals(sArray, tArray);
    }
  }
  public static void main (String[] args){
    Check check = new Check();
    String s = "joe";
    String t = "oje";
    boolean result = solution.isAnagram(s, t);
  }
}
