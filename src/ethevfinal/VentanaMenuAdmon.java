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


public class VentanaMenuAdmon extends JFrame implements ActionListener {

    private JLabel eleccion, fondito;
    private JButton listadeusuarios, listadejuguetes, eliminarusuarios, eliminarjuguete, salir;
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
        eleccion.setText("<html><body><center>Hola administrador.<br>¿Qué deseas hacer hoy?</center></body></html>"); 
        eleccion.setBounds(525, 60,1300,100);
        eleccion.setForeground(new Color(187, 218, 252));
        eleccion.setFont(new Font("Cooper Black",Font.PLAIN,25));
        eleccion.setVisible(true);
        this.add(eleccion);
        eleccion.updateUI();
        
        listadeusuarios = new JButton();
        listadeusuarios.setText("<html><body><center>Ver lista de Usuarios<br></center></body></html>");
        listadeusuarios.setForeground(new Color(197, 132, 255));
        listadeusuarios.setFont(new Font("Goudy Stout",Font.BOLD,20));
        listadeusuarios.setBorder(null);
        listadeusuarios.setBounds(100,250,440,70);
        listadeusuarios.setBackground(new Color(164, 63, 255));
        listadeusuarios.setVisible(true);
        listadeusuarios.addActionListener(this);
        this.add(listadeusuarios);
        listadeusuarios.updateUI();
        
        listadejuguetes = new JButton();
        listadejuguetes.setText("<html><body><center>Ver lista de Juguetes<br></center></body></html>");
        listadejuguetes.setForeground(new Color(197, 132, 255));
        listadejuguetes.setFont(new Font("Goudy Stout",Font.BOLD,20));
        listadejuguetes.setBorder(null);
        listadejuguetes.setBounds(100,450,440,70);
        listadejuguetes.setBackground(new Color(164, 63, 255));
        listadejuguetes.setVisible(true);
        listadejuguetes.addActionListener(this);
        this.add(listadejuguetes);
        listadejuguetes.updateUI();
        
        eliminarusuarios = new JButton();
        eliminarusuarios.setText("<html><body><center>Eliminar usuarios.<br></center></body></html>");
        eliminarusuarios.setForeground(new Color(197, 132, 255));
        eliminarusuarios.setFont(new Font("Goudy Stout",Font.BOLD,20));
        eliminarusuarios.setBorder(null);
        eliminarusuarios.setBounds(830,250,440,70);
        eliminarusuarios.setBackground(new Color(164, 63, 255));
        eliminarusuarios.setVisible(true);
        eliminarusuarios.addActionListener(this);
        this.add(eliminarusuarios);
        eliminarusuarios.updateUI();
        
        eliminarjuguete = new JButton();
        eliminarjuguete.setText("<html><body><center>Eliminar juguetes.<br></center></body></html>");
        eliminarjuguete.setForeground(new Color(197, 132, 255));
        eliminarjuguete.setFont(new Font("Goudy Stout",Font.BOLD,20));
        eliminarjuguete.setBorder(null);
        eliminarjuguete.setBounds(830,450,440,70);
        eliminarjuguete.setBackground(new Color(164, 63, 255));
        eliminarjuguete.setVisible(true);
        eliminarjuguete.addActionListener(this);
        this.add(eliminarjuguete);
        eliminarjuguete.updateUI();
        
        salir = new JButton();
        salir.setText("<html><body><center>Regrear al inicio.<br></center></body></html>");
        salir.setForeground(new Color(197, 132, 255));
        salir.setFont(new Font("Goudy Stout",Font.BOLD,20));
        salir.setBorder(null);
        salir.setBounds(475,600,440,70);
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
        if(e.getSource() == listadeusuarios){
            CrudUsuarios usu = new CrudUsuarios();
            try {
                usu.leerUsuario();
            } catch (IOException ex) {
                Logger.getLogger(VentanaMenuAdmon.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VentanaMenuAdmon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(e.getSource() == eliminarusuarios){
            VentanaIDUsuario ventanaid = new VentanaIDUsuario();
            ventanaid.configurarventana();
        }else if(e.getSource() == listadejuguetes){
            CrudJuguetes juguete = new CrudJuguetes();
            try {
                juguete.leerJuguete();
            } catch (IOException ex) {
                Logger.getLogger(VentanaMenuAdmon.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VentanaMenuAdmon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(e.getSource() == eliminarjuguete){
            IDJuguete ventanaid  = new IDJuguete();
            ventanaid.configurarventana();
        }else if(e.getSource() == salir){
            VentanaInicio inicio = new VentanaInicio();
            inicio.setVisible(true);
            this.setVisible(false);
            inicio.configurarventana();
        }
    
    }
}