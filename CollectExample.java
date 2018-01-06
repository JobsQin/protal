package cn.qiantongmuseum.pojo;

import java.util.ArrayList;
import java.util.List;

public class CollectExample {
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

	public CollectExample() {
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
            addCriterion("collect.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("collect.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("collect.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("collect.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("collect.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("collect.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("collect.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("collect.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("collect.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("collect.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("collect.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("collect.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCollNameIsNull() {
            addCriterion("collect.collName is null");
            return (Criteria) this;
        }

        public Criteria andCollNameIsNotNull() {
            addCriterion("collect.collName is not null");
            return (Criteria) this;
        }

        public Criteria andCollNameEqualTo(String value) {
            addCriterion("collect.collName =", value, "collName");
            return (Criteria) this;
        }

        public Criteria andCollNameNotEqualTo(String value) {
            addCriterion("collect.collName <>", value, "collName");
            return (Criteria) this;
        }

        public Criteria andCollNameGreaterThan(String value) {
            addCriterion("collect.collName >", value, "collName");
            return (Criteria) this;
        }

        public Criteria andCollNameGreaterThanOrEqualTo(String value) {
            addCriterion("collect.collName >=", value, "collName");
            return (Criteria) this;
        }

        public Criteria andCollNameLessThan(String value) {
            addCriterion("collect.collName <", value, "collName");
            return (Criteria) this;
        }

        public Criteria andCollNameLessThanOrEqualTo(String value) {
            addCriterion("collect.collName <=", value, "collName");
            return (Criteria) this;
        }

        public Criteria andCollNameLike(String value) {
            addCriterion("collect.collName like", value, "collName");
            return (Criteria) this;
        }

        public Criteria andCollNameNotLike(String value) {
            addCriterion("collect.collName not like", value, "collName");
            return (Criteria) this;
        }

        public Criteria andCollNameIn(List<String> values) {
            addCriterion("collect.collName in", values, "collName");
            return (Criteria) this;
        }

        public Criteria andCollNameNotIn(List<String> values) {
            addCriterion("collect.collName not in", values, "collName");
            return (Criteria) this;
        }

        public Criteria andCollNameBetween(String value1, String value2) {
            addCriterion("collect.collName between", value1, value2, "collName");
            return (Criteria) this;
        }

        public Criteria andCollNameNotBetween(String value1, String value2) {
            addCriterion("collect.collName not between", value1, value2, "collName");
            return (Criteria) this;
        }

        public Criteria andCollYearsIsNull() {
            addCriterion("collect.collYears is null");
            return (Criteria) this;
        }

        public Criteria andCollYearsIsNotNull() {
            addCriterion("collect.collYears is not null");
            return (Criteria) this;
        }

        public Criteria andCollYearsEqualTo(String value) {
            addCriterion("collect.collYears =", value, "collYears");
            return (Criteria) this;
        }

        public Criteria andCollYearsNotEqualTo(String value) {
            addCriterion("collect.collYears <>", value, "collYears");
            return (Criteria) this;
        }

        public Criteria andCollYearsGreaterThan(String value) {
            addCriterion("collect.collYears >", value, "collYears");
            return (Criteria) this;
        }

        public Criteria andCollYearsGreaterThanOrEqualTo(String value) {
            addCriterion("collect.collYears >=", value, "collYears");
            return (Criteria) this;
        }

        public Criteria andCollYearsLessThan(String value) {
            addCriterion("collect.collYears <", value, "collYears");
            return (Criteria) this;
        }

        public Criteria andCollYearsLessThanOrEqualTo(String value) {
            addCriterion("collect.collYears <=", value, "collYears");
            return (Criteria) this;
        }

        public Criteria andCollYearsLike(String value) {
            addCriterion("collect.collYears like", value, "collYears");
            return (Criteria) this;
        }

        public Criteria andCollYearsNotLike(String value) {
            addCriterion("collect.collYears not like", value, "collYears");
            return (Criteria) this;
        }

        public Criteria andCollYearsIn(List<String> values) {
            addCriterion("collect.collYears in", values, "collYears");
            return (Criteria) this;
        }

        public Criteria andCollYearsNotIn(List<String> values) {
            addCriterion("collect.collYears not in", values, "collYears");
            return (Criteria) this;
        }

        public Criteria andCollYearsBetween(String value1, String value2) {
            addCriterion("collect.collYears between", value1, value2, "collYears");
            return (Criteria) this;
        }

        public Criteria andCollYearsNotBetween(String value1, String value2) {
            addCriterion("collect.collYears not between", value1, value2, "collYears");
            return (Criteria) this;
        }

        public Criteria andCollSizeIsNull() {
            addCriterion("collect.collSize is null");
            return (Criteria) this;
        }

        public Criteria andCollSizeIsNotNull() {
            addCriterion("collect.collSize is not null");
            return (Criteria) this;
        }

        public Criteria andCollSizeEqualTo(String value) {
            addCriterion("collect.collSize =", value, "collSize");
            return (Criteria) this;
        }

        public Criteria andCollSizeNotEqualTo(String value) {
            addCriterion("collect.collSize <>", value, "collSize");
            return (Criteria) this;
        }

        public Criteria andCollSizeGreaterThan(String value) {
            addCriterion("collect.collSize >", value, "collSize");
            return (Criteria) this;
        }

        public Criteria andCollSizeGreaterThanOrEqualTo(String value) {
            addCriterion("collect.collSize >=", value, "collSize");
            return (Criteria) this;
        }

        public Criteria andCollSizeLessThan(String value) {
            addCriterion("collect.collSize <", value, "collSize");
            return (Criteria) this;
        }

        public Criteria andCollSizeLessThanOrEqualTo(String value) {
            addCriterion("collect.collSize <=", value, "collSize");
            return (Criteria) this;
        }

        public Criteria andCollSizeLike(String value) {
            addCriterion("collect.collSize like", value, "collSize");
            return (Criteria) this;
        }

        public Criteria andCollSizeNotLike(String value) {
            addCriterion("collect.collSize not like", value, "collSize");
            return (Criteria) this;
        }

        public Criteria andCollSizeIn(List<String> values) {
            addCriterion("collect.collSize in", values, "collSize");
            return (Criteria) this;
        }

        public Criteria andCollSizeNotIn(List<String> values) {
            addCriterion("collect.collSize not in", values, "collSize");
            return (Criteria) this;
        }

        public Criteria andCollSizeBetween(String value1, String value2) {
            addCriterion("collect.collSize between", value1, value2, "collSize");
            return (Criteria) this;
        }

        public Criteria andCollSizeNotBetween(String value1, String value2) {
            addCriterion("collect.collSize not between", value1, value2, "collSize");
            return (Criteria) this;
        }

        public Criteria andCollSourceIsNull() {
            addCriterion("collect.collSource is null");
            return (Criteria) this;
        }

        public Criteria andCollSourceIsNotNull() {
            addCriterion("collect.collSource is not null");
            return (Criteria) this;
        }

        public Criteria andCollSourceEqualTo(String value) {
            addCriterion("collect.collSource =", value, "collSource");
            return (Criteria) this;
        }

        public Criteria andCollSourceNotEqualTo(String value) {
            addCriterion("collect.collSource <>", value, "collSource");
            return (Criteria) this;
        }

        public Criteria andCollSourceGreaterThan(String value) {
            addCriterion("collect.collSource >", value, "collSource");
            return (Criteria) this;
        }

        public Criteria andCollSourceGreaterThanOrEqualTo(String value) {
            addCriterion("collect.collSource >=", value, "collSource");
            return (Criteria) this;
        }

        public Criteria andCollSourceLessThan(String value) {
            addCriterion("collect.collSource <", value, "collSource");
            return (Criteria) this;
        }

        public Criteria andCollSourceLessThanOrEqualTo(String value) {
            addCriterion("collect.collSource <=", value, "collSource");
            return (Criteria) this;
        }

        public Criteria andCollSourceLike(String value) {
            addCriterion("collect.collSource like", value, "collSource");
            return (Criteria) this;
        }

        public Criteria andCollSourceNotLike(String value) {
            addCriterion("collect.collSource not like", value, "collSource");
            return (Criteria) this;
        }

        public Criteria andCollSourceIn(List<String> values) {
            addCriterion("collect.collSource in", values, "collSource");
            return (Criteria) this;
        }

        public Criteria andCollSourceNotIn(List<String> values) {
            addCriterion("collect.collSource not in", values, "collSource");
            return (Criteria) this;
        }

        public Criteria andCollSourceBetween(String value1, String value2) {
            addCriterion("collect.collSource between", value1, value2, "collSource");
            return (Criteria) this;
        }

        public Criteria andCollSourceNotBetween(String value1, String value2) {
            addCriterion("collect.collSource not between", value1, value2, "collSource");
            return (Criteria) this;
        }

        public Criteria andCollTextIsNull() {
            addCriterion("collect.collText is null");
            return (Criteria) this;
        }

        public Criteria andCollTextIsNotNull() {
            addCriterion("collect.collText is not null");
            return (Criteria) this;
        }

        public Criteria andCollTextEqualTo(String value) {
            addCriterion("collect.collText =", value, "collText");
            return (Criteria) this;
        }

        public Criteria andCollTextNotEqualTo(String value) {
            addCriterion("collect.collText <>", value, "collText");
            return (Criteria) this;
        }

        public Criteria andCollTextGreaterThan(String value) {
            addCriterion("collect.collText >", value, "collText");
            return (Criteria) this;
        }

        public Criteria andCollTextGreaterThanOrEqualTo(String value) {
            addCriterion("collect.collText >=", value, "collText");
            return (Criteria) this;
        }

        public Criteria andCollTextLessThan(String value) {
            addCriterion("collect.collText <", value, "collText");
            return (Criteria) this;
        }

        public Criteria andCollTextLessThanOrEqualTo(String value) {
            addCriterion("collect.collText <=", value, "collText");
            return (Criteria) this;
        }

        public Criteria andCollTextLike(String value) {
            addCriterion("collect.collText like", value, "collText");
            return (Criteria) this;
        }

        public Criteria andCollTextNotLike(String value) {
            addCriterion("collect.collText not like", value, "collText");
            return (Criteria) this;
        }

        public Criteria andCollTextIn(List<String> values) {
            addCriterion("collect.collText in", values, "collText");
            return (Criteria) this;
        }

        public Criteria andCollTextNotIn(List<String> values) {
            addCriterion("collect.collText not in", values, "collText");
            return (Criteria) this;
        }

        public Criteria andCollTextBetween(String value1, String value2) {
            addCriterion("collect.collText between", value1, value2, "collText");
            return (Criteria) this;
        }

        public Criteria andCollTextNotBetween(String value1, String value2) {
            addCriterion("collect.collText not between", value1, value2, "collText");
            return (Criteria) this;
        }

        public Criteria andCollFileIsNull() {
            addCriterion("collect.collFile is null");
            return (Criteria) this;
        }

        public Criteria andCollFileIsNotNull() {
            addCriterion("collect.collFile is not null");
            return (Criteria) this;
        }

        public Criteria andCollFileEqualTo(String value) {
            addCriterion("collect.collFile =", value, "collFile");
            return (Criteria) this;
        }

        public Criteria andCollFileNotEqualTo(String value) {
            addCriterion("collect.collFile <>", value, "collFile");
            return (Criteria) this;
        }

        public Criteria andCollFileGreaterThan(String value) {
            addCriterion("collect.collFile >", value, "collFile");
            return (Criteria) this;
        }

        public Criteria andCollFileGreaterThanOrEqualTo(String value) {
            addCriterion("collect.collFile >=", value, "collFile");
            return (Criteria) this;
        }

        public Criteria andCollFileLessThan(String value) {
            addCriterion("collect.collFile <", value, "collFile");
            return (Criteria) this;
        }

        public Criteria andCollFileLessThanOrEqualTo(String value) {
            addCriterion("collect.collFile <=", value, "collFile");
            return (Criteria) this;
        }

        public Criteria andCollFileLike(String value) {
            addCriterion("collect.collFile like", value, "collFile");
            return (Criteria) this;
        }

        public Criteria andCollFileNotLike(String value) {
            addCriterion("collect.collFile not like", value, "collFile");
            return (Criteria) this;
        }

        public Criteria andCollFileIn(List<String> values) {
            addCriterion("collect.collFile in", values, "collFile");
            return (Criteria) this;
        }

        public Criteria andCollFileNotIn(List<String> values) {
            addCriterion("collect.collFile not in", values, "collFile");
            return (Criteria) this;
        }

        public Criteria andCollFileBetween(String value1, String value2) {
            addCriterion("collect.collFile between", value1, value2, "collFile");
            return (Criteria) this;
        }

        public Criteria andCollFileNotBetween(String value1, String value2) {
            addCriterion("collect.collFile not between", value1, value2, "collFile");
            return (Criteria) this;
        }

        public Criteria andCollTypeIsNull() {
            addCriterion("collect.collType is null");
            return (Criteria) this;
        }

        public Criteria andCollTypeIsNotNull() {
            addCriterion("collect.collType is not null");
            return (Criteria) this;
        }

        public Criteria andCollTypeEqualTo(Long value) {
            addCriterion("collect.collType =", value, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeNotEqualTo(Long value) {
            addCriterion("collect.collType <>", value, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeGreaterThan(Long value) {
            addCriterion("collect.collType >", value, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("collect.collType >=", value, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeLessThan(Long value) {
            addCriterion("collect.collType <", value, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeLessThanOrEqualTo(Long value) {
            addCriterion("collect.collType <=", value, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeIn(List<Long> values) {
            addCriterion("collect.collType in", values, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeNotIn(List<Long> values) {
            addCriterion("collect.collType not in", values, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeBetween(Long value1, Long value2) {
            addCriterion("collect.collType between", value1, value2, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeNotBetween(Long value1, Long value2) {
            addCriterion("collect.collType not between", value1, value2, "collType");
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