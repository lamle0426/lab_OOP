// Lab 01: Environment Setup and Java Basics
// Ex1: Write, compile and run the ChoosingOption program

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String args[]){
        int option=JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class ticket?");

        JOptionPane.showMessageDialog(null,"You've chosen: "
                + (option == JOptionPane.YES_OPTION? "Yes" : "No"));
        System.exit(0);
    }
}
    