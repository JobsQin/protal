package cn.qiantongmuseum.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FormsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer startRow;
    
    protected Integer pageSize;
    
    public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public FormsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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
            addCriterion("forms.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("forms.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("forms.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("forms.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("forms.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("forms.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("forms.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("forms.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("forms.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("forms.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("forms.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("forms.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPostulantIdIsNull() {
            addCriterion("forms.postulantId is null");
            return (Criteria) this;
        }

        public Criteria andPostulantIdIsNotNull() {
            addCriterion("forms.postulantId is not null");
            return (Criteria) this;
        }

        public Criteria andPostulantIdEqualTo(Long value) {
            addCriterion("forms.postulantId =", value, "postulantId");
            return (Criteria) this;
        }

        public Criteria andPostulantIdNotEqualTo(Long value) {
            addCriterion("forms.postulantId <>", value, "postulantId");
            return (Criteria) this;
        }

        public Criteria andPostulantIdGreaterThan(Long value) {
            addCriterion("forms.postulantId >", value, "postulantId");
            return (Criteria) this;
        }

        public Criteria andPostulantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("forms.postulantId >=", value, "postulantId");
            return (Criteria) this;
        }

        public Criteria andPostulantIdLessThan(Long value) {
            addCriterion("forms.postulantId <", value, "postulantId");
            return (Criteria) this;
        }

        public Criteria andPostulantIdLessThanOrEqualTo(Long value) {
            addCriterion("forms.postulantId <=", value, "postulantId");
            return (Criteria) this;
        }

        public Criteria andPostulantIdIn(List<Long> values) {
            addCriterion("forms.postulantId in", values, "postulantId");
            return (Criteria) this;
        }

        public Criteria andPostulantIdNotIn(List<Long> values) {
            addCriterion("forms.postulantId not in", values, "postulantId");
            return (Criteria) this;
        }

        public Criteria andPostulantIdBetween(Long value1, Long value2) {
            addCriterion("forms.postulantId between", value1, value2, "postulantId");
            return (Criteria) this;
        }

        public Criteria andPostulantIdNotBetween(Long value1, Long value2) {
            addCriterion("forms.postulantId not between", value1, value2, "postulantId");
            return (Criteria) this;
        }

        public Criteria andExtTimeIdIsNull() {
            addCriterion("forms.extTimeId is null");
            return (Criteria) this;
        }

        public Criteria andExtTimeIdIsNotNull() {
            addCriterion("forms.extTimeId is not null");
            return (Criteria) this;
        }

        public Criteria andExtTimeIdEqualTo(Long value) {
            addCriterion("forms.extTimeId =", value, "extTimeId");
            return (Criteria) this;
        }

        public Criteria andExtTimeIdNotEqualTo(Long value) {
            addCriterion("forms.extTimeId <>", value, "extTimeId");
            return (Criteria) this;
        }

        public Criteria andExtTimeIdGreaterThan(Long value) {
            addCriterion("forms.extTimeId >", value, "extTimeId");
            return (Criteria) this;
        }

        public Criteria andExtTimeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("forms.extTimeId >=", value, "extTimeId");
            return (Criteria) this;
        }

        public Criteria andExtTimeIdLessThan(Long value) {
            addCriterion("forms.extTimeId <", value, "extTimeId");
            return (Criteria) this;
        }

        public Criteria andExtTimeIdLessThanOrEqualTo(Long value) {
            addCriterion("forms.extTimeId <=", value, "extTimeId");
            return (Criteria) this;
        }

        public Criteria andExtTimeIdIn(List<Long> values) {
            addCriterion("forms.extTimeId in", values, "extTimeId");
            return (Criteria) this;
        }

        public Criteria andExtTimeIdNotIn(List<Long> values) {
            addCriterion("forms.extTimeId not in", values, "extTimeId");
            return (Criteria) this;
        }

        public Criteria andExtTimeIdBetween(Long value1, Long value2) {
            addCriterion("forms.extTimeId between", value1, value2, "extTimeId");
            return (Criteria) this;
        }

        public Criteria andExtTimeIdNotBetween(Long value1, Long value2) {
            addCriterion("forms.extTimeId not between", value1, value2, "extTimeId");
            return (Criteria) this;
        }

        public Criteria andIfRegisterIsNull() {
            addCriterion("forms.ifRegister is null");
            return (Criteria) this;
        }

        public Criteria andIfRegisterIsNotNull() {
            addCriterion("forms.ifRegister is not null");
            return (Criteria) this;
        }

        public Criteria andIfRegisterEqualTo(Long value) {
            addCriterion("forms.ifRegister =", value, "ifRegister");
            return (Criteria) this;
        }

        public Criteria andIfRegisterNotEqualTo(Long value) {
            addCriterion("forms.ifRegister <>", value, "ifRegister");
            return (Criteria) this;
        }

        public Criteria andIfRegisterGreaterThan(Long value) {
            addCriterion("forms.ifRegister >", value, "ifRegister");
            return (Criteria) this;
        }

        public Criteria andIfRegisterGreaterThanOrEqualTo(Long value) {
            addCriterion("forms.ifRegister >=", value, "ifRegister");
            return (Criteria) this;
        }

        public Criteria andIfRegisterLessThan(Long value) {
            addCriterion("forms.ifRegister <", value, "ifRegister");
            return (Criteria) this;
        }

        public Criteria andIfRegisterLessThanOrEqualTo(Long value) {
            addCriterion("forms.ifRegister <=", value, "ifRegister");
            return (Criteria) this;
        }

        public Criteria andIfRegisterIn(List<Long> values) {
            addCriterion("forms.ifRegister in", values, "ifRegister");
            return (Criteria) this;
        }

        public Criteria andIfRegisterNotIn(List<Long> values) {
            addCriterion("forms.ifRegister not in", values, "ifRegister");
            return (Criteria) this;
        }

        public Criteria andIfRegisterBetween(Long value1, Long value2) {
            addCriterion("forms.ifRegister between", value1, value2, "ifRegister");
            return (Criteria) this;
        }

        public Criteria andIfRegisterNotBetween(Long value1, Long value2) {
            addCriterion("forms.ifRegister not between", value1, value2, "ifRegister");
            return (Criteria) this;
        }

        public Criteria andRegisterDataIsNull() {
            addCriterion("forms.registerData is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDataIsNotNull() {
            addCriterion("forms.registerData is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDataEqualTo(Date value) {
            addCriterion("forms.registerData =", value, "registerData");
            return (Criteria) this;
        }

        public Criteria andRegisterDataNotEqualTo(Date value) {
            addCriterion("forms.registerData <>", value, "registerData");
            return (Criteria) this;
        }

        public Criteria andRegisterDataGreaterThan(Date value) {
            addCriterion("forms.registerData >", value, "registerData");
            return (Criteria) this;
        }

        public Criteria andRegisterDataGreaterThanOrEqualTo(Date value) {
            addCriterion("forms.registerData >=", value, "registerData");
            return (Criteria) this;
        }

        public Criteria andRegisterDataLessThan(Date value) {
            addCriterion("forms.registerData <", value, "registerData");
            return (Criteria) this;
        }

        public Criteria andRegisterDataLessThanOrEqualTo(Date value) {
            addCriterion("forms.registerData <=", value, "registerData");
            return (Criteria) this;
        }

        public Criteria andRegisterDataIn(List<Date> values) {
            addCriterion("forms.registerData in", values, "registerData");
            return (Criteria) this;
        }

        public Criteria andRegisterDataNotIn(List<Date> values) {
            addCriterion("forms.registerData not in", values, "registerData");
            return (Criteria) this;
        }

        public Criteria andRegisterDataBetween(Date value1, Date value2) {
            addCriterion("forms.registerData between", value1, value2, "registerData");
            return (Criteria) this;
        }

        public Criteria andRegisterDataNotBetween(Date value1, Date value2) {
            addCriterion("forms.registerData not between", value1, value2, "registerData");
            return (Criteria) this;
        }

        public Criteria andIfNewIsNull() {
            addCriterion("forms.ifNew is null");
            return (Criteria) this;
        }

        public Criteria andIfNewIsNotNull() {
            addCriterion("forms.ifNew is not null");
            return (Criteria) this;
        }

        public Criteria andIfNewEqualTo(Long value) {
            addCriterion("forms.ifNew =", value, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewNotEqualTo(Long value) {
            addCriterion("forms.ifNew <>", value, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewGreaterThan(Long value) {
            addCriterion("forms.ifNew >", value, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewGreaterThanOrEqualTo(Long value) {
            addCriterion("forms.ifNew >=", value, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewLessThan(Long value) {
            addCriterion("forms.ifNew <", value, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewLessThanOrEqualTo(Long value) {
            addCriterion("forms.ifNew <=", value, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewIn(List<Long> values) {
            addCriterion("forms.ifNew in", values, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewNotIn(List<Long> values) {
            addCriterion("forms.ifNew not in", values, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewBetween(Long value1, Long value2) {
            addCriterion("forms.ifNew between", value1, value2, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewNotBetween(Long value1, Long value2) {
            addCriterion("forms.ifNew not between", value1, value2, "ifNew");
            return (Criteria) this;
        }

        public Criteria andFoundDataIsNull() {
            addCriterion("forms.foundData is null");
            return (Criteria) this;
        }

        public Criteria andFoundDataIsNotNull() {
            addCriterion("forms.foundData is not null");
            return (Criteria) this;
        }

        public Criteria andFoundDataEqualTo(Date value) {
            addCriterion("forms.foundData =", value, "foundData");
            return (Criteria) this;
        }

        public Criteria andFoundDataNotEqualTo(Date value) {
            addCriterion("forms.foundData <>", value, "foundData");
            return (Criteria) this;
        }

        public Criteria andFoundDataGreaterThan(Date value) {
            addCriterion("forms.foundData >", value, "foundData");
            return (Criteria) this;
        }

        public Criteria andFoundDataGreaterThanOrEqualTo(Date value) {
            addCriterion("forms.foundData >=", value, "foundData");
            return (Criteria) this;
        }

        public Criteria andFoundDataLessThan(Date value) {
            addCriterion("forms.foundData <", value, "foundData");
            return (Criteria) this;
        }

        public Criteria andFoundDataLessThanOrEqualTo(Date value) {
            addCriterion("forms.foundData <=", value, "foundData");
            return (Criteria) this;
        }

        public Criteria andFoundDataIn(List<Date> values) {
            addCriterion("forms.foundData in", values, "foundData");
            return (Criteria) this;
        }

        public Criteria andFoundDataNotIn(List<Date> values) {
            addCriterion("forms.foundData not in", values, "foundData");
            return (Criteria) this;
        }

        public Criteria andFoundDataBetween(Date value1, Date value2) {
            addCriterion("forms.foundData between", value1, value2, "foundData");
            return (Criteria) this;
        }

        public Criteria andFoundDataNotBetween(Date value1, Date value2) {
            addCriterion("forms.foundData not between", value1, value2, "foundData");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("forms.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("forms.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("forms.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("forms.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("forms.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("forms.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("forms.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("forms.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("forms.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("forms.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("forms.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("forms.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("forms.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("forms.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}