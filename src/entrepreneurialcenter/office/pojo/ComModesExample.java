package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class ComModesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComModesExample() {
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

        public Criteria andModeIdIsNull() {
            addCriterion("mode_id is null");
            return (Criteria) this;
        }

        public Criteria andModeIdIsNotNull() {
            addCriterion("mode_id is not null");
            return (Criteria) this;
        }

        public Criteria andModeIdEqualTo(Long value) {
            addCriterion("mode_id =", value, "modeId");
            return (Criteria) this;
        }

        public Criteria andModeIdNotEqualTo(Long value) {
            addCriterion("mode_id <>", value, "modeId");
            return (Criteria) this;
        }

        public Criteria andModeIdGreaterThan(Long value) {
            addCriterion("mode_id >", value, "modeId");
            return (Criteria) this;
        }

        public Criteria andModeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mode_id >=", value, "modeId");
            return (Criteria) this;
        }

        public Criteria andModeIdLessThan(Long value) {
            addCriterion("mode_id <", value, "modeId");
            return (Criteria) this;
        }

        public Criteria andModeIdLessThanOrEqualTo(Long value) {
            addCriterion("mode_id <=", value, "modeId");
            return (Criteria) this;
        }

        public Criteria andModeIdIn(List<Long> values) {
            addCriterion("mode_id in", values, "modeId");
            return (Criteria) this;
        }

        public Criteria andModeIdNotIn(List<Long> values) {
            addCriterion("mode_id not in", values, "modeId");
            return (Criteria) this;
        }

        public Criteria andModeIdBetween(Long value1, Long value2) {
            addCriterion("mode_id between", value1, value2, "modeId");
            return (Criteria) this;
        }

        public Criteria andModeIdNotBetween(Long value1, Long value2) {
            addCriterion("mode_id not between", value1, value2, "modeId");
            return (Criteria) this;
        }

        public Criteria andModeTitleIsNull() {
            addCriterion("mode_title is null");
            return (Criteria) this;
        }

        public Criteria andModeTitleIsNotNull() {
            addCriterion("mode_title is not null");
            return (Criteria) this;
        }

        public Criteria andModeTitleEqualTo(String value) {
            addCriterion("mode_title =", value, "modeTitle");
            return (Criteria) this;
        }

        public Criteria andModeTitleNotEqualTo(String value) {
            addCriterion("mode_title <>", value, "modeTitle");
            return (Criteria) this;
        }

        public Criteria andModeTitleGreaterThan(String value) {
            addCriterion("mode_title >", value, "modeTitle");
            return (Criteria) this;
        }

        public Criteria andModeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("mode_title >=", value, "modeTitle");
            return (Criteria) this;
        }

        public Criteria andModeTitleLessThan(String value) {
            addCriterion("mode_title <", value, "modeTitle");
            return (Criteria) this;
        }

        public Criteria andModeTitleLessThanOrEqualTo(String value) {
            addCriterion("mode_title <=", value, "modeTitle");
            return (Criteria) this;
        }

        public Criteria andModeTitleLike(String value) {
            addCriterion("mode_title like", value, "modeTitle");
            return (Criteria) this;
        }

        public Criteria andModeTitleNotLike(String value) {
            addCriterion("mode_title not like", value, "modeTitle");
            return (Criteria) this;
        }

        public Criteria andModeTitleIn(List<String> values) {
            addCriterion("mode_title in", values, "modeTitle");
            return (Criteria) this;
        }

        public Criteria andModeTitleNotIn(List<String> values) {
            addCriterion("mode_title not in", values, "modeTitle");
            return (Criteria) this;
        }

        public Criteria andModeTitleBetween(String value1, String value2) {
            addCriterion("mode_title between", value1, value2, "modeTitle");
            return (Criteria) this;
        }

        public Criteria andModeTitleNotBetween(String value1, String value2) {
            addCriterion("mode_title not between", value1, value2, "modeTitle");
            return (Criteria) this;
        }

        public Criteria andModeStatusIsNull() {
            addCriterion("mode_status is null");
            return (Criteria) this;
        }

        public Criteria andModeStatusIsNotNull() {
            addCriterion("mode_status is not null");
            return (Criteria) this;
        }

        public Criteria andModeStatusEqualTo(String value) {
            addCriterion("mode_status =", value, "modeStatus");
            return (Criteria) this;
        }

        public Criteria andModeStatusNotEqualTo(String value) {
            addCriterion("mode_status <>", value, "modeStatus");
            return (Criteria) this;
        }

        public Criteria andModeStatusGreaterThan(String value) {
            addCriterion("mode_status >", value, "modeStatus");
            return (Criteria) this;
        }

        public Criteria andModeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("mode_status >=", value, "modeStatus");
            return (Criteria) this;
        }

        public Criteria andModeStatusLessThan(String value) {
            addCriterion("mode_status <", value, "modeStatus");
            return (Criteria) this;
        }

        public Criteria andModeStatusLessThanOrEqualTo(String value) {
            addCriterion("mode_status <=", value, "modeStatus");
            return (Criteria) this;
        }

        public Criteria andModeStatusLike(String value) {
            addCriterion("mode_status like", value, "modeStatus");
            return (Criteria) this;
        }

        public Criteria andModeStatusNotLike(String value) {
            addCriterion("mode_status not like", value, "modeStatus");
            return (Criteria) this;
        }

        public Criteria andModeStatusIn(List<String> values) {
            addCriterion("mode_status in", values, "modeStatus");
            return (Criteria) this;
        }

        public Criteria andModeStatusNotIn(List<String> values) {
            addCriterion("mode_status not in", values, "modeStatus");
            return (Criteria) this;
        }

        public Criteria andModeStatusBetween(String value1, String value2) {
            addCriterion("mode_status between", value1, value2, "modeStatus");
            return (Criteria) this;
        }

        public Criteria andModeStatusNotBetween(String value1, String value2) {
            addCriterion("mode_status not between", value1, value2, "modeStatus");
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