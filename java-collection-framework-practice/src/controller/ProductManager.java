package controller;

import model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    public static List<Product> listProduct = new ArrayList<Product>();

    public static void addProduct(Product p) {
        listProduct.add(p);
    }

    public static void editProduct(int id, String newName, double newPrice) {
        for (Product p : listProduct
        ) {
            if (p.getId() == id) {
                p.setName(newName);
                p.setPrice(newPrice);
            }
        }
    }

    public static void deleteProduct(int id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                listProduct.remove(i);
            }

        }
    }

    public static void displayListProduct() {
        for (Product p : listProduct
        ) {
            System.out.println(p.toString());
        }
    }

    public static Product searchByName(String name) {
        Product result = null;
        for (Product p : listProduct
        ) {
            if (p.getName().equals(name)) {
                result = p;
            }
        }
        return result;
    }

    public static void sortPriceAscend() {
        Collections.sort(listProduct);
    }


    public static void sortPriceDescend() {
        Comparator<Product> priceComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        };
        Collections.sort(listProduct, priceComparator);
    }
}

