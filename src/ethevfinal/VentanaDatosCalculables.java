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


public class VentanaDatosCalculables extends JFrame implements ActionListener{
    
    private JLabel id, contraseña, fondito;
    private JTextField txtcontraeña, txtid;
    private JButton continuar;
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
        
        
        continuar = new JButton();
        continuar.setText("<html><body><center>Calcular<br></center></body></html>");
        continuar.setForeground(new Color(197, 132, 255));
        continuar.setFont(new Font("Goudy Stout",Font.BOLD,20));
        continuar.setBorder(null);
        continuar.setBounds(890,600,440,70);
        continuar.setBackground(new Color(164, 63, 255));
        continuar.setVisible(true);
        continuar.addActionListener(this);
        this.add(continuar);
        continuar.updateUI();
        
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
       
    /**
     *usuario seleccionado = crudu.buscarusuario(id)
     * if(seleccionado.getcorreo = null){
     * Error pantalla
     * }else{
     * int id = seleccionado.getid
     * Abajo de jugute prueba crear 
     * Usuario prueba = new usuarioComun();
     * 
     * pruaba.setId(id), abajo del int Id.
     * @author USUARIO
     */

        
    }
    
}
