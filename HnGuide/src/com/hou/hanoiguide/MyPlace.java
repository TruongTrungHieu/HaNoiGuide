package com.hou.hanoiguide;

public class MyPlace {
	private String namePlace;
	private String nameImage;
	public MyPlace() {
		// TODO Auto-generated constructor stub
	}
	public MyPlace(String namePlace, String nameImage){
		this.nameImage = nameImage;
		this.nameImage = nameImage;
	}
	public String getNamePlace() {
		return namePlace;
	}
	public void setNamePlace(String namePlace) {
		this.namePlace = namePlace;
	}
	public String getNameImage() {
		return nameImage;
	}
	public void setNameImage(String nameImage) {
		this.nameImage = nameImage;
	}
	
	public String toString(){
		return this.namePlace;
	}
	
}
