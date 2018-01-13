package net.javavideotutorials.assignment2.Human;

import java.util.Date;

import net.javavideotutorials.assignment2.Structure.Organization;

public class Employee extends Person
{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	@Override
	public void setSex(String sex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBirthday(Date birthdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getBirthday() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setJobTitle(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setOrganization(Organization organization) {
		// TODO Auto-generated method stub
		
	}
  
	private String getJobTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getOrganization() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + ", Sex: " + getSex() + "\n"
				+ "Job Title: " + getJobTitle() + " , Organization : " + getOrganization();
	}
	
}
