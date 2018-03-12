/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author vinicius
 */
public class Trabalho_3 extends JFrame implements ActionListener{

    JLabel LNum1,LNum2,LResultado, LEmpty1, LEmpty2;
    JButton BSoma, BSubtrai, BMultiplica, BDivide, BLimpa, BQuad, BPot, BSqrt;
    JTextField TNum1,TNum2,TResultado;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame GUI = new Trabalho_3();
        GUI.setVisible(true);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public Trabalho_3(){
        setTitle("Segundo Exercício");
        setSize(350,150);
        setLocation(200,200);
        getContentPane().setBackground(new Color(220,220,220));
        setLayout(new GridLayout(4,4));
        
        LNum1 = new JLabel("1°Núm.");
        LNum1.setForeground(Color.blue);
        LNum1.setFont(new Font("",Font.BOLD,16));
        
        LNum2 = new JLabel("2°Núm.");
        LNum2.setForeground(Color.blue);
        LNum2.setFont(new Font("",Font.BOLD,16));
        
        LResultado = new JLabel("Resultado");
        LResultado.setFont(new Font("",Font.BOLD,16));
        LResultado.setForeground(Color.red);
        
        //Gambiarra
        LEmpty1 = new JLabel("");
        LEmpty2 = new JLabel("");
        
        BSoma = new JButton ("+");
        BSoma.addActionListener(this);
        
        BSubtrai = new JButton ("-");
        BSubtrai.addActionListener(this);
        
        BMultiplica = new JButton ("x");
        BMultiplica.addActionListener(this);
        
        BDivide = new JButton ("/");
        BDivide.addActionListener(this);
        
        BQuad = new JButton("Quadrado");
        BQuad.addActionListener(this);
        
        BPot = new JButton("Potência");
        BPot.addActionListener(this);
        
        BSqrt = new JButton("Raiz");
        BSqrt.addActionListener(this);
        
        BLimpa = new JButton ("Limpar");
        BLimpa.addActionListener(this);
        
        BLimpa.setBackground(Color.red);
        BLimpa.setForeground(Color.white);
        
        TNum1 = new JTextField();
        TNum2 = new JTextField();
        
        TResultado = new JTextField();
        TResultado.setEditable(false);
        
        add(LNum1);
        add(TNum1);
        add(BSoma);
        add(BSubtrai);
        add(LNum2);
        add(TNum2);
        add(BMultiplica);
        add(BDivide);
        add(LResultado);
        add(TResultado);
        add(BQuad);
        add(BPot);
        //Gambiarra
        add(LEmpty1);
        add(LEmpty2);
        add(BSqrt);
        add(BLimpa);
    }
    
    public void actionPerformed(ActionEvent evento){
        if (evento.getSource()==BLimpa){
            TNum1.setText("");
            TNum2.setText("");
            TResultado.setText("");
            return;
        }
        float num1=0,num2=0,resultado=0;
    
        try{
            num1 = Float.parseFloat(TNum1.getText());
        } catch (NumberFormatException erro){
            TResultado.setText("Erro");
            return;
        }

        if (evento.getSource()==BQuad){
            resultado = (float)Math.pow(num1,2);
            TResultado.setText(String.valueOf(resultado));
            return;
        }
        
        if (evento.getSource()==BSqrt){
            resultado = (float)Math.sqrt(num1);
            TResultado.setText(String.valueOf(resultado));
            return;
        }
        
        try{
            num2 = Float.parseFloat(TNum2.getText());
        } catch (NumberFormatException erro){
            TResultado.setText("Erro");
            return;
        }
        
        if (evento.getSource()==BSoma)
            resultado = num1 + num2;
        if (evento.getSource()==BSubtrai)   
            resultado = num1 - num2;
        if (evento.getSource()==BMultiplica)
            resultado = num1 * num2;
        if (evento.getSource()==BDivide)
            resultado = num1 / num2;
        if (evento.getSource()==BPot)
            resultado = (float)Math.pow(num1,num2);
        
        TResultado.setText(String.valueOf(resultado));
    }   
}
