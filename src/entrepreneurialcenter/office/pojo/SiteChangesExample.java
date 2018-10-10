package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SiteChangesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SiteChangesExample() {
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

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Integer value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Integer value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Integer value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Integer value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Integer> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Integer> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Integer value1, Integer value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteCompanyIsNull() {
            addCriterion("site_company is null");
            return (Criteria) this;
        }

        public Criteria andSiteCompanyIsNotNull() {
            addCriterion("site_company is not null");
            return (Criteria) this;
        }

        public Criteria andSiteCompanyEqualTo(String value) {
            addCriterion("site_company =", value, "siteCompany");
            return (Criteria) this;
        }

        public Criteria andSiteCompanyNotEqualTo(String value) {
            addCriterion("site_company <>", value, "siteCompany");
            return (Criteria) this;
        }

        public Criteria andSiteCompanyGreaterThan(String value) {
            addCriterion("site_company >", value, "siteCompany");
            return (Criteria) this;
        }

        public Criteria andSiteCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("site_company >=", value, "siteCompany");
            return (Criteria) this;
        }

        public Criteria andSiteCompanyLessThan(String value) {
            addCriterion("site_company <", value, "siteCompany");
            return (Criteria) this;
        }

        public Criteria andSiteCompanyLessThanOrEqualTo(String value) {
            addCriterion("site_company <=", value, "siteCompany");
            return (Criteria) this;
        }

        public Criteria andSiteCompanyLike(String value) {
            addCriterion("site_company like", value, "siteCompany");
            return (Criteria) this;
        }

        public Criteria andSiteCompanyNotLike(String value) {
            addCriterion("site_company not like", value, "siteCompany");
            return (Criteria) this;
        }

        public Criteria andSiteCompanyIn(List<String> values) {
            addCriterion("site_company in", values, "siteCompany");
            return (Criteria) this;
        }

        public Criteria andSiteCompanyNotIn(List<String> values) {
            addCriterion("site_company not in", values, "siteCompany");
            return (Criteria) this;
        }

        public Criteria andSiteCompanyBetween(String value1, String value2) {
            addCriterion("site_company between", value1, value2, "siteCompany");
            return (Criteria) this;
        }

        public Criteria andSiteCompanyNotBetween(String value1, String value2) {
            addCriterion("site_company not between", value1, value2, "siteCompany");
            return (Criteria) this;
        }

        public Criteria andSiteGardenIsNull() {
            addCriterion("site_garden is null");
            return (Criteria) this;
        }

        public Criteria andSiteGardenIsNotNull() {
            addCriterion("site_garden is not null");
            return (Criteria) this;
        }

        public Criteria andSiteGardenEqualTo(String value) {
            addCriterion("site_garden =", value, "siteGarden");
            return (Criteria) this;
        }

        public Criteria andSiteGardenNotEqualTo(String value) {
            addCriterion("site_garden <>", value, "siteGarden");
            return (Criteria) this;
        }

        public Criteria andSiteGardenGreaterThan(String value) {
            addCriterion("site_garden >", value, "siteGarden");
            return (Criteria) this;
        }

        public Criteria andSiteGardenGreaterThanOrEqualTo(String value) {
            addCriterion("site_garden >=", value, "siteGarden");
            return (Criteria) this;
        }

        public Criteria andSiteGardenLessThan(String value) {
            addCriterion("site_garden <", value, "siteGarden");
            return (Criteria) this;
        }

        public Criteria andSiteGardenLessThanOrEqualTo(String value) {
            addCriterion("site_garden <=", value, "siteGarden");
            return (Criteria) this;
        }

        public Criteria andSiteGardenLike(String value) {
            addCriterion("site_garden like", value, "siteGarden");
            return (Criteria) this;
        }

        public Criteria andSiteGardenNotLike(String value) {
            addCriterion("site_garden not like", value, "siteGarden");
            return (Criteria) this;
        }

        public Criteria andSiteGardenIn(List<String> values) {
            addCriterion("site_garden in", values, "siteGarden");
            return (Criteria) this;
        }

        public Criteria andSiteGardenNotIn(List<String> values) {
            addCriterion("site_garden not in", values, "siteGarden");
            return (Criteria) this;
        }

        public Criteria andSiteGardenBetween(String value1, String value2) {
            addCriterion("site_garden between", value1, value2, "siteGarden");
            return (Criteria) this;
        }

        public Criteria andSiteGardenNotBetween(String value1, String value2) {
            addCriterion("site_garden not between", value1, value2, "siteGarden");
            return (Criteria) this;
        }

        public Criteria andSiteNumberIsNull() {
            addCriterion("site_number is null");
            return (Criteria) this;
        }

        public Criteria andSiteNumberIsNotNull() {
            addCriterion("site_number is not null");
            return (Criteria) this;
        }

        public Criteria andSiteNumberEqualTo(String value) {
            addCriterion("site_number =", value, "siteNumber");
            return (Criteria) this;
        }

        public Criteria andSiteNumberNotEqualTo(String value) {
            addCriterion("site_number <>", value, "siteNumber");
            return (Criteria) this;
        }

        public Criteria andSiteNumberGreaterThan(String value) {
            addCriterion("site_number >", value, "siteNumber");
            return (Criteria) this;
        }

        public Criteria andSiteNumberGreaterThanOrEqualTo(String value) {
            addCriterion("site_number >=", value, "siteNumber");
            return (Criteria) this;
        }

        public Criteria andSiteNumberLessThan(String value) {
            addCriterion("site_number <", value, "siteNumber");
            return (Criteria) this;
        }

        public Criteria andSiteNumberLessThanOrEqualTo(String value) {
            addCriterion("site_number <=", value, "siteNumber");
            return (Criteria) this;
        }

        public Criteria andSiteNumberLike(String value) {
            addCriterion("site_number like", value, "siteNumber");
            return (Criteria) this;
        }

        public Criteria andSiteNumberNotLike(String value) {
            addCriterion("site_number not like", value, "siteNumber");
            return (Criteria) this;
        }

        public Criteria andSiteNumberIn(List<String> values) {
            addCriterion("site_number in", values, "siteNumber");
            return (Criteria) this;
        }

        public Criteria andSiteNumberNotIn(List<String> values) {
            addCriterion("site_number not in", values, "siteNumber");
            return (Criteria) this;
        }

        public Criteria andSiteNumberBetween(String value1, String value2) {
            addCriterion("site_number between", value1, value2, "siteNumber");
            return (Criteria) this;
        }

        public Criteria andSiteNumberNotBetween(String value1, String value2) {
            addCriterion("site_number not between", value1, value2, "siteNumber");
            return (Criteria) this;
        }

        public Criteria andSiteAreaIsNull() {
            addCriterion("site_area is null");
            return (Criteria) this;
        }

        public Criteria andSiteAreaIsNotNull() {
            addCriterion("site_area is not null");
            return (Criteria) this;
        }

        public Criteria andSiteAreaEqualTo(Double value) {
            addCriterion("site_area =", value, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaNotEqualTo(Double value) {
            addCriterion("site_area <>", value, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaGreaterThan(Double value) {
            addCriterion("site_area >", value, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("site_area >=", value, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaLessThan(Double value) {
            addCriterion("site_area <", value, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaLessThanOrEqualTo(Double value) {
            addCriterion("site_area <=", value, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaIn(List<Double> values) {
            addCriterion("site_area in", values, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaNotIn(List<Double> values) {
            addCriterion("site_area not in", values, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaBetween(Double value1, Double value2) {
            addCriterion("site_area between", value1, value2, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaNotBetween(Double value1, Double value2) {
            addCriterion("site_area not between", value1, value2, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteDateIsNull() {
            addCriterion("site_date is null");
            return (Criteria) this;
        }

        public Criteria andSiteDateIsNotNull() {
            addCriterion("site_date is not null");
            return (Criteria) this;
        }

        public Criteria andSiteDateEqualTo(Date value) {
            addCriterionForJDBCDate("site_date =", value, "siteDate");
            return (Criteria) this;
        }

        public Criteria andSiteDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("site_date <>", value, "siteDate");
            return (Criteria) this;
        }

        public Criteria andSiteDateGreaterThan(Date value) {
            addCriterionForJDBCDate("site_date >", value, "siteDate");
            return (Criteria) this;
        }

        public Criteria andSiteDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("site_date >=", value, "siteDate");
            return (Criteria) this;
        }

        public Criteria andSiteDateLessThan(Date value) {
            addCriterionForJDBCDate("site_date <", value, "siteDate");
            return (Criteria) this;
        }

        public Criteria andSiteDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("site_date <=", value, "siteDate");
            return (Criteria) this;
        }

        public Criteria andSiteDateIn(List<Date> values) {
            addCriterionForJDBCDate("site_date in", values, "siteDate");
            return (Criteria) this;
        }

        public Criteria andSiteDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("site_date not in", values, "siteDate");
            return (Criteria) this;
        }

        public Criteria andSiteDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("site_date between", value1, value2, "siteDate");
            return (Criteria) this;
        }

        public Criteria andSiteDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("site_date not between", value1, value2, "siteDate");
            return (Criteria) this;
        }

        public Criteria andSiteApplyareaIsNull() {
            addCriterion("site_applyarea is null");
            return (Criteria) this;
        }

        public Criteria andSiteApplyareaIsNotNull() {
            addCriterion("site_applyarea is not null");
            return (Criteria) this;
        }

        public Criteria andSiteApplyareaEqualTo(Double value) {
            addCriterion("site_applyarea =", value, "siteApplyarea");
            return (Criteria) this;
        }

        public Criteria andSiteApplyareaNotEqualTo(Double value) {
            addCriterion("site_applyarea <>", value, "siteApplyarea");
            return (Criteria) this;
        }

        public Criteria andSiteApplyareaGreaterThan(Double value) {
            addCriterion("site_applyarea >", value, "siteApplyarea");
            return (Criteria) this;
        }

        public Criteria andSiteApplyareaGreaterThanOrEqualTo(Double value) {
            addCriterion("site_applyarea >=", value, "siteApplyarea");
            return (Criteria) this;
        }

        public Criteria andSiteApplyareaLessThan(Double value) {
            addCriterion("site_applyarea <", value, "siteApplyarea");
            return (Criteria) this;
        }

        public Criteria andSiteApplyareaLessThanOrEqualTo(Double value) {
            addCriterion("site_applyarea <=", value, "siteApplyarea");
            return (Criteria) this;
        }

        public Criteria andSiteApplyareaIn(List<Double> values) {
            addCriterion("site_applyarea in", values, "siteApplyarea");
            return (Criteria) this;
        }

        public Criteria andSiteApplyareaNotIn(List<Double> values) {
            addCriterion("site_applyarea not in", values, "siteApplyarea");
            return (Criteria) this;
        }

        public Criteria andSiteApplyareaBetween(Double value1, Double value2) {
            addCriterion("site_applyarea between", value1, value2, "siteApplyarea");
            return (Criteria) this;
        }

        public Criteria andSiteApplyareaNotBetween(Double value1, Double value2) {
            addCriterion("site_applyarea not between", value1, value2, "siteApplyarea");
            return (Criteria) this;
        }

        public Criteria andSiteProductIsNull() {
            addCriterion("site_product is null");
            return (Criteria) this;
        }

        public Criteria andSiteProductIsNotNull() {
            addCriterion("site_product is not null");
            return (Criteria) this;
        }

        public Criteria andSiteProductEqualTo(String value) {
            addCriterion("site_product =", value, "siteProduct");
            return (Criteria) this;
        }

        public Criteria andSiteProductNotEqualTo(String value) {
            addCriterion("site_product <>", value, "siteProduct");
            return (Criteria) this;
        }

        public Criteria andSiteProductGreaterThan(String value) {
            addCriterion("site_product >", value, "siteProduct");
            return (Criteria) this;
        }

        public Criteria andSiteProductGreaterThanOrEqualTo(String value) {
            addCriterion("site_product >=", value, "siteProduct");
            return (Criteria) this;
        }

        public Criteria andSiteProductLessThan(String value) {
            addCriterion("site_product <", value, "siteProduct");
            return (Criteria) this;
        }

        public Criteria andSiteProductLessThanOrEqualTo(String value) {
            addCriterion("site_product <=", value, "siteProduct");
            return (Criteria) this;
        }

        public Criteria andSiteProductLike(String value) {
            addCriterion("site_product like", value, "siteProduct");
            return (Criteria) this;
        }

        public Criteria andSiteProductNotLike(String value) {
            addCriterion("site_product not like", value, "siteProduct");
            return (Criteria) this;
        }

        public Criteria andSiteProductIn(List<String> values) {
            addCriterion("site_product in", values, "siteProduct");
            return (Criteria) this;
        }

        public Criteria andSiteProductNotIn(List<String> values) {
            addCriterion("site_product not in", values, "siteProduct");
            return (Criteria) this;
        }

        public Criteria andSiteProductBetween(String value1, String value2) {
            addCriterion("site_product between", value1, value2, "siteProduct");
            return (Criteria) this;
        }

        public Criteria andSiteProductNotBetween(String value1, String value2) {
            addCriterion("site_product not between", value1, value2, "siteProduct");
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

        public Criteria andSiteIpIsNull() {
            addCriterion("site_ip is null");
            return (Criteria) this;
        }

        public Criteria andSiteIpIsNotNull() {
            addCriterion("site_ip is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIpEqualTo(String value) {
            addCriterion("site_ip =", value, "siteIp");
            return (Criteria) this;
        }

        public Criteria andSiteIpNotEqualTo(String value) {
            addCriterion("site_ip <>", value, "siteIp");
            return (Criteria) this;
        }

        public Criteria andSiteIpGreaterThan(String value) {
            addCriterion("site_ip >", value, "siteIp");
            return (Criteria) this;
        }

        public Criteria andSiteIpGreaterThanOrEqualTo(String value) {
            addCriterion("site_ip >=", value, "siteIp");
            return (Criteria) this;
        }

        public Criteria andSiteIpLessThan(String value) {
            addCriterion("site_ip <", value, "siteIp");
            return (Criteria) this;
        }

        public Criteria andSiteIpLessThanOrEqualTo(String value) {
            addCriterion("site_ip <=", value, "siteIp");
            return (Criteria) this;
        }

        public Criteria andSiteIpLike(String value) {
            addCriterion("site_ip like", value, "siteIp");
            return (Criteria) this;
        }

        public Criteria andSiteIpNotLike(String value) {
            addCriterion("site_ip not like", value, "siteIp");
            return (Criteria) this;
        }

        public Criteria andSiteIpIn(List<String> values) {
            addCriterion("site_ip in", values, "siteIp");
            return (Criteria) this;
        }

        public Criteria andSiteIpNotIn(List<String> values) {
            addCriterion("site_ip not in", values, "siteIp");
            return (Criteria) this;
        }

        public Criteria andSiteIpBetween(String value1, String value2) {
            addCriterion("site_ip between", value1, value2, "siteIp");
            return (Criteria) this;
        }

        public Criteria andSiteIpNotBetween(String value1, String value2) {
            addCriterion("site_ip not between", value1, value2, "siteIp");
            return (Criteria) this;
        }

        public Criteria andSiteAddressIsNull() {
            addCriterion("site_address is null");
            return (Criteria) this;
        }

        public Criteria andSiteAddressIsNotNull() {
            addCriterion("site_address is not null");
            return (Criteria) this;
        }

        public Criteria andSiteAddressEqualTo(String value) {
            addCriterion("site_address =", value, "siteAddress");
            return (Criteria) this;
        }

        public Criteria andSiteAddressNotEqualTo(String value) {
            addCriterion("site_address <>", value, "siteAddress");
            return (Criteria) this;
        }

        public Criteria andSiteAddressGreaterThan(String value) {
            addCriterion("site_address >", value, "siteAddress");
            return (Criteria) this;
        }

        public Criteria andSiteAddressGreaterThanOrEqualTo(String value) {
            addCriterion("site_address >=", value, "siteAddress");
            return (Criteria) this;
        }

        public Criteria andSiteAddressLessThan(String value) {
            addCriterion("site_address <", value, "siteAddress");
            return (Criteria) this;
        }

        public Criteria andSiteAddressLessThanOrEqualTo(String value) {
            addCriterion("site_address <=", value, "siteAddress");
            return (Criteria) this;
        }

        public Criteria andSiteAddressLike(String value) {
            addCriterion("site_address like", value, "siteAddress");
            return (Criteria) this;
        }

        public Criteria andSiteAddressNotLike(String value) {
            addCriterion("site_address not like", value, "siteAddress");
            return (Criteria) this;
        }

        public Criteria andSiteAddressIn(List<String> values) {
            addCriterion("site_address in", values, "siteAddress");
            return (Criteria) this;
        }

        public Criteria andSiteAddressNotIn(List<String> values) {
            addCriterion("site_address not in", values, "siteAddress");
            return (Criteria) this;
        }

        public Criteria andSiteAddressBetween(String value1, String value2) {
            addCriterion("site_address between", value1, value2, "siteAddress");
            return (Criteria) this;
        }

        public Criteria andSiteAddressNotBetween(String value1, String value2) {
            addCriterion("site_address not between", value1, value2, "siteAddress");
            return (Criteria) this;
        }

        public Criteria andSiteFormedIsNull() {
            addCriterion("site_formed is null");
            return (Criteria) this;
        }

        public Criteria andSiteFormedIsNotNull() {
            addCriterion("site_formed is not null");
            return (Criteria) this;
        }

        public Criteria andSiteFormedEqualTo(Date value) {
            addCriterionForJDBCDate("site_formed =", value, "siteFormed");
            return (Criteria) this;
        }

        public Criteria andSiteFormedNotEqualTo(Date value) {
            addCriterionForJDBCDate("site_formed <>", value, "siteFormed");
            return (Criteria) this;
        }

        public Criteria andSiteFormedGreaterThan(Date value) {
            addCriterionForJDBCDate("site_formed >", value, "siteFormed");
            return (Criteria) this;
        }

        public Criteria andSiteFormedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("site_formed >=", value, "siteFormed");
            return (Criteria) this;
        }

        public Criteria andSiteFormedLessThan(Date value) {
            addCriterionForJDBCDate("site_formed <", value, "siteFormed");
            return (Criteria) this;
        }

        public Criteria andSiteFormedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("site_formed <=", value, "siteFormed");
            return (Criteria) this;
        }

        public Criteria andSiteFormedIn(List<Date> values) {
            addCriterionForJDBCDate("site_formed in", values, "siteFormed");
            return (Criteria) this;
        }

        public Criteria andSiteFormedNotIn(List<Date> values) {
            addCriterionForJDBCDate("site_formed not in", values, "siteFormed");
            return (Criteria) this;
        }

        public Criteria andSiteFormedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("site_formed between", value1, value2, "siteFormed");
            return (Criteria) this;
        }

        public Criteria andSiteFormedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("site_formed not between", value1, value2, "siteFormed");
            return (Criteria) this;
        }

        public Criteria andSiteLawpersonIsNull() {
            addCriterion("site_lawperson is null");
            return (Criteria) this;
        }

        public Criteria andSiteLawpersonIsNotNull() {
            addCriterion("site_lawperson is not null");
            return (Criteria) this;
        }

        public Criteria andSiteLawpersonEqualTo(String value) {
            addCriterion("site_lawperson =", value, "siteLawperson");
            return (Criteria) this;
        }

        public Criteria andSiteLawpersonNotEqualTo(String value) {
            addCriterion("site_lawperson <>", value, "siteLawperson");
            return (Criteria) this;
        }

        public Criteria andSiteLawpersonGreaterThan(String value) {
            addCriterion("site_lawperson >", value, "siteLawperson");
            return (Criteria) this;
        }

        public Criteria andSiteLawpersonGreaterThanOrEqualTo(String value) {
            addCriterion("site_lawperson >=", value, "siteLawperson");
            return (Criteria) this;
        }

        public Criteria andSiteLawpersonLessThan(String value) {
            addCriterion("site_lawperson <", value, "siteLawperson");
            return (Criteria) this;
        }

        public Criteria andSiteLawpersonLessThanOrEqualTo(String value) {
            addCriterion("site_lawperson <=", value, "siteLawperson");
            return (Criteria) this;
        }

        public Criteria andSiteLawpersonLike(String value) {
            addCriterion("site_lawperson like", value, "siteLawperson");
            return (Criteria) this;
        }

        public Criteria andSiteLawpersonNotLike(String value) {
            addCriterion("site_lawperson not like", value, "siteLawperson");
            return (Criteria) this;
        }

        public Criteria andSiteLawpersonIn(List<String> values) {
            addCriterion("site_lawperson in", values, "siteLawperson");
            return (Criteria) this;
        }

        public Criteria andSiteLawpersonNotIn(List<String> values) {
            addCriterion("site_lawperson not in", values, "siteLawperson");
            return (Criteria) this;
        }

        public Criteria andSiteLawpersonBetween(String value1, String value2) {
            addCriterion("site_lawperson between", value1, value2, "siteLawperson");
            return (Criteria) this;
        }

        public Criteria andSiteLawpersonNotBetween(String value1, String value2) {
            addCriterion("site_lawperson not between", value1, value2, "siteLawperson");
            return (Criteria) this;
        }

        public Criteria andSiteLawphoneIsNull() {
            addCriterion("site_lawphone is null");
            return (Criteria) this;
        }

        public Criteria andSiteLawphoneIsNotNull() {
            addCriterion("site_lawphone is not null");
            return (Criteria) this;
        }

        public Criteria andSiteLawphoneEqualTo(String value) {
            addCriterion("site_lawphone =", value, "siteLawphone");
            return (Criteria) this;
        }

        public Criteria andSiteLawphoneNotEqualTo(String value) {
            addCriterion("site_lawphone <>", value, "siteLawphone");
            return (Criteria) this;
        }

        public Criteria andSiteLawphoneGreaterThan(String value) {
            addCriterion("site_lawphone >", value, "siteLawphone");
            return (Criteria) this;
        }

        public Criteria andSiteLawphoneGreaterThanOrEqualTo(String value) {
            addCriterion("site_lawphone >=", value, "siteLawphone");
            return (Criteria) this;
        }

        public Criteria andSiteLawphoneLessThan(String value) {
            addCriterion("site_lawphone <", value, "siteLawphone");
            return (Criteria) this;
        }

        public Criteria andSiteLawphoneLessThanOrEqualTo(String value) {
            addCriterion("site_lawphone <=", value, "siteLawphone");
            return (Criteria) this;
        }

        public Criteria andSiteLawphoneLike(String value) {
            addCriterion("site_lawphone like", value, "siteLawphone");
            return (Criteria) this;
        }

        public Criteria andSiteLawphoneNotLike(String value) {
            addCriterion("site_lawphone not like", value, "siteLawphone");
            return (Criteria) this;
        }

        public Criteria andSiteLawphoneIn(List<String> values) {
            addCriterion("site_lawphone in", values, "siteLawphone");
            return (Criteria) this;
        }

        public Criteria andSiteLawphoneNotIn(List<String> values) {
            addCriterion("site_lawphone not in", values, "siteLawphone");
            return (Criteria) this;
        }

        public Criteria andSiteLawphoneBetween(String value1, String value2) {
            addCriterion("site_lawphone between", value1, value2, "siteLawphone");
            return (Criteria) this;
        }

        public Criteria andSiteLawphoneNotBetween(String value1, String value2) {
            addCriterion("site_lawphone not between", value1, value2, "siteLawphone");
            return (Criteria) this;
        }

        public Criteria andSiteLawemailIsNull() {
            addCriterion("site_lawemail is null");
            return (Criteria) this;
        }

        public Criteria andSiteLawemailIsNotNull() {
            addCriterion("site_lawemail is not null");
            return (Criteria) this;
        }

        public Criteria andSiteLawemailEqualTo(String value) {
            addCriterion("site_lawemail =", value, "siteLawemail");
            return (Criteria) this;
        }

        public Criteria andSiteLawemailNotEqualTo(String value) {
            addCriterion("site_lawemail <>", value, "siteLawemail");
            return (Criteria) this;
        }

        public Criteria andSiteLawemailGreaterThan(String value) {
            addCriterion("site_lawemail >", value, "siteLawemail");
            return (Criteria) this;
        }

        public Criteria andSiteLawemailGreaterThanOrEqualTo(String value) {
            addCriterion("site_lawemail >=", value, "siteLawemail");
            return (Criteria) this;
        }

        public Criteria andSiteLawemailLessThan(String value) {
            addCriterion("site_lawemail <", value, "siteLawemail");
            return (Criteria) this;
        }

        public Criteria andSiteLawemailLessThanOrEqualTo(String value) {
            addCriterion("site_lawemail <=", value, "siteLawemail");
            return (Criteria) this;
        }

        public Criteria andSiteLawemailLike(String value) {
            addCriterion("site_lawemail like", value, "siteLawemail");
            return (Criteria) this;
        }

        public Criteria andSiteLawemailNotLike(String value) {
            addCriterion("site_lawemail not like", value, "siteLawemail");
            return (Criteria) this;
        }

        public Criteria andSiteLawemailIn(List<String> values) {
            addCriterion("site_lawemail in", values, "siteLawemail");
            return (Criteria) this;
        }

        public Criteria andSiteLawemailNotIn(List<String> values) {
            addCriterion("site_lawemail not in", values, "siteLawemail");
            return (Criteria) this;
        }

        public Criteria andSiteLawemailBetween(String value1, String value2) {
            addCriterion("site_lawemail between", value1, value2, "siteLawemail");
            return (Criteria) this;
        }

        public Criteria andSiteLawemailNotBetween(String value1, String value2) {
            addCriterion("site_lawemail not between", value1, value2, "siteLawemail");
            return (Criteria) this;
        }

        public Criteria andSiteLinknameIsNull() {
            addCriterion("site_linkname is null");
            return (Criteria) this;
        }

        public Criteria andSiteLinknameIsNotNull() {
            addCriterion("site_linkname is not null");
            return (Criteria) this;
        }

        public Criteria andSiteLinknameEqualTo(String value) {
            addCriterion("site_linkname =", value, "siteLinkname");
            return (Criteria) this;
        }

        public Criteria andSiteLinknameNotEqualTo(String value) {
            addCriterion("site_linkname <>", value, "siteLinkname");
            return (Criteria) this;
        }

        public Criteria andSiteLinknameGreaterThan(String value) {
            addCriterion("site_linkname >", value, "siteLinkname");
            return (Criteria) this;
        }

        public Criteria andSiteLinknameGreaterThanOrEqualTo(String value) {
            addCriterion("site_linkname >=", value, "siteLinkname");
            return (Criteria) this;
        }

        public Criteria andSiteLinknameLessThan(String value) {
            addCriterion("site_linkname <", value, "siteLinkname");
            return (Criteria) this;
        }

        public Criteria andSiteLinknameLessThanOrEqualTo(String value) {
            addCriterion("site_linkname <=", value, "siteLinkname");
            return (Criteria) this;
        }

        public Criteria andSiteLinknameLike(String value) {
            addCriterion("site_linkname like", value, "siteLinkname");
            return (Criteria) this;
        }

        public Criteria andSiteLinknameNotLike(String value) {
            addCriterion("site_linkname not like", value, "siteLinkname");
            return (Criteria) this;
        }

        public Criteria andSiteLinknameIn(List<String> values) {
            addCriterion("site_linkname in", values, "siteLinkname");
            return (Criteria) this;
        }

        public Criteria andSiteLinknameNotIn(List<String> values) {
            addCriterion("site_linkname not in", values, "siteLinkname");
            return (Criteria) this;
        }

        public Criteria andSiteLinknameBetween(String value1, String value2) {
            addCriterion("site_linkname between", value1, value2, "siteLinkname");
            return (Criteria) this;
        }

        public Criteria andSiteLinknameNotBetween(String value1, String value2) {
            addCriterion("site_linkname not between", value1, value2, "siteLinkname");
            return (Criteria) this;
        }

        public Criteria andSiteLinkphoneIsNull() {
            addCriterion("site_linkphone is null");
            return (Criteria) this;
        }

        public Criteria andSiteLinkphoneIsNotNull() {
            addCriterion("site_linkphone is not null");
            return (Criteria) this;
        }

        public Criteria andSiteLinkphoneEqualTo(String value) {
            addCriterion("site_linkphone =", value, "siteLinkphone");
            return (Criteria) this;
        }

        public Criteria andSiteLinkphoneNotEqualTo(String value) {
            addCriterion("site_linkphone <>", value, "siteLinkphone");
            return (Criteria) this;
        }

        public Criteria andSiteLinkphoneGreaterThan(String value) {
            addCriterion("site_linkphone >", value, "siteLinkphone");
            return (Criteria) this;
        }

        public Criteria andSiteLinkphoneGreaterThanOrEqualTo(String value) {
            addCriterion("site_linkphone >=", value, "siteLinkphone");
            return (Criteria) this;
        }

        public Criteria andSiteLinkphoneLessThan(String value) {
            addCriterion("site_linkphone <", value, "siteLinkphone");
            return (Criteria) this;
        }

        public Criteria andSiteLinkphoneLessThanOrEqualTo(String value) {
            addCriterion("site_linkphone <=", value, "siteLinkphone");
            return (Criteria) this;
        }

        public Criteria andSiteLinkphoneLike(String value) {
            addCriterion("site_linkphone like", value, "siteLinkphone");
            return (Criteria) this;
        }

        public Criteria andSiteLinkphoneNotLike(String value) {
            addCriterion("site_linkphone not like", value, "siteLinkphone");
            return (Criteria) this;
        }

        public Criteria andSiteLinkphoneIn(List<String> values) {
            addCriterion("site_linkphone in", values, "siteLinkphone");
            return (Criteria) this;
        }

        public Criteria andSiteLinkphoneNotIn(List<String> values) {
            addCriterion("site_linkphone not in", values, "siteLinkphone");
            return (Criteria) this;
        }

        public Criteria andSiteLinkphoneBetween(String value1, String value2) {
            addCriterion("site_linkphone between", value1, value2, "siteLinkphone");
            return (Criteria) this;
        }

        public Criteria andSiteLinkphoneNotBetween(String value1, String value2) {
            addCriterion("site_linkphone not between", value1, value2, "siteLinkphone");
            return (Criteria) this;
        }

        public Criteria andSiteLinkfaxIsNull() {
            addCriterion("site_linkfax is null");
            return (Criteria) this;
        }

        public Criteria andSiteLinkfaxIsNotNull() {
            addCriterion("site_linkfax is not null");
            return (Criteria) this;
        }

        public Criteria andSiteLinkfaxEqualTo(String value) {
            addCriterion("site_linkfax =", value, "siteLinkfax");
            return (Criteria) this;
        }

        public Criteria andSiteLinkfaxNotEqualTo(String value) {
            addCriterion("site_linkfax <>", value, "siteLinkfax");
            return (Criteria) this;
        }

        public Criteria andSiteLinkfaxGreaterThan(String value) {
            addCriterion("site_linkfax >", value, "siteLinkfax");
            return (Criteria) this;
        }

        public Criteria andSiteLinkfaxGreaterThanOrEqualTo(String value) {
            addCriterion("site_linkfax >=", value, "siteLinkfax");
            return (Criteria) this;
        }

        public Criteria andSiteLinkfaxLessThan(String value) {
            addCriterion("site_linkfax <", value, "siteLinkfax");
            return (Criteria) this;
        }

        public Criteria andSiteLinkfaxLessThanOrEqualTo(String value) {
            addCriterion("site_linkfax <=", value, "siteLinkfax");
            return (Criteria) this;
        }

        public Criteria andSiteLinkfaxLike(String value) {
            addCriterion("site_linkfax like", value, "siteLinkfax");
            return (Criteria) this;
        }

        public Criteria andSiteLinkfaxNotLike(String value) {
            addCriterion("site_linkfax not like", value, "siteLinkfax");
            return (Criteria) this;
        }

        public Criteria andSiteLinkfaxIn(List<String> values) {
            addCriterion("site_linkfax in", values, "siteLinkfax");
            return (Criteria) this;
        }

        public Criteria andSiteLinkfaxNotIn(List<String> values) {
            addCriterion("site_linkfax not in", values, "siteLinkfax");
            return (Criteria) this;
        }

        public Criteria andSiteLinkfaxBetween(String value1, String value2) {
            addCriterion("site_linkfax between", value1, value2, "siteLinkfax");
            return (Criteria) this;
        }

        public Criteria andSiteLinkfaxNotBetween(String value1, String value2) {
            addCriterion("site_linkfax not between", value1, value2, "siteLinkfax");
            return (Criteria) this;
        }

        public Criteria andSiteLinkemailIsNull() {
            addCriterion("site_linkemail is null");
            return (Criteria) this;
        }

        public Criteria andSiteLinkemailIsNotNull() {
            addCriterion("site_linkemail is not null");
            return (Criteria) this;
        }

        public Criteria andSiteLinkemailEqualTo(String value) {
            addCriterion("site_linkemail =", value, "siteLinkemail");
            return (Criteria) this;
        }

        public Criteria andSiteLinkemailNotEqualTo(String value) {
            addCriterion("site_linkemail <>", value, "siteLinkemail");
            return (Criteria) this;
        }

        public Criteria andSiteLinkemailGreaterThan(String value) {
            addCriterion("site_linkemail >", value, "siteLinkemail");
            return (Criteria) this;
        }

        public Criteria andSiteLinkemailGreaterThanOrEqualTo(String value) {
            addCriterion("site_linkemail >=", value, "siteLinkemail");
            return (Criteria) this;
        }

        public Criteria andSiteLinkemailLessThan(String value) {
            addCriterion("site_linkemail <", value, "siteLinkemail");
            return (Criteria) this;
        }

        public Criteria andSiteLinkemailLessThanOrEqualTo(String value) {
            addCriterion("site_linkemail <=", value, "siteLinkemail");
            return (Criteria) this;
        }

        public Criteria andSiteLinkemailLike(String value) {
            addCriterion("site_linkemail like", value, "siteLinkemail");
            return (Criteria) this;
        }

        public Criteria andSiteLinkemailNotLike(String value) {
            addCriterion("site_linkemail not like", value, "siteLinkemail");
            return (Criteria) this;
        }

        public Criteria andSiteLinkemailIn(List<String> values) {
            addCriterion("site_linkemail in", values, "siteLinkemail");
            return (Criteria) this;
        }

        public Criteria andSiteLinkemailNotIn(List<String> values) {
            addCriterion("site_linkemail not in", values, "siteLinkemail");
            return (Criteria) this;
        }

        public Criteria andSiteLinkemailBetween(String value1, String value2) {
            addCriterion("site_linkemail between", value1, value2, "siteLinkemail");
            return (Criteria) this;
        }

        public Criteria andSiteLinkemailNotBetween(String value1, String value2) {
            addCriterion("site_linkemail not between", value1, value2, "siteLinkemail");
            return (Criteria) this;
        }

        public Criteria andSiteLastsaleIsNull() {
            addCriterion("site_lastsale is null");
            return (Criteria) this;
        }

        public Criteria andSiteLastsaleIsNotNull() {
            addCriterion("site_lastsale is not null");
            return (Criteria) this;
        }

        public Criteria andSiteLastsaleEqualTo(Double value) {
            addCriterion("site_lastsale =", value, "siteLastsale");
            return (Criteria) this;
        }

        public Criteria andSiteLastsaleNotEqualTo(Double value) {
            addCriterion("site_lastsale <>", value, "siteLastsale");
            return (Criteria) this;
        }

        public Criteria andSiteLastsaleGreaterThan(Double value) {
            addCriterion("site_lastsale >", value, "siteLastsale");
            return (Criteria) this;
        }

        public Criteria andSiteLastsaleGreaterThanOrEqualTo(Double value) {
            addCriterion("site_lastsale >=", value, "siteLastsale");
            return (Criteria) this;
        }

        public Criteria andSiteLastsaleLessThan(Double value) {
            addCriterion("site_lastsale <", value, "siteLastsale");
            return (Criteria) this;
        }

        public Criteria andSiteLastsaleLessThanOrEqualTo(Double value) {
            addCriterion("site_lastsale <=", value, "siteLastsale");
            return (Criteria) this;
        }

        public Criteria andSiteLastsaleIn(List<Double> values) {
            addCriterion("site_lastsale in", values, "siteLastsale");
            return (Criteria) this;
        }

        public Criteria andSiteLastsaleNotIn(List<Double> values) {
            addCriterion("site_lastsale not in", values, "siteLastsale");
            return (Criteria) this;
        }

        public Criteria andSiteLastsaleBetween(Double value1, Double value2) {
            addCriterion("site_lastsale between", value1, value2, "siteLastsale");
            return (Criteria) this;
        }

        public Criteria andSiteLastsaleNotBetween(Double value1, Double value2) {
            addCriterion("site_lastsale not between", value1, value2, "siteLastsale");
            return (Criteria) this;
        }

        public Criteria andSiteLastratalIsNull() {
            addCriterion("site_lastratal is null");
            return (Criteria) this;
        }

        public Criteria andSiteLastratalIsNotNull() {
            addCriterion("site_lastratal is not null");
            return (Criteria) this;
        }

        public Criteria andSiteLastratalEqualTo(Double value) {
            addCriterion("site_lastratal =", value, "siteLastratal");
            return (Criteria) this;
        }

        public Criteria andSiteLastratalNotEqualTo(Double value) {
            addCriterion("site_lastratal <>", value, "siteLastratal");
            return (Criteria) this;
        }

        public Criteria andSiteLastratalGreaterThan(Double value) {
            addCriterion("site_lastratal >", value, "siteLastratal");
            return (Criteria) this;
        }

        public Criteria andSiteLastratalGreaterThanOrEqualTo(Double value) {
            addCriterion("site_lastratal >=", value, "siteLastratal");
            return (Criteria) this;
        }

        public Criteria andSiteLastratalLessThan(Double value) {
            addCriterion("site_lastratal <", value, "siteLastratal");
            return (Criteria) this;
        }

        public Criteria andSiteLastratalLessThanOrEqualTo(Double value) {
            addCriterion("site_lastratal <=", value, "siteLastratal");
            return (Criteria) this;
        }

        public Criteria andSiteLastratalIn(List<Double> values) {
            addCriterion("site_lastratal in", values, "siteLastratal");
            return (Criteria) this;
        }

        public Criteria andSiteLastratalNotIn(List<Double> values) {
            addCriterion("site_lastratal not in", values, "siteLastratal");
            return (Criteria) this;
        }

        public Criteria andSiteLastratalBetween(Double value1, Double value2) {
            addCriterion("site_lastratal between", value1, value2, "siteLastratal");
            return (Criteria) this;
        }

        public Criteria andSiteLastratalNotBetween(Double value1, Double value2) {
            addCriterion("site_lastratal not between", value1, value2, "siteLastratal");
            return (Criteria) this;
        }

        public Criteria andSiteCapitalIsNull() {
            addCriterion("site_capital is null");
            return (Criteria) this;
        }

        public Criteria andSiteCapitalIsNotNull() {
            addCriterion("site_capital is not null");
            return (Criteria) this;
        }

        public Criteria andSiteCapitalEqualTo(Double value) {
            addCriterion("site_capital =", value, "siteCapital");
            return (Criteria) this;
        }

        public Criteria andSiteCapitalNotEqualTo(Double value) {
            addCriterion("site_capital <>", value, "siteCapital");
            return (Criteria) this;
        }

        public Criteria andSiteCapitalGreaterThan(Double value) {
            addCriterion("site_capital >", value, "siteCapital");
            return (Criteria) this;
        }

        public Criteria andSiteCapitalGreaterThanOrEqualTo(Double value) {
            addCriterion("site_capital >=", value, "siteCapital");
            return (Criteria) this;
        }

        public Criteria andSiteCapitalLessThan(Double value) {
            addCriterion("site_capital <", value, "siteCapital");
            return (Criteria) this;
        }

        public Criteria andSiteCapitalLessThanOrEqualTo(Double value) {
            addCriterion("site_capital <=", value, "siteCapital");
            return (Criteria) this;
        }

        public Criteria andSiteCapitalIn(List<Double> values) {
            addCriterion("site_capital in", values, "siteCapital");
            return (Criteria) this;
        }

        public Criteria andSiteCapitalNotIn(List<Double> values) {
            addCriterion("site_capital not in", values, "siteCapital");
            return (Criteria) this;
        }

        public Criteria andSiteCapitalBetween(Double value1, Double value2) {
            addCriterion("site_capital between", value1, value2, "siteCapital");
            return (Criteria) this;
        }

        public Criteria andSiteCapitalNotBetween(Double value1, Double value2) {
            addCriterion("site_capital not between", value1, value2, "siteCapital");
            return (Criteria) this;
        }

        public Criteria andSiteYtdsaleIsNull() {
            addCriterion("site_ytdsale is null");
            return (Criteria) this;
        }

        public Criteria andSiteYtdsaleIsNotNull() {
            addCriterion("site_ytdsale is not null");
            return (Criteria) this;
        }

        public Criteria andSiteYtdsaleEqualTo(Double value) {
            addCriterion("site_ytdsale =", value, "siteYtdsale");
            return (Criteria) this;
        }

        public Criteria andSiteYtdsaleNotEqualTo(Double value) {
            addCriterion("site_ytdsale <>", value, "siteYtdsale");
            return (Criteria) this;
        }

        public Criteria andSiteYtdsaleGreaterThan(Double value) {
            addCriterion("site_ytdsale >", value, "siteYtdsale");
            return (Criteria) this;
        }

        public Criteria andSiteYtdsaleGreaterThanOrEqualTo(Double value) {
            addCriterion("site_ytdsale >=", value, "siteYtdsale");
            return (Criteria) this;
        }

        public Criteria andSiteYtdsaleLessThan(Double value) {
            addCriterion("site_ytdsale <", value, "siteYtdsale");
            return (Criteria) this;
        }

        public Criteria andSiteYtdsaleLessThanOrEqualTo(Double value) {
            addCriterion("site_ytdsale <=", value, "siteYtdsale");
            return (Criteria) this;
        }

        public Criteria andSiteYtdsaleIn(List<Double> values) {
            addCriterion("site_ytdsale in", values, "siteYtdsale");
            return (Criteria) this;
        }

        public Criteria andSiteYtdsaleNotIn(List<Double> values) {
            addCriterion("site_ytdsale not in", values, "siteYtdsale");
            return (Criteria) this;
        }

        public Criteria andSiteYtdsaleBetween(Double value1, Double value2) {
            addCriterion("site_ytdsale between", value1, value2, "siteYtdsale");
            return (Criteria) this;
        }

        public Criteria andSiteYtdsaleNotBetween(Double value1, Double value2) {
            addCriterion("site_ytdsale not between", value1, value2, "siteYtdsale");
            return (Criteria) this;
        }

        public Criteria andSiteYtdratalIsNull() {
            addCriterion("site_ytdratal is null");
            return (Criteria) this;
        }

        public Criteria andSiteYtdratalIsNotNull() {
            addCriterion("site_ytdratal is not null");
            return (Criteria) this;
        }

        public Criteria andSiteYtdratalEqualTo(Double value) {
            addCriterion("site_ytdratal =", value, "siteYtdratal");
            return (Criteria) this;
        }

        public Criteria andSiteYtdratalNotEqualTo(Double value) {
            addCriterion("site_ytdratal <>", value, "siteYtdratal");
            return (Criteria) this;
        }

        public Criteria andSiteYtdratalGreaterThan(Double value) {
            addCriterion("site_ytdratal >", value, "siteYtdratal");
            return (Criteria) this;
        }

        public Criteria andSiteYtdratalGreaterThanOrEqualTo(Double value) {
            addCriterion("site_ytdratal >=", value, "siteYtdratal");
            return (Criteria) this;
        }

        public Criteria andSiteYtdratalLessThan(Double value) {
            addCriterion("site_ytdratal <", value, "siteYtdratal");
            return (Criteria) this;
        }

        public Criteria andSiteYtdratalLessThanOrEqualTo(Double value) {
            addCriterion("site_ytdratal <=", value, "siteYtdratal");
            return (Criteria) this;
        }

        public Criteria andSiteYtdratalIn(List<Double> values) {
            addCriterion("site_ytdratal in", values, "siteYtdratal");
            return (Criteria) this;
        }

        public Criteria andSiteYtdratalNotIn(List<Double> values) {
            addCriterion("site_ytdratal not in", values, "siteYtdratal");
            return (Criteria) this;
        }

        public Criteria andSiteYtdratalBetween(Double value1, Double value2) {
            addCriterion("site_ytdratal between", value1, value2, "siteYtdratal");
            return (Criteria) this;
        }

        public Criteria andSiteYtdratalNotBetween(Double value1, Double value2) {
            addCriterion("site_ytdratal not between", value1, value2, "siteYtdratal");
            return (Criteria) this;
        }

        public Criteria andSiteHeadcountIsNull() {
            addCriterion("site_headcount is null");
            return (Criteria) this;
        }

        public Criteria andSiteHeadcountIsNotNull() {
            addCriterion("site_headcount is not null");
            return (Criteria) this;
        }

        public Criteria andSiteHeadcountEqualTo(Integer value) {
            addCriterion("site_headcount =", value, "siteHeadcount");
            return (Criteria) this;
        }

        public Criteria andSiteHeadcountNotEqualTo(Integer value) {
            addCriterion("site_headcount <>", value, "siteHeadcount");
            return (Criteria) this;
        }

        public Criteria andSiteHeadcountGreaterThan(Integer value) {
            addCriterion("site_headcount >", value, "siteHeadcount");
            return (Criteria) this;
        }

        public Criteria andSiteHeadcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_headcount >=", value, "siteHeadcount");
            return (Criteria) this;
        }

        public Criteria andSiteHeadcountLessThan(Integer value) {
            addCriterion("site_headcount <", value, "siteHeadcount");
            return (Criteria) this;
        }

        public Criteria andSiteHeadcountLessThanOrEqualTo(Integer value) {
            addCriterion("site_headcount <=", value, "siteHeadcount");
            return (Criteria) this;
        }

        public Criteria andSiteHeadcountIn(List<Integer> values) {
            addCriterion("site_headcount in", values, "siteHeadcount");
            return (Criteria) this;
        }

        public Criteria andSiteHeadcountNotIn(List<Integer> values) {
            addCriterion("site_headcount not in", values, "siteHeadcount");
            return (Criteria) this;
        }

        public Criteria andSiteHeadcountBetween(Integer value1, Integer value2) {
            addCriterion("site_headcount between", value1, value2, "siteHeadcount");
            return (Criteria) this;
        }

        public Criteria andSiteHeadcountNotBetween(Integer value1, Integer value2) {
            addCriterion("site_headcount not between", value1, value2, "siteHeadcount");
            return (Criteria) this;
        }

        public Criteria andSiteDrmaIsNull() {
            addCriterion("site_drma is null");
            return (Criteria) this;
        }

        public Criteria andSiteDrmaIsNotNull() {
            addCriterion("site_drma is not null");
            return (Criteria) this;
        }

        public Criteria andSiteDrmaEqualTo(Integer value) {
            addCriterion("site_drma =", value, "siteDrma");
            return (Criteria) this;
        }

        public Criteria andSiteDrmaNotEqualTo(Integer value) {
            addCriterion("site_drma <>", value, "siteDrma");
            return (Criteria) this;
        }

        public Criteria andSiteDrmaGreaterThan(Integer value) {
            addCriterion("site_drma >", value, "siteDrma");
            return (Criteria) this;
        }

        public Criteria andSiteDrmaGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_drma >=", value, "siteDrma");
            return (Criteria) this;
        }

        public Criteria andSiteDrmaLessThan(Integer value) {
            addCriterion("site_drma <", value, "siteDrma");
            return (Criteria) this;
        }

        public Criteria andSiteDrmaLessThanOrEqualTo(Integer value) {
            addCriterion("site_drma <=", value, "siteDrma");
            return (Criteria) this;
        }

        public Criteria andSiteDrmaIn(List<Integer> values) {
            addCriterion("site_drma in", values, "siteDrma");
            return (Criteria) this;
        }

        public Criteria andSiteDrmaNotIn(List<Integer> values) {
            addCriterion("site_drma not in", values, "siteDrma");
            return (Criteria) this;
        }

        public Criteria andSiteDrmaBetween(Integer value1, Integer value2) {
            addCriterion("site_drma between", value1, value2, "siteDrma");
            return (Criteria) this;
        }

        public Criteria andSiteDrmaNotBetween(Integer value1, Integer value2) {
            addCriterion("site_drma not between", value1, value2, "siteDrma");
            return (Criteria) this;
        }

        public Criteria andSiteUndergraduateIsNull() {
            addCriterion("site_undergraduate is null");
            return (Criteria) this;
        }

        public Criteria andSiteUndergraduateIsNotNull() {
            addCriterion("site_undergraduate is not null");
            return (Criteria) this;
        }

        public Criteria andSiteUndergraduateEqualTo(Integer value) {
            addCriterion("site_undergraduate =", value, "siteUndergraduate");
            return (Criteria) this;
        }

        public Criteria andSiteUndergraduateNotEqualTo(Integer value) {
            addCriterion("site_undergraduate <>", value, "siteUndergraduate");
            return (Criteria) this;
        }

        public Criteria andSiteUndergraduateGreaterThan(Integer value) {
            addCriterion("site_undergraduate >", value, "siteUndergraduate");
            return (Criteria) this;
        }

        public Criteria andSiteUndergraduateGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_undergraduate >=", value, "siteUndergraduate");
            return (Criteria) this;
        }

        public Criteria andSiteUndergraduateLessThan(Integer value) {
            addCriterion("site_undergraduate <", value, "siteUndergraduate");
            return (Criteria) this;
        }

        public Criteria andSiteUndergraduateLessThanOrEqualTo(Integer value) {
            addCriterion("site_undergraduate <=", value, "siteUndergraduate");
            return (Criteria) this;
        }

        public Criteria andSiteUndergraduateIn(List<Integer> values) {
            addCriterion("site_undergraduate in", values, "siteUndergraduate");
            return (Criteria) this;
        }

        public Criteria andSiteUndergraduateNotIn(List<Integer> values) {
            addCriterion("site_undergraduate not in", values, "siteUndergraduate");
            return (Criteria) this;
        }

        public Criteria andSiteUndergraduateBetween(Integer value1, Integer value2) {
            addCriterion("site_undergraduate between", value1, value2, "siteUndergraduate");
            return (Criteria) this;
        }

        public Criteria andSiteUndergraduateNotBetween(Integer value1, Integer value2) {
            addCriterion("site_undergraduate not between", value1, value2, "siteUndergraduate");
            return (Criteria) this;
        }

        public Criteria andSiteBasecaseIsNull() {
            addCriterion("site_basecase is null");
            return (Criteria) this;
        }

        public Criteria andSiteBasecaseIsNotNull() {
            addCriterion("site_basecase is not null");
            return (Criteria) this;
        }

        public Criteria andSiteBasecaseEqualTo(String value) {
            addCriterion("site_basecase =", value, "siteBasecase");
            return (Criteria) this;
        }

        public Criteria andSiteBasecaseNotEqualTo(String value) {
            addCriterion("site_basecase <>", value, "siteBasecase");
            return (Criteria) this;
        }

        public Criteria andSiteBasecaseGreaterThan(String value) {
            addCriterion("site_basecase >", value, "siteBasecase");
            return (Criteria) this;
        }

        public Criteria andSiteBasecaseGreaterThanOrEqualTo(String value) {
            addCriterion("site_basecase >=", value, "siteBasecase");
            return (Criteria) this;
        }

        public Criteria andSiteBasecaseLessThan(String value) {
            addCriterion("site_basecase <", value, "siteBasecase");
            return (Criteria) this;
        }

        public Criteria andSiteBasecaseLessThanOrEqualTo(String value) {
            addCriterion("site_basecase <=", value, "siteBasecase");
            return (Criteria) this;
        }

        public Criteria andSiteBasecaseLike(String value) {
            addCriterion("site_basecase like", value, "siteBasecase");
            return (Criteria) this;
        }

        public Criteria andSiteBasecaseNotLike(String value) {
            addCriterion("site_basecase not like", value, "siteBasecase");
            return (Criteria) this;
        }

        public Criteria andSiteBasecaseIn(List<String> values) {
            addCriterion("site_basecase in", values, "siteBasecase");
            return (Criteria) this;
        }

        public Criteria andSiteBasecaseNotIn(List<String> values) {
            addCriterion("site_basecase not in", values, "siteBasecase");
            return (Criteria) this;
        }

        public Criteria andSiteBasecaseBetween(String value1, String value2) {
            addCriterion("site_basecase between", value1, value2, "siteBasecase");
            return (Criteria) this;
        }

        public Criteria andSiteBasecaseNotBetween(String value1, String value2) {
            addCriterion("site_basecase not between", value1, value2, "siteBasecase");
            return (Criteria) this;
        }

        public Criteria andSiteBusinesscaseIsNull() {
            addCriterion("site_businesscase is null");
            return (Criteria) this;
        }

        public Criteria andSiteBusinesscaseIsNotNull() {
            addCriterion("site_businesscase is not null");
            return (Criteria) this;
        }

        public Criteria andSiteBusinesscaseEqualTo(String value) {
            addCriterion("site_businesscase =", value, "siteBusinesscase");
            return (Criteria) this;
        }

        public Criteria andSiteBusinesscaseNotEqualTo(String value) {
            addCriterion("site_businesscase <>", value, "siteBusinesscase");
            return (Criteria) this;
        }

        public Criteria andSiteBusinesscaseGreaterThan(String value) {
            addCriterion("site_businesscase >", value, "siteBusinesscase");
            return (Criteria) this;
        }

        public Criteria andSiteBusinesscaseGreaterThanOrEqualTo(String value) {
            addCriterion("site_businesscase >=", value, "siteBusinesscase");
            return (Criteria) this;
        }

        public Criteria andSiteBusinesscaseLessThan(String value) {
            addCriterion("site_businesscase <", value, "siteBusinesscase");
            return (Criteria) this;
        }

        public Criteria andSiteBusinesscaseLessThanOrEqualTo(String value) {
            addCriterion("site_businesscase <=", value, "siteBusinesscase");
            return (Criteria) this;
        }

        public Criteria andSiteBusinesscaseLike(String value) {
            addCriterion("site_businesscase like", value, "siteBusinesscase");
            return (Criteria) this;
        }

        public Criteria andSiteBusinesscaseNotLike(String value) {
            addCriterion("site_businesscase not like", value, "siteBusinesscase");
            return (Criteria) this;
        }

        public Criteria andSiteBusinesscaseIn(List<String> values) {
            addCriterion("site_businesscase in", values, "siteBusinesscase");
            return (Criteria) this;
        }

        public Criteria andSiteBusinesscaseNotIn(List<String> values) {
            addCriterion("site_businesscase not in", values, "siteBusinesscase");
            return (Criteria) this;
        }

        public Criteria andSiteBusinesscaseBetween(String value1, String value2) {
            addCriterion("site_businesscase between", value1, value2, "siteBusinesscase");
            return (Criteria) this;
        }

        public Criteria andSiteBusinesscaseNotBetween(String value1, String value2) {
            addCriterion("site_businesscase not between", value1, value2, "siteBusinesscase");
            return (Criteria) this;
        }

        public Criteria andSiteExplainIsNull() {
            addCriterion("site_explain is null");
            return (Criteria) this;
        }

        public Criteria andSiteExplainIsNotNull() {
            addCriterion("site_explain is not null");
            return (Criteria) this;
        }

        public Criteria andSiteExplainEqualTo(String value) {
            addCriterion("site_explain =", value, "siteExplain");
            return (Criteria) this;
        }

        public Criteria andSiteExplainNotEqualTo(String value) {
            addCriterion("site_explain <>", value, "siteExplain");
            return (Criteria) this;
        }

        public Criteria andSiteExplainGreaterThan(String value) {
            addCriterion("site_explain >", value, "siteExplain");
            return (Criteria) this;
        }

        public Criteria andSiteExplainGreaterThanOrEqualTo(String value) {
            addCriterion("site_explain >=", value, "siteExplain");
            return (Criteria) this;
        }

        public Criteria andSiteExplainLessThan(String value) {
            addCriterion("site_explain <", value, "siteExplain");
            return (Criteria) this;
        }

        public Criteria andSiteExplainLessThanOrEqualTo(String value) {
            addCriterion("site_explain <=", value, "siteExplain");
            return (Criteria) this;
        }

        public Criteria andSiteExplainLike(String value) {
            addCriterion("site_explain like", value, "siteExplain");
            return (Criteria) this;
        }

        public Criteria andSiteExplainNotLike(String value) {
            addCriterion("site_explain not like", value, "siteExplain");
            return (Criteria) this;
        }

        public Criteria andSiteExplainIn(List<String> values) {
            addCriterion("site_explain in", values, "siteExplain");
            return (Criteria) this;
        }

        public Criteria andSiteExplainNotIn(List<String> values) {
            addCriterion("site_explain not in", values, "siteExplain");
            return (Criteria) this;
        }

        public Criteria andSiteExplainBetween(String value1, String value2) {
            addCriterion("site_explain between", value1, value2, "siteExplain");
            return (Criteria) this;
        }

        public Criteria andSiteExplainNotBetween(String value1, String value2) {
            addCriterion("site_explain not between", value1, value2, "siteExplain");
            return (Criteria) this;
        }

        public Criteria andSiteCheckIsNull() {
            addCriterion("site_check is null");
            return (Criteria) this;
        }

        public Criteria andSiteCheckIsNotNull() {
            addCriterion("site_check is not null");
            return (Criteria) this;
        }

        public Criteria andSiteCheckEqualTo(Integer value) {
            addCriterion("site_check =", value, "siteCheck");
            return (Criteria) this;
        }

        public Criteria andSiteCheckNotEqualTo(Integer value) {
            addCriterion("site_check <>", value, "siteCheck");
            return (Criteria) this;
        }

        public Criteria andSiteCheckGreaterThan(Integer value) {
            addCriterion("site_check >", value, "siteCheck");
            return (Criteria) this;
        }

        public Criteria andSiteCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_check >=", value, "siteCheck");
            return (Criteria) this;
        }

        public Criteria andSiteCheckLessThan(Integer value) {
            addCriterion("site_check <", value, "siteCheck");
            return (Criteria) this;
        }

        public Criteria andSiteCheckLessThanOrEqualTo(Integer value) {
            addCriterion("site_check <=", value, "siteCheck");
            return (Criteria) this;
        }

        public Criteria andSiteCheckIn(List<Integer> values) {
            addCriterion("site_check in", values, "siteCheck");
            return (Criteria) this;
        }

        public Criteria andSiteCheckNotIn(List<Integer> values) {
            addCriterion("site_check not in", values, "siteCheck");
            return (Criteria) this;
        }

        public Criteria andSiteCheckBetween(Integer value1, Integer value2) {
            addCriterion("site_check between", value1, value2, "siteCheck");
            return (Criteria) this;
        }

        public Criteria andSiteCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("site_check not between", value1, value2, "siteCheck");
            return (Criteria) this;
        }

        public Criteria andSiteCreateIsNull() {
            addCriterion("site_create is null");
            return (Criteria) this;
        }

        public Criteria andSiteCreateIsNotNull() {
            addCriterion("site_create is not null");
            return (Criteria) this;
        }

        public Criteria andSiteCreateEqualTo(Date value) {
            addCriterionForJDBCDate("site_create =", value, "siteCreate");
            return (Criteria) this;
        }

        public Criteria andSiteCreateNotEqualTo(Date value) {
            addCriterionForJDBCDate("site_create <>", value, "siteCreate");
            return (Criteria) this;
        }

        public Criteria andSiteCreateGreaterThan(Date value) {
            addCriterionForJDBCDate("site_create >", value, "siteCreate");
            return (Criteria) this;
        }

        public Criteria andSiteCreateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("site_create >=", value, "siteCreate");
            return (Criteria) this;
        }

        public Criteria andSiteCreateLessThan(Date value) {
            addCriterionForJDBCDate("site_create <", value, "siteCreate");
            return (Criteria) this;
        }

        public Criteria andSiteCreateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("site_create <=", value, "siteCreate");
            return (Criteria) this;
        }

        public Criteria andSiteCreateIn(List<Date> values) {
            addCriterionForJDBCDate("site_create in", values, "siteCreate");
            return (Criteria) this;
        }

        public Criteria andSiteCreateNotIn(List<Date> values) {
            addCriterionForJDBCDate("site_create not in", values, "siteCreate");
            return (Criteria) this;
        }

        public Criteria andSiteCreateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("site_create between", value1, value2, "siteCreate");
            return (Criteria) this;
        }

        public Criteria andSiteCreateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("site_create not between", value1, value2, "siteCreate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateIsNull() {
            addCriterion("site_update is null");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateIsNotNull() {
            addCriterion("site_update is not null");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateEqualTo(Date value) {
            addCriterionForJDBCDate("site_update =", value, "siteUpdate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("site_update <>", value, "siteUpdate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("site_update >", value, "siteUpdate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("site_update >=", value, "siteUpdate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateLessThan(Date value) {
            addCriterionForJDBCDate("site_update <", value, "siteUpdate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("site_update <=", value, "siteUpdate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateIn(List<Date> values) {
            addCriterionForJDBCDate("site_update in", values, "siteUpdate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("site_update not in", values, "siteUpdate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("site_update between", value1, value2, "siteUpdate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("site_update not between", value1, value2, "siteUpdate");
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