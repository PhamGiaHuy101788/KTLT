public class SinhVienInfo {
    public static void main(String[] args) {
        // Trường hợp 1
        String hoTen1 = "Nguyễn Văn An";
        String ngaySinh1 = "20/10/2006";
        String diemTongKet1 = "5.5";
        String tuoi1 = "18";

        // Chuyển đổi kiểu dữ liệu phù hợp
        float diemTongKetFloat1 = Float.parseFloat(diemTongKet1);
        int tuoiInt1 = Integer.parseInt(tuoi1);

        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen1 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh1 + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKetFloat1 + " (Float)");
        System.out.println("Tuổi: " + tuoiInt1 + " (Int)");
        System.out.println("-----HẾT-----");

        // Trường hợp 2
        String hoTen2 = "Nguyễn Văn An";
        String ngaySinh2 = "20/10/2006";
        Float diemTongKet2 = 5.5f;
        int tuoi2 = 18;

        // Chuyển đổi kiểu dữ liệu phù hợp
        String diemTongKetString2 = String.valueOf(diemTongKet2);
        String tuoiString2 = String.valueOf(tuoi2);

        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen2 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh2 + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKetString2 + " (String)");
        System.out.println("Tuổi: " + tuoiString2 + " (String)");
        System.out.println("-----HẾT-----");
    }
}
