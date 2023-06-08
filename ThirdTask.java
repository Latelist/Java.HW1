import java.util.Scanner;

public class ThirdTask {
    ThirdTask() {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter first digit: ");
        double a = in.nextDouble();
        System.out.println();
        
        System.out.print("Enter operation: ");
        String op = in.next();
        System.out.println();
        
        System.out.print("Enter second digit: ");
        double b = in.nextDouble();
        System.out.println();
        in.close();
        
        System.out.println(a + " " + op + " " + b + " = " + calculator(a, op, b));
    }

    public double calculator(double a, String op, double b) {
        double res = 0;
        
        if (op.equals("+")) {
            res = a + b;
        } else if (op.equals("-")) {
            res = a - b;
        } else if (op.equals("*")) {
            res = a * b;
        } else if (op.equals("/")) {
            res = a / b;
        }
        return res;
    }
}
