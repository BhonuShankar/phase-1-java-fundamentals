package com.simplilearn.collection.list.account;

import java.util.LinkedList;
import java.util.List;

public class AccountList {

	public static void main(String[] args) {
		Account holder1 = new Account(1001, "John Smith", "L.A", 56456.567);
		Account holder2 = new Account(1002, "Marry Joe", "L.V", 896456.567);
		Account holder3 = new Account(1003, "Kim Smith", "California", 16456.567);
		Account holder4 = new Account(1004, "Will Smith", "Apple", 57856.567);
		Account holder5 = new Account(1005, "Aria Stark", "D.C", 99056.567);
		
		List<Account> accList = new LinkedList<Account>();
		accList.add(holder1);
		accList.add(holder2);
		accList.add(holder5);

		// insert data at index
		//accList.add(0,holder);

		// replace
		//accList.set(3, holder4);
		//iterations
		for(Account holder : accList) {
			System.out.println(holder);

			System.out.println(holder.accountNo);
			System.out.println(holder.name);
			System.out.println(holder.balance);
			System.out.println(holder.branch);
			System.out.println("----------");
		}

		
	}

}
