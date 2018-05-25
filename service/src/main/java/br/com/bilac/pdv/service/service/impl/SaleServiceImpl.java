package br.com.bilac.pdv.service.service.impl;

import br.com.bilac.pdv.business.business.SaleBusiness;
import br.com.bilac.pdv.dto.dto.SaleDTO;
import br.com.bilac.pdv.service.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SaleServiceImpl implements SaleService {

    @Autowired
    private SaleBusiness business;

    @Override
    public void sell(SaleDTO saleDTO) {
        business.sell(saleDTO);
    }
}
