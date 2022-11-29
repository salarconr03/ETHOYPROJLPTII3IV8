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
public class VentanaInicio extends JFrame implements ActionListener{
    
    private JLabel proyecto, proyecto2, deseo, mexico, fondito;
    private JLabel logoProyecto, fraseProyecto;
    private JButton registrar, iniciosesion;
    private ImageIcon logo, frase, fondo;

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
        
        frase = new ImageIcon("FraseProyecto.png");
        fraseProyecto = new JLabel();
        fraseProyecto.setBounds(350,30,350,280);
        fraseProyecto.setHorizontalAlignment(SwingConstants.CENTER);
        fraseProyecto.setIcon(new ImageIcon(frase.getImage().getScaledInstance(350, 300, Image.SCALE_SMOOTH)));
        fraseProyecto.setBackground(new Color(0x27263A));
        fraseProyecto.setVisible(true);
        this.add(fraseProyecto);
        fraseProyecto.updateUI();
        
        logo = new ImageIcon("LogoPoryecto.png");
        logoProyecto = new JLabel();
        logoProyecto.setBounds(700,90,250,190);
        logoProyecto.setHorizontalAlignment(SwingConstants.CENTER);
        logoProyecto.setIcon(new ImageIcon(logo.getImage().getScaledInstance(250, 210, Image.SCALE_SMOOTH)));
        logoProyecto.setBackground(new Color(0x27263A));
        logoProyecto.setVisible(true);
        this.add(logoProyecto);
        logoProyecto.updateUI();

        proyecto2 = new JLabel();
        proyecto2.setText("<html><body><center>Ethoy es una calculadora que indica si tu juguete hecho con el polímero ABS continúa siendo útil; con base en los resultados se presentarán puntos limpios, sitios de donación y centros de colección (según sea el caso) para fomentar una cultura de reciclaje y cuidado del medio ambiente en la Ciudad de México.</center><br></body></html>"); 
        proyecto2.setHorizontalAlignment(SwingConstants.CENTER);
        proyecto2.setBounds(28,255,1300,190);
        proyecto2.setForeground(new Color(39, 38, 58));
        proyecto2.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        proyecto2.setVisible(true);
        this.add(proyecto2);
        proyecto2.updateUI();
        
        mexico = new JLabel();
        mexico.setText(""); 
        mexico.setBounds(28,295,1300,190);
        mexico.setForeground(new Color(39, 38, 58));
        mexico.setFont(new Font("Bradley Hand ITC",Font.PLAIN,28));
        mexico.setHorizontalAlignment(SwingConstants.CENTER);
        mexico.setVisible(true);
        this.add(mexico);
        mexico.updateUI();
        
        registrar = new JButton();
        registrar.setText("<html><body><center>Registrar nuevo usuario <br></center></body></html>");
        registrar.setForeground(new Color(197, 132, 255));
        registrar.setFont(new Font("Goudy Stout",Font.BOLD,23));
        registrar.setBorder(null);
        registrar.setBounds(440,440,470,110);
        registrar.setBackground(new Color(164, 63, 255));
        registrar.setVisible(true);
        registrar.addActionListener(this);
        this.add(registrar);
        registrar.updateUI();
        
        iniciosesion = new JButton();
        iniciosesion.setText("Iniciar Sesión");
        iniciosesion.setForeground(new Color(197, 132, 255));
        iniciosesion.setFont(new Font("Goudy Stout",Font.BOLD,23));
        iniciosesion.setBorder(null);
        iniciosesion.setBounds(455,585,440,110);
        iniciosesion.setBackground(new Color(164, 63, 255));
        iniciosesion.setVisible(true);
        iniciosesion.addActionListener(this);
        this.add(iniciosesion);
        iniciosesion.updateUI();
        
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
        if(e.getSource() == registrar){
            VentanaRegistro ventana3 = new VentanaRegistro();
            ventana3.setVisible(true);
            this.setVisible(false);
            ventana3.configurarventana();
        }else if(e.getSource() == iniciosesion){
            VentanaInicioSesion ventana4 = new VentanaInicioSesion();
            ventana4.setVisible(true);
            this.setVisible(false);
            ventana4.configurarventana();
        }
    }
}

