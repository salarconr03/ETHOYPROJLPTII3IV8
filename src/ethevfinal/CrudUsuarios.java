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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class CrudUsuarios extends JFrame implements ActionListener{
            
    public static ArrayList<Usuario> listadepersonas = new ArrayList<Usuario>();
    
    private JLabel nombre, contraseña, alcaldia, id, correo, fondito;
    private ImageIcon flecha2, fondo;
    private JButton  regresar;
    
    public void configurarventana(){
        this.setTitle("ETHOY");
        this.setBounds(0, 0, 1400, 900);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0x27263A));
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void leerUsuario() throws FileNotFoundException, IOException, ClassNotFoundException {
        
        FileInputStream archivou = new FileInputStream("archivoUsuario.dat");
        ObjectInputStream entrada = new ObjectInputStream(archivou);
        listadepersonas = (ArrayList)entrada.readObject();
        
        int o = 0;
        for(int i = 0; i<listadepersonas.size(); i++){
            //como voy recorriendo la lista vamos mostrandola
            Usuario usuario = listadepersonas.get(i);
            configurarventana();
            o = o+200;
            String al;
            switch (usuario.getAlcaldia()) {
                case 1:
                    al = "Azcapotzalco";
                    break;
                case 2:
                    al = "Álvaro Obregón";
                    break;
                case 3:
                    al = "Benito Juárez";
                    break;
                case 4:
                    al = "Cuajimalpa de Morelos";
                    break;
                case 5:
                    al = "Cuauhtémoc";
                    break;
                case 6:
                    al = "Gustavo A. Madero";
                    break;
                case 7:
                    al = "Coyoacán";
                    break;
                case 8:
                    al = "Iztacalco";
                    break;
                case 9:
                    al = "Iztapalapa";
                    break;
                case 10:
                    al = "Magdalena Contreras";
                    break;
                case 11:
                    al = "Miguel Hidalgo";
                    break;
                case 12:
                    al = "Milpa Alta";
                    break;
                case 13:
                    al = "Tlalpan";
                    break;
                case 14:
                    al = "Tláhuac";
                    break;
                case 15:
                    al = "Venustiano Carranza";
                    break;
                case 16:
                    al = "Xochimilco";
                    break;
                case 17:
                    al = "No vivo en la Ciudad de México";
                    break;
                default:
                    al = "No pusiste una alcaldía válida";
            }
            
            nombre = new JLabel();
            nombre.setText(usuario.getNombre()); 
            nombre.setBounds(10 + o, 60,1300,100);
            nombre.setForeground(new Color(187, 218, 252));
            nombre.setFont(new Font("Cooper Black",Font.PLAIN,25));
            nombre.setVisible(true);
            this.add(nombre);
            nombre.updateUI();
            
            contraseña = new JLabel();
            contraseña.setText(usuario.getContrasena()); 
            contraseña.setBounds(10 + o, 100,1300,100);
            contraseña.setForeground(new Color(187, 218, 252));
            contraseña.setFont(new Font("Cooper Black",Font.PLAIN,25));
            contraseña.setVisible(true);
            this.add(contraseña);
            contraseña.updateUI();
            
            alcaldia = new JLabel();
            alcaldia.setText(al); 
            alcaldia.setBounds(10 + o, 140,1300,100);
            alcaldia.setForeground(new Color(187, 218, 252));
            alcaldia.setFont(new Font("Cooper Black",Font.PLAIN,25));
            alcaldia.setVisible(true);
            this.add(alcaldia);
            alcaldia.updateUI();
            
            correo = new JLabel();
            correo.setText(usuario.getNombre()); 
            correo.setBounds(10 + o, 180,1300,100);
            correo.setForeground(new Color(187, 218, 252));
            correo.setFont(new Font("Cooper Black",Font.PLAIN,25));
            correo.setVisible(true);
            this.add(correo);
            correo.updateUI();
            
            id = new JLabel();
            id.setText("El ID: " + usuario.getId()); 
            id.setBounds(10 + o, 220,1300,100);
            id.setForeground(new Color(187, 218, 252));
            id.setFont(new Font("Cooper Black",Font.PLAIN,25));
            id.setVisible(true);
            this.add(id);
            id.updateUI();
        }
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
    public void guardarUsuario(Usuario p) throws IOException {
        //para guardar necesito la lista
        listadepersonas.add(p);
        guardar();
    }

    public Usuario buscarPersona(int id) throws IOException, ClassNotFoundException{
        
    Usuario encontrada = new UsuarioComun();
    FileInputStream archivou = new FileInputStream("archivoUsuario.dat");
    ObjectInputStream entrada = new ObjectInputStream(archivou);
    
        listadepersonas = (ArrayList)entrada.readObject();
        for(Usuario p : listadepersonas){
            if(id == p.getId()){
                encontrada = p;
            }else{
                
            }
        }
        return encontrada;
    }

    public void actualizarPersona(Usuario personaActualiza) throws IOException, ClassNotFoundException{

        Usuario personaaActualizar = buscarPersona(personaActualiza.getId());
        listadepersonas.remove(personaaActualizar);
        listadepersonas.add(personaActualiza);
        guardar();
    }
    
    public void eliminarPersona(Usuario personaEliminar) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        listadepersonas.remove(personaEliminar);
        guardar();
    }

    public void guardar() throws FileNotFoundException, IOException {
       FileOutputStream archivou = new FileOutputStream("archivoUsuario.dat");
       ObjectOutputStream salida = new ObjectOutputStream(archivou);
       salida.writeObject(listadepersonas);
       salida.close();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == regresar){
            VentanaMenuAdmon ventanamenu = new VentanaMenuAdmon();
            ventanamenu.setVisible(true);
            this.setVisible(false);
            ventanamenu.configurarventana();
        }
    }

    
}
