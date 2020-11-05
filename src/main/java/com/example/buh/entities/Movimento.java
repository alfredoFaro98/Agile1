package com.example.buh.entities;

import com.example.buh.entities.EmbeddedIDs.MovimentoID;

import javax.persistence.*;

@Entity
@Table(name = "Movimento")
public class Movimento {

    public enum TipoMovimento {
        TipoMovimento1,
        TipoMovimento2
    }

    @EmbeddedId
    protected MovimentoID movimentoID;

    @ManyToOne
    @JoinColumn(name = "codiceISIN",referencedColumnName = "codiceISIN")
    private Titolo titolo;

    @MapsId("numeroConto")
    @ManyToOne
    @JoinColumn(name = "numeroConto",referencedColumnName = "numeroConto")
    private ContoTitoli contoTitoli;


    @Column(name = "TipoMovimento")
    protected TipoMovimento tipoMovimento;

    @Column(name = "Quantita")
    protected Long quantita;


}
