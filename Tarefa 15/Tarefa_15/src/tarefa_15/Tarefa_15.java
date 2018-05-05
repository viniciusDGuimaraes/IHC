
package tarefa_15;

// importa o pacote awt
import java.awt.*;
// importa os eventos do awt
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
// importa o pacote swing
import javax.swing.*;
// importa os eventos do swing
import javax.swing.event.*;

public class Tarefa_15 extends JFrame implements ListSelectionListener{

    JLabel rotulo1, rotulo2;
    JTextField texto;
    JList listaSelecao;
    DefaultListModel estados;
   
    public static void main(String[] args) {
        JFrame GUI = new Tarefa_15();
        GUI.setVisible(true);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    Tarefa_15(){
        setLocation(250,150);
        setTitle("Quarto Exercicio");
        setSize(350,100);
        
        rotulo1 = new JLabel("Selecione o estado:");
        rotulo2 = new JLabel("O nome do estado é:");
        
        texto = new JTextField();
        
        estados = new DefaultListModel();
        estados.addElement("AC");
        estados.addElement("AL");
        estados.addElement("AP");
        estados.addElement("AM");
        estados.addElement("BA");
        estados.addElement("CE");
        estados.addElement("DF");
        estados.addElement("ES");
        estados.addElement("GO");
        estados.addElement("MA");
        estados.addElement("MT");
        estados.addElement("MS");
        estados.addElement("MG");
        estados.addElement("PA");
        estados.addElement("PB");
        estados.addElement("PR");
        estados.addElement("PE");
        estados.addElement("PI");
        estados.addElement("RJ");
        estados.addElement("RN");
        estados.addElement("RS");
        estados.addElement("RO");
        estados.addElement("RR");
        estados.addElement("SC");
        estados.addElement("SP");
        estados.addElement("SE");
        estados.addElement("TO");
        
        listaSelecao = new JList(estados);
        listaSelecao.addListSelectionListener(this);
        
        JScrollPane painel = new JScrollPane(listaSelecao);
                
        setLayout(new GridLayout(2,2));
        
        add(rotulo1);
        add(rotulo2);
        add(painel);
        add(texto);
    }

    @Override
    public void valueChanged(ListSelectionEvent evento) {
        Map<String, String> siglaEstado = new HashMap<String,String>();
        siglaEstado.put("AC", "Acre");
        siglaEstado.put("AL", "Alagoas");
        siglaEstado.put("AP", "Amapá");
        siglaEstado.put("AM", "Amazônia");
        siglaEstado.put("BA", "Bahia");
        siglaEstado.put("CE", "Ceará");
        siglaEstado.put("DF", "Distrito Federal");
        siglaEstado.put("ES", "Espírito Santo");
        siglaEstado.put("GO", "Goiás");
        siglaEstado.put("MA", "Maranhão");
        siglaEstado.put("MT", "Mato Grosso");
        siglaEstado.put("MS", "Mato Grosso do Sul");
        siglaEstado.put("MG", "Minas Gerais");
        siglaEstado.put("PA", "Pará");
        siglaEstado.put("PB", "Paraíba");
        siglaEstado.put("PR", "Paraná");
        siglaEstado.put("PE", "Pernambuco");
        siglaEstado.put("PI", "Piauí");
        siglaEstado.put("RJ", "Rio de Janeiro");
        siglaEstado.put("RN", "Rio Grande do Norte");
        siglaEstado.put("RS", "Rio Grande do Sul");
        siglaEstado.put("RO", "Rondônia");
        siglaEstado.put("RR", "Roraima");
        siglaEstado.put("SC", "Santa Catarina");
        siglaEstado.put("SP", "São Paulo");
        siglaEstado.put("SE", "Sergipe");
        siglaEstado.put("TO", "Tocantins");
        
        if(evento.getSource()==listaSelecao){
            texto.setText((String)listaSelecao.getSelectedValue()+ 
                           " - " + 
                           siglaEstado.get(listaSelecao.getSelectedValue()));
        }
    }
}
