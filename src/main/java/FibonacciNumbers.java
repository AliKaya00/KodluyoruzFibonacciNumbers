import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int insert;
        System.out.print("PLease insert number: ");
        insert=scanner.nextInt();

        int a = 1, b = 1, before = 1, sum = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 1; i < insert; i++) {
            before = a;
            sum = before + b;
            a = sum;
            b = before;
            System.out.print(sum + " ");
        }
        }
    }
