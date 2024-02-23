package com.groom.Hib_Company_db_NativeQy;

import java.util.List;

public interface CompanyService {

	void addCompany(Company c);
	Company findCompanyById(int companyId);
	List<Company> findCompanyByName(String companyName);
	List<Company> findCompanyByCEO(String companyCEO);
	List<Company> findAllCompanyByType(String companyType);
	void updateNoOfEmployeeById(int totalNoOfEmployees,int companyId);
	void updateNoOfBranchesByName(int noOfBranches,String companyName);
	void deleteCompanyByName(String companyName);
	void deleteCompaniesByCompanyType(String companyType);
}
