import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class BorderedApp {
	public static void main(String[] args){
		JFrame frame = new JFrame("My App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.getContentPane().setLayout(new BorderLayout());

		frame.add(new JButton("North"), BorderLayout.PAGE_START);		
		frame.add(new JButton("West"), BorderLayout.LINE_START);
		frame.add(new JButton("East"), BorderLayout.LINE_END);
		frame.add(new JButton("Center"), BorderLayout.CENTER);
		JButton southBotton = new JButton("South");
		southBotton.setPreferredSize(new Dimension(100, 60));
		frame.add(southBotton, BorderLayout.PAGE_END);

		frame.setVisible(true);
	}
}