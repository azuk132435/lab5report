import java.util.Arrays;
import java.util.Scanner;

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
    Scanner scanner = new Scanner(System.in);
    System.outprintln("Enter your first word:");
    String s = scanner.nextLine();
    System.out.println("Enter your second string:");
    String t = scanner.nextLine();
    boolean result = solution.isAnagram(s, t);
    System.out.println(result);
  }
}
