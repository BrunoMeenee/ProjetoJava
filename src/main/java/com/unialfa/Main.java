package com.unialfa;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           var tela = new CadastroPessoa();
           tela.setVisible(true);
        });
    }
}