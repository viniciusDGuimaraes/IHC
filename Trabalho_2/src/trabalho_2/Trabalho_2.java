package trabalho_2;

/**
 *
 * @author vinicius
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Trabalho_2 extends JFrame{

    Trabalho_2(){
        JLabel label1, label2, label3, label4, label5;
        ImageIcon img;
        setTitle("Primeiro Exercício");
        setSize(350,350);
        setLocation(200,200);
        setResizable(false);
        getContentPane().setBackground(new Color(230,230,230));
        
        String titulo = getTitle();
        label1 = new JLabel("Programação de Hoje", JLabel.CENTER);
        label1.setForeground(Color.blue);
        img = new ImageIcon("img/TV1.gif");
        label2 = new JLabel(img);
        label3 = new JLabel("14h40 - Início do Curso", label2.getIcon(), JLabel.LEFT);
        label3.setForeground(Color.green);
        label4 = new JLabel("16h45 - Início da Atividade", label2.getIcon(), JLabel.CENTER);
        label4.setForeground(Color.orange);
        label5 = new JLabel("18h15 - Término do Curso", label2.getIcon(), JLabel.RIGHT);
        label5.setForeground(Color.red);
        setLayout(new GridLayout(4,1));
        add(label1);
        add(label3);
        add(label4);
        add(label5);
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
