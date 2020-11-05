package com.example.buh.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name="TitoloZeroCoupon")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public class TitoloZeroCoupon extends Titolo{
}
