import java.util.Scanner;

public class SinhVienInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin từ bàn phím
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        String ngaySinh = scanner.nextLine();

        System.out.print("Nhập điểm tổng kết: ");
        String diemTongKetStr = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        String tuoiStr = scanner.nextLine();

        // Chuyển đổi kiểu dữ liệu
        float diemTongKet = Float.parseFloat(diemTongKetStr);
        int tuoi = Integer.parseInt(tuoiStr);

        // Hiển thị kết quả
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKet + " (Float)");
        System.out.println("Tuổi: " + tuoi + " (Int)");
        System.out.println("-----HẾT-----");

        scanner.close();
    }
}
