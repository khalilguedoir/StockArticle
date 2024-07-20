package com.example.ms_stock.repository;

import com.example.ms_stock.model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockRepository extends MongoRepository<Stock,String> {
}
