import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char inpOperator;
        char calculate;
        Double number1,number2,result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an operator: +, -, *, or /");
        inpOperator = scanner.next().charAt(0);
        System.out.println("Enter first number");
        number1 = scanner.nextDouble();

        System.out.println("Enter second number");
        number2 = scanner.nextDouble();

        switch (inpOperator){

            case '+':
                result = number1 + number2; if (scanner.hasNext("=")) {
                System.out.println(number1 + " + " + number2 + " = " + result);
            }
                break;

            case '-':
                result = number1 - number2; if (scanner.hasNext("=")) {
                System.out.println(number1 + " - " + number2 + " = " + result);
            }
                break;

            case '*':
                result = number1 * number2; if (scanner.hasNext("=")) {
                System.out.println(number1 + " * " + number2 + " = " + result);
            }
                break;

            case '/':
                result = number1 / number2;
                if (scanner.hasNext("=")) {
                    System.out.println(number1 + " / " + number2 + " = " + result);
                }
                break;


            default:
                System.out.println("something went wrong");
                break;
        }



        }










}
