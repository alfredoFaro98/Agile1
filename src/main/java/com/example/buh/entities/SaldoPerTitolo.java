package com.example.buh.entities;

import com.example.buh.entities.EmbeddedIDs.SaldoPerTitoloID;

import javax.persistence.*;

@Entity
@Table(name = "SaldoPerTitolo")
public class SaldoPerTitolo {

    @EmbeddedId
    private SaldoPerTitoloID saldoPerTitoloID;

    @MapsId("codiceISIN")
    @ManyToOne
    @JoinColumn(name = "codiceISIN",referencedColumnName = "codiceISIN")
    private Titolo titolo;

    @MapsId("numeroConto")
    @ManyToOne
    @JoinColumn(name = "numeroConto",referencedColumnName = "numeroConto")
    private ContoTitoli contoTitoli;

    @Column(name = "Quantita")
    private Long quantita;
}
