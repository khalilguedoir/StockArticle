package com.example.ms_stock.service;

import com.example.ms_stock.model.Stock;
import com.example.ms_stock.repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StockService implements  IStockService{
    private final StockRepository stockRepository;

    @Override
    public Stock stockByID(String id) {
        Optional<Stock> byId = this.stockRepository.findById(id);
        return byId.get();
    }

    @Override
    public Stock add(Stock stock) {
        return this.stockRepository.save(stock);
    }
}
