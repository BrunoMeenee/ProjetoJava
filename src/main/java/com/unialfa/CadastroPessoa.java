package com.unialfa;

import javax.swing.*;
import java.awt.*;

public class CadastroPessoa extends JFrame {

    private JTextField campoNome ;

    private JButton botao ;

    public CadastroPessoa() {
        setTitle("Cadastreo de pesssoa");
        setSize(500, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints coinstraints = new GridBagConstraints();
        coinstraints.insets = new Insets(5,5,5,5);


        JLabel labelNome = new JLabel("nome");
        coinstraints.gridx = 0;
        coinstraints.gridy = 0;
        painel.add(labelNome,coinstraints);

        campoNome = new JTextField(20);
        coinstraints.gridx = 1 ;
        coinstraints.gridy = 0 ;
        painel.add(campoNome,coinstraints);

        botao = new JButton("Salvar");
        botao.addActionListener(e -> executarAcaoBotaoitarBotao());
        coinstraints.gridx = 0;
        coinstraints.gridy = 2;
        coinstraints.gridwidth = 2;

        painel.add(botao,coinstraints);

        add(painel);
        setLocationRelativeTo(null);

    }

    private void executarAcaoBotaoitarBotao() {
        JOptionPane.showMessageDialog(this,campoNome.getText() + "Salvo com sucesso");
    }
}
