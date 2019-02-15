/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umum;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author stelio
 */
public class Umum {
    
    // Declarando os objectos
    private JFrame f;
    private JPanel p;
    private JButton btn1;
    private JLabel txt;
    private JTextField txtField;
       
    // constructor
    public Umum(){
        gui();
    }
    
    // inicializar o constructor
    public void gui(){
        f = new JFrame("Creativity Stelio");
        f.setVisible(true);
        f.setSize(1024, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        txtField = new JTextField();
        txtField.setSize(100, 200);
        
        p = new JPanel();
        p.setBackground(Color.gray);
        
        btn1 = new JButton("motherfucker nao clique aqui!!!");
        txt = new JLabel("ya!");
        
        p.add(btn1);
        p.add(txt);
        p.add(txtField);

        f.add(p);
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Umum();
        
    }
    
}
