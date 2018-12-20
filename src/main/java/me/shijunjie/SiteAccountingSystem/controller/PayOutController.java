package me.shijunjie.SiteAccountingSystem.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import me.shijunjie.SiteAccountingSystem.entity.PayOut;
import me.shijunjie.SiteAccountingSystem.service.PayOutService;

@Controller
@Slf4j
public class PayOutController {
	
	@Autowired
	private PayOutService payOutService;
	
	@GetMapping("/payList")
	@ResponseBody
	public EUDataGridResult payList(String employeeId, Integer page, Integer rows) {
		log.info("PayOutController.payList.param employeeId:{}", employeeId);
		EUDataGridResult result = new EUDataGridResult();
		PageHelper.startPage(page, rows);
		List<PayOut> hours = payOutService.getPaysByEmployeeId(employeeId);
		PageInfo<PayOut> pageInfo = new PageInfo<PayOut>(hours);
		result.setRows(pageInfo.getList());
		result.setTotal(pageInfo.getTotal());
		return result;
	}
	
	@PostMapping("/addPayOut")
	@ResponseBody
	public Response addPayOut(String employeeId, String employeeName, String payOutAmount, String payOutDate) throws ParseException {
		log.info("PayOutController.addPayOut:{},{},{},{}", employeeId, employeeName, payOutAmount, payOutDate);
		PayOut payOut = new PayOut();
		payOut.setEmployeeId(Integer.parseInt(employeeId));
		payOut.setPayOutAmount(Integer.parseInt(payOutAmount));
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		payOut.setPayOutDate(format.parse(payOutDate));
		payOutService.addPayOut(payOut);
		return Response.ok("成功");
	}

	@PostMapping("/delPayOut")
	@ResponseBody
	public Response delPayOut(String payId) throws ParseException {
		log.info("PayOutController.delPayOut:{}", payId);
		payOutService.delPayOut(payId);
		return Response.ok("成功");
	}
}
