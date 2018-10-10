package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class ComIdentifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComIdentifyExample() {
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

        public Criteria andIdeIdIsNull() {
            addCriterion("ide_id is null");
            return (Criteria) this;
        }

        public Criteria andIdeIdIsNotNull() {
            addCriterion("ide_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdeIdEqualTo(Long value) {
            addCriterion("ide_id =", value, "ideId");
            return (Criteria) this;
        }

        public Criteria andIdeIdNotEqualTo(Long value) {
            addCriterion("ide_id <>", value, "ideId");
            return (Criteria) this;
        }

        public Criteria andIdeIdGreaterThan(Long value) {
            addCriterion("ide_id >", value, "ideId");
            return (Criteria) this;
        }

        public Criteria andIdeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ide_id >=", value, "ideId");
            return (Criteria) this;
        }

        public Criteria andIdeIdLessThan(Long value) {
            addCriterion("ide_id <", value, "ideId");
            return (Criteria) this;
        }

        public Criteria andIdeIdLessThanOrEqualTo(Long value) {
            addCriterion("ide_id <=", value, "ideId");
            return (Criteria) this;
        }

        public Criteria andIdeIdIn(List<Long> values) {
            addCriterion("ide_id in", values, "ideId");
            return (Criteria) this;
        }

        public Criteria andIdeIdNotIn(List<Long> values) {
            addCriterion("ide_id not in", values, "ideId");
            return (Criteria) this;
        }

        public Criteria andIdeIdBetween(Long value1, Long value2) {
            addCriterion("ide_id between", value1, value2, "ideId");
            return (Criteria) this;
        }

        public Criteria andIdeIdNotBetween(Long value1, Long value2) {
            addCriterion("ide_id not between", value1, value2, "ideId");
            return (Criteria) this;
        }

        public Criteria andIdeTitleIsNull() {
            addCriterion("ide_title is null");
            return (Criteria) this;
        }

        public Criteria andIdeTitleIsNotNull() {
            addCriterion("ide_title is not null");
            return (Criteria) this;
        }

        public Criteria andIdeTitleEqualTo(String value) {
            addCriterion("ide_title =", value, "ideTitle");
            return (Criteria) this;
        }

        public Criteria andIdeTitleNotEqualTo(String value) {
            addCriterion("ide_title <>", value, "ideTitle");
            return (Criteria) this;
        }

        public Criteria andIdeTitleGreaterThan(String value) {
            addCriterion("ide_title >", value, "ideTitle");
            return (Criteria) this;
        }

        public Criteria andIdeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ide_title >=", value, "ideTitle");
            return (Criteria) this;
        }

        public Criteria andIdeTitleLessThan(String value) {
            addCriterion("ide_title <", value, "ideTitle");
            return (Criteria) this;
        }

        public Criteria andIdeTitleLessThanOrEqualTo(String value) {
            addCriterion("ide_title <=", value, "ideTitle");
            return (Criteria) this;
        }

        public Criteria andIdeTitleLike(String value) {
            addCriterion("ide_title like", value, "ideTitle");
            return (Criteria) this;
        }

        public Criteria andIdeTitleNotLike(String value) {
            addCriterion("ide_title not like", value, "ideTitle");
            return (Criteria) this;
        }

        public Criteria andIdeTitleIn(List<String> values) {
            addCriterion("ide_title in", values, "ideTitle");
            return (Criteria) this;
        }

        public Criteria andIdeTitleNotIn(List<String> values) {
            addCriterion("ide_title not in", values, "ideTitle");
            return (Criteria) this;
        }

        public Criteria andIdeTitleBetween(String value1, String value2) {
            addCriterion("ide_title between", value1, value2, "ideTitle");
            return (Criteria) this;
        }

        public Criteria andIdeTitleNotBetween(String value1, String value2) {
            addCriterion("ide_title not between", value1, value2, "ideTitle");
            return (Criteria) this;
        }

        public Criteria andIdeStatusIsNull() {
            addCriterion("ide_status is null");
            return (Criteria) this;
        }

        public Criteria andIdeStatusIsNotNull() {
            addCriterion("ide_status is not null");
            return (Criteria) this;
        }

        public Criteria andIdeStatusEqualTo(String value) {
            addCriterion("ide_status =", value, "ideStatus");
            return (Criteria) this;
        }

        public Criteria andIdeStatusNotEqualTo(String value) {
            addCriterion("ide_status <>", value, "ideStatus");
            return (Criteria) this;
        }

        public Criteria andIdeStatusGreaterThan(String value) {
            addCriterion("ide_status >", value, "ideStatus");
            return (Criteria) this;
        }

        public Criteria andIdeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ide_status >=", value, "ideStatus");
            return (Criteria) this;
        }

        public Criteria andIdeStatusLessThan(String value) {
            addCriterion("ide_status <", value, "ideStatus");
            return (Criteria) this;
        }

        public Criteria andIdeStatusLessThanOrEqualTo(String value) {
            addCriterion("ide_status <=", value, "ideStatus");
            return (Criteria) this;
        }

        public Criteria andIdeStatusLike(String value) {
            addCriterion("ide_status like", value, "ideStatus");
            return (Criteria) this;
        }

        public Criteria andIdeStatusNotLike(String value) {
            addCriterion("ide_status not like", value, "ideStatus");
            return (Criteria) this;
        }

        public Criteria andIdeStatusIn(List<String> values) {
            addCriterion("ide_status in", values, "ideStatus");
            return (Criteria) this;
        }

        public Criteria andIdeStatusNotIn(List<String> values) {
            addCriterion("ide_status not in", values, "ideStatus");
            return (Criteria) this;
        }

        public Criteria andIdeStatusBetween(String value1, String value2) {
            addCriterion("ide_status between", value1, value2, "ideStatus");
            return (Criteria) this;
        }

        public Criteria andIdeStatusNotBetween(String value1, String value2) {
            addCriterion("ide_status not between", value1, value2, "ideStatus");
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