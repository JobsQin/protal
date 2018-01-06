package cn.qiantongmuseum.pojo;

import java.util.ArrayList;
import java.util.List;

public class PosTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PosTimeExample() {
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
            addCriterion("ptime.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ptime.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ptime.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ptime.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ptime.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ptime.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ptime.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ptime.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ptime.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ptime.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ptime.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ptime.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPosIdIsNull() {
            addCriterion("ptime.posId is null");
            return (Criteria) this;
        }

        public Criteria andPosIdIsNotNull() {
            addCriterion("ptime.posId is not null");
            return (Criteria) this;
        }

        public Criteria andPosIdEqualTo(Long value) {
            addCriterion("ptime.posId =", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotEqualTo(Long value) {
            addCriterion("ptime.posId <>", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdGreaterThan(Long value) {
            addCriterion("ptime.posId >", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ptime.posId >=", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLessThan(Long value) {
            addCriterion("ptime.posId <", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLessThanOrEqualTo(Long value) {
            addCriterion("ptime.posId <=", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdIn(List<Long> values) {
            addCriterion("ptime.posId in", values, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotIn(List<Long> values) {
            addCriterion("ptime.posId not in", values, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdBetween(Long value1, Long value2) {
            addCriterion("ptime.posId between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotBetween(Long value1, Long value2) {
            addCriterion("ptime.posId not between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria andTimeIdIsNull() {
            addCriterion("ptime.timeId is null");
            return (Criteria) this;
        }

        public Criteria andTimeIdIsNotNull() {
            addCriterion("ptime.timeId is not null");
            return (Criteria) this;
        }

        public Criteria andTimeIdEqualTo(Long value) {
            addCriterion("ptime.timeId =", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdNotEqualTo(Long value) {
            addCriterion("ptime.timeId <>", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdGreaterThan(Long value) {
            addCriterion("ptime.timeId >", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ptime.timeId >=", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdLessThan(Long value) {
            addCriterion("ptime.timeId <", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdLessThanOrEqualTo(Long value) {
            addCriterion("ptime.timeId <=", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdIn(List<Long> values) {
            addCriterion("ptime.timeId in", values, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdNotIn(List<Long> values) {
            addCriterion("ptime.timeId not in", values, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdBetween(Long value1, Long value2) {
            addCriterion("ptime.timeId between", value1, value2, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdNotBetween(Long value1, Long value2) {
            addCriterion("ptime.timeId not between", value1, value2, "timeId");
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