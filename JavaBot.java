import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bot extends JFrame {

	private JTextArea Chatarea =new JTextArea();
	private JTextField chatbot=new JTextField();

	public Bot() {

		JFrame frame =new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.setTitle("ChatBot");

		frame.add(Chatarea);
		frame.add(chatbot);

		Chatarea.setSize(500 ,400);
		Chatarea.setLocation(2 , 2);


		chatbot.setSize(540 , 30);
		chatbot.setLocation(2, 510);

		chatbot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				String gtext =chatbot.getText().toLowerCase();

				Chatarea.append("You :- " + gtext + "\n");
				chatbot.setText("");

				if(gtext.contains("hi"))
				{

					bot("Hello");
				} else 
					{
						bot("I Don't Understarnd you");
					}
			}

		});

	}

	private void bot(String string) {

		Chatarea.append("Bot :-"  + string + "\n");

	}

	public static void main(String args[]) {

		new Bot();
	}
}
