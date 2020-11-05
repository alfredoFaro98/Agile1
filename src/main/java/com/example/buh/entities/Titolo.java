package com.example.buh.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Titolo")
public class Titolo {

    @Id
    @GeneratedValue
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



}
