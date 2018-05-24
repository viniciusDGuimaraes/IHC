package tarefa_21;

import javax.swing.JOptionPane;

public class Tarefa_21 {

    public static void main(String[] args) {
        String[] opcoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        int resposta = 0, opcao = 0;
        
        
        while(resposta != -1 && resposta != 1){
            String mensagem = "";
            String titulo = "Saída do exercicio 8";
            
            mensagem += "\"Oitavo Programa de GUI\"\n\n";
            
            mensagem += "1ª variável      2ª variável\n";

            mensagem += "10                     5\n\n\n";
            
            mensagem += "A calculadora efetuou as seguintes operações:\n";
            
            resposta = JOptionPane.showOptionDialog(null, mensagem, titulo, -1,-1, null, opcoes, opcoes[0]);
            
            mensagem = "";

            mensagem += "\"Oitavo Programa de GUI\"\n\n";

            mensagem += "1ª variável      2ª variável\n";

            mensagem += "10                     5\n\n\n";

            mensagem += "A calculadora efetuou as seguintes operações:\n\n";

            mensagem += "Operação         Resultado:\n\n";
            
            if(resposta == -1){
                System.exit(0);
            }
            else{
                if(resposta == 0){
                    mensagem += "Soma:               15";
                    titulo = "Operação de Soma";
                }
                else{
                    if(resposta == 1){
                        mensagem += "Subtração:       5";
                        titulo = "Operação de Subtração";
                    }
                    else{
                        if(resposta == 2){
                            mensagem += "Multiplicação:  50";
                            titulo = "Operação de Multiplicação";
                        }
                        else{
                            if(resposta == 3){
                                mensagem += "Divisão:            2";
                                titulo = "Operação de Divisão";
                            }
                        }
                    }
                }
            }
            
            mensagem += "\n\'Muito obrigado por utilizar os nossos serviços!\'\n\n";
            
            mensagem += "Deseja continuar a execução da calculadora?";
            
            resposta = JOptionPane.showConfirmDialog(null, mensagem, titulo, 0, -1);
        }
    }
    
}
