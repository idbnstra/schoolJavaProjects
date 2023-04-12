package schoolJavaProjects.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the calculator");
        System.out.println("Calculator is on.");
        
        String choice1 = "a";

        while(!choice1.equalsIgnoreCase("N")) {

            double result = 0.0;
            String secNumStr = "";
            double secNumdouble = 0.0;
            char operator = '#';
            boolean error = true;
            String operation = "";

            System.out.println("result = 0.0");
            

            while (true){

                do{
                    try{

                        operation = sc.nextLine();
                        operator = operation.charAt(0);

                        if (operator == 'r' || operator == 'R') {
                            break;
                        } else if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                            throw new UnkownOperatorException();
                        }

                        error = false;
                    } catch (UnkownOperatorException e) {
                        error = true;
                        System.out.println(e.getMessage());
                    } //end of try-catch
                } while (error);

                secNumStr = operation.substring(1);
                if(secNumStr.isEmpty())
                    break;
                
                secNumdouble = Double.parseDouble(secNumStr);

                switch(operator) {
                    case '+':
                        result = result + secNumdouble;
                        break;
                    case '-':
                        result = result - secNumdouble;
                        break;
                    case '*':
                        result = result * secNumdouble;
                        break;
                    case '/':
                        result = result / secNumdouble;
                        break;
                    case '%':
                        result = result % secNumdouble;
                        break;
                    case '^':
                        result = Math.pow(result, secNumdouble);
                }//end of switch

                System.out.println("result " + operator + " " + secNumStr + " = " + result);
                System.out.println("updated result = " + result);

            } //end of while true
        
        System.out.println("final result = " + result);
        System.out.println("Do you want to continue using the calculator? (y/n)  ");
        choice1 = sc.nextLine();


        }//end of while Y/N
        sc.close();
    }//end of main
}//End of Calculator class