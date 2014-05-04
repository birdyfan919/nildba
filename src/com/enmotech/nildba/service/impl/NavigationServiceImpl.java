package com.enmotech.nildba.service.impl;

import java.util.List;

import com.enmotech.nildba.domain.Navigation;
import com.enmotech.nildba.persist.NavigationDAO;
import com.enmotech.nildba.service.NavigationService;

/**
 * 
 * @author Rio919
 * @date
 */
public class NavigationServiceImpl implements NavigationService{
	
	private NavigationDAO navigationDAO;
	
	public void setNavigationDAO(NavigationDAO navigationDAO) {
		this.navigationDAO = navigationDAO;
	}


	public List<Navigation> getNavigationList() {
		return navigationDAO.getNavigationList();
	}
	
}
