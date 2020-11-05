package com.example.buh.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TTV")
public class TitotoTassoVariabile extends Titolo{

    @Column
    private Long spread;

    public Long getSpread()
    {
        return spread;
    }

    public void setSpread(Long spread) {
        this.spread = spread;
    }
}
