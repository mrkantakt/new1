import java.util.Scanner;

public class Calkulyator {
    public static void main(String[] args){

        System.out.println("Калькулятор");

        Scanner userInput = new Scanner(System.in);

        System.out.print("Ведите операцию: [ * / - + ] ");
        String operation = userInput.nextLine();

        System.out.print("Ведите первое число ");
        double a = userInput.nextDouble();

        System.out.print ("Введите второе число ");
        double b = userInput.nextDouble();
        userInput.close();

        switch(operation){
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "+":
                System.out.println(a+b);
                break;
            default:
                System.err.println("Введена не допустимая операция");
                break;
        }

    }
}
