package br.etc.calculadoraIRRF;

import br.etc.calculadoraIRRF.domain.*;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Contribuinte contribuinte = new Contribuinte(0, 0);
        Calculadora calculadora = new Calculadora();
        JFrame menu = new GUI("Calculadora - IRRF", calculadora, contribuinte);
        menu.setVisible(true);
    }
}