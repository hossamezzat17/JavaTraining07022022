package model;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

//@ApplicationScoped
//@RequestScoped
@SessionScoped
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2336062033928007473L;
	private String firstname;
	private String lastname;
	private int count;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Customer() {
		System.out.println("Customer wurde erzeugt");
	}

	@Override
	public String toString() {
		return "Customer [getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname() + ", getCount()="
				+ getCount() + "]";
	}



}
