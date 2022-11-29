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
import javax.swing.JOptionPane;

public class VentanaMenuUsuario extends JFrame implements ActionListener{
    CrudJuguetes crudj = new CrudJuguetes();
    private JLabel eleccion, fondito;
    private JButton registrarjuguete, verjuguetes, editarjuguetes, eliminarjuguete, editarusuario, donacion, salir;
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
        eleccion = new JLabel();
        eleccion.setText("<html><body><center>Que tal usuario.<br>¿Qué deseas hacer hoy?</center></body></html>"); 
        eleccion.setBounds(525, 60,1300,100);
        eleccion.setForeground(new Color(187, 218, 252));
        eleccion.setFont(new Font("Cooper Black",Font.PLAIN,25));
        eleccion.setVisible(true);
        this.add(eleccion);
        eleccion.updateUI();
        
        registrarjuguete = new JButton();
        registrarjuguete.setText("<html><body><center>Registrar Juguete.<br></center></body></html>");
        registrarjuguete.setForeground(new Color(197, 132, 255));
        registrarjuguete.setFont(new Font("Goudy Stout",Font.BOLD,20));
        registrarjuguete.setBorder(null);
        registrarjuguete.setBounds(120,220,440,70);
        registrarjuguete.setBackground(new Color(164, 63, 255));
        registrarjuguete.setVisible(true);
        registrarjuguete.addActionListener(this);
        this.add(registrarjuguete);
        registrarjuguete.updateUI();
        
        verjuguetes = new JButton();
        verjuguetes.setText("<html><body><center>Ver Juguete.<br></center></body></html>");
        verjuguetes.setForeground(new Color(197, 132, 255));
        verjuguetes.setFont(new Font("Goudy Stout",Font.BOLD,20));
        verjuguetes.setBorder(null);
        verjuguetes.setBounds(120,350,440,70);
        verjuguetes.setBackground(new Color(164, 63, 255));
        verjuguetes.setVisible(true);
        verjuguetes.addActionListener(this);
        this.add(verjuguetes);
        verjuguetes.updateUI();
        
        editarjuguetes = new JButton();
        editarjuguetes.setText("<html><body><center>Buscar juguete.<br></center></body></html>");
        editarjuguetes.setForeground(new Color(197, 132, 255));
        editarjuguetes.setFont(new Font("Goudy Stout",Font.BOLD,20));
        editarjuguetes.setBorder(null);
        editarjuguetes.setBounds(120,480,440,70);
        editarjuguetes.setBackground(new Color(164, 63, 255));
        editarjuguetes.setVisible(true);
        editarjuguetes.addActionListener(this);
        this.add(editarjuguetes);
        editarjuguetes.updateUI();
        
        eliminarjuguete = new JButton();
        eliminarjuguete.setText("<html><body><center>Eliminar Juguete.<br></center></body></html>");
        eliminarjuguete.setForeground(new Color(197, 132, 255));
        eliminarjuguete.setFont(new Font("Goudy Stout",Font.BOLD,20));
        eliminarjuguete.setBorder(null);
        eliminarjuguete.setBounds(120,610,440,70);
        eliminarjuguete.setBackground(new Color(164, 63, 255));
        eliminarjuguete.setVisible(true);
        eliminarjuguete.addActionListener(this);
        this.add(eliminarjuguete);
        eliminarjuguete.updateUI();
        
        editarusuario = new JButton();
        editarusuario.setText("<html><body><center>Editar Usuario.<br></center></body></html>");
        editarusuario.setForeground(new Color(197, 132, 255));
        editarusuario.setFont(new Font("Goudy Stout",Font.BOLD,20));
        editarusuario.setBorder(null);
        editarusuario.setBounds(800,290,440,70);
        editarusuario.setBackground(new Color(164, 63, 255));
        editarusuario.setVisible(true);
        editarusuario.addActionListener(this);
        this.add(editarusuario);
        editarusuario.updateUI();
        
        donacion = new JButton();
        donacion.setText("<html><body><center>Recomendaciones<br></center></body></html>");
        donacion.setForeground(new Color(197, 132, 255));
        donacion.setFont(new Font("Goudy Stout",Font.BOLD,20));
        donacion.setBorder(null);
        donacion.setBounds(800,420,440,70);
        donacion.setBackground(new Color(164, 63, 255));
        donacion.setVisible(true);
        donacion.addActionListener(this);
        this.add(donacion);
        donacion.updateUI();
        
        salir = new JButton();
        salir.setText("<html><body><center>Salir al Inicio<br></center></body></html>");
        salir.setForeground(new Color(197, 132, 255));
        salir.setFont(new Font("Goudy Stout",Font.BOLD,20));
        salir.setBorder(null);
        salir.setBounds(800,550,440,70);
        salir.setBackground(new Color(164, 63, 255));
        salir.setVisible(true);
        salir.addActionListener(this);
        this.add(salir);
        salir.updateUI();
        
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
        if(e.getSource() == registrarjuguete){
            VentanaValidacionABS ventanavalidar = new VentanaValidacionABS();
            ventanavalidar.setVisible(true);
            this.setVisible(false);
            ventanavalidar.configurarventana();
        }else if (e.getSource() == salir){
            VentanaInicio inicio = new VentanaInicio();
            inicio.setVisible(true);
            this.setVisible(false);
            inicio.configurarventana();
            
        }else if(e.getSource() == eliminarjuguete){
            
            ApruebaID pr = new ApruebaID();
            
            int idy = pr.getId();
            
            JOptionPane.showInternalMessageDialog(null, "El id es: "+idy);
            
            /*
            VentanaIDUsuario eliminar = new VentanaIDUsuario();
            eliminar.setVisible(true);
            this.setVisible(false);
            eliminar.configurarventana();
*/
        }else if(e.getSource() == verjuguetes){
           
            ApruebaID pr = new ApruebaID();
            
            int idy = pr.getId();
            try {
                crudj.buscarJuguete2(idy);
            } catch (IOException ex) {
                Logger.getLogger(VentanaMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VentanaMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
    
}
