import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char inpOperator;

        Double number1,number2,result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие: +, -, *, или /");
        inpOperator = scanner.next().charAt(0);
        System.out.println("Введите первое число");
        number1 = scanner.nextDouble();

        System.out.println("Введите второе число");
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
                System.out.println("что-то пошло не так");
                break;
        }



        }










}
