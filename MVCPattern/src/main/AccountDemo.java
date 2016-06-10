package main;

import javax.swing.JFrame;

import controllers.AccountController;
import models.Account;
import views.AccountWindow;

public class AccountDemo {

	public static void main(String args[]) {
		Account myAccount = new Account("AimeeBartSeppe Ltd.", 3000);
		AccountWindow myView = new AccountWindow();
		AccountController controller = new AccountController(myAccount, myView);
		myView.registerController(controller);
		myAccount.addAccountListener(myView);
		myView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myView.setVisible(true);
	}
}
