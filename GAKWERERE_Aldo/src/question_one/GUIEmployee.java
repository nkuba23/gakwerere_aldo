package question_one;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIEmployee implements ActionListener {
	public JFrame frame;
	public JLabel id_lb=new JLabel("id");
	public JLabel name_lb=new JLabel("name");
	public JLabel position_lb=new JLabel("position");
	
	//Textfield
	
	public JTextField id_tf=new JTextField();
	public JTextField name_tf=new JTextField();
	public JTextField position_tf=new JTextField();	
	
	//Button
	
	public JButton insert_btn=new JButton("insert");
	public JButton view_btn=new JButton("view");
	public JButton update_btn=new JButton("update");
	public JButton delete_btn=new JButton("delete");
	
	//public
	
	public GUIEmployee() {
		AddActionandEvent();
		CreateWindow();
		AddComponent();
		SetSizeandLocation();
		
	}
		private void SetSizeandLocation() {
			id_lb.setBounds(20,20,100,30);
			name_lb.setBounds(20,60,100,30);
			position_lb.setBounds(20,100,100,30);
			//tf
			id_tf.setBounds(150,20,100,30);
			name_tf.setBounds(150,60,100,30);
			position_tf.setBounds(150,100,100,30);
			//btn
			insert_btn.setBounds(20,150,80,30);
			view_btn.setBounds(100,150,80,30);
			update_btn.setBounds(180,150,80,30);
			delete_btn.setBounds(260,150,80,30);
		
		
	}








	private void AddComponent() {
		frame.add(id_lb);
		frame.add(name_lb);
		frame.add(position_lb);
		frame.add(id_tf);
		frame.add(name_tf);
		frame.add(position_tf);
		frame.add(insert_btn);
		frame.add(view_btn);
		frame.add(update_btn);
		frame.add(delete_btn);
		
	}








	private void AddActionandEvent() {
		insert_btn.addActionListener(this);
		view_btn.addActionListener(this);
		update_btn.addActionListener(this);
		delete_btn.addActionListener(this);
	}








	private void CreateWindow() {
		frame=new JFrame();
		frame.setTitle("simple Employee Form");
		frame.setBounds(20,20,400,300);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}








	@Override
	public void actionPerformed(ActionEvent arg0) {
		//
		
	}
	public static void main(String[] args) {
		 GUIEmployee emp1=new  GUIEmployee();
	}

}
