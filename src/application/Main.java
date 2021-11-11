package application;

import Services.ContratoDeServico;
import entites.Contrato;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Numero do Contrato");
        Integer numeroDoContrato=sc.nextInt();

        System.out.println("Data");
        Date dataInicialContrato=sdf.parse(sc.next());

        System.out.println("Valor do Contrato");
        Double valorContrato=sc.nextDouble();

        Contrato contrato=new Contrato(numeroDoContrato,dataInicialContrato,valorContrato);

        System.out.println("Será em quantas parcelas?");
        int mes=sc.nextInt();

    }
}
