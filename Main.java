//makes sure that scanner is working
import java.util.Scanner;
//public main class (no private needed in this project)
class Main {
  public static void main(String[] args){
    //scanner statement
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your legal name?");

    String name = scan.next();

    System.out.println("Hello " + name + " this automated bot will check your financial situation.");
    System.out.println("What is your current salary?");
    //start of int statement
    int currentSalary = scan.nextInt();
   System.out.println("How much money did you earn/spend last year?");
    
    //method calls
    int salaryEarnedSpent = scan.nextInt();

    int salary = getSalary(salaryEarnedSpent , currentSalary);

    System.out.println("Welcome once again " + (name));
    System.out.println("Your income is " + salary);
    }

    //retruns method calls
    static int getSalary(int salaryEarnedSpent , int currentsalary)
   {
    int salary = currentSalary + salaryEarnedSpent;
    return salary;
   }


 



   
 
 
}
