package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class ComIndustriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComIndustriesExample() {
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

        public Criteria andIndIdIsNull() {
            addCriterion("ind_id is null");
            return (Criteria) this;
        }

        public Criteria andIndIdIsNotNull() {
            addCriterion("ind_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndIdEqualTo(Long value) {
            addCriterion("ind_id =", value, "indId");
            return (Criteria) this;
        }

        public Criteria andIndIdNotEqualTo(Long value) {
            addCriterion("ind_id <>", value, "indId");
            return (Criteria) this;
        }

        public Criteria andIndIdGreaterThan(Long value) {
            addCriterion("ind_id >", value, "indId");
            return (Criteria) this;
        }

        public Criteria andIndIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ind_id >=", value, "indId");
            return (Criteria) this;
        }

        public Criteria andIndIdLessThan(Long value) {
            addCriterion("ind_id <", value, "indId");
            return (Criteria) this;
        }

        public Criteria andIndIdLessThanOrEqualTo(Long value) {
            addCriterion("ind_id <=", value, "indId");
            return (Criteria) this;
        }

        public Criteria andIndIdIn(List<Long> values) {
            addCriterion("ind_id in", values, "indId");
            return (Criteria) this;
        }

        public Criteria andIndIdNotIn(List<Long> values) {
            addCriterion("ind_id not in", values, "indId");
            return (Criteria) this;
        }

        public Criteria andIndIdBetween(Long value1, Long value2) {
            addCriterion("ind_id between", value1, value2, "indId");
            return (Criteria) this;
        }

        public Criteria andIndIdNotBetween(Long value1, Long value2) {
            addCriterion("ind_id not between", value1, value2, "indId");
            return (Criteria) this;
        }

        public Criteria andIndTitleIsNull() {
            addCriterion("ind_title is null");
            return (Criteria) this;
        }

        public Criteria andIndTitleIsNotNull() {
            addCriterion("ind_title is not null");
            return (Criteria) this;
        }

        public Criteria andIndTitleEqualTo(String value) {
            addCriterion("ind_title =", value, "indTitle");
            return (Criteria) this;
        }

        public Criteria andIndTitleNotEqualTo(String value) {
            addCriterion("ind_title <>", value, "indTitle");
            return (Criteria) this;
        }

        public Criteria andIndTitleGreaterThan(String value) {
            addCriterion("ind_title >", value, "indTitle");
            return (Criteria) this;
        }

        public Criteria andIndTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ind_title >=", value, "indTitle");
            return (Criteria) this;
        }

        public Criteria andIndTitleLessThan(String value) {
            addCriterion("ind_title <", value, "indTitle");
            return (Criteria) this;
        }

        public Criteria andIndTitleLessThanOrEqualTo(String value) {
            addCriterion("ind_title <=", value, "indTitle");
            return (Criteria) this;
        }

        public Criteria andIndTitleLike(String value) {
            addCriterion("ind_title like", value, "indTitle");
            return (Criteria) this;
        }

        public Criteria andIndTitleNotLike(String value) {
            addCriterion("ind_title not like", value, "indTitle");
            return (Criteria) this;
        }

        public Criteria andIndTitleIn(List<String> values) {
            addCriterion("ind_title in", values, "indTitle");
            return (Criteria) this;
        }

        public Criteria andIndTitleNotIn(List<String> values) {
            addCriterion("ind_title not in", values, "indTitle");
            return (Criteria) this;
        }

        public Criteria andIndTitleBetween(String value1, String value2) {
            addCriterion("ind_title between", value1, value2, "indTitle");
            return (Criteria) this;
        }

        public Criteria andIndTitleNotBetween(String value1, String value2) {
            addCriterion("ind_title not between", value1, value2, "indTitle");
            return (Criteria) this;
        }

        public Criteria andIndStatusIsNull() {
            addCriterion("ind_status is null");
            return (Criteria) this;
        }

        public Criteria andIndStatusIsNotNull() {
            addCriterion("ind_status is not null");
            return (Criteria) this;
        }

        public Criteria andIndStatusEqualTo(String value) {
            addCriterion("ind_status =", value, "indStatus");
            return (Criteria) this;
        }

        public Criteria andIndStatusNotEqualTo(String value) {
            addCriterion("ind_status <>", value, "indStatus");
            return (Criteria) this;
        }

        public Criteria andIndStatusGreaterThan(String value) {
            addCriterion("ind_status >", value, "indStatus");
            return (Criteria) this;
        }

        public Criteria andIndStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ind_status >=", value, "indStatus");
            return (Criteria) this;
        }

        public Criteria andIndStatusLessThan(String value) {
            addCriterion("ind_status <", value, "indStatus");
            return (Criteria) this;
        }

        public Criteria andIndStatusLessThanOrEqualTo(String value) {
            addCriterion("ind_status <=", value, "indStatus");
            return (Criteria) this;
        }

        public Criteria andIndStatusLike(String value) {
            addCriterion("ind_status like", value, "indStatus");
            return (Criteria) this;
        }

        public Criteria andIndStatusNotLike(String value) {
            addCriterion("ind_status not like", value, "indStatus");
            return (Criteria) this;
        }

        public Criteria andIndStatusIn(List<String> values) {
            addCriterion("ind_status in", values, "indStatus");
            return (Criteria) this;
        }

        public Criteria andIndStatusNotIn(List<String> values) {
            addCriterion("ind_status not in", values, "indStatus");
            return (Criteria) this;
        }

        public Criteria andIndStatusBetween(String value1, String value2) {
            addCriterion("ind_status between", value1, value2, "indStatus");
            return (Criteria) this;
        }

        public Criteria andIndStatusNotBetween(String value1, String value2) {
            addCriterion("ind_status not between", value1, value2, "indStatus");
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