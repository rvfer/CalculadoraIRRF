package br.etc.calculadoraIRRF.domain;

public class Contribuinte {
    private double salario;
    private int dependentes;

    public Contribuinte(double salario, int dependentes) {
        this.salario = salario;
        this.dependentes = dependentes;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }
}