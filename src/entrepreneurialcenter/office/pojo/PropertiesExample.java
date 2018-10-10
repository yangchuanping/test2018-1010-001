package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class PropertiesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PropertiesExample() {
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

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Long value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Long value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Long value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Long value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Long value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Long> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Long> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Long value1, Long value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Long value1, Long value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
            return (Criteria) this;
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

        public Criteria andBuildingIdIsNull() {
            addCriterion("building_id is null");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIsNotNull() {
            addCriterion("building_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingIdEqualTo(Long value) {
            addCriterion("building_id =", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotEqualTo(Long value) {
            addCriterion("building_id <>", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdGreaterThan(Long value) {
            addCriterion("building_id >", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("building_id >=", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdLessThan(Long value) {
            addCriterion("building_id <", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdLessThanOrEqualTo(Long value) {
            addCriterion("building_id <=", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIn(List<Long> values) {
            addCriterion("building_id in", values, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotIn(List<Long> values) {
            addCriterion("building_id not in", values, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdBetween(Long value1, Long value2) {
            addCriterion("building_id between", value1, value2, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotBetween(Long value1, Long value2) {
            addCriterion("building_id not between", value1, value2, "buildingId");
            return (Criteria) this;
        }

        public Criteria andProNumberIsNull() {
            addCriterion("pro_number is null");
            return (Criteria) this;
        }

        public Criteria andProNumberIsNotNull() {
            addCriterion("pro_number is not null");
            return (Criteria) this;
        }

        public Criteria andProNumberEqualTo(String value) {
            addCriterion("pro_number =", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberNotEqualTo(String value) {
            addCriterion("pro_number <>", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberGreaterThan(String value) {
            addCriterion("pro_number >", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pro_number >=", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberLessThan(String value) {
            addCriterion("pro_number <", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberLessThanOrEqualTo(String value) {
            addCriterion("pro_number <=", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberLike(String value) {
            addCriterion("pro_number like", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberNotLike(String value) {
            addCriterion("pro_number not like", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberIn(List<String> values) {
            addCriterion("pro_number in", values, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberNotIn(List<String> values) {
            addCriterion("pro_number not in", values, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberBetween(String value1, String value2) {
            addCriterion("pro_number between", value1, value2, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberNotBetween(String value1, String value2) {
            addCriterion("pro_number not between", value1, value2, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProAreaIsNull() {
            addCriterion("pro_area is null");
            return (Criteria) this;
        }

        public Criteria andProAreaIsNotNull() {
            addCriterion("pro_area is not null");
            return (Criteria) this;
        }

        public Criteria andProAreaEqualTo(Integer value) {
            addCriterion("pro_area =", value, "proArea");
            return (Criteria) this;
        }

        public Criteria andProAreaNotEqualTo(Integer value) {
            addCriterion("pro_area <>", value, "proArea");
            return (Criteria) this;
        }

        public Criteria andProAreaGreaterThan(Integer value) {
            addCriterion("pro_area >", value, "proArea");
            return (Criteria) this;
        }

        public Criteria andProAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_area >=", value, "proArea");
            return (Criteria) this;
        }

        public Criteria andProAreaLessThan(Integer value) {
            addCriterion("pro_area <", value, "proArea");
            return (Criteria) this;
        }

        public Criteria andProAreaLessThanOrEqualTo(Integer value) {
            addCriterion("pro_area <=", value, "proArea");
            return (Criteria) this;
        }

        public Criteria andProAreaIn(List<Integer> values) {
            addCriterion("pro_area in", values, "proArea");
            return (Criteria) this;
        }

        public Criteria andProAreaNotIn(List<Integer> values) {
            addCriterion("pro_area not in", values, "proArea");
            return (Criteria) this;
        }

        public Criteria andProAreaBetween(Integer value1, Integer value2) {
            addCriterion("pro_area between", value1, value2, "proArea");
            return (Criteria) this;
        }

        public Criteria andProAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_area not between", value1, value2, "proArea");
            return (Criteria) this;
        }

        public Criteria andProUnivalentIsNull() {
            addCriterion("pro_univalent is null");
            return (Criteria) this;
        }

        public Criteria andProUnivalentIsNotNull() {
            addCriterion("pro_univalent is not null");
            return (Criteria) this;
        }

        public Criteria andProUnivalentEqualTo(Long value) {
            addCriterion("pro_univalent =", value, "proUnivalent");
            return (Criteria) this;
        }

        public Criteria andProUnivalentNotEqualTo(Long value) {
            addCriterion("pro_univalent <>", value, "proUnivalent");
            return (Criteria) this;
        }

        public Criteria andProUnivalentGreaterThan(Long value) {
            addCriterion("pro_univalent >", value, "proUnivalent");
            return (Criteria) this;
        }

        public Criteria andProUnivalentGreaterThanOrEqualTo(Long value) {
            addCriterion("pro_univalent >=", value, "proUnivalent");
            return (Criteria) this;
        }

        public Criteria andProUnivalentLessThan(Long value) {
            addCriterion("pro_univalent <", value, "proUnivalent");
            return (Criteria) this;
        }

        public Criteria andProUnivalentLessThanOrEqualTo(Long value) {
            addCriterion("pro_univalent <=", value, "proUnivalent");
            return (Criteria) this;
        }

        public Criteria andProUnivalentIn(List<Long> values) {
            addCriterion("pro_univalent in", values, "proUnivalent");
            return (Criteria) this;
        }

        public Criteria andProUnivalentNotIn(List<Long> values) {
            addCriterion("pro_univalent not in", values, "proUnivalent");
            return (Criteria) this;
        }

        public Criteria andProUnivalentBetween(Long value1, Long value2) {
            addCriterion("pro_univalent between", value1, value2, "proUnivalent");
            return (Criteria) this;
        }

        public Criteria andProUnivalentNotBetween(Long value1, Long value2) {
            addCriterion("pro_univalent not between", value1, value2, "proUnivalent");
            return (Criteria) this;
        }

        public Criteria andProAmmeterIsNull() {
            addCriterion("pro_ammeter is null");
            return (Criteria) this;
        }

        public Criteria andProAmmeterIsNotNull() {
            addCriterion("pro_ammeter is not null");
            return (Criteria) this;
        }

        public Criteria andProAmmeterEqualTo(String value) {
            addCriterion("pro_ammeter =", value, "proAmmeter");
            return (Criteria) this;
        }

        public Criteria andProAmmeterNotEqualTo(String value) {
            addCriterion("pro_ammeter <>", value, "proAmmeter");
            return (Criteria) this;
        }

        public Criteria andProAmmeterGreaterThan(String value) {
            addCriterion("pro_ammeter >", value, "proAmmeter");
            return (Criteria) this;
        }

        public Criteria andProAmmeterGreaterThanOrEqualTo(String value) {
            addCriterion("pro_ammeter >=", value, "proAmmeter");
            return (Criteria) this;
        }

        public Criteria andProAmmeterLessThan(String value) {
            addCriterion("pro_ammeter <", value, "proAmmeter");
            return (Criteria) this;
        }

        public Criteria andProAmmeterLessThanOrEqualTo(String value) {
            addCriterion("pro_ammeter <=", value, "proAmmeter");
            return (Criteria) this;
        }

        public Criteria andProAmmeterLike(String value) {
            addCriterion("pro_ammeter like", value, "proAmmeter");
            return (Criteria) this;
        }

        public Criteria andProAmmeterNotLike(String value) {
            addCriterion("pro_ammeter not like", value, "proAmmeter");
            return (Criteria) this;
        }

        public Criteria andProAmmeterIn(List<String> values) {
            addCriterion("pro_ammeter in", values, "proAmmeter");
            return (Criteria) this;
        }

        public Criteria andProAmmeterNotIn(List<String> values) {
            addCriterion("pro_ammeter not in", values, "proAmmeter");
            return (Criteria) this;
        }

        public Criteria andProAmmeterBetween(String value1, String value2) {
            addCriterion("pro_ammeter between", value1, value2, "proAmmeter");
            return (Criteria) this;
        }

        public Criteria andProAmmeterNotBetween(String value1, String value2) {
            addCriterion("pro_ammeter not between", value1, value2, "proAmmeter");
            return (Criteria) this;
        }

        public Criteria andProTypeIsNull() {
            addCriterion("pro_type is null");
            return (Criteria) this;
        }

        public Criteria andProTypeIsNotNull() {
            addCriterion("pro_type is not null");
            return (Criteria) this;
        }

        public Criteria andProTypeEqualTo(String value) {
            addCriterion("pro_type =", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotEqualTo(String value) {
            addCriterion("pro_type <>", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeGreaterThan(String value) {
            addCriterion("pro_type >", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pro_type >=", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLessThan(String value) {
            addCriterion("pro_type <", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLessThanOrEqualTo(String value) {
            addCriterion("pro_type <=", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLike(String value) {
            addCriterion("pro_type like", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotLike(String value) {
            addCriterion("pro_type not like", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeIn(List<String> values) {
            addCriterion("pro_type in", values, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotIn(List<String> values) {
            addCriterion("pro_type not in", values, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeBetween(String value1, String value2) {
            addCriterion("pro_type between", value1, value2, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotBetween(String value1, String value2) {
            addCriterion("pro_type not between", value1, value2, "proType");
            return (Criteria) this;
        }

        public Criteria andProStatusIsNull() {
            addCriterion("pro_status is null");
            return (Criteria) this;
        }

        public Criteria andProStatusIsNotNull() {
            addCriterion("pro_status is not null");
            return (Criteria) this;
        }

        public Criteria andProStatusEqualTo(String value) {
            addCriterion("pro_status =", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotEqualTo(String value) {
            addCriterion("pro_status <>", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusGreaterThan(String value) {
            addCriterion("pro_status >", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pro_status >=", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusLessThan(String value) {
            addCriterion("pro_status <", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusLessThanOrEqualTo(String value) {
            addCriterion("pro_status <=", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusLike(String value) {
            addCriterion("pro_status like", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotLike(String value) {
            addCriterion("pro_status not like", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusIn(List<String> values) {
            addCriterion("pro_status in", values, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotIn(List<String> values) {
            addCriterion("pro_status not in", values, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusBetween(String value1, String value2) {
            addCriterion("pro_status between", value1, value2, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotBetween(String value1, String value2) {
            addCriterion("pro_status not between", value1, value2, "proStatus");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Integer value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Integer value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Integer value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Integer value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Integer value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Integer> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Integer> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Integer value1, Integer value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
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