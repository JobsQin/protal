package cn.qiantongmuseum.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BemaExample {
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

	public BemaExample() {
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
            addCriterion("bema.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("bema.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("bema.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("bema.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("bema.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bema.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("bema.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("bema.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("bema.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("bema.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("bema.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("bema.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBemaTitleIsNull() {
            addCriterion("bema.bemaTitle is null");
            return (Criteria) this;
        }

        public Criteria andBemaTitleIsNotNull() {
            addCriterion("bema.bemaTitle is not null");
            return (Criteria) this;
        }

        public Criteria andBemaTitleEqualTo(String value) {
            addCriterion("bema.bemaTitle =", value, "bemaTitle");
            return (Criteria) this;
        }

        public Criteria andBemaTitleNotEqualTo(String value) {
            addCriterion("bema.bemaTitle <>", value, "bemaTitle");
            return (Criteria) this;
        }

        public Criteria andBemaTitleGreaterThan(String value) {
            addCriterion("bema.bemaTitle >", value, "bemaTitle");
            return (Criteria) this;
        }

        public Criteria andBemaTitleGreaterThanOrEqualTo(String value) {
            addCriterion("bema.bemaTitle >=", value, "bemaTitle");
            return (Criteria) this;
        }

        public Criteria andBemaTitleLessThan(String value) {
            addCriterion("bema.bemaTitle <", value, "bemaTitle");
            return (Criteria) this;
        }

        public Criteria andBemaTitleLessThanOrEqualTo(String value) {
            addCriterion("bema.bemaTitle <=", value, "bemaTitle");
            return (Criteria) this;
        }

        public Criteria andBemaTitleLike(String value) {
            addCriterion("bema.bemaTitle like", value, "bemaTitle");
            return (Criteria) this;
        }

        public Criteria andBemaTitleNotLike(String value) {
            addCriterion("bema.bemaTitle not like", value, "bemaTitle");
            return (Criteria) this;
        }

        public Criteria andBemaTitleIn(List<String> values) {
            addCriterion("bema.bemaTitle in", values, "bemaTitle");
            return (Criteria) this;
        }

        public Criteria andBemaTitleNotIn(List<String> values) {
            addCriterion("bema.bemaTitle not in", values, "bemaTitle");
            return (Criteria) this;
        }

        public Criteria andBemaTitleBetween(String value1, String value2) {
            addCriterion("bema.bemaTitle between", value1, value2, "bemaTitle");
            return (Criteria) this;
        }

        public Criteria andBemaTitleNotBetween(String value1, String value2) {
            addCriterion("bema.bemaTitle not between", value1, value2, "bemaTitle");
            return (Criteria) this;
        }

        public Criteria andBemaTimeIsNull() {
            addCriterion("bema.bemaTime is null");
            return (Criteria) this;
        }

        public Criteria andBemaTimeIsNotNull() {
            addCriterion("bema.bemaTime is not null");
            return (Criteria) this;
        }

        public Criteria andBemaTimeEqualTo(Date value) {
            addCriterion("bema.bemaTime =", value, "bemaTime");
            return (Criteria) this;
        }

        public Criteria andBemaTimeNotEqualTo(Date value) {
            addCriterion("bema.bemaTime <>", value, "bemaTime");
            return (Criteria) this;
        }

        public Criteria andBemaTimeGreaterThan(Date value) {
            addCriterion("bema.bemaTime >", value, "bemaTime");
            return (Criteria) this;
        }

        public Criteria andBemaTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bema.bemaTime >=", value, "bemaTime");
            return (Criteria) this;
        }

        public Criteria andBemaTimeLessThan(Date value) {
            addCriterion("bema.bemaTime <", value, "bemaTime");
            return (Criteria) this;
        }

        public Criteria andBemaTimeLessThanOrEqualTo(Date value) {
            addCriterion("bema.bemaTime <=", value, "bemaTime");
            return (Criteria) this;
        }

        public Criteria andBemaTimeIn(List<Date> values) {
            addCriterion("bema.bemaTime in", values, "bemaTime");
            return (Criteria) this;
        }

        public Criteria andBemaTimeNotIn(List<Date> values) {
            addCriterion("bema.bemaTime not in", values, "bemaTime");
            return (Criteria) this;
        }

        public Criteria andBemaTimeBetween(Date value1, Date value2) {
            addCriterion("bema.bemaTime between", value1, value2, "bemaTime");
            return (Criteria) this;
        }

        public Criteria andBemaTimeNotBetween(Date value1, Date value2) {
            addCriterion("bema.bemaTime not between", value1, value2, "bemaTime");
            return (Criteria) this;
        }

        public Criteria andBemaAddIsNull() {
            addCriterion("bema.bemaAdd is null");
            return (Criteria) this;
        }

        public Criteria andBemaAddIsNotNull() {
            addCriterion("bema.bemaAdd is not null");
            return (Criteria) this;
        }

        public Criteria andBemaAddEqualTo(String value) {
            addCriterion("bema.bemaAdd =", value, "bemaAdd");
            return (Criteria) this;
        }

        public Criteria andBemaAddNotEqualTo(String value) {
            addCriterion("bema.bemaAdd <>", value, "bemaAdd");
            return (Criteria) this;
        }

        public Criteria andBemaAddGreaterThan(String value) {
            addCriterion("bema.bemaAdd >", value, "bemaAdd");
            return (Criteria) this;
        }

        public Criteria andBemaAddGreaterThanOrEqualTo(String value) {
            addCriterion("bema.bemaAdd >=", value, "bemaAdd");
            return (Criteria) this;
        }

        public Criteria andBemaAddLessThan(String value) {
            addCriterion("bema.bemaAdd <", value, "bemaAdd");
            return (Criteria) this;
        }

        public Criteria andBemaAddLessThanOrEqualTo(String value) {
            addCriterion("bema.bemaAdd <=", value, "bemaAdd");
            return (Criteria) this;
        }

        public Criteria andBemaAddLike(String value) {
            addCriterion("bema.bemaAdd like", value, "bemaAdd");
            return (Criteria) this;
        }

        public Criteria andBemaAddNotLike(String value) {
            addCriterion("bema.bemaAdd not like", value, "bemaAdd");
            return (Criteria) this;
        }

        public Criteria andBemaAddIn(List<String> values) {
            addCriterion("bema.bemaAdd in", values, "bemaAdd");
            return (Criteria) this;
        }

        public Criteria andBemaAddNotIn(List<String> values) {
            addCriterion("bema.bemaAdd not in", values, "bemaAdd");
            return (Criteria) this;
        }

        public Criteria andBemaAddBetween(String value1, String value2) {
            addCriterion("bema.bemaAdd between", value1, value2, "bemaAdd");
            return (Criteria) this;
        }

        public Criteria andBemaAddNotBetween(String value1, String value2) {
            addCriterion("bema.bemaAdd not between", value1, value2, "bemaAdd");
            return (Criteria) this;
        }

        public Criteria andBemaMobileIsNull() {
            addCriterion("bema.bemaMobile is null");
            return (Criteria) this;
        }

        public Criteria andBemaMobileIsNotNull() {
            addCriterion("bema.bemaMobile is not null");
            return (Criteria) this;
        }

        public Criteria andBemaMobileEqualTo(String value) {
            addCriterion("bema.bemaMobile =", value, "bemaMobile");
            return (Criteria) this;
        }

        public Criteria andBemaMobileNotEqualTo(String value) {
            addCriterion("bema.bemaMobile <>", value, "bemaMobile");
            return (Criteria) this;
        }

        public Criteria andBemaMobileGreaterThan(String value) {
            addCriterion("bema.bemaMobile >", value, "bemaMobile");
            return (Criteria) this;
        }

        public Criteria andBemaMobileGreaterThanOrEqualTo(String value) {
            addCriterion("bema.bemaMobile >=", value, "bemaMobile");
            return (Criteria) this;
        }

        public Criteria andBemaMobileLessThan(String value) {
            addCriterion("bema.bemaMobile <", value, "bemaMobile");
            return (Criteria) this;
        }

        public Criteria andBemaMobileLessThanOrEqualTo(String value) {
            addCriterion("bema.bemaMobile <=", value, "bemaMobile");
            return (Criteria) this;
        }

        public Criteria andBemaMobileLike(String value) {
            addCriterion("bema.bemaMobile like", value, "bemaMobile");
            return (Criteria) this;
        }

        public Criteria andBemaMobileNotLike(String value) {
            addCriterion("bema.bemaMobile not like", value, "bemaMobile");
            return (Criteria) this;
        }

        public Criteria andBemaMobileIn(List<String> values) {
            addCriterion("bema.bemaMobile in", values, "bemaMobile");
            return (Criteria) this;
        }

        public Criteria andBemaMobileNotIn(List<String> values) {
            addCriterion("bema.bemaMobile not in", values, "bemaMobile");
            return (Criteria) this;
        }

        public Criteria andBemaMobileBetween(String value1, String value2) {
            addCriterion("bema.bemaMobile between", value1, value2, "bemaMobile");
            return (Criteria) this;
        }

        public Criteria andBemaMobileNotBetween(String value1, String value2) {
            addCriterion("bema.bemaMobile not between", value1, value2, "bemaMobile");
            return (Criteria) this;
        }

        public Criteria andBemaAgeIsNull() {
            addCriterion("bema.bemaAge is null");
            return (Criteria) this;
        }

        public Criteria andBemaAgeIsNotNull() {
            addCriterion("bema.bemaAge is not null");
            return (Criteria) this;
        }

        public Criteria andBemaAgeEqualTo(String value) {
            addCriterion("bema.bemaAge =", value, "bemaAge");
            return (Criteria) this;
        }

        public Criteria andBemaAgeNotEqualTo(String value) {
            addCriterion("bema.bemaAge <>", value, "bemaAge");
            return (Criteria) this;
        }

        public Criteria andBemaAgeGreaterThan(String value) {
            addCriterion("bema.bemaAge >", value, "bemaAge");
            return (Criteria) this;
        }

        public Criteria andBemaAgeGreaterThanOrEqualTo(String value) {
            addCriterion("bema.bemaAge >=", value, "bemaAge");
            return (Criteria) this;
        }

        public Criteria andBemaAgeLessThan(String value) {
            addCriterion("bema.bemaAge <", value, "bemaAge");
            return (Criteria) this;
        }

        public Criteria andBemaAgeLessThanOrEqualTo(String value) {
            addCriterion("bema.bemaAge <=", value, "bemaAge");
            return (Criteria) this;
        }

        public Criteria andBemaAgeLike(String value) {
            addCriterion("bema.bemaAge like", value, "bemaAge");
            return (Criteria) this;
        }

        public Criteria andBemaAgeNotLike(String value) {
            addCriterion("bema.bemaAge not like", value, "bemaAge");
            return (Criteria) this;
        }

        public Criteria andBemaAgeIn(List<String> values) {
            addCriterion("bema.bemaAge in", values, "bemaAge");
            return (Criteria) this;
        }

        public Criteria andBemaAgeNotIn(List<String> values) {
            addCriterion("bema.bemaAge not in", values, "bemaAge");
            return (Criteria) this;
        }

        public Criteria andBemaAgeBetween(String value1, String value2) {
            addCriterion("bema.bemaAge between", value1, value2, "bemaAge");
            return (Criteria) this;
        }

        public Criteria andBemaAgeNotBetween(String value1, String value2) {
            addCriterion("bema.bemaAge not between", value1, value2, "bemaAge");
            return (Criteria) this;
        }

        public Criteria andBemaFileIsNull() {
            addCriterion("bema.bemaFile is null");
            return (Criteria) this;
        }

        public Criteria andBemaFileIsNotNull() {
            addCriterion("bema.bemaFile is not null");
            return (Criteria) this;
        }

        public Criteria andBemaFileEqualTo(String value) {
            addCriterion("bema.bemaFile =", value, "bemaFile");
            return (Criteria) this;
        }

        public Criteria andBemaFileNotEqualTo(String value) {
            addCriterion("bema.bemaFile <>", value, "bemaFile");
            return (Criteria) this;
        }

        public Criteria andBemaFileGreaterThan(String value) {
            addCriterion("bema.bemaFile >", value, "bemaFile");
            return (Criteria) this;
        }

        public Criteria andBemaFileGreaterThanOrEqualTo(String value) {
            addCriterion("bema.bemaFile >=", value, "bemaFile");
            return (Criteria) this;
        }

        public Criteria andBemaFileLessThan(String value) {
            addCriterion("bema.bemaFile <", value, "bemaFile");
            return (Criteria) this;
        }

        public Criteria andBemaFileLessThanOrEqualTo(String value) {
            addCriterion("bema.bemaFile <=", value, "bemaFile");
            return (Criteria) this;
        }

        public Criteria andBemaFileLike(String value) {
            addCriterion("bema.bemaFile like", value, "bemaFile");
            return (Criteria) this;
        }

        public Criteria andBemaFileNotLike(String value) {
            addCriterion("bema.bemaFile not like", value, "bemaFile");
            return (Criteria) this;
        }

        public Criteria andBemaFileIn(List<String> values) {
            addCriterion("bema.bemaFile in", values, "bemaFile");
            return (Criteria) this;
        }

        public Criteria andBemaFileNotIn(List<String> values) {
            addCriterion("bema.bemaFile not in", values, "bemaFile");
            return (Criteria) this;
        }

        public Criteria andBemaFileBetween(String value1, String value2) {
            addCriterion("bema.bemaFile between", value1, value2, "bemaFile");
            return (Criteria) this;
        }

        public Criteria andBemaFileNotBetween(String value1, String value2) {
            addCriterion("bema.bemaFile not between", value1, value2, "bemaFile");
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