package exemploorientobjetos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculadora extends JFrame{
JLabel rotulo,rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7;
JButton somar, subtrair,multiplicar,dividir;
JTextField texto, texto2, texto3;
int num1, num2, resultado=0;

public Calculadora(){
super("CALCULADORA");
Container tela = getContentPane();
setLayout(null);

 rotulo = new JLabel("Digite seu primeiro numero");
 rotulo1 = new JLabel("Digite seu segundo numero");
  rotulo2 = new JLabel("Resultado");

texto = new JTextField(15);
texto2 = new JTextField(15);
texto3 = new JTextField(15);
somar = new JButton(" SOMAR ");
subtrair = new JButton(" SUBTRAIR ");
multiplicar = new JButton(" MULTIPLICAR ");
dividir = new JButton(" DIVIDIR ");


rotulo.setBounds(100,40,200,20);
rotulo1.setBounds(100,80,200,20);
rotulo2.setBounds(50,100,100,20);

texto.setBounds(40,40,200,20);
texto2.setBounds(110,60,100,20);
texto3.setBounds(110,100,100,20);
//BOTOES DE ACOES
somar.setBounds(100,80,200,20);
subtrair.setBounds(200,120,100,20);
multiplicar.setBounds(200,160,100,20);
dividir.setBounds(200,180,100,20);

tela.add(rotulo);
tela.add(rotulo1);
tela.add(rotulo2);

tela.add(somar);
tela.add(subtrair);
tela.add(multiplicar);
tela.add(dividir);

tela.add(texto);
tela.add(texto2);
tela.add(texto3);

somar.addActionListener( new ActionListener(){

public void actionPerformed(ActionEvent event){
num1 = Integer.parseInt(texto.getText());
num2 = Integer.parseInt(texto2.getText());
resultado = num1 + num2;
String resul = String.valueOf(resultado);

texto3.setText(Integer.toString(resultado));
}
});




subtrair.addActionListener( new ActionListener(){

public void actionPerformed(ActionEvent event){
num1 = Integer.parseInt(texto.getText());
num2 = Integer.parseInt(texto2.getText());
resultado = num1 - num2;
String resul = String.valueOf(resultado);

texto3.setText(Integer.toString(resultado));
}
});

multiplicar.addActionListener( new ActionListener(){

public void actionPerformed(ActionEvent event){
num1 = Integer.parseInt(texto.getText());
num2 = Integer.parseInt(texto2.getText());
resultado = num1 * num2;
String resul = String.valueOf(resultado);

texto3.setText(Integer.toString(resultado));
}
});

dividir.addActionListener( new ActionListener(){

public void actionPerformed(ActionEvent event){
num1 = Integer.parseInt(texto.getText());
num2 = Integer.parseInt(texto2.getText());
resultado = num1 / num2;
String resul = String.valueOf(resultado);

texto3.setText(Integer.toString(resultado));
}
});


setSize(640,480);
setVisible(true);
texto.requestFocus();
}

public static void main (String[] args){
Calculadora app = new Calculadora();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}