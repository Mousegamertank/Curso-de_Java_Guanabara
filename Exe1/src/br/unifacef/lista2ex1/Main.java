package br.unifacef.lista2ex1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("876543-1", "1234-6", "Pedro" ,50.5f);

        cliente1.Dados_Conta();
        cliente1.RealizarDeposito(Float.parseFloat(JOptionPane.showInputDialog("Informe o Deposito: ")));
        cliente1.Dados_Conta();
        cliente1.RealizarSaque(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de saque: ")));
        cliente1.Dados_Conta();
    }
}
