import java.util.Scanner;

public class GettingGreater {
  public static void main(String[] args) {
    
    char first, second;

    var input = new Scanner(System.in);

    System.out.println("Getting the Greater Value");
    System.out.print("Enter the first character: ");
    first = input.next().charAt(0);
    System.out.print("Enter the second character: ");
    second = input.next().charAt(0);

    System.out.println("-------------------------------------------"); 
    System.out.print("The character with greater value is: ");
    System.out.println((char)Math.max(first,  second));
    System.out.println("-------------------------------------------"); 

    System.out.println("Showing the ASCII Codes");
    System.out.println(first + ": " + (int)first);
    System.out.print(second + ": " + (int)second);

    input.close();
  }
}
