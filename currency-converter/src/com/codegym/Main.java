package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nhập vào số tiền USD cần đổi:");
        final double rate = 23000;
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.printf("%s USD = %s VND", usd, vnd);
    }
}
