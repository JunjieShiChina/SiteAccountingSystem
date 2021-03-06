package me.shijunjie.SiteAccountingSystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public EmployeeExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andEmployeeNameIsNull() {
			addCriterion("employee_name is null");
			return (Criteria) this;
		}

		public Criteria andEmployeeNameIsNotNull() {
			addCriterion("employee_name is not null");
			return (Criteria) this;
		}

		public Criteria andEmployeeNameEqualTo(String value) {
			addCriterion("employee_name =", value, "employeeName");
			return (Criteria) this;
		}

		public Criteria andEmployeeNameNotEqualTo(String value) {
			addCriterion("employee_name <>", value, "employeeName");
			return (Criteria) this;
		}

		public Criteria andEmployeeNameGreaterThan(String value) {
			addCriterion("employee_name >", value, "employeeName");
			return (Criteria) this;
		}

		public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
			addCriterion("employee_name >=", value, "employeeName");
			return (Criteria) this;
		}

		public Criteria andEmployeeNameLessThan(String value) {
			addCriterion("employee_name <", value, "employeeName");
			return (Criteria) this;
		}

		public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
			addCriterion("employee_name <=", value, "employeeName");
			return (Criteria) this;
		}

		public Criteria andEmployeeNameLike(String value) {
			addCriterion("employee_name like", value, "employeeName");
			return (Criteria) this;
		}

		public Criteria andEmployeeNameNotLike(String value) {
			addCriterion("employee_name not like", value, "employeeName");
			return (Criteria) this;
		}

		public Criteria andEmployeeNameIn(List<String> values) {
			addCriterion("employee_name in", values, "employeeName");
			return (Criteria) this;
		}

		public Criteria andEmployeeNameNotIn(List<String> values) {
			addCriterion("employee_name not in", values, "employeeName");
			return (Criteria) this;
		}

		public Criteria andEmployeeNameBetween(String value1, String value2) {
			addCriterion("employee_name between", value1, value2, "employeeName");
			return (Criteria) this;
		}

		public Criteria andEmployeeNameNotBetween(String value1, String value2) {
			addCriterion("employee_name not between", value1, value2, "employeeName");
			return (Criteria) this;
		}

		public Criteria andAddTimeIsNull() {
			addCriterion("add_time is null");
			return (Criteria) this;
		}

		public Criteria andAddTimeIsNotNull() {
			addCriterion("add_time is not null");
			return (Criteria) this;
		}

		public Criteria andAddTimeEqualTo(Date value) {
			addCriterion("add_time =", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotEqualTo(Date value) {
			addCriterion("add_time <>", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeGreaterThan(Date value) {
			addCriterion("add_time >", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("add_time >=", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeLessThan(Date value) {
			addCriterion("add_time <", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeLessThanOrEqualTo(Date value) {
			addCriterion("add_time <=", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeIn(List<Date> values) {
			addCriterion("add_time in", values, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotIn(List<Date> values) {
			addCriterion("add_time not in", values, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeBetween(Date value1, Date value2) {
			addCriterion("add_time between", value1, value2, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotBetween(Date value1, Date value2) {
			addCriterion("add_time not between", value1, value2, "addTime");
			return (Criteria) this;
		}

		public Criteria andHourSalaryIsNull() {
			addCriterion("hour_salary is null");
			return (Criteria) this;
		}

		public Criteria andHourSalaryIsNotNull() {
			addCriterion("hour_salary is not null");
			return (Criteria) this;
		}

		public Criteria andHourSalaryEqualTo(Integer value) {
			addCriterion("hour_salary =", value, "hourSalary");
			return (Criteria) this;
		}

		public Criteria andHourSalaryNotEqualTo(Integer value) {
			addCriterion("hour_salary <>", value, "hourSalary");
			return (Criteria) this;
		}

		public Criteria andHourSalaryGreaterThan(Integer value) {
			addCriterion("hour_salary >", value, "hourSalary");
			return (Criteria) this;
		}

		public Criteria andHourSalaryGreaterThanOrEqualTo(Integer value) {
			addCriterion("hour_salary >=", value, "hourSalary");
			return (Criteria) this;
		}

		public Criteria andHourSalaryLessThan(Integer value) {
			addCriterion("hour_salary <", value, "hourSalary");
			return (Criteria) this;
		}

		public Criteria andHourSalaryLessThanOrEqualTo(Integer value) {
			addCriterion("hour_salary <=", value, "hourSalary");
			return (Criteria) this;
		}

		public Criteria andHourSalaryIn(List<Integer> values) {
			addCriterion("hour_salary in", values, "hourSalary");
			return (Criteria) this;
		}

		public Criteria andHourSalaryNotIn(List<Integer> values) {
			addCriterion("hour_salary not in", values, "hourSalary");
			return (Criteria) this;
		}

		public Criteria andHourSalaryBetween(Integer value1, Integer value2) {
			addCriterion("hour_salary between", value1, value2, "hourSalary");
			return (Criteria) this;
		}

		public Criteria andHourSalaryNotBetween(Integer value1, Integer value2) {
			addCriterion("hour_salary not between", value1, value2, "hourSalary");
			return (Criteria) this;
		}

		public Criteria andProjectIdIsNull() {
			addCriterion("project_id is null");
			return (Criteria) this;
		}

		public Criteria andProjectIdIsNotNull() {
			addCriterion("project_id is not null");
			return (Criteria) this;
		}

		public Criteria andProjectIdEqualTo(Integer value) {
			addCriterion("project_id =", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdNotEqualTo(Integer value) {
			addCriterion("project_id <>", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdGreaterThan(Integer value) {
			addCriterion("project_id >", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("project_id >=", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdLessThan(Integer value) {
			addCriterion("project_id <", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
			addCriterion("project_id <=", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdIn(List<Integer> values) {
			addCriterion("project_id in", values, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdNotIn(List<Integer> values) {
			addCriterion("project_id not in", values, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdBetween(Integer value1, Integer value2) {
			addCriterion("project_id between", value1, value2, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
			addCriterion("project_id not between", value1, value2, "projectId");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberIsNull() {
			addCriterion("phone_number is null");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberIsNotNull() {
			addCriterion("phone_number is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberEqualTo(String value) {
			addCriterion("phone_number =", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberNotEqualTo(String value) {
			addCriterion("phone_number <>", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberGreaterThan(String value) {
			addCriterion("phone_number >", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
			addCriterion("phone_number >=", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberLessThan(String value) {
			addCriterion("phone_number <", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
			addCriterion("phone_number <=", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberLike(String value) {
			addCriterion("phone_number like", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberNotLike(String value) {
			addCriterion("phone_number not like", value, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberIn(List<String> values) {
			addCriterion("phone_number in", values, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberNotIn(List<String> values) {
			addCriterion("phone_number not in", values, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberBetween(String value1, String value2) {
			addCriterion("phone_number between", value1, value2, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andPhoneNumberNotBetween(String value1, String value2) {
			addCriterion("phone_number not between", value1, value2, "phoneNumber");
			return (Criteria) this;
		}

		public Criteria andFinishFlagIsNull() {
			addCriterion("finish_flag is null");
			return (Criteria) this;
		}

		public Criteria andFinishFlagIsNotNull() {
			addCriterion("finish_flag is not null");
			return (Criteria) this;
		}

		public Criteria andFinishFlagEqualTo(Integer value) {
			addCriterion("finish_flag =", value, "finishFlag");
			return (Criteria) this;
		}

		public Criteria andFinishFlagNotEqualTo(Integer value) {
			addCriterion("finish_flag <>", value, "finishFlag");
			return (Criteria) this;
		}

		public Criteria andFinishFlagGreaterThan(Integer value) {
			addCriterion("finish_flag >", value, "finishFlag");
			return (Criteria) this;
		}

		public Criteria andFinishFlagGreaterThanOrEqualTo(Integer value) {
			addCriterion("finish_flag >=", value, "finishFlag");
			return (Criteria) this;
		}

		public Criteria andFinishFlagLessThan(Integer value) {
			addCriterion("finish_flag <", value, "finishFlag");
			return (Criteria) this;
		}

		public Criteria andFinishFlagLessThanOrEqualTo(Integer value) {
			addCriterion("finish_flag <=", value, "finishFlag");
			return (Criteria) this;
		}

		public Criteria andFinishFlagIn(List<Integer> values) {
			addCriterion("finish_flag in", values, "finishFlag");
			return (Criteria) this;
		}

		public Criteria andFinishFlagNotIn(List<Integer> values) {
			addCriterion("finish_flag not in", values, "finishFlag");
			return (Criteria) this;
		}

		public Criteria andFinishFlagBetween(Integer value1, Integer value2) {
			addCriterion("finish_flag between", value1, value2, "finishFlag");
			return (Criteria) this;
		}

		public Criteria andFinishFlagNotBetween(Integer value1, Integer value2) {
			addCriterion("finish_flag not between", value1, value2, "finishFlag");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table employee
     *
     * @mbg.generated do_not_delete_during_merge Tue Nov 27 17:02:24 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}