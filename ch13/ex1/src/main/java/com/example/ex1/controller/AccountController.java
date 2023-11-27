package com.example.ex1.controller;

import com.example.ex1.dto.TransferRequest;
import com.example.ex1.model.Account;
import com.example.ex1.service.TransferService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public List<Account> getAllAccounts() {
        return transferService.getAllAccounts();
    }
}
