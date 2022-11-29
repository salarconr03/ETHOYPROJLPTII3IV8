/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ethevfinal;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author USUARIO
 */
public class VentanaCompiladoAlcaldias extends JFrame implements ActionListener{
    
    private JLabel alcaldia1, alcaldia2, alcaldia3, alcaldia4, alcaldia5, alcaldia6, alcaldia7, alcaldia8, alcaldia9, alcaldia10, alcaldia11, alcaldia12, alcaldia13, alcaldia14, alcaldia15, alcaldia16, alcaldia17, fondito, titulo;
    private JButton regresar;
    private ImageIcon fondo, flecha2;

    public void configurarventana(){
        this.setTitle("ETHOY");
        this.setBounds(0, 0, 1400, 900);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0x27263A));
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        alcaldia1 = new JLabel();
        alcaldia1.setText("<html><body><center>1.- Azcapotzalco.<br></center></body></html>"); 
        alcaldia1.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia1.setBounds(50, 120,300,190);
        alcaldia1.setForeground(new Color(39, 38, 58));
        alcaldia1.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia1.setVisible(true);
        this.add(alcaldia1);
        alcaldia1.updateUI();
        
        alcaldia2 = new JLabel();
        alcaldia2.setText("<html><body><center>2.- Álvaro Obregón.<br></center></body></html>"); 
        alcaldia2.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia2.setBounds(50,220,300,190);
        alcaldia2.setForeground(new Color(39, 38, 58));
        alcaldia2.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia2.setVisible(true);
        this.add(alcaldia2);
        alcaldia2.updateUI();
        
        alcaldia3 = new JLabel();
        alcaldia3.setText("<html><body><center>3.- Benito Juárez<br></center></body></html>"); 
        alcaldia3.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia3.setBounds(50,320,300,190);
        alcaldia1.setForeground(new Color(39, 38, 58));
        alcaldia3.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia3.setVisible(true);
        this.add(alcaldia3);
        alcaldia3.updateUI();
        
        alcaldia4 = new JLabel();
        alcaldia4.setText("<html><body><center>4.- Cuajimalpa de Morelos<br></center></body></html>"); 
        alcaldia4.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia4.setBounds(50,420,300,190);
        alcaldia4.setForeground(new Color(39, 38, 58));
        alcaldia4.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia4.setVisible(true);
        this.add(alcaldia4);
        alcaldia4.updateUI();
        
        alcaldia5 = new JLabel();
        alcaldia5.setText("<html><body><center>5.- Cuahutemoc<br></center></body></html>"); 
        alcaldia5.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia5.setBounds(400,120,300,190);
        alcaldia5.setForeground(new Color(39, 38, 58));
        alcaldia5.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia5.setVisible(true);
        this.add(alcaldia5);
        alcaldia5.updateUI();
        
        alcaldia6 = new JLabel();
        alcaldia6.setText("<html><body><center>6.- Gustavo A. Madero<br></center></body></html>"); 
        alcaldia6.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia6.setBounds(400,220,300,190);
        alcaldia6.setForeground(new Color(39, 38, 58));
        alcaldia6.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia6.setVisible(true);
        this.add(alcaldia6);
        alcaldia6.updateUI();
        
        alcaldia7 = new JLabel();
        alcaldia7.setText("<html><body><center>7.- Coyoacan<br></center></body></html>"); 
        alcaldia7.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia7.setBounds(400,320,300,190);
        alcaldia7.setForeground(new Color(39, 38, 58));
        alcaldia7.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia7.setVisible(true);
        this.add(alcaldia7);
        alcaldia7.updateUI();
        
        alcaldia8 = new JLabel();
        alcaldia8.setText("<html><body><center>8.- Iztacalco<br></center></body></html>"); 
        alcaldia8.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia8.setBounds(400,420,300,190);
        alcaldia8.setForeground(new Color(39, 38, 58));
        alcaldia8.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia8.setVisible(true);
        this.add(alcaldia8);
        alcaldia8.updateUI();
        
        alcaldia9 = new JLabel();
        alcaldia9.setText("<html><body><center>9.- Iztapalapa<br></center></body></html>"); 
        alcaldia9.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia9.setBounds(750,120,300,190);
        alcaldia9.setForeground(new Color(39, 38, 58));
        alcaldia9.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia9.setVisible(true);
        this.add(alcaldia9);
        alcaldia9.updateUI();
        
        alcaldia10 = new JLabel();
        alcaldia10.setText("<html><body><center>10.- La Magdalena Contreras<br></center></body></html>"); 
        alcaldia10.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia10.setBounds(750,220,300,190);
        alcaldia10.setForeground(new Color(39, 38, 58));
        alcaldia10.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia10.setVisible(true);
        this.add(alcaldia10);
        alcaldia10.updateUI();
        
        alcaldia11 = new JLabel();
        alcaldia11.setText("<html><body><center>11.- Miguel Hidalgo<br></center></body></html>"); 
        alcaldia11.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia11.setBounds(750,320,300,190);
        alcaldia11.setForeground(new Color(39, 38, 58));
        alcaldia11.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia11.setVisible(true);
        this.add(alcaldia11);
        alcaldia11.updateUI();
        
        alcaldia12 = new JLabel();
        alcaldia12.setText("<html><body><center>12.- Milpa Alta<br></center></body></html>"); 
        alcaldia12.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia12.setBounds(750,420,300,190);
        alcaldia12.setForeground(new Color(39, 38, 58));
        alcaldia12.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia12.setVisible(true);
        this.add(alcaldia12);
        alcaldia12.updateUI();
        
        alcaldia13 = new JLabel();
        alcaldia13.setText("<html><body><center>13.- Tlalpan<br></center></body></html>"); 
        alcaldia13.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia13.setBounds(1050,120,300,190);
        alcaldia13.setForeground(new Color(39, 38, 58));
        alcaldia13.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia13.setVisible(true);
        this.add(alcaldia13);
        alcaldia13.updateUI();
        
        alcaldia14 = new JLabel();
        alcaldia14.setText("<html><body><center>14.- Tlhuac<br></center></body></html>"); 
        alcaldia14.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia14.setBounds(1050,220,300,190);
        alcaldia14.setForeground(new Color(39, 38, 58));
        alcaldia14.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia14.setVisible(true);
        this.add(alcaldia14);
        alcaldia14.updateUI();
        
        alcaldia15 = new JLabel();
        alcaldia15.setText("<html><body><center>15.- Venustiano Carranza<br></center></body></html>"); 
        alcaldia15.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia15.setBounds(1050,320,300,190);
        alcaldia15.setForeground(new Color(39, 38, 58));
        alcaldia15.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia15.setVisible(true);
        this.add(alcaldia15);
        alcaldia15.updateUI();
        
        alcaldia16 = new JLabel();
        alcaldia16.setText("<html><body><center>16.- Xochmilco<br></center></body></html>"); 
        alcaldia16.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia16.setBounds(1050,420,300,190);
        alcaldia16.setForeground(new Color(39, 38, 58));
        alcaldia16.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia16.setVisible(true);
        this.add(alcaldia16);
        alcaldia16.updateUI();
        
        alcaldia17 = new JLabel();
        alcaldia17.setText("<html><body><center>17.- No vivo en la CDMX<br></center></body></html>"); 
        alcaldia17.setHorizontalAlignment(SwingConstants.CENTER);
        alcaldia17.setBounds(575,520,300,190);
        alcaldia17.setForeground(new Color(39, 38, 58));
        alcaldia17.setFont(new Font("Bradley Hand ITC",Font.PLAIN,30));
        alcaldia17.setVisible(true);
        this.add(alcaldia17);
        alcaldia17.updateUI();
        
        titulo = new JLabel();
        titulo.setText("<html><body><center>Alcaldias<br></center></body></html>"); 
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setBounds(50,7,1300,190);
        titulo.setForeground(new Color(164, 63, 255));
        titulo.setFont(new Font("Goudy Stout",Font.PLAIN,40));
        titulo.setVisible(true);
        this.add(titulo);
        titulo.updateUI();
        
        
        
        flecha2 = new ImageIcon("Retroceder.png");
        regresar = new JButton();
        regresar.setBounds(0,600,170,170);
        Icon bouton = new ImageIcon(flecha2.getImage().getScaledInstance(regresar.getWidth(), regresar.getHeight(), Image.SCALE_DEFAULT));
        regresar.setIcon(bouton);
        regresar.setBackground(new Color(151, 152, 200));
        regresar.setVisible(true);
        regresar.addActionListener(this);
        this.add(regresar);
        regresar.updateUI();
        regresar.setBorder(null);
        
        fondo = new ImageIcon("Fondo4.png");
        fondito = new JLabel();
        fondito.setBounds(0,0,1400,900);
        //fondito.setHorizontalAlignment(SwingConstants.CENTER);
        fondito.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(1400, 900, Image.SCALE_SMOOTH)));
        fondito.setVisible(true);
        this.add(fondito);
        fondito.updateUI();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == regresar){
            VentanaRegistro registroventana = new VentanaRegistro();
            registroventana.setVisible(true);
            this.setVisible(false);
            registroventana.configurarventana();
        }
    }
    
}
