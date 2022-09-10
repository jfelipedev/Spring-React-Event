package com.dsmeta.dsmeta.controller;

import com.dsmeta.dsmeta.entity.Sale;
import com.dsmeta.dsmeta.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value ="/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public Page<Sale> findSales(@RequestParam(value="minDate", defaultValue = "") String minDate, @RequestParam(value="maxDate", defaultValue = "")String maxDate, Pageable pageable){
        return saleService.findSales(minDate, maxDate, pageable);
    }
}
