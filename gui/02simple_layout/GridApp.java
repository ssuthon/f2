import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class GridApp {
	private static final String[] FACES = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
	public static void main(String[] args){
		JFrame frame = new JFrame("My App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		
		GridLayout layout = new GridLayout(0, 3);
		layout.setHgap(5);
		layout.setVgap(2);

		frame.getContentPane().setLayout(layout);

		for(String face : FACES){
			frame.add(new JButton(face));
		}
		frame.setVisible(true);
	}
}