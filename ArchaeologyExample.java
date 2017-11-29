package cn.qiantongmuseum.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArchaeologyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArchaeologyExample() {
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
            addCriterion("archaeology.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("archaeology.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("archaeology.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("archaeology.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("archaeology.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("archaeology.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("archaeology.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("archaeology.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("archaeology.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("archaeology.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("archaeology.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("archaeology.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andArc_TitleIsNull() {
            addCriterion("archaeology.arc_Title is null");
            return (Criteria) this;
        }

        public Criteria andArc_TitleIsNotNull() {
            addCriterion("archaeology.arc_Title is not null");
            return (Criteria) this;
        }

        public Criteria andArc_TitleEqualTo(String value) {
            addCriterion("archaeology.arc_Title =", value, "arc_Title");
            return (Criteria) this;
        }

        public Criteria andArc_TitleNotEqualTo(String value) {
            addCriterion("archaeology.arc_Title <>", value, "arc_Title");
            return (Criteria) this;
        }

        public Criteria andArc_TitleGreaterThan(String value) {
            addCriterion("archaeology.arc_Title >", value, "arc_Title");
            return (Criteria) this;
        }

        public Criteria andArc_TitleGreaterThanOrEqualTo(String value) {
            addCriterion("archaeology.arc_Title >=", value, "arc_Title");
            return (Criteria) this;
        }

        public Criteria andArc_TitleLessThan(String value) {
            addCriterion("archaeology.arc_Title <", value, "arc_Title");
            return (Criteria) this;
        }

        public Criteria andArc_TitleLessThanOrEqualTo(String value) {
            addCriterion("archaeology.arc_Title <=", value, "arc_Title");
            return (Criteria) this;
        }

        public Criteria andArc_TitleLike(String value) {
            addCriterion("archaeology.arc_Title like", value, "arc_Title");
            return (Criteria) this;
        }

        public Criteria andArc_TitleNotLike(String value) {
            addCriterion("archaeology.arc_Title not like", value, "arc_Title");
            return (Criteria) this;
        }

        public Criteria andArc_TitleIn(List<String> values) {
            addCriterion("archaeology.arc_Title in", values, "arc_Title");
            return (Criteria) this;
        }

        public Criteria andArc_TitleNotIn(List<String> values) {
            addCriterion("archaeology.arc_Title not in", values, "arc_Title");
            return (Criteria) this;
        }

        public Criteria andArc_TitleBetween(String value1, String value2) {
            addCriterion("archaeology.arc_Title between", value1, value2, "arc_Title");
            return (Criteria) this;
        }

        public Criteria andArc_TitleNotBetween(String value1, String value2) {
            addCriterion("archaeology.arc_Title not between", value1, value2, "arc_Title");
            return (Criteria) this;
        }

        public Criteria andArc_TimeIsNull() {
            addCriterion("archaeology.arc_Time is null");
            return (Criteria) this;
        }

        public Criteria andArc_TimeIsNotNull() {
            addCriterion("archaeology.arc_Time is not null");
            return (Criteria) this;
        }

        public Criteria andArc_TimeEqualTo(Date value) {
            addCriterion("archaeology.arc_Time =", value, "arc_Time");
            return (Criteria) this;
        }

        public Criteria andArc_TimeNotEqualTo(Date value) {
            addCriterion("archaeology.arc_Time <>", value, "arc_Time");
            return (Criteria) this;
        }

        public Criteria andArc_TimeGreaterThan(Date value) {
            addCriterion("archaeology.arc_Time >", value, "arc_Time");
            return (Criteria) this;
        }

        public Criteria andArc_TimeGreaterThanOrEqualTo(Date value) {
            addCriterion("archaeology.arc_Time >=", value, "arc_Time");
            return (Criteria) this;
        }

        public Criteria andArc_TimeLessThan(Date value) {
            addCriterion("archaeology.arc_Time <", value, "arc_Time");
            return (Criteria) this;
        }

        public Criteria andArc_TimeLessThanOrEqualTo(Date value) {
            addCriterion("archaeology.arc_Time <=", value, "arc_Time");
            return (Criteria) this;
        }

        public Criteria andArc_TimeIn(List<Date> values) {
            addCriterion("archaeology.arc_Time in", values, "arc_Time");
            return (Criteria) this;
        }

        public Criteria andArc_TimeNotIn(List<Date> values) {
            addCriterion("archaeology.arc_Time not in", values, "arc_Time");
            return (Criteria) this;
        }

        public Criteria andArc_TimeBetween(Date value1, Date value2) {
            addCriterion("archaeology.arc_Time between", value1, value2, "arc_Time");
            return (Criteria) this;
        }

        public Criteria andArc_TimeNotBetween(Date value1, Date value2) {
            addCriterion("archaeology.arc_Time not between", value1, value2, "arc_Time");
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