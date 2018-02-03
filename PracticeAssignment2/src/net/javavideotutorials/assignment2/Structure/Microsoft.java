package net.javavideotutorials.assignment2.Structure;

public class Microsoft implements Organization
{

	private Integer numEmployees;
	private String nameOfOrganization;

	// Constructor
	// It will be run as soon as the method is 
	// Like this: ((Employee)anEmployee).setOrganization(new Google("Google"))
	public Microsoft(String nameOfOrganization) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameOfOrganization == null) ? 0 : nameOfOrganization.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Microsoft other = (Microsoft) obj;
		if (nameOfOrganization == null) {
			if (other.nameOfOrganization != null)
				return false;
		} else if (!nameOfOrganization.equals(other.nameOfOrganization))
			return false;
		return true;
	}
	

	
}
