package net.javavideotutorials.assignment2.Human;

import java.util.Date;

import net.javavideotutorials.assignment2.Structure.Organization;

public class Employee extends Person
{

	private String name;
	private String sex;
	private Date birthdate;
	private String jobTitle;
	private Organization organization;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return sex;
	}

	@Override
	public void setName(String name) {
		this.name = name;  
	}

	@Override
	public void setSex(String sex) {
		this.sex = sex;		
	}

	@Override
	public void setBirthday(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public Date getBirthday() {
		// TODO Auto-generated method stub
		return birthdate;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
		
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
		
	}
  
	private String getJobTitle() {
		
		return jobTitle;
	}

	private String getOrganization() {
		
		return organization.getNameOfOrganization();
	}
	
	@Override
	public String toString() {
		return super.toString() + "Job Title: " + getJobTitle() + ", Organization: " + getOrganization();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((organization == null) ? 0 : organization.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
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
		Employee other = (Employee) obj;
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (organization == null) {
			if (other.organization != null)
				return false;
		} else if (!organization.equals(other.organization))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	

	
}
