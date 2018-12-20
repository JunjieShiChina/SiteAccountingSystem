package me.shijunjie.SiteAccountingSystem.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.shijunjie.SiteAccountingSystem.dao.ProjectDao;
import me.shijunjie.SiteAccountingSystem.entity.Project;
import me.shijunjie.SiteAccountingSystem.entity.ProjectExample;
import me.shijunjie.SiteAccountingSystem.mapper.ProjectMapper;

@Service
public class ProjectDaoImpl implements ProjectDao {
	
	@Autowired
	private ProjectMapper projectMapper;

	@Override
	public void addProject(String projectName) {
		Project entity = new Project();
		entity.setProjectName(projectName);
		projectMapper.insertSelective(entity);
	}

	@Override
	public List<Project> selectAllProjects() {
		return projectMapper.selectByExample(new ProjectExample());
	}

}
