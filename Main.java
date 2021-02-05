//makes sure that scanner is working
import java.util.Scanner;
//public main class (no private needed in this project)
class Main {
  public static void main(String[] args){
    //scanner statement
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your legal name?");
    //scans string
    String name = scan.next();

    System.out.println("Hello " + name + " this an automated bot that will check your financial situation.");
    System.out.println("What is your current salary?");
    //start of int statement
    int currentSalary = scan.nextInt();
   System.out.println("How much money did you earn or spend last year?");
    
    //method calls
    int salaryEarnedSpent = scan.nextInt();

    int salary = getSalary(salaryEarnedSpent , currentSalary);

    System.out.println("Your income is $" + salary);
    System.out.println("Welcome once again " + (name));
    //scanner for stock
    System.out.println("What is your stocks price?");
    int stock = scan.nextInt();
    //gives the amount left over
    stock(salary, stock);
    System.out.println("You will have $" + stock(salary, stock) + " leftover.");
    }
    
    //retruns method calls
    static int getSalary(int salaryEarnedSpent , int currentSalary)
    //returns salary after money earned or spent
   {
    int salary = currentSalary + salaryEarnedSpent;
    return salary;
   }

//start of new class
static int stock(int salary , int newStock){
  //if and else statement start here
if(salary>=newStock)

  {
    System.out.println("You can afford the stock because you have $" + salary + " and the stocks cost $" + newStock);
    //subtracts salary from the amount the stock the person wants is 
return salary - newStock;
  }else
   {
    System.out.println("You can't afford the stocks you want becasue you have  $" + salary + " and the stocks cost $" + newStock);

   }
   //returns salary
  return salary; 
}
  
  
 }

