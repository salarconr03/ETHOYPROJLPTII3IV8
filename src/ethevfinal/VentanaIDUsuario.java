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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaIDUsuario extends JFrame implements ActionListener {
 
    private JLabel id, fondito;
    private JTextField txtid;
    private ImageIcon fondo, flecha2;
    private JButton eliminar, regresar;
    
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
        
        id = new JLabel();
        id.setText("<html><body><center>Ingresa el nombre del juguete.<br></center></body></html>"); 
        id.setBounds(100,70,700,300);
        id.setForeground(new Color(39, 38, 58));
        id.setFont(new Font("Goudy Stout",Font.BOLD,25));
        id.setVisible(true);
        this.add(id);
        id.updateUI();
        txtid = new JTextField();
        txtid.setBounds(550, 200, 700, 30);
        txtid.setBackground(new Color(213, 128, 255));
        txtid.setBorder(null);
        txtid.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtid.setForeground(Color.BLACK);
        txtid.setVisible(true);
        this.add(txtid);
        txtid.updateUI();
        
        eliminar = new JButton();
        eliminar.setText("<html><body><center>Eliminar juguetes.<br></center></body></html>");
        eliminar.setForeground(new Color(197, 132, 255));
        eliminar.setFont(new Font("Goudy Stout",Font.BOLD,20));
        eliminar.setBorder(null);
        eliminar.setBounds(830,580,440,70);
        eliminar.setBackground(new Color(164, 63, 255));
        eliminar.setVisible(true);
        eliminar.addActionListener(this);
        this.add(eliminar);
        eliminar.updateUI();
        
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
            VentanaInicio ventana8 = new VentanaInicio();
            ventana8.setVisible(true);
            this.setVisible(true);
            ventana8.configurarventana();
        }
        
        int id = Integer.parseInt(txtid.getText());
        CrudUsuarios usu = new CrudUsuarios();
        try {
            Usuario usuarioseleccionado = usu.buscarPersona(id);
            if(usuarioseleccionado.getId() == 0){
                
            }else{
                usu.eliminarPersona(usuarioseleccionado);
            }
        } catch (IOException ex) {
            Logger.getLogger(VentanaIDUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaIDUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(e.getSource() == eliminar){
            VentanaEliminado eliminadoporfin = new VentanaEliminado();
            eliminadoporfin.setVisible(true);
            this.setVisible(false);
            eliminadoporfin.configurarventana();
        }
    }
    
}
