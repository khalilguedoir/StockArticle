package com.ms.ms_article.service;

import com.ms.ms_article.dto.StockDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@FeignClient(name = "stockClient", url = "http://localhost:8181/api")
public interface IStockClient {

    @GetMapping("/stocks/{id}")
    @CircuitBreaker(name = "emptyStock", fallbackMethod = "fallbackEmptyStock")
    StockDTO getStockById(@PathVariable("id") String id);
    default StockDTO fallbackEmptyStock(){
        return new StockDTO();
    }
}
