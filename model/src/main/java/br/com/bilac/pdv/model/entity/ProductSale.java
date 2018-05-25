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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_venda")
    private Sale sale;

    @OneToOne
    @JoinColumn(name = "cod_produto")
    private Product product;

    @Column(name = "qtd_produto")
    private Integer productQuantity;

    @Column(name = "forma_pagamento")
    private String paymentMethod;
}
