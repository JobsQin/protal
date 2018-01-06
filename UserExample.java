package cn.qiantongmuseum.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
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

	public UserExample() {
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
            addCriterion("user.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("user.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("user.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("user.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("user.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("user.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("user.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("user.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("user.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("user.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("user.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("user.mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("user.mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("user.mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("user.mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("user.mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("user.mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("user.mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("user.mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("user.mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("user.mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("user.mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("user.mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("user.mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("user.mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("user.`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("user.`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("user.`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("user.`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("user.`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user.`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("user.`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("user.`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("user.`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("user.`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("user.`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("user.`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("user.`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("user.`password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSexNameIsNull() {
            addCriterion("user.sexName is null");
            return (Criteria) this;
        }

        public Criteria andSexNameIsNotNull() {
            addCriterion("user.sexName is not null");
            return (Criteria) this;
        }

        public Criteria andSexNameEqualTo(String value) {
            addCriterion("user.sexName =", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotEqualTo(String value) {
            addCriterion("user.sexName <>", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameGreaterThan(String value) {
            addCriterion("user.sexName >", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameGreaterThanOrEqualTo(String value) {
            addCriterion("user.sexName >=", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameLessThan(String value) {
            addCriterion("user.sexName <", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameLessThanOrEqualTo(String value) {
            addCriterion("user.sexName <=", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameLike(String value) {
            addCriterion("user.sexName like", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotLike(String value) {
            addCriterion("user.sexName not like", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameIn(List<String> values) {
            addCriterion("user.sexName in", values, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotIn(List<String> values) {
            addCriterion("user.sexName not in", values, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameBetween(String value1, String value2) {
            addCriterion("user.sexName between", value1, value2, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotBetween(String value1, String value2) {
            addCriterion("user.sexName not between", value1, value2, "sexName");
            return (Criteria) this;
        }

        public Criteria andCardTypeNameIsNull() {
            addCriterion("user.cardTypeName is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeNameIsNotNull() {
            addCriterion("user.cardTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeNameEqualTo(String value) {
            addCriterion("user.cardTypeName =", value, "cardTypeName");
            return (Criteria) this;
        }

        public Criteria andCardTypeNameNotEqualTo(String value) {
            addCriterion("user.cardTypeName <>", value, "cardTypeName");
            return (Criteria) this;
        }

        public Criteria andCardTypeNameGreaterThan(String value) {
            addCriterion("user.cardTypeName >", value, "cardTypeName");
            return (Criteria) this;
        }

        public Criteria andCardTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("user.cardTypeName >=", value, "cardTypeName");
            return (Criteria) this;
        }

        public Criteria andCardTypeNameLessThan(String value) {
            addCriterion("user.cardTypeName <", value, "cardTypeName");
            return (Criteria) this;
        }

        public Criteria andCardTypeNameLessThanOrEqualTo(String value) {
            addCriterion("user.cardTypeName <=", value, "cardTypeName");
            return (Criteria) this;
        }

        public Criteria andCardTypeNameLike(String value) {
            addCriterion("user.cardTypeName like", value, "cardTypeName");
            return (Criteria) this;
        }

        public Criteria andCardTypeNameNotLike(String value) {
            addCriterion("user.cardTypeName not like", value, "cardTypeName");
            return (Criteria) this;
        }

        public Criteria andCardTypeNameIn(List<String> values) {
            addCriterion("user.cardTypeName in", values, "cardTypeName");
            return (Criteria) this;
        }

        public Criteria andCardTypeNameNotIn(List<String> values) {
            addCriterion("user.cardTypeName not in", values, "cardTypeName");
            return (Criteria) this;
        }

        public Criteria andCardTypeNameBetween(String value1, String value2) {
            addCriterion("user.cardTypeName between", value1, value2, "cardTypeName");
            return (Criteria) this;
        }

        public Criteria andCardTypeNameNotBetween(String value1, String value2) {
            addCriterion("user.cardTypeName not between", value1, value2, "cardTypeName");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("user.cardType is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("user.cardType is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(Long value) {
            addCriterion("user.cardType =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(Long value) {
            addCriterion("user.cardType <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(Long value) {
            addCriterion("user.cardType >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("user.cardType >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(Long value) {
            addCriterion("user.cardType <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(Long value) {
            addCriterion("user.cardType <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<Long> values) {
            addCriterion("user.cardType in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<Long> values) {
            addCriterion("user.cardType not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(Long value1, Long value2) {
            addCriterion("user.cardType between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(Long value1, Long value2) {
            addCriterion("user.cardType not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardIDIsNull() {
            addCriterion("user.cardID is null");
            return (Criteria) this;
        }

        public Criteria andCardIDIsNotNull() {
            addCriterion("user.cardID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIDEqualTo(Long value) {
            addCriterion("user.cardID =", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDNotEqualTo(Long value) {
            addCriterion("user.cardID <>", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDGreaterThan(Long value) {
            addCriterion("user.cardID >", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDGreaterThanOrEqualTo(Long value) {
            addCriterion("user.cardID >=", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDLessThan(Long value) {
            addCriterion("user.cardID <", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDLessThanOrEqualTo(Long value) {
            addCriterion("user.cardID <=", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDIn(List<Long> values) {
            addCriterion("user.cardID in", values, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDNotIn(List<Long> values) {
            addCriterion("user.cardID not in", values, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDBetween(Long value1, Long value2) {
            addCriterion("user.cardID between", value1, value2, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDNotBetween(Long value1, Long value2) {
            addCriterion("user.cardID not between", value1, value2, "cardID");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user.userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user.userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user.userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user.userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user.userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user.userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user.userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user.userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user.userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user.userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user.userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user.userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user.userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user.userName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNameIsNull() {
            addCriterion("user.roleTypeName is null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNameIsNotNull() {
            addCriterion("user.roleTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNameEqualTo(String value) {
            addCriterion("user.roleTypeName =", value, "roleTypeName");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNameNotEqualTo(String value) {
            addCriterion("user.roleTypeName <>", value, "roleTypeName");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNameGreaterThan(String value) {
            addCriterion("user.roleTypeName >", value, "roleTypeName");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("user.roleTypeName >=", value, "roleTypeName");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNameLessThan(String value) {
            addCriterion("user.roleTypeName <", value, "roleTypeName");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNameLessThanOrEqualTo(String value) {
            addCriterion("user.roleTypeName <=", value, "roleTypeName");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNameLike(String value) {
            addCriterion("user.roleTypeName like", value, "roleTypeName");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNameNotLike(String value) {
            addCriterion("user.roleTypeName not like", value, "roleTypeName");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNameIn(List<String> values) {
            addCriterion("user.roleTypeName in", values, "roleTypeName");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNameNotIn(List<String> values) {
            addCriterion("user.roleTypeName not in", values, "roleTypeName");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNameBetween(String value1, String value2) {
            addCriterion("user.roleTypeName between", value1, value2, "roleTypeName");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNameNotBetween(String value1, String value2) {
            addCriterion("user.roleTypeName not between", value1, value2, "roleTypeName");
            return (Criteria) this;
        }

        public Criteria andRoleIDIsNull() {
            addCriterion("user.roleID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIDIsNotNull() {
            addCriterion("user.roleID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIDEqualTo(Long value) {
            addCriterion("user.roleID =", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDNotEqualTo(Long value) {
            addCriterion("user.roleID <>", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDGreaterThan(Long value) {
            addCriterion("user.roleID >", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDGreaterThanOrEqualTo(Long value) {
            addCriterion("user.roleID >=", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDLessThan(Long value) {
            addCriterion("user.roleID <", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDLessThanOrEqualTo(Long value) {
            addCriterion("user.roleID <=", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDIn(List<Long> values) {
            addCriterion("user.roleID in", values, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDNotIn(List<Long> values) {
            addCriterion("user.roleID not in", values, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDBetween(Long value1, Long value2) {
            addCriterion("user.roleID between", value1, value2, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDNotBetween(Long value1, Long value2) {
            addCriterion("user.roleID not between", value1, value2, "roleID");
            return (Criteria) this;
        }

        public Criteria andFoundDateIsNull() {
            addCriterion("user.foundDate is null");
            return (Criteria) this;
        }

        public Criteria andFoundDateIsNotNull() {
            addCriterion("user.foundDate is not null");
            return (Criteria) this;
        }

        public Criteria andFoundDateEqualTo(Date value) {
            addCriterion("user.foundDate =", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateNotEqualTo(Date value) {
            addCriterion("user.foundDate <>", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateGreaterThan(Date value) {
            addCriterion("user.foundDate >", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateGreaterThanOrEqualTo(Date value) {
            addCriterion("user.foundDate >=", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateLessThan(Date value) {
            addCriterion("user.foundDate <", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateLessThanOrEqualTo(Date value) {
            addCriterion("user.foundDate <=", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateIn(List<Date> values) {
            addCriterion("user.foundDate in", values, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateNotIn(List<Date> values) {
            addCriterion("user.foundDate not in", values, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateBetween(Date value1, Date value2) {
            addCriterion("user.foundDate between", value1, value2, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateNotBetween(Date value1, Date value2) {
            addCriterion("user.foundDate not between", value1, value2, "foundDate");
            return (Criteria) this;
        }

        public Criteria andRevisePeopleIsNull() {
            addCriterion("user.revisePeople is null");
            return (Criteria) this;
        }

        public Criteria andRevisePeopleIsNotNull() {
            addCriterion("user.revisePeople is not null");
            return (Criteria) this;
        }

        public Criteria andRevisePeopleEqualTo(Long value) {
            addCriterion("user.revisePeople =", value, "revisePeople");
            return (Criteria) this;
        }

        public Criteria andRevisePeopleNotEqualTo(Long value) {
            addCriterion("user.revisePeople <>", value, "revisePeople");
            return (Criteria) this;
        }

        public Criteria andRevisePeopleGreaterThan(Long value) {
            addCriterion("user.revisePeople >", value, "revisePeople");
            return (Criteria) this;
        }

        public Criteria andRevisePeopleGreaterThanOrEqualTo(Long value) {
            addCriterion("user.revisePeople >=", value, "revisePeople");
            return (Criteria) this;
        }

        public Criteria andRevisePeopleLessThan(Long value) {
            addCriterion("user.revisePeople <", value, "revisePeople");
            return (Criteria) this;
        }

        public Criteria andRevisePeopleLessThanOrEqualTo(Long value) {
            addCriterion("user.revisePeople <=", value, "revisePeople");
            return (Criteria) this;
        }

        public Criteria andRevisePeopleIn(List<Long> values) {
            addCriterion("user.revisePeople in", values, "revisePeople");
            return (Criteria) this;
        }

        public Criteria andRevisePeopleNotIn(List<Long> values) {
            addCriterion("user.revisePeople not in", values, "revisePeople");
            return (Criteria) this;
        }

        public Criteria andRevisePeopleBetween(Long value1, Long value2) {
            addCriterion("user.revisePeople between", value1, value2, "revisePeople");
            return (Criteria) this;
        }

        public Criteria andRevisePeopleNotBetween(Long value1, Long value2) {
            addCriterion("user.revisePeople not between", value1, value2, "revisePeople");
            return (Criteria) this;
        }

        public Criteria andReviseDateIsNull() {
            addCriterion("user.reviseDate is null");
            return (Criteria) this;
        }

        public Criteria andReviseDateIsNotNull() {
            addCriterion("user.reviseDate is not null");
            return (Criteria) this;
        }

        public Criteria andReviseDateEqualTo(Date value) {
            addCriterion("user.reviseDate =", value, "reviseDate");
            return (Criteria) this;
        }

        public Criteria andReviseDateNotEqualTo(Date value) {
            addCriterion("user.reviseDate <>", value, "reviseDate");
            return (Criteria) this;
        }

        public Criteria andReviseDateGreaterThan(Date value) {
            addCriterion("user.reviseDate >", value, "reviseDate");
            return (Criteria) this;
        }

        public Criteria andReviseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("user.reviseDate >=", value, "reviseDate");
            return (Criteria) this;
        }

        public Criteria andReviseDateLessThan(Date value) {
            addCriterion("user.reviseDate <", value, "reviseDate");
            return (Criteria) this;
        }

        public Criteria andReviseDateLessThanOrEqualTo(Date value) {
            addCriterion("user.reviseDate <=", value, "reviseDate");
            return (Criteria) this;
        }

        public Criteria andReviseDateIn(List<Date> values) {
            addCriterion("user.reviseDate in", values, "reviseDate");
            return (Criteria) this;
        }

        public Criteria andReviseDateNotIn(List<Date> values) {
            addCriterion("user.reviseDate not in", values, "reviseDate");
            return (Criteria) this;
        }

        public Criteria andReviseDateBetween(Date value1, Date value2) {
            addCriterion("user.reviseDate between", value1, value2, "reviseDate");
            return (Criteria) this;
        }

        public Criteria andReviseDateNotBetween(Date value1, Date value2) {
            addCriterion("user.reviseDate not between", value1, value2, "reviseDate");
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