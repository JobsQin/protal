package cn.qiantongmuseum.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EntranceticketExample {
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

	public EntranceticketExample() {
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
            addCriterion("entranceticket.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("entranceticket.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("entranceticket.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("entranceticket.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("entranceticket.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("entranceticket.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("entranceticket.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("entranceticket.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("entranceticket.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("entranceticket.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("entranceticket.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("entranceticket.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTicketNumIsNull() {
            addCriterion("entranceticket.ticketNum is null");
            return (Criteria) this;
        }

        public Criteria andTicketNumIsNotNull() {
            addCriterion("entranceticket.ticketNum is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNumEqualTo(String value) {
            addCriterion("entranceticket.ticketNum =", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotEqualTo(String value) {
            addCriterion("entranceticket.ticketNum <>", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumGreaterThan(String value) {
            addCriterion("entranceticket.ticketNum >", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumGreaterThanOrEqualTo(String value) {
            addCriterion("entranceticket.ticketNum >=", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLessThan(String value) {
            addCriterion("entranceticket.ticketNum <", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLessThanOrEqualTo(String value) {
            addCriterion("entranceticket.ticketNum <=", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLike(String value) {
            addCriterion("entranceticket.ticketNum like", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotLike(String value) {
            addCriterion("entranceticket.ticketNum not like", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumIn(List<String> values) {
            addCriterion("entranceticket.ticketNum in", values, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotIn(List<String> values) {
            addCriterion("entranceticket.ticketNum not in", values, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumBetween(String value1, String value2) {
            addCriterion("entranceticket.ticketNum between", value1, value2, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotBetween(String value1, String value2) {
            addCriterion("entranceticket.ticketNum not between", value1, value2, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNull() {
            addCriterion("entranceticket.TicketType is null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNotNull() {
            addCriterion("entranceticket.TicketType is not null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeEqualTo(Long value) {
            addCriterion("entranceticket.TicketType =", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotEqualTo(Long value) {
            addCriterion("entranceticket.TicketType <>", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThan(Long value) {
            addCriterion("entranceticket.TicketType >", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("entranceticket.TicketType >=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThan(Long value) {
            addCriterion("entranceticket.TicketType <", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThanOrEqualTo(Long value) {
            addCriterion("entranceticket.TicketType <=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIn(List<Long> values) {
            addCriterion("entranceticket.TicketType in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotIn(List<Long> values) {
            addCriterion("entranceticket.TicketType not in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeBetween(Long value1, Long value2) {
            addCriterion("entranceticket.TicketType between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotBetween(Long value1, Long value2) {
            addCriterion("entranceticket.TicketType not between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("entranceticket.money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("entranceticket.money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("entranceticket.money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("entranceticket.money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("entranceticket.money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("entranceticket.money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("entranceticket.money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("entranceticket.money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("entranceticket.money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("entranceticket.money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("entranceticket.money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("entranceticket.money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andSaleDateIsNull() {
            addCriterion("entranceticket.saleDate is null");
            return (Criteria) this;
        }

        public Criteria andSaleDateIsNotNull() {
            addCriterion("entranceticket.saleDate is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDateEqualTo(Date value) {
            addCriterion("entranceticket.saleDate =", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateNotEqualTo(Date value) {
            addCriterion("entranceticket.saleDate <>", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateGreaterThan(Date value) {
            addCriterion("entranceticket.saleDate >", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("entranceticket.saleDate >=", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateLessThan(Date value) {
            addCriterion("entranceticket.saleDate <", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateLessThanOrEqualTo(Date value) {
            addCriterion("entranceticket.saleDate <=", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateIn(List<Date> values) {
            addCriterion("entranceticket.saleDate in", values, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateNotIn(List<Date> values) {
            addCriterion("entranceticket.saleDate not in", values, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateBetween(Date value1, Date value2) {
            addCriterion("entranceticket.saleDate between", value1, value2, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateNotBetween(Date value1, Date value2) {
            addCriterion("entranceticket.saleDate not between", value1, value2, "saleDate");
            return (Criteria) this;
        }

        public Criteria andCardIDIsNull() {
            addCriterion("entranceticket.cardID is null");
            return (Criteria) this;
        }

        public Criteria andCardIDIsNotNull() {
            addCriterion("entranceticket.cardID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIDEqualTo(String value) {
            addCriterion("entranceticket.cardID =", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDNotEqualTo(String value) {
            addCriterion("entranceticket.cardID <>", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDGreaterThan(String value) {
            addCriterion("entranceticket.cardID >", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDGreaterThanOrEqualTo(String value) {
            addCriterion("entranceticket.cardID >=", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDLessThan(String value) {
            addCriterion("entranceticket.cardID <", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDLessThanOrEqualTo(String value) {
            addCriterion("entranceticket.cardID <=", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDLike(String value) {
            addCriterion("entranceticket.cardID like", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDNotLike(String value) {
            addCriterion("entranceticket.cardID not like", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDIn(List<String> values) {
            addCriterion("entranceticket.cardID in", values, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDNotIn(List<String> values) {
            addCriterion("entranceticket.cardID not in", values, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDBetween(String value1, String value2) {
            addCriterion("entranceticket.cardID between", value1, value2, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDNotBetween(String value1, String value2) {
            addCriterion("entranceticket.cardID not between", value1, value2, "cardID");
            return (Criteria) this;
        }

        public Criteria andbespeakDateIsNull() {
            addCriterion("entranceticket.bespeakDate is null");
            return (Criteria) this;
        }

        public Criteria andbespeakDateIsNotNull() {
            addCriterion("entranceticket.bespeakDate is not null");
            return (Criteria) this;
        }

        public Criteria andbespeakDateEqualTo(Long value) {
            addCriterion("entranceticket.bespeakDate =", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andbespeakDateNotEqualTo(Long value) {
            addCriterion("entranceticket.bespeakDate <>", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andbespeakDateGreaterThan(Long value) {
            addCriterion("entranceticket.bespeakDate >", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andbespeakDateGreaterThanOrEqualTo(Long value) {
            addCriterion("entranceticket.bespeakDate >=", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andbespeakDateLessThan(Long value) {
            addCriterion("entranceticket.bespeakDate <", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andbespeakDateLessThanOrEqualTo(Long value) {
            addCriterion("entranceticket.bespeakDate <=", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andbespeakDateIn(List<Long> values) {
            addCriterion("entranceticket.bespeakDate in", values, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andbespeakDateNotIn(List<Long> values) {
            addCriterion("entranceticket.bespeakDate not in", values, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andbespeakDateBetween(Long value1, Long value2) {
            addCriterion("entranceticket.bespeakDate between", value1, value2, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andbespeakDateNotBetween(Long value1, Long value2) {
            addCriterion("entranceticket.bespeakDate not between", value1, value2, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("entranceticket.userId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("entranceticket.userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("entranceticket.userId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("entranceticket.userId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("entranceticket.userId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("entranceticket.userId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("entranceticket.userId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("entranceticket.userId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("entranceticket.userId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("entranceticket.userId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("entranceticket.userId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("entranceticket.userId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("entranceticket.idCard is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("entranceticket.idCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("entranceticket.idCard =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("entranceticket.idCard <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("entranceticket.idCard >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("entranceticket.idCard >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("entranceticket.idCard <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("entranceticket.idCard <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("entranceticket.idCard like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("entranceticket.idCard not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("entranceticket.idCard in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("entranceticket.idCard not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("entranceticket.idCard between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("entranceticket.idCard not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNull() {
            addCriterion("entranceticket.useDate is null");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNotNull() {
            addCriterion("entranceticket.useDate is not null");
            return (Criteria) this;
        }

        public Criteria andUseDateEqualTo(Date value) {
            addCriterion("entranceticket.useDate =", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotEqualTo(Date value) {
            addCriterion("entranceticket.useDate <>", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThan(Date value) {
            addCriterion("entranceticket.useDate >", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("entranceticket.useDate >=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThan(Date value) {
            addCriterion("entranceticket.useDate <", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThanOrEqualTo(Date value) {
            addCriterion("entranceticket.useDate <=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateIn(List<Date> values) {
            addCriterion("entranceticket.useDate in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotIn(List<Date> values) {
            addCriterion("entranceticket.useDate not in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateBetween(Date value1, Date value2) {
            addCriterion("entranceticket.useDate between", value1, value2, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotBetween(Date value1, Date value2) {
            addCriterion("entranceticket.useDate not between", value1, value2, "useDate");
            return (Criteria) this;
        }

        public Criteria andIsUsedIsNull() {
            addCriterion("entranceticket.isUsed is null");
            return (Criteria) this;
        }

        public Criteria andIsUsedIsNotNull() {
            addCriterion("entranceticket.isUsed is not null");
            return (Criteria) this;
        }

        public Criteria andIsUsedEqualTo(Long value) {
            addCriterion("entranceticket.isUsed =", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotEqualTo(Long value) {
            addCriterion("entranceticket.isUsed <>", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThan(Long value) {
            addCriterion("entranceticket.isUsed >", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("entranceticket.isUsed >=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThan(Long value) {
            addCriterion("entranceticket.isUsed <", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThanOrEqualTo(Long value) {
            addCriterion("entranceticket.isUsed <=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedIn(List<Long> values) {
            addCriterion("entranceticket.isUsed in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotIn(List<Long> values) {
            addCriterion("entranceticket.isUsed not in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedBetween(Long value1, Long value2) {
            addCriterion("entranceticket.isUsed between", value1, value2, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotBetween(Long value1, Long value2) {
            addCriterion("entranceticket.isUsed not between", value1, value2, "isUsed");
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