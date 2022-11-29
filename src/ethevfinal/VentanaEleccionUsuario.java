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
import ethevfinal.*;
import java.awt.event.KeyAdapter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VentanaEleccionUsuario extends JFrame implements ActionListener {
 
    
    CrudUsuarios crudu = new CrudUsuarios();
    private JLabel idpedir, contraseña, imgsaludo, ingreso, fondito;
    private JButton ingresar, regresar;
    private JTextField txtcontraseña, txtid;
    private ImageIcon flecha2, saludo, varia, fondo;

  
    
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
        
        saludo = new ImageIcon("Hola.png");
        imgsaludo = new JLabel();
        imgsaludo.setBounds(520,20,300,300);
        imgsaludo.setHorizontalAlignment(SwingConstants.CENTER);
        imgsaludo.setIcon(new ImageIcon(saludo.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
        imgsaludo.setBackground(new Color(0x27263A));
        imgsaludo.setVisible(true);
        this.add(imgsaludo);
        imgsaludo.updateUI();
        
        idpedir = new JLabel();
        idpedir.setText("<html><body><center>Ingresa tu id de usuario.<br></center></body></html>"); 
        idpedir.setBounds(100,280,700,30);
        idpedir.setForeground(new Color(164, 63, 255));
        idpedir.setFont(new Font("Ink Free",Font.PLAIN,25));
        idpedir.setVisible(true);
        this.add(idpedir);
        idpedir.updateUI();
        txtid = new JTextField();
        txtid.setBounds(520, 280, 700, 30);
        txtid.setBackground(new Color(213, 128, 255));
        txtid.setBorder(null);
        txtid.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtid.setForeground(Color.BLACK);
        txtid.setVisible(true);
        this.add(txtid);
        txtid.updateUI();
        txtid.addKeyListener(new KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidTyped(evt);
            }
        });
        
        contraseña = new JLabel();
        contraseña.setText("<html><body><center>Ingresa tu contraseña.<br></center></body></html>"); 
        contraseña.setBounds(100,500,700,30);
        contraseña.setForeground(new Color(164, 63, 255));
        contraseña.setFont(new Font("Ink Free",Font.PLAIN,25));
        contraseña.setVisible(true);
        this.add(contraseña);
        contraseña.updateUI();
        txtcontraseña = new JTextField();
        txtcontraseña.setBounds(520, 500, 700, 30);
        txtcontraseña.setBackground(new Color(213, 128, 255));
        txtcontraseña.setBorder(null);
        txtcontraseña.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtcontraseña.setForeground(Color.BLACK);
        txtcontraseña.setVisible(true);
        this.add(txtcontraseña);
        txtcontraseña.updateUI();
        
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
        
        varia = new ImageIcon("NubeMixta.png");
        ingresar = new JButton();
        ingresar.setBounds(1140,580,180,120);
        Icon botons = new ImageIcon(varia.getImage().getScaledInstance(ingresar.getWidth(), ingresar.getHeight(), Image.SCALE_DEFAULT));
        ingresar.setIcon(botons);
        ingresar.setBackground(new Color(151, 152, 200));
        ingresar.setVisible(true);
        ingresar.addActionListener(this);
        this.add(ingresar);
        ingresar.updateUI();
        ingresar.setBorder(null);
        
        ingreso = new JLabel();
        ingreso.setText("<html><body><center>Ingresar.<br></center></body></html>"); 
        ingreso.setBounds(1190,700,700,30);
        ingreso.setForeground(new Color(187, 218, 252));
        ingreso.setFont(new Font("Ink Free",Font.PLAIN,20));
        ingreso.setVisible(true);
        this.add(ingreso);
        ingreso.updateUI();
        
        fondo = new ImageIcon("Fondo4.png");
        fondito = new JLabel();
        fondito.setBounds(0,0,1400,900);
        //fondito.setHorizontalAlignment(SwingConstants.CENTER);
        fondito.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(1400, 900, Image.SCALE_SMOOTH)));
        fondito.setVisible(true);
        this.add(fondito);
        fondito.updateUI();
    }
    
    private void txtidTyped(java.awt.event.KeyEvent evt) {                                    
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros){
            evt.consume();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == ingresar){
             
             try {
                 int ide =Integer.parseInt(txtid.getText());
                 String contra = txtcontraseña.getText();
                 
                 Usuario us = crudu.buscarPersona(ide);
                 
                 if(us.getId() == 0){
                     JOptionPane.showMessageDialog(null, "Id invalido por favor intente otra vez");
                 }else{
                     if(us.getContrasena().equals(contra)){
                         VentanaMenuUsuario ventanausuario = new VentanaMenuUsuario();
                         ventanausuario.setVisible(true);
                         this.setVisible(false);
                         ventanausuario.configurarventana();
                         ApruebaID pre = new ApruebaID();
                         pre.setId(ide);
                         
                     }else{
                         JOptionPane.showMessageDialog(null, "Contraseña incorrecta por favor intente otra vez");
                     }
                 }   } catch (IOException ex) {
                 Logger.getLogger(VentanaEleccionUsuario.class.getName()).log(Level.SEVERE, null, ex);
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(VentanaEleccionUsuario.class.getName()).log(Level.SEVERE, null, ex);
             }
                 
             
        }else if(e.getSource() == regresar){
            VentanaInicio ventanamain = new VentanaInicio();
            ventanamain.setVisible(true);
            this.setVisible(false);
            ventanamain.configurarventana();
        }
    }
    
    
    
}
