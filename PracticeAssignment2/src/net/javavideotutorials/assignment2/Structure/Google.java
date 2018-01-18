package net.javavideotutorials.assignment2.Structure;

import net.javavideotutorials.assignment2.Human.Employee;

public class Google implements Organization
{

	private Integer numEmployees;
	private String nameOfOrganization;
	
	// Constructor
	// It will be run as soon as the method is 
	// Like this: ((Employee)anEmployee).setOrganization(new Google("Google"))
	public Google(String nameOfOrganization) {
		this.nameOfOrganization = nameOfOrganization;
	}

	@Override
	public Integer getNumberOfEmployees() {
		return numEmployees;
	}

	@Override
	public String getNameOfOrganization() {
		return nameOfOrganization;
	}

	@Override
	public void setNumberOfEmployees(Integer numEmployees) {
		this.numEmployees = numEmployees;
	}

	@Override
	public void setNameOfOrganization(String nameOfOrganization) {
		this.nameOfOrganization = nameOfOrganization;
	}
  
	@Override
	public String toString() {
		
		return getNameOfOrganization();
	}
}
