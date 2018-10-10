package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GardenApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GardenApplyExample() {
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

        public Criteria andGardenIdIsNull() {
            addCriterion("garden_id is null");
            return (Criteria) this;
        }

        public Criteria andGardenIdIsNotNull() {
            addCriterion("garden_id is not null");
            return (Criteria) this;
        }

        public Criteria andGardenIdEqualTo(Integer value) {
            addCriterion("garden_id =", value, "gardenId");
            return (Criteria) this;
        }

        public Criteria andGardenIdNotEqualTo(Integer value) {
            addCriterion("garden_id <>", value, "gardenId");
            return (Criteria) this;
        }

        public Criteria andGardenIdGreaterThan(Integer value) {
            addCriterion("garden_id >", value, "gardenId");
            return (Criteria) this;
        }

        public Criteria andGardenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("garden_id >=", value, "gardenId");
            return (Criteria) this;
        }

        public Criteria andGardenIdLessThan(Integer value) {
            addCriterion("garden_id <", value, "gardenId");
            return (Criteria) this;
        }

        public Criteria andGardenIdLessThanOrEqualTo(Integer value) {
            addCriterion("garden_id <=", value, "gardenId");
            return (Criteria) this;
        }

        public Criteria andGardenIdIn(List<Integer> values) {
            addCriterion("garden_id in", values, "gardenId");
            return (Criteria) this;
        }

        public Criteria andGardenIdNotIn(List<Integer> values) {
            addCriterion("garden_id not in", values, "gardenId");
            return (Criteria) this;
        }

        public Criteria andGardenIdBetween(Integer value1, Integer value2) {
            addCriterion("garden_id between", value1, value2, "gardenId");
            return (Criteria) this;
        }

        public Criteria andGardenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("garden_id not between", value1, value2, "gardenId");
            return (Criteria) this;
        }

        public Criteria andGardenCompanyIsNull() {
            addCriterion("garden_company is null");
            return (Criteria) this;
        }

        public Criteria andGardenCompanyIsNotNull() {
            addCriterion("garden_company is not null");
            return (Criteria) this;
        }

        public Criteria andGardenCompanyEqualTo(String value) {
            addCriterion("garden_company =", value, "gardenCompany");
            return (Criteria) this;
        }

        public Criteria andGardenCompanyNotEqualTo(String value) {
            addCriterion("garden_company <>", value, "gardenCompany");
            return (Criteria) this;
        }

        public Criteria andGardenCompanyGreaterThan(String value) {
            addCriterion("garden_company >", value, "gardenCompany");
            return (Criteria) this;
        }

        public Criteria andGardenCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("garden_company >=", value, "gardenCompany");
            return (Criteria) this;
        }

        public Criteria andGardenCompanyLessThan(String value) {
            addCriterion("garden_company <", value, "gardenCompany");
            return (Criteria) this;
        }

        public Criteria andGardenCompanyLessThanOrEqualTo(String value) {
            addCriterion("garden_company <=", value, "gardenCompany");
            return (Criteria) this;
        }

        public Criteria andGardenCompanyLike(String value) {
            addCriterion("garden_company like", value, "gardenCompany");
            return (Criteria) this;
        }

        public Criteria andGardenCompanyNotLike(String value) {
            addCriterion("garden_company not like", value, "gardenCompany");
            return (Criteria) this;
        }

        public Criteria andGardenCompanyIn(List<String> values) {
            addCriterion("garden_company in", values, "gardenCompany");
            return (Criteria) this;
        }

        public Criteria andGardenCompanyNotIn(List<String> values) {
            addCriterion("garden_company not in", values, "gardenCompany");
            return (Criteria) this;
        }

        public Criteria andGardenCompanyBetween(String value1, String value2) {
            addCriterion("garden_company between", value1, value2, "gardenCompany");
            return (Criteria) this;
        }

        public Criteria andGardenCompanyNotBetween(String value1, String value2) {
            addCriterion("garden_company not between", value1, value2, "gardenCompany");
            return (Criteria) this;
        }

        public Criteria andGardenRegistrationIsNull() {
            addCriterion("garden_registration is null");
            return (Criteria) this;
        }

        public Criteria andGardenRegistrationIsNotNull() {
            addCriterion("garden_registration is not null");
            return (Criteria) this;
        }

        public Criteria andGardenRegistrationEqualTo(String value) {
            addCriterion("garden_registration =", value, "gardenRegistration");
            return (Criteria) this;
        }

        public Criteria andGardenRegistrationNotEqualTo(String value) {
            addCriterion("garden_registration <>", value, "gardenRegistration");
            return (Criteria) this;
        }

        public Criteria andGardenRegistrationGreaterThan(String value) {
            addCriterion("garden_registration >", value, "gardenRegistration");
            return (Criteria) this;
        }

        public Criteria andGardenRegistrationGreaterThanOrEqualTo(String value) {
            addCriterion("garden_registration >=", value, "gardenRegistration");
            return (Criteria) this;
        }

        public Criteria andGardenRegistrationLessThan(String value) {
            addCriterion("garden_registration <", value, "gardenRegistration");
            return (Criteria) this;
        }

        public Criteria andGardenRegistrationLessThanOrEqualTo(String value) {
            addCriterion("garden_registration <=", value, "gardenRegistration");
            return (Criteria) this;
        }

        public Criteria andGardenRegistrationLike(String value) {
            addCriterion("garden_registration like", value, "gardenRegistration");
            return (Criteria) this;
        }

        public Criteria andGardenRegistrationNotLike(String value) {
            addCriterion("garden_registration not like", value, "gardenRegistration");
            return (Criteria) this;
        }

        public Criteria andGardenRegistrationIn(List<String> values) {
            addCriterion("garden_registration in", values, "gardenRegistration");
            return (Criteria) this;
        }

        public Criteria andGardenRegistrationNotIn(List<String> values) {
            addCriterion("garden_registration not in", values, "gardenRegistration");
            return (Criteria) this;
        }

        public Criteria andGardenRegistrationBetween(String value1, String value2) {
            addCriterion("garden_registration between", value1, value2, "gardenRegistration");
            return (Criteria) this;
        }

        public Criteria andGardenRegistrationNotBetween(String value1, String value2) {
            addCriterion("garden_registration not between", value1, value2, "gardenRegistration");
            return (Criteria) this;
        }

        public Criteria andGardenDateIsNull() {
            addCriterion("garden_date is null");
            return (Criteria) this;
        }

        public Criteria andGardenDateIsNotNull() {
            addCriterion("garden_date is not null");
            return (Criteria) this;
        }

        public Criteria andGardenDateEqualTo(Date value) {
            addCriterionForJDBCDate("garden_date =", value, "gardenDate");
            return (Criteria) this;
        }

        public Criteria andGardenDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("garden_date <>", value, "gardenDate");
            return (Criteria) this;
        }

        public Criteria andGardenDateGreaterThan(Date value) {
            addCriterionForJDBCDate("garden_date >", value, "gardenDate");
            return (Criteria) this;
        }

        public Criteria andGardenDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("garden_date >=", value, "gardenDate");
            return (Criteria) this;
        }

        public Criteria andGardenDateLessThan(Date value) {
            addCriterionForJDBCDate("garden_date <", value, "gardenDate");
            return (Criteria) this;
        }

        public Criteria andGardenDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("garden_date <=", value, "gardenDate");
            return (Criteria) this;
        }

        public Criteria andGardenDateIn(List<Date> values) {
            addCriterionForJDBCDate("garden_date in", values, "gardenDate");
            return (Criteria) this;
        }

        public Criteria andGardenDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("garden_date not in", values, "gardenDate");
            return (Criteria) this;
        }

        public Criteria andGardenDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("garden_date between", value1, value2, "gardenDate");
            return (Criteria) this;
        }

        public Criteria andGardenDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("garden_date not between", value1, value2, "gardenDate");
            return (Criteria) this;
        }

        public Criteria andGardenAreaIsNull() {
            addCriterion("garden_area is null");
            return (Criteria) this;
        }

        public Criteria andGardenAreaIsNotNull() {
            addCriterion("garden_area is not null");
            return (Criteria) this;
        }

        public Criteria andGardenAreaEqualTo(Double value) {
            addCriterion("garden_area =", value, "gardenArea");
            return (Criteria) this;
        }

        public Criteria andGardenAreaNotEqualTo(Double value) {
            addCriterion("garden_area <>", value, "gardenArea");
            return (Criteria) this;
        }

        public Criteria andGardenAreaGreaterThan(Double value) {
            addCriterion("garden_area >", value, "gardenArea");
            return (Criteria) this;
        }

        public Criteria andGardenAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("garden_area >=", value, "gardenArea");
            return (Criteria) this;
        }

        public Criteria andGardenAreaLessThan(Double value) {
            addCriterion("garden_area <", value, "gardenArea");
            return (Criteria) this;
        }

        public Criteria andGardenAreaLessThanOrEqualTo(Double value) {
            addCriterion("garden_area <=", value, "gardenArea");
            return (Criteria) this;
        }

        public Criteria andGardenAreaIn(List<Double> values) {
            addCriterion("garden_area in", values, "gardenArea");
            return (Criteria) this;
        }

        public Criteria andGardenAreaNotIn(List<Double> values) {
            addCriterion("garden_area not in", values, "gardenArea");
            return (Criteria) this;
        }

        public Criteria andGardenAreaBetween(Double value1, Double value2) {
            addCriterion("garden_area between", value1, value2, "gardenArea");
            return (Criteria) this;
        }

        public Criteria andGardenAreaNotBetween(Double value1, Double value2) {
            addCriterion("garden_area not between", value1, value2, "gardenArea");
            return (Criteria) this;
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

        public Criteria andGardenProductsIsNull() {
            addCriterion("garden_products is null");
            return (Criteria) this;
        }

        public Criteria andGardenProductsIsNotNull() {
            addCriterion("garden_products is not null");
            return (Criteria) this;
        }

        public Criteria andGardenProductsEqualTo(String value) {
            addCriterion("garden_products =", value, "gardenProducts");
            return (Criteria) this;
        }

        public Criteria andGardenProductsNotEqualTo(String value) {
            addCriterion("garden_products <>", value, "gardenProducts");
            return (Criteria) this;
        }

        public Criteria andGardenProductsGreaterThan(String value) {
            addCriterion("garden_products >", value, "gardenProducts");
            return (Criteria) this;
        }

        public Criteria andGardenProductsGreaterThanOrEqualTo(String value) {
            addCriterion("garden_products >=", value, "gardenProducts");
            return (Criteria) this;
        }

        public Criteria andGardenProductsLessThan(String value) {
            addCriterion("garden_products <", value, "gardenProducts");
            return (Criteria) this;
        }

        public Criteria andGardenProductsLessThanOrEqualTo(String value) {
            addCriterion("garden_products <=", value, "gardenProducts");
            return (Criteria) this;
        }

        public Criteria andGardenProductsLike(String value) {
            addCriterion("garden_products like", value, "gardenProducts");
            return (Criteria) this;
        }

        public Criteria andGardenProductsNotLike(String value) {
            addCriterion("garden_products not like", value, "gardenProducts");
            return (Criteria) this;
        }

        public Criteria andGardenProductsIn(List<String> values) {
            addCriterion("garden_products in", values, "gardenProducts");
            return (Criteria) this;
        }

        public Criteria andGardenProductsNotIn(List<String> values) {
            addCriterion("garden_products not in", values, "gardenProducts");
            return (Criteria) this;
        }

        public Criteria andGardenProductsBetween(String value1, String value2) {
            addCriterion("garden_products between", value1, value2, "gardenProducts");
            return (Criteria) this;
        }

        public Criteria andGardenProductsNotBetween(String value1, String value2) {
            addCriterion("garden_products not between", value1, value2, "gardenProducts");
            return (Criteria) this;
        }

        public Criteria andGardenIacrIsNull() {
            addCriterion("garden_iacr is null");
            return (Criteria) this;
        }

        public Criteria andGardenIacrIsNotNull() {
            addCriterion("garden_iacr is not null");
            return (Criteria) this;
        }

        public Criteria andGardenIacrEqualTo(Integer value) {
            addCriterion("garden_iacr =", value, "gardenIacr");
            return (Criteria) this;
        }

        public Criteria andGardenIacrNotEqualTo(Integer value) {
            addCriterion("garden_iacr <>", value, "gardenIacr");
            return (Criteria) this;
        }

        public Criteria andGardenIacrGreaterThan(Integer value) {
            addCriterion("garden_iacr >", value, "gardenIacr");
            return (Criteria) this;
        }

        public Criteria andGardenIacrGreaterThanOrEqualTo(Integer value) {
            addCriterion("garden_iacr >=", value, "gardenIacr");
            return (Criteria) this;
        }

        public Criteria andGardenIacrLessThan(Integer value) {
            addCriterion("garden_iacr <", value, "gardenIacr");
            return (Criteria) this;
        }

        public Criteria andGardenIacrLessThanOrEqualTo(Integer value) {
            addCriterion("garden_iacr <=", value, "gardenIacr");
            return (Criteria) this;
        }

        public Criteria andGardenIacrIn(List<Integer> values) {
            addCriterion("garden_iacr in", values, "gardenIacr");
            return (Criteria) this;
        }

        public Criteria andGardenIacrNotIn(List<Integer> values) {
            addCriterion("garden_iacr not in", values, "gardenIacr");
            return (Criteria) this;
        }

        public Criteria andGardenIacrBetween(Integer value1, Integer value2) {
            addCriterion("garden_iacr between", value1, value2, "gardenIacr");
            return (Criteria) this;
        }

        public Criteria andGardenIacrNotBetween(Integer value1, Integer value2) {
            addCriterion("garden_iacr not between", value1, value2, "gardenIacr");
            return (Criteria) this;
        }

        public Criteria andGardenLawpersonIsNull() {
            addCriterion("garden_lawperson is null");
            return (Criteria) this;
        }

        public Criteria andGardenLawpersonIsNotNull() {
            addCriterion("garden_lawperson is not null");
            return (Criteria) this;
        }

        public Criteria andGardenLawpersonEqualTo(String value) {
            addCriterion("garden_lawperson =", value, "gardenLawperson");
            return (Criteria) this;
        }

        public Criteria andGardenLawpersonNotEqualTo(String value) {
            addCriterion("garden_lawperson <>", value, "gardenLawperson");
            return (Criteria) this;
        }

        public Criteria andGardenLawpersonGreaterThan(String value) {
            addCriterion("garden_lawperson >", value, "gardenLawperson");
            return (Criteria) this;
        }

        public Criteria andGardenLawpersonGreaterThanOrEqualTo(String value) {
            addCriterion("garden_lawperson >=", value, "gardenLawperson");
            return (Criteria) this;
        }

        public Criteria andGardenLawpersonLessThan(String value) {
            addCriterion("garden_lawperson <", value, "gardenLawperson");
            return (Criteria) this;
        }

        public Criteria andGardenLawpersonLessThanOrEqualTo(String value) {
            addCriterion("garden_lawperson <=", value, "gardenLawperson");
            return (Criteria) this;
        }

        public Criteria andGardenLawpersonLike(String value) {
            addCriterion("garden_lawperson like", value, "gardenLawperson");
            return (Criteria) this;
        }

        public Criteria andGardenLawpersonNotLike(String value) {
            addCriterion("garden_lawperson not like", value, "gardenLawperson");
            return (Criteria) this;
        }

        public Criteria andGardenLawpersonIn(List<String> values) {
            addCriterion("garden_lawperson in", values, "gardenLawperson");
            return (Criteria) this;
        }

        public Criteria andGardenLawpersonNotIn(List<String> values) {
            addCriterion("garden_lawperson not in", values, "gardenLawperson");
            return (Criteria) this;
        }

        public Criteria andGardenLawpersonBetween(String value1, String value2) {
            addCriterion("garden_lawperson between", value1, value2, "gardenLawperson");
            return (Criteria) this;
        }

        public Criteria andGardenLawpersonNotBetween(String value1, String value2) {
            addCriterion("garden_lawperson not between", value1, value2, "gardenLawperson");
            return (Criteria) this;
        }

        public Criteria andGardenLawphoneIsNull() {
            addCriterion("garden_lawphone is null");
            return (Criteria) this;
        }

        public Criteria andGardenLawphoneIsNotNull() {
            addCriterion("garden_lawphone is not null");
            return (Criteria) this;
        }

        public Criteria andGardenLawphoneEqualTo(String value) {
            addCriterion("garden_lawphone =", value, "gardenLawphone");
            return (Criteria) this;
        }

        public Criteria andGardenLawphoneNotEqualTo(String value) {
            addCriterion("garden_lawphone <>", value, "gardenLawphone");
            return (Criteria) this;
        }

        public Criteria andGardenLawphoneGreaterThan(String value) {
            addCriterion("garden_lawphone >", value, "gardenLawphone");
            return (Criteria) this;
        }

        public Criteria andGardenLawphoneGreaterThanOrEqualTo(String value) {
            addCriterion("garden_lawphone >=", value, "gardenLawphone");
            return (Criteria) this;
        }

        public Criteria andGardenLawphoneLessThan(String value) {
            addCriterion("garden_lawphone <", value, "gardenLawphone");
            return (Criteria) this;
        }

        public Criteria andGardenLawphoneLessThanOrEqualTo(String value) {
            addCriterion("garden_lawphone <=", value, "gardenLawphone");
            return (Criteria) this;
        }

        public Criteria andGardenLawphoneLike(String value) {
            addCriterion("garden_lawphone like", value, "gardenLawphone");
            return (Criteria) this;
        }

        public Criteria andGardenLawphoneNotLike(String value) {
            addCriterion("garden_lawphone not like", value, "gardenLawphone");
            return (Criteria) this;
        }

        public Criteria andGardenLawphoneIn(List<String> values) {
            addCriterion("garden_lawphone in", values, "gardenLawphone");
            return (Criteria) this;
        }

        public Criteria andGardenLawphoneNotIn(List<String> values) {
            addCriterion("garden_lawphone not in", values, "gardenLawphone");
            return (Criteria) this;
        }

        public Criteria andGardenLawphoneBetween(String value1, String value2) {
            addCriterion("garden_lawphone between", value1, value2, "gardenLawphone");
            return (Criteria) this;
        }

        public Criteria andGardenLawphoneNotBetween(String value1, String value2) {
            addCriterion("garden_lawphone not between", value1, value2, "gardenLawphone");
            return (Criteria) this;
        }

        public Criteria andGardenCapitalIsNull() {
            addCriterion("garden_capital is null");
            return (Criteria) this;
        }

        public Criteria andGardenCapitalIsNotNull() {
            addCriterion("garden_capital is not null");
            return (Criteria) this;
        }

        public Criteria andGardenCapitalEqualTo(Double value) {
            addCriterion("garden_capital =", value, "gardenCapital");
            return (Criteria) this;
        }

        public Criteria andGardenCapitalNotEqualTo(Double value) {
            addCriterion("garden_capital <>", value, "gardenCapital");
            return (Criteria) this;
        }

        public Criteria andGardenCapitalGreaterThan(Double value) {
            addCriterion("garden_capital >", value, "gardenCapital");
            return (Criteria) this;
        }

        public Criteria andGardenCapitalGreaterThanOrEqualTo(Double value) {
            addCriterion("garden_capital >=", value, "gardenCapital");
            return (Criteria) this;
        }

        public Criteria andGardenCapitalLessThan(Double value) {
            addCriterion("garden_capital <", value, "gardenCapital");
            return (Criteria) this;
        }

        public Criteria andGardenCapitalLessThanOrEqualTo(Double value) {
            addCriterion("garden_capital <=", value, "gardenCapital");
            return (Criteria) this;
        }

        public Criteria andGardenCapitalIn(List<Double> values) {
            addCriterion("garden_capital in", values, "gardenCapital");
            return (Criteria) this;
        }

        public Criteria andGardenCapitalNotIn(List<Double> values) {
            addCriterion("garden_capital not in", values, "gardenCapital");
            return (Criteria) this;
        }

        public Criteria andGardenCapitalBetween(Double value1, Double value2) {
            addCriterion("garden_capital between", value1, value2, "gardenCapital");
            return (Criteria) this;
        }

        public Criteria andGardenCapitalNotBetween(Double value1, Double value2) {
            addCriterion("garden_capital not between", value1, value2, "gardenCapital");
            return (Criteria) this;
        }

        public Criteria andGardenAddressIsNull() {
            addCriterion("garden_address is null");
            return (Criteria) this;
        }

        public Criteria andGardenAddressIsNotNull() {
            addCriterion("garden_address is not null");
            return (Criteria) this;
        }

        public Criteria andGardenAddressEqualTo(String value) {
            addCriterion("garden_address =", value, "gardenAddress");
            return (Criteria) this;
        }

        public Criteria andGardenAddressNotEqualTo(String value) {
            addCriterion("garden_address <>", value, "gardenAddress");
            return (Criteria) this;
        }

        public Criteria andGardenAddressGreaterThan(String value) {
            addCriterion("garden_address >", value, "gardenAddress");
            return (Criteria) this;
        }

        public Criteria andGardenAddressGreaterThanOrEqualTo(String value) {
            addCriterion("garden_address >=", value, "gardenAddress");
            return (Criteria) this;
        }

        public Criteria andGardenAddressLessThan(String value) {
            addCriterion("garden_address <", value, "gardenAddress");
            return (Criteria) this;
        }

        public Criteria andGardenAddressLessThanOrEqualTo(String value) {
            addCriterion("garden_address <=", value, "gardenAddress");
            return (Criteria) this;
        }

        public Criteria andGardenAddressLike(String value) {
            addCriterion("garden_address like", value, "gardenAddress");
            return (Criteria) this;
        }

        public Criteria andGardenAddressNotLike(String value) {
            addCriterion("garden_address not like", value, "gardenAddress");
            return (Criteria) this;
        }

        public Criteria andGardenAddressIn(List<String> values) {
            addCriterion("garden_address in", values, "gardenAddress");
            return (Criteria) this;
        }

        public Criteria andGardenAddressNotIn(List<String> values) {
            addCriterion("garden_address not in", values, "gardenAddress");
            return (Criteria) this;
        }

        public Criteria andGardenAddressBetween(String value1, String value2) {
            addCriterion("garden_address between", value1, value2, "gardenAddress");
            return (Criteria) this;
        }

        public Criteria andGardenAddressNotBetween(String value1, String value2) {
            addCriterion("garden_address not between", value1, value2, "gardenAddress");
            return (Criteria) this;
        }

        public Criteria andGardenRegtimeIsNull() {
            addCriterion("garden_regtime is null");
            return (Criteria) this;
        }

        public Criteria andGardenRegtimeIsNotNull() {
            addCriterion("garden_regtime is not null");
            return (Criteria) this;
        }

        public Criteria andGardenRegtimeEqualTo(Date value) {
            addCriterionForJDBCDate("garden_regtime =", value, "gardenRegtime");
            return (Criteria) this;
        }

        public Criteria andGardenRegtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("garden_regtime <>", value, "gardenRegtime");
            return (Criteria) this;
        }

        public Criteria andGardenRegtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("garden_regtime >", value, "gardenRegtime");
            return (Criteria) this;
        }

        public Criteria andGardenRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("garden_regtime >=", value, "gardenRegtime");
            return (Criteria) this;
        }

        public Criteria andGardenRegtimeLessThan(Date value) {
            addCriterionForJDBCDate("garden_regtime <", value, "gardenRegtime");
            return (Criteria) this;
        }

        public Criteria andGardenRegtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("garden_regtime <=", value, "gardenRegtime");
            return (Criteria) this;
        }

        public Criteria andGardenRegtimeIn(List<Date> values) {
            addCriterionForJDBCDate("garden_regtime in", values, "gardenRegtime");
            return (Criteria) this;
        }

        public Criteria andGardenRegtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("garden_regtime not in", values, "gardenRegtime");
            return (Criteria) this;
        }

        public Criteria andGardenRegtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("garden_regtime between", value1, value2, "gardenRegtime");
            return (Criteria) this;
        }

        public Criteria andGardenRegtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("garden_regtime not between", value1, value2, "gardenRegtime");
            return (Criteria) this;
        }

        public Criteria andGardenSaleIsNull() {
            addCriterion("garden_sale is null");
            return (Criteria) this;
        }

        public Criteria andGardenSaleIsNotNull() {
            addCriterion("garden_sale is not null");
            return (Criteria) this;
        }

        public Criteria andGardenSaleEqualTo(Double value) {
            addCriterion("garden_sale =", value, "gardenSale");
            return (Criteria) this;
        }

        public Criteria andGardenSaleNotEqualTo(Double value) {
            addCriterion("garden_sale <>", value, "gardenSale");
            return (Criteria) this;
        }

        public Criteria andGardenSaleGreaterThan(Double value) {
            addCriterion("garden_sale >", value, "gardenSale");
            return (Criteria) this;
        }

        public Criteria andGardenSaleGreaterThanOrEqualTo(Double value) {
            addCriterion("garden_sale >=", value, "gardenSale");
            return (Criteria) this;
        }

        public Criteria andGardenSaleLessThan(Double value) {
            addCriterion("garden_sale <", value, "gardenSale");
            return (Criteria) this;
        }

        public Criteria andGardenSaleLessThanOrEqualTo(Double value) {
            addCriterion("garden_sale <=", value, "gardenSale");
            return (Criteria) this;
        }

        public Criteria andGardenSaleIn(List<Double> values) {
            addCriterion("garden_sale in", values, "gardenSale");
            return (Criteria) this;
        }

        public Criteria andGardenSaleNotIn(List<Double> values) {
            addCriterion("garden_sale not in", values, "gardenSale");
            return (Criteria) this;
        }

        public Criteria andGardenSaleBetween(Double value1, Double value2) {
            addCriterion("garden_sale between", value1, value2, "gardenSale");
            return (Criteria) this;
        }

        public Criteria andGardenSaleNotBetween(Double value1, Double value2) {
            addCriterion("garden_sale not between", value1, value2, "gardenSale");
            return (Criteria) this;
        }

        public Criteria andGardenRatalIsNull() {
            addCriterion("garden_ratal is null");
            return (Criteria) this;
        }

        public Criteria andGardenRatalIsNotNull() {
            addCriterion("garden_ratal is not null");
            return (Criteria) this;
        }

        public Criteria andGardenRatalEqualTo(Double value) {
            addCriterion("garden_ratal =", value, "gardenRatal");
            return (Criteria) this;
        }

        public Criteria andGardenRatalNotEqualTo(Double value) {
            addCriterion("garden_ratal <>", value, "gardenRatal");
            return (Criteria) this;
        }

        public Criteria andGardenRatalGreaterThan(Double value) {
            addCriterion("garden_ratal >", value, "gardenRatal");
            return (Criteria) this;
        }

        public Criteria andGardenRatalGreaterThanOrEqualTo(Double value) {
            addCriterion("garden_ratal >=", value, "gardenRatal");
            return (Criteria) this;
        }

        public Criteria andGardenRatalLessThan(Double value) {
            addCriterion("garden_ratal <", value, "gardenRatal");
            return (Criteria) this;
        }

        public Criteria andGardenRatalLessThanOrEqualTo(Double value) {
            addCriterion("garden_ratal <=", value, "gardenRatal");
            return (Criteria) this;
        }

        public Criteria andGardenRatalIn(List<Double> values) {
            addCriterion("garden_ratal in", values, "gardenRatal");
            return (Criteria) this;
        }

        public Criteria andGardenRatalNotIn(List<Double> values) {
            addCriterion("garden_ratal not in", values, "gardenRatal");
            return (Criteria) this;
        }

        public Criteria andGardenRatalBetween(Double value1, Double value2) {
            addCriterion("garden_ratal between", value1, value2, "gardenRatal");
            return (Criteria) this;
        }

        public Criteria andGardenRatalNotBetween(Double value1, Double value2) {
            addCriterion("garden_ratal not between", value1, value2, "gardenRatal");
            return (Criteria) this;
        }

        public Criteria andGardenIpIsNull() {
            addCriterion("garden_ip is null");
            return (Criteria) this;
        }

        public Criteria andGardenIpIsNotNull() {
            addCriterion("garden_ip is not null");
            return (Criteria) this;
        }

        public Criteria andGardenIpEqualTo(String value) {
            addCriterion("garden_ip =", value, "gardenIp");
            return (Criteria) this;
        }

        public Criteria andGardenIpNotEqualTo(String value) {
            addCriterion("garden_ip <>", value, "gardenIp");
            return (Criteria) this;
        }

        public Criteria andGardenIpGreaterThan(String value) {
            addCriterion("garden_ip >", value, "gardenIp");
            return (Criteria) this;
        }

        public Criteria andGardenIpGreaterThanOrEqualTo(String value) {
            addCriterion("garden_ip >=", value, "gardenIp");
            return (Criteria) this;
        }

        public Criteria andGardenIpLessThan(String value) {
            addCriterion("garden_ip <", value, "gardenIp");
            return (Criteria) this;
        }

        public Criteria andGardenIpLessThanOrEqualTo(String value) {
            addCriterion("garden_ip <=", value, "gardenIp");
            return (Criteria) this;
        }

        public Criteria andGardenIpLike(String value) {
            addCriterion("garden_ip like", value, "gardenIp");
            return (Criteria) this;
        }

        public Criteria andGardenIpNotLike(String value) {
            addCriterion("garden_ip not like", value, "gardenIp");
            return (Criteria) this;
        }

        public Criteria andGardenIpIn(List<String> values) {
            addCriterion("garden_ip in", values, "gardenIp");
            return (Criteria) this;
        }

        public Criteria andGardenIpNotIn(List<String> values) {
            addCriterion("garden_ip not in", values, "gardenIp");
            return (Criteria) this;
        }

        public Criteria andGardenIpBetween(String value1, String value2) {
            addCriterion("garden_ip between", value1, value2, "gardenIp");
            return (Criteria) this;
        }

        public Criteria andGardenIpNotBetween(String value1, String value2) {
            addCriterion("garden_ip not between", value1, value2, "gardenIp");
            return (Criteria) this;
        }

        public Criteria andGardenLinknameIsNull() {
            addCriterion("garden_linkname is null");
            return (Criteria) this;
        }

        public Criteria andGardenLinknameIsNotNull() {
            addCriterion("garden_linkname is not null");
            return (Criteria) this;
        }

        public Criteria andGardenLinknameEqualTo(String value) {
            addCriterion("garden_linkname =", value, "gardenLinkname");
            return (Criteria) this;
        }

        public Criteria andGardenLinknameNotEqualTo(String value) {
            addCriterion("garden_linkname <>", value, "gardenLinkname");
            return (Criteria) this;
        }

        public Criteria andGardenLinknameGreaterThan(String value) {
            addCriterion("garden_linkname >", value, "gardenLinkname");
            return (Criteria) this;
        }

        public Criteria andGardenLinknameGreaterThanOrEqualTo(String value) {
            addCriterion("garden_linkname >=", value, "gardenLinkname");
            return (Criteria) this;
        }

        public Criteria andGardenLinknameLessThan(String value) {
            addCriterion("garden_linkname <", value, "gardenLinkname");
            return (Criteria) this;
        }

        public Criteria andGardenLinknameLessThanOrEqualTo(String value) {
            addCriterion("garden_linkname <=", value, "gardenLinkname");
            return (Criteria) this;
        }

        public Criteria andGardenLinknameLike(String value) {
            addCriterion("garden_linkname like", value, "gardenLinkname");
            return (Criteria) this;
        }

        public Criteria andGardenLinknameNotLike(String value) {
            addCriterion("garden_linkname not like", value, "gardenLinkname");
            return (Criteria) this;
        }

        public Criteria andGardenLinknameIn(List<String> values) {
            addCriterion("garden_linkname in", values, "gardenLinkname");
            return (Criteria) this;
        }

        public Criteria andGardenLinknameNotIn(List<String> values) {
            addCriterion("garden_linkname not in", values, "gardenLinkname");
            return (Criteria) this;
        }

        public Criteria andGardenLinknameBetween(String value1, String value2) {
            addCriterion("garden_linkname between", value1, value2, "gardenLinkname");
            return (Criteria) this;
        }

        public Criteria andGardenLinknameNotBetween(String value1, String value2) {
            addCriterion("garden_linkname not between", value1, value2, "gardenLinkname");
            return (Criteria) this;
        }

        public Criteria andGardenLinkphoneIsNull() {
            addCriterion("garden_linkphone is null");
            return (Criteria) this;
        }

        public Criteria andGardenLinkphoneIsNotNull() {
            addCriterion("garden_linkphone is not null");
            return (Criteria) this;
        }

        public Criteria andGardenLinkphoneEqualTo(String value) {
            addCriterion("garden_linkphone =", value, "gardenLinkphone");
            return (Criteria) this;
        }

        public Criteria andGardenLinkphoneNotEqualTo(String value) {
            addCriterion("garden_linkphone <>", value, "gardenLinkphone");
            return (Criteria) this;
        }

        public Criteria andGardenLinkphoneGreaterThan(String value) {
            addCriterion("garden_linkphone >", value, "gardenLinkphone");
            return (Criteria) this;
        }

        public Criteria andGardenLinkphoneGreaterThanOrEqualTo(String value) {
            addCriterion("garden_linkphone >=", value, "gardenLinkphone");
            return (Criteria) this;
        }

        public Criteria andGardenLinkphoneLessThan(String value) {
            addCriterion("garden_linkphone <", value, "gardenLinkphone");
            return (Criteria) this;
        }

        public Criteria andGardenLinkphoneLessThanOrEqualTo(String value) {
            addCriterion("garden_linkphone <=", value, "gardenLinkphone");
            return (Criteria) this;
        }

        public Criteria andGardenLinkphoneLike(String value) {
            addCriterion("garden_linkphone like", value, "gardenLinkphone");
            return (Criteria) this;
        }

        public Criteria andGardenLinkphoneNotLike(String value) {
            addCriterion("garden_linkphone not like", value, "gardenLinkphone");
            return (Criteria) this;
        }

        public Criteria andGardenLinkphoneIn(List<String> values) {
            addCriterion("garden_linkphone in", values, "gardenLinkphone");
            return (Criteria) this;
        }

        public Criteria andGardenLinkphoneNotIn(List<String> values) {
            addCriterion("garden_linkphone not in", values, "gardenLinkphone");
            return (Criteria) this;
        }

        public Criteria andGardenLinkphoneBetween(String value1, String value2) {
            addCriterion("garden_linkphone between", value1, value2, "gardenLinkphone");
            return (Criteria) this;
        }

        public Criteria andGardenLinkphoneNotBetween(String value1, String value2) {
            addCriterion("garden_linkphone not between", value1, value2, "gardenLinkphone");
            return (Criteria) this;
        }

        public Criteria andGardenLinkfaxIsNull() {
            addCriterion("garden_linkfax is null");
            return (Criteria) this;
        }

        public Criteria andGardenLinkfaxIsNotNull() {
            addCriterion("garden_linkfax is not null");
            return (Criteria) this;
        }

        public Criteria andGardenLinkfaxEqualTo(String value) {
            addCriterion("garden_linkfax =", value, "gardenLinkfax");
            return (Criteria) this;
        }

        public Criteria andGardenLinkfaxNotEqualTo(String value) {
            addCriterion("garden_linkfax <>", value, "gardenLinkfax");
            return (Criteria) this;
        }

        public Criteria andGardenLinkfaxGreaterThan(String value) {
            addCriterion("garden_linkfax >", value, "gardenLinkfax");
            return (Criteria) this;
        }

        public Criteria andGardenLinkfaxGreaterThanOrEqualTo(String value) {
            addCriterion("garden_linkfax >=", value, "gardenLinkfax");
            return (Criteria) this;
        }

        public Criteria andGardenLinkfaxLessThan(String value) {
            addCriterion("garden_linkfax <", value, "gardenLinkfax");
            return (Criteria) this;
        }

        public Criteria andGardenLinkfaxLessThanOrEqualTo(String value) {
            addCriterion("garden_linkfax <=", value, "gardenLinkfax");
            return (Criteria) this;
        }

        public Criteria andGardenLinkfaxLike(String value) {
            addCriterion("garden_linkfax like", value, "gardenLinkfax");
            return (Criteria) this;
        }

        public Criteria andGardenLinkfaxNotLike(String value) {
            addCriterion("garden_linkfax not like", value, "gardenLinkfax");
            return (Criteria) this;
        }

        public Criteria andGardenLinkfaxIn(List<String> values) {
            addCriterion("garden_linkfax in", values, "gardenLinkfax");
            return (Criteria) this;
        }

        public Criteria andGardenLinkfaxNotIn(List<String> values) {
            addCriterion("garden_linkfax not in", values, "gardenLinkfax");
            return (Criteria) this;
        }

        public Criteria andGardenLinkfaxBetween(String value1, String value2) {
            addCriterion("garden_linkfax between", value1, value2, "gardenLinkfax");
            return (Criteria) this;
        }

        public Criteria andGardenLinkfaxNotBetween(String value1, String value2) {
            addCriterion("garden_linkfax not between", value1, value2, "gardenLinkfax");
            return (Criteria) this;
        }

        public Criteria andGardenLinkemailIsNull() {
            addCriterion("garden_linkemail is null");
            return (Criteria) this;
        }

        public Criteria andGardenLinkemailIsNotNull() {
            addCriterion("garden_linkemail is not null");
            return (Criteria) this;
        }

        public Criteria andGardenLinkemailEqualTo(String value) {
            addCriterion("garden_linkemail =", value, "gardenLinkemail");
            return (Criteria) this;
        }

        public Criteria andGardenLinkemailNotEqualTo(String value) {
            addCriterion("garden_linkemail <>", value, "gardenLinkemail");
            return (Criteria) this;
        }

        public Criteria andGardenLinkemailGreaterThan(String value) {
            addCriterion("garden_linkemail >", value, "gardenLinkemail");
            return (Criteria) this;
        }

        public Criteria andGardenLinkemailGreaterThanOrEqualTo(String value) {
            addCriterion("garden_linkemail >=", value, "gardenLinkemail");
            return (Criteria) this;
        }

        public Criteria andGardenLinkemailLessThan(String value) {
            addCriterion("garden_linkemail <", value, "gardenLinkemail");
            return (Criteria) this;
        }

        public Criteria andGardenLinkemailLessThanOrEqualTo(String value) {
            addCriterion("garden_linkemail <=", value, "gardenLinkemail");
            return (Criteria) this;
        }

        public Criteria andGardenLinkemailLike(String value) {
            addCriterion("garden_linkemail like", value, "gardenLinkemail");
            return (Criteria) this;
        }

        public Criteria andGardenLinkemailNotLike(String value) {
            addCriterion("garden_linkemail not like", value, "gardenLinkemail");
            return (Criteria) this;
        }

        public Criteria andGardenLinkemailIn(List<String> values) {
            addCriterion("garden_linkemail in", values, "gardenLinkemail");
            return (Criteria) this;
        }

        public Criteria andGardenLinkemailNotIn(List<String> values) {
            addCriterion("garden_linkemail not in", values, "gardenLinkemail");
            return (Criteria) this;
        }

        public Criteria andGardenLinkemailBetween(String value1, String value2) {
            addCriterion("garden_linkemail between", value1, value2, "gardenLinkemail");
            return (Criteria) this;
        }

        public Criteria andGardenLinkemailNotBetween(String value1, String value2) {
            addCriterion("garden_linkemail not between", value1, value2, "gardenLinkemail");
            return (Criteria) this;
        }

        public Criteria andGardenHeadcountIsNull() {
            addCriterion("garden_headcount is null");
            return (Criteria) this;
        }

        public Criteria andGardenHeadcountIsNotNull() {
            addCriterion("garden_headcount is not null");
            return (Criteria) this;
        }

        public Criteria andGardenHeadcountEqualTo(Integer value) {
            addCriterion("garden_headcount =", value, "gardenHeadcount");
            return (Criteria) this;
        }

        public Criteria andGardenHeadcountNotEqualTo(Integer value) {
            addCriterion("garden_headcount <>", value, "gardenHeadcount");
            return (Criteria) this;
        }

        public Criteria andGardenHeadcountGreaterThan(Integer value) {
            addCriterion("garden_headcount >", value, "gardenHeadcount");
            return (Criteria) this;
        }

        public Criteria andGardenHeadcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("garden_headcount >=", value, "gardenHeadcount");
            return (Criteria) this;
        }

        public Criteria andGardenHeadcountLessThan(Integer value) {
            addCriterion("garden_headcount <", value, "gardenHeadcount");
            return (Criteria) this;
        }

        public Criteria andGardenHeadcountLessThanOrEqualTo(Integer value) {
            addCriterion("garden_headcount <=", value, "gardenHeadcount");
            return (Criteria) this;
        }

        public Criteria andGardenHeadcountIn(List<Integer> values) {
            addCriterion("garden_headcount in", values, "gardenHeadcount");
            return (Criteria) this;
        }

        public Criteria andGardenHeadcountNotIn(List<Integer> values) {
            addCriterion("garden_headcount not in", values, "gardenHeadcount");
            return (Criteria) this;
        }

        public Criteria andGardenHeadcountBetween(Integer value1, Integer value2) {
            addCriterion("garden_headcount between", value1, value2, "gardenHeadcount");
            return (Criteria) this;
        }

        public Criteria andGardenHeadcountNotBetween(Integer value1, Integer value2) {
            addCriterion("garden_headcount not between", value1, value2, "gardenHeadcount");
            return (Criteria) this;
        }

        public Criteria andGardenPartnerIsNull() {
            addCriterion("garden_partner is null");
            return (Criteria) this;
        }

        public Criteria andGardenPartnerIsNotNull() {
            addCriterion("garden_partner is not null");
            return (Criteria) this;
        }

        public Criteria andGardenPartnerEqualTo(String value) {
            addCriterion("garden_partner =", value, "gardenPartner");
            return (Criteria) this;
        }

        public Criteria andGardenPartnerNotEqualTo(String value) {
            addCriterion("garden_partner <>", value, "gardenPartner");
            return (Criteria) this;
        }

        public Criteria andGardenPartnerGreaterThan(String value) {
            addCriterion("garden_partner >", value, "gardenPartner");
            return (Criteria) this;
        }

        public Criteria andGardenPartnerGreaterThanOrEqualTo(String value) {
            addCriterion("garden_partner >=", value, "gardenPartner");
            return (Criteria) this;
        }

        public Criteria andGardenPartnerLessThan(String value) {
            addCriterion("garden_partner <", value, "gardenPartner");
            return (Criteria) this;
        }

        public Criteria andGardenPartnerLessThanOrEqualTo(String value) {
            addCriterion("garden_partner <=", value, "gardenPartner");
            return (Criteria) this;
        }

        public Criteria andGardenPartnerLike(String value) {
            addCriterion("garden_partner like", value, "gardenPartner");
            return (Criteria) this;
        }

        public Criteria andGardenPartnerNotLike(String value) {
            addCriterion("garden_partner not like", value, "gardenPartner");
            return (Criteria) this;
        }

        public Criteria andGardenPartnerIn(List<String> values) {
            addCriterion("garden_partner in", values, "gardenPartner");
            return (Criteria) this;
        }

        public Criteria andGardenPartnerNotIn(List<String> values) {
            addCriterion("garden_partner not in", values, "gardenPartner");
            return (Criteria) this;
        }

        public Criteria andGardenPartnerBetween(String value1, String value2) {
            addCriterion("garden_partner between", value1, value2, "gardenPartner");
            return (Criteria) this;
        }

        public Criteria andGardenPartnerNotBetween(String value1, String value2) {
            addCriterion("garden_partner not between", value1, value2, "gardenPartner");
            return (Criteria) this;
        }

        public Criteria andGardenDrmaIsNull() {
            addCriterion("garden_drma is null");
            return (Criteria) this;
        }

        public Criteria andGardenDrmaIsNotNull() {
            addCriterion("garden_drma is not null");
            return (Criteria) this;
        }

        public Criteria andGardenDrmaEqualTo(Integer value) {
            addCriterion("garden_drma =", value, "gardenDrma");
            return (Criteria) this;
        }

        public Criteria andGardenDrmaNotEqualTo(Integer value) {
            addCriterion("garden_drma <>", value, "gardenDrma");
            return (Criteria) this;
        }

        public Criteria andGardenDrmaGreaterThan(Integer value) {
            addCriterion("garden_drma >", value, "gardenDrma");
            return (Criteria) this;
        }

        public Criteria andGardenDrmaGreaterThanOrEqualTo(Integer value) {
            addCriterion("garden_drma >=", value, "gardenDrma");
            return (Criteria) this;
        }

        public Criteria andGardenDrmaLessThan(Integer value) {
            addCriterion("garden_drma <", value, "gardenDrma");
            return (Criteria) this;
        }

        public Criteria andGardenDrmaLessThanOrEqualTo(Integer value) {
            addCriterion("garden_drma <=", value, "gardenDrma");
            return (Criteria) this;
        }

        public Criteria andGardenDrmaIn(List<Integer> values) {
            addCriterion("garden_drma in", values, "gardenDrma");
            return (Criteria) this;
        }

        public Criteria andGardenDrmaNotIn(List<Integer> values) {
            addCriterion("garden_drma not in", values, "gardenDrma");
            return (Criteria) this;
        }

        public Criteria andGardenDrmaBetween(Integer value1, Integer value2) {
            addCriterion("garden_drma between", value1, value2, "gardenDrma");
            return (Criteria) this;
        }

        public Criteria andGardenDrmaNotBetween(Integer value1, Integer value2) {
            addCriterion("garden_drma not between", value1, value2, "gardenDrma");
            return (Criteria) this;
        }

        public Criteria andGardenUndergraduateIsNull() {
            addCriterion("garden_undergraduate is null");
            return (Criteria) this;
        }

        public Criteria andGardenUndergraduateIsNotNull() {
            addCriterion("garden_undergraduate is not null");
            return (Criteria) this;
        }

        public Criteria andGardenUndergraduateEqualTo(Integer value) {
            addCriterion("garden_undergraduate =", value, "gardenUndergraduate");
            return (Criteria) this;
        }

        public Criteria andGardenUndergraduateNotEqualTo(Integer value) {
            addCriterion("garden_undergraduate <>", value, "gardenUndergraduate");
            return (Criteria) this;
        }

        public Criteria andGardenUndergraduateGreaterThan(Integer value) {
            addCriterion("garden_undergraduate >", value, "gardenUndergraduate");
            return (Criteria) this;
        }

        public Criteria andGardenUndergraduateGreaterThanOrEqualTo(Integer value) {
            addCriterion("garden_undergraduate >=", value, "gardenUndergraduate");
            return (Criteria) this;
        }

        public Criteria andGardenUndergraduateLessThan(Integer value) {
            addCriterion("garden_undergraduate <", value, "gardenUndergraduate");
            return (Criteria) this;
        }

        public Criteria andGardenUndergraduateLessThanOrEqualTo(Integer value) {
            addCriterion("garden_undergraduate <=", value, "gardenUndergraduate");
            return (Criteria) this;
        }

        public Criteria andGardenUndergraduateIn(List<Integer> values) {
            addCriterion("garden_undergraduate in", values, "gardenUndergraduate");
            return (Criteria) this;
        }

        public Criteria andGardenUndergraduateNotIn(List<Integer> values) {
            addCriterion("garden_undergraduate not in", values, "gardenUndergraduate");
            return (Criteria) this;
        }

        public Criteria andGardenUndergraduateBetween(Integer value1, Integer value2) {
            addCriterion("garden_undergraduate between", value1, value2, "gardenUndergraduate");
            return (Criteria) this;
        }

        public Criteria andGardenUndergraduateNotBetween(Integer value1, Integer value2) {
            addCriterion("garden_undergraduate not between", value1, value2, "gardenUndergraduate");
            return (Criteria) this;
        }

        public Criteria andGardenLawcareerIsNull() {
            addCriterion("garden_lawcareer is null");
            return (Criteria) this;
        }

        public Criteria andGardenLawcareerIsNotNull() {
            addCriterion("garden_lawcareer is not null");
            return (Criteria) this;
        }

        public Criteria andGardenLawcareerEqualTo(String value) {
            addCriterion("garden_lawcareer =", value, "gardenLawcareer");
            return (Criteria) this;
        }

        public Criteria andGardenLawcareerNotEqualTo(String value) {
            addCriterion("garden_lawcareer <>", value, "gardenLawcareer");
            return (Criteria) this;
        }

        public Criteria andGardenLawcareerGreaterThan(String value) {
            addCriterion("garden_lawcareer >", value, "gardenLawcareer");
            return (Criteria) this;
        }

        public Criteria andGardenLawcareerGreaterThanOrEqualTo(String value) {
            addCriterion("garden_lawcareer >=", value, "gardenLawcareer");
            return (Criteria) this;
        }

        public Criteria andGardenLawcareerLessThan(String value) {
            addCriterion("garden_lawcareer <", value, "gardenLawcareer");
            return (Criteria) this;
        }

        public Criteria andGardenLawcareerLessThanOrEqualTo(String value) {
            addCriterion("garden_lawcareer <=", value, "gardenLawcareer");
            return (Criteria) this;
        }

        public Criteria andGardenLawcareerLike(String value) {
            addCriterion("garden_lawcareer like", value, "gardenLawcareer");
            return (Criteria) this;
        }

        public Criteria andGardenLawcareerNotLike(String value) {
            addCriterion("garden_lawcareer not like", value, "gardenLawcareer");
            return (Criteria) this;
        }

        public Criteria andGardenLawcareerIn(List<String> values) {
            addCriterion("garden_lawcareer in", values, "gardenLawcareer");
            return (Criteria) this;
        }

        public Criteria andGardenLawcareerNotIn(List<String> values) {
            addCriterion("garden_lawcareer not in", values, "gardenLawcareer");
            return (Criteria) this;
        }

        public Criteria andGardenLawcareerBetween(String value1, String value2) {
            addCriterion("garden_lawcareer between", value1, value2, "gardenLawcareer");
            return (Criteria) this;
        }

        public Criteria andGardenLawcareerNotBetween(String value1, String value2) {
            addCriterion("garden_lawcareer not between", value1, value2, "gardenLawcareer");
            return (Criteria) this;
        }

        public Criteria andGardenCheckIsNull() {
            addCriterion("garden_check is null");
            return (Criteria) this;
        }

        public Criteria andGardenCheckIsNotNull() {
            addCriterion("garden_check is not null");
            return (Criteria) this;
        }

        public Criteria andGardenCheckEqualTo(Integer value) {
            addCriterion("garden_check =", value, "gardenCheck");
            return (Criteria) this;
        }

        public Criteria andGardenCheckNotEqualTo(Integer value) {
            addCriterion("garden_check <>", value, "gardenCheck");
            return (Criteria) this;
        }

        public Criteria andGardenCheckGreaterThan(Integer value) {
            addCriterion("garden_check >", value, "gardenCheck");
            return (Criteria) this;
        }

        public Criteria andGardenCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("garden_check >=", value, "gardenCheck");
            return (Criteria) this;
        }

        public Criteria andGardenCheckLessThan(Integer value) {
            addCriterion("garden_check <", value, "gardenCheck");
            return (Criteria) this;
        }

        public Criteria andGardenCheckLessThanOrEqualTo(Integer value) {
            addCriterion("garden_check <=", value, "gardenCheck");
            return (Criteria) this;
        }

        public Criteria andGardenCheckIn(List<Integer> values) {
            addCriterion("garden_check in", values, "gardenCheck");
            return (Criteria) this;
        }

        public Criteria andGardenCheckNotIn(List<Integer> values) {
            addCriterion("garden_check not in", values, "gardenCheck");
            return (Criteria) this;
        }

        public Criteria andGardenCheckBetween(Integer value1, Integer value2) {
            addCriterion("garden_check between", value1, value2, "gardenCheck");
            return (Criteria) this;
        }

        public Criteria andGardenCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("garden_check not between", value1, value2, "gardenCheck");
            return (Criteria) this;
        }

        public Criteria andGardenCreateIsNull() {
            addCriterion("garden_create is null");
            return (Criteria) this;
        }

        public Criteria andGardenCreateIsNotNull() {
            addCriterion("garden_create is not null");
            return (Criteria) this;
        }

        public Criteria andGardenCreateEqualTo(Date value) {
            addCriterionForJDBCDate("garden_create =", value, "gardenCreate");
            return (Criteria) this;
        }

        public Criteria andGardenCreateNotEqualTo(Date value) {
            addCriterionForJDBCDate("garden_create <>", value, "gardenCreate");
            return (Criteria) this;
        }

        public Criteria andGardenCreateGreaterThan(Date value) {
            addCriterionForJDBCDate("garden_create >", value, "gardenCreate");
            return (Criteria) this;
        }

        public Criteria andGardenCreateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("garden_create >=", value, "gardenCreate");
            return (Criteria) this;
        }

        public Criteria andGardenCreateLessThan(Date value) {
            addCriterionForJDBCDate("garden_create <", value, "gardenCreate");
            return (Criteria) this;
        }

        public Criteria andGardenCreateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("garden_create <=", value, "gardenCreate");
            return (Criteria) this;
        }

        public Criteria andGardenCreateIn(List<Date> values) {
            addCriterionForJDBCDate("garden_create in", values, "gardenCreate");
            return (Criteria) this;
        }

        public Criteria andGardenCreateNotIn(List<Date> values) {
            addCriterionForJDBCDate("garden_create not in", values, "gardenCreate");
            return (Criteria) this;
        }

        public Criteria andGardenCreateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("garden_create between", value1, value2, "gardenCreate");
            return (Criteria) this;
        }

        public Criteria andGardenCreateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("garden_create not between", value1, value2, "gardenCreate");
            return (Criteria) this;
        }

        public Criteria andGardenUpdateIsNull() {
            addCriterion("garden_update is null");
            return (Criteria) this;
        }

        public Criteria andGardenUpdateIsNotNull() {
            addCriterion("garden_update is not null");
            return (Criteria) this;
        }

        public Criteria andGardenUpdateEqualTo(Date value) {
            addCriterionForJDBCDate("garden_update =", value, "gardenUpdate");
            return (Criteria) this;
        }

        public Criteria andGardenUpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("garden_update <>", value, "gardenUpdate");
            return (Criteria) this;
        }

        public Criteria andGardenUpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("garden_update >", value, "gardenUpdate");
            return (Criteria) this;
        }

        public Criteria andGardenUpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("garden_update >=", value, "gardenUpdate");
            return (Criteria) this;
        }

        public Criteria andGardenUpdateLessThan(Date value) {
            addCriterionForJDBCDate("garden_update <", value, "gardenUpdate");
            return (Criteria) this;
        }

        public Criteria andGardenUpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("garden_update <=", value, "gardenUpdate");
            return (Criteria) this;
        }

        public Criteria andGardenUpdateIn(List<Date> values) {
            addCriterionForJDBCDate("garden_update in", values, "gardenUpdate");
            return (Criteria) this;
        }

        public Criteria andGardenUpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("garden_update not in", values, "gardenUpdate");
            return (Criteria) this;
        }

        public Criteria andGardenUpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("garden_update between", value1, value2, "gardenUpdate");
            return (Criteria) this;
        }

        public Criteria andGardenUpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("garden_update not between", value1, value2, "gardenUpdate");
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