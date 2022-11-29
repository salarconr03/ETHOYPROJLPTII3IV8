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
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VentanaInicioSesion extends JFrame implements ActionListener{

    private JButton administrador, usuario, regresar;
    private ImageIcon flecha2, fondo;
    private JLabel fondito;
    
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
        administrador = new JButton();
        administrador.setText("<html><body><center>Administrador<br></center></body></html>");
        administrador.setForeground(new Color(197, 132, 255));
        administrador.setFont(new Font("Goudy Stout",Font.BOLD,20));
        administrador.setBorder(null);
        administrador.setBounds(450,225,440,100);
        administrador.setBackground(new Color(164, 63, 255));
        administrador.setVisible(true);
        administrador.addActionListener(this);
        this.add(administrador);
        administrador.updateUI();
        
        usuario = new JButton();
        usuario.setText("<html><body><center>Usuario<br></center></body></html>");
        usuario.setForeground(new Color(197, 132, 255));
        usuario.setFont(new Font("Goudy Stout",Font.BOLD,20));
        usuario.setBorder(null);
        usuario.setBounds(450, 440,440,100);
        usuario.setBackground(new Color(164, 63, 255));
        usuario.setVisible(true);
        usuario.addActionListener(this);
        this.add(usuario);
        usuario.updateUI();
        
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == administrador){
            VentanaIDEspecialAdmon ventanaid = new VentanaIDEspecialAdmon();
            ventanaid.setVisible(true);
            this.setVisible(false);
            ventanaid.configurarventana();
        }else if(e.getSource() == usuario){
            VentanaEleccionUsuario ventanausuarioinicio = new VentanaEleccionUsuario();
            ventanausuarioinicio.setVisible(true);
            this.setVisible(false);
            ventanausuarioinicio.configurarventana();
        }else if(e.getSource() == regresar){
            VentanaInicio ventanamain = new VentanaInicio();
            ventanamain.setVisible(true);
            this.setVisible(false);
            ventanamain.configurarventana();
        }
    }
}
