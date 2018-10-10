package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class PartnerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartnerExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIsNull() {
            addCriterion("partner_name is null");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIsNotNull() {
            addCriterion("partner_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerNameEqualTo(String value) {
            addCriterion("partner_name =", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotEqualTo(String value) {
            addCriterion("partner_name <>", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameGreaterThan(String value) {
            addCriterion("partner_name >", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("partner_name >=", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLessThan(String value) {
            addCriterion("partner_name <", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLessThanOrEqualTo(String value) {
            addCriterion("partner_name <=", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLike(String value) {
            addCriterion("partner_name like", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotLike(String value) {
            addCriterion("partner_name not like", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIn(List<String> values) {
            addCriterion("partner_name in", values, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotIn(List<String> values) {
            addCriterion("partner_name not in", values, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameBetween(String value1, String value2) {
            addCriterion("partner_name between", value1, value2, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotBetween(String value1, String value2) {
            addCriterion("partner_name not between", value1, value2, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerIndustryIsNull() {
            addCriterion("partner_industry is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIndustryIsNotNull() {
            addCriterion("partner_industry is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerIndustryEqualTo(String value) {
            addCriterion("partner_industry =", value, "partnerIndustry");
            return (Criteria) this;
        }

        public Criteria andPartnerIndustryNotEqualTo(String value) {
            addCriterion("partner_industry <>", value, "partnerIndustry");
            return (Criteria) this;
        }

        public Criteria andPartnerIndustryGreaterThan(String value) {
            addCriterion("partner_industry >", value, "partnerIndustry");
            return (Criteria) this;
        }

        public Criteria andPartnerIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("partner_industry >=", value, "partnerIndustry");
            return (Criteria) this;
        }

        public Criteria andPartnerIndustryLessThan(String value) {
            addCriterion("partner_industry <", value, "partnerIndustry");
            return (Criteria) this;
        }

        public Criteria andPartnerIndustryLessThanOrEqualTo(String value) {
            addCriterion("partner_industry <=", value, "partnerIndustry");
            return (Criteria) this;
        }

        public Criteria andPartnerIndustryLike(String value) {
            addCriterion("partner_industry like", value, "partnerIndustry");
            return (Criteria) this;
        }

        public Criteria andPartnerIndustryNotLike(String value) {
            addCriterion("partner_industry not like", value, "partnerIndustry");
            return (Criteria) this;
        }

        public Criteria andPartnerIndustryIn(List<String> values) {
            addCriterion("partner_industry in", values, "partnerIndustry");
            return (Criteria) this;
        }

        public Criteria andPartnerIndustryNotIn(List<String> values) {
            addCriterion("partner_industry not in", values, "partnerIndustry");
            return (Criteria) this;
        }

        public Criteria andPartnerIndustryBetween(String value1, String value2) {
            addCriterion("partner_industry between", value1, value2, "partnerIndustry");
            return (Criteria) this;
        }

        public Criteria andPartnerIndustryNotBetween(String value1, String value2) {
            addCriterion("partner_industry not between", value1, value2, "partnerIndustry");
            return (Criteria) this;
        }

        public Criteria andPartnerScopeIsNull() {
            addCriterion("partner_scope is null");
            return (Criteria) this;
        }

        public Criteria andPartnerScopeIsNotNull() {
            addCriterion("partner_scope is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerScopeEqualTo(String value) {
            addCriterion("partner_scope =", value, "partnerScope");
            return (Criteria) this;
        }

        public Criteria andPartnerScopeNotEqualTo(String value) {
            addCriterion("partner_scope <>", value, "partnerScope");
            return (Criteria) this;
        }

        public Criteria andPartnerScopeGreaterThan(String value) {
            addCriterion("partner_scope >", value, "partnerScope");
            return (Criteria) this;
        }

        public Criteria andPartnerScopeGreaterThanOrEqualTo(String value) {
            addCriterion("partner_scope >=", value, "partnerScope");
            return (Criteria) this;
        }

        public Criteria andPartnerScopeLessThan(String value) {
            addCriterion("partner_scope <", value, "partnerScope");
            return (Criteria) this;
        }

        public Criteria andPartnerScopeLessThanOrEqualTo(String value) {
            addCriterion("partner_scope <=", value, "partnerScope");
            return (Criteria) this;
        }

        public Criteria andPartnerScopeLike(String value) {
            addCriterion("partner_scope like", value, "partnerScope");
            return (Criteria) this;
        }

        public Criteria andPartnerScopeNotLike(String value) {
            addCriterion("partner_scope not like", value, "partnerScope");
            return (Criteria) this;
        }

        public Criteria andPartnerScopeIn(List<String> values) {
            addCriterion("partner_scope in", values, "partnerScope");
            return (Criteria) this;
        }

        public Criteria andPartnerScopeNotIn(List<String> values) {
            addCriterion("partner_scope not in", values, "partnerScope");
            return (Criteria) this;
        }

        public Criteria andPartnerScopeBetween(String value1, String value2) {
            addCriterion("partner_scope between", value1, value2, "partnerScope");
            return (Criteria) this;
        }

        public Criteria andPartnerScopeNotBetween(String value1, String value2) {
            addCriterion("partner_scope not between", value1, value2, "partnerScope");
            return (Criteria) this;
        }

        public Criteria andPartnerAddressIsNull() {
            addCriterion("partner_address is null");
            return (Criteria) this;
        }

        public Criteria andPartnerAddressIsNotNull() {
            addCriterion("partner_address is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerAddressEqualTo(String value) {
            addCriterion("partner_address =", value, "partnerAddress");
            return (Criteria) this;
        }

        public Criteria andPartnerAddressNotEqualTo(String value) {
            addCriterion("partner_address <>", value, "partnerAddress");
            return (Criteria) this;
        }

        public Criteria andPartnerAddressGreaterThan(String value) {
            addCriterion("partner_address >", value, "partnerAddress");
            return (Criteria) this;
        }

        public Criteria andPartnerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("partner_address >=", value, "partnerAddress");
            return (Criteria) this;
        }

        public Criteria andPartnerAddressLessThan(String value) {
            addCriterion("partner_address <", value, "partnerAddress");
            return (Criteria) this;
        }

        public Criteria andPartnerAddressLessThanOrEqualTo(String value) {
            addCriterion("partner_address <=", value, "partnerAddress");
            return (Criteria) this;
        }

        public Criteria andPartnerAddressLike(String value) {
            addCriterion("partner_address like", value, "partnerAddress");
            return (Criteria) this;
        }

        public Criteria andPartnerAddressNotLike(String value) {
            addCriterion("partner_address not like", value, "partnerAddress");
            return (Criteria) this;
        }

        public Criteria andPartnerAddressIn(List<String> values) {
            addCriterion("partner_address in", values, "partnerAddress");
            return (Criteria) this;
        }

        public Criteria andPartnerAddressNotIn(List<String> values) {
            addCriterion("partner_address not in", values, "partnerAddress");
            return (Criteria) this;
        }

        public Criteria andPartnerAddressBetween(String value1, String value2) {
            addCriterion("partner_address between", value1, value2, "partnerAddress");
            return (Criteria) this;
        }

        public Criteria andPartnerAddressNotBetween(String value1, String value2) {
            addCriterion("partner_address not between", value1, value2, "partnerAddress");
            return (Criteria) this;
        }

        public Criteria andPartnerCreatedIsNull() {
            addCriterion("partner_created is null");
            return (Criteria) this;
        }

        public Criteria andPartnerCreatedIsNotNull() {
            addCriterion("partner_created is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerCreatedEqualTo(Integer value) {
            addCriterion("partner_created =", value, "partnerCreated");
            return (Criteria) this;
        }

        public Criteria andPartnerCreatedNotEqualTo(Integer value) {
            addCriterion("partner_created <>", value, "partnerCreated");
            return (Criteria) this;
        }

        public Criteria andPartnerCreatedGreaterThan(Integer value) {
            addCriterion("partner_created >", value, "partnerCreated");
            return (Criteria) this;
        }

        public Criteria andPartnerCreatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("partner_created >=", value, "partnerCreated");
            return (Criteria) this;
        }

        public Criteria andPartnerCreatedLessThan(Integer value) {
            addCriterion("partner_created <", value, "partnerCreated");
            return (Criteria) this;
        }

        public Criteria andPartnerCreatedLessThanOrEqualTo(Integer value) {
            addCriterion("partner_created <=", value, "partnerCreated");
            return (Criteria) this;
        }

        public Criteria andPartnerCreatedIn(List<Integer> values) {
            addCriterion("partner_created in", values, "partnerCreated");
            return (Criteria) this;
        }

        public Criteria andPartnerCreatedNotIn(List<Integer> values) {
            addCriterion("partner_created not in", values, "partnerCreated");
            return (Criteria) this;
        }

        public Criteria andPartnerCreatedBetween(Integer value1, Integer value2) {
            addCriterion("partner_created between", value1, value2, "partnerCreated");
            return (Criteria) this;
        }

        public Criteria andPartnerCreatedNotBetween(Integer value1, Integer value2) {
            addCriterion("partner_created not between", value1, value2, "partnerCreated");
            return (Criteria) this;
        }

        public Criteria andPartnerUpdateIsNull() {
            addCriterion("partner_update is null");
            return (Criteria) this;
        }

        public Criteria andPartnerUpdateIsNotNull() {
            addCriterion("partner_update is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerUpdateEqualTo(Integer value) {
            addCriterion("partner_update =", value, "partnerUpdate");
            return (Criteria) this;
        }

        public Criteria andPartnerUpdateNotEqualTo(Integer value) {
            addCriterion("partner_update <>", value, "partnerUpdate");
            return (Criteria) this;
        }

        public Criteria andPartnerUpdateGreaterThan(Integer value) {
            addCriterion("partner_update >", value, "partnerUpdate");
            return (Criteria) this;
        }

        public Criteria andPartnerUpdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("partner_update >=", value, "partnerUpdate");
            return (Criteria) this;
        }

        public Criteria andPartnerUpdateLessThan(Integer value) {
            addCriterion("partner_update <", value, "partnerUpdate");
            return (Criteria) this;
        }

        public Criteria andPartnerUpdateLessThanOrEqualTo(Integer value) {
            addCriterion("partner_update <=", value, "partnerUpdate");
            return (Criteria) this;
        }

        public Criteria andPartnerUpdateIn(List<Integer> values) {
            addCriterion("partner_update in", values, "partnerUpdate");
            return (Criteria) this;
        }

        public Criteria andPartnerUpdateNotIn(List<Integer> values) {
            addCriterion("partner_update not in", values, "partnerUpdate");
            return (Criteria) this;
        }

        public Criteria andPartnerUpdateBetween(Integer value1, Integer value2) {
            addCriterion("partner_update between", value1, value2, "partnerUpdate");
            return (Criteria) this;
        }

        public Criteria andPartnerUpdateNotBetween(Integer value1, Integer value2) {
            addCriterion("partner_update not between", value1, value2, "partnerUpdate");
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