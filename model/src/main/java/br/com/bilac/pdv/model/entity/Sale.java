package br.com.bilac.pdv.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "vendas")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venda")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_hora")
    private Date dateTime;

    @OneToOne
    @JoinColumn(name = "id_cliente")
    private Customer customer;

    @Column(name = "total_venda")
    private Double total;

    @Column(name = "desconto")
    private Double discount;

    @OneToOne(mappedBy = "sale", cascade = CascadeType.ALL)
    private ProductSale productSale;
}
