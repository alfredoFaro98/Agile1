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

    public MovimentoID getMovimentoID() {
        return movimentoID;
    }

    public void setMovimentoID(MovimentoID movimentoID) {
        this.movimentoID = movimentoID;
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

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(TipoMovimento tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public Long getQuantita() {
        return quantita;
    }

    public void setQuantita(Long quantita) {
        this.quantita = quantita;
    }
}
