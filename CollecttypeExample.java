package cn.qiantongmuseum.pojo;

import java.util.ArrayList;
import java.util.List;

public class CollecttypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollecttypeExample() {
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
            addCriterion("collecttype.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("collecttype.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("collecttype.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("collecttype.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("collecttype.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("collecttype.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("collecttype.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("collecttype.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("collecttype.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("collecttype.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("collecttype.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("collecttype.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andColltypeIsNull() {
            addCriterion("collecttype.colltype is null");
            return (Criteria) this;
        }

        public Criteria andColltypeIsNotNull() {
            addCriterion("collecttype.colltype is not null");
            return (Criteria) this;
        }

        public Criteria andColltypeEqualTo(String value) {
            addCriterion("collecttype.colltype =", value, "colltype");
            return (Criteria) this;
        }

        public Criteria andColltypeNotEqualTo(String value) {
            addCriterion("collecttype.colltype <>", value, "colltype");
            return (Criteria) this;
        }

        public Criteria andColltypeGreaterThan(String value) {
            addCriterion("collecttype.colltype >", value, "colltype");
            return (Criteria) this;
        }

        public Criteria andColltypeGreaterThanOrEqualTo(String value) {
            addCriterion("collecttype.colltype >=", value, "colltype");
            return (Criteria) this;
        }

        public Criteria andColltypeLessThan(String value) {
            addCriterion("collecttype.colltype <", value, "colltype");
            return (Criteria) this;
        }

        public Criteria andColltypeLessThanOrEqualTo(String value) {
            addCriterion("collecttype.colltype <=", value, "colltype");
            return (Criteria) this;
        }

        public Criteria andColltypeLike(String value) {
            addCriterion("collecttype.colltype like", value, "colltype");
            return (Criteria) this;
        }

        public Criteria andColltypeNotLike(String value) {
            addCriterion("collecttype.colltype not like", value, "colltype");
            return (Criteria) this;
        }

        public Criteria andColltypeIn(List<String> values) {
            addCriterion("collecttype.colltype in", values, "colltype");
            return (Criteria) this;
        }

        public Criteria andColltypeNotIn(List<String> values) {
            addCriterion("collecttype.colltype not in", values, "colltype");
            return (Criteria) this;
        }

        public Criteria andColltypeBetween(String value1, String value2) {
            addCriterion("collecttype.colltype between", value1, value2, "colltype");
            return (Criteria) this;
        }

        public Criteria andColltypeNotBetween(String value1, String value2) {
            addCriterion("collecttype.colltype not between", value1, value2, "colltype");
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