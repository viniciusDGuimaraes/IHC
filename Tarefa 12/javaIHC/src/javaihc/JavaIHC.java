package javaihc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaIHC extends JFrame implements ActionListener, ItemListener{
    
    JLabel rotulo1, rotulo2;
    JTextField texto1;
    JComboBox CaixadeSelecao;

    public static void main(String args[]){
        
        JFrame GUI = new JavaIHC();
        GUI.setVisible(true);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    JavaIHC(){
        
        setTitle("Quinto Exercicio");
        setSize(400,100);
        getContentPane().setBackground(new Color(160,180,200));
        
        rotulo1 = new JLabel("Selecione o Estado: ");
        rotulo1.setFont(new Font("Courier", Font.BOLD, 12));
        
        rotulo2 = new JLabel("O nome do estado é: ");
        rotulo2.setFont(new Font("Courier", Font.BOLD, 12));     
      
        texto1 = new JTextField();      
        
        String siglas[] = {"AC","AL","AP","AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
                
        CaixadeSelecao = new JComboBox(siglas);
        CaixadeSelecao.setMaximumRowCount(3);
        CaixadeSelecao.addItemListener(this);     
        
        setLayout(new GridLayout(2,2));
        add(rotulo1);
        add(rotulo2);
        add(CaixadeSelecao);        
        add(texto1);

    }

    public void actionPerformed(ActionEvent evento){
  
    }

    public void itemStateChanged(ItemEvent evento){
        
        String siglas[] = {"AC","AL","AP","AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
        String estados[] = {"Acre", "Alagoas", "Amapá","Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"};
        
        for(int i=0; i<27; i++){
            if (evento.getSource()==CaixadeSelecao && CaixadeSelecao.getSelectedItem()==siglas[i]){
                texto1.setText(""+CaixadeSelecao.getSelectedItem()+" - "+estados[i]);
            }
        }
        
    }
 
}  
