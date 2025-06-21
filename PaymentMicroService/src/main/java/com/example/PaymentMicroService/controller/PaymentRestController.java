package com.example.PaymentMicroService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentRestController {

    @GetMapping("/validate")
    public ResponseEntity<String> validPayment(){
        return ResponseEntity.ok("Payment success");
    }

}
