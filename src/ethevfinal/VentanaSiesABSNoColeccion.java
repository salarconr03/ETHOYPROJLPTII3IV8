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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaSiesABSNoColeccion extends JFrame implements ActionListener{
    
    private JLabel aseveracion, fondito;
    private JButton continuar, regresar;
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
        aseveracion.setText("<html><body><center>Tu juguete es de ABS, pero al estar fuera de la caja este tiene una probabilidad menor al 30% de ser de colección por lo que puedes continuar registrando tu juguete o salir al menú principal. .<br></center></body></html>"); 
        aseveracion.setHorizontalAlignment(SwingConstants.CENTER);
        aseveracion.setBounds(30,5,1300,600);
        aseveracion.setForeground(new Color(164, 63, 255));
        aseveracion.setFont(new Font("Goudy Stout",Font.PLAIN,40));
        aseveracion.setVisible(true);
        this.add(aseveracion);
        aseveracion.updateUI();
        
        continuar = new JButton();
        continuar.setText("<html><body><center>Continuar.<br></center></body></html>");
        continuar.setForeground(new Color(197, 132, 255));
        continuar.setFont(new Font("Goudy Stout",Font.BOLD,20));
        continuar.setBorder(null);
        continuar.setBounds(535,535,300,70);
        continuar.setBackground(new Color(164, 63, 255));
        continuar.setVisible(true);
        continuar.addActionListener(this);
        this.add(continuar);
        continuar.updateUI();
        
        regresar = new JButton();
        regresar.setText("<html><body><center>Regresar a la pantalla de inicio.<br></center></body></html>");
        regresar.setForeground(new Color(197, 132, 255));
        regresar.setFont(new Font("Goudy Stout",Font.BOLD,20));
        regresar.setBorder(null);
        regresar.setBounds(500,620,440,130);
        regresar.setBackground(new Color(164, 63, 255));
        regresar.setVisible(true);
        regresar.addActionListener(this);
        this.add(regresar);
        regresar.updateUI();
        
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
            VentanaDatosColeccion ventanacoleccion = new VentanaDatosColeccion();
            ventanacoleccion.setVisible(true);
            this.setVisible(false);
            ventanacoleccion.configurarventana7();
        }else if(e.getSource() == regresar){
            VentanaPrincipal ventanaF = new VentanaPrincipal();
            ventanaF.setVisible(true);
            this.setVisible(false);
            ventanaF.configurarventana();
        }
    }
    
}
