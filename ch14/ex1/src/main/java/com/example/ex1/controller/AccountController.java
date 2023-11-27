package com.example.ex1.controller;


import com.example.ex1.dto.TransferRequest;
import com.example.ex1.model.Account;
import com.example.ex1.service.TransferService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class AccountController {
    private final TransferService transferService;

    public AccountController(TransferService transferService) {
        this.transferService = transferService;
    }
    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequest req) {
        transferService.transferMoney(req.getSenderAccountId(), req.getReceiverAccountId(), req.getAmount());
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(@RequestParam(required = false) String name) {
        if (name == null) {
            return transferService.getAllAccounts();
        } else {
            return transferService.findAccountsByName(name);
        }
    }
}
