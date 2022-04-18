package com.example.nmai.Data;

public class Workout {
	private String bodyPart;
	private String equipment;
	private String gifURL;
	private String id;
	private String name;
	private String target;

	public Workout (){

	}

	public Workout(String bodyPart, String equipment, String gifURL, String id, String name, String target) {
		this.bodyPart = bodyPart;
		this.equipment = equipment;
		this.gifURL = gifURL;
		this.id = id;
		this.name = name;
		this.target = target;
	}

	public String getBodyPart() {
		return bodyPart;
	}

	public void setBodyPart(String bodyPart) {
		this.bodyPart = bodyPart;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getGifURL() {
		return gifURL;
	}

	public void setGifURL(String gifURL) {
		this.gifURL = gifURL;
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

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "Workout [bodyPart=" + bodyPart + ", equipment=" + equipment + ", gifURL=" + gifURL + ", id=" + id
				+ ", name=" + name + ", target=" + target + "]";
	}
	
}
