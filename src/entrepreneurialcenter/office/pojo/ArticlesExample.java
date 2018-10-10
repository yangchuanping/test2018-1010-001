package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class ArticlesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticlesExample() {
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

        public Criteria andArtIdIsNull() {
            addCriterion("art_id is null");
            return (Criteria) this;
        }

        public Criteria andArtIdIsNotNull() {
            addCriterion("art_id is not null");
            return (Criteria) this;
        }

        public Criteria andArtIdEqualTo(Long value) {
            addCriterion("art_id =", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdNotEqualTo(Long value) {
            addCriterion("art_id <>", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdGreaterThan(Long value) {
            addCriterion("art_id >", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("art_id >=", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdLessThan(Long value) {
            addCriterion("art_id <", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdLessThanOrEqualTo(Long value) {
            addCriterion("art_id <=", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdIn(List<Long> values) {
            addCriterion("art_id in", values, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdNotIn(List<Long> values) {
            addCriterion("art_id not in", values, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdBetween(Long value1, Long value2) {
            addCriterion("art_id between", value1, value2, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdNotBetween(Long value1, Long value2) {
            addCriterion("art_id not between", value1, value2, "artId");
            return (Criteria) this;
        }

        public Criteria andArtTitleIsNull() {
            addCriterion("art_title is null");
            return (Criteria) this;
        }

        public Criteria andArtTitleIsNotNull() {
            addCriterion("art_title is not null");
            return (Criteria) this;
        }

        public Criteria andArtTitleEqualTo(String value) {
            addCriterion("art_title =", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotEqualTo(String value) {
            addCriterion("art_title <>", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleGreaterThan(String value) {
            addCriterion("art_title >", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleGreaterThanOrEqualTo(String value) {
            addCriterion("art_title >=", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleLessThan(String value) {
            addCriterion("art_title <", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleLessThanOrEqualTo(String value) {
            addCriterion("art_title <=", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleLike(String value) {
            addCriterion("art_title like", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotLike(String value) {
            addCriterion("art_title not like", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleIn(List<String> values) {
            addCriterion("art_title in", values, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotIn(List<String> values) {
            addCriterion("art_title not in", values, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleBetween(String value1, String value2) {
            addCriterion("art_title between", value1, value2, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotBetween(String value1, String value2) {
            addCriterion("art_title not between", value1, value2, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtContentIsNull() {
            addCriterion("art_content is null");
            return (Criteria) this;
        }

        public Criteria andArtContentIsNotNull() {
            addCriterion("art_content is not null");
            return (Criteria) this;
        }

        public Criteria andArtContentEqualTo(String value) {
            addCriterion("art_content =", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentNotEqualTo(String value) {
            addCriterion("art_content <>", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentGreaterThan(String value) {
            addCriterion("art_content >", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentGreaterThanOrEqualTo(String value) {
            addCriterion("art_content >=", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentLessThan(String value) {
            addCriterion("art_content <", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentLessThanOrEqualTo(String value) {
            addCriterion("art_content <=", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentLike(String value) {
            addCriterion("art_content like", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentNotLike(String value) {
            addCriterion("art_content not like", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentIn(List<String> values) {
            addCriterion("art_content in", values, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentNotIn(List<String> values) {
            addCriterion("art_content not in", values, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentBetween(String value1, String value2) {
            addCriterion("art_content between", value1, value2, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentNotBetween(String value1, String value2) {
            addCriterion("art_content not between", value1, value2, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtThumbIsNull() {
            addCriterion("art_thumb is null");
            return (Criteria) this;
        }

        public Criteria andArtThumbIsNotNull() {
            addCriterion("art_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andArtThumbEqualTo(String value) {
            addCriterion("art_thumb =", value, "artThumb");
            return (Criteria) this;
        }

        public Criteria andArtThumbNotEqualTo(String value) {
            addCriterion("art_thumb <>", value, "artThumb");
            return (Criteria) this;
        }

        public Criteria andArtThumbGreaterThan(String value) {
            addCriterion("art_thumb >", value, "artThumb");
            return (Criteria) this;
        }

        public Criteria andArtThumbGreaterThanOrEqualTo(String value) {
            addCriterion("art_thumb >=", value, "artThumb");
            return (Criteria) this;
        }

        public Criteria andArtThumbLessThan(String value) {
            addCriterion("art_thumb <", value, "artThumb");
            return (Criteria) this;
        }

        public Criteria andArtThumbLessThanOrEqualTo(String value) {
            addCriterion("art_thumb <=", value, "artThumb");
            return (Criteria) this;
        }

        public Criteria andArtThumbLike(String value) {
            addCriterion("art_thumb like", value, "artThumb");
            return (Criteria) this;
        }

        public Criteria andArtThumbNotLike(String value) {
            addCriterion("art_thumb not like", value, "artThumb");
            return (Criteria) this;
        }

        public Criteria andArtThumbIn(List<String> values) {
            addCriterion("art_thumb in", values, "artThumb");
            return (Criteria) this;
        }

        public Criteria andArtThumbNotIn(List<String> values) {
            addCriterion("art_thumb not in", values, "artThumb");
            return (Criteria) this;
        }

        public Criteria andArtThumbBetween(String value1, String value2) {
            addCriterion("art_thumb between", value1, value2, "artThumb");
            return (Criteria) this;
        }

        public Criteria andArtThumbNotBetween(String value1, String value2) {
            addCriterion("art_thumb not between", value1, value2, "artThumb");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andArtAddresseeIsNull() {
            addCriterion("art_addressee is null");
            return (Criteria) this;
        }

        public Criteria andArtAddresseeIsNotNull() {
            addCriterion("art_addressee is not null");
            return (Criteria) this;
        }

        public Criteria andArtAddresseeEqualTo(String value) {
            addCriterion("art_addressee =", value, "artAddressee");
            return (Criteria) this;
        }

        public Criteria andArtAddresseeNotEqualTo(String value) {
            addCriterion("art_addressee <>", value, "artAddressee");
            return (Criteria) this;
        }

        public Criteria andArtAddresseeGreaterThan(String value) {
            addCriterion("art_addressee >", value, "artAddressee");
            return (Criteria) this;
        }

        public Criteria andArtAddresseeGreaterThanOrEqualTo(String value) {
            addCriterion("art_addressee >=", value, "artAddressee");
            return (Criteria) this;
        }

        public Criteria andArtAddresseeLessThan(String value) {
            addCriterion("art_addressee <", value, "artAddressee");
            return (Criteria) this;
        }

        public Criteria andArtAddresseeLessThanOrEqualTo(String value) {
            addCriterion("art_addressee <=", value, "artAddressee");
            return (Criteria) this;
        }

        public Criteria andArtAddresseeLike(String value) {
            addCriterion("art_addressee like", value, "artAddressee");
            return (Criteria) this;
        }

        public Criteria andArtAddresseeNotLike(String value) {
            addCriterion("art_addressee not like", value, "artAddressee");
            return (Criteria) this;
        }

        public Criteria andArtAddresseeIn(List<String> values) {
            addCriterion("art_addressee in", values, "artAddressee");
            return (Criteria) this;
        }

        public Criteria andArtAddresseeNotIn(List<String> values) {
            addCriterion("art_addressee not in", values, "artAddressee");
            return (Criteria) this;
        }

        public Criteria andArtAddresseeBetween(String value1, String value2) {
            addCriterion("art_addressee between", value1, value2, "artAddressee");
            return (Criteria) this;
        }

        public Criteria andArtAddresseeNotBetween(String value1, String value2) {
            addCriterion("art_addressee not between", value1, value2, "artAddressee");
            return (Criteria) this;
        }

        public Criteria andArtStatusIsNull() {
            addCriterion("art_status is null");
            return (Criteria) this;
        }

        public Criteria andArtStatusIsNotNull() {
            addCriterion("art_status is not null");
            return (Criteria) this;
        }

        public Criteria andArtStatusEqualTo(String value) {
            addCriterion("art_status =", value, "artStatus");
            return (Criteria) this;
        }

        public Criteria andArtStatusNotEqualTo(String value) {
            addCriterion("art_status <>", value, "artStatus");
            return (Criteria) this;
        }

        public Criteria andArtStatusGreaterThan(String value) {
            addCriterion("art_status >", value, "artStatus");
            return (Criteria) this;
        }

        public Criteria andArtStatusGreaterThanOrEqualTo(String value) {
            addCriterion("art_status >=", value, "artStatus");
            return (Criteria) this;
        }

        public Criteria andArtStatusLessThan(String value) {
            addCriterion("art_status <", value, "artStatus");
            return (Criteria) this;
        }

        public Criteria andArtStatusLessThanOrEqualTo(String value) {
            addCriterion("art_status <=", value, "artStatus");
            return (Criteria) this;
        }

        public Criteria andArtStatusLike(String value) {
            addCriterion("art_status like", value, "artStatus");
            return (Criteria) this;
        }

        public Criteria andArtStatusNotLike(String value) {
            addCriterion("art_status not like", value, "artStatus");
            return (Criteria) this;
        }

        public Criteria andArtStatusIn(List<String> values) {
            addCriterion("art_status in", values, "artStatus");
            return (Criteria) this;
        }

        public Criteria andArtStatusNotIn(List<String> values) {
            addCriterion("art_status not in", values, "artStatus");
            return (Criteria) this;
        }

        public Criteria andArtStatusBetween(String value1, String value2) {
            addCriterion("art_status between", value1, value2, "artStatus");
            return (Criteria) this;
        }

        public Criteria andArtStatusNotBetween(String value1, String value2) {
            addCriterion("art_status not between", value1, value2, "artStatus");
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