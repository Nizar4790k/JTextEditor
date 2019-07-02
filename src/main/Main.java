/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.MainFrame;

/**
 *
 * @author Nizar4790k
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
          UIManager.setLookAndFeel(
            UIManager.getCrossPlatformLookAndFeelClassName());
          
          MainFrame mainFrame = new MainFrame();
          mainFrame.setVisible(true);
          mainFrame.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
          
    }
    
}
