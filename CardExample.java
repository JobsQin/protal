package cn.qiantongmuseum.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CardExample() {
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
            addCriterion("card.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("card.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("card.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("card.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("card.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("card.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("card.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("card.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("card.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("card.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("card.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("card.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNull() {
            addCriterion("card.cardName is null");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNotNull() {
            addCriterion("card.cardName is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameEqualTo(String value) {
            addCriterion("card.cardName =", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotEqualTo(String value) {
            addCriterion("card.cardName <>", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThan(String value) {
            addCriterion("card.cardName >", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("card.cardName >=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThan(String value) {
            addCriterion("card.cardName <", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThanOrEqualTo(String value) {
            addCriterion("card.cardName <=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLike(String value) {
            addCriterion("card.cardName like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotLike(String value) {
            addCriterion("card.cardName not like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameIn(List<String> values) {
            addCriterion("card.cardName in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotIn(List<String> values) {
            addCriterion("card.cardName not in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameBetween(String value1, String value2) {
            addCriterion("card.cardName between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotBetween(String value1, String value2) {
            addCriterion("card.cardName not between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNumIsNull() {
            addCriterion("card.cardNum is null");
            return (Criteria) this;
        }

        public Criteria andCardNumIsNotNull() {
            addCriterion("card.cardNum is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumEqualTo(String value) {
            addCriterion("card.cardNum =", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotEqualTo(String value) {
            addCriterion("card.cardNum <>", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumGreaterThan(String value) {
            addCriterion("card.cardNum >", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumGreaterThanOrEqualTo(String value) {
            addCriterion("card.cardNum >=", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLessThan(String value) {
            addCriterion("card.cardNum <", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLessThanOrEqualTo(String value) {
            addCriterion("card.cardNum <=", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLike(String value) {
            addCriterion("card.cardNum like", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotLike(String value) {
            addCriterion("card.cardNum not like", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumIn(List<String> values) {
            addCriterion("card.cardNum in", values, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotIn(List<String> values) {
            addCriterion("card.cardNum not in", values, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumBetween(String value1, String value2) {
            addCriterion("card.cardNum between", value1, value2, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotBetween(String value1, String value2) {
            addCriterion("card.cardNum not between", value1, value2, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardAddressIsNull() {
            addCriterion("card.cardAddress is null");
            return (Criteria) this;
        }

        public Criteria andCardAddressIsNotNull() {
            addCriterion("card.cardAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCardAddressEqualTo(String value) {
            addCriterion("card.cardAddress =", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressNotEqualTo(String value) {
            addCriterion("card.cardAddress <>", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressGreaterThan(String value) {
            addCriterion("card.cardAddress >", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressGreaterThanOrEqualTo(String value) {
            addCriterion("card.cardAddress >=", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressLessThan(String value) {
            addCriterion("card.cardAddress <", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressLessThanOrEqualTo(String value) {
            addCriterion("card.cardAddress <=", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressLike(String value) {
            addCriterion("card.cardAddress like", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressNotLike(String value) {
            addCriterion("card.cardAddress not like", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressIn(List<String> values) {
            addCriterion("card.cardAddress in", values, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressNotIn(List<String> values) {
            addCriterion("card.cardAddress not in", values, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressBetween(String value1, String value2) {
            addCriterion("card.cardAddress between", value1, value2, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressNotBetween(String value1, String value2) {
            addCriterion("card.cardAddress not between", value1, value2, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andSexIdIsNull() {
            addCriterion("card.sexId is null");
            return (Criteria) this;
        }

        public Criteria andSexIdIsNotNull() {
            addCriterion("card.sexId is not null");
            return (Criteria) this;
        }

        public Criteria andSexIdEqualTo(Long value) {
            addCriterion("card.sexId =", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdNotEqualTo(Long value) {
            addCriterion("card.sexId <>", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdGreaterThan(Long value) {
            addCriterion("card.sexId >", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdGreaterThanOrEqualTo(Long value) {
            addCriterion("card.sexId >=", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdLessThan(Long value) {
            addCriterion("card.sexId <", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdLessThanOrEqualTo(Long value) {
            addCriterion("card.sexId <=", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdIn(List<Long> values) {
            addCriterion("card.sexId in", values, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdNotIn(List<Long> values) {
            addCriterion("card.sexId not in", values, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdBetween(Long value1, Long value2) {
            addCriterion("card.sexId between", value1, value2, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdNotBetween(Long value1, Long value2) {
            addCriterion("card.sexId not between", value1, value2, "sexId");
            return (Criteria) this;
        }

        public Criteria andCardBirthDateIsNull() {
            addCriterion("card.cardBirthDate is null");
            return (Criteria) this;
        }

        public Criteria andCardBirthDateIsNotNull() {
            addCriterion("card.cardBirthDate is not null");
            return (Criteria) this;
        }

        public Criteria andCardBirthDateEqualTo(Date value) {
            addCriterionForJDBCDate("card.cardBirthDate =", value, "cardBirthDate");
            return (Criteria) this;
        }

        public Criteria andCardBirthDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("card.cardBirthDate <>", value, "cardBirthDate");
            return (Criteria) this;
        }

        public Criteria andCardBirthDateGreaterThan(Date value) {
            addCriterionForJDBCDate("card.cardBirthDate >", value, "cardBirthDate");
            return (Criteria) this;
        }

        public Criteria andCardBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("card.cardBirthDate >=", value, "cardBirthDate");
            return (Criteria) this;
        }

        public Criteria andCardBirthDateLessThan(Date value) {
            addCriterionForJDBCDate("card.cardBirthDate <", value, "cardBirthDate");
            return (Criteria) this;
        }

        public Criteria andCardBirthDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("card.cardBirthDate <=", value, "cardBirthDate");
            return (Criteria) this;
        }

        public Criteria andCardBirthDateIn(List<Date> values) {
            addCriterionForJDBCDate("card.cardBirthDate in", values, "cardBirthDate");
            return (Criteria) this;
        }

        public Criteria andCardBirthDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("card.cardBirthDate not in", values, "cardBirthDate");
            return (Criteria) this;
        }

        public Criteria andCardBirthDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("card.cardBirthDate between", value1, value2, "cardBirthDate");
            return (Criteria) this;
        }

        public Criteria andCardBirthDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("card.cardBirthDate not between", value1, value2, "cardBirthDate");
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