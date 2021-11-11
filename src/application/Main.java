package application;

import Services.ContratoDeServico;
import Services.PayPalServico;
import entites.Contrato;
import entites.Prestacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);

        System.out.println("Numero do Contrato");
        int numeroDoContrato=sc.nextInt();

        System.out.println("Data");
        Date dataInicialContrato=sdf.parse(sc.next());

        System.out.println("Valor do Contrato");
        double valorContrato= sc.nextDouble();

        Contrato contrato=new Contrato(numeroDoContrato,dataInicialContrato,valorContrato);

        System.out.println("Será em quantas parcelas?");
        int mes=sc.nextInt();

        ContratoDeServico contratoDeServico = new ContratoDeServico(new PayPalServico());

        contratoDeServico.processoDeContrato(contrato, mes);

        System.out.println("Parcelamento");
        for (Prestacao e: contrato.getPrestacao()) {
            System.out.println(e);

        }

        sc.close();
    }
}
