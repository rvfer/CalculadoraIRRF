package br.etc.calculadoraIRRF.domain;

public class Calculadora {
    private static final double descontoPorDependente = 189.59;

    public double calcularRendaLiquida(Contribuinte contribuinte) {
        return contribuinte.getSalario() - contribuinte.getDependentes() * descontoPorDependente;
    }

    public double calcularAliquota(Contribuinte contribuinte) {
        double renda = calcularRendaLiquida(contribuinte);
        if (renda < 1903.99)
            return 0;
        else if (renda < 2826.66)
            return 142.80;
        else if (renda < 3751.06)
            return 354.80;
        else if (renda < 4664.69)
            return 636.13;
        else
            return 869.36;
    }
}
