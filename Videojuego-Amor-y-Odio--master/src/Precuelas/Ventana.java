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
    JLabel imagenA;
    JLabel imagenO;
    JLabel imagenAA;
    JLabel imagenAO;
    JLabel imagenOA;
    JLabel imagenOO;
    JLabel imagenAAA;
    JLabel imagenAAO;
    JLabel imagenAOA;
    JLabel imagenAOO;
    JLabel imagenOAA;
    JLabel imagenOAO;
    JLabel imagenOOA;
    JLabel imagenOOO;
    
    
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
        
        //A
        ImageIcon A = new ImageIcon("images/A.png");
        imagenA = new JLabel();
        imagenA.setBounds(0, 0, 500, 500);
        imagenA.setIcon(new ImageIcon(A.getImage().getScaledInstance(imagenA.getWidth(), imagenA.getHeight(), Image.SCALE_SMOOTH)));
        
        //O
        ImageIcon O = new ImageIcon("images/O.png");
        imagenO = new JLabel();
        imagenO.setBounds(0, 0, 500, 500);
        imagenO.setIcon(new ImageIcon(O.getImage().getScaledInstance(imagenO.getWidth(), imagenO.getHeight(), Image.SCALE_SMOOTH)));
        
        //AA
        ImageIcon AA = new ImageIcon("images/AA.png");
        imagenAA = new JLabel();
        imagenAA.setBounds(0, 0, 500, 500);
        imagenAA.setIcon(new ImageIcon(AA.getImage().getScaledInstance(imagenAA.getWidth(), imagenAA.getHeight(), Image.SCALE_SMOOTH)));
        
        //AO
        ImageIcon AO = new ImageIcon("images/AO.png");
        imagenAO = new JLabel();
        imagenAO.setBounds(0, 0, 500, 500);
        imagenAO.setIcon(new ImageIcon(AO.getImage().getScaledInstance(imagenAO.getWidth(), imagenAO.getHeight(), Image.SCALE_SMOOTH)));
        
        //OA
        ImageIcon OA = new ImageIcon("images/OA.png");
        imagenOA = new JLabel();
        imagenOA.setBounds(0, 0, 500, 500);
        imagenOA.setIcon(new ImageIcon(OA.getImage().getScaledInstance(imagenOA.getWidth(), imagenOA.getHeight(), Image.SCALE_SMOOTH)));
        
        //OO
        ImageIcon OO = new ImageIcon("images/OO.png");
        imagenOO = new JLabel();
        imagenOO.setBounds(0, 0, 500, 500);
        imagenOO.setIcon(new ImageIcon(OO.getImage().getScaledInstance(imagenOO.getWidth(), imagenOO.getHeight(), Image.SCALE_SMOOTH)));
        
        //AAA
        ImageIcon AAA = new ImageIcon("images/AAA.png");
        imagenAAA = new JLabel();
        imagenAAA.setBounds(0, 0, 500, 500);
        imagenAAA.setIcon(new ImageIcon(AAA.getImage().getScaledInstance(imagenAAA.getWidth(), imagenAAA.getHeight(), Image.SCALE_SMOOTH)));
        
        //AAO
        ImageIcon AAO = new ImageIcon("images/AAO.png");
        imagenAAO = new JLabel();
        imagenAAO.setBounds(0, 0, 500, 500);
        imagenAAO.setIcon(new ImageIcon(AAO.getImage().getScaledInstance(imagenAAO.getWidth(), imagenAAO.getHeight(), Image.SCALE_SMOOTH)));
        
        //AOA
        ImageIcon AOA = new ImageIcon("images/AOA.png");
        imagenAOA = new JLabel();
        imagenAOA.setBounds(0, 0, 500, 500);
        imagenAOA.setIcon(new ImageIcon(AOA.getImage().getScaledInstance(imagenAOA.getWidth(), imagenAOA.getHeight(), Image.SCALE_SMOOTH)));
        
        //AOO
        ImageIcon AOO = new ImageIcon("images/AOO.png");
        imagenAOO = new JLabel();
        imagenAOO.setBounds(0, 0, 500, 500);
        imagenAOO.setIcon(new ImageIcon(AOO.getImage().getScaledInstance(imagenAOO.getWidth(), imagenAOO.getHeight(), Image.SCALE_SMOOTH)));
        
        //OAA
        ImageIcon OAA = new ImageIcon("images/OAA.png");
        imagenOAA = new JLabel();
        imagenOAA.setBounds(0, 0, 500, 500);
        imagenOAA.setIcon(new ImageIcon(OAA.getImage().getScaledInstance(imagenOAA.getWidth(), imagenOAA.getHeight(), Image.SCALE_SMOOTH)));
        
        //OAO
        ImageIcon OAO = new ImageIcon("images/OAO.png");
        imagenOAO = new JLabel();
        imagenOAO.setBounds(0, 0, 500, 500);
        imagenOAO.setIcon(new ImageIcon(OAO.getImage().getScaledInstance(imagenOAO.getWidth(), imagenOAO.getHeight(), Image.SCALE_SMOOTH)));
        
        //OOA
        ImageIcon OOA = new ImageIcon("images/OOA.png");
        imagenOOA = new JLabel();
        imagenOOA.setBounds(0, 0, 500, 500);
        imagenOOA.setIcon(new ImageIcon(OOA.getImage().getScaledInstance(imagenOOA.getWidth(), imagenOOA.getHeight(), Image.SCALE_SMOOTH)));
        
        //OOO
        ImageIcon OOO = new ImageIcon("images/OOO.png");
        imagenOOO = new JLabel();
        imagenOOO.setBounds(0, 0, 500, 500);
        imagenOOO.setIcon(new ImageIcon(OOO.getImage().getScaledInstance(imagenOOO.getWidth(), imagenOOO.getHeight(), Image.SCALE_SMOOTH)));
        
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
    
    
    public void imagenA(){
        panel.removeAll();
        panel.add(imagenA);
        panel.updateUI();
    }
    
    
    public void imagenO(){
        panel.removeAll();
        panel.add(imagenO);
        panel.updateUI();
    }
    
    
    public void imagenAA(){
        panel.removeAll();
        panel.add(imagenAA);
        panel.updateUI();
    }
    
    
    public void imagenAO(){
        panel.removeAll();
        panel.add(imagenAO);
        panel.updateUI();
    }
    
    
    public void imagenOA(){
        panel.removeAll();
        panel.add(imagenOA);
        panel.updateUI();
    }
    
    
    public void imagenOO(){
        panel.removeAll();
        panel.add(imagenOO);
        panel.updateUI();
    }
    
    
    public void imagenAAA(){
        panel.removeAll();
        panel.add(imagenAAA);
        panel.updateUI();
    }
    
    
    public void imagenAAO(){
        panel.removeAll();
        panel.add(imagenAAO);
        panel.updateUI();
    }
    
    
    public void imagenAOA(){
        panel.removeAll();
        panel.add(imagenAOA);
        panel.updateUI();
    }
    
    
    public void imagenAOO(){
        panel.removeAll();
        panel.add(imagenAOO);
        panel.updateUI();
    }
    
    
    public void imagenOAA(){
        panel.removeAll();
        panel.add(imagenOAA);
        panel.updateUI();
    }
    
    
    public void imagenOAO(){
        panel.removeAll();
        panel.add(imagenOAO);
        panel.updateUI();
    }
    
    
    public void imagenOOA(){
        panel.removeAll();
        panel.add(imagenOOA);
        panel.updateUI();
    }
    
    
    public void imagenOOO(){
        panel.removeAll();
        panel.add(imagenOOO);
        panel.updateUI();
    }
}
