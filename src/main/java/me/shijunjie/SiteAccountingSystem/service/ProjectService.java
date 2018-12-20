package me.shijunjie.SiteAccountingSystem.service;

import java.util.List;

import me.shijunjie.SiteAccountingSystem.entity.Project;

public interface ProjectService {
	public void addProject(String projectName);

	public List<Project> getAllProjects();
}
