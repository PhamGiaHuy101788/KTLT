import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số nguyên
        System.out.print("Nhập số nguyên thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int num2 = scanner.nextInt();

        // Tìm giá trị lớn nhất
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Giá trị lớn nhất giữa hai số là: " + max);

        // Tìm giá trị nhỏ nhất
        int min = (num1 < num2) ? num1 : num2;
        System.out.println("Giá trị nhỏ nhất giữa hai số là: " + min);

        scanner.close();
    }
}
