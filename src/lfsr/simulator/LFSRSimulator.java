/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lfsr.simulator;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author jacobotapia
 */
public class LFSRSimulator {

    /**
     * @param args the command line arguments
     * It just runs a new JxBrowser that only renders
     * the desired page using JFrame
     */
    public static void main(String[] args) {
        Browser browser = new Browser();
        BrowserView view = new BrowserView(browser);
        JFrame frame = new JFrame();
        frame.add(view, BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        browser.loadURL("https://seguridad-informatica.herokuapp.com/faces/views/lfsr/index.xhtml");
    }
    
}
