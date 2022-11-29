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

public class VentanaSiEsColeccion extends JFrame implements ActionListener{
    
    private JLabel aseveracion, fondito;
    private JButton registro;
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
        
        aseveracion = new JLabel();
        aseveracion.setText("<html><body><center>Tu juguete es de colección.  <br></center></body></html>"); 
        aseveracion.setBounds(100,450,700,100);
        aseveracion.setForeground(new Color(39, 38, 58));
        aseveracion.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        aseveracion.setVisible(true);
        this.add(aseveracion);
        aseveracion.updateUI();
        
        registro = new JButton();
        registro.setText("<html><body><center>Continuar.<br></center></body></html>");
        registro.setForeground(new Color(197, 132, 255));
        registro.setFont(new Font("Goudy Stout",Font.BOLD,20));
        registro.setBorder(null);
        registro.setBounds(700,600,440,70);
        registro.setBackground(new Color(164, 63, 255));
        registro.setVisible(true);
        registro.addActionListener(this);
        this.add(registro);
        registro.updateUI();
        
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
       
    }
}
