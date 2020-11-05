package com.example.buh.entities;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ContoTitoli")
public class ContoTitoli {

    public enum TipoConto {
        TipoConto1,
        TipoConto2
    }

    @Id
    @Column(name = "numeroConto")
    private Long numeroConto;

    @Column(name = "tipoConto")
    private TipoConto tipoConto;

    @OneToMany(mappedBy = "contoTitoli")
    private List<Movimento> movimenti;

    @OneToMany(mappedBy = "contoTitoli")
    private List<SaldoPerTitolo> saldi;

    public Long getNumeroConto() {
        return numeroConto;
    }

    public void setNumeroConto(Long numeroConto) {
        this.numeroConto = numeroConto;
    }

    public TipoConto getTipoConto() {
        return tipoConto;
    }

    public void setTipoConto(TipoConto tipoConto) {
        this.tipoConto = tipoConto;
    }

    public List<Movimento> getMovimenti() {
        return movimenti;
    }

    public void setMovimenti(List<Movimento> movimenti) {
        this.movimenti = movimenti;
    }

    public List<SaldoPerTitolo> getSaldi() {
        return saldi;
    }

    public void setSaldi(List<SaldoPerTitolo> saldi) {
        this.saldi = saldi;
    }
}
