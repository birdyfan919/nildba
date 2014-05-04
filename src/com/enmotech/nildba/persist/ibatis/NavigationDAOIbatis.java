package com.enmotech.nildba.persist.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.enmotech.nildba.domain.Navigation;
import com.enmotech.nildba.persist.NavigationDAO;

public class NavigationDAOIbatis extends SqlMapClientDaoSupport implements
		NavigationDAO {
	
	private NavigationDAO navigationDAO;

	public void setNavigationDAO(NavigationDAO navigationDAO) {
		this.navigationDAO = navigationDAO;
	}

	public List<Navigation> getNavigationList() {
		return getSqlMapClientTemplate().queryForList("NAVIGATION.getNavigationList");
	}
}
