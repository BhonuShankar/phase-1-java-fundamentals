package com.simplilearn.collection.list.account;

public class Account {

	public int accountNo;
	public String name;
	public String branch;
	public double balance;

	public Account() {}

	public Account(int accountNo, String name, String branch, double balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.branch = branch;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", branch=" + branch + ", balance=" + balance
				+ "]";
	};
	}


