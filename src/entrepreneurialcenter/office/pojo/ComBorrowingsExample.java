package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class ComBorrowingsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComBorrowingsExample() {
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

        public Criteria andBorrowIdIsNull() {
            addCriterion("borrow_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowIdIsNotNull() {
            addCriterion("borrow_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowIdEqualTo(Long value) {
            addCriterion("borrow_id =", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotEqualTo(Long value) {
            addCriterion("borrow_id <>", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdGreaterThan(Long value) {
            addCriterion("borrow_id >", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdGreaterThanOrEqualTo(Long value) {
            addCriterion("borrow_id >=", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdLessThan(Long value) {
            addCriterion("borrow_id <", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdLessThanOrEqualTo(Long value) {
            addCriterion("borrow_id <=", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdIn(List<Long> values) {
            addCriterion("borrow_id in", values, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotIn(List<Long> values) {
            addCriterion("borrow_id not in", values, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdBetween(Long value1, Long value2) {
            addCriterion("borrow_id between", value1, value2, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotBetween(Long value1, Long value2) {
            addCriterion("borrow_id not between", value1, value2, "borrowId");
            return (Criteria) this;
        }

        public Criteria andComIdIsNull() {
            addCriterion("com_id is null");
            return (Criteria) this;
        }

        public Criteria andComIdIsNotNull() {
            addCriterion("com_id is not null");
            return (Criteria) this;
        }

        public Criteria andComIdEqualTo(Long value) {
            addCriterion("com_id =", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotEqualTo(Long value) {
            addCriterion("com_id <>", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThan(Long value) {
            addCriterion("com_id >", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThanOrEqualTo(Long value) {
            addCriterion("com_id >=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThan(Long value) {
            addCriterion("com_id <", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThanOrEqualTo(Long value) {
            addCriterion("com_id <=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdIn(List<Long> values) {
            addCriterion("com_id in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotIn(List<Long> values) {
            addCriterion("com_id not in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdBetween(Long value1, Long value2) {
            addCriterion("com_id between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotBetween(Long value1, Long value2) {
            addCriterion("com_id not between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyIsNull() {
            addCriterion("borrow_money is null");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyIsNotNull() {
            addCriterion("borrow_money is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyEqualTo(String value) {
            addCriterion("borrow_money =", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyNotEqualTo(String value) {
            addCriterion("borrow_money <>", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyGreaterThan(String value) {
            addCriterion("borrow_money >", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_money >=", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyLessThan(String value) {
            addCriterion("borrow_money <", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyLessThanOrEqualTo(String value) {
            addCriterion("borrow_money <=", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyLike(String value) {
            addCriterion("borrow_money like", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyNotLike(String value) {
            addCriterion("borrow_money not like", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyIn(List<String> values) {
            addCriterion("borrow_money in", values, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyNotIn(List<String> values) {
            addCriterion("borrow_money not in", values, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyBetween(String value1, String value2) {
            addCriterion("borrow_money between", value1, value2, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyNotBetween(String value1, String value2) {
            addCriterion("borrow_money not between", value1, value2, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowDateIsNull() {
            addCriterion("borrow_date is null");
            return (Criteria) this;
        }

        public Criteria andBorrowDateIsNotNull() {
            addCriterion("borrow_date is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowDateEqualTo(Integer value) {
            addCriterion("borrow_date =", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateNotEqualTo(Integer value) {
            addCriterion("borrow_date <>", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateGreaterThan(Integer value) {
            addCriterion("borrow_date >", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_date >=", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateLessThan(Integer value) {
            addCriterion("borrow_date <", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_date <=", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateIn(List<Integer> values) {
            addCriterion("borrow_date in", values, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateNotIn(List<Integer> values) {
            addCriterion("borrow_date not in", values, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateBetween(Integer value1, Integer value2) {
            addCriterion("borrow_date between", value1, value2, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_date not between", value1, value2, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowRateIsNull() {
            addCriterion("borrow_rate is null");
            return (Criteria) this;
        }

        public Criteria andBorrowRateIsNotNull() {
            addCriterion("borrow_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowRateEqualTo(String value) {
            addCriterion("borrow_rate =", value, "borrowRate");
            return (Criteria) this;
        }

        public Criteria andBorrowRateNotEqualTo(String value) {
            addCriterion("borrow_rate <>", value, "borrowRate");
            return (Criteria) this;
        }

        public Criteria andBorrowRateGreaterThan(String value) {
            addCriterion("borrow_rate >", value, "borrowRate");
            return (Criteria) this;
        }

        public Criteria andBorrowRateGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_rate >=", value, "borrowRate");
            return (Criteria) this;
        }

        public Criteria andBorrowRateLessThan(String value) {
            addCriterion("borrow_rate <", value, "borrowRate");
            return (Criteria) this;
        }

        public Criteria andBorrowRateLessThanOrEqualTo(String value) {
            addCriterion("borrow_rate <=", value, "borrowRate");
            return (Criteria) this;
        }

        public Criteria andBorrowRateLike(String value) {
            addCriterion("borrow_rate like", value, "borrowRate");
            return (Criteria) this;
        }

        public Criteria andBorrowRateNotLike(String value) {
            addCriterion("borrow_rate not like", value, "borrowRate");
            return (Criteria) this;
        }

        public Criteria andBorrowRateIn(List<String> values) {
            addCriterion("borrow_rate in", values, "borrowRate");
            return (Criteria) this;
        }

        public Criteria andBorrowRateNotIn(List<String> values) {
            addCriterion("borrow_rate not in", values, "borrowRate");
            return (Criteria) this;
        }

        public Criteria andBorrowRateBetween(String value1, String value2) {
            addCriterion("borrow_rate between", value1, value2, "borrowRate");
            return (Criteria) this;
        }

        public Criteria andBorrowRateNotBetween(String value1, String value2) {
            addCriterion("borrow_rate not between", value1, value2, "borrowRate");
            return (Criteria) this;
        }

        public Criteria andBorrowDeadlineIsNull() {
            addCriterion("borrow_deadline is null");
            return (Criteria) this;
        }

        public Criteria andBorrowDeadlineIsNotNull() {
            addCriterion("borrow_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowDeadlineEqualTo(String value) {
            addCriterion("borrow_deadline =", value, "borrowDeadline");
            return (Criteria) this;
        }

        public Criteria andBorrowDeadlineNotEqualTo(String value) {
            addCriterion("borrow_deadline <>", value, "borrowDeadline");
            return (Criteria) this;
        }

        public Criteria andBorrowDeadlineGreaterThan(String value) {
            addCriterion("borrow_deadline >", value, "borrowDeadline");
            return (Criteria) this;
        }

        public Criteria andBorrowDeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_deadline >=", value, "borrowDeadline");
            return (Criteria) this;
        }

        public Criteria andBorrowDeadlineLessThan(String value) {
            addCriterion("borrow_deadline <", value, "borrowDeadline");
            return (Criteria) this;
        }

        public Criteria andBorrowDeadlineLessThanOrEqualTo(String value) {
            addCriterion("borrow_deadline <=", value, "borrowDeadline");
            return (Criteria) this;
        }

        public Criteria andBorrowDeadlineLike(String value) {
            addCriterion("borrow_deadline like", value, "borrowDeadline");
            return (Criteria) this;
        }

        public Criteria andBorrowDeadlineNotLike(String value) {
            addCriterion("borrow_deadline not like", value, "borrowDeadline");
            return (Criteria) this;
        }

        public Criteria andBorrowDeadlineIn(List<String> values) {
            addCriterion("borrow_deadline in", values, "borrowDeadline");
            return (Criteria) this;
        }

        public Criteria andBorrowDeadlineNotIn(List<String> values) {
            addCriterion("borrow_deadline not in", values, "borrowDeadline");
            return (Criteria) this;
        }

        public Criteria andBorrowDeadlineBetween(String value1, String value2) {
            addCriterion("borrow_deadline between", value1, value2, "borrowDeadline");
            return (Criteria) this;
        }

        public Criteria andBorrowDeadlineNotBetween(String value1, String value2) {
            addCriterion("borrow_deadline not between", value1, value2, "borrowDeadline");
            return (Criteria) this;
        }

        public Criteria andBorrowHkqIsNull() {
            addCriterion("borrow_hkq is null");
            return (Criteria) this;
        }

        public Criteria andBorrowHkqIsNotNull() {
            addCriterion("borrow_hkq is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowHkqEqualTo(Integer value) {
            addCriterion("borrow_hkq =", value, "borrowHkq");
            return (Criteria) this;
        }

        public Criteria andBorrowHkqNotEqualTo(Integer value) {
            addCriterion("borrow_hkq <>", value, "borrowHkq");
            return (Criteria) this;
        }

        public Criteria andBorrowHkqGreaterThan(Integer value) {
            addCriterion("borrow_hkq >", value, "borrowHkq");
            return (Criteria) this;
        }

        public Criteria andBorrowHkqGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_hkq >=", value, "borrowHkq");
            return (Criteria) this;
        }

        public Criteria andBorrowHkqLessThan(Integer value) {
            addCriterion("borrow_hkq <", value, "borrowHkq");
            return (Criteria) this;
        }

        public Criteria andBorrowHkqLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_hkq <=", value, "borrowHkq");
            return (Criteria) this;
        }

        public Criteria andBorrowHkqIn(List<Integer> values) {
            addCriterion("borrow_hkq in", values, "borrowHkq");
            return (Criteria) this;
        }

        public Criteria andBorrowHkqNotIn(List<Integer> values) {
            addCriterion("borrow_hkq not in", values, "borrowHkq");
            return (Criteria) this;
        }

        public Criteria andBorrowHkqBetween(Integer value1, Integer value2) {
            addCriterion("borrow_hkq between", value1, value2, "borrowHkq");
            return (Criteria) this;
        }

        public Criteria andBorrowHkqNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_hkq not between", value1, value2, "borrowHkq");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewIsNull() {
            addCriterion("borrow_renew is null");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewIsNotNull() {
            addCriterion("borrow_renew is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewEqualTo(String value) {
            addCriterion("borrow_renew =", value, "borrowRenew");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewNotEqualTo(String value) {
            addCriterion("borrow_renew <>", value, "borrowRenew");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewGreaterThan(String value) {
            addCriterion("borrow_renew >", value, "borrowRenew");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_renew >=", value, "borrowRenew");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewLessThan(String value) {
            addCriterion("borrow_renew <", value, "borrowRenew");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewLessThanOrEqualTo(String value) {
            addCriterion("borrow_renew <=", value, "borrowRenew");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewLike(String value) {
            addCriterion("borrow_renew like", value, "borrowRenew");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewNotLike(String value) {
            addCriterion("borrow_renew not like", value, "borrowRenew");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewIn(List<String> values) {
            addCriterion("borrow_renew in", values, "borrowRenew");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewNotIn(List<String> values) {
            addCriterion("borrow_renew not in", values, "borrowRenew");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewBetween(String value1, String value2) {
            addCriterion("borrow_renew between", value1, value2, "borrowRenew");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewNotBetween(String value1, String value2) {
            addCriterion("borrow_renew not between", value1, value2, "borrowRenew");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewhkqIsNull() {
            addCriterion("borrow_renewhkq is null");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewhkqIsNotNull() {
            addCriterion("borrow_renewhkq is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewhkqEqualTo(Integer value) {
            addCriterion("borrow_renewhkq =", value, "borrowRenewhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewhkqNotEqualTo(Integer value) {
            addCriterion("borrow_renewhkq <>", value, "borrowRenewhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewhkqGreaterThan(Integer value) {
            addCriterion("borrow_renewhkq >", value, "borrowRenewhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewhkqGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_renewhkq >=", value, "borrowRenewhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewhkqLessThan(Integer value) {
            addCriterion("borrow_renewhkq <", value, "borrowRenewhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewhkqLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_renewhkq <=", value, "borrowRenewhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewhkqIn(List<Integer> values) {
            addCriterion("borrow_renewhkq in", values, "borrowRenewhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewhkqNotIn(List<Integer> values) {
            addCriterion("borrow_renewhkq not in", values, "borrowRenewhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewhkqBetween(Integer value1, Integer value2) {
            addCriterion("borrow_renewhkq between", value1, value2, "borrowRenewhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewhkqNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_renewhkq not between", value1, value2, "borrowRenewhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewrateIsNull() {
            addCriterion("borrow_renewrate is null");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewrateIsNotNull() {
            addCriterion("borrow_renewrate is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewrateEqualTo(String value) {
            addCriterion("borrow_renewrate =", value, "borrowRenewrate");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewrateNotEqualTo(String value) {
            addCriterion("borrow_renewrate <>", value, "borrowRenewrate");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewrateGreaterThan(String value) {
            addCriterion("borrow_renewrate >", value, "borrowRenewrate");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewrateGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_renewrate >=", value, "borrowRenewrate");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewrateLessThan(String value) {
            addCriterion("borrow_renewrate <", value, "borrowRenewrate");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewrateLessThanOrEqualTo(String value) {
            addCriterion("borrow_renewrate <=", value, "borrowRenewrate");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewrateLike(String value) {
            addCriterion("borrow_renewrate like", value, "borrowRenewrate");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewrateNotLike(String value) {
            addCriterion("borrow_renewrate not like", value, "borrowRenewrate");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewrateIn(List<String> values) {
            addCriterion("borrow_renewrate in", values, "borrowRenewrate");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewrateNotIn(List<String> values) {
            addCriterion("borrow_renewrate not in", values, "borrowRenewrate");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewrateBetween(String value1, String value2) {
            addCriterion("borrow_renewrate between", value1, value2, "borrowRenewrate");
            return (Criteria) this;
        }

        public Criteria andBorrowRenewrateNotBetween(String value1, String value2) {
            addCriterion("borrow_renewrate not between", value1, value2, "borrowRenewrate");
            return (Criteria) this;
        }

        public Criteria andBorrowSjhkqIsNull() {
            addCriterion("borrow_sjhkq is null");
            return (Criteria) this;
        }

        public Criteria andBorrowSjhkqIsNotNull() {
            addCriterion("borrow_sjhkq is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowSjhkqEqualTo(Integer value) {
            addCriterion("borrow_sjhkq =", value, "borrowSjhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowSjhkqNotEqualTo(Integer value) {
            addCriterion("borrow_sjhkq <>", value, "borrowSjhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowSjhkqGreaterThan(Integer value) {
            addCriterion("borrow_sjhkq >", value, "borrowSjhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowSjhkqGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_sjhkq >=", value, "borrowSjhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowSjhkqLessThan(Integer value) {
            addCriterion("borrow_sjhkq <", value, "borrowSjhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowSjhkqLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_sjhkq <=", value, "borrowSjhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowSjhkqIn(List<Integer> values) {
            addCriterion("borrow_sjhkq in", values, "borrowSjhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowSjhkqNotIn(List<Integer> values) {
            addCriterion("borrow_sjhkq not in", values, "borrowSjhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowSjhkqBetween(Integer value1, Integer value2) {
            addCriterion("borrow_sjhkq between", value1, value2, "borrowSjhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowSjhkqNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_sjhkq not between", value1, value2, "borrowSjhkq");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusIsNull() {
            addCriterion("borrow_status is null");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusIsNotNull() {
            addCriterion("borrow_status is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusEqualTo(String value) {
            addCriterion("borrow_status =", value, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusNotEqualTo(String value) {
            addCriterion("borrow_status <>", value, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusGreaterThan(String value) {
            addCriterion("borrow_status >", value, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_status >=", value, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusLessThan(String value) {
            addCriterion("borrow_status <", value, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusLessThanOrEqualTo(String value) {
            addCriterion("borrow_status <=", value, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusLike(String value) {
            addCriterion("borrow_status like", value, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusNotLike(String value) {
            addCriterion("borrow_status not like", value, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusIn(List<String> values) {
            addCriterion("borrow_status in", values, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusNotIn(List<String> values) {
            addCriterion("borrow_status not in", values, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusBetween(String value1, String value2) {
            addCriterion("borrow_status between", value1, value2, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusNotBetween(String value1, String value2) {
            addCriterion("borrow_status not between", value1, value2, "borrowStatus");
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