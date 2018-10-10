package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ContactUsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContactUsExample() {
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

        public Criteria andContactIdIsNull() {
            addCriterion("contact_id is null");
            return (Criteria) this;
        }

        public Criteria andContactIdIsNotNull() {
            addCriterion("contact_id is not null");
            return (Criteria) this;
        }

        public Criteria andContactIdEqualTo(Integer value) {
            addCriterion("contact_id =", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotEqualTo(Integer value) {
            addCriterion("contact_id <>", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdGreaterThan(Integer value) {
            addCriterion("contact_id >", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact_id >=", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdLessThan(Integer value) {
            addCriterion("contact_id <", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdLessThanOrEqualTo(Integer value) {
            addCriterion("contact_id <=", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdIn(List<Integer> values) {
            addCriterion("contact_id in", values, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotIn(List<Integer> values) {
            addCriterion("contact_id not in", values, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdBetween(Integer value1, Integer value2) {
            addCriterion("contact_id between", value1, value2, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contact_id not between", value1, value2, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNull() {
            addCriterion("contact_email is null");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNotNull() {
            addCriterion("contact_email is not null");
            return (Criteria) this;
        }

        public Criteria andContactEmailEqualTo(String value) {
            addCriterion("contact_email =", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotEqualTo(String value) {
            addCriterion("contact_email <>", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThan(String value) {
            addCriterion("contact_email >", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThanOrEqualTo(String value) {
            addCriterion("contact_email >=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThan(String value) {
            addCriterion("contact_email <", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThanOrEqualTo(String value) {
            addCriterion("contact_email <=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLike(String value) {
            addCriterion("contact_email like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotLike(String value) {
            addCriterion("contact_email not like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailIn(List<String> values) {
            addCriterion("contact_email in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotIn(List<String> values) {
            addCriterion("contact_email not in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailBetween(String value1, String value2) {
            addCriterion("contact_email between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotBetween(String value1, String value2) {
            addCriterion("contact_email not between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNull() {
            addCriterion("contact_address is null");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNotNull() {
            addCriterion("contact_address is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddressEqualTo(String value) {
            addCriterion("contact_address =", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotEqualTo(String value) {
            addCriterion("contact_address <>", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThan(String value) {
            addCriterion("contact_address >", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("contact_address >=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThan(String value) {
            addCriterion("contact_address <", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThanOrEqualTo(String value) {
            addCriterion("contact_address <=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLike(String value) {
            addCriterion("contact_address like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotLike(String value) {
            addCriterion("contact_address not like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressIn(List<String> values) {
            addCriterion("contact_address in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotIn(List<String> values) {
            addCriterion("contact_address not in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressBetween(String value1, String value2) {
            addCriterion("contact_address between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotBetween(String value1, String value2) {
            addCriterion("contact_address not between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactContentIsNull() {
            addCriterion("contact_content is null");
            return (Criteria) this;
        }

        public Criteria andContactContentIsNotNull() {
            addCriterion("contact_content is not null");
            return (Criteria) this;
        }

        public Criteria andContactContentEqualTo(String value) {
            addCriterion("contact_content =", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotEqualTo(String value) {
            addCriterion("contact_content <>", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentGreaterThan(String value) {
            addCriterion("contact_content >", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentGreaterThanOrEqualTo(String value) {
            addCriterion("contact_content >=", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentLessThan(String value) {
            addCriterion("contact_content <", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentLessThanOrEqualTo(String value) {
            addCriterion("contact_content <=", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentLike(String value) {
            addCriterion("contact_content like", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotLike(String value) {
            addCriterion("contact_content not like", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentIn(List<String> values) {
            addCriterion("contact_content in", values, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotIn(List<String> values) {
            addCriterion("contact_content not in", values, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentBetween(String value1, String value2) {
            addCriterion("contact_content between", value1, value2, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotBetween(String value1, String value2) {
            addCriterion("contact_content not between", value1, value2, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactCheckIsNull() {
            addCriterion("contact_check is null");
            return (Criteria) this;
        }

        public Criteria andContactCheckIsNotNull() {
            addCriterion("contact_check is not null");
            return (Criteria) this;
        }

        public Criteria andContactCheckEqualTo(Integer value) {
            addCriterion("contact_check =", value, "contactCheck");
            return (Criteria) this;
        }

        public Criteria andContactCheckNotEqualTo(Integer value) {
            addCriterion("contact_check <>", value, "contactCheck");
            return (Criteria) this;
        }

        public Criteria andContactCheckGreaterThan(Integer value) {
            addCriterion("contact_check >", value, "contactCheck");
            return (Criteria) this;
        }

        public Criteria andContactCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact_check >=", value, "contactCheck");
            return (Criteria) this;
        }

        public Criteria andContactCheckLessThan(Integer value) {
            addCriterion("contact_check <", value, "contactCheck");
            return (Criteria) this;
        }

        public Criteria andContactCheckLessThanOrEqualTo(Integer value) {
            addCriterion("contact_check <=", value, "contactCheck");
            return (Criteria) this;
        }

        public Criteria andContactCheckIn(List<Integer> values) {
            addCriterion("contact_check in", values, "contactCheck");
            return (Criteria) this;
        }

        public Criteria andContactCheckNotIn(List<Integer> values) {
            addCriterion("contact_check not in", values, "contactCheck");
            return (Criteria) this;
        }

        public Criteria andContactCheckBetween(Integer value1, Integer value2) {
            addCriterion("contact_check between", value1, value2, "contactCheck");
            return (Criteria) this;
        }

        public Criteria andContactCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("contact_check not between", value1, value2, "contactCheck");
            return (Criteria) this;
        }

        public Criteria andContactCreateIsNull() {
            addCriterion("contact_create is null");
            return (Criteria) this;
        }

        public Criteria andContactCreateIsNotNull() {
            addCriterion("contact_create is not null");
            return (Criteria) this;
        }

        public Criteria andContactCreateEqualTo(Date value) {
            addCriterionForJDBCDate("contact_create =", value, "contactCreate");
            return (Criteria) this;
        }

        public Criteria andContactCreateNotEqualTo(Date value) {
            addCriterionForJDBCDate("contact_create <>", value, "contactCreate");
            return (Criteria) this;
        }

        public Criteria andContactCreateGreaterThan(Date value) {
            addCriterionForJDBCDate("contact_create >", value, "contactCreate");
            return (Criteria) this;
        }

        public Criteria andContactCreateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contact_create >=", value, "contactCreate");
            return (Criteria) this;
        }

        public Criteria andContactCreateLessThan(Date value) {
            addCriterionForJDBCDate("contact_create <", value, "contactCreate");
            return (Criteria) this;
        }

        public Criteria andContactCreateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contact_create <=", value, "contactCreate");
            return (Criteria) this;
        }

        public Criteria andContactCreateIn(List<Date> values) {
            addCriterionForJDBCDate("contact_create in", values, "contactCreate");
            return (Criteria) this;
        }

        public Criteria andContactCreateNotIn(List<Date> values) {
            addCriterionForJDBCDate("contact_create not in", values, "contactCreate");
            return (Criteria) this;
        }

        public Criteria andContactCreateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contact_create between", value1, value2, "contactCreate");
            return (Criteria) this;
        }

        public Criteria andContactCreateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contact_create not between", value1, value2, "contactCreate");
            return (Criteria) this;
        }

        public Criteria andContactUpdateIsNull() {
            addCriterion("contact_update is null");
            return (Criteria) this;
        }

        public Criteria andContactUpdateIsNotNull() {
            addCriterion("contact_update is not null");
            return (Criteria) this;
        }

        public Criteria andContactUpdateEqualTo(Date value) {
            addCriterionForJDBCDate("contact_update =", value, "contactUpdate");
            return (Criteria) this;
        }

        public Criteria andContactUpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("contact_update <>", value, "contactUpdate");
            return (Criteria) this;
        }

        public Criteria andContactUpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("contact_update >", value, "contactUpdate");
            return (Criteria) this;
        }

        public Criteria andContactUpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contact_update >=", value, "contactUpdate");
            return (Criteria) this;
        }

        public Criteria andContactUpdateLessThan(Date value) {
            addCriterionForJDBCDate("contact_update <", value, "contactUpdate");
            return (Criteria) this;
        }

        public Criteria andContactUpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contact_update <=", value, "contactUpdate");
            return (Criteria) this;
        }

        public Criteria andContactUpdateIn(List<Date> values) {
            addCriterionForJDBCDate("contact_update in", values, "contactUpdate");
            return (Criteria) this;
        }

        public Criteria andContactUpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("contact_update not in", values, "contactUpdate");
            return (Criteria) this;
        }

        public Criteria andContactUpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contact_update between", value1, value2, "contactUpdate");
            return (Criteria) this;
        }

        public Criteria andContactUpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contact_update not between", value1, value2, "contactUpdate");
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