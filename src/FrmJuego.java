import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class FrmJuego extends JFrame{
    public FrmJuego() {
        setSize(500,300);//Para darle las Dimenciones al Programa
        setTitle("Juguemos a los datos");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Cerrar la aplicacion al cerrar la ventana
        setLayout(null);//para anular la distrubicion y poder ubicar las cosas

        JLabel lblDado1 = new JLabel();//Craer un label
        String nombreImagen = "/imagenes/1.jpg";//variable del enlace de la imagen
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen));//
        lblDado1.setIcon(imagen);

        lblDado1.setBounds(10,10,imagen.getIconWidth(),imagen.getIconHeight());//Ubicacion eje x Y y, tamaño
        getContentPane().add(lblDado1);

        JLabel lblDado2 = new JLabel();//Craer un label
        lblDado2.setIcon(imagen);
        lblDado2.setBounds(10 + imagen.getIconWidth(),10,imagen.getIconWidth(),imagen.getIconHeight());
        getContentPane().add(lblDado2);

        JLabel lblTitulo1 = new JLabel("Lanzamientos");
        lblTitulo1.setBounds(50+2*imagen.getIconWidth(),10,100,25);
        lblTitulo1.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblTitulo1);

        JLabel lblTitulo2 = new JLabel("Cenas");
        lblTitulo2.setBounds(160+2*imagen.getIconWidth(),10,100,25);
        lblTitulo2.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblTitulo2);

        JLabel lblLanzamiento = new JLabel();
        lblLanzamiento.setBounds(50 + 2*imagen.getIconWidth(),40,100,100);
        lblLanzamiento.setBackground(new Color(0,0,0));//Fondo
        lblLanzamiento.setForeground(new Color(51,255,0));//Letra
        lblLanzamiento.setFont(new Font("Tahoma",1,72));//tipo de letra negrita y tamaño
        lblLanzamiento.setText("0");
        lblLanzamiento.setHorizontalAlignment(SwingConstants.RIGHT);
        lblLanzamiento.setOpaque(true);
        getContentPane().add(lblLanzamiento);

        JLabel lblCenas = new JLabel();
        lblCenas.setBounds(160 + 2 *imagen.getIconWidth(),40,100,100);
        lblCenas.setBackground(new Color(0,0,0));//Fondo
        lblCenas.setForeground(new Color(51,255,0));//Letra
        lblCenas.setFont(new Font("Tahoma",1,72));//tipo de letra negrita y tamaño
        lblCenas.setText("0");
        lblCenas.setHorizontalAlignment(SwingConstants.RIGHT);
        lblCenas.setOpaque(true);
        getContentPane().add(lblCenas);

        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(10,15 + imagen.getIconHeight(),100,25);
        getContentPane().add(btnIniciar);
        JButton btnLanzar = new JButton("Lanzar");
        btnLanzar.setBounds(10,45 + imagen.getIconHeight(),100,25);
        getContentPane().add(btnLanzar);
    }
} 
