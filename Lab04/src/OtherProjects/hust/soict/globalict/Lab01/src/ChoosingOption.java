// Lab 01: Environment Setup and Java Basics
// Ex 6.1: Write, compile and run the ChoosingOption program

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String args[]){
        // int option = JOptionPane.showConfirmDialog(null,
        //         "Do you want to change to the first class ticket?");

        // JOptionPane.showMessageDialog(null,"You've chosen: "
        //         + (option == JOptionPane.YES_OPTION? "Yes" : "No"));
        // System.exit(0);

        Object[] options = {"I do", "I don't"};

        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?",
                "Ticket Change",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen: I do");
        } else if (option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen: I don’t");
        } else {
            JOptionPane.showMessageDialog(null, "Action canceled");
        }
        
        System.exit(0);
    }
}
    }
}
    