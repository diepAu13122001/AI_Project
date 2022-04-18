package com.example.nmai.Data;

public class Authur {
	private String id;
	private String name;
	private String avaURL;
	private String position;
	private String jobDetail;
	private String email;

	public Authur(String id, String name, String avaURL, String position, String jobDetail, String email) {
		this.id = id;
		this.name = name;
		this.avaURL = avaURL;
		this.position = position;
		this.jobDetail = jobDetail;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvaURL() {
		return avaURL;
	}

	public void setAvaURL(String avaURL) {
		this.avaURL = avaURL;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getJobDetail() {
		return jobDetail;
	}

	public void setJobDetail(String jobDetail) {
		this.jobDetail = jobDetail;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
