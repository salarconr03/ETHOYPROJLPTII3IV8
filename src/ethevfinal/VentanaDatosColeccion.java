
package ethevfinal;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class VentanaDatosColeccion extends JFrame implements ActionListener{
    
    Juguete prueba = new JugueteN();
    Usuario prueba2 = new UsuarioComun();
    CrudUsuarios crudu = new CrudUsuarios();
    CrudJuguetes crudj = new CrudJuguetes();
    Usuario nomemates = new UsuarioComun();
    Juguete porfafunciona = new JugueteN();
    
    private JLabel sacado, estado, pelicula, defecto, limitado, fondito, porcentaje, impresion, id, contraseña, nombre, marca, peso, tiempo;
    private JTextField txtsacdo, txtestado, txtpelicual, txtdefecto, txtlimitada, txtid, txtcontraeña, txtnombre, txtmarca, txtpeso, txttiempo;
    private JButton validar, regresar, continuar, calcular, continuar2;
    private ImageIcon fondo, flecha2;
    
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
        
        sacado = new JLabel();
        sacado.setText("<html><body><center>¿Alguna vez has sacado tu juguete de su caja?(Si o <br>no)<br></center></body></html>"); 
        sacado.setBounds(10,0,700,100);
        sacado.setForeground(new Color(39, 38, 58));
        sacado.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        sacado.setVisible(true);
        this.add(sacado);
        sacado.updateUI();
        txtsacdo = new JTextField();
        txtsacdo.setBounds(600, 40, 700, 30);
        txtsacdo.setBackground(new Color(213, 128, 255));
        txtsacdo.setBorder(null);
        txtsacdo.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtsacdo.setForeground(Color.BLACK);
        txtsacdo.setVisible(true);
        this.add(txtsacdo);
        txtsacdo.updateUI();
        txtsacdo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                txtsacdoKeyTyped(evt);
            }
        });
        
        estado = new JLabel();
        estado.setText("<html><body><center>¿Cuál es el estado de la caja?<br>1. La caja de mi juguete se encuentra en perfectas condiciones<br>2.La caja de mi juguete esta en condiciones decentes (solo algunas rasgaduras y esta un poco despintada)<br>3 La caja de mi juguete esta maltratada (deformidades, rasgaduras, esta despintada, entre otras)</center></body></html>"); 
        estado.setBounds(10,360,700,200);
        estado.setForeground(new Color(39, 38, 58));
        estado.setFont(new Font("Bradley Hand ITC",Font.BOLD,20));
        estado.setVisible(true);
        this.add(estado);
        estado.updateUI();
        txtestado = new JTextField();
        txtestado.setBounds(700, 400, 600, 30);
        txtestado.setBackground(new Color(213, 128, 255));
        txtestado.setBorder(null);
        txtestado.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtestado.setForeground(Color.BLACK);
        txtestado.setVisible(true);
        this.add(txtestado);
        txtestado.updateUI();
        txtestado.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                txtestadoKeyTyped(evt);
            }
        });
        
        pelicula = new JLabel();
        pelicula.setText("<html><body><center>¿Tu juguete pertenece a alguna serie, película, cómic u otro contenido famoso?(Si o no)<br></center></body></html>"); 
        pelicula.setBounds(0,90,600,100);
        pelicula.setForeground(new Color(39, 38, 58));
        pelicula.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        pelicula.setVisible(true);
        this.add(pelicula);
        pelicula.updateUI();
        txtpelicual = new JTextField();
        txtpelicual.setBounds(600, 130, 700, 30);
        txtpelicual.setBackground(new Color(213, 128, 255));
        txtpelicual.setBorder(null);
        txtpelicual.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtpelicual.setForeground(Color.BLACK);
        txtpelicual.setVisible(true);
        this.add(txtpelicual);
        txtpelicual.updateUI();
        txtpelicual.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                txtpelicualKeyTyped(evt);
            }
        });
        
        defecto = new JLabel();
        defecto.setText("<html><body><center>¿Tu juguete tiene algún defecto de fábrica? <br>(cambios de color, diseño distinto entre otros)(Si o <br>no).<br></center></body></html>"); 
        defecto.setBounds(10,270,700,100);
        defecto.setForeground(new Color(39, 38, 58));
        defecto.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        defecto.setVisible(true);
        this.add(defecto);
        defecto.updateUI();
        txtdefecto = new JTextField();
        txtdefecto.setBounds(600, 310, 700, 30);
        txtdefecto.setBackground(new Color(213, 128, 255));
        txtdefecto.setBorder(null);
        txtdefecto.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtdefecto.setForeground(Color.BLACK);
        txtdefecto.setVisible(true);
        this.add(txtdefecto);
        txtdefecto.updateUI();
        txtdefecto.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                txtdefectoKeyTyped(evt);
            }
        });
        
        limitado = new JLabel();
        limitado.setText("<html><body><center>¿Tu juguete es de edición límitada? (Normalmente lo <br>dice en la caja)(Si o no).<br></center></body></html>"); 
        limitado.setBounds(10,170,700,100);
        limitado.setForeground(new Color(39, 38, 58));
        limitado.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        limitado.setVisible(true);
        this.add(limitado);
        limitado.updateUI();
        txtlimitada = new JTextField();
        txtlimitada.setBounds(600, 210, 700, 30);
        txtlimitada.setBackground(new Color(213, 128, 255));
        txtlimitada.setBorder(null);
        txtlimitada.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtlimitada.setForeground(Color.BLACK);
        txtlimitada.setVisible(true);
        this.add(txtlimitada);
        txtlimitada.updateUI();
        txtlimitada.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                txtlimitadaKeyTyped(evt);
            }
        });
        
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
    
     public void configurarventana7(){
            this.setTitle("ETHOY");
            this.setBounds(0, 0, 1400, 900);
            this.setLocationRelativeTo(null);
            this.getContentPane().setBackground(new Color(0x27263A));
            this.setVisible(true);
            this.setLayout(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciarComponentes7();  
    }
    public void iniciarComponentes7(){
        estado = new JLabel();
        estado.setText("<html><body><center>Procederemos a realizar preguntas específicas para calcular la utilidad de su juguete.<br></center></body></html>"); 
        estado.setBounds(100,550,700,100);
        estado.setForeground(new Color(39, 38, 58));
        estado.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        estado.setVisible(true);
        this.add(estado);
        estado.updateUI();
        
        continuar2 = new JButton();
        continuar2.setText("<html><body><center>Continuar<br></center></body></html>");
        continuar2.setForeground(new Color(197, 132, 255));
        continuar2.setFont(new Font("Goudy Stout",Font.BOLD,20));
        continuar2.setBorder(null);
        continuar2.setBounds(890,600,440,70);
        continuar2.setBackground(new Color(164, 63, 255));
        continuar2.setVisible(true);
        continuar2.addActionListener(this);
        this.add(continuar2);
        continuar2.updateUI();
        
        fondo = new ImageIcon("Fondo4.png");
        fondito = new JLabel();
        fondito.setBounds(0,0,1400,900);
        //fondito.setHorizontalAlignment(SwingConstants.CENTER);
        fondito.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(1400, 900, Image.SCALE_SMOOTH)));
        fondito.setVisible(true);
        this.add(fondito);
        fondito.updateUI();
        
    }

    public void txtsacdoKeyTyped(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();
        boolean mayusculas = key == 83;
        boolean mayusculai = key == 73; 
        boolean mayusculan = key == 78; 
        boolean mayusculao= key == 79;
        boolean minusculas = key == 115;
        boolean minusculai = key == 105;
        boolean minusculan = key == 110;
        boolean minusculao = key == 111;
        if(!(mayusculas || mayusculai || mayusculan || mayusculao || minusculas || minusculai || minusculan || minusculao)){
            evt.consume();
        }
        
        if(txtsacdo.getText().length()>=2){
            evt.consume();
        }
    }
    
    public void txtestadoKeyTyped(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros)
        {
            evt.consume();
        }

        if (txtestado.getText().length() >= 1) {
            evt.consume();
        }
    }
    
    public void txtdefectoKeyTyped(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();
        boolean mayusculas = key == 83;
        boolean mayusculai = key == 73; 
        boolean mayusculan = key == 78; 
        boolean mayusculao= key == 79;
        boolean minusculas = key == 115;
        boolean minusculai = key == 105;
        boolean minusculan = key == 110;
        boolean minusculao = key == 111;
        if(!(mayusculas || mayusculai || mayusculan || mayusculao || minusculas || minusculai || minusculan || minusculao)){
            evt.consume();
        }
        
        if(txtdefecto.getText().length()>=2){
            evt.consume();
        }
    }
    
    public void txtlimitadaKeyTyped(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();
        boolean mayusculas = key == 83;
        boolean mayusculai = key == 73; 
        boolean mayusculan = key == 78; 
        boolean mayusculao= key == 79;
        boolean minusculas = key == 115;
        boolean minusculai = key == 105;
        boolean minusculan = key == 110;
        boolean minusculao = key == 111;
        if(!(mayusculas || mayusculai || mayusculan || mayusculao || minusculas || minusculai || minusculan || minusculao)){
            evt.consume();
        }
        
        if(txtlimitada.getText().length()>=2){
            evt.consume();
        }
    }
    
    public void txtpelicualKeyTyped(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();
        boolean mayusculas = key == 83;
        boolean mayusculai = key == 73; 
        boolean mayusculan = key == 78; 
        boolean mayusculao= key == 79;
        boolean minusculas = key == 115;
        boolean minusculai = key == 105;
        boolean minusculan = key == 110;
        boolean minusculao = key == 111;
        if(!(mayusculas || mayusculai || mayusculan || mayusculao || minusculas || minusculai || minusculan || minusculao)){
            evt.consume();
        }
        
        if(txtpelicual.getText().length()>=2){
            evt.consume();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
    
        if(e.getSource() == validar){
             String sacado = txtsacdo.getText();
        String estado = txtestado.getText();
        String pelicula = txtpelicual.getText();
        String defecto = txtdefecto.getText();
        String limitada = txtlimitada.getText();
        int b1, b2, b3, b4, b5, bf;
        if(sacado.equalsIgnoreCase("no")){
            b1 = 30;
        }else{
            b1 = 0;
        }
        
        b2 = Integer.parseInt(estado);
        switch(b2){
            case 1:
                b2 = 20;
                break;
            case 2:
                b2 = 5;
                break;
            case 3:
                b2 = 0;
                break;
            default:
                b2 = 0;
                break;
        }
        
        if(pelicula.equalsIgnoreCase("si")){
            b3 = 10;
        }else{
            b3 = 0;
        }
        
        if(defecto.equalsIgnoreCase("si")){
            b4 = 10;
        }else{
            b4 = 0;
        }
        
        if(limitada.equalsIgnoreCase("si")){
            b5 = 10;
        }else{
            b5 = 0;
        }
        bf = b1 + b2 + b3 + b4 + b5;
        porfafunciona.setColeccion(bf);
        
            this.getContentPane().removeAll();
            this.setTitle("ETHOY");
            this.setBounds(0, 0, 1400, 900);
            this.setLocationRelativeTo(null);
            this.getContentPane().setBackground(new Color(0x27263A));
            this.setVisible(true);
            this.setLayout(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciarComponentes2();
        }
        if(e.getSource() == continuar){
            this.getContentPane().removeAll();
            this.setTitle("ETHOY");
            this.setBounds(0, 0, 1400, 900);
            this.setLocationRelativeTo(null);
            this.getContentPane().setBackground(new Color(0x27263A));
            this.setVisible(true);
            this.setLayout(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciarComponentesH();    
        }
         if(e.getSource() == continuar2){
             porfafunciona.setColeccion(0);
            this.getContentPane().removeAll();
            this.setTitle("ETHOY");
            this.setBounds(0, 0, 1400, 900);
            this.setLocationRelativeTo(null);
            this.getContentPane().setBackground(new Color(0x27263A));
            this.setVisible(true);
            this.setLayout(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciarComponentesH();    
        }
        if(e.getSource() == calcular){
            try {
                calculo();
            } catch (IOException ex) {
                Logger.getLogger(VentanaDatosColeccion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VentanaDatosColeccion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }          
    public void iniciarComponentes2(){
        
        porcentaje = new JLabel();
        porcentaje.setText("<html><body><center>El porcentaje de colección es: <br></center></body></html>"); 
        porcentaje.setBounds(250,350,700,100);
        porcentaje.setForeground(new Color(39, 38, 58));
        porcentaje.setFont(new Font("Goudy Stout",Font.PLAIN,40));
        porcentaje.setVisible(true);
        this.add(porcentaje);
        porcentaje.updateUI();
        
        impresion = new JLabel();
        impresion.setText( "" + porfafunciona.getColeccion());
        impresion.setBounds(1050,350,700,100);
        impresion.setForeground(new Color(39, 38, 58));
        impresion.setFont(new Font("Goudy Stout",Font.PLAIN,50));
        impresion.setVisible(true);
        this.add(impresion);
        impresion.updateUI();
              
        fondo = new ImageIcon("Fondo4.png");
        fondito = new JLabel();
        fondito.setBounds(0,0,1400,900);
        //fondito.setHorizontalAlignment(SwingConstants.CENTER);
        fondito.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(1400, 900, Image.SCALE_SMOOTH)));
        fondito.setVisible(true);
        this.add(fondito);
        fondito.updateUI();
        
        flecha2 = new ImageIcon("Retroceder.png");
        regresar = new JButton();
        regresar.setBounds(0,600,170,170);
        Icon bouton = new ImageIcon(flecha2.getImage().getScaledInstance(regresar.getWidth(), regresar.getHeight(), Image.SCALE_DEFAULT));
        regresar.setIcon(bouton);
        regresar.setBackground(new Color(103, 100, 166));
        regresar.setVisible(true);
        regresar.addActionListener(this);
        this.add(regresar);
        regresar.updateUI();
        regresar.setBorder(null);
        
        continuar = new JButton();
        continuar.setText("<html><body><center>Continuar<br></center></body></html>");
        continuar.setForeground(new Color(197, 132, 255));
        continuar.setFont(new Font("Goudy Stout",Font.BOLD,20));
        continuar.setBorder(null);
        continuar.setBounds(890,600,440,70);
        continuar.setBackground(new Color(164, 63, 255));
        continuar.setVisible(true);
        continuar.addActionListener(this);
        this.add(continuar);
        continuar.updateUI();
    }
    
   
    
    public void iniciarComponentesH(){
        
        id = new JLabel();
        id.setText("<html><body><center>Ingresa tu id de usuario.<br></center></body></html>"); 
        id.setBounds(100,70,700,100);
        id.setForeground(new Color(39, 38, 58));
        id.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        id.setVisible(true);
        this.add(id);
        id.updateUI();
        txtid = new JTextField();
        txtid.setBounds(550, 70, 700, 30);
        txtid.setBackground(new Color(213, 128, 255));
        txtid.setBorder(null);
        txtid.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtid.setForeground(Color.BLACK);
        txtid.setVisible(true);
        this.add(txtid);
        txtid.updateUI();
        
        contraseña = new JLabel();
        contraseña.setText("<html><body><center>Ingresa tu contraseña.<br></center></body></html>"); 
        contraseña.setBounds(100,150,700,100);
        contraseña.setForeground(new Color(39, 38, 58));
        contraseña.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        contraseña.setVisible(true);
        this.add(contraseña);
        contraseña.updateUI();
        txtcontraeña = new JTextField();
        txtcontraeña.setBounds(550, 150, 700, 30);
        txtcontraeña.setBackground(new Color(213, 128, 255));
        txtcontraeña.setBorder(null);
        txtcontraeña.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtcontraeña.setForeground(Color.BLACK);
        txtcontraeña.setVisible(true);
        this.add(txtcontraeña);
        txtcontraeña.updateUI();
        
        nombre = new JLabel();
        nombre.setText("<html><body><center>Ingresa el nombre de tu juguete.<br></center></body></html>"); 
        nombre.setBounds(100,230,700,100);
        nombre.setForeground(new Color(39, 38, 58));
        nombre.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        nombre.setVisible(true);
        this.add(nombre);
        nombre.updateUI();
        txtnombre = new JTextField();
        txtnombre.setBounds(550, 230, 700, 30);
        txtnombre.setBackground(new Color(213, 128, 255));
        txtnombre.setBorder(null);
        txtnombre.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtnombre.setForeground(Color.BLACK);
        txtnombre.setVisible(true);
        this.add(txtnombre);
        txtnombre.updateUI();
        
        marca = new JLabel();
        marca.setText("<html><body><center>Ingresa la marca de tu juguete.<br></center></body></html>"); 
        marca.setBounds(100,310,700,100);
        marca.setForeground(new Color(39, 38, 58));
        marca.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        marca.setVisible(true);
        this.add(marca);
        marca.updateUI();
        txtmarca = new JTextField();
        txtmarca.setBounds(550, 310, 700, 30);
        txtmarca.setBackground(new Color(213, 128, 255));
        txtmarca.setBorder(null);
        txtmarca.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtmarca.setForeground(Color.BLACK);
        txtmarca.setVisible(true);
        this.add(txtmarca);
        txtmarca.updateUI();
        
        peso = new JLabel();
        peso.setText("<html><body><center>Ingresa el peso de tu juguete (en gramos).<br></center></body></html>"); 
        peso.setBounds(100,390,700,100);
        peso.setForeground(new Color(39, 38, 58));
        peso.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        peso.setVisible(true);
        this.add(peso);
        peso.updateUI();
        txtpeso = new JTextField();
        txtpeso.setBounds(550, 390, 700, 30);
        txtpeso.setBackground(new Color(213, 128, 255));
        txtpeso.setBorder(null);
        txtpeso.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtpeso.setForeground(Color.BLACK);
        txtpeso.setVisible(true);
        this.add(txtpeso);
        txtpeso.updateUI();
        
        tiempo = new JLabel();
        tiempo.setText("<html><body><center>Ingresa el tiempo que llevas con tu juguete (en años).<br></center></body></html>"); 
        tiempo.setBounds(100,470,700,100);
        tiempo.setForeground(new Color(39, 38, 58));
        tiempo.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        tiempo.setVisible(true);
        this.add(tiempo);
        tiempo.updateUI();
        txttiempo = new JTextField();
        txttiempo.setBounds(550, 470, 700, 30);
        txttiempo.setBackground(new Color(213, 128, 255));
        txttiempo.setBorder(null);
        txttiempo.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txttiempo.setForeground(Color.BLACK);
        txttiempo.setVisible(true);
        this.add(txttiempo);
        txttiempo.updateUI();
        
        estado = new JLabel();
        estado.setText("<html><body><center>Ingresa el estado de tu juguete ().<br></center></body></html>"); 
        estado.setBounds(100,550,700,100);
        estado.setForeground(new Color(39, 38, 58));
        estado.setFont(new Font("Bradley Hand ITC",Font.BOLD,25));
        estado.setVisible(true);
        this.add(estado);
        estado.updateUI();
        txtestado = new JTextField();
        txtestado.setBounds(550, 550, 700, 30);
        txtestado.setBackground(new Color(213, 128, 255));
        txtestado.setBorder(null);
        txtestado.setFont(new Font("Times New Roman",Font.PLAIN,15));
        txtestado.setForeground(Color.BLACK);
        txtestado.setVisible(true);
        this.add(txtestado);
        txtestado.updateUI();
        
        calcular = new JButton();
        calcular.setText("<html><body><center>Calcular<br></center></body></html>");
        calcular.setForeground(new Color(197, 132, 255));
        calcular.setFont(new Font("Goudy Stout",Font.BOLD,20));
        calcular.setBorder(null);
        calcular.setBounds(890,600,440,70);
        calcular.setBackground(new Color(164, 63, 255));
        calcular.setVisible(true);
        calcular.addActionListener(this);
        this.add(calcular);
        calcular.updateUI();
        
        fondo = new ImageIcon("Fondo4.png");
        fondito = new JLabel();
        fondito.setBounds(0,0,1400,900);
        //fondito.setHorizontalAlignment(SwingConstants.CENTER);
        fondito.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(1400, 900, Image.SCALE_SMOOTH)));
        fondito.setVisible(true);
        this.add(fondito);
        fondito.updateUI();
  
    }
    
   /* public void configurarVentana2() throws IOException, ClassNotFoundException{
        this.setTitle("ETHOY");
        this.setBounds(0, 0, 1400, 900);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0x27263A));
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculo();
    }*/
    
    public void calculo() throws IOException, FileNotFoundException, ClassNotFoundException{
        
                
                String contra = nomemates.getContrasena();
                
                Usuario seleccionado = crudu.buscarPersona(Integer.parseInt(txtid.getText()));
                
                if (seleccionado.getCorreo() == null){
                   JOptionPane.showMessageDialog(null,"El id no existe, por favor intenta otra vez");
                }else{
                    if (seleccionado.getContrasena().equals(txtcontraeña.getText())){
                        //usuraio se encontro y la contra es correcta
                       
                        int peso1 = Integer.parseInt(txtpeso.getText());
                        int tiempo1 = Integer.parseInt(txttiempo.getText());
                        String marca1 = txtmarca.getText();
                        String nom = txtnombre.getText();
                        int id1 = Integer.parseInt(txtid.getText());
                        int estado1 = Integer.parseInt(txtestado.getText());
                        
                    
                        String util;
                        
                        double resultado;
                        double eu = 2.718281828;
                        
                        
                        double estadojuguetecalculo;
                        
                        if(estado1 == 1){
                            estadojuguetecalculo = 1.1;
                            
                             resultado = peso1/Math.pow(eu, -(((tiempo1 * estadojuguetecalculo)*Math.log(2))/10) );
                            if(peso1 > resultado/2){
                                double vur;
                                
                                vur = 10-(tiempo1*estadojuguetecalculo);
                                JOptionPane.showMessageDialog(null,"El juguete sigue siendo util y le quedan "+vur +"años de vida util aproximadamente");
                                util = "Sigue siendo util";
                                

                                Juguete nuevojuguete = new JugueteN(marca1, nom, util, id1, porfafunciona.getColeccion(), peso1,tiempo1);
                                
                                JOptionPane.showMessageDialog(null, "\n"+
                                 "El nombre del juguete: " + nuevojuguete.getNombrejuguete()+"\n"+
                                 "La marca del juguete: "+ nuevojuguete.getMarca()+"\n"+
                                 "El peso del juguete: "+ nuevojuguete.getPeso()+"\n"+
                                 "El tiempo que ha tenido el juguete: "+nuevojuguete.getTiempo()+"\n"+
                                 "El id del juguete: "+nuevojuguete.getId()+"\n"+
                                 "La utilidad del juguete: "+ nuevojuguete.getUtil()
                                  +"\n"+"El porcentaje de coleccion: "+nuevojuguete.getColeccion());
                             
                                    crudj.registrarJuguete(nuevojuguete);
                                
                            }else{
                                JOptionPane.showMessageDialog(null,"El juguete ya no esta en buenas condiciones");
                                util = "Ya no es util";
                                
                               Juguete nuevojuguete = new JugueteN(marca1, nom, util, id1, porfafunciona.getColeccion(), peso1,tiempo1);
                                
                                JOptionPane.showMessageDialog(null, "\n"+
                                 "El nombre del juguete: " + nuevojuguete.getNombrejuguete()+"\n"+
                                 "La marca del juguete: "+ nuevojuguete.getMarca()+"\n"+
                                 "El peso del juguete: "+ nuevojuguete.getPeso()+"\n"+
                                 "El tiempo que ha tenido el juguete: "+nuevojuguete.getTiempo()+"\n"+
                                 "El id del juguete: "+nuevojuguete.getId()+"\n"+
                                 "La utilidad del juguete: "+ nuevojuguete.getUtil()
                                  +"\n"+"El porcentaje de coleccion: "+nuevojuguete.getColeccion());
                             
                                    crudj.registrarJuguete(nuevojuguete);
                               
                            }
                        }else if(estado1 == 2){
                            estadojuguetecalculo = 1.2;
                             resultado = peso1/Math.pow(eu, -(((tiempo1 * estadojuguetecalculo)*Math.log(2))/10) );
                            if(peso1 > resultado/2){
                                JOptionPane.showMessageDialog(null,"El juguete sigue siendo util");
                                util = "Sigue siendo util";

                                Juguete nuevojuguete = new JugueteN(marca1, nom, util, id1, porfafunciona.getColeccion(), peso1,tiempo1);
                                
                                JOptionPane.showMessageDialog(null, "\n"+
                                 "El nombre del juguete: " + nuevojuguete.getNombrejuguete()+"\n"+
                                 "La marca del juguete: "+ nuevojuguete.getMarca()+"\n"+
                                 "El peso del juguete: "+ nuevojuguete.getPeso()+"\n"+
                                 "El tiempo que ha tenido el juguete: "+nuevojuguete.getTiempo()+"\n"+
                                 "El id del juguete: "+nuevojuguete.getId()+"\n"+
                                 "La utilidad del juguete: "+ nuevojuguete.getUtil()
                                  +"\n"+"El porcentaje de coleccion: "+nuevojuguete.getColeccion());
                             
                                    crudj.registrarJuguete(nuevojuguete);
                                
                            }else{
                                JOptionPane.showMessageDialog(null,"El juguete ya no esta en buenas condiciones");
                                util = "Ya no es util";
                                
                               Juguete nuevojuguete = new JugueteN(marca1, nom, util, id1, porfafunciona.getColeccion(), peso1,tiempo1);
                                
                                JOptionPane.showMessageDialog(null, "\n"+
                                 "El nombre del juguete: " + nuevojuguete.getNombrejuguete()+"\n"+
                                 "La marca del juguete: "+ nuevojuguete.getMarca()+"\n"+
                                 "El peso del juguete: "+ nuevojuguete.getPeso()+"\n"+
                                 "El tiempo que ha tenido el juguete: "+nuevojuguete.getTiempo()+"\n"+
                                 "El id del juguete: "+nuevojuguete.getId()+"\n"+
                                 "La utilidad del juguete: "+ nuevojuguete.getUtil()
                                  +"\n"+"El porcentaje de coleccion: "+nuevojuguete.getColeccion());
                             
                                    crudj.registrarJuguete(nuevojuguete);
                               
                            }
                        }else if(estado1== 3){
                            estadojuguetecalculo = 1.3;
                            resultado = peso1/Math.pow(eu, -(((tiempo1 * estadojuguetecalculo)*Math.log(2))/10) );
                            if(peso1 > resultado/2){
                                JOptionPane.showMessageDialog(null,"El juguete sigue siendo util");
                                util = "Sigue siendo util";

                                Juguete nuevojuguete = new JugueteN(marca1, nom, util, id1, porfafunciona.getColeccion(), peso1,tiempo1);
                                
                                JOptionPane.showMessageDialog(null, "\n"+
                                 "El nombre del juguete: " + nuevojuguete.getNombrejuguete()+"\n"+
                                 "La marca del juguete: "+ nuevojuguete.getMarca()+"\n"+
                                 "El peso del juguete: "+ nuevojuguete.getPeso()+"\n"+
                                 "El tiempo que ha tenido el juguete: "+nuevojuguete.getTiempo()+"\n"+
                                 "El id del juguete: "+nuevojuguete.getId()+"\n"+
                                 "La utilidad del juguete: "+ nuevojuguete.getUtil()
                                  +"\n"+"El porcentaje de coleccion: "+nuevojuguete.getColeccion());
                             
                                    crudj.registrarJuguete(nuevojuguete);
                                
                            }else{
                                JOptionPane.showMessageDialog(null,"El juguete ya no esta en buenas condiciones");
                                util = "Ya no es util";
                                
                               Juguete nuevojuguete = new JugueteN(marca1, nom, util, id1, porfafunciona.getColeccion(), peso1,tiempo1);
                                
                                JOptionPane.showMessageDialog(null, "\n"+
                                 "El nombre del juguete: " + nuevojuguete.getNombrejuguete()+"\n"+
                                 "La marca del juguete: "+ nuevojuguete.getMarca()+"\n"+
                                 "El peso del juguete: "+ nuevojuguete.getPeso()+"\n"+
                                 "El tiempo que ha tenido el juguete: "+nuevojuguete.getTiempo()+"\n"+
                                 "El id del juguete: "+nuevojuguete.getId()+"\n"+
                                 "La utilidad del juguete: "+ nuevojuguete.getUtil()
                                  +"\n"+"El porcentaje de coleccion: "+nuevojuguete.getColeccion());
                             
                                    crudj.registrarJuguete(nuevojuguete);
                               
                            }
                        }else if(estado1 == 4){
                            estadojuguetecalculo = 1.4;
                             resultado = peso1/Math.pow(eu, -(((tiempo1 * estadojuguetecalculo)*Math.log(2))/10) );
                            if(peso1 > resultado/2){
                                JOptionPane.showMessageDialog(null,"El juguete sigue siendo util");
                                util = "Sigue siendo util";

                                Juguete nuevojuguete = new JugueteN(marca1, nom, util, id1, porfafunciona.getColeccion(), peso1,tiempo1);
                                
                                JOptionPane.showMessageDialog(null, "\n"+
                                 "El nombre del juguete: " + nuevojuguete.getNombrejuguete()+"\n"+
                                 "La marca del juguete: "+ nuevojuguete.getMarca()+"\n"+
                                 "El peso del juguete: "+ nuevojuguete.getPeso()+"\n"+
                                 "El tiempo que ha tenido el juguete: "+nuevojuguete.getTiempo()+"\n"+
                                 "El id del juguete: "+nuevojuguete.getId()+"\n"+
                                 "La utilidad del juguete: "+ nuevojuguete.getUtil()
                                  +"\n"+"El porcentaje de coleccion: "+nuevojuguete.getColeccion());
                             
                                    crudj.registrarJuguete(nuevojuguete);
                                
                            }else{
                                JOptionPane.showMessageDialog(null,"El juguete ya no esta en buenas condiciones");
                                util = "Ya no es util";
                                
                               Juguete nuevojuguete = new JugueteN(marca1, nom, util, id1, porfafunciona.getColeccion(), peso1,tiempo1);
                                
                                JOptionPane.showMessageDialog(null, "\n"+
                                 "El nombre del juguete: " + nuevojuguete.getNombrejuguete()+"\n"+
                                 "La marca del juguete: "+ nuevojuguete.getMarca()+"\n"+
                                 "El peso del juguete: "+ nuevojuguete.getPeso()+"\n"+
                                 "El tiempo que ha tenido el juguete: "+nuevojuguete.getTiempo()+"\n"+
                                 "El id del juguete: "+nuevojuguete.getId()+"\n"+
                                 "La utilidad del juguete: "+ nuevojuguete.getUtil()
                                  +"\n"+"El porcentaje de coleccion: "+nuevojuguete.getColeccion());
                             
                                    crudj.registrarJuguete(nuevojuguete);
                               
                            }
                        }else if(estado1 == 5){
                            
                            JOptionPane.showMessageDialog(null,"El juguete ya no esta en buenas condiciones");
                            util = "Ya no es util";
                            
                            
                           Juguete nuevojuguete = new JugueteN(marca1, nom, util, id1, porfafunciona.getColeccion(), peso1,tiempo1);
                                
                                JOptionPane.showMessageDialog(null, "\n"+
                                 "El nombre del juguete: " + nuevojuguete.getNombrejuguete()+"\n"+
                                 "La marca del juguete: "+ nuevojuguete.getMarca()+"\n"+
                                 "El peso del juguete: "+ nuevojuguete.getPeso()+"\n"+
                                 "El tiempo que ha tenido el juguete: "+nuevojuguete.getTiempo()+"\n"+
                                 "El id del juguete: "+nuevojuguete.getId()+"\n"+
                                 "La utilidad del juguete: "+ nuevojuguete.getUtil()
                                  +"\n"+"El porcentaje de coleccion: "+nuevojuguete.getColeccion());
                             
                                    crudj.registrarJuguete(nuevojuguete);
                           
                        }else{
                            JOptionPane.showMessageDialog(null, "No seleccionaste un estado valido");
                        }
                       
                    }else{
                      JOptionPane.showMessageDialog(null,  "contrasena incorrecta con boton regresar al procrso de registrar juguete");
                    } 
                   
                }
        fondo = new ImageIcon("Fondo4.png");
        fondito = new JLabel();
        fondito.setBounds(0,0,1400,900);
        //fondito.setHorizontalAlignment(SwingConstants.CENTER);
        fondito.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(1400, 900, Image.SCALE_SMOOTH)));
        fondito.setVisible(true);
        this.add(fondito);
        fondito.updateUI();
    }

          
//this.getContentPane().removeAll();
            //VentanaCalcular ventanacal = new VentanaCalcular();
            //ventanacal.setVisible(true);
            //this.setVisible(false);
            /*try {
                ventanacal.configurarVentana2();
            } catch (IOException ex) {
                Logger.getLogger(VentanaCalcular.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VentanaCalcular.class.getName()).log(Level.SEVERE, null, ex);
            }*/
}
