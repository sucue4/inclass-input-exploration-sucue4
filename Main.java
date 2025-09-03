import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 

    System.out.println("Enter your full name: ");
    String name = input.nextLine();

    System.out.print("Enter your age: ");
    int age = input.nextInt();
    input.nextLine(); // NOTE take in the extra new line value

    System.out.print("Enter your nickname: ");
    String nickname = input.next();
    input.nextLine(); 

    System.out.print("Enter your height in meters: ");
    float height = input.nextFloat();
    input.nextLine(); 

    System.out.print("Enter your GPA: ");
    double gpa = input.nextDouble();
    input.nextLine(); 

    System.out.print("Enter your phone number: ");
    long phone = input.nextLong();
    input.nextLine(); 

    System.out.print("Enter your grade level: ");
    byte grade = input.nextByte();
    input.nextLine(); 

    System.out.print("Enter your number of siblings: ");
    short siblings = input.nextShort();
    input.nextLine(); 

    System.out.print("Are you a student? (true/false): ");
    boolean student = input.nextBoolean();
    input.nextLine(); 

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Nickname: " + nickname);
    System.out.println("Height: " + height);
    System.out.println("GPA: " + gpa);
    System.out.println("Phone Number: " + phone);
    System.out.println("Grade Level: " + grade);
    System.out.println("Number of Siblings: " + siblings);
    System.out.println("Are you a student: " + student);

    input.close();
  }
}