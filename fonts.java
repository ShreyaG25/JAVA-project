import java.awt.BorderLayout;
import java.util.Map;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Font.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.awt.event.ActionEvent;

public class fonts extends JFrame {

	private JPanel contentPane;

	 /**
	 * Launch the application.
	 */
	JLabel lblNewLabel;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fonts frame = new fonts();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public fonts() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		 lblNewLabel = new JLabel("  Tuesday");
		lblNewLabel.setBounds(21, 41, 105, 38);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("BOLD");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Font f;
				String str=lblNewLabel.getText();
				f=new Font("TUESDAY",Font.BOLD,15);
				 lblNewLabel.setFont(f);
				 lblNewLabel.setText(str);
				
				
			}
		});
		rdbtnNewRadioButton.setBounds(31, 86, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("ITALIC");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Font f;
				String str=lblNewLabel.getText();
				f=new Font("TUESDAY",Font.ITALIC,15);
				 lblNewLabel.setFont(f);
				 lblNewLabel.setText(str);
				
			}
		});
		rdbtnNewRadioButton_1.setBounds(31, 124, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("UNDERLINED");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent arg0) {
                Font f;
			    f=new Font("TUESDAY",Font.BOLD,15);
			    String str=lblNewLabel.getText();
				Map attributes=f.getAttributes();
				attributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON );
				f=new Font(attributes);
				lblNewLabel.setFont(f);
				lblNewLabel.setText(str);
			    
				
			}
		});
		rdbtnNewRadioButton_2.setBounds(31, 159, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
	}
}