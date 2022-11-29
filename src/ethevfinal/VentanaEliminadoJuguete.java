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

public class VentanaEliminadoJuguete extends JFrame implements ActionListener {
 
    private JLabel eliminado, fondito;
    private JButton salir;
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
        eliminado = new JLabel();
        eliminado.setText("<html><body><center>Juguete eliminado exitosamente.<br></center></body></html>"); 
        eliminado.setBounds(340,0,700,700);
        eliminado.setForeground(new Color(39, 38, 58));
        eliminado.setFont(new Font("Goudy Stout",Font.BOLD,40));
        eliminado.setVisible(true);
        this.add(eliminado);
        eliminado.updateUI();
        
        salir = new JButton();
        salir.setText("<html><body><center>Regresar al inicio.<br></center></body></html>");
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
        if(e.getSource() == salir){
            VentanaMenuAdmon ventanaadmon = new VentanaMenuAdmon();
            ventanaadmon.setVisible(true);
            this.setVisible(false);
            ventanaadmon.configurarventana();
        }
    }
}