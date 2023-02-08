import java.util.Scanner;

public class Salary{
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int employeesNumber = s.nextInt();
      int workedHoursInAMMonth = s.nextInt();
      double amountReceivedPerHour = s.nextDouble();
      double salary = workedHoursInAMMonth * amountReceivedPerHour;
      
      System.out.println("NUMBER = " + employeesNumber);
      System.out.printf("SALARY = U$ %.2f\n", salary);
      
      
      
    }
  }
  

