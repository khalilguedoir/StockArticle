package com.example.ms_stock.service;

import com.example.ms_stock.model.Stock;

import java.util.List;

public interface IStockService {
    Stock stockByID(String id);
    Stock add(Stock stock);
}
