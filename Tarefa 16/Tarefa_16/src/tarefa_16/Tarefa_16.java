package tarefa_16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tarefa_16 extends JFrame implements ItemListener{

    JLabel rotulo1, rotulo2, rotulo3;
    JTextField texto1, texto2;
    JRadioButton opcao1, opcao2, opcao3, opcao4, opcao5;
    ButtonGroup opcoesDeRadio1, opcoesDeRadio2;
    JPanel painel1, painel2;
    
    float numero = 0;
    float resposta = 0;
    
    static int operacao = 0;
    static float pctg = 0;
    
    Color cordeFundo = new Color(90, 160, 230);
    
    public static void main(String[] args) {
        JFrame GUI = new Tarefa_16();
        GUI.setVisible(true);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    Tarefa_16(){
        setTitle("GUI com botões de rádio");
        
        setSize(500,150);

        getContentPane().setBackground(cordeFundo);
        
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        rotulo1 = new JLabel("Digite o Valor:");
        
        rotulo1.setForeground(Color.red);
        
        rotulo2 = new JLabel("Cálculo com: ");
        
        rotulo2.setForeground(Color.red);
        
        rotulo3 = new JLabel("Valor Final: ");
        
        rotulo3.setForeground(Color.blue);
        
        texto1 = new JTextField(5);
        
        texto2 = new JTextField(5);
        
        texto2.setEditable(false);
        
        texto2.setBackground(cordeFundo);
        
        texto2.setForeground(Color.DARK_GRAY);
        
        texto2.setFont(new Font("", Font.BOLD,14));
        
        opcao1 = new JRadioButton("Desconto");
        
        opcao1.setMnemonic(KeyEvent.VK_1);
        
        opcao1.addItemListener(this);
        
        opcao1.setBackground(cordeFundo);
        
        opcao2 = new JRadioButton("Juros");
        
        opcao2.setMnemonic(KeyEvent.VK_2);
        
        opcao2.addItemListener(this);
        
        opcao2.setBackground(cordeFundo);
        
        opcao3 = new JRadioButton("10% do valor");
        
        opcao3.setMnemonic(KeyEvent.VK_3);
        
        opcao3.addItemListener(this);
        
        opcao3.setBackground(cordeFundo);
        
        opcao4 = new JRadioButton("20% do valor");
        
        opcao4.setMnemonic(KeyEvent.VK_4);
        
        opcao4.addItemListener(this);
        
        opcao4.setBackground(cordeFundo);
        
        opcao5 = new JRadioButton("30% do valor");
        
        opcao5.setMnemonic(KeyEvent.VK_5);
        
        opcao5.addItemListener(this);
        
        opcao5.setBackground(cordeFundo);
        
        opcoesDeRadio1 = new ButtonGroup();
        opcoesDeRadio2 = new ButtonGroup();
        
        opcoesDeRadio1.add(opcao1);
        opcoesDeRadio1.add(opcao2);
        
        opcoesDeRadio2.add(opcao3);
        opcoesDeRadio2.add(opcao4);
        opcoesDeRadio2.add(opcao5);
        
        painel1 = new JPanel();
        painel2 = new JPanel();
        
        painel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        painel1.setBackground(cordeFundo);
        
        painel2.setLayout(new GridLayout(2,3));
        
        painel2.setBackground(cordeFundo);
        
        painel1.add(rotulo1);
        painel1.add(texto1);
        painel1.add(rotulo2);
        painel1.add(opcao1);
        painel1.add(opcao2);
        
        painel2.add(opcao3);
        painel2.add(opcao4);
        painel2.add(opcao5);
        painel2.add(rotulo3);
        painel2.add(texto2);
        
        add(painel1);
        add(painel2);
    }
    
    
    public void itemStateChanged(ItemEvent evento){
        
        
        if (texto1.getText().length()==0){
            texto2.setText("Erro");
            return;
        }
        
        try{
            numero = Float.parseFloat(texto1.getText());
            
            if(evento.getSource() == opcao1)
                operacao = 1;
            if(evento.getSource() == opcao2)
                operacao = 2;
            
            if(evento.getSource() == opcao3)
                pctg = 0.1f;
            if(evento.getSource() == opcao4)
                pctg = 0.2f;
            if(evento.getSource() == opcao5)
                pctg = 0.3f;
            
            if(operacao == 1){
                resposta = numero + (numero * pctg);
            }else{
                resposta = numero - (numero * pctg);
            }
        }catch(NumberFormatException e){
            texto2.setText("Erro");
            return;
        }
        
        texto2.setText(String.valueOf(resposta));
    }
}
