package Precuelas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    JPanel panel;
    
    public Ventana(){
        setSize(500, 500);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(500, 500));
        componentes();
    }
    
    private void componentes(){
        paneles();
        etiquetas();
    }
    
    private void paneles(){
        panel = new JPanel();
        
        panel.setLayout(null);
        //panel.setBackground(Color.WHITE);
        
        this.getContentPane().add(panel);
    }
    
    private void etiquetas(){
        JLabel imagenLong = new JLabel();
        ImageIcon Long = new ImageIcon("Long.png");
        imagenLong.setBounds(0, 0, 500, 500);
        imagenLong.setIcon(new ImageIcon(Long.getImage().getScaledInstance(imagenLong.getWidth(), imagenLong.getHeight(), Image.SCALE_REPLICATE)));
        panel.add(imagenLong);
    }
    
}
