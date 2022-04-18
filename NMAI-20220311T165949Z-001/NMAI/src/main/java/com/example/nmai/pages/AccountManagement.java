package com.example.nmai.pages;

import java.util.*;

import com.example.nmai.Data.*;

public class AccountManagement {
// for login and sign up
	private HashMap<String, String> accListLogin; // username and password
	private ArrayList<String> loginHistory;

	public AccountManagement() {
	}

	public void login(String userName, String password) {

	}

	public void signup(Account newAcc) {

	}

	// for forgot password and change new pass
	public String changePass(String username, String oldPass, String newPass) {
		
		return newPass;
	}

	public void changeUserName() {

	}

	// otp has 4 nums
	public int getOTP() {
		String otp = "";
		Random rd = new Random();
		for (int i = 0; i < 4; i++) {
			int number = rd.nextInt(10);
			otp += number + "";
		}
		return Integer.parseInt(otp);
	}

	public static void main(String[] args) {
		AccountManagement am = new AccountManagement();
		System.out.println(am.getOTP());
	}
}
