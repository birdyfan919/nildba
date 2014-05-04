package com.enmotech.nildba.web;

import java.util.List;

import com.enmotech.nildba.domain.Navigation;
import com.enmotech.nildba.service.NavigationService;
import com.enmotech.nildba.web.base.BaseAction;


public class NavigationAction extends BaseAction {

	private static final long serialVersionUID = -6429656164942448350L;
	
	private NavigationService navigationService;

	public void setNavigationService(NavigationService navigationService) {
		this.navigationService = navigationService;
	}
	
	public String index(){
		List<Navigation> navList = navigationService.getNavigationList();
		request.setAttribute("navList", navList);
		return SUCCESS;
	}
	
}
