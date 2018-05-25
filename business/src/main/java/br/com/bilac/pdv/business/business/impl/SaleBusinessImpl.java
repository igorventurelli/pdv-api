package br.com.bilac.pdv.business.business.impl;

import br.com.bilac.pdv.business.business.SaleBusiness;
import br.com.bilac.pdv.dto.dto.SaleDTO;
import br.com.bilac.pdv.model.entity.ProductSale;
import br.com.bilac.pdv.model.entity.Sale;
import br.com.bilac.pdv.model.repository.ProductSaleRepository;
import br.com.bilac.pdv.model.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SaleBusinessImpl implements SaleBusiness {

    @Autowired
    private ProductSaleRepository productSaleRepository;

    @Autowired
    private SaleRepository saleRepository;

    @Override
    public void sell(SaleDTO saleDTO) {
        Sale sale = new Sale();
        sale.setTotal(saleDTO.getTotal());
        sale.setCustomerId(saleDTO.getCustomerId());
        sale.setDateTime(LocalDateTime.now());
        Sale managedSale = saleRepository.save(sale);

        ProductSale productSale = new ProductSale();
        productSale.setSellId(managedSale.getId());
        productSale.setProductId(saleDTO.getProductId());
        productSale.setProductQuantity(saleDTO.getProductQuantity());
        productSale.setPaymentMethod(saleDTO.getPaymentMethod());
        productSaleRepository.save(productSale);
    }
}
