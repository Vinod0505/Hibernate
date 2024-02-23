package com.groom.Hib_Company_db_NativeQy;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Company company = new Company();
    	company.setCompanyId(201);
    	company.setCompanyName("Infosys");
    	company.setCompanyType("com");
    	company.setCompanyCEO("sdddad");
    	company.setHeadQuatersLocation("Bangalore");
    	company.setNoOfBranches(32);
    	company.setTotalNoOfEmployees(3245465);
    	
    	CompanyServiceImpl csi = new CompanyServiceImpl();
//    	csi.addCompany(company);
//    	List<Company> list = csi.findCompanyByName("Infosys");
//    	List<Company> list = csi.findCompanyByCEO("sddsd");
    	List<Company> list = csi.findAllCompanyByType("com");
    	System.out.println(list);
    
    }
}
