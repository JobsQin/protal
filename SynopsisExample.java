package cn.qiantongmuseum.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SynopsisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SynopsisExample() {
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
            addCriterion("synopsis.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("synopsis.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("synopsis.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("synopsis.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("synopsis.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("synopsis.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("synopsis.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("synopsis.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("synopsis.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("synopsis.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("synopsis.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("synopsis.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("synopsis.content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("synopsis.content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("synopsis.content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("synopsis.content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("synopsis.content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("synopsis.content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("synopsis.content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("synopsis.content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("synopsis.content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("synopsis.content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("synopsis.content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("synopsis.content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("synopsis.content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("synopsis.content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andHeadlineIsNull() {
            addCriterion("synopsis.headline is null");
            return (Criteria) this;
        }

        public Criteria andHeadlineIsNotNull() {
            addCriterion("synopsis.headline is not null");
            return (Criteria) this;
        }

        public Criteria andHeadlineEqualTo(String value) {
            addCriterion("synopsis.headline =", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineNotEqualTo(String value) {
            addCriterion("synopsis.headline <>", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineGreaterThan(String value) {
            addCriterion("synopsis.headline >", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("synopsis.headline >=", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineLessThan(String value) {
            addCriterion("synopsis.headline <", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineLessThanOrEqualTo(String value) {
            addCriterion("synopsis.headline <=", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineLike(String value) {
            addCriterion("synopsis.headline like", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineNotLike(String value) {
            addCriterion("synopsis.headline not like", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineIn(List<String> values) {
            addCriterion("synopsis.headline in", values, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineNotIn(List<String> values) {
            addCriterion("synopsis.headline not in", values, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineBetween(String value1, String value2) {
            addCriterion("synopsis.headline between", value1, value2, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineNotBetween(String value1, String value2) {
            addCriterion("synopsis.headline not between", value1, value2, "headline");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("synopsis.modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("synopsis.modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("synopsis.modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("synopsis.modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("synopsis.modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("synopsis.modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("synopsis.modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("synopsis.modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("synopsis.modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("synopsis.modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("synopsis.modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("synopsis.modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("synopsis.modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("synopsis.modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifitimeIsNull() {
            addCriterion("synopsis.modifitime is null");
            return (Criteria) this;
        }

        public Criteria andModifitimeIsNotNull() {
            addCriterion("synopsis.modifitime is not null");
            return (Criteria) this;
        }

        public Criteria andModifitimeEqualTo(Date value) {
            addCriterion("synopsis.modifitime =", value, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeNotEqualTo(Date value) {
            addCriterion("synopsis.modifitime <>", value, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeGreaterThan(Date value) {
            addCriterion("synopsis.modifitime >", value, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeGreaterThanOrEqualTo(Date value) {
            addCriterion("synopsis.modifitime >=", value, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeLessThan(Date value) {
            addCriterion("synopsis.modifitime <", value, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeLessThanOrEqualTo(Date value) {
            addCriterion("synopsis.modifitime <=", value, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeIn(List<Date> values) {
            addCriterion("synopsis.modifitime in", values, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeNotIn(List<Date> values) {
            addCriterion("synopsis.modifitime not in", values, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeBetween(Date value1, Date value2) {
            addCriterion("synopsis.modifitime between", value1, value2, "modifitime");
            return (Criteria) this;
        }

        public Criteria andModifitimeNotBetween(Date value1, Date value2) {
            addCriterion("synopsis.modifitime not between", value1, value2, "modifitime");
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