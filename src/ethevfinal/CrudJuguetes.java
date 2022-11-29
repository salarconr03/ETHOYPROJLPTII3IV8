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
import java.io.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CrudJuguetes extends JFrame implements ActionListener{
public static ArrayList<Juguete> listadeJuguete = new ArrayList<Juguete>();

    private JLabel nombre, marca, tiempo, id, peso, fondito, coleccion;
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
    public void registrarJuguete(Juguete p) throws IOException{
        listadeJuguete.add(p);
        guardar();
    }
    
    public Juguete buscarJugueteE(String nombre, int id) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        Juguete encontrada = new JugueteN();
        FileInputStream archivoj = new FileInputStream("archivoJuguete.dat");
        ObjectInputStream entrada = new ObjectInputStream(archivoj);
        listadeJuguete = (ArrayList)entrada.readObject();
        for(Juguete p : listadeJuguete){
            if(nombre.equals(p.getNombrejuguete()) & id == p.getId()){
                encontrada = p;
            }else{
                
            }
        }
        return encontrada;
    }
    
    public Juguete buscarJugueteE2( int id) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        Juguete encontrada = new JugueteN();
        FileInputStream archivoj = new FileInputStream("archivoJuguete.dat");
        ObjectInputStream entrada = new ObjectInputStream(archivoj);
        listadeJuguete = (ArrayList)entrada.readObject();
        for(Juguete p : listadeJuguete){
            if(id == p.getId()){
                encontrada = p;
            }else{
                
            }
        }
        return encontrada;
    }

     public void buscarJuguete2(int id) throws IOException, ClassNotFoundException{
        
       Juguete encontrado = new JugueteN();
       FileInputStream archivoj = new FileInputStream("archivoJuguete.dat");
       ObjectInputStream entrada = new ObjectInputStream(archivoj);
       listadeJuguete = (ArrayList)entrada.readObject();
       
       for(Juguete p : listadeJuguete){
            if(id== p.getId()){
               encontrado = p;
               
            }else{
                
            }
            JOptionPane.showMessageDialog(null, "\n"+
            "El nombre del juguete: " + encontrado.getNombrejuguete()+"\n"+
            "La marca del juguete: "+ encontrado.getMarca()+"\n"+
            "El peso del juguete: "+ encontrado.getPeso()+"\n"+
            "El tiempo que ha tenido el juguete: "+encontrado.getTiempo()+"\n"+
            "El id del juguete: "+encontrado.getId()+"\n"+
            "La utilidad del juguete: "+ encontrado.getUtil()
            +"\n"+"El porcentaje de coleccion: "+encontrado.getColeccion());
        }
    }

    public void eliminarJuguete(Juguete JugueteEliminar) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        listadeJuguete.remove(JugueteEliminar);
        guardar();
    }
    
        public void leerJuguete() throws FileNotFoundException, IOException, ClassNotFoundException {

            FileInputStream archivoj = new FileInputStream("archivoJuguete.dat");
            ObjectInputStream entrada = new ObjectInputStream(archivoj);
            listadeJuguete = (ArrayList)entrada.readObject();
            int o = 0;
            for(int i = 0; i<listadeJuguete.size(); i++){
                Juguete juguete = listadeJuguete.get(i);
                configurarventana();
                o = o+200;
                
                System.out.println("hola");
                nombre = new JLabel();
                nombre.setText(juguete.getNombrejuguete()); 
                nombre.setBounds(10 + o, 60,1300,100);
                nombre.setForeground(new Color(187, 218, 252));
                nombre.setFont(new Font("Cooper Black",Font.PLAIN,25));
                nombre.setVisible(true);
                this.add(nombre);
                nombre.updateUI();
            
                marca = new JLabel();
                marca.setText(juguete.getMarca()); 
                marca.setBounds(10 + o, 100,1300,100);
                marca.setForeground(new Color(187, 218, 252));
                marca.setFont(new Font("Cooper Black",Font.PLAIN,25));
                marca.setVisible(true);
                this.add(marca);
                marca.updateUI();
            
                peso = new JLabel();
                peso.setText("El peso es: " + juguete.getPeso()); 
                peso.setBounds(10 + o, 140,1300,100);
                peso.setForeground(new Color(187, 218, 252));
                peso.setFont(new Font("Cooper Black",Font.PLAIN,25));
                peso.setVisible(true);
                this.add(peso);
                peso.updateUI();
            
                tiempo = new JLabel();
                tiempo.setText("El tiempo que ha tenido el juguet es: " + juguete.getTiempo());
                tiempo.setBounds(10 + o, 180,1300,100);
                tiempo.setForeground(new Color(187, 218, 252));
                tiempo.setFont(new Font("Cooper Black",Font.PLAIN,25));
                tiempo.setVisible(true);
                this.add(tiempo);
                tiempo.updateUI();
            
                id = new JLabel();
                id.setText("El ID: " + juguete.getId()); 
                id.setBounds(10 + o, 220,1300,100);
                id.setForeground(new Color(187, 218, 252));
                id.setFont(new Font("Cooper Black",Font.PLAIN,25));
                id.setVisible(true);
                this.add(id);
                id.updateUI();
                
                coleccion = new JLabel();
                coleccion.setText("El porcentaje de colección: " + juguete.getColeccion()); 
                coleccion.setBounds(10 + o, 220,1300,100);
                coleccion.setForeground(new Color(187, 218, 252));
                coleccion.setFont(new Font("Cooper Black",Font.PLAIN,25));
                coleccion.setVisible(true);
                this.add(coleccion);
                coleccion.updateUI();

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

    private void guardar() throws FileNotFoundException, IOException {
        
       FileOutputStream archivoj = new FileOutputStream("archivoJuguete.dat");
       ObjectOutputStream salida = new ObjectOutputStream(archivoj);
       salida.writeObject(listadeJuguete);
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
