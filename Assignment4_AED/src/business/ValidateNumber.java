package business;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author ankitajha
 */
public class ValidateNumber extends InputVerifier {
    
    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        if (text.length() > 0) {
            try {
                int i=Integer.parseInt(text);
                input.setBorder(javax.swing.BorderFactory.createEmptyBorder());
                
                if(i<=0)
                {
           
                    JOptionPane.showMessageDialog(input, "Please enter positive"
                            + " integer value", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                return true;
            } catch (NumberFormatException e) {
                input.setBorder(BorderFactory.createLineBorder(Color.red));
                JOptionPane.showMessageDialog(input, "Please enter integer"
                        + " value", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            input.setBackground(Color.white);
            return true;
        }
    }
}
