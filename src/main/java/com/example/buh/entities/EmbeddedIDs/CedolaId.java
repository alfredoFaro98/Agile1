package com.example.buh.entities.EmbeddedIDs;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class CedolaId implements Serializable {

    @Column(name = "ProgressivoCedola")
    private Long progressivoCedola;

    @Column(name = "CodiceISIN")
    private Long codiceISIN;

    public Long getProgressivoCedola() {
        return progressivoCedola;
    }

    public void setProgressivoCedola(Long progressivoCedola) {
        this.progressivoCedola = progressivoCedola;
    }

    public Long getCodiceISIN() {
        return codiceISIN;
    }

    public void setCodiceISIN(Long codiceISIN) {
        this.codiceISIN = codiceISIN;
    }
}
