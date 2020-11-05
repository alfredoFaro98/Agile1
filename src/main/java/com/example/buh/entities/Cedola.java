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



}
