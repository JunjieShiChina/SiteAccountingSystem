package me.shijunjie.SiteAccountingSystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.util.Iterator;

public class EmployeeHourExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee_hour
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee_hour
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee_hour
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee_hour
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public EmployeeHourExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee_hour
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee_hour
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee_hour
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee_hour
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee_hour
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee_hour
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee_hour
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee_hour
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee_hour
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee_hour
	 * @mbg.generated  Fri Nov 30 15:54:26 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee_hour
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

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

		public Criteria andEmployeeIdIsNull() {
			addCriterion("employee_id is null");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdIsNotNull() {
			addCriterion("employee_id is not null");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdEqualTo(Integer value) {
			addCriterion("employee_id =", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdNotEqualTo(Integer value) {
			addCriterion("employee_id <>", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdGreaterThan(Integer value) {
			addCriterion("employee_id >", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("employee_id >=", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdLessThan(Integer value) {
			addCriterion("employee_id <", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
			addCriterion("employee_id <=", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdIn(List<Integer> values) {
			addCriterion("employee_id in", values, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdNotIn(List<Integer> values) {
			addCriterion("employee_id not in", values, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
			addCriterion("employee_id between", value1, value2, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
			addCriterion("employee_id not between", value1, value2, "employeeId");
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

		public Criteria andWorkingTimeIsNull() {
			addCriterion("working_time is null");
			return (Criteria) this;
		}

		public Criteria andWorkingTimeIsNotNull() {
			addCriterion("working_time is not null");
			return (Criteria) this;
		}

		public Criteria andWorkingTimeEqualTo(BigDecimal value) {
			addCriterion("working_time =", value, "workingTime");
			return (Criteria) this;
		}

		public Criteria andWorkingTimeNotEqualTo(BigDecimal value) {
			addCriterion("working_time <>", value, "workingTime");
			return (Criteria) this;
		}

		public Criteria andWorkingTimeGreaterThan(BigDecimal value) {
			addCriterion("working_time >", value, "workingTime");
			return (Criteria) this;
		}

		public Criteria andWorkingTimeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("working_time >=", value, "workingTime");
			return (Criteria) this;
		}

		public Criteria andWorkingTimeLessThan(BigDecimal value) {
			addCriterion("working_time <", value, "workingTime");
			return (Criteria) this;
		}

		public Criteria andWorkingTimeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("working_time <=", value, "workingTime");
			return (Criteria) this;
		}

		public Criteria andWorkingTimeIn(List<BigDecimal> values) {
			addCriterion("working_time in", values, "workingTime");
			return (Criteria) this;
		}

		public Criteria andWorkingTimeNotIn(List<BigDecimal> values) {
			addCriterion("working_time not in", values, "workingTime");
			return (Criteria) this;
		}

		public Criteria andWorkingTimeBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("working_time between", value1, value2, "workingTime");
			return (Criteria) this;
		}

		public Criteria andWorkingTimeNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("working_time not between", value1, value2, "workingTime");
			return (Criteria) this;
		}

		public Criteria andWorkingDateIsNull() {
			addCriterion("working_date is null");
			return (Criteria) this;
		}

		public Criteria andWorkingDateIsNotNull() {
			addCriterion("working_date is not null");
			return (Criteria) this;
		}

		public Criteria andWorkingDateEqualTo(Date value) {
			addCriterionForJDBCDate("working_date =", value, "workingDate");
			return (Criteria) this;
		}

		public Criteria andWorkingDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("working_date <>", value, "workingDate");
			return (Criteria) this;
		}

		public Criteria andWorkingDateGreaterThan(Date value) {
			addCriterionForJDBCDate("working_date >", value, "workingDate");
			return (Criteria) this;
		}

		public Criteria andWorkingDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("working_date >=", value, "workingDate");
			return (Criteria) this;
		}

		public Criteria andWorkingDateLessThan(Date value) {
			addCriterionForJDBCDate("working_date <", value, "workingDate");
			return (Criteria) this;
		}

		public Criteria andWorkingDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("working_date <=", value, "workingDate");
			return (Criteria) this;
		}

		public Criteria andWorkingDateIn(List<Date> values) {
			addCriterionForJDBCDate("working_date in", values, "workingDate");
			return (Criteria) this;
		}

		public Criteria andWorkingDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("working_date not in", values, "workingDate");
			return (Criteria) this;
		}

		public Criteria andWorkingDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("working_date between", value1, value2, "workingDate");
			return (Criteria) this;
		}

		public Criteria andWorkingDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("working_date not between", value1, value2, "workingDate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee_hour
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
     * This class corresponds to the database table employee_hour
     *
     * @mbg.generated do_not_delete_during_merge Wed Nov 28 16:41:37 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}