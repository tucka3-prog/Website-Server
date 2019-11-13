package com.example.demo;

public class Images {

	private static int idCounter = 0;
	private int id;
	private String name;
	private String url;
	private String width;
	private String height;

	public Images(String name, String url, String width, String height) {
		super();
		this.id = idCounter++;
		this.name = name;
		this.url = url;
		this.width = width;
		this.height = height;
	}

	public Images(int id, String name, String url, String width, String height) {

		this.id = id;
		this.name = name;
		this.url = url;
		this.width = width;
		this.height = height;
	}

	public static int getIdCounter() {
		return idCounter;
	}

	public static void setIdCounter(int idCounter) {
		Images.idCounter = idCounter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}