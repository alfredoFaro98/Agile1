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

    public SaldoPerTitoloID getSaldoPerTitoloID() {
        return saldoPerTitoloID;
    }

    public void setSaldoPerTitoloID(SaldoPerTitoloID saldoPerTitoloID) {
        this.saldoPerTitoloID = saldoPerTitoloID;
    }

    public Titolo getTitolo() {
        return titolo;
    }

    public void setTitolo(Titolo titolo) {
        this.titolo = titolo;
    }

    public ContoTitoli getContoTitoli() {
        return contoTitoli;
    }

    public void setContoTitoli(ContoTitoli contoTitoli) {
        this.contoTitoli = contoTitoli;
    }

    public Long getQuantita() {
        return quantita;
    }

    public void setQuantita(Long quantita) {
        this.quantita = quantita;
    }
}
