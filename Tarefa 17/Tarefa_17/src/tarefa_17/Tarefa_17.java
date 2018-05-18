package tarefa_17;

import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Tarefa_17 extends JFrame{
    
    public static void main(String[] args) {
        float valorInicial = 1000f;
        float valorAtual = valorInicial;
        float pctg = 0.12f;
        float juros = 0;
        String mensagem = "";
        NumberFormat moeda = NumberFormat.getCurrencyInstance(), por=NumberFormat.getPercentInstance();
        por.setMinimumFractionDigits(2);
        
        mensagem += "\"Sexto programa de GUI\"\n\n";
        
        mensagem += "Valor Inicial:      Juros ao ano:\n";
        
        mensagem += moeda.format(valorInicial) + "        " + por.format(pctg) + "\n\n";
        
        mensagem += "A rentabilidade de sua aplicação ao final de cada ano será:\n\n";
        
        mensagem += "Ano       Valor               Juros (%)\n";
        
        for(int i = 2011; i <= 2015; i++){
            valorAtual += valorAtual * pctg;
            juros = ((valorAtual/valorInicial) - 1);
            mensagem += i + "      " + moeda.format(valorAtual) + "    " + por.format(juros) + "\n";
        }
        mensagem += "\nMuito obrigado por utilizar os nossos serviços!";
        
        JOptionPane.showMessageDialog(null, mensagem, "Saída do exercício 6", JOptionPane.INFORMATION_MESSAGE);
    }
}
