import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class NoInner01 {
	public static void main(String[] args){
		JFrame frame = new JFrame("My App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.getContentPane().setLayout(new BorderLayout());

		Counter counter = new Counter();

		JLabel label = new JLabel("" + counter.getValue());
		label.setFont(label.getFont().deriveFont(18.0f));
		frame.add(label, BorderLayout.PAGE_START);

		JButton button = new JButton("Click Me");
		button.addActionListener(new MyActionListener(counter, label));
		frame.add(button, BorderLayout.PAGE_END);

		frame.setVisible(true);
	}
}

class MyActionListener implements ActionListener{
	private Counter counter;
	private JLabel label;	

	public MyActionListener(Counter counter, JLabel label){
		this.counter = counter;
		this.label = label;
	}

	public void actionPerformed(ActionEvent e) { 
		counter.count();
		label.setText("" + counter.getValue());
	}
}