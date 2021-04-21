import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.GridLayout;
import java.awt.BorderLayout; 
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
public class GUI implements ActionListener{
	int count = 0;
	JLabel label:
	public GUI(){
		//defining the parameters
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(69,420,69,420));
		panel.setLayout(new GridLayout(0,1));
		frame.add(panel, BorderLayout.CENTER);
		//button go brrrrrr
		JButton button = new JButton("click ");
		label = new JLabel("CLICK ");
		panel.add(button);
		panel.add(label);
		button.addActionListener(this);

		//opening and title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Test");
		frame.pack();
		frame.setVisible(true);
	}
	//if you dont know what this is you're weird
	public static void main(String[] args){
		new GUI();

	//event listener go brrrrrr
		public void actionPerformed(ActionEvent e);{
			count += 1;
			lavel.setText("number of clicks:" + count);
		}
	}
}
