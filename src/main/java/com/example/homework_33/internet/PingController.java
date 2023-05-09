package com.example.homework_33.internet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class PingController {
    @GetMapping("/ping")
    public String ping() {
        return "OK";
    }
}
