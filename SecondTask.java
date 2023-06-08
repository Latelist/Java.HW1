import java.util.Scanner;

// Вывести все простые числа от 1 до 1000

public class SecondTask {
    SecondTask() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = in.nextInt();
        in.close();
        simples(n);
    }

    public void simples(int n) {
        if (n > 2) {
            System.out.print(2 + " ");
            boolean simple = true;
            for (int i = 3; i <= n; ++i) {
                simple = true;
                for (int j = 2; j < i; ++j) {
                    if (i % j == 0) {
                        // System.out.println(i + " / " + j + " = " + i/j);
                        simple = false;
                        break;
                    }
                }
                if (simple == true) {
                    System.out.print(i + " ");
                }
            }
        }
        
    }
}
