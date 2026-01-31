import java.util.Scanner;
/**
 *
 * @author louie
 */
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