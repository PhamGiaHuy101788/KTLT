public class Main {
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng hai chiều
        int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7}
        };

        // Hiển thị các phần tử của mảng
        System.out.println("Các phần tử trong mảng arr2:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(); // Xuống dòng sau khi hiển thị hết 1 hàng
        }
    }
}
