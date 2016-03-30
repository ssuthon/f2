import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyApp02 {
	public static void main(String[] args){
		JFrame frame = new JFrame("My App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		JButton button = new JButton("Click Me");
		button.addActionListener(new MyActionListener());
		frame.add(button);

		frame.setVisible(true);
	}
}

class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Hello");
	}
}