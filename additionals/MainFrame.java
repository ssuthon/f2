import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame{
	private JTextField tf;
	public MainFrame(){
		super("Number");

		JPanel number_panel = new JPanel();
		ActionListener ln = new NumberBtnListener();
		number_panel.setLayout(new GridLayout(0, 3));
		for(int i = 1; i <= 9; i++){
			JButton btn = new JButton("" + i);
			btn.setActionCommand("" + i);
			btn.addActionListener(ln);
			number_panel.add(btn);
		}
		
		tf = new JTextField();
		tf.setFont(tf.getFont().deriveFont(30.0f));

		this.getContentPane().setLayout(new BorderLayout());
		this.add(number_panel, BorderLayout.CENTER);
		this.add(tf, BorderLayout.PAGE_END);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 250);
		this.setVisible(true);
	}

	class NumberBtnListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			tf.setText(tf.getText() + event.getActionCommand());
		}
	}

	public static void main(String[] args){
		new MainFrame();
	}
}