package Chapter3;
// Fig 3.13 NameDialog.Java
// Obtaining User input from a Dialog

import javax.swing.*;
public class NameDialog {
    public static void main(String[] args) {
        // prompt user to enter name
        String name = JOptionPane.showInputDialog("What is your name");

        // Create the Message
        String message =
                String.format("%s, Welcome to Java Programming!", name);

        // Display the message to welcome the user
        JOptionPane.showMessageDialog(null, message);
    }
}
