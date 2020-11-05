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

}
