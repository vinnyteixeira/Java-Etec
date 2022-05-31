
package listaPessoas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class ListaDePessoas extends JFrame {
    
    JLabel rotulo1,rotulo2,rotulo3,erro,obrigatorio;
    JButton listar;
    JTextField nome,idade,hora;
    JTextArea texto;
    JScrollPane listando;
    
    public ListaDePessoas() {
        super("lista de pessoas");
        Container tela = getContentPane();
        setLayout(null);
        
        nome = new JTextField(15);
        idade = new JTextField(15);
        hora = new JTextField(15);
        rotulo1 = new JLabel("Nome Completo");
        rotulo2 = new JLabel("Idade");
        rotulo3 = new JLabel("Horario de Chegada");
        erro = new JLabel("Nada foi digitado");
        listar = new JButton("Listar");
        texto = new JTextArea();
        
        nome.setBounds(30, 30, 200, 20);
        idade.setBounds(30, 80, 200, 20);
        hora.setBounds(30, 130, 200, 20);
        rotulo1.setBounds(10, 10, 200, 20);
        rotulo2.setBounds(10, 60, 200, 20);
        rotulo3.setBounds(10, 110, 200, 20);
        listar.setBounds(70, 180, 100, 20);
        texto.setBounds(260, 10, 300, 230);
        
        tela.add(listar);
        tela.add(nome);
        tela.add(idade);
        tela.add(hora);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(texto);
        
        
        listar.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent  event) {
                String pegarNome;
                int pegarIdade, pegarHora;
                
                if ((nome.getText().isEmpty()) || (idade.getText().isEmpty()) || (hora.getText().isEmpty())){
                 texto.setText(erro.getText());
                 texto.setForeground(Color.red);
                } else {
                    pegarNome = (nome.getText());
                    pegarIdade = Integer.parseInt(idade.getText());
                    pegarHora = Integer.parseInt(hora.getText());
                    
                    String saida = "Nome Completo: " + pegarNome + "\n" + pegarIdade + "\n" + "\nHorario de chegada: " + pegarHora + "\n";
                    texto.setText(saida);
                    texto.setForeground(Color.black);
            }
        }      
    });
        setSize(600,300);
        setVisible(true);
        
    }
    
public static void main(String[]args){
    ListaDePessoas app = new ListaDePessoas();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
    

