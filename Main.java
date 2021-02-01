import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your legal name?");

    String name = scan.next();

    System.out.println("Hello " + name + " this automated bot will check your financial situation.");
    System.out.println("What is your current salary?");

    int currentSalary = scan.nextInt();
   System.out.println("How much money did you earn/spend last year?");
    

    int salaryEarnedSpent = scan.nextInt();

    int salary = getSalary(salaryEarnedSpent , currentSalary);

    System.out.println("Welcome once again " + (name));
    System.out.println("Your income is " + salary);
    }

    
    

 



   
 
 
}
