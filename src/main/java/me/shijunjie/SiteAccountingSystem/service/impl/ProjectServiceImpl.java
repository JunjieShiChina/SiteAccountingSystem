package me.shijunjie.SiteAccountingSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.shijunjie.SiteAccountingSystem.dao.ProjectDao;
import me.shijunjie.SiteAccountingSystem.entity.Project;
import me.shijunjie.SiteAccountingSystem.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectDao projectDao;

	@Override
	public void addProject(String projectName) {
		projectDao.addProject(projectName);
	}

	@Override
	public List<Project> getAllProjects() {
		return projectDao.selectAllProjects();
	}

}
