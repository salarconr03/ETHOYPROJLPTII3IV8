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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VentanaPreguntaColeccion extends JFrame implements ActionListener{
    
    private JLabel pregunta,aseveracion, fondito;
    private JButton si, no;
    private ImageIcon fondo;
    
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
        
        aseveracion = new JLabel();
        aseveracion.setText("<html><body><center>¿Quieres saber si tu juguete es de colección?.<br></center></body></html>"); 
        aseveracion.setHorizontalAlignment(SwingConstants.CENTER);
        aseveracion.setBounds(0,7,1300,300);
        aseveracion.setForeground(new Color(164, 63, 255));
        aseveracion.setFont(new Font("Goudy Stout",Font.PLAIN,40));
        aseveracion.setVisible(true);
        this.add(aseveracion);
        aseveracion.updateUI();
        
        pregunta = new JLabel();
        pregunta.setText("<html><body><center>¿Quieres saber si tu juguete es de colección?.<br></center></body></html>"); 
        pregunta.setHorizontalAlignment(SwingConstants.CENTER);
        pregunta.setBounds(0,7,1300,300);
        pregunta.setForeground(new Color(164, 63, 255));
        pregunta.setFont(new Font("Goudy Stout",Font.PLAIN,40));
        pregunta.setVisible(true);
        this.add(pregunta);
        pregunta.updateUI();
        
        si = new JButton();
        si.setText("<html><body><center>Si<br></center></body></html>");
        si.setForeground(new Color(197, 132, 255));
        si.setFont(new Font("Goudy Stout",Font.BOLD,20));
        si.setBorder(null);
        si.setBounds(800,400,440,70);
        si.setBackground(new Color(164, 63, 255));
        si.setVisible(true);
        si.addActionListener(this);
        this.add(si);
        si.updateUI();
        
        no = new JButton();
        no.setText("<html><body><center>No<br></center></body></html>");
        no.setForeground(new Color(197, 132, 255));
        no.setFont(new Font("Goudy Stout",Font.BOLD,20));
        no.setBorder(null);
        no.setBounds(120,400,440,70);
        no.setBackground(new Color(164, 63, 255));
        no.setVisible(true);
        no.addActionListener(this);
        this.add(no);
        no.updateUI();
        
        fondo = new ImageIcon("Fondo4.png");
        fondito = new JLabel();
        fondito.setBounds(0,0,1400,900);
        //fondito.setHorizontalAlignment(SwingConstants.CENTER);
        fondito.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(1400, 900, Image.SCALE_SMOOTH)));
        fondito.setVisible(true);
        this.add(fondito);
        fondito.updateUI();
        
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
        if(e.getSource() == si){
            VentanaDatosColeccion ventanasi = new VentanaDatosColeccion();
            ventanasi.setVisible(true);
            this.setVisible(false);
            ventanasi.configurarventana();
        }else if(e.getSource() == no){
            VentanaDatosColeccion ventanano = new VentanaDatosColeccion();
            ventanano.setVisible(true);
            this.setVisible(false);
            ventanano.configurarventana7();
        }
    }
    
}
