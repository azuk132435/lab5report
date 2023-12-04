import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
  static class Check {
    public boolean isAnagram(String s, String t) {
      char[] sArray = s.toCharArray();
      char[] tArray = t.toCharArray();
      Arrays.sort(sArray);
      Arrays.sort(tArray);
      return Arrays.equals(sArray, tArray);
    }
  }
  public static void main (String[] args){
    Check check = new Check();
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    String t = scanner.nextLine();
    boolean result = solution.isAnagram(s, t);
    System.out.println(result);
  }
}
