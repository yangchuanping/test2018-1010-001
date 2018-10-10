package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMsgIdIsNull() {
            addCriterion("msg_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(Long value) {
            addCriterion("msg_id =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(Long value) {
            addCriterion("msg_id <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(Long value) {
            addCriterion("msg_id >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("msg_id >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(Long value) {
            addCriterion("msg_id <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(Long value) {
            addCriterion("msg_id <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<Long> values) {
            addCriterion("msg_id in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<Long> values) {
            addCriterion("msg_id not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(Long value1, Long value2) {
            addCriterion("msg_id between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(Long value1, Long value2) {
            addCriterion("msg_id not between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNull() {
            addCriterion("msg_title is null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNotNull() {
            addCriterion("msg_title is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleEqualTo(String value) {
            addCriterion("msg_title =", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotEqualTo(String value) {
            addCriterion("msg_title <>", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThan(String value) {
            addCriterion("msg_title >", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThanOrEqualTo(String value) {
            addCriterion("msg_title >=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThan(String value) {
            addCriterion("msg_title <", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThanOrEqualTo(String value) {
            addCriterion("msg_title <=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLike(String value) {
            addCriterion("msg_title like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotLike(String value) {
            addCriterion("msg_title not like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIn(List<String> values) {
            addCriterion("msg_title in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotIn(List<String> values) {
            addCriterion("msg_title not in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleBetween(String value1, String value2) {
            addCriterion("msg_title between", value1, value2, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotBetween(String value1, String value2) {
            addCriterion("msg_title not between", value1, value2, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNull() {
            addCriterion("msg_content is null");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNotNull() {
            addCriterion("msg_content is not null");
            return (Criteria) this;
        }

        public Criteria andMsgContentEqualTo(String value) {
            addCriterion("msg_content =", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotEqualTo(String value) {
            addCriterion("msg_content <>", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThan(String value) {
            addCriterion("msg_content >", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThanOrEqualTo(String value) {
            addCriterion("msg_content >=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThan(String value) {
            addCriterion("msg_content <", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThanOrEqualTo(String value) {
            addCriterion("msg_content <=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLike(String value) {
            addCriterion("msg_content like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotLike(String value) {
            addCriterion("msg_content not like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentIn(List<String> values) {
            addCriterion("msg_content in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotIn(List<String> values) {
            addCriterion("msg_content not in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentBetween(String value1, String value2) {
            addCriterion("msg_content between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotBetween(String value1, String value2) {
            addCriterion("msg_content not between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgImgIsNull() {
            addCriterion("msg_img is null");
            return (Criteria) this;
        }

        public Criteria andMsgImgIsNotNull() {
            addCriterion("msg_img is not null");
            return (Criteria) this;
        }

        public Criteria andMsgImgEqualTo(String value) {
            addCriterion("msg_img =", value, "msgImg");
            return (Criteria) this;
        }

        public Criteria andMsgImgNotEqualTo(String value) {
            addCriterion("msg_img <>", value, "msgImg");
            return (Criteria) this;
        }

        public Criteria andMsgImgGreaterThan(String value) {
            addCriterion("msg_img >", value, "msgImg");
            return (Criteria) this;
        }

        public Criteria andMsgImgGreaterThanOrEqualTo(String value) {
            addCriterion("msg_img >=", value, "msgImg");
            return (Criteria) this;
        }

        public Criteria andMsgImgLessThan(String value) {
            addCriterion("msg_img <", value, "msgImg");
            return (Criteria) this;
        }

        public Criteria andMsgImgLessThanOrEqualTo(String value) {
            addCriterion("msg_img <=", value, "msgImg");
            return (Criteria) this;
        }

        public Criteria andMsgImgLike(String value) {
            addCriterion("msg_img like", value, "msgImg");
            return (Criteria) this;
        }

        public Criteria andMsgImgNotLike(String value) {
            addCriterion("msg_img not like", value, "msgImg");
            return (Criteria) this;
        }

        public Criteria andMsgImgIn(List<String> values) {
            addCriterion("msg_img in", values, "msgImg");
            return (Criteria) this;
        }

        public Criteria andMsgImgNotIn(List<String> values) {
            addCriterion("msg_img not in", values, "msgImg");
            return (Criteria) this;
        }

        public Criteria andMsgImgBetween(String value1, String value2) {
            addCriterion("msg_img between", value1, value2, "msgImg");
            return (Criteria) this;
        }

        public Criteria andMsgImgNotBetween(String value1, String value2) {
            addCriterion("msg_img not between", value1, value2, "msgImg");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNull() {
            addCriterion("msg_type is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNotNull() {
            addCriterion("msg_type is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeEqualTo(Integer value) {
            addCriterion("msg_type =", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotEqualTo(Integer value) {
            addCriterion("msg_type <>", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThan(Integer value) {
            addCriterion("msg_type >", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_type >=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThan(Integer value) {
            addCriterion("msg_type <", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThanOrEqualTo(Integer value) {
            addCriterion("msg_type <=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIn(List<Integer> values) {
            addCriterion("msg_type in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotIn(List<Integer> values) {
            addCriterion("msg_type not in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeBetween(Integer value1, Integer value2) {
            addCriterion("msg_type between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_type not between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgCreatedIsNull() {
            addCriterion("msg_created is null");
            return (Criteria) this;
        }

        public Criteria andMsgCreatedIsNotNull() {
            addCriterion("msg_created is not null");
            return (Criteria) this;
        }

        public Criteria andMsgCreatedEqualTo(Integer value) {
            addCriterion("msg_created =", value, "msgCreated");
            return (Criteria) this;
        }

        public Criteria andMsgCreatedNotEqualTo(Integer value) {
            addCriterion("msg_created <>", value, "msgCreated");
            return (Criteria) this;
        }

        public Criteria andMsgCreatedGreaterThan(Integer value) {
            addCriterion("msg_created >", value, "msgCreated");
            return (Criteria) this;
        }

        public Criteria andMsgCreatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_created >=", value, "msgCreated");
            return (Criteria) this;
        }

        public Criteria andMsgCreatedLessThan(Integer value) {
            addCriterion("msg_created <", value, "msgCreated");
            return (Criteria) this;
        }

        public Criteria andMsgCreatedLessThanOrEqualTo(Integer value) {
            addCriterion("msg_created <=", value, "msgCreated");
            return (Criteria) this;
        }

        public Criteria andMsgCreatedIn(List<Integer> values) {
            addCriterion("msg_created in", values, "msgCreated");
            return (Criteria) this;
        }

        public Criteria andMsgCreatedNotIn(List<Integer> values) {
            addCriterion("msg_created not in", values, "msgCreated");
            return (Criteria) this;
        }

        public Criteria andMsgCreatedBetween(Integer value1, Integer value2) {
            addCriterion("msg_created between", value1, value2, "msgCreated");
            return (Criteria) this;
        }

        public Criteria andMsgCreatedNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_created not between", value1, value2, "msgCreated");
            return (Criteria) this;
        }

        public Criteria andMsgUpdateIsNull() {
            addCriterion("msg_update is null");
            return (Criteria) this;
        }

        public Criteria andMsgUpdateIsNotNull() {
            addCriterion("msg_update is not null");
            return (Criteria) this;
        }

        public Criteria andMsgUpdateEqualTo(Integer value) {
            addCriterion("msg_update =", value, "msgUpdate");
            return (Criteria) this;
        }

        public Criteria andMsgUpdateNotEqualTo(Integer value) {
            addCriterion("msg_update <>", value, "msgUpdate");
            return (Criteria) this;
        }

        public Criteria andMsgUpdateGreaterThan(Integer value) {
            addCriterion("msg_update >", value, "msgUpdate");
            return (Criteria) this;
        }

        public Criteria andMsgUpdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_update >=", value, "msgUpdate");
            return (Criteria) this;
        }

        public Criteria andMsgUpdateLessThan(Integer value) {
            addCriterion("msg_update <", value, "msgUpdate");
            return (Criteria) this;
        }

        public Criteria andMsgUpdateLessThanOrEqualTo(Integer value) {
            addCriterion("msg_update <=", value, "msgUpdate");
            return (Criteria) this;
        }

        public Criteria andMsgUpdateIn(List<Integer> values) {
            addCriterion("msg_update in", values, "msgUpdate");
            return (Criteria) this;
        }

        public Criteria andMsgUpdateNotIn(List<Integer> values) {
            addCriterion("msg_update not in", values, "msgUpdate");
            return (Criteria) this;
        }

        public Criteria andMsgUpdateBetween(Integer value1, Integer value2) {
            addCriterion("msg_update between", value1, value2, "msgUpdate");
            return (Criteria) this;
        }

        public Criteria andMsgUpdateNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_update not between", value1, value2, "msgUpdate");
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