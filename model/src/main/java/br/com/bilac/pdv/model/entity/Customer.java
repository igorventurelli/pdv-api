package br.com.bilac.pdv.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "clientes")
public class Customer {

    @Id
    @Column(name = "id_cliente")
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "forma_pagamento")
    private String paymentMethod;

    @OneToOne(mappedBy = "customer")
    private Sale sale;
}
