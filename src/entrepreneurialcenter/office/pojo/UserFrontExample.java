package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserFrontExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserFrontExample() {
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

        public Criteria andFrontNameIsNull() {
            addCriterion("front_name is null");
            return (Criteria) this;
        }

        public Criteria andFrontNameIsNotNull() {
            addCriterion("front_name is not null");
            return (Criteria) this;
        }

        public Criteria andFrontNameEqualTo(String value) {
            addCriterion("front_name =", value, "frontName");
            return (Criteria) this;
        }

        public Criteria andFrontNameNotEqualTo(String value) {
            addCriterion("front_name <>", value, "frontName");
            return (Criteria) this;
        }

        public Criteria andFrontNameGreaterThan(String value) {
            addCriterion("front_name >", value, "frontName");
            return (Criteria) this;
        }

        public Criteria andFrontNameGreaterThanOrEqualTo(String value) {
            addCriterion("front_name >=", value, "frontName");
            return (Criteria) this;
        }

        public Criteria andFrontNameLessThan(String value) {
            addCriterion("front_name <", value, "frontName");
            return (Criteria) this;
        }

        public Criteria andFrontNameLessThanOrEqualTo(String value) {
            addCriterion("front_name <=", value, "frontName");
            return (Criteria) this;
        }

        public Criteria andFrontNameLike(String value) {
            addCriterion("front_name like", value, "frontName");
            return (Criteria) this;
        }

        public Criteria andFrontNameNotLike(String value) {
            addCriterion("front_name not like", value, "frontName");
            return (Criteria) this;
        }

        public Criteria andFrontNameIn(List<String> values) {
            addCriterion("front_name in", values, "frontName");
            return (Criteria) this;
        }

        public Criteria andFrontNameNotIn(List<String> values) {
            addCriterion("front_name not in", values, "frontName");
            return (Criteria) this;
        }

        public Criteria andFrontNameBetween(String value1, String value2) {
            addCriterion("front_name between", value1, value2, "frontName");
            return (Criteria) this;
        }

        public Criteria andFrontNameNotBetween(String value1, String value2) {
            addCriterion("front_name not between", value1, value2, "frontName");
            return (Criteria) this;
        }

        public Criteria andFrontPassIsNull() {
            addCriterion("front_pass is null");
            return (Criteria) this;
        }

        public Criteria andFrontPassIsNotNull() {
            addCriterion("front_pass is not null");
            return (Criteria) this;
        }

        public Criteria andFrontPassEqualTo(String value) {
            addCriterion("front_pass =", value, "frontPass");
            return (Criteria) this;
        }

        public Criteria andFrontPassNotEqualTo(String value) {
            addCriterion("front_pass <>", value, "frontPass");
            return (Criteria) this;
        }

        public Criteria andFrontPassGreaterThan(String value) {
            addCriterion("front_pass >", value, "frontPass");
            return (Criteria) this;
        }

        public Criteria andFrontPassGreaterThanOrEqualTo(String value) {
            addCriterion("front_pass >=", value, "frontPass");
            return (Criteria) this;
        }

        public Criteria andFrontPassLessThan(String value) {
            addCriterion("front_pass <", value, "frontPass");
            return (Criteria) this;
        }

        public Criteria andFrontPassLessThanOrEqualTo(String value) {
            addCriterion("front_pass <=", value, "frontPass");
            return (Criteria) this;
        }

        public Criteria andFrontPassLike(String value) {
            addCriterion("front_pass like", value, "frontPass");
            return (Criteria) this;
        }

        public Criteria andFrontPassNotLike(String value) {
            addCriterion("front_pass not like", value, "frontPass");
            return (Criteria) this;
        }

        public Criteria andFrontPassIn(List<String> values) {
            addCriterion("front_pass in", values, "frontPass");
            return (Criteria) this;
        }

        public Criteria andFrontPassNotIn(List<String> values) {
            addCriterion("front_pass not in", values, "frontPass");
            return (Criteria) this;
        }

        public Criteria andFrontPassBetween(String value1, String value2) {
            addCriterion("front_pass between", value1, value2, "frontPass");
            return (Criteria) this;
        }

        public Criteria andFrontPassNotBetween(String value1, String value2) {
            addCriterion("front_pass not between", value1, value2, "frontPass");
            return (Criteria) this;
        }

        public Criteria andFrontTelephoneIsNull() {
            addCriterion("front_telephone is null");
            return (Criteria) this;
        }

        public Criteria andFrontTelephoneIsNotNull() {
            addCriterion("front_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andFrontTelephoneEqualTo(String value) {
            addCriterion("front_telephone =", value, "frontTelephone");
            return (Criteria) this;
        }

        public Criteria andFrontTelephoneNotEqualTo(String value) {
            addCriterion("front_telephone <>", value, "frontTelephone");
            return (Criteria) this;
        }

        public Criteria andFrontTelephoneGreaterThan(String value) {
            addCriterion("front_telephone >", value, "frontTelephone");
            return (Criteria) this;
        }

        public Criteria andFrontTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("front_telephone >=", value, "frontTelephone");
            return (Criteria) this;
        }

        public Criteria andFrontTelephoneLessThan(String value) {
            addCriterion("front_telephone <", value, "frontTelephone");
            return (Criteria) this;
        }

        public Criteria andFrontTelephoneLessThanOrEqualTo(String value) {
            addCriterion("front_telephone <=", value, "frontTelephone");
            return (Criteria) this;
        }

        public Criteria andFrontTelephoneLike(String value) {
            addCriterion("front_telephone like", value, "frontTelephone");
            return (Criteria) this;
        }

        public Criteria andFrontTelephoneNotLike(String value) {
            addCriterion("front_telephone not like", value, "frontTelephone");
            return (Criteria) this;
        }

        public Criteria andFrontTelephoneIn(List<String> values) {
            addCriterion("front_telephone in", values, "frontTelephone");
            return (Criteria) this;
        }

        public Criteria andFrontTelephoneNotIn(List<String> values) {
            addCriterion("front_telephone not in", values, "frontTelephone");
            return (Criteria) this;
        }

        public Criteria andFrontTelephoneBetween(String value1, String value2) {
            addCriterion("front_telephone between", value1, value2, "frontTelephone");
            return (Criteria) this;
        }

        public Criteria andFrontTelephoneNotBetween(String value1, String value2) {
            addCriterion("front_telephone not between", value1, value2, "frontTelephone");
            return (Criteria) this;
        }

        public Criteria andFrontStatusIsNull() {
            addCriterion("front_status is null");
            return (Criteria) this;
        }

        public Criteria andFrontStatusIsNotNull() {
            addCriterion("front_status is not null");
            return (Criteria) this;
        }

        public Criteria andFrontStatusEqualTo(String value) {
            addCriterion("front_status =", value, "frontStatus");
            return (Criteria) this;
        }

        public Criteria andFrontStatusNotEqualTo(String value) {
            addCriterion("front_status <>", value, "frontStatus");
            return (Criteria) this;
        }

        public Criteria andFrontStatusGreaterThan(String value) {
            addCriterion("front_status >", value, "frontStatus");
            return (Criteria) this;
        }

        public Criteria andFrontStatusGreaterThanOrEqualTo(String value) {
            addCriterion("front_status >=", value, "frontStatus");
            return (Criteria) this;
        }

        public Criteria andFrontStatusLessThan(String value) {
            addCriterion("front_status <", value, "frontStatus");
            return (Criteria) this;
        }

        public Criteria andFrontStatusLessThanOrEqualTo(String value) {
            addCriterion("front_status <=", value, "frontStatus");
            return (Criteria) this;
        }

        public Criteria andFrontStatusLike(String value) {
            addCriterion("front_status like", value, "frontStatus");
            return (Criteria) this;
        }

        public Criteria andFrontStatusNotLike(String value) {
            addCriterion("front_status not like", value, "frontStatus");
            return (Criteria) this;
        }

        public Criteria andFrontStatusIn(List<String> values) {
            addCriterion("front_status in", values, "frontStatus");
            return (Criteria) this;
        }

        public Criteria andFrontStatusNotIn(List<String> values) {
            addCriterion("front_status not in", values, "frontStatus");
            return (Criteria) this;
        }

        public Criteria andFrontStatusBetween(String value1, String value2) {
            addCriterion("front_status between", value1, value2, "frontStatus");
            return (Criteria) this;
        }

        public Criteria andFrontStatusNotBetween(String value1, String value2) {
            addCriterion("front_status not between", value1, value2, "frontStatus");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Integer value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Integer value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Integer value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Integer value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Integer value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Integer> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Integer> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Integer value1, Integer value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Integer value1, Integer value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Integer value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Integer value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Integer value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Integer value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Integer value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Integer> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Integer> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Integer value1, Integer value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Integer value1, Integer value2) {
            addCriterion("created not between", value1, value2, "created");
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