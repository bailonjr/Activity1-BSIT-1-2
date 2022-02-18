import java.util.Scanner;
public class removingWhiteSpaceFromAString{
    public static void main(String []args) {
        System.out.print("Input the String: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().replaceAll(" ", "");
        System.out.println("Output: " + string);
    }
}