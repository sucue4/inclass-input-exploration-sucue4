import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 

    System.out.println("Enter your name: ");
    String name = input.nextLine();

    System.out.print("Enter your age: ");
    int age = input.nextInt();
    input.nextLine(); // NOTE take in the extra new line value

    // TODO Your code goes here. Try using all of the scanner methods and print out the variables at the end!




    System.out.println("Name: " + name);
    System.out.println("Age: " + age);

    input.close();
  }
}