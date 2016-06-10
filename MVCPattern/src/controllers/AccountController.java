package controllers;

import models.Account;
import views.AccountWindow;

public class AccountController {
	private Account model;

	public AccountController(Account model, AccountWindow view) {
		this.model = model;
	}

	public void notifyAddFunds(double amount) {
		model.addFunds(amount);
	}
}