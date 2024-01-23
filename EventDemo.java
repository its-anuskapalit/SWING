package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class EventDemo{
    JLabel jlab;
    EventDemo(){
        JFrame jb=new JFrame("An event example");
        jb.setLayout(new FlowLayout());
        jb.setSize(220,90);
        jb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbA=new JButton("A");
        JButton jbB=new JButton("B");
        jbA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("A is press!");
            }
        });

        jbB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("B is press!");
            }
        });
        jb.add(jbA);
        jb.add(jbB);
        jlab=new JLabel("Press a button");
        jb.add(jlab);
        jb.setVisible(true);
    }
        public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new EventDemo();
            }
        });
    }
}
