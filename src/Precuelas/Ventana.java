package Precuelas;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    JPanel panel;
    JLabel imagenLong;
    JLabel imagenLyana;
    
    public Ventana(){
        setSize(500, 500);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(500, 500));
        
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        imagenes();
    }
    
    
    
    private void imagenes(){
        
        //Long
        ImageIcon Long = new ImageIcon("Long.png");
        imagenLong = new JLabel();
        imagenLong.setBounds(0, 0, 500, 500);
        imagenLong.setIcon(new ImageIcon(Long.getImage().getScaledInstance(imagenLong.getWidth(), imagenLong.getHeight(), Image.SCALE_SMOOTH)));
        
        //Lyana
        ImageIcon Lyana = new ImageIcon("Lyana.png");
        imagenLyana = new JLabel();
        imagenLyana.setBounds(0, 0, 500, 500);
        imagenLyana.setIcon(new ImageIcon(Lyana.getImage().getScaledInstance(imagenLyana.getWidth(), imagenLyana.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    public void imagenLong(){
        panel.removeAll();
        panel.add(imagenLong);
        panel.updateUI();
    }
    
    public void imagenLyana(){
        panel.removeAll();
        panel.add(imagenLyana);
        panel.updateUI();
    }
    
}
