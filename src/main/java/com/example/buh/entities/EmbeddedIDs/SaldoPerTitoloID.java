package com.example.buh.entities.EmbeddedIDs;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class SaldoPerTitoloID implements Serializable {

    @Column(name = "codiceISIN")
    private Long codiceISIN;

    @Column(name = "numeroConto")
    private Long numeroConto;

    public Long getCodiceISIN() {
        return codiceISIN;
    }

    public void setCodiceISIN(Long codiceISIN) {
        this.codiceISIN = codiceISIN;
    }

    public Long getNumeroConto() {
        return numeroConto;
    }

    public void setNumeroConto(Long numeroConto) {
        this.numeroConto = numeroConto;
    }
}
