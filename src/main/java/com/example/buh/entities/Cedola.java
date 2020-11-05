package com.example.buh.entities;

import com.example.buh.entities.EmbeddedIDs.CedolaId;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Cedola")
public class Cedola {

    @EmbeddedId
    private CedolaId cedolaId;

    @MapsId("codiceISIN")
    @ManyToOne
    @JoinColumn(name = "codiceISIN",referencedColumnName = "codiceISIN")
    private Titolo titolo;

    @Column(name = "Scadenza")
    protected LocalDate scadenza;

    @Column(name = "Valore")
    protected Long valore;

    public CedolaId getCedolaId() {
        return cedolaId;
    }

    public void setCedolaId(CedolaId cedolaId) {
        this.cedolaId = cedolaId;
    }

    public Titolo getTitolo() {
        return titolo;
    }

    public void setTitolo(Titolo titolo) {
        this.titolo = titolo;
    }

    public LocalDate getScadenza() {
        return scadenza;
    }

    public void setScadenza(LocalDate scadenza) {
        this.scadenza = scadenza;
    }

    public Long getValore() {
        return valore;
    }

    public void setValore(Long valore) {
        this.valore = valore;
    }



}
