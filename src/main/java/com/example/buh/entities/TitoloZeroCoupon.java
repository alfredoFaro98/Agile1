package com.example.buh.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("TZC")
public class TitoloZeroCoupon extends Titolo
{
}
