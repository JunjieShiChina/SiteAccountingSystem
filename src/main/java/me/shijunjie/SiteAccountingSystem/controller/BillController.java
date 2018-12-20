package me.shijunjie.SiteAccountingSystem.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;
import me.shijunjie.SiteAccountingSystem.bean.AmountBean;
import me.shijunjie.SiteAccountingSystem.bean.AmountBean4Excel;
import me.shijunjie.SiteAccountingSystem.bean.BillBean;
import me.shijunjie.SiteAccountingSystem.bean.Response;
import me.shijunjie.SiteAccountingSystem.service.BillService;
import me.shijunjie.SiteAccountingSystem.service.EmployeeService;
import me.shijunjie.SiteAccountingSystem.util.ExportExcelUtils;
import net.sf.json.JSONObject;

@Controller
@Slf4j
public class BillController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private BillService billService;
	
	@GetMapping("/caculate")
	@ResponseBody
	public BillBean caculate(String employeeId) {
		log.info("BillController.caculate param:employeeId:{}", employeeId);
		BillBean billBean = new BillBean();
		List<AmountBean> rows = billService.getAmountBeanByEmployeeId(employeeId);
		billBean.setRows(rows);
		List<Map<String,Object>> footer = billService.cacuLate(rows, employeeId);
		billBean.setFooter(footer);
		billBean.setTotal(rows.size());
		return billBean;	
	}
	
	@GetMapping("/exportCaculate")
	@ResponseBody
	public void exportCaculate(String employeeId, HttpServletResponse response) throws Exception {
		ArrayList<AmountBean4Excel> exportData = new ArrayList<>();
		String employeeName = employeeService.getEmployeeNameById(employeeId);
		List<AmountBean> rows = billService.getAmountBeanByEmployeeId(employeeId);
		for (AmountBean amountBean : rows) {
			exportData.add(new AmountBean4Excel(amountBean));
		}
		List<Map<String,Object>> footer = billService.cacuLate(rows, employeeId);
		for (Map<String, Object> map : footer) {
			AmountBean4Excel foot = new AmountBean4Excel();
			foot.setAmountType(map.get("amountType").toString());
			foot.setWorkingTime(map.get("workingTime").toString());
			foot.setLogDate(map.get("logDate").toString());
			foot.setAmount(map.get("amount").toString());
			exportData.add(foot);
		}
        //导出操作
        ExportExcelUtils.exportExcel(exportData,"结账账单-"+employeeName,"结账账单",AmountBean4Excel.class,"结账账单_"+employeeName+".xls",response);
	}
	
	@GetMapping("/caculateResult")
	@ResponseBody
	public String caculateResult(String employeeId) {
		log.info("BillController.caculateResult param:employeeId:{}", employeeId);
		String resultJsonStr = billService.getCaculateResultByEmployeeId(employeeId);
		return resultJsonStr;	
	}
	
	@GetMapping("/exportCaculateResult")
	@ResponseBody
	public void exportCaculateResult(String employeeId, HttpServletResponse response) throws Exception {
		ArrayList<AmountBean4Excel> exportData = new ArrayList<>();
		
		String resultJsonStr = billService.getCaculateResultByEmployeeId(employeeId);
		Map<String, Class> classMap = new HashMap<String, Class>();
		classMap.put("rows", AmountBean.class);
		classMap.put("footer", Map.class);
		JSONObject fromObject = JSONObject.fromObject(resultJsonStr);
		BillBean billBean = (BillBean) JSONObject.toBean(fromObject, BillBean.class, classMap);
		
		String employeeName = employeeService.getEmployeeNameById(employeeId);
		List<AmountBean> rows = billBean.getRows();
		for (AmountBean amountBean : rows) {
			exportData.add(new AmountBean4Excel(amountBean));
		}
		List<Map<String,Object>> footer = billBean.getFooter();
		for (Map<String, Object> map : footer) {
			AmountBean4Excel foot = new AmountBean4Excel();
			foot.setAmountType(map.get("amountType").toString());
			foot.setWorkingTime(map.get("workingTime").toString());
			foot.setLogDate(map.get("logDate").toString());
			foot.setAmount(map.get("amount").toString());
			exportData.add(foot);
		}
        //导出操作
        ExportExcelUtils.exportExcel(exportData,"结账账单-"+employeeName,"结账账单",AmountBean4Excel.class,"结账账单_"+employeeName+".xls",response);
	}
	
	@PostMapping("/comfirmCaculate")
	@ResponseBody
	public Response comfirmCaculate(String employeeId, String jsonStr) {
		log.info("BillController.comfirmCaculate param:employeeId:{}", employeeId);
		billService.comfirmCaculate(employeeId, jsonStr);
		return Response.ok("结账成功");
	}
	
}
