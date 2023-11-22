package com.example.ex7.service;

import com.example.ex7.exception.NotEnoughMoneyException;
import com.example.ex7.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
