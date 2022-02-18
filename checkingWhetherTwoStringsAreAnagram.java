import java.util.Arrays;
import java.util.Scanner;
public class checkingWhetherTwoStringsAreAnagram {
    public static boolean isAnagram(String str1, String str2)
    {
        if (str1.length() !=str2.length())
        return false;
        else
        {
            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            return Arrays.equals(str1Array, str2Array);
        }
    }
    public static void main(String []args) {
            Scanner sc = new Scanner(System. in);
            System.out.println("Please enter string 1: ");
            String str1 = sc.nextLine();
            System.out.println("Please enter string 2 : ");
            String str2 = sc.nextLine();
            str1 = str1.replaceAll(" ", "").toLowerCase();
            str2 = str2.replaceAll(" ", "").toLowerCase();

            if(isAnagram(str1, str2))
                System.out.println("Strings: " + str1 + " and "+ str2 + " are Anagrams.");
            else
            System.out.println("Strings: " + str1 + " and "+ str2 + " are not Anagrams.");
        }
    }