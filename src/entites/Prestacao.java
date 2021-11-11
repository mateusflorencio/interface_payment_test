package entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataPrestacao;
    private Double valor;


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

    @Override
    public String toString() {
        return sdf.format(dataPrestacao) + " - " + String.format("%.2f", valor);
    }
}
