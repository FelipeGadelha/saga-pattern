package br.com.felipe.gadelha.sale.api.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/sales")
public class SaleController {

    @GetMapping
    public String findAll() {
        return "Hello World";
    }
}
