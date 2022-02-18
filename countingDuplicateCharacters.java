import java.util.Scanner;
public class countingDuplicateCharacters{
    public static void main(String []args) {
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().replaceAll(" ", "");
        
        int [] duplicate = new int[256];
        for(int i=0;i<string.length();i++)
        {
            duplicate[string.charAt(i)]=duplicate[string.charAt(i)]+1;
        }
        for(int i=0;i<256;i++)
        {
            char character=(char)i;
            if(duplicate[i]>0)
            {
                if(duplicate[i]==1)
                {
                    System.out.println("Character " + character + " has no duplicate.");
                }
                else
                {
                    System.out.println("Character " + character + " has "+ duplicate[i] + " duplicates.");
                }
            }
        }
    
    }
}