package storage;

import controller.ProductManager;
import model.Product;

import java.io.*;
import java.util.List;

public class ReadWriteFileCSV {
    static List<Product> listProduct = ProductManager.listProduct;

    public static List<Product> readFileProductList() {
        try {
            File file = new File("data/products.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                String[] strings = value.split(",");
                Product product = new Product(strings[0], strings[1], Integer.parseInt(strings[2]), Integer.parseInt(strings[3]), strings[4]);
                listProduct.add(product);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("");
        }
        return listProduct;
    }

    public static void writeFileProductList () {
        try {
            java.io.File file = new File("data/products.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Product product : listProduct) {
                bufferedWriter.write(product.getId() + "," + product.getName() + "," + product.getPrice() + "," + product.getAmount() + "," + product.getInformation() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("");
        }
    }
}
