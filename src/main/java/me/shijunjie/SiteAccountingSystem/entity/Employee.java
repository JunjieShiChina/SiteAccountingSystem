package me.shijunjie.SiteAccountingSystem.entity;

import java.util.Date;

public class Employee {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.id
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.employee_name
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	private String employeeName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.add_time
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	private Date addTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.hour_salary
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	private Integer hourSalary;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.project_id
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	private Integer projectId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.phone_number
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	private String phoneNumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.finish_flag
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	private Integer finishFlag;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.id
	 * @return  the value of employee.id
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.id
	 * @param id  the value for employee.id
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.employee_name
	 * @return  the value of employee.employee_name
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.employee_name
	 * @param employeeName  the value for employee.employee_name
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.add_time
	 * @return  the value of employee.add_time
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public Date getAddTime() {
		return addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.add_time
	 * @param addTime  the value for employee.add_time
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.hour_salary
	 * @return  the value of employee.hour_salary
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public Integer getHourSalary() {
		return hourSalary;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.hour_salary
	 * @param hourSalary  the value for employee.hour_salary
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public void setHourSalary(Integer hourSalary) {
		this.hourSalary = hourSalary;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.project_id
	 * @return  the value of employee.project_id
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public Integer getProjectId() {
		return projectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.project_id
	 * @param projectId  the value for employee.project_id
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.phone_number
	 * @return  the value of employee.phone_number
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.phone_number
	 * @param phoneNumber  the value for employee.phone_number
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.finish_flag
	 * @return  the value of employee.finish_flag
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public Integer getFinishFlag() {
		return finishFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.finish_flag
	 * @param finishFlag  the value for employee.finish_flag
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public void setFinishFlag(Integer finishFlag) {
		this.finishFlag = finishFlag;
	}
}