import javax.swing.JOptionPane;

public class CheckPoint {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog("What is your favorite color?");
  JOptionPane.showMessageDialog(null, color + " is my favorite color too.");
}

}
