package cn.qiantongmuseum.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostulantExample {
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

	public PostulantExample() {
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
            addCriterion("postulant.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("postulant.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("postulant.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("postulant.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("postulant.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("postulant.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("postulant.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("postulant.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("postulant.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("postulant.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("postulant.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("postulant.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("postulant.`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("postulant.`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("postulant.`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("postulant.`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("postulant.`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("postulant.`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("postulant.`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("postulant.`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("postulant.`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("postulant.`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("postulant.`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("postulant.`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("postulant.`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("postulant.`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexNameIsNull() {
            addCriterion("postulant.sexName is null");
            return (Criteria) this;
        }

        public Criteria andSexNameIsNotNull() {
            addCriterion("postulant.sexName is not null");
            return (Criteria) this;
        }

        public Criteria andSexNameEqualTo(String value) {
            addCriterion("postulant.sexName =", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotEqualTo(String value) {
            addCriterion("postulant.sexName <>", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameGreaterThan(String value) {
            addCriterion("postulant.sexName >", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameGreaterThanOrEqualTo(String value) {
            addCriterion("postulant.sexName >=", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameLessThan(String value) {
            addCriterion("postulant.sexName <", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameLessThanOrEqualTo(String value) {
            addCriterion("postulant.sexName <=", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameLike(String value) {
            addCriterion("postulant.sexName like", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotLike(String value) {
            addCriterion("postulant.sexName not like", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameIn(List<String> values) {
            addCriterion("postulant.sexName in", values, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotIn(List<String> values) {
            addCriterion("postulant.sexName not in", values, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameBetween(String value1, String value2) {
            addCriterion("postulant.sexName between", value1, value2, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotBetween(String value1, String value2) {
            addCriterion("postulant.sexName not between", value1, value2, "sexName");
            return (Criteria) this;
        }

        public Criteria andCardIDIsNull() {
            addCriterion("postulant.cardID is null");
            return (Criteria) this;
        }

        public Criteria andCardIDIsNotNull() {
            addCriterion("postulant.cardID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIDEqualTo(Long value) {
            addCriterion("postulant.cardID =", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDNotEqualTo(Long value) {
            addCriterion("postulant.cardID <>", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDGreaterThan(Long value) {
            addCriterion("postulant.cardID >", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDGreaterThanOrEqualTo(Long value) {
            addCriterion("postulant.cardID >=", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDLessThan(Long value) {
            addCriterion("postulant.cardID <", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDLessThanOrEqualTo(Long value) {
            addCriterion("postulant.cardID <=", value, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDIn(List<Long> values) {
            addCriterion("postulant.cardID in", values, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDNotIn(List<Long> values) {
            addCriterion("postulant.cardID not in", values, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDBetween(Long value1, Long value2) {
            addCriterion("postulant.cardID between", value1, value2, "cardID");
            return (Criteria) this;
        }

        public Criteria andCardIDNotBetween(Long value1, Long value2) {
            addCriterion("postulant.cardID not between", value1, value2, "cardID");
            return (Criteria) this;
        }

        public Criteria andZYZXLIsNull() {
            addCriterion("postulant.zYZXL is null");
            return (Criteria) this;
        }

        public Criteria andZYZXLIsNotNull() {
            addCriterion("postulant.zYZXL is not null");
            return (Criteria) this;
        }

        public Criteria andZYZXLEqualTo(Long value) {
            addCriterion("postulant.zYZXL =", value, "zYZXL");
            return (Criteria) this;
        }

        public Criteria andZYZXLNotEqualTo(Long value) {
            addCriterion("postulant.zYZXL <>", value, "zYZXL");
            return (Criteria) this;
        }

        public Criteria andZYZXLGreaterThan(Long value) {
            addCriterion("postulant.zYZXL >", value, "zYZXL");
            return (Criteria) this;
        }

        public Criteria andZYZXLGreaterThanOrEqualTo(Long value) {
            addCriterion("postulant.zYZXL >=", value, "zYZXL");
            return (Criteria) this;
        }

        public Criteria andZYZXLLessThan(Long value) {
            addCriterion("postulant.zYZXL <", value, "zYZXL");
            return (Criteria) this;
        }

        public Criteria andZYZXLLessThanOrEqualTo(Long value) {
            addCriterion("postulant.zYZXL <=", value, "zYZXL");
            return (Criteria) this;
        }

        public Criteria andZYZXLIn(List<Long> values) {
            addCriterion("postulant.zYZXL in", values, "zYZXL");
            return (Criteria) this;
        }

        public Criteria andZYZXLNotIn(List<Long> values) {
            addCriterion("postulant.zYZXL not in", values, "zYZXL");
            return (Criteria) this;
        }

        public Criteria andZYZXLBetween(Long value1, Long value2) {
            addCriterion("postulant.zYZXL between", value1, value2, "zYZXL");
            return (Criteria) this;
        }

        public Criteria andZYZXLNotBetween(Long value1, Long value2) {
            addCriterion("postulant.zYZXL not between", value1, value2, "zYZXL");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("postulant.mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("postulant.mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("postulant.mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("postulant.mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("postulant.mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("postulant.mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("postulant.mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("postulant.mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("postulant.mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("postulant.mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("postulant.mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("postulant.mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("postulant.mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("postulant.mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("postulant.eMail is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("postulant.eMail is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("postulant.eMail =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("postulant.eMail <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("postulant.eMail >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("postulant.eMail >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("postulant.eMail <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("postulant.eMail <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("postulant.eMail like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("postulant.eMail not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("postulant.eMail in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("postulant.eMail not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("postulant.eMail between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("postulant.eMail not between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("postulant.linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("postulant.linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("postulant.linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("postulant.linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("postulant.linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("postulant.linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("postulant.linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("postulant.linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("postulant.linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("postulant.linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("postulant.linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("postulant.linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("postulant.linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("postulant.linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinMobileIsNull() {
            addCriterion("postulant.linMobile is null");
            return (Criteria) this;
        }

        public Criteria andLinMobileIsNotNull() {
            addCriterion("postulant.linMobile is not null");
            return (Criteria) this;
        }

        public Criteria andLinMobileEqualTo(String value) {
            addCriterion("postulant.linMobile =", value, "linMobile");
            return (Criteria) this;
        }

        public Criteria andLinMobileNotEqualTo(String value) {
            addCriterion("postulant.linMobile <>", value, "linMobile");
            return (Criteria) this;
        }

        public Criteria andLinMobileGreaterThan(String value) {
            addCriterion("postulant.linMobile >", value, "linMobile");
            return (Criteria) this;
        }

        public Criteria andLinMobileGreaterThanOrEqualTo(String value) {
            addCriterion("postulant.linMobile >=", value, "linMobile");
            return (Criteria) this;
        }

        public Criteria andLinMobileLessThan(String value) {
            addCriterion("postulant.linMobile <", value, "linMobile");
            return (Criteria) this;
        }

        public Criteria andLinMobileLessThanOrEqualTo(String value) {
            addCriterion("postulant.linMobile <=", value, "linMobile");
            return (Criteria) this;
        }

        public Criteria andLinMobileLike(String value) {
            addCriterion("postulant.linMobile like", value, "linMobile");
            return (Criteria) this;
        }

        public Criteria andLinMobileNotLike(String value) {
            addCriterion("postulant.linMobile not like", value, "linMobile");
            return (Criteria) this;
        }

        public Criteria andLinMobileIn(List<String> values) {
            addCriterion("postulant.linMobile in", values, "linMobile");
            return (Criteria) this;
        }

        public Criteria andLinMobileNotIn(List<String> values) {
            addCriterion("postulant.linMobile not in", values, "linMobile");
            return (Criteria) this;
        }

        public Criteria andLinMobileBetween(String value1, String value2) {
            addCriterion("postulant.linMobile between", value1, value2, "linMobile");
            return (Criteria) this;
        }

        public Criteria andLinMobileNotBetween(String value1, String value2) {
            addCriterion("postulant.linMobile not between", value1, value2, "linMobile");
            return (Criteria) this;
        }

        public Criteria andNowAddressIsNull() {
            addCriterion("postulant.nowAddress is null");
            return (Criteria) this;
        }

        public Criteria andNowAddressIsNotNull() {
            addCriterion("postulant.nowAddress is not null");
            return (Criteria) this;
        }

        public Criteria andNowAddressEqualTo(String value) {
            addCriterion("postulant.nowAddress =", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotEqualTo(String value) {
            addCriterion("postulant.nowAddress <>", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressGreaterThan(String value) {
            addCriterion("postulant.nowAddress >", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressGreaterThanOrEqualTo(String value) {
            addCriterion("postulant.nowAddress >=", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressLessThan(String value) {
            addCriterion("postulant.nowAddress <", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressLessThanOrEqualTo(String value) {
            addCriterion("postulant.nowAddress <=", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressLike(String value) {
            addCriterion("postulant.nowAddress like", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotLike(String value) {
            addCriterion("postulant.nowAddress not like", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressIn(List<String> values) {
            addCriterion("postulant.nowAddress in", values, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotIn(List<String> values) {
            addCriterion("postulant.nowAddress not in", values, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressBetween(String value1, String value2) {
            addCriterion("postulant.nowAddress between", value1, value2, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotBetween(String value1, String value2) {
            addCriterion("postulant.nowAddress not between", value1, value2, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andWorkUndergoIsNull() {
            addCriterion("postulant.workUndergo is null");
            return (Criteria) this;
        }

        public Criteria andWorkUndergoIsNotNull() {
            addCriterion("postulant.workUndergo is not null");
            return (Criteria) this;
        }

        public Criteria andWorkUndergoEqualTo(String value) {
            addCriterion("postulant.workUndergo =", value, "workUndergo");
            return (Criteria) this;
        }

        public Criteria andWorkUndergoNotEqualTo(String value) {
            addCriterion("postulant.workUndergo <>", value, "workUndergo");
            return (Criteria) this;
        }

        public Criteria andWorkUndergoGreaterThan(String value) {
            addCriterion("postulant.workUndergo >", value, "workUndergo");
            return (Criteria) this;
        }

        public Criteria andWorkUndergoGreaterThanOrEqualTo(String value) {
            addCriterion("postulant.workUndergo >=", value, "workUndergo");
            return (Criteria) this;
        }

        public Criteria andWorkUndergoLessThan(String value) {
            addCriterion("postulant.workUndergo <", value, "workUndergo");
            return (Criteria) this;
        }

        public Criteria andWorkUndergoLessThanOrEqualTo(String value) {
            addCriterion("postulant.workUndergo <=", value, "workUndergo");
            return (Criteria) this;
        }

        public Criteria andWorkUndergoLike(String value) {
            addCriterion("postulant.workUndergo like", value, "workUndergo");
            return (Criteria) this;
        }

        public Criteria andWorkUndergoNotLike(String value) {
            addCriterion("postulant.workUndergo not like", value, "workUndergo");
            return (Criteria) this;
        }

        public Criteria andWorkUndergoIn(List<String> values) {
            addCriterion("postulant.workUndergo in", values, "workUndergo");
            return (Criteria) this;
        }

        public Criteria andWorkUndergoNotIn(List<String> values) {
            addCriterion("postulant.workUndergo not in", values, "workUndergo");
            return (Criteria) this;
        }

        public Criteria andWorkUndergoBetween(String value1, String value2) {
            addCriterion("postulant.workUndergo between", value1, value2, "workUndergo");
            return (Criteria) this;
        }

        public Criteria andWorkUndergoNotBetween(String value1, String value2) {
            addCriterion("postulant.workUndergo not between", value1, value2, "workUndergo");
            return (Criteria) this;
        }

        public Criteria andAuditingIDIsNull() {
            addCriterion("postulant.auditingID is null");
            return (Criteria) this;
        }

        public Criteria andAuditingIDIsNotNull() {
            addCriterion("postulant.auditingID is not null");
            return (Criteria) this;
        }

        public Criteria andAuditingIDEqualTo(Long value) {
            addCriterion("postulant.auditingID =", value, "auditingID");
            return (Criteria) this;
        }

        public Criteria andAuditingIDNotEqualTo(Long value) {
            addCriterion("postulant.auditingID <>", value, "auditingID");
            return (Criteria) this;
        }

        public Criteria andAuditingIDGreaterThan(Long value) {
            addCriterion("postulant.auditingID >", value, "auditingID");
            return (Criteria) this;
        }

        public Criteria andAuditingIDGreaterThanOrEqualTo(Long value) {
            addCriterion("postulant.auditingID >=", value, "auditingID");
            return (Criteria) this;
        }

        public Criteria andAuditingIDLessThan(Long value) {
            addCriterion("postulant.auditingID <", value, "auditingID");
            return (Criteria) this;
        }

        public Criteria andAuditingIDLessThanOrEqualTo(Long value) {
            addCriterion("postulant.auditingID <=", value, "auditingID");
            return (Criteria) this;
        }

        public Criteria andAuditingIDIn(List<Long> values) {
            addCriterion("postulant.auditingID in", values, "auditingID");
            return (Criteria) this;
        }

        public Criteria andAuditingIDNotIn(List<Long> values) {
            addCriterion("postulant.auditingID not in", values, "auditingID");
            return (Criteria) this;
        }

        public Criteria andAuditingIDBetween(Long value1, Long value2) {
            addCriterion("postulant.auditingID between", value1, value2, "auditingID");
            return (Criteria) this;
        }

        public Criteria andAuditingIDNotBetween(Long value1, Long value2) {
            addCriterion("postulant.auditingID not between", value1, value2, "auditingID");
            return (Criteria) this;
        }

        public Criteria andApplyForDateIsNull() {
            addCriterion("postulant.applyForDate is null");
            return (Criteria) this;
        }

        public Criteria andApplyForDateIsNotNull() {
            addCriterion("postulant.applyForDate is not null");
            return (Criteria) this;
        }

        public Criteria andApplyForDateEqualTo(Date value) {
            addCriterion("postulant.applyForDate =", value, "applyForDate");
            return (Criteria) this;
        }

        public Criteria andApplyForDateNotEqualTo(Date value) {
            addCriterion("postulant.applyForDate <>", value, "applyForDate");
            return (Criteria) this;
        }

        public Criteria andApplyForDateGreaterThan(Date value) {
            addCriterion("postulant.applyForDate >", value, "applyForDate");
            return (Criteria) this;
        }

        public Criteria andApplyForDateGreaterThanOrEqualTo(Date value) {
            addCriterion("postulant.applyForDate >=", value, "applyForDate");
            return (Criteria) this;
        }

        public Criteria andApplyForDateLessThan(Date value) {
            addCriterion("postulant.applyForDate <", value, "applyForDate");
            return (Criteria) this;
        }

        public Criteria andApplyForDateLessThanOrEqualTo(Date value) {
            addCriterion("postulant.applyForDate <=", value, "applyForDate");
            return (Criteria) this;
        }

        public Criteria andApplyForDateIn(List<Date> values) {
            addCriterion("postulant.applyForDate in", values, "applyForDate");
            return (Criteria) this;
        }

        public Criteria andApplyForDateNotIn(List<Date> values) {
            addCriterion("postulant.applyForDate not in", values, "applyForDate");
            return (Criteria) this;
        }

        public Criteria andApplyForDateBetween(Date value1, Date value2) {
            addCriterion("postulant.applyForDate between", value1, value2, "applyForDate");
            return (Criteria) this;
        }

        public Criteria andApplyForDateNotBetween(Date value1, Date value2) {
            addCriterion("postulant.applyForDate not between", value1, value2, "applyForDate");
            return (Criteria) this;
        }

        public Criteria andIfStartIsNull() {
            addCriterion("postulant.ifStart is null");
            return (Criteria) this;
        }

        public Criteria andIfStartIsNotNull() {
            addCriterion("postulant.ifStart is not null");
            return (Criteria) this;
        }

        public Criteria andIfStartEqualTo(Long value) {
            addCriterion("postulant.ifStart =", value, "ifStart");
            return (Criteria) this;
        }

        public Criteria andIfStartNotEqualTo(Long value) {
            addCriterion("postulant.ifStart <>", value, "ifStart");
            return (Criteria) this;
        }

        public Criteria andIfStartGreaterThan(Long value) {
            addCriterion("postulant.ifStart >", value, "ifStart");
            return (Criteria) this;
        }

        public Criteria andIfStartGreaterThanOrEqualTo(Long value) {
            addCriterion("postulant.ifStart >=", value, "ifStart");
            return (Criteria) this;
        }

        public Criteria andIfStartLessThan(Long value) {
            addCriterion("postulant.ifStart <", value, "ifStart");
            return (Criteria) this;
        }

        public Criteria andIfStartLessThanOrEqualTo(Long value) {
            addCriterion("postulant.ifStart <=", value, "ifStart");
            return (Criteria) this;
        }

        public Criteria andIfStartIn(List<Long> values) {
            addCriterion("postulant.ifStart in", values, "ifStart");
            return (Criteria) this;
        }

        public Criteria andIfStartNotIn(List<Long> values) {
            addCriterion("postulant.ifStart not in", values, "ifStart");
            return (Criteria) this;
        }

        public Criteria andIfStartBetween(Long value1, Long value2) {
            addCriterion("postulant.ifStart between", value1, value2, "ifStart");
            return (Criteria) this;
        }

        public Criteria andIfStartNotBetween(Long value1, Long value2) {
            addCriterion("postulant.ifStart not between", value1, value2, "ifStart");
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