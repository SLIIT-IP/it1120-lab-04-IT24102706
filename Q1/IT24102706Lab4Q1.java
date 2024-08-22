import java.util.Scanner;
  public class IT24102706Lab4Q1
   {
    public static void main(String[] args)
     {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    if (num > 0)
     {
     System.out.print("Enter the number is positive ");
     }
     else if (num < 0)
     {
     System.out.print("Enter the number is negative");
     }
     else 
     {
     System.out.print("Enter the number is zero");
     }
     }
    }