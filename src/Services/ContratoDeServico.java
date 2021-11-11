package Services;

import entites.Contrato;
import entites.Prestacao;

import java.util.Calendar;
import java.util.Date;

public class ContratoDeServico {

    private ServicoDePagamentoOnline sdp;

    public ContratoDeServico(ServicoDePagamentoOnline sdp) {
        this.sdp = sdp;
    }

    public void processoDeContrato(Contrato contrato, Integer mes){
        Double parcela= contrato.getValorTotal()/mes;

        for (int i=1;i<=mes;i++){

            Date addMes= addMes(contrato.getDataInicialContrato(),i);
            double jm=sdp.jurosMesal(parcela,i);
            double jp=jm+ sdp.pagamentoMensal(parcela);




        }
    }

    private Date addMes(Date dataInicialContrato, int i) {

        Calendar cal= Calendar.getInstance();
        cal.setTime(dataInicialContrato);
        cal.add(Calendar.MONTH,i);
        return cal.getTime();
    }
}
