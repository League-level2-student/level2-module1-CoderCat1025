package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addNames = new JButton();
	JButton viewNames = new JButton();
	ArrayList<String> names = new ArrayList<>();
	String answer;
	
	void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setName("Guest Book");
		frame.add(panel);
		addNames.setText("Add Name");
		viewNames.setText("View Names");
		panel.add(addNames);
		panel.add(viewNames);
		frame.pack();
		
		addNames.addActionListener(this);
		viewNames.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
if(e.getSource() == addNames) {
	answer = JOptionPane.showInputDialog("Enter a name (preferably both first and last).");
	names.add(answer);
}
else if(e.getSource() == viewNames) {
	String guests = "";
	for (int i=0; i<names.size(); i++) {
		guests = guests + "Guest #" + (i + 1) + ": " + names.get(i) + "\n";
	}
	if (guests.isEmpty()) {
		JOptionPane.showMessageDialog(null, "No one has been invited yet.");
	}
	else {
	JOptionPane.showMessageDialog(null, guests);
	}
}
	}
}
