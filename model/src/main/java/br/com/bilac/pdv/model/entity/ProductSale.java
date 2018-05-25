package br.com.bilac.pdv.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "venda_produto")
public class ProductSale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venda_produto")
    private Long id;

    @Column(name = "id_venda")
    private Long sellId;

    @Column(name = "cod_produto")
    private String productId;

    @Column(name = "qtd_produto")
    private Integer productQuantity;

    @Column(name = "forma_pagamento")
    private String paymentMethod;
}
