package br.com.bilac.pdv.business.business.impl;

import br.com.bilac.pdv.business.business.SaleBusiness;
import br.com.bilac.pdv.dto.dto.SaleDTO;
import br.com.bilac.pdv.model.entity.Customer;
import br.com.bilac.pdv.model.entity.Product;
import br.com.bilac.pdv.model.entity.ProductSale;
import br.com.bilac.pdv.model.entity.Sale;
import br.com.bilac.pdv.model.repository.ProductSaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SaleBusinessImpl implements SaleBusiness {

    @Autowired
    private ProductSaleRepository productSaleRepository;

    @Override
    public void sell(SaleDTO saleDTO) {
        Sale sale = new Sale();
        sale.setTotal(saleDTO.getTotal());
        Customer customer = new Customer();
        customer.setId(saleDTO.getCustomerId());
        sale.setCustomer(customer);
        sale.setDateTime(new Date());

        ProductSale productSale = new ProductSale();
        productSale.setSale(sale);
        Product product = new Product();
        product.setId(saleDTO.getProductId());
        productSale.setProduct(product);
        productSale.setProductQuantity(saleDTO.getProductQuantity());
        productSale.setPaymentMethod(saleDTO.getPaymentMethod());
        productSaleRepository.save(productSale);
    }
}
