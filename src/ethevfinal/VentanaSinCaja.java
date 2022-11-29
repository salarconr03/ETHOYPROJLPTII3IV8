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

/**
 *
 * @author USUARIO
 */
public class VentanaSinCaja extends JFrame implements ActionListener{
    
    private JLabel flota, brilla, textura, fondito;
    private JTextField txtflota, txtbrilla, txttextura;
    private JButton validar;
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
        flota = new JLabel();
        flota.setText("<html><body><center>¿Tu juguete flota en el agua?(Escriba si o no)<br></center></body></html>"); 
        flota.setBounds(20,110,700,100);
        flota.setForeground(new Color(39, 38, 58));
        flota.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        flota.setVisible(true);
        this.add(flota);
        flota.updateUI();
        txtflota = new JTextField();
        txtflota.setBounds(550, 150, 700, 30);
        txtflota.setBackground(new Color(213, 128, 255));
        txtflota.setBorder(null);
        txtflota.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtflota.setForeground(Color.BLACK);
        txtflota.setVisible(true);
        this.add(txtflota);
        txtflota.updateUI();
        
        brilla = new JLabel();
        brilla.setText("<html><body><center>Al colocar tu juguete al sol, este refleja <br>la luz y brilla mucho?(Escriba si o no)<br></center></body></html>"); 
        brilla.setBounds(100,260,700,100);
        brilla.setForeground(new Color(39, 38, 58));
        brilla.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        brilla.setVisible(true);
        this.add(brilla);
        brilla.updateUI();
        txtbrilla = new JTextField();
        txtbrilla.setBounds(550, 300, 700, 30);
        txtbrilla.setBackground(new Color(213, 128, 255));
        txtbrilla.setBorder(null);
        txtbrilla.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtbrilla.setForeground(Color.BLACK);
        txtbrilla.setVisible(true);
        this.add(txtbrilla);
        txtbrilla.updateUI();
        
        textura = new JLabel();
        textura.setText("<html><body><center>¿La textura de tu juguete es lisa?(Escriba si o no)<br></center></body></html>"); 
        textura.setBounds(10,470,700,100);
        textura.setForeground(new Color(39, 38, 58));
        textura.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        textura.setVisible(true);
        this.add(textura);
        textura.updateUI();
        txttextura = new JTextField();
        txttextura.setBounds(550, 500, 700, 30);
        txttextura.setBackground(new Color(213, 128, 255));
        txttextura.setBorder(null);
        txttextura.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txttextura.setForeground(Color.BLACK);
        txttextura.setVisible(true);
        this.add(txttextura);
        txttextura.updateUI();
        
        validar = new JButton();
        validar.setText("<html><body><center>Validar<br></center></body></html>");
        validar.setForeground(new Color(197, 132, 255));
        validar.setFont(new Font("Goudy Stout",Font.BOLD,20));
        validar.setBorder(null);
        validar.setBounds(890,600,440,70);
        validar.setBackground(new Color(164, 63, 255));
        validar.setVisible(true);
        validar.addActionListener(this);
        this.add(validar);
        validar.updateUI();
        
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
        
        String flota = txtflota.getText();
        String brilla = txtbrilla.getText();
        String textura = txttextura.getText();
        int b1, b2, b3, bf;
        if(flota.equalsIgnoreCase("si")){
            b1 = 1;
        }else{
            b1 = 0;
        }
        
        if(brilla.equalsIgnoreCase("si")){
            b2 = 1;
        }else{
            b2 = 0;
        }
        
        if(textura.equalsIgnoreCase("si")){
            b3 = 1;
        }else{
            b3 = 0;
        }
        bf = b1 + b2 + b3;
        if(bf == 2 || bf == 3){
            VentanaSiesABSNoColeccion ventanasi = new VentanaSiesABSNoColeccion();
            ventanasi.setVisible(true);
            this.setVisible(false);
            ventanasi.configurarventana();

        }else{
            VentanaNoEsABS ventanano = new VentanaNoEsABS();
            ventanano.setVisible(true);
            this.setVisible(false);
            ventanano.configurarventana();
        }
    }
}
