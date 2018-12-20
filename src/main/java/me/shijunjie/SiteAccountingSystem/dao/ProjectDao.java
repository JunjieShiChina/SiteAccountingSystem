package me.shijunjie.SiteAccountingSystem.dao;

import java.util.List;

import me.shijunjie.SiteAccountingSystem.entity.Project;

public interface ProjectDao {
	public void addProject(String projectName);

	public List<Project> selectAllProjects();
}
