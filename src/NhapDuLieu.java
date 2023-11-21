import java.util.Scanner;

public class NhapDuLieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào họ và tên :");
        String hoVaTen = scanner.nextLine();

        System.out.println("Nhập mã SV :");
        long maSV = scanner.nextLong();

        System.out.println("Nhập điểm thi :");
        float diemThi = scanner.nextFloat();

        System.out.println("------------------------");
        System.out.println("Họ và tên: " + hoVaTen);
        System.out.println("Mã SV: " + maSV);
        System.out.println("Điểm thi: " + diemThi);
    }
}
