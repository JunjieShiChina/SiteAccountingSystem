package me.shijunjie.SiteAccountingSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lombok.extern.slf4j.Slf4j;
import me.shijunjie.SiteAccountingSystem.bean.EUDataGridResult;
import me.shijunjie.SiteAccountingSystem.bean.Response;
import me.shijunjie.SiteAccountingSystem.entity.Project;
import me.shijunjie.SiteAccountingSystem.service.ProjectService;

@Controller
@Slf4j
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("toAddProject")
	public String toAddProject() {
		return "view/addproject";
	}
	
	@PostMapping("addProject")
	@ResponseBody
	public Response addProject(String projectName) {
		log.info("ProjectController.addProject.param projectName:{}", projectName);
		projectService.addProject(projectName);
		return Response.ok("添加成功");
	}
	
	@GetMapping("toProjectList")
	public String toProjectList() {
		return "view/projectlist";
	}
	
	@GetMapping("projectList")
	@ResponseBody
	public EUDataGridResult projectList(Integer page, Integer rows) {
		log.info("ProjectController.projectList");
		EUDataGridResult result = new EUDataGridResult();
		PageHelper.startPage(page, rows);
		List<Project> projects = projectService.getAllProjects();
		PageInfo<Project> pageInfo = new PageInfo<Project>(projects);
		result.setRows(pageInfo.getList());
		result.setTotal(pageInfo.getTotal());
		return result;
	}
}
