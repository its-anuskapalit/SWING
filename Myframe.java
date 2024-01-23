package GUI;
import javax.swing.*;

public  class Myframe{
    Myframe(){
        JFrame jb=new JFrame("A simple swing application");
        jb.setSize(575,500);
        jb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab=new JLabel("Swing means powerful GUI");
        jb.add(jlab);
        jb.setVisible(true);
    }
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new Myframe();
            }
        });
    }
}
