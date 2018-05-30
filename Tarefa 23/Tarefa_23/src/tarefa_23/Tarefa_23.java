package tarefa_23;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tarefa_23 extends JFrame implements ActionListener{
    
    JMenuBar BarradeMenu;
    JMenu menuArquivo, menuSalvar, menuEditar;
    JMenuItem ItemNovo, ItemAbrir, ItemSair, ItemSalvar, ItemSalvarComo, ItemSalvarTudo,
            ItemDesfazer, ItemRefazer, ItemRecortar, ItemCopiar, ItemColar, ItemLocalizar;
    ImageIcon IconeNovo, IconeAbrir, IconeSalvar, IconeDesfazer, IconeRefazer, IconeRecortar, 
            IconeCopiar, IconeColar, IconeLocalizar;

    public static void main(String[] args) {
        JFrame GUI = new Tarefa_23();
        GUI.setVisible(true);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    Tarefa_23(){
        getContentPane().setBackground(new Color(50,160,150));
        setLocation(100,100);
        setSize(300,160);
        setTitle("GUI com Barra de Menus");
        
        IconeNovo = new ImageIcon("src/tarefa_23/MenuNovo.GIF");
        IconeAbrir = new ImageIcon("src/tarefa_23/MenuAbrir.GIF");
        IconeSalvar = new ImageIcon("src/tarefa_23/MenuSalvar.GIF");
        IconeDesfazer = new ImageIcon("src/tarefa_23/Desfazer.GIF");
        IconeRefazer = new ImageIcon("src/tarefa_23/Refazer.GIF");
        IconeRecortar = new ImageIcon("src/tarefa_23/Recortar.GIF");
        IconeCopiar = new ImageIcon("src/tarefa_23/Copiar.GIF");
        IconeColar = new ImageIcon("src/tarefa_23/Colar.GIF");
        IconeLocalizar = new ImageIcon("src/tarefa_23/Localizar.GIF");

        BarradeMenu = new JMenuBar();
        
        menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic(KeyEvent.VK_A);
        menuArquivo.addActionListener(this);
        
        menuSalvar = new JMenu("Salvar");
        
        menuEditar = new JMenu("Editar");
        menuEditar.setMnemonic(KeyEvent.VK_A);
        menuEditar.addActionListener(this);
                
        ItemNovo = new JMenuItem("Novo", IconeNovo);
        ItemNovo.addActionListener(this);
        ItemNovo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        ItemNovo.setMnemonic(KeyEvent.VK_N);
        
        ItemAbrir = new JMenuItem ("Abrir", IconeAbrir);
        ItemAbrir.addActionListener(this);
        ItemAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        ItemAbrir.setMnemonic(KeyEvent.VK_A);
        
        ItemSalvar = new JMenuItem ("Salvar", IconeSalvar);
        ItemSalvar.addActionListener(this);
        ItemSalvar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        ItemSalvar.setMnemonic(KeyEvent.VK_S);
  
        ItemSalvarComo = new JMenuItem ("Salvar Como");
        ItemSalvarComo.addActionListener(this);
        ItemSalvarComo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        ItemSalvarComo.setMnemonic(KeyEvent.VK_C);
        
        ItemSalvarTudo = new JMenuItem("Salvar Tudo");
        ItemSalvarTudo.addActionListener(this);
        ItemSalvarTudo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
        ItemSalvarTudo.setMnemonic(KeyEvent.VK_T);
        
        ItemSair = new JMenuItem ("Sair");
        ItemSair.addActionListener(this);
        ItemSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        ItemSair.setMnemonic(KeyEvent.VK_R);
        
        ItemDesfazer = new JMenuItem ("Desfazer", IconeDesfazer);
        ItemDesfazer.addActionListener(this);
        ItemDesfazer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        ItemDesfazer.setMnemonic(KeyEvent.VK_D);
        
        ItemRefazer = new JMenuItem ("Refazer", IconeRefazer);
        ItemRefazer.addActionListener(this);
        ItemRefazer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
        ItemRefazer.setMnemonic(KeyEvent.VK_F);
        
        ItemRecortar = new JMenuItem ("Recortar", IconeRecortar);
        ItemRecortar.addActionListener(this);
        ItemRecortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        ItemRecortar.setMnemonic(KeyEvent.VK_E);
        
        ItemCopiar = new JMenuItem ("Copiar", IconeCopiar);
        ItemCopiar.addActionListener(this);
        ItemCopiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        ItemCopiar.setMnemonic(KeyEvent.VK_P);
        
        ItemColar = new JMenuItem ("Colar", IconeColar);
        ItemColar.addActionListener(this);
        ItemColar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        ItemColar.setMnemonic(KeyEvent.VK_O);
        
        ItemLocalizar = new JMenuItem ("Localizar", IconeLocalizar);
        ItemLocalizar.addActionListener(this);
        ItemLocalizar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        ItemLocalizar.setMnemonic(KeyEvent.VK_L);
        
        menuSalvar.add(ItemSalvar);
        menuSalvar.add(ItemSalvarComo);
        menuSalvar.add(ItemSalvarTudo);
        
        menuArquivo.add(ItemNovo);
        menuArquivo.add(ItemAbrir);
        menuArquivo.add(menuSalvar);
        menuArquivo.addSeparator();
        menuArquivo.add(ItemSair);
        
        menuEditar.add(ItemDesfazer);
        menuEditar.add(ItemRefazer);
        menuEditar.addSeparator();
        menuEditar.add(ItemRecortar);
        menuEditar.add(ItemCopiar);
        menuEditar.add(ItemColar);
        menuEditar.addSeparator();
        menuEditar.add(ItemLocalizar);
        
        BarradeMenu.add(menuArquivo);
        BarradeMenu.add(menuEditar);
        setJMenuBar(BarradeMenu);
    }
    
    public void actionPerformed(ActionEvent evento){
        if (evento.getSource()==ItemNovo)
            JOptionPane.showMessageDialog(null,"Você executou o comando Novo!" , "Opções de menu", JOptionPane.WARNING_MESSAGE, IconeNovo);
        if (evento.getSource()==ItemAbrir)
            JOptionPane.showMessageDialog(null,"Você executou o comando Abrir!" , "Opções de menu", JOptionPane.WARNING_MESSAGE, IconeAbrir);
        if (evento.getSource()==ItemSalvar)
            JOptionPane.showMessageDialog(null,"Você executou o comando Salvar!" , "Opções de menu", JOptionPane.WARNING_MESSAGE, IconeSalvar);
        if (evento.getSource()==ItemSalvarComo)
            JOptionPane.showMessageDialog(null,"Você executou o comando Salvar Como!" , "Opções de menu", JOptionPane.WARNING_MESSAGE);
        if (evento.getSource()==ItemSalvarTudo)
            JOptionPane.showMessageDialog(null,"Voce executou o comando Salvar Tudo!" , "Opções de menu", JOptionPane.WARNING_MESSAGE);
        if(evento.getSource()==ItemDesfazer)
            JOptionPane.showMessageDialog(null,"Voce executou o comando Desfazer!" , "Opções de menu", JOptionPane.WARNING_MESSAGE, IconeDesfazer);
        if(evento.getSource()==ItemRefazer)
            JOptionPane.showMessageDialog(null,"Voce executou o comando Refazer!" , "Opções de menu", JOptionPane.WARNING_MESSAGE, IconeRefazer);
        if(evento.getSource()==ItemRecortar)
            JOptionPane.showMessageDialog(null,"Voce executou o comando Recortar!" , "Opções de menu", JOptionPane.WARNING_MESSAGE, IconeRecortar);
        if(evento.getSource()==ItemCopiar)
            JOptionPane.showMessageDialog(null,"Voce executou o comando Copiar!" , "Opções de menu", JOptionPane.WARNING_MESSAGE, IconeCopiar);
        if(evento.getSource()==ItemColar)
            JOptionPane.showMessageDialog(null,"Voce executou o comando Colar!" , "Opções de menu", JOptionPane.WARNING_MESSAGE, IconeColar);
        if(evento.getSource()==ItemLocalizar)
            JOptionPane.showMessageDialog(null,"Voce executou o comando Localizar!" , "Opções de menu", JOptionPane.WARNING_MESSAGE, IconeLocalizar);
        if (evento.getSource()==ItemSair)
            System.exit(0);
    }
    
}