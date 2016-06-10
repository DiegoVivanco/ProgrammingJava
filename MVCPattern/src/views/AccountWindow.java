package views;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import controllers.AccountController;

public class AccountWindow extends JFrame implements AccountListener, ActionListener {
	private JTextField name, funds, add;
	private JButton addButton;
	private AccountController controller;

	public AccountWindow() {
		this.setSize(400, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		name = new JTextField(30);
		name.setEditable(false);
		funds = new JTextField(30);
		funds.setEditable(false);
		add = new JTextField(30);
		addButton = new JButton("Add funds");
		addButton.addActionListener(this);
		this.add(name);
		this.add(funds);
		this.add(add);
		this.add(addButton);
	}

	@Override
	public void notifyFundsChanged(double newAmount) {
		this.name.setText(getName());
		this.funds.setText("Your funds: " + newAmount);
		this.add.setText("");
	}

	public void registerController(AccountController controller) {
		this.controller = controller;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.notifyAddFunds(Double.parseDouble(add.getText()));
	}
}