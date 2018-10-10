package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class ComTypesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComTypesExample() {
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Long value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Long value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Long value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Long value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Long> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Long> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Long value1, Long value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeTitleIsNull() {
            addCriterion("type_title is null");
            return (Criteria) this;
        }

        public Criteria andTypeTitleIsNotNull() {
            addCriterion("type_title is not null");
            return (Criteria) this;
        }

        public Criteria andTypeTitleEqualTo(String value) {
            addCriterion("type_title =", value, "typeTitle");
            return (Criteria) this;
        }

        public Criteria andTypeTitleNotEqualTo(String value) {
            addCriterion("type_title <>", value, "typeTitle");
            return (Criteria) this;
        }

        public Criteria andTypeTitleGreaterThan(String value) {
            addCriterion("type_title >", value, "typeTitle");
            return (Criteria) this;
        }

        public Criteria andTypeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("type_title >=", value, "typeTitle");
            return (Criteria) this;
        }

        public Criteria andTypeTitleLessThan(String value) {
            addCriterion("type_title <", value, "typeTitle");
            return (Criteria) this;
        }

        public Criteria andTypeTitleLessThanOrEqualTo(String value) {
            addCriterion("type_title <=", value, "typeTitle");
            return (Criteria) this;
        }

        public Criteria andTypeTitleLike(String value) {
            addCriterion("type_title like", value, "typeTitle");
            return (Criteria) this;
        }

        public Criteria andTypeTitleNotLike(String value) {
            addCriterion("type_title not like", value, "typeTitle");
            return (Criteria) this;
        }

        public Criteria andTypeTitleIn(List<String> values) {
            addCriterion("type_title in", values, "typeTitle");
            return (Criteria) this;
        }

        public Criteria andTypeTitleNotIn(List<String> values) {
            addCriterion("type_title not in", values, "typeTitle");
            return (Criteria) this;
        }

        public Criteria andTypeTitleBetween(String value1, String value2) {
            addCriterion("type_title between", value1, value2, "typeTitle");
            return (Criteria) this;
        }

        public Criteria andTypeTitleNotBetween(String value1, String value2) {
            addCriterion("type_title not between", value1, value2, "typeTitle");
            return (Criteria) this;
        }

        public Criteria andTypeStatusIsNull() {
            addCriterion("type_status is null");
            return (Criteria) this;
        }

        public Criteria andTypeStatusIsNotNull() {
            addCriterion("type_status is not null");
            return (Criteria) this;
        }

        public Criteria andTypeStatusEqualTo(String value) {
            addCriterion("type_status =", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusNotEqualTo(String value) {
            addCriterion("type_status <>", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusGreaterThan(String value) {
            addCriterion("type_status >", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("type_status >=", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusLessThan(String value) {
            addCriterion("type_status <", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusLessThanOrEqualTo(String value) {
            addCriterion("type_status <=", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusLike(String value) {
            addCriterion("type_status like", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusNotLike(String value) {
            addCriterion("type_status not like", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusIn(List<String> values) {
            addCriterion("type_status in", values, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusNotIn(List<String> values) {
            addCriterion("type_status not in", values, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusBetween(String value1, String value2) {
            addCriterion("type_status between", value1, value2, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusNotBetween(String value1, String value2) {
            addCriterion("type_status not between", value1, value2, "typeStatus");
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