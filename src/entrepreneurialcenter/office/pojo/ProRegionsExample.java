package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProRegionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProRegionsExample() {
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

        public Criteria andRegionIdIsNull() {
            addCriterion("region_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(Long value) {
            addCriterion("region_id =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(Long value) {
            addCriterion("region_id <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(Long value) {
            addCriterion("region_id >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("region_id >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(Long value) {
            addCriterion("region_id <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(Long value) {
            addCriterion("region_id <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<Long> values) {
            addCriterion("region_id in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<Long> values) {
            addCriterion("region_id not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(Long value1, Long value2) {
            addCriterion("region_id between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(Long value1, Long value2) {
            addCriterion("region_id not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionTitleIsNull() {
            addCriterion("region_title is null");
            return (Criteria) this;
        }

        public Criteria andRegionTitleIsNotNull() {
            addCriterion("region_title is not null");
            return (Criteria) this;
        }

        public Criteria andRegionTitleEqualTo(String value) {
            addCriterion("region_title =", value, "regionTitle");
            return (Criteria) this;
        }

        public Criteria andRegionTitleNotEqualTo(String value) {
            addCriterion("region_title <>", value, "regionTitle");
            return (Criteria) this;
        }

        public Criteria andRegionTitleGreaterThan(String value) {
            addCriterion("region_title >", value, "regionTitle");
            return (Criteria) this;
        }

        public Criteria andRegionTitleGreaterThanOrEqualTo(String value) {
            addCriterion("region_title >=", value, "regionTitle");
            return (Criteria) this;
        }

        public Criteria andRegionTitleLessThan(String value) {
            addCriterion("region_title <", value, "regionTitle");
            return (Criteria) this;
        }

        public Criteria andRegionTitleLessThanOrEqualTo(String value) {
            addCriterion("region_title <=", value, "regionTitle");
            return (Criteria) this;
        }

        public Criteria andRegionTitleLike(String value) {
            addCriterion("region_title like", value, "regionTitle");
            return (Criteria) this;
        }

        public Criteria andRegionTitleNotLike(String value) {
            addCriterion("region_title not like", value, "regionTitle");
            return (Criteria) this;
        }

        public Criteria andRegionTitleIn(List<String> values) {
            addCriterion("region_title in", values, "regionTitle");
            return (Criteria) this;
        }

        public Criteria andRegionTitleNotIn(List<String> values) {
            addCriterion("region_title not in", values, "regionTitle");
            return (Criteria) this;
        }

        public Criteria andRegionTitleBetween(String value1, String value2) {
            addCriterion("region_title between", value1, value2, "regionTitle");
            return (Criteria) this;
        }

        public Criteria andRegionTitleNotBetween(String value1, String value2) {
            addCriterion("region_title not between", value1, value2, "regionTitle");
            return (Criteria) this;
        }

        public Criteria andRegionStatusIsNull() {
            addCriterion("region_status is null");
            return (Criteria) this;
        }

        public Criteria andRegionStatusIsNotNull() {
            addCriterion("region_status is not null");
            return (Criteria) this;
        }

        public Criteria andRegionStatusEqualTo(String value) {
            addCriterion("region_status =", value, "regionStatus");
            return (Criteria) this;
        }

        public Criteria andRegionStatusNotEqualTo(String value) {
            addCriterion("region_status <>", value, "regionStatus");
            return (Criteria) this;
        }

        public Criteria andRegionStatusGreaterThan(String value) {
            addCriterion("region_status >", value, "regionStatus");
            return (Criteria) this;
        }

        public Criteria andRegionStatusGreaterThanOrEqualTo(String value) {
            addCriterion("region_status >=", value, "regionStatus");
            return (Criteria) this;
        }

        public Criteria andRegionStatusLessThan(String value) {
            addCriterion("region_status <", value, "regionStatus");
            return (Criteria) this;
        }

        public Criteria andRegionStatusLessThanOrEqualTo(String value) {
            addCriterion("region_status <=", value, "regionStatus");
            return (Criteria) this;
        }

        public Criteria andRegionStatusLike(String value) {
            addCriterion("region_status like", value, "regionStatus");
            return (Criteria) this;
        }

        public Criteria andRegionStatusNotLike(String value) {
            addCriterion("region_status not like", value, "regionStatus");
            return (Criteria) this;
        }

        public Criteria andRegionStatusIn(List<String> values) {
            addCriterion("region_status in", values, "regionStatus");
            return (Criteria) this;
        }

        public Criteria andRegionStatusNotIn(List<String> values) {
            addCriterion("region_status not in", values, "regionStatus");
            return (Criteria) this;
        }

        public Criteria andRegionStatusBetween(String value1, String value2) {
            addCriterion("region_status between", value1, value2, "regionStatus");
            return (Criteria) this;
        }

        public Criteria andRegionStatusNotBetween(String value1, String value2) {
            addCriterion("region_status not between", value1, value2, "regionStatus");
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