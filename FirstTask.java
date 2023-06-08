import java.util.Scanner;

// Вычислить сумма чисел от 1 до n

public class FirstTask {
    FirstTask() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = in.nextInt();
        in.close();
        System.out.println(sum(n));
    }

    public int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; ++i) {
            sum += i;
        }
        return sum;
    }
}
