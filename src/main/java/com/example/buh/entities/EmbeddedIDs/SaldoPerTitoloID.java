package com.example.buh.entities.EmbeddedIDs;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class SaldoPerTitoloID implements Serializable {

    @Column(name = "codiceISIN")
    private Long codiceISIN;

    @Column(name = "numeroConto")
    private Long numeroConto;

}
