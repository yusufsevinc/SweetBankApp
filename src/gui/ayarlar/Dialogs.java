
package gui.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialogs {
    public static void bosOlamazMesajGoster(JFrame frame){
        JOptionPane.showMessageDialog(frame, "Tüm alanları doldurmalısınız ! ");
    }
    public static void ozelMesajGoster(JFrame frame ,String message) {
        JOptionPane.showMessageDialog(frame, message);
    }
}
