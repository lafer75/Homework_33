package com.example.homework_33.internet;
import com.example.homework_33.variables.entity.Order;
import com.example.homework_33.variables.repository.CustomOrder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class OrderController {
    private final CustomOrder customOrder;

    @GetMapping("/orders")
    public List<Order> orders() {
        return customOrder.findAllOrders();
    }
    @GetMapping("/{id}")
    public Order getOrderByID(@PathVariable("id") Integer id){
        return customOrder
                .findOrderById(id)
                .orElseThrow(()->new IllegalArgumentException("Немає замовлення за = " + id));
    }

    @GetMapping("/create")
    public String create() {
        if (customOrder.addOrder()){
            return "Випадкове замовлення створено";
        } else {
            return "Не зміг додати замовлення";
        }
    }
}
