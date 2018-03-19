/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_3;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import javax.swing.*;

/**
 *
 * @author vinicius
 */
public class Trabalho_3 extends JFrame implements ActionListener{

    JLabel LNum1,LNum2,LResultado, LEmpty1;
    JButton BSoma, BSubtrai, BMultiplica, BDivide, BLimpa, BQuad, BPot, BSqrt,
            BMoeda, BReal, BPctg, BAum, BDim;
    JTextField TNum1,TNum2,TResultado;
    double num1=0,num2=0;
    static double resultado = 0;
    static double resultadoAntigo;
    static int fractionDigits = 2;
    NumberFormat real=NumberFormat.getNumberInstance(), 
                 moeda=NumberFormat.getCurrencyInstance(), 
                 pctg=NumberFormat.getPercentInstance();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame GUI = new Trabalho_3();
        GUI.setVisible(true);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public Trabalho_3(){
        setTitle("Terceiro Exercício");
        setSize(450,250);
        setLocation(200,200);
        getContentPane().setBackground(new Color(220,220,220));
        setLayout(new GridLayout(5,4));
        
        LNum1 = new JLabel("1°Núm.");
        LNum1.setForeground(Color.blue);
        LNum1.setFont(new Font("",Font.BOLD,16));
        
        LNum2 = new JLabel("2°Núm.");
        LNum2.setForeground(Color.blue);
        LNum2.setFont(new Font("",Font.BOLD,16));
        
        LResultado = new JLabel("Resultado");
        LResultado.setFont(new Font("",Font.BOLD,16));
        LResultado.setForeground(Color.red);
        
        LEmpty1 = new JLabel("");
        
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
        
        BReal = new JButton("0,00");
        BReal.addActionListener(this);
        
        BMoeda = new JButton("R$");
        BMoeda.addActionListener(this);
        
        BPctg = new JButton("0.00%");
        BPctg.addActionListener(this);
        
        BAum = new JButton(">>");
        BAum.addActionListener(this);
        
        BDim = new JButton("<<");
        BDim.addActionListener(this);
        
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
        add(BSqrt);
        add(BReal);
        add(BMoeda);
        add(BPctg);
        add(LEmpty1);
        add(BAum);
        add(BDim);
        add(BLimpa);
    }
    
    public void actionPerformed(ActionEvent evento){
        //Limpa os TextField
        if (evento.getSource()==BLimpa){
            TNum1.setText("");
            TNum2.setText("");
            TResultado.setText("");
            return;
        }
        
        //Seta a quantidade de digitos decimais quando formatado para real
        real.setMinimumFractionDigits(fractionDigits);
        
        //Checa se o valor no TextField1 é válido
        try{
            num1 = Double.parseDouble(TNum1.getText());
        } catch (NumberFormatException erro){
            TResultado.setText("Erro");
            return;
        }
        
        //Faz o quadrado do primeiro valor
        if (evento.getSource()==BQuad){
            resultado = Math.pow(num1,2);
            TResultado.setText(String.valueOf(resultado));
            return;
        }
        
        //Faz a raiz quadrada do primeiro valor
        if (evento.getSource()==BSqrt){
            resultado = Math.sqrt(num1);
            TResultado.setText(String.valueOf(resultado));
            return;
        }
        
        //Checa se o valor no TextField2 é válido
        try{
            num2 = Double.parseDouble(TNum2.getText());
        } catch (NumberFormatException erro){
            TResultado.setText("Erro");
            return;
        }
        
        //Faz as operações básicas com os valor1 e valor2
        if(evento.getSource()==BSoma)
            resultado = num1 + num2;
        if(evento.getSource()==BSubtrai)   
            resultado = num1 - num2;
        if(evento.getSource()==BMultiplica)
            resultado = num1 * num2;
        if(evento.getSource()==BDivide)
            resultado = num1 / num2;
        if(evento.getSource()==BPot)
            resultado = Math.pow(num1,num2);
        
        //Exibe o resultado como um número real
        if(evento.getSource()==BReal){
            try{
                TResultado.setText(real.format(resultado));
            }catch(NumberFormatException erro){
                TResultado.setText("Erro");
            }
            return;
        }
        
        //Exibe o resultado como um valor monetário
        if(evento.getSource()==BMoeda){
            try{
                TResultado.setText(moeda.format(resultado));
            }catch(NumberFormatException erro){
                TResultado.setText("Erro");
            }
            return;
        }
        
        //Exibe o resultado como uma porcentagem
        if(evento.getSource()==BPctg){
            try{
                TResultado.setText(pctg.format(resultado));
            }catch(NumberFormatException erro){
                TResultado.setText("Erro");
            }
            return;
        }
        
        //Aumenta a quantidade de casas decimais do valor real e o exibe
        if(evento.getSource()==BAum){
            fractionDigits += 1;
            real.setMinimumFractionDigits(fractionDigits);
            TResultado.setText(real.format(resultado));
            return;
        }
        
        //Diminui a quantidade de casas decimais do valor real e o exibe
        if(evento.getSource()==BDim){
            fractionDigits -= 1;
            real.setMinimumFractionDigits(fractionDigits);
            TResultado.setText(real.format(resultado));
            return;
        }
        
        TResultado.setText(String.valueOf(resultado));
    }   
}
