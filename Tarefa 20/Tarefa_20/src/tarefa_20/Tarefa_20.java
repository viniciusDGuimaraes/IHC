package tarefa_20;

import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class Tarefa_20 {
    static int qtde = 1;

    public static void main(String[] args) {
        int resposta = 0;
        NumberFormat moeda = NumberFormat.getCurrencyInstance(), por=NumberFormat.getPercentInstance();
        por.setMinimumFractionDigits(2);
        
        while(resposta == 0){
            float valorInicial = 1000f;
            float valorAtual = valorInicial;
            float pctg = 0.12f;
            float juros = 0;
            String mensagem = "";
            
            mensagem += "\"Sétimo programa de GUI\"\n\n";

            mensagem += "Valor Inicial:      Juros ao ano:\n";

            mensagem += moeda.format(valorInicial) + "        " + por.format(pctg) + "\n\n";

            mensagem += "A rentabilidade de sua aplicação ao final de cada ano será:\n\n";

            mensagem += "Ano       Valor               Juros (%)\n";

            for(int i = 2011; i <= 2015; i++){
                valorAtual += valorAtual * pctg;
                juros = ((valorAtual/valorInicial) - 1);
                mensagem += i + "      " + moeda.format(valorAtual) + "    " + por.format(juros) + "\n";
            }
            
            mensagem += "\n\'Essa é a " + qtde + "ª vez que esse programa é executado\'\n";
            
            mensagem += "\n\'Muito obrigado por utilizar os nossos serviços!\'";

            resposta = JOptionPane.showConfirmDialog(null, mensagem, "Saída do exercício 7", 0, -1);
            
            qtde++;
        }
    }
    
}
