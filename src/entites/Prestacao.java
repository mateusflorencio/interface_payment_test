package entites;

import java.util.Date;

public class Prestacao {

    private Date dataPrestacao;
    private Double valor;

    public Prestacao(){

    }

    public Prestacao(Date dataPrestacao, Double valor) {
        this.dataPrestacao = dataPrestacao;
        this.valor = valor;
    }

    public Date getDataPrestacao() {
        return dataPrestacao;
    }

    public void setDataPrestacao(Date dataPrestacao) {
        this.dataPrestacao = dataPrestacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
