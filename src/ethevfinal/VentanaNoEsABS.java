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
import javax.swing.SwingConstants;

/**
 *
 * @author USUARIO
 */
public class VentanaNoEsABS extends JFrame implements ActionListener{
    
    private JLabel pregunta, fondito;
    private JButton regresar;
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
        pregunta = new JLabel();
        pregunta.setText("<html><body><center>Lamentamos esto pero tu juguewte no es de ABS por lo que no puedes utilizar nuestra calculadora. <br> Excelente día.</center></body></html>"); 
        pregunta.setHorizontalAlignment(SwingConstants.CENTER);
        pregunta.setBounds(50,7,1300,290);
        pregunta.setForeground(new Color(164, 63, 255));
        pregunta.setFont(new Font("Goudy Stout",Font.PLAIN,40));
        pregunta.setVisible(true);
        this.add(pregunta);
        pregunta.updateUI();
        
        regresar = new JButton();
        regresar.setText("<html><body><center>Regresar a la pantalla de inicio.<br></center></body></html>");
        regresar.setForeground(new Color(197, 132, 255));
        regresar.setFont(new Font("Goudy Stout",Font.BOLD,20));
        regresar.setBorder(null);
        regresar.setBounds(475,400,440,100);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == regresar){
            VentanaPrincipal ventanaF = new VentanaPrincipal();
            ventanaF.setVisible(true);
            this.setVisible(false);
            ventanaF.configurarventana();
        }
    }
    
}
