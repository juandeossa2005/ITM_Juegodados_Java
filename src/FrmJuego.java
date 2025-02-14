import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class FrmJuego extends JFrame{
    private Dado dado1,dado2;
    private Random r = new Random();//se instancio el objeto
    private JLabel lblDado1,lblDado2,lblLanzamiento, lblCenas;//Craer un label
    private int lanzamientos,cenas ;//Craer un label

    public FrmJuego() {
        setSize(500,300);//Para darle las Dimenciones al Programa
        setTitle("Juguemos a los datos");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Cerrar la aplicacion al cerrar la ventana
        setLayout(null);//para anular la distrubicion y poder ubicar las cosas

        lblDado1 = new JLabel();//Craer un label
        String nombreImagen = "/imagenes/1.jpg";//variable del enlace de la imagen
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen));//
        lblDado1.setIcon(imagen);

        lblDado1.setBounds(10,10,imagen.getIconWidth(),imagen.getIconHeight());//Ubicacion eje x Y y, tamaño
        getContentPane().add(lblDado1);

        lblDado2 = new JLabel();//Craer un label
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

        lblLanzamiento = new JLabel();
        lblLanzamiento.setBounds(50 + 2*imagen.getIconWidth(),40,100,100);//Ubicacion 
        lblLanzamiento.setBackground(new Color(0,0,0));//Fondo
        lblLanzamiento.setForeground(new Color(51,255,0));//Letra
        lblLanzamiento.setFont(new Font("Tahoma",1,72));//tipo de letra negrita y tamaño
        lblLanzamiento.setText("0");
        lblLanzamiento.setHorizontalAlignment(SwingConstants.RIGHT);
        lblLanzamiento.setOpaque(true);
        getContentPane().add(lblLanzamiento);

        lblCenas = new JLabel();
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

        btnIniciar.addActionListener(new ActionListener() {//al crear un evento se agrega addActionListener y despues dentro el ActionListener el cual se crea despues un metodo

            @Override
            public void actionPerformed(ActionEvent e) {
                iniciar();
            }
        });

        btnLanzar.addActionListener(new ActionListener() {//al crear un evento se agrega addActionListener y despues dentro el ActionListener el cual se crea despues un metodo

            @Override
            public void actionPerformed(ActionEvent e) {//al detetar que se da click
                lanzar();
            }
        });
        dado1 = new Dado();//se instancio el objeto
        dado2 = new Dado();//se instancio el objeto
        lanzamientos = 0;
        cenas = 0;

    }
    private void iniciar(){
        lanzamientos = 0;
        cenas = 0;
        lblLanzamiento.setText("0");
        lblCenas.setText("0");
    }
    private void lanzar(){
        dado1.lanzar(r);
        dado2.lanzar(r);

        dado1.mostrar(lblDado1);
        dado2.mostrar(lblDado2);

        lanzamientos++;
        lblLanzamiento.setText(String.valueOf(lanzamientos));

        if (dado1.getNumero()+dado2.getNumero() >= 11) {
            cenas++;
            lblCenas.setText(String.valueOf(cenas));
        }

    }
} 
