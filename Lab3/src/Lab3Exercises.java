import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame("Jainel M.");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(550, 300);
		myFrame.setSize(250, 200);
		  MyPanelClass myPanel = new MyPanelClass();
          myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		
	}
}