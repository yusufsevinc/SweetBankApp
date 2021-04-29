/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ayarlar;

import java.awt.Color;
import java.awt.Component;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author sevinc
 */
public class TextAyarlari {

    private static String orginalText;
    private static Color originColor;

    public static void focusGaind(JTextField textField, String text) {
        orginalText = text;

        if (textField.getText().trim().equals(text)) {
            originColor = textField.getForeground();
            textField.setText("");
        }
        textField.setForeground(Color.blue);
    }

    public static void focusLost(JTextField textField) {
        if (textField.getText().trim().equals("")) {
            textField.setForeground(originColor);
            textField.setText(orginalText);
        } else {
            textField.setForeground(Color.black);

        }

    }

    public static void sadeceSayiGir(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }

        });
    }

    public static void sadeceHarfGir(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isAlphabetic(c) && c != KeyEvent.VK_SPACE) {
                    e.consume();
                }
            }

        });
    }
    private static int limit;

    public static void karakterSayiKontrol(JTextField textField, int limit) {
        TextAyarlari.limit = limit;
        textField.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null) {
                    return;

                }
                if (getLength() + str.length() <= limit) {
                    super.insertString(offs, str, a); //To change body of generated methods, choose Tools | Templates.

                }
            }

        }
        );
    }
    
    public static boolean uzunlukKontrol(int length , String str){
        return (str.length() < length );
            
        
    }
    
    public static int setKeyReleased(JTextField textField , int miktarSinir ){
       String text = textField.getText();
        if (!text.equals("")) {
            int miktar = Integer.parseInt(text);
            if (miktar > miktarSinir) {
                 miktar = miktarSinir;
            }
           return miktar;
            }
        return 0;
    }
    
    public static boolean textAlanDolumKontrol(JPanel jPanel){
        Component[] components = jPanel.getComponents();
        for (Component component : components) {
            if (component instanceof  JTextField) {
                JTextField textField = (JTextField) component;
                if (textField.getText().trim().equals("") && textField.isEnabled()) {
                    return false;
                }
            }
        }
        return true;
    }

}
