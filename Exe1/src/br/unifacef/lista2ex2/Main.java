package br.unifacef.lista2ex2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Aluno Aluno1 = new Aluno
                (Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo de aluno")),
                JOptionPane.showInputDialog("Informe o nome do aluno"),
                Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do aluno")),
                Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota do aluno")),
                Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota do aluno")));

        Aluno1.DadosAluno();
        Aluno1.NotaFinal();
    }
}
