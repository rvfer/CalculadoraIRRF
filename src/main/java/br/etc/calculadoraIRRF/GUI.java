package br.etc.calculadoraIRRF;

import br.etc.calculadoraIRRF.domain.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JPanel janela;
    private JLabel salarioLabel;
    private JLabel dependentesLabel;
    private JTextField salarioField;
    private JTextField dependentesField;
    private JButton calcularButton;
    private JLabel impostoLabel;

    public GUI(String nome, Calculadora calculadora, Contribuinte contribuinte) {
        super(nome);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(janela);
        this.pack();
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contribuinte.setSalario(Double.parseDouble(salarioField.getText()));
                contribuinte.setDependentes(Integer.parseInt(dependentesField.getText()));
                impostoLabel.setText("Imposto de renda cobrado: R$" + String.format("%.2f", calculadora.calcularAliquota(contribuinte)));
            }
        });
    }
}
