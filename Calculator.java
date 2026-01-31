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
=======
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

