package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QuitApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuitApplyExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andQuitIdIsNull() {
            addCriterion("quit_id is null");
            return (Criteria) this;
        }

        public Criteria andQuitIdIsNotNull() {
            addCriterion("quit_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuitIdEqualTo(Integer value) {
            addCriterion("quit_id =", value, "quitId");
            return (Criteria) this;
        }

        public Criteria andQuitIdNotEqualTo(Integer value) {
            addCriterion("quit_id <>", value, "quitId");
            return (Criteria) this;
        }

        public Criteria andQuitIdGreaterThan(Integer value) {
            addCriterion("quit_id >", value, "quitId");
            return (Criteria) this;
        }

        public Criteria andQuitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("quit_id >=", value, "quitId");
            return (Criteria) this;
        }

        public Criteria andQuitIdLessThan(Integer value) {
            addCriterion("quit_id <", value, "quitId");
            return (Criteria) this;
        }

        public Criteria andQuitIdLessThanOrEqualTo(Integer value) {
            addCriterion("quit_id <=", value, "quitId");
            return (Criteria) this;
        }

        public Criteria andQuitIdIn(List<Integer> values) {
            addCriterion("quit_id in", values, "quitId");
            return (Criteria) this;
        }

        public Criteria andQuitIdNotIn(List<Integer> values) {
            addCriterion("quit_id not in", values, "quitId");
            return (Criteria) this;
        }

        public Criteria andQuitIdBetween(Integer value1, Integer value2) {
            addCriterion("quit_id between", value1, value2, "quitId");
            return (Criteria) this;
        }

        public Criteria andQuitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("quit_id not between", value1, value2, "quitId");
            return (Criteria) this;
        }

        public Criteria andQuitCompanyIsNull() {
            addCriterion("quit_company is null");
            return (Criteria) this;
        }

        public Criteria andQuitCompanyIsNotNull() {
            addCriterion("quit_company is not null");
            return (Criteria) this;
        }

        public Criteria andQuitCompanyEqualTo(String value) {
            addCriterion("quit_company =", value, "quitCompany");
            return (Criteria) this;
        }

        public Criteria andQuitCompanyNotEqualTo(String value) {
            addCriterion("quit_company <>", value, "quitCompany");
            return (Criteria) this;
        }

        public Criteria andQuitCompanyGreaterThan(String value) {
            addCriterion("quit_company >", value, "quitCompany");
            return (Criteria) this;
        }

        public Criteria andQuitCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("quit_company >=", value, "quitCompany");
            return (Criteria) this;
        }

        public Criteria andQuitCompanyLessThan(String value) {
            addCriterion("quit_company <", value, "quitCompany");
            return (Criteria) this;
        }

        public Criteria andQuitCompanyLessThanOrEqualTo(String value) {
            addCriterion("quit_company <=", value, "quitCompany");
            return (Criteria) this;
        }

        public Criteria andQuitCompanyLike(String value) {
            addCriterion("quit_company like", value, "quitCompany");
            return (Criteria) this;
        }

        public Criteria andQuitCompanyNotLike(String value) {
            addCriterion("quit_company not like", value, "quitCompany");
            return (Criteria) this;
        }

        public Criteria andQuitCompanyIn(List<String> values) {
            addCriterion("quit_company in", values, "quitCompany");
            return (Criteria) this;
        }

        public Criteria andQuitCompanyNotIn(List<String> values) {
            addCriterion("quit_company not in", values, "quitCompany");
            return (Criteria) this;
        }

        public Criteria andQuitCompanyBetween(String value1, String value2) {
            addCriterion("quit_company between", value1, value2, "quitCompany");
            return (Criteria) this;
        }

        public Criteria andQuitCompanyNotBetween(String value1, String value2) {
            addCriterion("quit_company not between", value1, value2, "quitCompany");
            return (Criteria) this;
        }

        public Criteria andQuitRegionIsNull() {
            addCriterion("quit_region is null");
            return (Criteria) this;
        }

        public Criteria andQuitRegionIsNotNull() {
            addCriterion("quit_region is not null");
            return (Criteria) this;
        }

        public Criteria andQuitRegionEqualTo(String value) {
            addCriterion("quit_region =", value, "quitRegion");
            return (Criteria) this;
        }

        public Criteria andQuitRegionNotEqualTo(String value) {
            addCriterion("quit_region <>", value, "quitRegion");
            return (Criteria) this;
        }

        public Criteria andQuitRegionGreaterThan(String value) {
            addCriterion("quit_region >", value, "quitRegion");
            return (Criteria) this;
        }

        public Criteria andQuitRegionGreaterThanOrEqualTo(String value) {
            addCriterion("quit_region >=", value, "quitRegion");
            return (Criteria) this;
        }

        public Criteria andQuitRegionLessThan(String value) {
            addCriterion("quit_region <", value, "quitRegion");
            return (Criteria) this;
        }

        public Criteria andQuitRegionLessThanOrEqualTo(String value) {
            addCriterion("quit_region <=", value, "quitRegion");
            return (Criteria) this;
        }

        public Criteria andQuitRegionLike(String value) {
            addCriterion("quit_region like", value, "quitRegion");
            return (Criteria) this;
        }

        public Criteria andQuitRegionNotLike(String value) {
            addCriterion("quit_region not like", value, "quitRegion");
            return (Criteria) this;
        }

        public Criteria andQuitRegionIn(List<String> values) {
            addCriterion("quit_region in", values, "quitRegion");
            return (Criteria) this;
        }

        public Criteria andQuitRegionNotIn(List<String> values) {
            addCriterion("quit_region not in", values, "quitRegion");
            return (Criteria) this;
        }

        public Criteria andQuitRegionBetween(String value1, String value2) {
            addCriterion("quit_region between", value1, value2, "quitRegion");
            return (Criteria) this;
        }

        public Criteria andQuitRegionNotBetween(String value1, String value2) {
            addCriterion("quit_region not between", value1, value2, "quitRegion");
            return (Criteria) this;
        }

        public Criteria andQuitNumberIsNull() {
            addCriterion("quit_number is null");
            return (Criteria) this;
        }

        public Criteria andQuitNumberIsNotNull() {
            addCriterion("quit_number is not null");
            return (Criteria) this;
        }

        public Criteria andQuitNumberEqualTo(String value) {
            addCriterion("quit_number =", value, "quitNumber");
            return (Criteria) this;
        }

        public Criteria andQuitNumberNotEqualTo(String value) {
            addCriterion("quit_number <>", value, "quitNumber");
            return (Criteria) this;
        }

        public Criteria andQuitNumberGreaterThan(String value) {
            addCriterion("quit_number >", value, "quitNumber");
            return (Criteria) this;
        }

        public Criteria andQuitNumberGreaterThanOrEqualTo(String value) {
            addCriterion("quit_number >=", value, "quitNumber");
            return (Criteria) this;
        }

        public Criteria andQuitNumberLessThan(String value) {
            addCriterion("quit_number <", value, "quitNumber");
            return (Criteria) this;
        }

        public Criteria andQuitNumberLessThanOrEqualTo(String value) {
            addCriterion("quit_number <=", value, "quitNumber");
            return (Criteria) this;
        }

        public Criteria andQuitNumberLike(String value) {
            addCriterion("quit_number like", value, "quitNumber");
            return (Criteria) this;
        }

        public Criteria andQuitNumberNotLike(String value) {
            addCriterion("quit_number not like", value, "quitNumber");
            return (Criteria) this;
        }

        public Criteria andQuitNumberIn(List<String> values) {
            addCriterion("quit_number in", values, "quitNumber");
            return (Criteria) this;
        }

        public Criteria andQuitNumberNotIn(List<String> values) {
            addCriterion("quit_number not in", values, "quitNumber");
            return (Criteria) this;
        }

        public Criteria andQuitNumberBetween(String value1, String value2) {
            addCriterion("quit_number between", value1, value2, "quitNumber");
            return (Criteria) this;
        }

        public Criteria andQuitNumberNotBetween(String value1, String value2) {
            addCriterion("quit_number not between", value1, value2, "quitNumber");
            return (Criteria) this;
        }

        public Criteria andQuitNameIsNull() {
            addCriterion("quit_name is null");
            return (Criteria) this;
        }

        public Criteria andQuitNameIsNotNull() {
            addCriterion("quit_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuitNameEqualTo(String value) {
            addCriterion("quit_name =", value, "quitName");
            return (Criteria) this;
        }

        public Criteria andQuitNameNotEqualTo(String value) {
            addCriterion("quit_name <>", value, "quitName");
            return (Criteria) this;
        }

        public Criteria andQuitNameGreaterThan(String value) {
            addCriterion("quit_name >", value, "quitName");
            return (Criteria) this;
        }

        public Criteria andQuitNameGreaterThanOrEqualTo(String value) {
            addCriterion("quit_name >=", value, "quitName");
            return (Criteria) this;
        }

        public Criteria andQuitNameLessThan(String value) {
            addCriterion("quit_name <", value, "quitName");
            return (Criteria) this;
        }

        public Criteria andQuitNameLessThanOrEqualTo(String value) {
            addCriterion("quit_name <=", value, "quitName");
            return (Criteria) this;
        }

        public Criteria andQuitNameLike(String value) {
            addCriterion("quit_name like", value, "quitName");
            return (Criteria) this;
        }

        public Criteria andQuitNameNotLike(String value) {
            addCriterion("quit_name not like", value, "quitName");
            return (Criteria) this;
        }

        public Criteria andQuitNameIn(List<String> values) {
            addCriterion("quit_name in", values, "quitName");
            return (Criteria) this;
        }

        public Criteria andQuitNameNotIn(List<String> values) {
            addCriterion("quit_name not in", values, "quitName");
            return (Criteria) this;
        }

        public Criteria andQuitNameBetween(String value1, String value2) {
            addCriterion("quit_name between", value1, value2, "quitName");
            return (Criteria) this;
        }

        public Criteria andQuitNameNotBetween(String value1, String value2) {
            addCriterion("quit_name not between", value1, value2, "quitName");
            return (Criteria) this;
        }

        public Criteria andQuitPhoneIsNull() {
            addCriterion("quit_phone is null");
            return (Criteria) this;
        }

        public Criteria andQuitPhoneIsNotNull() {
            addCriterion("quit_phone is not null");
            return (Criteria) this;
        }

        public Criteria andQuitPhoneEqualTo(String value) {
            addCriterion("quit_phone =", value, "quitPhone");
            return (Criteria) this;
        }

        public Criteria andQuitPhoneNotEqualTo(String value) {
            addCriterion("quit_phone <>", value, "quitPhone");
            return (Criteria) this;
        }

        public Criteria andQuitPhoneGreaterThan(String value) {
            addCriterion("quit_phone >", value, "quitPhone");
            return (Criteria) this;
        }

        public Criteria andQuitPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("quit_phone >=", value, "quitPhone");
            return (Criteria) this;
        }

        public Criteria andQuitPhoneLessThan(String value) {
            addCriterion("quit_phone <", value, "quitPhone");
            return (Criteria) this;
        }

        public Criteria andQuitPhoneLessThanOrEqualTo(String value) {
            addCriterion("quit_phone <=", value, "quitPhone");
            return (Criteria) this;
        }

        public Criteria andQuitPhoneLike(String value) {
            addCriterion("quit_phone like", value, "quitPhone");
            return (Criteria) this;
        }

        public Criteria andQuitPhoneNotLike(String value) {
            addCriterion("quit_phone not like", value, "quitPhone");
            return (Criteria) this;
        }

        public Criteria andQuitPhoneIn(List<String> values) {
            addCriterion("quit_phone in", values, "quitPhone");
            return (Criteria) this;
        }

        public Criteria andQuitPhoneNotIn(List<String> values) {
            addCriterion("quit_phone not in", values, "quitPhone");
            return (Criteria) this;
        }

        public Criteria andQuitPhoneBetween(String value1, String value2) {
            addCriterion("quit_phone between", value1, value2, "quitPhone");
            return (Criteria) this;
        }

        public Criteria andQuitPhoneNotBetween(String value1, String value2) {
            addCriterion("quit_phone not between", value1, value2, "quitPhone");
            return (Criteria) this;
        }

        public Criteria andQuitDateIsNull() {
            addCriterion("quit_date is null");
            return (Criteria) this;
        }

        public Criteria andQuitDateIsNotNull() {
            addCriterion("quit_date is not null");
            return (Criteria) this;
        }

        public Criteria andQuitDateEqualTo(Date value) {
            addCriterionForJDBCDate("quit_date =", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("quit_date <>", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("quit_date >", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("quit_date >=", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateLessThan(Date value) {
            addCriterionForJDBCDate("quit_date <", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("quit_date <=", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateIn(List<Date> values) {
            addCriterionForJDBCDate("quit_date in", values, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("quit_date not in", values, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("quit_date between", value1, value2, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("quit_date not between", value1, value2, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitStateIsNull() {
            addCriterion("quit_state is null");
            return (Criteria) this;
        }

        public Criteria andQuitStateIsNotNull() {
            addCriterion("quit_state is not null");
            return (Criteria) this;
        }

        public Criteria andQuitStateEqualTo(Integer value) {
            addCriterion("quit_state =", value, "quitState");
            return (Criteria) this;
        }

        public Criteria andQuitStateNotEqualTo(Integer value) {
            addCriterion("quit_state <>", value, "quitState");
            return (Criteria) this;
        }

        public Criteria andQuitStateGreaterThan(Integer value) {
            addCriterion("quit_state >", value, "quitState");
            return (Criteria) this;
        }

        public Criteria andQuitStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("quit_state >=", value, "quitState");
            return (Criteria) this;
        }

        public Criteria andQuitStateLessThan(Integer value) {
            addCriterion("quit_state <", value, "quitState");
            return (Criteria) this;
        }

        public Criteria andQuitStateLessThanOrEqualTo(Integer value) {
            addCriterion("quit_state <=", value, "quitState");
            return (Criteria) this;
        }

        public Criteria andQuitStateIn(List<Integer> values) {
            addCriterion("quit_state in", values, "quitState");
            return (Criteria) this;
        }

        public Criteria andQuitStateNotIn(List<Integer> values) {
            addCriterion("quit_state not in", values, "quitState");
            return (Criteria) this;
        }

        public Criteria andQuitStateBetween(Integer value1, Integer value2) {
            addCriterion("quit_state between", value1, value2, "quitState");
            return (Criteria) this;
        }

        public Criteria andQuitStateNotBetween(Integer value1, Integer value2) {
            addCriterion("quit_state not between", value1, value2, "quitState");
            return (Criteria) this;
        }

        public Criteria andQuitTypeIsNull() {
            addCriterion("quit_type is null");
            return (Criteria) this;
        }

        public Criteria andQuitTypeIsNotNull() {
            addCriterion("quit_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuitTypeEqualTo(Integer value) {
            addCriterion("quit_type =", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeNotEqualTo(Integer value) {
            addCriterion("quit_type <>", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeGreaterThan(Integer value) {
            addCriterion("quit_type >", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("quit_type >=", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeLessThan(Integer value) {
            addCriterion("quit_type <", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeLessThanOrEqualTo(Integer value) {
            addCriterion("quit_type <=", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeIn(List<Integer> values) {
            addCriterion("quit_type in", values, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeNotIn(List<Integer> values) {
            addCriterion("quit_type not in", values, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeBetween(Integer value1, Integer value2) {
            addCriterion("quit_type between", value1, value2, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("quit_type not between", value1, value2, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitCheckIsNull() {
            addCriterion("quit_check is null");
            return (Criteria) this;
        }

        public Criteria andQuitCheckIsNotNull() {
            addCriterion("quit_check is not null");
            return (Criteria) this;
        }

        public Criteria andQuitCheckEqualTo(Integer value) {
            addCriterion("quit_check =", value, "quitCheck");
            return (Criteria) this;
        }

        public Criteria andQuitCheckNotEqualTo(Integer value) {
            addCriterion("quit_check <>", value, "quitCheck");
            return (Criteria) this;
        }

        public Criteria andQuitCheckGreaterThan(Integer value) {
            addCriterion("quit_check >", value, "quitCheck");
            return (Criteria) this;
        }

        public Criteria andQuitCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("quit_check >=", value, "quitCheck");
            return (Criteria) this;
        }

        public Criteria andQuitCheckLessThan(Integer value) {
            addCriterion("quit_check <", value, "quitCheck");
            return (Criteria) this;
        }

        public Criteria andQuitCheckLessThanOrEqualTo(Integer value) {
            addCriterion("quit_check <=", value, "quitCheck");
            return (Criteria) this;
        }

        public Criteria andQuitCheckIn(List<Integer> values) {
            addCriterion("quit_check in", values, "quitCheck");
            return (Criteria) this;
        }

        public Criteria andQuitCheckNotIn(List<Integer> values) {
            addCriterion("quit_check not in", values, "quitCheck");
            return (Criteria) this;
        }

        public Criteria andQuitCheckBetween(Integer value1, Integer value2) {
            addCriterion("quit_check between", value1, value2, "quitCheck");
            return (Criteria) this;
        }

        public Criteria andQuitCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("quit_check not between", value1, value2, "quitCheck");
            return (Criteria) this;
        }

        public Criteria andQuitCreateIsNull() {
            addCriterion("quit_create is null");
            return (Criteria) this;
        }

        public Criteria andQuitCreateIsNotNull() {
            addCriterion("quit_create is not null");
            return (Criteria) this;
        }

        public Criteria andQuitCreateEqualTo(Date value) {
            addCriterionForJDBCDate("quit_create =", value, "quitCreate");
            return (Criteria) this;
        }

        public Criteria andQuitCreateNotEqualTo(Date value) {
            addCriterionForJDBCDate("quit_create <>", value, "quitCreate");
            return (Criteria) this;
        }

        public Criteria andQuitCreateGreaterThan(Date value) {
            addCriterionForJDBCDate("quit_create >", value, "quitCreate");
            return (Criteria) this;
        }

        public Criteria andQuitCreateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("quit_create >=", value, "quitCreate");
            return (Criteria) this;
        }

        public Criteria andQuitCreateLessThan(Date value) {
            addCriterionForJDBCDate("quit_create <", value, "quitCreate");
            return (Criteria) this;
        }

        public Criteria andQuitCreateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("quit_create <=", value, "quitCreate");
            return (Criteria) this;
        }

        public Criteria andQuitCreateIn(List<Date> values) {
            addCriterionForJDBCDate("quit_create in", values, "quitCreate");
            return (Criteria) this;
        }

        public Criteria andQuitCreateNotIn(List<Date> values) {
            addCriterionForJDBCDate("quit_create not in", values, "quitCreate");
            return (Criteria) this;
        }

        public Criteria andQuitCreateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("quit_create between", value1, value2, "quitCreate");
            return (Criteria) this;
        }

        public Criteria andQuitCreateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("quit_create not between", value1, value2, "quitCreate");
            return (Criteria) this;
        }

        public Criteria andQuitUpdateIsNull() {
            addCriterion("quit_update is null");
            return (Criteria) this;
        }

        public Criteria andQuitUpdateIsNotNull() {
            addCriterion("quit_update is not null");
            return (Criteria) this;
        }

        public Criteria andQuitUpdateEqualTo(Date value) {
            addCriterionForJDBCDate("quit_update =", value, "quitUpdate");
            return (Criteria) this;
        }

        public Criteria andQuitUpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("quit_update <>", value, "quitUpdate");
            return (Criteria) this;
        }

        public Criteria andQuitUpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("quit_update >", value, "quitUpdate");
            return (Criteria) this;
        }

        public Criteria andQuitUpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("quit_update >=", value, "quitUpdate");
            return (Criteria) this;
        }

        public Criteria andQuitUpdateLessThan(Date value) {
            addCriterionForJDBCDate("quit_update <", value, "quitUpdate");
            return (Criteria) this;
        }

        public Criteria andQuitUpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("quit_update <=", value, "quitUpdate");
            return (Criteria) this;
        }

        public Criteria andQuitUpdateIn(List<Date> values) {
            addCriterionForJDBCDate("quit_update in", values, "quitUpdate");
            return (Criteria) this;
        }

        public Criteria andQuitUpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("quit_update not in", values, "quitUpdate");
            return (Criteria) this;
        }

        public Criteria andQuitUpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("quit_update between", value1, value2, "quitUpdate");
            return (Criteria) this;
        }

        public Criteria andQuitUpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("quit_update not between", value1, value2, "quitUpdate");
            return (Criteria) this;
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