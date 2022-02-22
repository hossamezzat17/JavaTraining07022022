package io.data;

import java.io.Serializable;

public class Teilnehmer implements Serializable {

	/**
	 * 
	 */
//	private static final long serialVersionUID = 2L;
//	private static final long serialVersionUID = -510705980851894436L;
//	private static final long serialVersionUID = -7962777407406085161L;
//	private static final long serialVersionUID = -7962777407406085161L;
	private static final long serialVersionUID = -4885831732826596191L;

	private String name;
	private int alter;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public Teilnehmer() {
		this.setName("Default");
		this.setAlter(42);
	}

	@Override
	public String toString() {
		return "Teilnehmer [getName()=" + getName() + ", getAlter()=" + getAlter() + "]";
	}
	

}
