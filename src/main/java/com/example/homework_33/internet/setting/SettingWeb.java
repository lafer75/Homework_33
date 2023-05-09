package com.example.homework_33.internet.setting;

import com.example.homework_33.variables.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class SettingWeb {
    public static List<Product> generateProductList() {


        List<Product> ProductList = new ArrayList<>();

        List<Product> arrayProductList = List.of(
                new Product(1, "Chair", 34.99),
                new Product(2, "Table", 25.00),
                new Product(3, "Keyguard", 29.99),
                new Product(4, "Mouse", 16.68),
                new Product(5, "Microphone", 11.85));
        int ProductRandom = (int) (Math.random() * 5);
        for (int i = 0; i < ProductRandom; i++) {
            int randomId = (int) (Math.random() * arrayProductList.size());
            ProductList.add(arrayProductList.get(randomId));
        }
        return ProductList;
    }
}
