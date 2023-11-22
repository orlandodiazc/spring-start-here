package com.example.ex5.service;

import com.example.ex5.exception.NotEnoughMoneyException;
import com.example.ex5.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
