import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            System.out.println("""
                    Welcome to the Calculator!
                    Make sure Choose (+ - * /) following input
                    """);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Number 1: ");
            int num1 = scanner.nextInt();
            System.out.println("Number 2: ");
            int num2 = scanner.nextInt();
            System.out.println("OPT (+ - * /): ");
            String opt = scanner.next();
            int results = 0;
            switch (opt){
                case "+":
                    results = num1 += num2;
                    System.out.println(results);
                    break;
                case "-":
                    results = num1 -= num2;
                    System.out.println(results);
                    break;
                case "*":
                    results = num1 *= num2;
                    System.out.println(results);
                    break;
                case "/":
                    results = num1 /= num2;
                    System.out.println(results);
                    break;
                default:
                    System.out.println("Invalid operation!");
                    return;
            }

        }
    }
