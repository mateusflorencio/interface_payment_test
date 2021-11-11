package entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Contrato {

    private Integer numeroContrato;
    private Date dataInicialContrato;
    private Double valorTotal;

    private List<Prestacao> prestacao = new ArrayList<>();

    public Contrato(Integer numeroContrato, Date dataInicialContrato, Double valorTotal) {
        this.numeroContrato = numeroContrato;
        this.dataInicialContrato = dataInicialContrato;
        this.valorTotal = valorTotal;
    }

    public Integer getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Date getDataInicialContrato() {
        return dataInicialContrato;
    }

    public void setDataInicialContrato(Date dataInicialContrato) {
        this.dataInicialContrato = dataInicialContrato;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Prestacao> getPrestacao() {
        return prestacao;
    }

    public void addPrestacao(Prestacao prestacao) {
       this.prestacao.add(prestacao);
    }

    public void removePrestacao(Prestacao prestacao) {
       this.prestacao.add(prestacao);
    }
}
