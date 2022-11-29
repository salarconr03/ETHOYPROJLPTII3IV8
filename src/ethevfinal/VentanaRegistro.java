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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import ethevfinal.*;
import java.awt.event.KeyAdapter;
import javax.swing.JOptionPane;

public class VentanaRegistro extends JFrame implements ActionListener{
    
    public static int id;
    private JLabel correo, contraseña, nombre, alcaldia, frase, fondito, infoid, felicitacion;
    private JTextField txtcorreo, txtcontraseña, txtnombre, txtalcaldia;
    private JButton regresar, guardar, alcaldia2;
    private ImageIcon flecha2, fondo;
    
    Usuario usuarioprueba = new UsuarioComun();

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
        frase = new JLabel();
        frase.setText("<html><body><center>REGISTRO<br></center></body></html>"); 
        frase.setHorizontalAlignment(SwingConstants.CENTER);
        frase.setBounds(0,7,1300,190);
        frase.setForeground(new Color(164, 63, 255));
        frase.setFont(new Font("Goudy Stout",Font.PLAIN,40));
        frase.setVisible(true);
        this.add(frase);
        frase.updateUI();
        
        correo = new JLabel();
        correo.setText("<html><body><center>Ingresa tu correo electrónico.<br></center></body></html>"); 
        correo.setBounds(100,180,700,30);
        correo.setForeground(new Color(39, 38, 58));
        correo.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        correo.setVisible(true);
        this.add(correo);
        correo.updateUI();
        txtcorreo = new JTextField();
        txtcorreo.setBounds(550, 178, 700, 30);
        txtcorreo.setBackground(new Color(213, 128, 255));
        txtcorreo.setBorder(null);
        txtcorreo.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtcorreo.setForeground(Color.BLACK);
        txtcorreo.setVisible(true);
        this.add(txtcorreo);
        txtcorreo.updateUI();
        
