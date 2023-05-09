package com.example.homework_33.variables.repository;

import com.example.homework_33.internet.setting.SettingWeb;
import com.example.homework_33.variables.entity.Order;
import com.example.homework_33.variables.entity.Product;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
@Repository
public class CustomOrderRepository {
    private final List<Order> orderList = new ArrayList<>();
    private static final AtomicInteger idCounter = new AtomicInteger(0);

    public Optional<Order> findOrderById(Integer orderId) {
        for (Order order : orderList) {
            if (!Objects.equals(order.getId(), orderId)) {
                continue;
            }
            return Optional.of(order);
        }
        return Optional.empty();
    }

    public List<Order> getAllOrders() {
        return orderList;
    }

    public boolean addOrder() {

        Integer generatedId = idCounter.incrementAndGet();
        List<Product> productList = SettingWeb.generateProductList();
        String orderCreateDate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
        Double totalProductsCost = (double) 0;
        for (Product product : productList) {
            totalProductsCost += product.getCost();
        }
        return orderList.add(new Order(generatedId, orderCreateDate, totalProductsCost, productList));
    }

}

