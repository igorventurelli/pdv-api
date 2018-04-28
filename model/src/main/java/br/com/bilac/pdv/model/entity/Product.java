package br.com.bilac.pdv.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "produtos")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Integer id;

    @Column(name = "cod_barras")
    private String barcode;

    @Column(name = "descricao")
    private String description;

    @Column(name = "unidade")
    private String unity;

    @Column(name = "categoria")
    private String category;

    @Column(name = "preco")
    private Double price;

    @Column(name = "img")
    private String imageSource;
}
