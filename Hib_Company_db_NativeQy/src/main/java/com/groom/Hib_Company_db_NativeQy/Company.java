package com.groom.Hib_Company_db_NativeQy;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Company {

	@Id
	private int companyId;
	private String companyName;
	private String companyType;
	private  int totalNoOfEmployees;
	private int noOfBranches;
	private String companyCEO;
	private String headQuatersLocation;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public int getTotalNoOfEmployees() {
		return totalNoOfEmployees;
	}
	public void setTotalNoOfEmployees(int totalNoOfEmployees) {
		this.totalNoOfEmployees = totalNoOfEmployees;
	}
	public int getNoOfBranches() {
		return noOfBranches;
	}
	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
	public String getCompanyCEO() {
		return companyCEO;
	}
	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}
	public String getHeadQuatersLocation() {
		return headQuatersLocation;
	}
	public void setHeadQuatersLocation(String headQuatersLocation) {
		this.headQuatersLocation = headQuatersLocation;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyType=" + companyType
				+ ", totalNoOfEmployees=" + totalNoOfEmployees + ", noOfBranches=" + noOfBranches + ", companyCEO="
				+ companyCEO + ", headQuatersLocation=" + headQuatersLocation + "]";
	}


}
