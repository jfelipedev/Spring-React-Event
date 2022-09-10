package com.dsmeta.dsmeta.service;

import com.dsmeta.dsmeta.entity.Sale;
import com.dsmeta.dsmeta.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> findSales(){
        return saleRepository.findAll();
    }
}
