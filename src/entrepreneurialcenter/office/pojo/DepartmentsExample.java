package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class DepartmentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentsExample() {
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

        public Criteria andDepIdIsNull() {
            addCriterion("dep_id is null");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNotNull() {
            addCriterion("dep_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepIdEqualTo(Long value) {
            addCriterion("dep_id =", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotEqualTo(Long value) {
            addCriterion("dep_id <>", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThan(Long value) {
            addCriterion("dep_id >", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dep_id >=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThan(Long value) {
            addCriterion("dep_id <", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThanOrEqualTo(Long value) {
            addCriterion("dep_id <=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdIn(List<Long> values) {
            addCriterion("dep_id in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotIn(List<Long> values) {
            addCriterion("dep_id not in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdBetween(Long value1, Long value2) {
            addCriterion("dep_id between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotBetween(Long value1, Long value2) {
            addCriterion("dep_id not between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andDepTitleIsNull() {
            addCriterion("dep_title is null");
            return (Criteria) this;
        }

        public Criteria andDepTitleIsNotNull() {
            addCriterion("dep_title is not null");
            return (Criteria) this;
        }

        public Criteria andDepTitleEqualTo(String value) {
            addCriterion("dep_title =", value, "depTitle");
            return (Criteria) this;
        }

        public Criteria andDepTitleNotEqualTo(String value) {
            addCriterion("dep_title <>", value, "depTitle");
            return (Criteria) this;
        }

        public Criteria andDepTitleGreaterThan(String value) {
            addCriterion("dep_title >", value, "depTitle");
            return (Criteria) this;
        }

        public Criteria andDepTitleGreaterThanOrEqualTo(String value) {
            addCriterion("dep_title >=", value, "depTitle");
            return (Criteria) this;
        }

        public Criteria andDepTitleLessThan(String value) {
            addCriterion("dep_title <", value, "depTitle");
            return (Criteria) this;
        }

        public Criteria andDepTitleLessThanOrEqualTo(String value) {
            addCriterion("dep_title <=", value, "depTitle");
            return (Criteria) this;
        }

        public Criteria andDepTitleLike(String value) {
            addCriterion("dep_title like", value, "depTitle");
            return (Criteria) this;
        }

        public Criteria andDepTitleNotLike(String value) {
            addCriterion("dep_title not like", value, "depTitle");
            return (Criteria) this;
        }

        public Criteria andDepTitleIn(List<String> values) {
            addCriterion("dep_title in", values, "depTitle");
            return (Criteria) this;
        }

        public Criteria andDepTitleNotIn(List<String> values) {
            addCriterion("dep_title not in", values, "depTitle");
            return (Criteria) this;
        }

        public Criteria andDepTitleBetween(String value1, String value2) {
            addCriterion("dep_title between", value1, value2, "depTitle");
            return (Criteria) this;
        }

        public Criteria andDepTitleNotBetween(String value1, String value2) {
            addCriterion("dep_title not between", value1, value2, "depTitle");
            return (Criteria) this;
        }

        public Criteria andDepStatusIsNull() {
            addCriterion("dep_status is null");
            return (Criteria) this;
        }

        public Criteria andDepStatusIsNotNull() {
            addCriterion("dep_status is not null");
            return (Criteria) this;
        }

        public Criteria andDepStatusEqualTo(String value) {
            addCriterion("dep_status =", value, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusNotEqualTo(String value) {
            addCriterion("dep_status <>", value, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusGreaterThan(String value) {
            addCriterion("dep_status >", value, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusGreaterThanOrEqualTo(String value) {
            addCriterion("dep_status >=", value, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusLessThan(String value) {
            addCriterion("dep_status <", value, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusLessThanOrEqualTo(String value) {
            addCriterion("dep_status <=", value, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusLike(String value) {
            addCriterion("dep_status like", value, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusNotLike(String value) {
            addCriterion("dep_status not like", value, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusIn(List<String> values) {
            addCriterion("dep_status in", values, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusNotIn(List<String> values) {
            addCriterion("dep_status not in", values, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusBetween(String value1, String value2) {
            addCriterion("dep_status between", value1, value2, "depStatus");
            return (Criteria) this;
        }

        public Criteria andDepStatusNotBetween(String value1, String value2) {
            addCriterion("dep_status not between", value1, value2, "depStatus");
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