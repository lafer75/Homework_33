package com.example.homework_33.variables.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    private Integer id;
    private String date;
    private Double cost;
    private List<Product> products;
}
