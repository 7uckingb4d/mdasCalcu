import java.util.Scanner;
/**
 *
 * @author wew */
 
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char operation;
       
        while(true){
            System.out.print("\n---MDAS CALCULATOR---");
            System.out.print("\nM = Multiplication");
            System.out.print("\nD = Division");
            System.out.print("\nA = Addition");
            System.out.print("\nS = Subtraction");
            System.out.print("\nE = Exit");
            System.out.print("\nOperation: ");
if (operation == 'E') {
                System.out.println("Calculator closed.");
                break;
            } if (operation != 'M' && 
                  operation != 'D' && 
                  operation != 'A' &&
                  operation != 'S' &&
                  operation != 'E') {
                
                System.out.println("Invalid operation choice.");
                continue;
        
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");

switch(operation){
        
            case 'M':

                System.out.println("\nResult: " + (num1 * num2));
                break;
            
            case 'D':
               
                if (num2 == 0){
                    System.out.print("No number can be divided by zero.");
                } else {
                    System.out.println("\nResult: " + (num1 / num2));
                }
                break;
            
            case 'A':
                
                System.out.println("\nResult: " + (num1 + num2));
                break;
            
            case 'S':
                
                System.out.println("\nResult: " + (num1 - num2));
                break;
                
            default:
            System.out.println("INVALID OPERATION. PROGRAM ENDED");
            
            }    
        }
        
    }
}

