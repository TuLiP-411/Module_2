package views;

import controller.ProductManager;
import storage.ReadWriteFileCSV;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            ProductManager productManager = new ProductManager();
            int choice;
            do {
                System.out.println("\n---- CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM ----");
                System.out.println("Chọn chức năng theo số (để tiếp tục)");
                System.out.println("1. Xem danh sách");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xóa");
                System.out.println("5. Sắp xếp");
                System.out.println("6. Tìm sản phẩm có giá đắt nhất");
                System.out.println("7. Đọc từ file");
                System.out.println("8. Ghi ra file");
                System.out.println("9. Thoát");
                System.out.println("Chọn chức năng: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        productManager.displayListProduct();
                        break;
                    case 2:
                        productManager.addProduct(scanner);
                        break;
                    case 3:
                        productManager.editProduct(scanner);
                        break;
                    case 4:
                        productManager.productRemove(scanner);
                        break;
                    case 5:
                        int choice1;
                        System.out.println("1. Sắp xếp tăng dần");
                        System.out.println("2. Sắp xếp giảm dần");
                        choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                System.out.println(productManager.sortPriceAscend());
                                break;
                            case 2:
                                System.out.println(productManager.sortPriceDescend());
                                break;
                        }
                        break;
                    case 6:
                        System.out.println(productManager.findMaxPrice());
                        break;
                    case 7:
                        System.out.println("Lựa chọn này sẽ reset list sản phẩm và thêm mới. Bạn có muốn tiếp tục?");
                        System.out.println("Y: Đồng ý");
                        System.out.println("Nhấn ký tự bất kỳ để thoát");
                        String confirm = scanner.nextLine();
                        if (confirm.equalsIgnoreCase("Y")) {
                            ReadWriteFileCSV.readFileProductList();
                        }
                        break;
                    case 8:
                        System.out.println("Lựa chọn này sẽ xóa hết thông tin trong file và ghi lại từ đầu. Bạn có muốn tiếp tục?");
                        System.out.println("Y: Đồng ý");
                        System.out.println("Nhấn ký tự bất kỳ để thoát");
                        confirm = scanner.nextLine();
                        if (confirm.equalsIgnoreCase("Y")) {
                            ReadWriteFileCSV.writeFileProductList();
                        }
                        break;
                    case 9:
                        System.exit(0);
                        break;
                }
            } while (choice != 0);

        } catch (Exception e) {
            System.out.println("Kết thúc do gặp lỗi: " + e);
        }
    }
}
