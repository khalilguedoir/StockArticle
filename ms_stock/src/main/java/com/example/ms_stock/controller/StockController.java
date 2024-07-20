package com.example.ms_stock.controller;

import com.example.ms_stock.model.Stock;
import com.example.ms_stock.service.IStockService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/stocks")
public class StockController {
    private final IStockService stockService;

    @GetMapping("/{id}")
    Stock getByid(@PathVariable("id") String id){
        return this.stockService.stockByID(id);
    }
    @PostMapping
    Stock add(@RequestBody Stock article){
        return this.stockService.add(article);
    }
}
