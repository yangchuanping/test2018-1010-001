package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompaniesOldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompaniesOldExample() {
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

        public Criteria andComNameIsNull() {
            addCriterion("com_name is null");
            return (Criteria) this;
        }

        public Criteria andComNameIsNotNull() {
            addCriterion("com_name is not null");
            return (Criteria) this;
        }

        public Criteria andComNameEqualTo(String value) {
            addCriterion("com_name =", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotEqualTo(String value) {
            addCriterion("com_name <>", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameGreaterThan(String value) {
            addCriterion("com_name >", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameGreaterThanOrEqualTo(String value) {
            addCriterion("com_name >=", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLessThan(String value) {
            addCriterion("com_name <", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLessThanOrEqualTo(String value) {
            addCriterion("com_name <=", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLike(String value) {
            addCriterion("com_name like", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotLike(String value) {
            addCriterion("com_name not like", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameIn(List<String> values) {
            addCriterion("com_name in", values, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotIn(List<String> values) {
            addCriterion("com_name not in", values, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameBetween(String value1, String value2) {
            addCriterion("com_name between", value1, value2, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotBetween(String value1, String value2) {
            addCriterion("com_name not between", value1, value2, "comName");
            return (Criteria) this;
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

        public Criteria andComNumberIsNull() {
            addCriterion("com_number is null");
            return (Criteria) this;
        }

        public Criteria andComNumberIsNotNull() {
            addCriterion("com_number is not null");
            return (Criteria) this;
        }

        public Criteria andComNumberEqualTo(String value) {
            addCriterion("com_number =", value, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberNotEqualTo(String value) {
            addCriterion("com_number <>", value, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberGreaterThan(String value) {
            addCriterion("com_number >", value, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberGreaterThanOrEqualTo(String value) {
            addCriterion("com_number >=", value, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberLessThan(String value) {
            addCriterion("com_number <", value, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberLessThanOrEqualTo(String value) {
            addCriterion("com_number <=", value, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberLike(String value) {
            addCriterion("com_number like", value, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberNotLike(String value) {
            addCriterion("com_number not like", value, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberIn(List<String> values) {
            addCriterion("com_number in", values, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberNotIn(List<String> values) {
            addCriterion("com_number not in", values, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberBetween(String value1, String value2) {
            addCriterion("com_number between", value1, value2, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberNotBetween(String value1, String value2) {
            addCriterion("com_number not between", value1, value2, "comNumber");
            return (Criteria) this;
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

        public Criteria andComDetailIsNull() {
            addCriterion("com_detail is null");
            return (Criteria) this;
        }

        public Criteria andComDetailIsNotNull() {
            addCriterion("com_detail is not null");
            return (Criteria) this;
        }

        public Criteria andComDetailEqualTo(String value) {
            addCriterion("com_detail =", value, "comDetail");
            return (Criteria) this;
        }

        public Criteria andComDetailNotEqualTo(String value) {
            addCriterion("com_detail <>", value, "comDetail");
            return (Criteria) this;
        }

        public Criteria andComDetailGreaterThan(String value) {
            addCriterion("com_detail >", value, "comDetail");
            return (Criteria) this;
        }

        public Criteria andComDetailGreaterThanOrEqualTo(String value) {
            addCriterion("com_detail >=", value, "comDetail");
            return (Criteria) this;
        }

        public Criteria andComDetailLessThan(String value) {
            addCriterion("com_detail <", value, "comDetail");
            return (Criteria) this;
        }

        public Criteria andComDetailLessThanOrEqualTo(String value) {
            addCriterion("com_detail <=", value, "comDetail");
            return (Criteria) this;
        }

        public Criteria andComDetailLike(String value) {
            addCriterion("com_detail like", value, "comDetail");
            return (Criteria) this;
        }

        public Criteria andComDetailNotLike(String value) {
            addCriterion("com_detail not like", value, "comDetail");
            return (Criteria) this;
        }

        public Criteria andComDetailIn(List<String> values) {
            addCriterion("com_detail in", values, "comDetail");
            return (Criteria) this;
        }

        public Criteria andComDetailNotIn(List<String> values) {
            addCriterion("com_detail not in", values, "comDetail");
            return (Criteria) this;
        }

        public Criteria andComDetailBetween(String value1, String value2) {
            addCriterion("com_detail between", value1, value2, "comDetail");
            return (Criteria) this;
        }

        public Criteria andComDetailNotBetween(String value1, String value2) {
            addCriterion("com_detail not between", value1, value2, "comDetail");
            return (Criteria) this;
        }

        public Criteria andComPatentIsNull() {
            addCriterion("com_patent is null");
            return (Criteria) this;
        }

        public Criteria andComPatentIsNotNull() {
            addCriterion("com_patent is not null");
            return (Criteria) this;
        }

        public Criteria andComPatentEqualTo(String value) {
            addCriterion("com_patent =", value, "comPatent");
            return (Criteria) this;
        }

        public Criteria andComPatentNotEqualTo(String value) {
            addCriterion("com_patent <>", value, "comPatent");
            return (Criteria) this;
        }

        public Criteria andComPatentGreaterThan(String value) {
            addCriterion("com_patent >", value, "comPatent");
            return (Criteria) this;
        }

        public Criteria andComPatentGreaterThanOrEqualTo(String value) {
            addCriterion("com_patent >=", value, "comPatent");
            return (Criteria) this;
        }

        public Criteria andComPatentLessThan(String value) {
            addCriterion("com_patent <", value, "comPatent");
            return (Criteria) this;
        }

        public Criteria andComPatentLessThanOrEqualTo(String value) {
            addCriterion("com_patent <=", value, "comPatent");
            return (Criteria) this;
        }

        public Criteria andComPatentLike(String value) {
            addCriterion("com_patent like", value, "comPatent");
            return (Criteria) this;
        }

        public Criteria andComPatentNotLike(String value) {
            addCriterion("com_patent not like", value, "comPatent");
            return (Criteria) this;
        }

        public Criteria andComPatentIn(List<String> values) {
            addCriterion("com_patent in", values, "comPatent");
            return (Criteria) this;
        }

        public Criteria andComPatentNotIn(List<String> values) {
            addCriterion("com_patent not in", values, "comPatent");
            return (Criteria) this;
        }

        public Criteria andComPatentBetween(String value1, String value2) {
            addCriterion("com_patent between", value1, value2, "comPatent");
            return (Criteria) this;
        }

        public Criteria andComPatentNotBetween(String value1, String value2) {
            addCriterion("com_patent not between", value1, value2, "comPatent");
            return (Criteria) this;
        }

        public Criteria andComAboutIsNull() {
            addCriterion("com_about is null");
            return (Criteria) this;
        }

        public Criteria andComAboutIsNotNull() {
            addCriterion("com_about is not null");
            return (Criteria) this;
        }

        public Criteria andComAboutEqualTo(String value) {
            addCriterion("com_about =", value, "comAbout");
            return (Criteria) this;
        }

        public Criteria andComAboutNotEqualTo(String value) {
            addCriterion("com_about <>", value, "comAbout");
            return (Criteria) this;
        }

        public Criteria andComAboutGreaterThan(String value) {
            addCriterion("com_about >", value, "comAbout");
            return (Criteria) this;
        }

        public Criteria andComAboutGreaterThanOrEqualTo(String value) {
            addCriterion("com_about >=", value, "comAbout");
            return (Criteria) this;
        }

        public Criteria andComAboutLessThan(String value) {
            addCriterion("com_about <", value, "comAbout");
            return (Criteria) this;
        }

        public Criteria andComAboutLessThanOrEqualTo(String value) {
            addCriterion("com_about <=", value, "comAbout");
            return (Criteria) this;
        }

        public Criteria andComAboutLike(String value) {
            addCriterion("com_about like", value, "comAbout");
            return (Criteria) this;
        }

        public Criteria andComAboutNotLike(String value) {
            addCriterion("com_about not like", value, "comAbout");
            return (Criteria) this;
        }

        public Criteria andComAboutIn(List<String> values) {
            addCriterion("com_about in", values, "comAbout");
            return (Criteria) this;
        }

        public Criteria andComAboutNotIn(List<String> values) {
            addCriterion("com_about not in", values, "comAbout");
            return (Criteria) this;
        }

        public Criteria andComAboutBetween(String value1, String value2) {
            addCriterion("com_about between", value1, value2, "comAbout");
            return (Criteria) this;
        }

        public Criteria andComAboutNotBetween(String value1, String value2) {
            addCriterion("com_about not between", value1, value2, "comAbout");
            return (Criteria) this;
        }

        public Criteria andComProductIsNull() {
            addCriterion("com_product is null");
            return (Criteria) this;
        }

        public Criteria andComProductIsNotNull() {
            addCriterion("com_product is not null");
            return (Criteria) this;
        }

        public Criteria andComProductEqualTo(String value) {
            addCriterion("com_product =", value, "comProduct");
            return (Criteria) this;
        }

        public Criteria andComProductNotEqualTo(String value) {
            addCriterion("com_product <>", value, "comProduct");
            return (Criteria) this;
        }

        public Criteria andComProductGreaterThan(String value) {
            addCriterion("com_product >", value, "comProduct");
            return (Criteria) this;
        }

        public Criteria andComProductGreaterThanOrEqualTo(String value) {
            addCriterion("com_product >=", value, "comProduct");
            return (Criteria) this;
        }

        public Criteria andComProductLessThan(String value) {
            addCriterion("com_product <", value, "comProduct");
            return (Criteria) this;
        }

        public Criteria andComProductLessThanOrEqualTo(String value) {
            addCriterion("com_product <=", value, "comProduct");
            return (Criteria) this;
        }

        public Criteria andComProductLike(String value) {
            addCriterion("com_product like", value, "comProduct");
            return (Criteria) this;
        }

        public Criteria andComProductNotLike(String value) {
            addCriterion("com_product not like", value, "comProduct");
            return (Criteria) this;
        }

        public Criteria andComProductIn(List<String> values) {
            addCriterion("com_product in", values, "comProduct");
            return (Criteria) this;
        }

        public Criteria andComProductNotIn(List<String> values) {
            addCriterion("com_product not in", values, "comProduct");
            return (Criteria) this;
        }

        public Criteria andComProductBetween(String value1, String value2) {
            addCriterion("com_product between", value1, value2, "comProduct");
            return (Criteria) this;
        }

        public Criteria andComProductNotBetween(String value1, String value2) {
            addCriterion("com_product not between", value1, value2, "comProduct");
            return (Criteria) this;
        }

        public Criteria andComStatusIsNull() {
            addCriterion("com_status is null");
            return (Criteria) this;
        }

        public Criteria andComStatusIsNotNull() {
            addCriterion("com_status is not null");
            return (Criteria) this;
        }

        public Criteria andComStatusEqualTo(String value) {
            addCriterion("com_status =", value, "comStatus");
            return (Criteria) this;
        }

        public Criteria andComStatusNotEqualTo(String value) {
            addCriterion("com_status <>", value, "comStatus");
            return (Criteria) this;
        }

        public Criteria andComStatusGreaterThan(String value) {
            addCriterion("com_status >", value, "comStatus");
            return (Criteria) this;
        }

        public Criteria andComStatusGreaterThanOrEqualTo(String value) {
            addCriterion("com_status >=", value, "comStatus");
            return (Criteria) this;
        }

        public Criteria andComStatusLessThan(String value) {
            addCriterion("com_status <", value, "comStatus");
            return (Criteria) this;
        }

        public Criteria andComStatusLessThanOrEqualTo(String value) {
            addCriterion("com_status <=", value, "comStatus");
            return (Criteria) this;
        }

        public Criteria andComStatusLike(String value) {
            addCriterion("com_status like", value, "comStatus");
            return (Criteria) this;
        }

        public Criteria andComStatusNotLike(String value) {
            addCriterion("com_status not like", value, "comStatus");
            return (Criteria) this;
        }

        public Criteria andComStatusIn(List<String> values) {
            addCriterion("com_status in", values, "comStatus");
            return (Criteria) this;
        }

        public Criteria andComStatusNotIn(List<String> values) {
            addCriterion("com_status not in", values, "comStatus");
            return (Criteria) this;
        }

        public Criteria andComStatusBetween(String value1, String value2) {
            addCriterion("com_status between", value1, value2, "comStatus");
            return (Criteria) this;
        }

        public Criteria andComStatusNotBetween(String value1, String value2) {
            addCriterion("com_status not between", value1, value2, "comStatus");
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