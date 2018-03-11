package trabalho_2;

/**
 *
 * @author vinicius
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Trabalho_2 extends JFrame implements ActionListener{

    JLabel label1, label2, label3, label4, label5;
    ImageIcon img;
    
    JButton botao1, botao2, botao3;
    ImageIcon icone1 = new ImageIcon("botao1.gif");
    ImageIcon icone2 = new ImageIcon("botao2.gif");
    ImageIcon icone3 = new ImageIcon("botao3.gif");
    
    Trabalho_2(){
        
        setTitle("Primeiro Exercício");
        setSize(350,350);
        setLocation(200,200);
        setResizable(false);
        getContentPane().setBackground(new Color(230,230,230));
        
        label1 = new JLabel("Programação de Hoje", JLabel.CENTER);
        label1.setForeground(Color.blue);
        label1.setFont(new Font("Courier", Font.BOLD, 25));
        img = new ImageIcon("TV1.gif");
        label2 = new JLabel(img);
        label3 = new JLabel("14h40 - Início do Curso", label2.getIcon(), JLabel.LEFT);
        label3.setForeground(Color.green);
        label4 = new JLabel("16h45 - Início da Atividade", label2.getIcon(), JLabel.CENTER);
        label4.setForeground(new Color(255,215,0));
        label5 = new JLabel("18h15 - Término do Curso", label2.getIcon(), JLabel.RIGHT);
        label5.setForeground(Color.red);
        setLayout(new GridLayout(4,1));
        add(label1);
        add(label3);
        add(label4);
        add(label5);
        
        setTitle("GUI com Botões e Imagens");
        setSize(300,350);
        setLocation(400,200);
        
        getContentPane().setBackground(new Color(0,0,0));
        
        botao1 = new JButton("Avancar"); //avanca para uma proxima tela de interacao
        botao1.setHorizontalTextPosition(AbstractButton.RIGHT);
        botao1.setVerticalTextPosition(AbstractButton.CENTER);
        botao1.setEnabled(true);
        botao1.addActionListener(this);
        botao1.setToolTipText("Clique para avancar");
        botao1.setMnemonic(KeyEvent.VK_1);

        botao2 = new JButton("Voltar"); //volta para a tela de interacao anterior
        botao2.setHorizontalTextPosition(AbstractButton.CENTER);
        botao2.setVerticalTextPosition(AbstractButton.BOTTOM);
        botao2.setEnabled(true);
        botao2.addActionListener(this);
        botao2.setToolTipText("Clique para voltar");
        botao2.setMnemonic(KeyEvent.VK_2);

        botao3 = new JButton("Sair"); //sai do programa
        botao3.setEnabled(true);
        botao3.addActionListener(this);
        botao3.setToolTipText("Clique para sair");
        botao3.setMnemonic(KeyEvent.VK_3);

        setLayout(new FlowLayout());
        add(botao1);
        add(botao2);
        add(botao3);
        
    }
    
     public void actionPerformed(ActionEvent evento){
        if (evento.getSource()==botao1){
            System.out.println("Botão 1 clicado");
        }
        if (evento.getSource()==botao2){
            System.out.println("Botão 2 clicado");
        }
        if (evento.getSource()==botao3){
            System.out.println("Botão 3 clicado");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame GUI = new Trabalho_2();
        GUI.setVisible(true);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
