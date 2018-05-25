package br.com.bilac.pdv.dto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleDTO {

    private Long sellId;
    private String productId;
    private Long customerId;
    private Integer productQuantity;
    private Double total;
    private String paymentMethod;
}
