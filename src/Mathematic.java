import java.util.Scanner;

public class Mathematic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        int b = scanner.nextInt();

        int tong = a + b;
        System.out.println("Phép cộng : ");
        System.out.println(a + " + " + b + " = " + tong);

        float chia = (float) a / b;
        System.out.println("Phép chia : ");
        System.out.println(a + " / " + b + " = " + chia);

        System.out.println("Min của a,b: " + Math.min(a, b));
        System.out.println("Max của a,b: " + Math.max(a, b));

    }
}
