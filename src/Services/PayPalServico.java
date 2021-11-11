package Services;

public class PayPalServico implements ServicoDePagamentoOnline {
    private static final double taxaMensal = 0.02;
    private static final double jurosMensal = 0.01;

    public double pagamentoMensal(double valorDaParcela) {
        return valorDaParcela * taxaMensal;
    }

    public double jurosMesal(double valorDasParcelas, int mes) {
        return valorDasParcelas * jurosMensal * mes;
    }
}
