package com.example.buh.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "Titolo")
public class Titolo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codiceISIN")
    protected Long codiceISIN;

    @Column(name = "Descrizione")
    private String descrizione;

    @Column(name = "Emittente")
    private String emittente;

    @Column(name = "Scandenza")
    private LocalDate scadenza;

    @Column(name = "ValoreNominale")
    private String valoreNominale;

    @Column(name = "Tasso")
    private String tasso;

    @OneToMany(mappedBy = "titolo")
    private List<Cedola> cedole;

    @OneToMany(mappedBy = "titolo")
    private List<Movimento> movimenti;

    @OneToMany(mappedBy = "titolo")
    private List<SaldoPerTitolo> saldi;

    /*metodi*/

    public Long getCodiceISIN() {
        return codiceISIN;
    }

    public void setCodiceISIN(Long codiceISIN) {
        this.codiceISIN = codiceISIN;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getEmittente() {
        return emittente;
    }

    public void setEmittente(String emittente) {
        this.emittente = emittente;
    }

    public LocalDate getScadenza() {
        return scadenza;
    }

    public void setScadenza(LocalDate scadenza) {
        this.scadenza = scadenza;
    }

    public String getValoreNominale() {
        return valoreNominale;
    }

    public void setValoreNominale(String valoreNominale) {
        this.valoreNominale = valoreNominale;
    }

    public String getTasso() {
        return tasso;
    }

    public void setTasso(String tasso) {
        this.tasso = tasso;
    }

    public List<Cedola> getCedole() {
        return cedole;
    }

    public void setCedole(List<Cedola> cedole) {
        this.cedole = cedole;
    }

    public List<Movimento> getMovimenti() {
        return movimenti;
    }

    public void setMovimenti(List<Movimento> movimenti) {
        this.movimenti = movimenti;
    }

    public List<SaldoPerTitolo> getSaldi() {
        return saldi;
    }

    public void setSaldi(List<SaldoPerTitolo> saldi) {
        this.saldi = saldi;
    }

    /*metodo to string di prova per vedere se funziona la select*/
    @Override
    public String toString() {
        return this.descrizione + " " + this.emittente;
    }
}
