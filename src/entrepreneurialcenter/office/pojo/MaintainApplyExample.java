package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MaintainApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainApplyExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMaintainNameIsNull() {
            addCriterion("maintain_name is null");
            return (Criteria) this;
        }

        public Criteria andMaintainNameIsNotNull() {
            addCriterion("maintain_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainNameEqualTo(String value) {
            addCriterion("maintain_name =", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameNotEqualTo(String value) {
            addCriterion("maintain_name <>", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameGreaterThan(String value) {
            addCriterion("maintain_name >", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_name >=", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameLessThan(String value) {
            addCriterion("maintain_name <", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameLessThanOrEqualTo(String value) {
            addCriterion("maintain_name <=", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameLike(String value) {
            addCriterion("maintain_name like", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameNotLike(String value) {
            addCriterion("maintain_name not like", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameIn(List<String> values) {
            addCriterion("maintain_name in", values, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameNotIn(List<String> values) {
            addCriterion("maintain_name not in", values, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameBetween(String value1, String value2) {
            addCriterion("maintain_name between", value1, value2, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameNotBetween(String value1, String value2) {
            addCriterion("maintain_name not between", value1, value2, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneIsNull() {
            addCriterion("maintain_phone is null");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneIsNotNull() {
            addCriterion("maintain_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneEqualTo(String value) {
            addCriterion("maintain_phone =", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneNotEqualTo(String value) {
            addCriterion("maintain_phone <>", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneGreaterThan(String value) {
            addCriterion("maintain_phone >", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_phone >=", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneLessThan(String value) {
            addCriterion("maintain_phone <", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneLessThanOrEqualTo(String value) {
            addCriterion("maintain_phone <=", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneLike(String value) {
            addCriterion("maintain_phone like", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneNotLike(String value) {
            addCriterion("maintain_phone not like", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneIn(List<String> values) {
            addCriterion("maintain_phone in", values, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneNotIn(List<String> values) {
            addCriterion("maintain_phone not in", values, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneBetween(String value1, String value2) {
            addCriterion("maintain_phone between", value1, value2, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneNotBetween(String value1, String value2) {
            addCriterion("maintain_phone not between", value1, value2, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainAddressIsNull() {
            addCriterion("maintain_address is null");
            return (Criteria) this;
        }

        public Criteria andMaintainAddressIsNotNull() {
            addCriterion("maintain_address is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainAddressEqualTo(String value) {
            addCriterion("maintain_address =", value, "maintainAddress");
            return (Criteria) this;
        }

        public Criteria andMaintainAddressNotEqualTo(String value) {
            addCriterion("maintain_address <>", value, "maintainAddress");
            return (Criteria) this;
        }

        public Criteria andMaintainAddressGreaterThan(String value) {
            addCriterion("maintain_address >", value, "maintainAddress");
            return (Criteria) this;
        }

        public Criteria andMaintainAddressGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_address >=", value, "maintainAddress");
            return (Criteria) this;
        }

        public Criteria andMaintainAddressLessThan(String value) {
            addCriterion("maintain_address <", value, "maintainAddress");
            return (Criteria) this;
        }

        public Criteria andMaintainAddressLessThanOrEqualTo(String value) {
            addCriterion("maintain_address <=", value, "maintainAddress");
            return (Criteria) this;
        }

        public Criteria andMaintainAddressLike(String value) {
            addCriterion("maintain_address like", value, "maintainAddress");
            return (Criteria) this;
        }

        public Criteria andMaintainAddressNotLike(String value) {
            addCriterion("maintain_address not like", value, "maintainAddress");
            return (Criteria) this;
        }

        public Criteria andMaintainAddressIn(List<String> values) {
            addCriterion("maintain_address in", values, "maintainAddress");
            return (Criteria) this;
        }

        public Criteria andMaintainAddressNotIn(List<String> values) {
            addCriterion("maintain_address not in", values, "maintainAddress");
            return (Criteria) this;
        }

        public Criteria andMaintainAddressBetween(String value1, String value2) {
            addCriterion("maintain_address between", value1, value2, "maintainAddress");
            return (Criteria) this;
        }

        public Criteria andMaintainAddressNotBetween(String value1, String value2) {
            addCriterion("maintain_address not between", value1, value2, "maintainAddress");
            return (Criteria) this;
        }

        public Criteria andMaintainClassIsNull() {
            addCriterion("maintain_class is null");
            return (Criteria) this;
        }

        public Criteria andMaintainClassIsNotNull() {
            addCriterion("maintain_class is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainClassEqualTo(String value) {
            addCriterion("maintain_class =", value, "maintainClass");
            return (Criteria) this;
        }

        public Criteria andMaintainClassNotEqualTo(String value) {
            addCriterion("maintain_class <>", value, "maintainClass");
            return (Criteria) this;
        }

        public Criteria andMaintainClassGreaterThan(String value) {
            addCriterion("maintain_class >", value, "maintainClass");
            return (Criteria) this;
        }

        public Criteria andMaintainClassGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_class >=", value, "maintainClass");
            return (Criteria) this;
        }

        public Criteria andMaintainClassLessThan(String value) {
            addCriterion("maintain_class <", value, "maintainClass");
            return (Criteria) this;
        }

        public Criteria andMaintainClassLessThanOrEqualTo(String value) {
            addCriterion("maintain_class <=", value, "maintainClass");
            return (Criteria) this;
        }

        public Criteria andMaintainClassLike(String value) {
            addCriterion("maintain_class like", value, "maintainClass");
            return (Criteria) this;
        }

        public Criteria andMaintainClassNotLike(String value) {
            addCriterion("maintain_class not like", value, "maintainClass");
            return (Criteria) this;
        }

        public Criteria andMaintainClassIn(List<String> values) {
            addCriterion("maintain_class in", values, "maintainClass");
            return (Criteria) this;
        }

        public Criteria andMaintainClassNotIn(List<String> values) {
            addCriterion("maintain_class not in", values, "maintainClass");
            return (Criteria) this;
        }

        public Criteria andMaintainClassBetween(String value1, String value2) {
            addCriterion("maintain_class between", value1, value2, "maintainClass");
            return (Criteria) this;
        }

        public Criteria andMaintainClassNotBetween(String value1, String value2) {
            addCriterion("maintain_class not between", value1, value2, "maintainClass");
            return (Criteria) this;
        }

        public Criteria andMaintainImgIsNull() {
            addCriterion("maintain_img is null");
            return (Criteria) this;
        }

        public Criteria andMaintainImgIsNotNull() {
            addCriterion("maintain_img is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainImgEqualTo(String value) {
            addCriterion("maintain_img =", value, "maintainImg");
            return (Criteria) this;
        }

        public Criteria andMaintainImgNotEqualTo(String value) {
            addCriterion("maintain_img <>", value, "maintainImg");
            return (Criteria) this;
        }

        public Criteria andMaintainImgGreaterThan(String value) {
            addCriterion("maintain_img >", value, "maintainImg");
            return (Criteria) this;
        }

        public Criteria andMaintainImgGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_img >=", value, "maintainImg");
            return (Criteria) this;
        }

        public Criteria andMaintainImgLessThan(String value) {
            addCriterion("maintain_img <", value, "maintainImg");
            return (Criteria) this;
        }

        public Criteria andMaintainImgLessThanOrEqualTo(String value) {
            addCriterion("maintain_img <=", value, "maintainImg");
            return (Criteria) this;
        }

        public Criteria andMaintainImgLike(String value) {
            addCriterion("maintain_img like", value, "maintainImg");
            return (Criteria) this;
        }

        public Criteria andMaintainImgNotLike(String value) {
            addCriterion("maintain_img not like", value, "maintainImg");
            return (Criteria) this;
        }

        public Criteria andMaintainImgIn(List<String> values) {
            addCriterion("maintain_img in", values, "maintainImg");
            return (Criteria) this;
        }

        public Criteria andMaintainImgNotIn(List<String> values) {
            addCriterion("maintain_img not in", values, "maintainImg");
            return (Criteria) this;
        }

        public Criteria andMaintainImgBetween(String value1, String value2) {
            addCriterion("maintain_img between", value1, value2, "maintainImg");
            return (Criteria) this;
        }

        public Criteria andMaintainImgNotBetween(String value1, String value2) {
            addCriterion("maintain_img not between", value1, value2, "maintainImg");
            return (Criteria) this;
        }

        public Criteria andMaintainContentIsNull() {
            addCriterion("maintain_content is null");
            return (Criteria) this;
        }

        public Criteria andMaintainContentIsNotNull() {
            addCriterion("maintain_content is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainContentEqualTo(String value) {
            addCriterion("maintain_content =", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentNotEqualTo(String value) {
            addCriterion("maintain_content <>", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentGreaterThan(String value) {
            addCriterion("maintain_content >", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_content >=", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentLessThan(String value) {
            addCriterion("maintain_content <", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentLessThanOrEqualTo(String value) {
            addCriterion("maintain_content <=", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentLike(String value) {
            addCriterion("maintain_content like", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentNotLike(String value) {
            addCriterion("maintain_content not like", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentIn(List<String> values) {
            addCriterion("maintain_content in", values, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentNotIn(List<String> values) {
            addCriterion("maintain_content not in", values, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentBetween(String value1, String value2) {
            addCriterion("maintain_content between", value1, value2, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentNotBetween(String value1, String value2) {
            addCriterion("maintain_content not between", value1, value2, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainCheckIsNull() {
            addCriterion("maintain_check is null");
            return (Criteria) this;
        }

        public Criteria andMaintainCheckIsNotNull() {
            addCriterion("maintain_check is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainCheckEqualTo(Integer value) {
            addCriterion("maintain_check =", value, "maintainCheck");
            return (Criteria) this;
        }

        public Criteria andMaintainCheckNotEqualTo(Integer value) {
            addCriterion("maintain_check <>", value, "maintainCheck");
            return (Criteria) this;
        }

        public Criteria andMaintainCheckGreaterThan(Integer value) {
            addCriterion("maintain_check >", value, "maintainCheck");
            return (Criteria) this;
        }

        public Criteria andMaintainCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("maintain_check >=", value, "maintainCheck");
            return (Criteria) this;
        }

        public Criteria andMaintainCheckLessThan(Integer value) {
            addCriterion("maintain_check <", value, "maintainCheck");
            return (Criteria) this;
        }

        public Criteria andMaintainCheckLessThanOrEqualTo(Integer value) {
            addCriterion("maintain_check <=", value, "maintainCheck");
            return (Criteria) this;
        }

        public Criteria andMaintainCheckIn(List<Integer> values) {
            addCriterion("maintain_check in", values, "maintainCheck");
            return (Criteria) this;
        }

        public Criteria andMaintainCheckNotIn(List<Integer> values) {
            addCriterion("maintain_check not in", values, "maintainCheck");
            return (Criteria) this;
        }

        public Criteria andMaintainCheckBetween(Integer value1, Integer value2) {
            addCriterion("maintain_check between", value1, value2, "maintainCheck");
            return (Criteria) this;
        }

        public Criteria andMaintainCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("maintain_check not between", value1, value2, "maintainCheck");
            return (Criteria) this;
        }

        public Criteria andMaintainCreateIsNull() {
            addCriterion("maintain_create is null");
            return (Criteria) this;
        }

        public Criteria andMaintainCreateIsNotNull() {
            addCriterion("maintain_create is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainCreateEqualTo(Date value) {
            addCriterionForJDBCDate("maintain_create =", value, "maintainCreate");
            return (Criteria) this;
        }

        public Criteria andMaintainCreateNotEqualTo(Date value) {
            addCriterionForJDBCDate("maintain_create <>", value, "maintainCreate");
            return (Criteria) this;
        }

        public Criteria andMaintainCreateGreaterThan(Date value) {
            addCriterionForJDBCDate("maintain_create >", value, "maintainCreate");
            return (Criteria) this;
        }

        public Criteria andMaintainCreateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("maintain_create >=", value, "maintainCreate");
            return (Criteria) this;
        }

        public Criteria andMaintainCreateLessThan(Date value) {
            addCriterionForJDBCDate("maintain_create <", value, "maintainCreate");
            return (Criteria) this;
        }

        public Criteria andMaintainCreateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("maintain_create <=", value, "maintainCreate");
            return (Criteria) this;
        }

        public Criteria andMaintainCreateIn(List<Date> values) {
            addCriterionForJDBCDate("maintain_create in", values, "maintainCreate");
            return (Criteria) this;
        }

        public Criteria andMaintainCreateNotIn(List<Date> values) {
            addCriterionForJDBCDate("maintain_create not in", values, "maintainCreate");
            return (Criteria) this;
        }

        public Criteria andMaintainCreateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("maintain_create between", value1, value2, "maintainCreate");
            return (Criteria) this;
        }

        public Criteria andMaintainCreateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("maintain_create not between", value1, value2, "maintainCreate");
            return (Criteria) this;
        }

        public Criteria andMaintainUpdateIsNull() {
            addCriterion("maintain_update is null");
            return (Criteria) this;
        }

        public Criteria andMaintainUpdateIsNotNull() {
            addCriterion("maintain_update is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainUpdateEqualTo(Date value) {
            addCriterionForJDBCDate("maintain_update =", value, "maintainUpdate");
            return (Criteria) this;
        }

        public Criteria andMaintainUpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("maintain_update <>", value, "maintainUpdate");
            return (Criteria) this;
        }

        public Criteria andMaintainUpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("maintain_update >", value, "maintainUpdate");
            return (Criteria) this;
        }

        public Criteria andMaintainUpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("maintain_update >=", value, "maintainUpdate");
            return (Criteria) this;
        }

        public Criteria andMaintainUpdateLessThan(Date value) {
            addCriterionForJDBCDate("maintain_update <", value, "maintainUpdate");
            return (Criteria) this;
        }

        public Criteria andMaintainUpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("maintain_update <=", value, "maintainUpdate");
            return (Criteria) this;
        }

        public Criteria andMaintainUpdateIn(List<Date> values) {
            addCriterionForJDBCDate("maintain_update in", values, "maintainUpdate");
            return (Criteria) this;
        }

        public Criteria andMaintainUpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("maintain_update not in", values, "maintainUpdate");
            return (Criteria) this;
        }

        public Criteria andMaintainUpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("maintain_update between", value1, value2, "maintainUpdate");
            return (Criteria) this;
        }

        public Criteria andMaintainUpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("maintain_update not between", value1, value2, "maintainUpdate");
            return (Criteria) this;
        }

        public Criteria andFrontIdIsNull() {
            addCriterion("front_id is null");
            return (Criteria) this;
        }

        public Criteria andFrontIdIsNotNull() {
            addCriterion("front_id is not null");
            return (Criteria) this;
        }

        public Criteria andFrontIdEqualTo(Long value) {
            addCriterion("front_id =", value, "frontId");
            return (Criteria) this;
        }

        public Criteria andFrontIdNotEqualTo(Long value) {
            addCriterion("front_id <>", value, "frontId");
            return (Criteria) this;
        }

        public Criteria andFrontIdGreaterThan(Long value) {
            addCriterion("front_id >", value, "frontId");
            return (Criteria) this;
        }

        public Criteria andFrontIdGreaterThanOrEqualTo(Long value) {
            addCriterion("front_id >=", value, "frontId");
            return (Criteria) this;
        }

        public Criteria andFrontIdLessThan(Long value) {
            addCriterion("front_id <", value, "frontId");
            return (Criteria) this;
        }

        public Criteria andFrontIdLessThanOrEqualTo(Long value) {
            addCriterion("front_id <=", value, "frontId");
            return (Criteria) this;
        }

        public Criteria andFrontIdIn(List<Long> values) {
            addCriterion("front_id in", values, "frontId");
            return (Criteria) this;
        }

        public Criteria andFrontIdNotIn(List<Long> values) {
            addCriterion("front_id not in", values, "frontId");
            return (Criteria) this;
        }

        public Criteria andFrontIdBetween(Long value1, Long value2) {
            addCriterion("front_id between", value1, value2, "frontId");
            return (Criteria) this;
        }

        public Criteria andFrontIdNotBetween(Long value1, Long value2) {
            addCriterion("front_id not between", value1, value2, "frontId");
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