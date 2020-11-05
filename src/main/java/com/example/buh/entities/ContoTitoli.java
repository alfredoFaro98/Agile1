package com.example.buh.entities;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ContoTitoli")
public class ContoTitoli {

    public enum TipoConto {
        TipoConto1,
        TipoConto2
    }

    @Id
    @Column(name = "numeroConto")
    private Long numeroConto;

    @Column(name = "tipoConto")
    private TipoConto tipoConto;

    @OneToMany(mappedBy = "contoTitoli")
    private List<Movimento> movimenti;

    @OneToMany(mappedBy = "contoTitoli")
    private List<SaldoPerTitolo> saldi;



}
