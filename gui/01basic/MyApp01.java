import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyApp01 {
	public static void main(String[] args){
		JFrame frame = new JFrame("My App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);

		frame.add(new JLabel("Hello"));

		frame.setVisible(true);
	}
}