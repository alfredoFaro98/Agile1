package com.example.buh.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TTF")
public class TitoloTassoFisso extends Titolo {

}
