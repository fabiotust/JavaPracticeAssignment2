package net.javavideotutorials.assignment2.Structure;

public class Microsoft implements Organization
{

	private String nameOfOrganization;

	// Constructor
	// It will be run as soon as the method is 
	// Like this: ((Employee)anEmployee).setOrganization(new Google("Google"))
	public Microsoft(String nameOfOrganization) {
		this.nameOfOrganization = nameOfOrganization;
	}
	
	@Override
	public Integer getNumberOfEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNameOfOrganization() {
		// TODO Auto-generated method stub
		return nameOfOrganization;
	}

	@Override
	public void setNumberOfEmployees(Integer numEmployees) {
		// TODO Auto-generated method stub
		
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
