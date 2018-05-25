package br.com.bilac.pdv.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "vendas")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venda")
    private Long id;

    @Column(name = "data_hora")
    private LocalDateTime dateTime;

    @Column(name = "id_cliente")
    private Long customerId;

    @Column(name = "total_venda")
    private Double total;

    @Column(name = "desconto")
    private Double discount;
}
