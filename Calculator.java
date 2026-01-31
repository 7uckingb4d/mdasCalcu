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
            double num2 = sc.nextDouble();