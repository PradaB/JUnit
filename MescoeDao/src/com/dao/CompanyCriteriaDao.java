package com.dao;

import java.util.List;

import com.model.Company;
import com.model.CompanyCriteria;

public interface CompanyCriteriaDao 
{
	/**
	 * Attributes of table CompanyCriteria in the database mescoe
	 */
	String TABLEcompanyCriteria="CompanyCriteria",
			COLcritid="critid",                            
			COLyop="yop", COLbranch="branch", COLcid="cid";
	
	
	/**
	 * Function declaration
	 * @param cid
	 * @return
	 */
	List<CompanyCriteria> getCompanyCriteria(int cid);
	List<CompanyCriteria> getAllCompanyCriteria();
	void addCompanyCriteria(CompanyCriteria c);
	void updateCompanyCriteria(CompanyCriteria c);
	void deleteCompanyCriteria(CompanyCriteria c);
}
