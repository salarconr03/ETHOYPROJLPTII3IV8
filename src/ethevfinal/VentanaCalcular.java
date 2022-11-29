/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ethevfinal;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
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
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
public class VentanaCalcular extends JFrame implements ActionListener{
    
    
    CrudUsuarios crudu = new CrudUsuarios();
    CrudJuguetes crudj = new CrudJuguetes();
    Usuario nomemates = new UsuarioComun();
    private JLabel nombre, marca, peso, tiempo, fondito, id, contraseña, estado;
    private JTextField txtnombre, txtmarca, txtpeso, txttiempo, txtcontraeña, txtid, txtestado;
    private JButton calcular;
    private ImageIcon fondo;
    
    public void configurarventana() throws IOException, ClassNotFoundException{
        this.setTitle("ETHOY");
        this.setBounds(0, 0, 1400, 900);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0x27263A));
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    
    public void iniciarComponentes() throws IOException, ClassNotFoundException{
        
        id = new JLabel();
        id.setText("<html><body><center>Ingresa tu id de usuario.<br></center></body></html>"); 
        id.setBounds(100,70,700,100);
        id.setForeground(new Color(39, 38, 58));
        id.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        id.setVisible(true);
        this.add(id);
        id.updateUI();
        txtid = new JTextField();
        txtid.setBounds(550, 70, 700, 30);
        txtid.setBackground(new Color(213, 128, 255));
        txtid.setBorder(null);
        txtid.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtid.setForeground(Color.BLACK);
        txtid.setVisible(true);
        this.add(txtid);
        txtid.updateUI();
        
        contraseña = new JLabel();
        contraseña.setText("<html><body><center>Ingresa tu contraseña.<br></center></body></html>"); 
        contraseña.setBounds(100,150,700,100);
        contraseña.setForeground(new Color(39, 38, 58));
        contraseña.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        contraseña.setVisible(true);
        this.add(contraseña);
        contraseña.updateUI();
        txtcontraeña = new JTextField();
        txtcontraeña.setBounds(550, 150, 700, 30);
        txtcontraeña.setBackground(new Color(213, 128, 255));
        txtcontraeña.setBorder(null);
        txtcontraeña.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtcontraeña.setForeground(Color.BLACK);
        txtcontraeña.setVisible(true);
        this.add(txtcontraeña);
        txtcontraeña.updateUI();
        
        nombre = new JLabel();
        nombre.setText("<html><body><center>Ingresa el nombre de tu juguete.<br></center></body></html>"); 
        nombre.setBounds(100,230,700,100);
        nombre.setForeground(new Color(39, 38, 58));
        nombre.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        nombre.setVisible(true);
        this.add(nombre);
        nombre.updateUI();
        txtnombre = new JTextField();
        txtnombre.setBounds(550, 230, 700, 30);
        txtnombre.setBackground(new Color(213, 128, 255));
        txtnombre.setBorder(null);
        txtnombre.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtnombre.setForeground(Color.BLACK);
        txtnombre.setVisible(true);
        this.add(txtnombre);
        txtnombre.updateUI();
        
        marca = new JLabel();
        marca.setText("<html><body><center>Ingresa la marca de tu juguete.<br></center></body></html>"); 
        marca.setBounds(100,310,700,100);
        marca.setForeground(new Color(39, 38, 58));
        marca.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        marca.setVisible(true);
        this.add(marca);
        marca.updateUI();
        txtmarca = new JTextField();
        txtmarca.setBounds(550, 310, 700, 30);
        txtmarca.setBackground(new Color(213, 128, 255));
        txtmarca.setBorder(null);
        txtmarca.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtmarca.setForeground(Color.BLACK);
        txtmarca.setVisible(true);
        this.add(txtmarca);
        txtmarca.updateUI();
        
        peso = new JLabel();
        peso.setText("<html><body><center>Ingresa el peso de tu juguete (en gramos).<br></center></body></html>"); 
        peso.setBounds(100,390,700,100);
        peso.setForeground(new Color(39, 38, 58));
        peso.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        peso.setVisible(true);
        this.add(peso);
        peso.updateUI();
        txtpeso = new JTextField();
        txtpeso.setBounds(550, 390, 700, 30);
        txtpeso.setBackground(new Color(213, 128, 255));
        txtpeso.setBorder(null);
        txtpeso.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtpeso.setForeground(Color.BLACK);
        txtpeso.setVisible(true);
        this.add(txtpeso);
        txtpeso.updateUI();
        
        tiempo = new JLabel();
        tiempo.setText("<html><body><center>Ingresa el tiempo que llevas con tu juguete (en años).<br></center></body></html>"); 
        tiempo.setBounds(100,470,700,100);
        tiempo.setForeground(new Color(39, 38, 58));
        tiempo.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        tiempo.setVisible(true);
        this.add(tiempo);
        tiempo.updateUI();
        txttiempo = new JTextField();
        txttiempo.setBounds(550, 470, 700, 30);
        txttiempo.setBackground(new Color(213, 128, 255));
        txttiempo.setBorder(null);
        txttiempo.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txttiempo.setForeground(Color.BLACK);
        txttiempo.setVisible(true);
        this.add(txttiempo);
        txttiempo.updateUI();
        
        estado = new JLabel();
        estado.setText("<html><body><center>Ingresa el estado de tu juguete ().<br></center></body></html>"); 
        estado.setBounds(100,550,700,100);
        estado.setForeground(new Color(39, 38, 58));
        estado.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        estado.setVisible(true);
        this.add(estado);
        estado.updateUI();
        txtestado = new JTextField();
        txtestado.setBounds(550, 550, 700, 30);
        txtestado.setBackground(new Color(213, 128, 255));
        txtestado.setBorder(null);
        txtestado.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtestado.setForeground(Color.BLACK);
        txtestado.setVisible(true);
        this.add(txtestado);
        txtestado.updateUI();
        
        calcular = new JButton();
        calcular.setText("<html><body><center>Calcular<br></center></body></html>");
        calcular.setForeground(new Color(197, 132, 255));
        calcular.setFont(new Font("Goudy Stout",Font.BOLD,20));
        calcular.setBorder(null);
        calcular.setBounds(890,600,440,70);
        calcular.setBackground(new Color(164, 63, 255));
        calcular.setVisible(true);
        calcular.addActionListener(this);
        this.add(calcular);
        calcular.updateUI();
        
        fondo = new ImageIcon("Fondo4.png");
        fondito = new JLabel();
        fondito.setBounds(0,0,1400,900);
        //fondito.setHorizontalAlignment(SwingConstants.CENTER);
        fondito.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(1400, 900, Image.SCALE_SMOOTH)));
        fondito.setVisible(true);
        this.add(fondito);
        fondito.updateUI();
        
        
        int id1 = Integer.parseInt(txtid.getText());
                String contra = txtcontraeña.getText();
        nomemates.setId(id1);
        nomemates.setContrasena(contra);
        
        
 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == calcular){
            try {
                calculo();
            } catch (IOException ex) {
                Logger.getLogger(VentanaCalcular.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VentanaCalcular.class.getName()).log(Level.SEVERE, null, ex);
            }
      
//this.getContentPane().removeAll();
            //VentanaCalcular ventanacal = new VentanaCalcular();
            //ventanacal.setVisible(true);
            //this.setVisible(false);
            /*try {
                ventanacal.configurarVentana2();
            } catch (IOException ex) {
                Logger.getLogger(VentanaCalcular.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VentanaCalcular.class.getName()).log(Level.SEVERE, null, ex);
}
        }
    }
    
    public void configurarVentana2() throws IOException, ClassNotFoundException{
        this.setTitle("ETHOY");
        this.setBounds(0, 0, 1400, 900);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0x27263A));
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculo();
    }
    
    public void calculo() throws IOException, ClassNotFoundException{
        
                int id1 = nomemates.getId();
                String contra = nomemates.getContrasena();
                
                Usuario seleccionado = crudu.buscarPersona(id1);
                
                if (seleccionado.getCorreo() == null){
                    //ventana error
                }else{
                    if (seleccionado.getContrasena().equals(contra)){
                        //usuraio se encontro y la contra es correcta
                        Juguete jugueteseleccionado = crudj.buscarJugueteE2(id1);
                        
                        int idj;
                        String util;
                        int estadojugueteusuario = Integer.parseInt(txtestado.getText());
                        int coleccion = jugueteseleccionado.getColeccion();
                        double estadojuguetecalculo;
                        double resultado;
                        double eu = 2.718281828;
                        
                        int peso = Integer.parseInt(txtpeso.getText());
                        int tiempo = Integer.parseInt(txttiempo.getText());
                        String nom = txtnombre.getText();
                        String marca = txtmarca.getText();
                        int cof = jugueteseleccionado.getColeccion();
                        
                        if(estadojugueteusuario == 1){
                            estadojuguetecalculo = 1.1;
                            
                            resultado = peso/Math.pow(eu, -(((tiempo * estadojuguetecalculo)*Math.log(2))/10) );
                            if(peso > resultado/2){
                                JOptionPane.showMessageDialog(null,"El juguete sigue siendo util");
                                util = "Sigue siendo util";
                                idj = seleccionado.getId();
                                
                                Juguete nuevojuguete = new JugueteN(marca, nom, util, idj, cof, peso, tiempo);
                                try {
                                    crudj.registrarJuguete(nuevojuguete);
                                } catch (IOException ex) {
                                    Logger.getLogger(VentanaCalcular.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,"El juguete ya no esta en buenas condiciones");
                                util = "Ya no es util";
                                idj = seleccionado.getId();
                                
                                Juguete nuevojuguete = new JugueteN(marca, nom, util, idj, cof, peso, tiempo);
                                try {
                                    crudj.registrarJuguete(nuevojuguete);
                                } catch (IOException ex) {
                                    Logger.getLogger(VentanaCalcular.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }else if(estadojugueteusuario == 2){
                            estadojuguetecalculo = 1.2;
                            resultado = peso/Math.pow(eu, -(((tiempo * estadojuguetecalculo)*Math.log(2))/10) );
                            if(peso > resultado/2){
                                JOptionPane.showMessageDialog(null,"El juguete sigue siendo util");
                                util = "Sigue siendo util";
                                idj = seleccionado.getId();
                                
                                Juguete nuevojuguete = new JugueteN(marca, nom, util, idj, cof, peso, tiempo);
                                try {
                                    crudj.registrarJuguete(nuevojuguete);
                                } catch (IOException ex) {
                                    Logger.getLogger(VentanaCalcular.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,"El juguete ya no esta en buenas condiciones");
                                util = "Ya no es util";
                                idj = seleccionado.getId();
                                
                                Juguete nuevojuguete = new JugueteN(marca, nom, util, idj, cof, peso, tiempo);
                                try {
                                    crudj.registrarJuguete(nuevojuguete);
                                } catch (IOException ex) {
                                    Logger.getLogger(VentanaCalcular.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }else if(estadojugueteusuario == 3){
                            estadojuguetecalculo = 1.3;
                            resultado = peso/Math.pow(eu, -(((tiempo * estadojuguetecalculo)*Math.log(2))/10) );
                            if(peso > resultado/2){
                                JOptionPane.showMessageDialog(null,"El juguete sigue siendo util");
                                util = "Sigue siendo util";
                                idj = seleccionado.getId();
                                
                                Juguete nuevojuguete = new JugueteN(marca, nom, util, idj, cof, peso, tiempo);
                                try {
                                    crudj.registrarJuguete(nuevojuguete);
                                } catch (IOException ex) {
                                    Logger.getLogger(VentanaCalcular.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,"El juguete ya no esta en buenas condiciones");
                                util = "Ya no es util";
                                idj = seleccionado.getId();
                                
                                Juguete nuevojuguete = new JugueteN(marca, nom, util, idj, cof, peso, tiempo);
                                try {
                                    crudj.registrarJuguete(nuevojuguete);
                                } catch (IOException ex) {
                                    Logger.getLogger(VentanaCalcular.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }else if(estadojugueteusuario == 4){
                            estadojuguetecalculo = 1.4;
                            resultado = peso/Math.pow(eu, -(((tiempo * estadojuguetecalculo)*Math.log(2))/10) );
                            if(peso > resultado/2){
                                JOptionPane.showMessageDialog(null,"El juguete sigue siendo util");
                                util = "Sigue siendo util";
                                idj = seleccionado.getId();
                                
                                Juguete nuevojuguete = new JugueteN(marca, nom, util, idj, cof, peso, tiempo);
                                try {
                                    crudj.registrarJuguete(nuevojuguete);
                                } catch (IOException ex) {
                                    Logger.getLogger(VentanaCalcular.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,"El juguete ya no esta en buenas condiciones");
                                util = "Ya no es util";
                                idj = seleccionado.getId();
                                
                                Juguete nuevojuguete = new JugueteN(marca, nom, util, idj, cof, peso, tiempo);
                                try {
                                    crudj.registrarJuguete(nuevojuguete);
                                } catch (IOException ex) {
                                    Logger.getLogger(VentanaCalcular.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }else if(estadojugueteusuario == 5){
                            
                            JOptionPane.showMessageDialog(null,"El juguete ya no esta en buenas condiciones");
                            util = "Ya no es util";
                            idj = seleccionado.getId();
                            
                            Juguete nuevojuguete = new JugueteN(marca, nom, util, idj, cof, peso, tiempo);
                            try { 
                                crudj.registrarJuguete(nuevojuguete);
                            } catch (IOException ex) {
                                Logger.getLogger(VentanaCalcular.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                    }else{
                        //ventana contrasena incorrecta con boton regresar al procrso de registrar juguete
                    }        
                }
        fondo = new ImageIcon("Fondo4.png");
        fondito = new JLabel();
        fondito.setBounds(0,0,1400,900);
        //fondito.setHorizontalAlignment(SwingConstants.CENTER);
        fondito.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(1400, 900, Image.SCALE_SMOOTH)));
        fondito.setVisible(true);
        this.add(fondito);
        fondito.updateUI();
    }
    
}
*/