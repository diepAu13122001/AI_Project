package com.example.nmai.pages;

import java.util.*;
import com.example.nmai.Data.Authur;

public class AboutUs {
	private ArrayList<Authur> authurs;
	private ArrayList<String> webIntro;

	public AboutUs(ArrayList<Authur> authurs, String webName, String target, String usingIntruction) {
		this.authurs = authurs;
		this.webIntro.add(webName);
		this.webIntro.add(target);
		this.webIntro.add(usingIntruction);
	}

	public ArrayList<Authur> getAuthurs() {
		return authurs;
	}

	public void setAuthurs(ArrayList<Authur> authurs) {
		this.authurs = authurs;
	}

	public ArrayList<String> getWebIntro() {
		return webIntro;
	}

	public void setWebIntro(String webName, String target, String usingIntruction) {
		this.webIntro.add(webName);
		this.webIntro.add(target);
		this.webIntro.add(usingIntruction);
	}

}
