package tarefa_22;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tarefa_22 extends JFrame implements ActionListener{
    JLabel label1, label2, label3, label4;
    JTextField field1, field2, field3, field4;
    JButton bCalcula, bLimpa;
    JTextArea areaDeTexto;
    JPanel area1, area2;
    
    public static void main(String[] args) {
        JFrame GUI = new Tarefa_22();
        GUI.setVisible(true);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    Tarefa_22(){
        setSize(500,500);
        setTitle("Exercício 9 - Cálculo Financeiro");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        label1 = new JLabel("Valor Inicial:");
        label2 = new JLabel("Taxa de Juros(A.A.):");
        label3 = new JLabel("Ano de Início:");
        label4 = new JLabel("Ano de Término:");
        
        field1 = new JTextField(10);
        field2 = new JTextField(6);
        field3 = new JTextField(4);
        field4 = new JTextField(4);
        
        bCalcula = new JButton("Calcular Rendimentos");
        bCalcula.addActionListener(this);
        bLimpa = new JButton("Limpar Cálculos");
        bLimpa.addActionListener(this);
        
        areaDeTexto = new JTextArea(5, 40);
        JScrollPane painel = new JScrollPane(areaDeTexto);
        
        area1 = new JPanel();
        area2 = new JPanel();
        
        area1.setLayout(new GridLayout(2, 4));
        area2.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        area1.add(label1);
        area1.add(field1);
        
        area1.add(label2);
        area1.add(field2);
        
        area1.add(label3);
        area1.add(field3);
        
        area1.add(label4);
        area1.add(field4);
        
        area2.add(bCalcula);
        area2.add(bLimpa);
        
        area2.add(areaDeTexto);
        area2.add(painel);
        
        add(area1);
        add(area2);
    }

    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == bCalcula){
            if(field1.getText().length() == 0 || field2.getText().length() == 0 
                    || field3.getText().length() == 0 || field4.getText().length() == 0){
                areaDeTexto.setText("");
                areaDeTexto.append("Erro! Uma ou mais caixas de texto estão vazias");
            }
            else{
                int valorInicial = Integer.parseInt(field1.getText()), 
                        anoInicial = Integer.parseInt(field3.getText()), 
                        anoFinal = Integer.parseInt(field4.getText());
                float juros = Float.parseFloat(field2.getText());
                NumberFormat moeda = NumberFormat.getCurrencyInstance(), por = NumberFormat.getPercentInstance();
                areaDeTexto.setText("");
                areaDeTexto.append("Nono programa de Práticas Profissionais\n\n");
                areaDeTexto.append("Valor Inicial:            Juros ao ano:\n");
                areaDeTexto.append(valorInicial + "            " + por.format(juros) + "\n\n");
                areaDeTexto.append("Ano                     Valor                      Juros\n");
                for(int i = anoInicial; i <= anoFinal; i++){
                    areaDeTexto.append(i + "                " + moeda.format(valorInicial) + "               " + por.format(juros) + "\n");
                }
                areaDeTexto.append("\nMuito obrigado por utilizar os nossos serviços!");
            }
        }
        
        if(evento.getSource() == bLimpa){
            areaDeTexto.setText("");
            field1.setText("");
            field2.setText("");
            field3.setText("");
            field4.setText("");
        }
    }
}
