package com.example.buh.entities.EmbeddedIDs;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;

@Embeddable
public class MovimentoID implements Serializable {

    @Column(name = "numeroConto")
    private Long numeroConto;

    @Column(name = "data")
    private LocalDate localDate;

    @Column(name = "progressivo")
    private Long progressivo;

    public Long getNumeroConto() {
        return numeroConto;
    }

    public void setNumeroConto(Long numeroConto) {
        this.numeroConto = numeroConto;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Long getProgressivo() {
        return progressivo;
    }

    public void setProgressivo(Long progressivo) {
        this.progressivo = progressivo;
    }
}
