package com.phyho.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phyho.web.dao.AdminDAO;

@Service
public class AdminService {
	
	@Autowired
	private AdminDAO adminDAO;

	public Map<String, Object> adminLogin(Map<String, Object> map) {
		return adminDAO.adminLogin(map);
	}
}
