package com.example.homework_33.variables.repository;
import com.example.homework_33.variables.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class CustomOrder {
    private final CustomOrderRepository customOrderRepository;
    public Optional<Order> findOrderById(Integer OrderId) {
        return this.customOrderRepository.findOrderById(OrderId);
    }
    public List<Order> findAllOrders() {
        return this.customOrderRepository.getAllOrders();
    }
    public boolean addOrder() {
        return this.customOrderRepository.addOrder();
    }

}
