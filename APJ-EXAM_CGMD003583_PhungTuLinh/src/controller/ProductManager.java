package controller;

import model.Product;

import java.util.*;

public class ProductManager {
    public static List<Product> listProduct = new ArrayList<Product>();

    static {
        Product p1 = new Product("A001", "Xoai", 12000, 24.5, "Ngot");
        Product p2 = new Product("A002", "Tao", 18000, 23.5, "Gion");
        Product p3 = new Product("A003", "Cam", 16000.5, 21.5, "Cam");
        Product p4 = new Product("A004", "Dua", 10000, 23, "Chin ngot");
        Product p5 = new Product("A005", "Dau", 15000.3, 20.4, "Chua ngot thanh thom");
        Product p6 = new Product("A006", "Nho", 11000, 20, "Tuoi gion");
        listProduct.add(p1);
        listProduct.add(p2);
        listProduct.add(p3);
        listProduct.add(p4);
        listProduct.add(p5);
        listProduct.add(p6);
    }

    public static void addProduct(Scanner scanner) {
        try {
            System.out.println("Nhập mã sản phẩm thêm mới: ");
            String newID = scanner.nextLine();
            System.out.println("Nhập tên sản phẩm thêm mới: ");
            String newName = scanner.nextLine();
            System.out.println("Nhập giá sản phẩm thêm mới: ");
            double newPrice = scanner.nextDouble();
            System.out.println("Nhập số lượng sản phẩm thêm mới: ");
            double newAmount = scanner.nextDouble();
            System.out.println("Nhâp mô tả sản phẩm thêm mới: ");
            Scanner scanner1 = new Scanner(System.in);
            String newInfor = scanner1.nextLine();
            Product product = new Product(newID, newName, newPrice, newAmount, newInfor);
            listProduct.add(product);
            System.out.println("Product added!");
        } catch (Exception e) {
            System.out.println("Gặp lỗi: " + e);
        }
    }

    public void editProduct(Scanner scanner) {
        try {
            System.out.println("Nhập vào mã sản phẩm cần sửa");
            String searchID = scanner.nextLine();
            for (Product p : listProduct
            ) {
                if (p.getId().equals(searchID)) {
                    System.out.println("Nhập mã sản phẩm muốn sửa: ");
                    String newID = scanner.nextLine();
                    System.out.println("Nhập tên sản phẩm muốn sửa: ");
                    String newName = scanner.nextLine();
                    System.out.println("Nhập giá sản phẩm muốn sửa: ");
                    double newPrice = scanner.nextDouble();
                    System.out.println("Nhập số lượng sản phẩm muốn sửa: ");
                    double newAmount = scanner.nextDouble();
                    System.out.println("Nhâp mô tả sản phẩm cần sửa: ");
                    String newInfor = scanner.nextLine();
                    p.setId(newID);
                    p.setName(newName);
                    p.setPrice(newPrice);
                    p.setAmount(newAmount);
                    p.setInformation(newInfor);
                    System.out.println("Product edited!");

                } else {
                    System.out.println("Không tìm được sản phẩm");
                }
            }
        } catch (Exception e) {
            System.out.println("Gặp lỗi: " + e);
        }
    }

    public void productRemove(Scanner scanner) {
        try {
            System.out.println("Nhập vào mã sản phẩm muốn xóa: ");
            String searchID = scanner.nextLine();
            for (Product p : listProduct
            ) {
                if (p.getId().equals(searchID)) {
                    System.out.println("Bạn có chắc muốn xóa sản phẩm ?");
                    System.out.println("Y: Đồng ý xóa.");
                    System.out.println("Nhập ký tự bất kỳ để thoát");
                    String confirm = scanner.nextLine();
                    if (confirm.equals("Y")) {
                        listProduct.remove(p);
                        System.out.println("Product removed!");
                        break;
                    }

                } else {
                    System.out.println("Không tìm được sản phẩm");
                }
            }
        } catch (Exception e) {
            System.out.println("Gặp lỗi: " + e);
        }
    }

    public static void displayListProduct() {
        for (Product p : listProduct
        ) {
            System.out.println(p.toString());
        }
    }

    public static Product findMaxPrice() {
        Product result = null;
        List<Product> productSortedList = sortPriceDescend();
        result = productSortedList.get(0);
        return result;
    }

    public static List<Product> sortPriceAscend() {
        Collections.sort(listProduct);
        return listProduct;
    }


    public static List<Product> sortPriceDescend() {
        Comparator<Product> priceComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        };
        Collections.sort(listProduct, priceComparator);
        return listProduct;
    }
}
