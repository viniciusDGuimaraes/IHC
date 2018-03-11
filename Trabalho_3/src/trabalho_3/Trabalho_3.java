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

    JLabel LNum1,LNum2,LResultado;
    JButton BSoma, BSubtrai, BMultiplica, BDivide, BLimpa;
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
        setTitle("GUI de Calculadora");
        setSize(350,150);
        setLocation(200,200);
        getContentPane().setBackground(new Color(220,220,220));
        setLayout(new GridLayout(3,4));
        
        LNum1 = new JLabel("1°Núm.");
        LNum1.setForeground(Color.blue);
        LNum1.setFont(new Font("",Font.BOLD,16));
        
        LNum2 = new JLabel("2°Núm.");
        LNum2.setForeground(Color.blue);
        LNum2.setFont(new Font("",Font.BOLD,16));
        
        LResultado = new JLabel("Resultado");
        LResultado.setFont(new Font("",Font.BOLD,16));
        LResultado.setForeground(Color.red);
        
        BSoma = new JButton ("+");
        BSoma.addActionListener(this);
        
        BSubtrai = new JButton ("-");
        BSubtrai.addActionListener(this);
        
        BMultiplica = new JButton ("x");
        BMultiplica.addActionListener(this);
        
        BDivide = new JButton ("/");
        BDivide.addActionListener(this);
        
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
        TResultado.setText(String.valueOf(resultado));
    }   
}