        nombre = new JLabel();
        nombre.setText("<html><body><center>Ingresa tu nombre.<br></center></body></html>"); 
        nombre.setBounds(100,270,700,30);
        nombre.setForeground(new Color(39, 38, 58));
        nombre.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        nombre.setVisible(true);
        this.add(nombre);
        nombre.updateUI();
        txtnombre = new JTextField();
        txtnombre.setBounds(550, 268, 700, 30);
        txtnombre.setBackground(new Color(213, 128, 255));
        txtnombre.setBorder(null);
        txtnombre.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtnombre.setForeground(Color.BLACK);
        txtnombre.setVisible(true);
        this.add(txtnombre);
        txtnombre.updateUI();
        txtnombre.addKeyListener(new KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreTyped(evt);
            }
        });
        
        contraseña = new JLabel();
        contraseña.setText("<html><body><center>Crea una contraseña.<br></center></body></html>"); 
        contraseña.setBounds(100,360,700,30);
        contraseña.setForeground(new Color(39, 38, 58));
        contraseña.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        contraseña.setVisible(true);
        this.add(contraseña);
        contraseña.updateUI();
        txtcontraseña = new JTextField();
        txtcontraseña.setBounds(550, 358, 700, 30);
        txtcontraseña.setBackground(new Color(213, 128, 255));
        txtcontraseña.setBorder(null);
        txtcontraseña.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtcontraseña.setForeground(Color.BLACK);
        txtcontraseña.setVisible(true);
        this.add(txtcontraseña);
        txtcontraseña.updateUI();
        
        alcaldia = new JLabel();
        alcaldia.setText("<html><body><center>Ingresa tu alcaldía.<br></center></body></html>"); 
        alcaldia.setBounds(100,450,700,30);
        alcaldia.setForeground(new Color(39, 38, 58));
        alcaldia.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        alcaldia.setVisible(true);
        this.add(alcaldia);
        alcaldia.updateUI();
        txtalcaldia = new JTextField();
        txtalcaldia.setBounds(550, 448, 700, 30);
        txtalcaldia.setBackground(new Color(213, 128, 255));
        txtalcaldia.setBorder(null);
        txtalcaldia.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtalcaldia.setForeground(Color.BLACK);
        txtalcaldia.setVisible(true);
        this.add(txtalcaldia);
        txtalcaldia.updateUI();
        txtalcaldia.addKeyListener(new KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtalcaldiaTyped(evt);
            }
        });
        
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
        
        guardar = new JButton();
        guardar.setText("<html><body><center>Guardar<br></center></body></html>");
        guardar.setForeground(new Color(197, 132, 255));
        guardar.setFont(new Font("Goudy Stout",Font.BOLD,20));
        guardar.setBorder(null);
        guardar.setBounds(890,600,440,70);
        guardar.setBackground(new Color(164, 63, 255));
        guardar.setVisible(true);
        guardar.addActionListener(this);
        this.add(guardar);
        guardar.updateUI();
        
        alcaldia2 = new JButton();
        alcaldia2.setText("<html><body><center>Checar Alcaldías.<br></center></body></html>");
        alcaldia2.setForeground(new Color(197, 132, 255));
        alcaldia2.setFont(new Font("Goudy Stout",Font.BOLD,15));
        alcaldia2.setBorder(null);
        alcaldia2.setBounds(570,500,250,50);
        alcaldia2.setBackground(new Color(164, 63, 255));
        alcaldia2.setVisible(true);
        alcaldia2.addActionListener(this);
        this.add(alcaldia2);
        alcaldia2.updateUI();
        
        fondo = new ImageIcon("Fondo4.png");
        fondito = new JLabel();
        fondito.setBounds(0,0,1400,900);
        //fondito.setHorizontalAlignment(SwingConstants.CENTER);
        fondito.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(1400, 900, Image.SCALE_SMOOTH)));
        fondito.setVisible(true);
        this.add(fondito);
        fondito.updateUI();
    }
    
    public void obtenerDatos() throws IOException, ClassNotFoundException{
        String nombre, correo, contraseña;
        int alcaldia;
        nombre = txtnombre.getText();
        correo = txtcorreo.getText();
        contraseña = txtcontraseña.getText();
        alcaldia = Integer.parseInt(txtalcaldia.getText());
        
        FileInputStream archivou = new FileInputStream("archivoUsuario.dat");
        ObjectInputStream entrada = new ObjectInputStream(archivou);
        CrudUsuarios.listadepersonas = (ArrayList)entrada.readObject();
        id = (CrudUsuarios.listadepersonas.size() + 87) *5;
        
        JOptionPane.showMessageDialog(null, "Tu id es "+id);
        
        Usuario u = new UsuarioComun(nombre, contraseña, alcaldia, correo, id);
        CrudUsuarios crudu = new CrudUsuarios();
        crudu.guardarUsuario(u);
        
    }
    
    public void configurarventana2(){
        this.setTitle("ETHOY");
        this.setBounds(0, 0, 1400, 900);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0x27263A));
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes2();
    }
    public void iniciarComponentes2(){
        felicitacion = new JLabel();
        felicitacion.setText("<html><body><center>Registro exitoso.<br> Da click en el botón regresar para volver a la página principal</center></body></html>"); 
        felicitacion.setHorizontalAlignment(SwingConstants.CENTER);
        felicitacion.setBounds(0,245,1300,190);
        felicitacion.setForeground(new Color(187, 218, 252));
        felicitacion.setFont(new Font("Cooper Black",Font.PLAIN,28));
        felicitacion.setVisible(true);
        this.add(felicitacion);
        felicitacion.updateUI();
        
        regresar = new JButton();
        regresar.setText("<html><body><center>Regresar<br></center></body></html>");
        regresar.setForeground(new Color(197, 132, 255));
        regresar.setFont(new Font("Goudy Stout",Font.BOLD,20));
        regresar.setBorder(null);
        regresar.setBounds(450,480,440,70);
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
    
    private void txtnombreTyped(java.awt.event.KeyEvent evt) {                                    
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

         if (!(minusculas || mayusculas || espacio)){
            evt.consume();
        }
    }     
    
    private void txtalcaldiaTyped(java.awt.event.KeyEvent evt) {                                    
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros){
            evt.consume();
        }
        
        if(txtalcaldia.getText().length() >= 2){
            evt.consume();
        }
    }   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == guardar){
            try {
            obtenerDatos();
            this.getContentPane().removeAll();
            VentanaRegistro registro = new VentanaRegistro();
            registro.setVisible(true);
            this.setVisible(false);
            registro.configurarventana2();
            } catch (IOException ex) {
                Logger.getLogger(VentanaRegistro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VentanaRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }
            VentanaRegistroCompletado ventanafelicitacion = new VentanaRegistroCompletado();
            ventanafelicitacion.setVisible(true);
            this.setVisible(false);
            ventanafelicitacion.configurarventana();
        }else if(e.getSource() == regresar){
            VentanaInicio ventanamain = new VentanaInicio();
            ventanamain.setVisible(true);
            this.setVisible(false);
            ventanamain.configurarventana();
        }else if(e.getSource() == alcaldia2){
            VentanaCompiladoAlcaldias ventanaalcaldias = new VentanaCompiladoAlcaldias();
            ventanaalcaldias.setVisible(true);
            this.setVisible(false);
            ventanaalcaldias.configurarventana();
        }
    }
}
