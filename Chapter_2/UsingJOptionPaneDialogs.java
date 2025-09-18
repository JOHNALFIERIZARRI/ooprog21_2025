import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        String name = "";
        int response;

       
        while (true) {
            
            name = JOptionPane.showInputDialog("Please enter your name:");

            
            response = JOptionPane.showConfirmDialog(null, "Do you want to display your name?", "Confirm", JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                
                JOptionPane.showMessageDialog(null, "Your name is: " + name);
                break;  
            } else {
                
                JOptionPane.showMessageDialog(null, "Please enter your name again.");
            }
        }
    }
}
