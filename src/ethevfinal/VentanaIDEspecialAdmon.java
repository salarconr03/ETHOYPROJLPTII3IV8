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
import java.awt.event.KeyAdapter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class VentanaIDEspecialAdmon extends JFrame implements ActionListener {

    private JLabel peticion, fondito;
    private JTextField txtpeticion;
    private JButton aceptar, regresar;
    private ImageIcon flecha2, fondo;
    
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
        peticion = new JLabel();
        peticion.setText("<html><body><center>Ingresa tu ID especial.<br></center></body></html>"); 
        peticion.setBounds(550, 170,1300,100);
        peticion.setForeground(new Color(187, 218, 252));
        peticion.setFont(new Font("Cooper Black",Font.PLAIN,25));
        peticion.setVisible(true);
        this.add(peticion);
        peticion.updateUI();
        txtpeticion = new JTextField();
        txtpeticion.setBounds(330, 310,700,35);
        txtpeticion.setBackground(new Color(213, 128, 255));
        txtpeticion.setBorder(null);
        txtpeticion.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtpeticion.setForeground(Color.BLACK);
        txtpeticion.setVisible(true);
        txtpeticion.addKeyListener(new KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpeticionTyped(evt);
            }
        });
        this.add(txtpeticion);
        txtpeticion.updateUI();
        
        aceptar = new JButton();
        aceptar.setText("<html><body><center>Entrar<br></center></body></html>");
        aceptar.setForeground(new Color(197, 132, 255));
        aceptar.setFont(new Font("Goudy Stout",Font.BOLD,20));
        aceptar.setBorder(null);
        aceptar.setBounds(450, 440,440,100);
        aceptar.setBackground(new Color(164, 63, 255));
        aceptar.setVisible(true);
        aceptar.addActionListener(this);
        this.add(aceptar);
        aceptar.updateUI();
        
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
        
        fondo = new ImageIcon("Fondo4.png");
        fondito = new JLabel();
        fondito.setBounds(0,0,1400,900);
        //fondito.setHorizontalAlignment(SwingConstants.CENTER);
        fondito.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(1400, 900, Image.SCALE_SMOOTH)));
        fondito.setVisible(true);
        this.add(fondito);
        fondito.updateUI();
    }
    
    private void txtpeticionTyped(java.awt.event.KeyEvent evt) {                                    
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros){
            evt.consume();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == aceptar){
            String code = txtpeticion.getText();
            if("260506".equals(code)){
                VentanaMenuAdmon ventanafelicitacion = new VentanaMenuAdmon();
                ventanafelicitacion.setVisible(true);
                this.setVisible(false);
                ventanafelicitacion.configurarventana();
            }else{
                JOptionPane.showMessageDialog(null, "Este no es un ID de administrador. Ingresa el ID correcto.");
            }
        }else if(e.getSource() == regresar){
            VentanaInicio ventanamain = new VentanaInicio();
            ventanamain.setVisible(true);
            this.setVisible(false);
            ventanamain.configurarventana();
        }
    }
    
}
    