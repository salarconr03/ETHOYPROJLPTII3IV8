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
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class VentanaPrincipal extends JFrame implements ActionListener{

    private JPanel panel;
    private JLabel bienvenida, info, info2, nosotros, nosotros2, fondito;
    private JLabel logoEmpresa;
    private JButton continuar;
    private ImageIcon logo, boton, frase, fondo;

    public void configurarventana(){
        this.setTitle("ETHEV");
        this.setBounds(0, 0, 1400, 900);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0x27263A));
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
        
    }

    public void iniciarComponentes(){
        
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        panel.setVisible(true);
     
        logo = new ImageIcon("LogoEmpresa.png");
        logoEmpresa = new JLabel();
        logoEmpresa.setBounds(510,40,310,270);
        logoEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
        logoEmpresa.setIcon(new ImageIcon(logo.getImage().getScaledInstance(310, 270, Image.SCALE_SMOOTH)));
        logoEmpresa.setVisible(true);
        this.add(logoEmpresa);
        logoEmpresa.updateUI();
        
        frase = new ImageIcon("FraseEmpresa.png");
        bienvenida = new JLabel();
        bienvenida.setBounds(445,130,500,500);
        bienvenida.setHorizontalAlignment(SwingConstants.CENTER);
        bienvenida.setIcon(new ImageIcon(frase.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH)));
        bienvenida.setBackground(new Color(0x27263A));
        bienvenida.setVisible(true);
        this.add(bienvenida);
        bienvenida.updateUI();
        
        info = new JLabel();
        info.setText("Ethev se compone de dos palabras; “Et” que vine de la palabra en inglés Etherial la cual significa etéreo, es decir, algo sublime o"); 
        info.setBounds(28,400,1300,190);
        info.setForeground(new Color(39, 38, 58));
        info.setFont(new Font("Bradley Hand ITC",Font.BOLD,23));
        info.setHorizontalAlignment(SwingConstants.CENTER);
        info.setVisible(true);
        this.add(info);
        info.updateUI();
        
        info2 = new JLabel();
        info2.setText("más allá de lo esperado y la palabra “heaven” del inglés que significa cielo. Por lo que nuestro nombre es “Más allá del cielo."); 
        info2.setBounds(28,435,1300,190);
        info2.setForeground(new Color(39, 38, 58));
        info2.setFont(new Font("Bradley Hand ITC",Font.BOLD,23));
        info2.setHorizontalAlignment(SwingConstants.CENTER);
        info2.setVisible(true);
        this.add(info2);
        info2.updateUI();
        
        nosotros = new JLabel();
        nosotros.setText("Somos una empresa que desarrolla softwares de escritorio con el objetivo de resolver problemáticas de forma eficaz y útil siempre "); 
        nosotros.setBounds(28,470,1300,190);
        nosotros.setForeground(new Color(39, 38, 58));
        nosotros.setFont(new Font("Bradley Hand ITC",Font.BOLD,23));
        nosotros.setHorizontalAlignment(SwingConstants.CENTER);
        nosotros.setVisible(true);
        this.add(nosotros);
        nosotros.updateUI();
        
        nosotros2 = new JLabel();
        nosotros2.setText("pensando en el público."); 
        nosotros2.setBounds(28,505,1300,190);
        nosotros2.setForeground(new Color(39, 38, 58));
        nosotros2.setFont(new Font("Bradley Hand ITC",Font.BOLD,23));
        nosotros2.setHorizontalAlignment(SwingConstants.CENTER);
        nosotros2.setVisible(true);
        this.add(nosotros2);
        nosotros2.updateUI();
        
        boton = new ImageIcon("Continuar.png");
        continuar = new JButton();
        continuar.setBounds(1200,600,170,170);
        Icon botons = new ImageIcon(boton.getImage().getScaledInstance(continuar.getWidth(), continuar.getHeight(), Image.SCALE_DEFAULT));
        continuar.setIcon(botons);
        continuar.setBackground(new Color(151, 152, 200));
        continuar.setVisible(true);
        continuar.addActionListener(this);
        this.add(continuar);
        continuar.updateUI();
        continuar.setBorder(null);
        
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
        if(e.getSource() == continuar){
            VentanaInicio ventana2 = new VentanaInicio();
            ventana2.setVisible(true);
            this.setVisible(false);
            ventana2.configurarventana();
        }
    }
}
