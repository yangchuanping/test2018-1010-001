package entrepreneurialcenter.office.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AttractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttractExample() {
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

        public Criteria andAttractIdIsNull() {
            addCriterion("attract_id is null");
            return (Criteria) this;
        }

        public Criteria andAttractIdIsNotNull() {
            addCriterion("attract_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttractIdEqualTo(Integer value) {
            addCriterion("attract_id =", value, "attractId");
            return (Criteria) this;
        }

        public Criteria andAttractIdNotEqualTo(Integer value) {
            addCriterion("attract_id <>", value, "attractId");
            return (Criteria) this;
        }

        public Criteria andAttractIdGreaterThan(Integer value) {
            addCriterion("attract_id >", value, "attractId");
            return (Criteria) this;
        }

        public Criteria andAttractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attract_id >=", value, "attractId");
            return (Criteria) this;
        }

        public Criteria andAttractIdLessThan(Integer value) {
            addCriterion("attract_id <", value, "attractId");
            return (Criteria) this;
        }

        public Criteria andAttractIdLessThanOrEqualTo(Integer value) {
            addCriterion("attract_id <=", value, "attractId");
            return (Criteria) this;
        }

        public Criteria andAttractIdIn(List<Integer> values) {
            addCriterion("attract_id in", values, "attractId");
            return (Criteria) this;
        }

        public Criteria andAttractIdNotIn(List<Integer> values) {
            addCriterion("attract_id not in", values, "attractId");
            return (Criteria) this;
        }

        public Criteria andAttractIdBetween(Integer value1, Integer value2) {
            addCriterion("attract_id between", value1, value2, "attractId");
            return (Criteria) this;
        }

        public Criteria andAttractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attract_id not between", value1, value2, "attractId");
            return (Criteria) this;
        }

        public Criteria andAttractNameIsNull() {
            addCriterion("attract_name is null");
            return (Criteria) this;
        }

        public Criteria andAttractNameIsNotNull() {
            addCriterion("attract_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttractNameEqualTo(String value) {
            addCriterion("attract_name =", value, "attractName");
            return (Criteria) this;
        }

        public Criteria andAttractNameNotEqualTo(String value) {
            addCriterion("attract_name <>", value, "attractName");
            return (Criteria) this;
        }

        public Criteria andAttractNameGreaterThan(String value) {
            addCriterion("attract_name >", value, "attractName");
            return (Criteria) this;
        }

        public Criteria andAttractNameGreaterThanOrEqualTo(String value) {
            addCriterion("attract_name >=", value, "attractName");
            return (Criteria) this;
        }

        public Criteria andAttractNameLessThan(String value) {
            addCriterion("attract_name <", value, "attractName");
            return (Criteria) this;
        }

        public Criteria andAttractNameLessThanOrEqualTo(String value) {
            addCriterion("attract_name <=", value, "attractName");
            return (Criteria) this;
        }

        public Criteria andAttractNameLike(String value) {
            addCriterion("attract_name like", value, "attractName");
            return (Criteria) this;
        }

        public Criteria andAttractNameNotLike(String value) {
            addCriterion("attract_name not like", value, "attractName");
            return (Criteria) this;
        }

        public Criteria andAttractNameIn(List<String> values) {
            addCriterion("attract_name in", values, "attractName");
            return (Criteria) this;
        }

        public Criteria andAttractNameNotIn(List<String> values) {
            addCriterion("attract_name not in", values, "attractName");
            return (Criteria) this;
        }

        public Criteria andAttractNameBetween(String value1, String value2) {
            addCriterion("attract_name between", value1, value2, "attractName");
            return (Criteria) this;
        }

        public Criteria andAttractNameNotBetween(String value1, String value2) {
            addCriterion("attract_name not between", value1, value2, "attractName");
            return (Criteria) this;
        }

        public Criteria andAttractContentIsNull() {
            addCriterion("attract_content is null");
            return (Criteria) this;
        }

        public Criteria andAttractContentIsNotNull() {
            addCriterion("attract_content is not null");
            return (Criteria) this;
        }

        public Criteria andAttractContentEqualTo(String value) {
            addCriterion("attract_content =", value, "attractContent");
            return (Criteria) this;
        }

        public Criteria andAttractContentNotEqualTo(String value) {
            addCriterion("attract_content <>", value, "attractContent");
            return (Criteria) this;
        }

        public Criteria andAttractContentGreaterThan(String value) {
            addCriterion("attract_content >", value, "attractContent");
            return (Criteria) this;
        }

        public Criteria andAttractContentGreaterThanOrEqualTo(String value) {
            addCriterion("attract_content >=", value, "attractContent");
            return (Criteria) this;
        }

        public Criteria andAttractContentLessThan(String value) {
            addCriterion("attract_content <", value, "attractContent");
            return (Criteria) this;
        }

        public Criteria andAttractContentLessThanOrEqualTo(String value) {
            addCriterion("attract_content <=", value, "attractContent");
            return (Criteria) this;
        }

        public Criteria andAttractContentLike(String value) {
            addCriterion("attract_content like", value, "attractContent");
            return (Criteria) this;
        }

        public Criteria andAttractContentNotLike(String value) {
            addCriterion("attract_content not like", value, "attractContent");
            return (Criteria) this;
        }

        public Criteria andAttractContentIn(List<String> values) {
            addCriterion("attract_content in", values, "attractContent");
            return (Criteria) this;
        }

        public Criteria andAttractContentNotIn(List<String> values) {
            addCriterion("attract_content not in", values, "attractContent");
            return (Criteria) this;
        }

        public Criteria andAttractContentBetween(String value1, String value2) {
            addCriterion("attract_content between", value1, value2, "attractContent");
            return (Criteria) this;
        }

        public Criteria andAttractContentNotBetween(String value1, String value2) {
            addCriterion("attract_content not between", value1, value2, "attractContent");
            return (Criteria) this;
        }

        public Criteria andAttractAddressIsNull() {
            addCriterion("attract_address is null");
            return (Criteria) this;
        }

        public Criteria andAttractAddressIsNotNull() {
            addCriterion("attract_address is not null");
            return (Criteria) this;
        }

        public Criteria andAttractAddressEqualTo(String value) {
            addCriterion("attract_address =", value, "attractAddress");
            return (Criteria) this;
        }

        public Criteria andAttractAddressNotEqualTo(String value) {
            addCriterion("attract_address <>", value, "attractAddress");
            return (Criteria) this;
        }

        public Criteria andAttractAddressGreaterThan(String value) {
            addCriterion("attract_address >", value, "attractAddress");
            return (Criteria) this;
        }

        public Criteria andAttractAddressGreaterThanOrEqualTo(String value) {
            addCriterion("attract_address >=", value, "attractAddress");
            return (Criteria) this;
        }

        public Criteria andAttractAddressLessThan(String value) {
            addCriterion("attract_address <", value, "attractAddress");
            return (Criteria) this;
        }

        public Criteria andAttractAddressLessThanOrEqualTo(String value) {
            addCriterion("attract_address <=", value, "attractAddress");
            return (Criteria) this;
        }

        public Criteria andAttractAddressLike(String value) {
            addCriterion("attract_address like", value, "attractAddress");
            return (Criteria) this;
        }

        public Criteria andAttractAddressNotLike(String value) {
            addCriterion("attract_address not like", value, "attractAddress");
            return (Criteria) this;
        }

        public Criteria andAttractAddressIn(List<String> values) {
            addCriterion("attract_address in", values, "attractAddress");
            return (Criteria) this;
        }

        public Criteria andAttractAddressNotIn(List<String> values) {
            addCriterion("attract_address not in", values, "attractAddress");
            return (Criteria) this;
        }

        public Criteria andAttractAddressBetween(String value1, String value2) {
            addCriterion("attract_address between", value1, value2, "attractAddress");
            return (Criteria) this;
        }

        public Criteria andAttractAddressNotBetween(String value1, String value2) {
            addCriterion("attract_address not between", value1, value2, "attractAddress");
            return (Criteria) this;
        }

        public Criteria andAttractTrafficIsNull() {
            addCriterion("attract_traffic is null");
            return (Criteria) this;
        }

        public Criteria andAttractTrafficIsNotNull() {
            addCriterion("attract_traffic is not null");
            return (Criteria) this;
        }

        public Criteria andAttractTrafficEqualTo(String value) {
            addCriterion("attract_traffic =", value, "attractTraffic");
            return (Criteria) this;
        }

        public Criteria andAttractTrafficNotEqualTo(String value) {
            addCriterion("attract_traffic <>", value, "attractTraffic");
            return (Criteria) this;
        }

        public Criteria andAttractTrafficGreaterThan(String value) {
            addCriterion("attract_traffic >", value, "attractTraffic");
            return (Criteria) this;
        }

        public Criteria andAttractTrafficGreaterThanOrEqualTo(String value) {
            addCriterion("attract_traffic >=", value, "attractTraffic");
            return (Criteria) this;
        }

        public Criteria andAttractTrafficLessThan(String value) {
            addCriterion("attract_traffic <", value, "attractTraffic");
            return (Criteria) this;
        }

        public Criteria andAttractTrafficLessThanOrEqualTo(String value) {
            addCriterion("attract_traffic <=", value, "attractTraffic");
            return (Criteria) this;
        }

        public Criteria andAttractTrafficLike(String value) {
            addCriterion("attract_traffic like", value, "attractTraffic");
            return (Criteria) this;
        }

        public Criteria andAttractTrafficNotLike(String value) {
            addCriterion("attract_traffic not like", value, "attractTraffic");
            return (Criteria) this;
        }

        public Criteria andAttractTrafficIn(List<String> values) {
            addCriterion("attract_traffic in", values, "attractTraffic");
            return (Criteria) this;
        }

        public Criteria andAttractTrafficNotIn(List<String> values) {
            addCriterion("attract_traffic not in", values, "attractTraffic");
            return (Criteria) this;
        }

        public Criteria andAttractTrafficBetween(String value1, String value2) {
            addCriterion("attract_traffic between", value1, value2, "attractTraffic");
            return (Criteria) this;
        }

        public Criteria andAttractTrafficNotBetween(String value1, String value2) {
            addCriterion("attract_traffic not between", value1, value2, "attractTraffic");
            return (Criteria) this;
        }

        public Criteria andAttractGardenIsNull() {
            addCriterion("attract_garden is null");
            return (Criteria) this;
        }

        public Criteria andAttractGardenIsNotNull() {
            addCriterion("attract_garden is not null");
            return (Criteria) this;
        }

        public Criteria andAttractGardenEqualTo(String value) {
            addCriterion("attract_garden =", value, "attractGarden");
            return (Criteria) this;
        }

        public Criteria andAttractGardenNotEqualTo(String value) {
            addCriterion("attract_garden <>", value, "attractGarden");
            return (Criteria) this;
        }

        public Criteria andAttractGardenGreaterThan(String value) {
            addCriterion("attract_garden >", value, "attractGarden");
            return (Criteria) this;
        }

        public Criteria andAttractGardenGreaterThanOrEqualTo(String value) {
            addCriterion("attract_garden >=", value, "attractGarden");
            return (Criteria) this;
        }

        public Criteria andAttractGardenLessThan(String value) {
            addCriterion("attract_garden <", value, "attractGarden");
            return (Criteria) this;
        }

        public Criteria andAttractGardenLessThanOrEqualTo(String value) {
            addCriterion("attract_garden <=", value, "attractGarden");
            return (Criteria) this;
        }

        public Criteria andAttractGardenLike(String value) {
            addCriterion("attract_garden like", value, "attractGarden");
            return (Criteria) this;
        }

        public Criteria andAttractGardenNotLike(String value) {
            addCriterion("attract_garden not like", value, "attractGarden");
            return (Criteria) this;
        }

        public Criteria andAttractGardenIn(List<String> values) {
            addCriterion("attract_garden in", values, "attractGarden");
            return (Criteria) this;
        }

        public Criteria andAttractGardenNotIn(List<String> values) {
            addCriterion("attract_garden not in", values, "attractGarden");
            return (Criteria) this;
        }

        public Criteria andAttractGardenBetween(String value1, String value2) {
            addCriterion("attract_garden between", value1, value2, "attractGarden");
            return (Criteria) this;
        }

        public Criteria andAttractGardenNotBetween(String value1, String value2) {
            addCriterion("attract_garden not between", value1, value2, "attractGarden");
            return (Criteria) this;
        }

        public Criteria andAttractAreaIsNull() {
            addCriterion("attract_area is null");
            return (Criteria) this;
        }

        public Criteria andAttractAreaIsNotNull() {
            addCriterion("attract_area is not null");
            return (Criteria) this;
        }

        public Criteria andAttractAreaEqualTo(Integer value) {
            addCriterion("attract_area =", value, "attractArea");
            return (Criteria) this;
        }

        public Criteria andAttractAreaNotEqualTo(Integer value) {
            addCriterion("attract_area <>", value, "attractArea");
            return (Criteria) this;
        }

        public Criteria andAttractAreaGreaterThan(Integer value) {
            addCriterion("attract_area >", value, "attractArea");
            return (Criteria) this;
        }

        public Criteria andAttractAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("attract_area >=", value, "attractArea");
            return (Criteria) this;
        }

        public Criteria andAttractAreaLessThan(Integer value) {
            addCriterion("attract_area <", value, "attractArea");
            return (Criteria) this;
        }

        public Criteria andAttractAreaLessThanOrEqualTo(Integer value) {
            addCriterion("attract_area <=", value, "attractArea");
            return (Criteria) this;
        }

        public Criteria andAttractAreaIn(List<Integer> values) {
            addCriterion("attract_area in", values, "attractArea");
            return (Criteria) this;
        }

        public Criteria andAttractAreaNotIn(List<Integer> values) {
            addCriterion("attract_area not in", values, "attractArea");
            return (Criteria) this;
        }

        public Criteria andAttractAreaBetween(Integer value1, Integer value2) {
            addCriterion("attract_area between", value1, value2, "attractArea");
            return (Criteria) this;
        }

        public Criteria andAttractAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("attract_area not between", value1, value2, "attractArea");
            return (Criteria) this;
        }

        public Criteria andAttractStationIsNull() {
            addCriterion("attract_station is null");
            return (Criteria) this;
        }

        public Criteria andAttractStationIsNotNull() {
            addCriterion("attract_station is not null");
            return (Criteria) this;
        }

        public Criteria andAttractStationEqualTo(String value) {
            addCriterion("attract_station =", value, "attractStation");
            return (Criteria) this;
        }

        public Criteria andAttractStationNotEqualTo(String value) {
            addCriterion("attract_station <>", value, "attractStation");
            return (Criteria) this;
        }

        public Criteria andAttractStationGreaterThan(String value) {
            addCriterion("attract_station >", value, "attractStation");
            return (Criteria) this;
        }

        public Criteria andAttractStationGreaterThanOrEqualTo(String value) {
            addCriterion("attract_station >=", value, "attractStation");
            return (Criteria) this;
        }

        public Criteria andAttractStationLessThan(String value) {
            addCriterion("attract_station <", value, "attractStation");
            return (Criteria) this;
        }

        public Criteria andAttractStationLessThanOrEqualTo(String value) {
            addCriterion("attract_station <=", value, "attractStation");
            return (Criteria) this;
        }

        public Criteria andAttractStationLike(String value) {
            addCriterion("attract_station like", value, "attractStation");
            return (Criteria) this;
        }

        public Criteria andAttractStationNotLike(String value) {
            addCriterion("attract_station not like", value, "attractStation");
            return (Criteria) this;
        }

        public Criteria andAttractStationIn(List<String> values) {
            addCriterion("attract_station in", values, "attractStation");
            return (Criteria) this;
        }

        public Criteria andAttractStationNotIn(List<String> values) {
            addCriterion("attract_station not in", values, "attractStation");
            return (Criteria) this;
        }

        public Criteria andAttractStationBetween(String value1, String value2) {
            addCriterion("attract_station between", value1, value2, "attractStation");
            return (Criteria) this;
        }

        public Criteria andAttractStationNotBetween(String value1, String value2) {
            addCriterion("attract_station not between", value1, value2, "attractStation");
            return (Criteria) this;
        }

        public Criteria andAttractDecorationIsNull() {
            addCriterion("attract_decoration is null");
            return (Criteria) this;
        }

        public Criteria andAttractDecorationIsNotNull() {
            addCriterion("attract_decoration is not null");
            return (Criteria) this;
        }

        public Criteria andAttractDecorationEqualTo(String value) {
            addCriterion("attract_decoration =", value, "attractDecoration");
            return (Criteria) this;
        }

        public Criteria andAttractDecorationNotEqualTo(String value) {
            addCriterion("attract_decoration <>", value, "attractDecoration");
            return (Criteria) this;
        }

        public Criteria andAttractDecorationGreaterThan(String value) {
            addCriterion("attract_decoration >", value, "attractDecoration");
            return (Criteria) this;
        }

        public Criteria andAttractDecorationGreaterThanOrEqualTo(String value) {
            addCriterion("attract_decoration >=", value, "attractDecoration");
            return (Criteria) this;
        }

        public Criteria andAttractDecorationLessThan(String value) {
            addCriterion("attract_decoration <", value, "attractDecoration");
            return (Criteria) this;
        }

        public Criteria andAttractDecorationLessThanOrEqualTo(String value) {
            addCriterion("attract_decoration <=", value, "attractDecoration");
            return (Criteria) this;
        }

        public Criteria andAttractDecorationLike(String value) {
            addCriterion("attract_decoration like", value, "attractDecoration");
            return (Criteria) this;
        }

        public Criteria andAttractDecorationNotLike(String value) {
            addCriterion("attract_decoration not like", value, "attractDecoration");
            return (Criteria) this;
        }

        public Criteria andAttractDecorationIn(List<String> values) {
            addCriterion("attract_decoration in", values, "attractDecoration");
            return (Criteria) this;
        }

        public Criteria andAttractDecorationNotIn(List<String> values) {
            addCriterion("attract_decoration not in", values, "attractDecoration");
            return (Criteria) this;
        }

        public Criteria andAttractDecorationBetween(String value1, String value2) {
            addCriterion("attract_decoration between", value1, value2, "attractDecoration");
            return (Criteria) this;
        }

        public Criteria andAttractDecorationNotBetween(String value1, String value2) {
            addCriterion("attract_decoration not between", value1, value2, "attractDecoration");
            return (Criteria) this;
        }

        public Criteria andAttractRateIsNull() {
            addCriterion("attract_rate is null");
            return (Criteria) this;
        }

        public Criteria andAttractRateIsNotNull() {
            addCriterion("attract_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAttractRateEqualTo(String value) {
            addCriterion("attract_rate =", value, "attractRate");
            return (Criteria) this;
        }

        public Criteria andAttractRateNotEqualTo(String value) {
            addCriterion("attract_rate <>", value, "attractRate");
            return (Criteria) this;
        }

        public Criteria andAttractRateGreaterThan(String value) {
            addCriterion("attract_rate >", value, "attractRate");
            return (Criteria) this;
        }

        public Criteria andAttractRateGreaterThanOrEqualTo(String value) {
            addCriterion("attract_rate >=", value, "attractRate");
            return (Criteria) this;
        }

        public Criteria andAttractRateLessThan(String value) {
            addCriterion("attract_rate <", value, "attractRate");
            return (Criteria) this;
        }

        public Criteria andAttractRateLessThanOrEqualTo(String value) {
            addCriterion("attract_rate <=", value, "attractRate");
            return (Criteria) this;
        }

        public Criteria andAttractRateLike(String value) {
            addCriterion("attract_rate like", value, "attractRate");
            return (Criteria) this;
        }

        public Criteria andAttractRateNotLike(String value) {
            addCriterion("attract_rate not like", value, "attractRate");
            return (Criteria) this;
        }

        public Criteria andAttractRateIn(List<String> values) {
            addCriterion("attract_rate in", values, "attractRate");
            return (Criteria) this;
        }

        public Criteria andAttractRateNotIn(List<String> values) {
            addCriterion("attract_rate not in", values, "attractRate");
            return (Criteria) this;
        }

        public Criteria andAttractRateBetween(String value1, String value2) {
            addCriterion("attract_rate between", value1, value2, "attractRate");
            return (Criteria) this;
        }

        public Criteria andAttractRateNotBetween(String value1, String value2) {
            addCriterion("attract_rate not between", value1, value2, "attractRate");
            return (Criteria) this;
        }

        public Criteria andAttractRentfreeIsNull() {
            addCriterion("attract_rentfree is null");
            return (Criteria) this;
        }

        public Criteria andAttractRentfreeIsNotNull() {
            addCriterion("attract_rentfree is not null");
            return (Criteria) this;
        }

        public Criteria andAttractRentfreeEqualTo(String value) {
            addCriterion("attract_rentfree =", value, "attractRentfree");
            return (Criteria) this;
        }

        public Criteria andAttractRentfreeNotEqualTo(String value) {
            addCriterion("attract_rentfree <>", value, "attractRentfree");
            return (Criteria) this;
        }

        public Criteria andAttractRentfreeGreaterThan(String value) {
            addCriterion("attract_rentfree >", value, "attractRentfree");
            return (Criteria) this;
        }

        public Criteria andAttractRentfreeGreaterThanOrEqualTo(String value) {
            addCriterion("attract_rentfree >=", value, "attractRentfree");
            return (Criteria) this;
        }

        public Criteria andAttractRentfreeLessThan(String value) {
            addCriterion("attract_rentfree <", value, "attractRentfree");
            return (Criteria) this;
        }

        public Criteria andAttractRentfreeLessThanOrEqualTo(String value) {
            addCriterion("attract_rentfree <=", value, "attractRentfree");
            return (Criteria) this;
        }

        public Criteria andAttractRentfreeLike(String value) {
            addCriterion("attract_rentfree like", value, "attractRentfree");
            return (Criteria) this;
        }

        public Criteria andAttractRentfreeNotLike(String value) {
            addCriterion("attract_rentfree not like", value, "attractRentfree");
            return (Criteria) this;
        }

        public Criteria andAttractRentfreeIn(List<String> values) {
            addCriterion("attract_rentfree in", values, "attractRentfree");
            return (Criteria) this;
        }

        public Criteria andAttractRentfreeNotIn(List<String> values) {
            addCriterion("attract_rentfree not in", values, "attractRentfree");
            return (Criteria) this;
        }

        public Criteria andAttractRentfreeBetween(String value1, String value2) {
            addCriterion("attract_rentfree between", value1, value2, "attractRentfree");
            return (Criteria) this;
        }

        public Criteria andAttractRentfreeNotBetween(String value1, String value2) {
            addCriterion("attract_rentfree not between", value1, value2, "attractRentfree");
            return (Criteria) this;
        }

        public Criteria andAttractPhoneIsNull() {
            addCriterion("attract_phone is null");
            return (Criteria) this;
        }

        public Criteria andAttractPhoneIsNotNull() {
            addCriterion("attract_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAttractPhoneEqualTo(String value) {
            addCriterion("attract_phone =", value, "attractPhone");
            return (Criteria) this;
        }

        public Criteria andAttractPhoneNotEqualTo(String value) {
            addCriterion("attract_phone <>", value, "attractPhone");
            return (Criteria) this;
        }

        public Criteria andAttractPhoneGreaterThan(String value) {
            addCriterion("attract_phone >", value, "attractPhone");
            return (Criteria) this;
        }

        public Criteria andAttractPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("attract_phone >=", value, "attractPhone");
            return (Criteria) this;
        }

        public Criteria andAttractPhoneLessThan(String value) {
            addCriterion("attract_phone <", value, "attractPhone");
            return (Criteria) this;
        }

        public Criteria andAttractPhoneLessThanOrEqualTo(String value) {
            addCriterion("attract_phone <=", value, "attractPhone");
            return (Criteria) this;
        }

        public Criteria andAttractPhoneLike(String value) {
            addCriterion("attract_phone like", value, "attractPhone");
            return (Criteria) this;
        }

        public Criteria andAttractPhoneNotLike(String value) {
            addCriterion("attract_phone not like", value, "attractPhone");
            return (Criteria) this;
        }

        public Criteria andAttractPhoneIn(List<String> values) {
            addCriterion("attract_phone in", values, "attractPhone");
            return (Criteria) this;
        }

        public Criteria andAttractPhoneNotIn(List<String> values) {
            addCriterion("attract_phone not in", values, "attractPhone");
            return (Criteria) this;
        }

        public Criteria andAttractPhoneBetween(String value1, String value2) {
            addCriterion("attract_phone between", value1, value2, "attractPhone");
            return (Criteria) this;
        }

        public Criteria andAttractPhoneNotBetween(String value1, String value2) {
            addCriterion("attract_phone not between", value1, value2, "attractPhone");
            return (Criteria) this;
        }

        public Criteria andAttractImgIsNull() {
            addCriterion("attract_img is null");
            return (Criteria) this;
        }

        public Criteria andAttractImgIsNotNull() {
            addCriterion("attract_img is not null");
            return (Criteria) this;
        }

        public Criteria andAttractImgEqualTo(String value) {
            addCriterion("attract_img =", value, "attractImg");
            return (Criteria) this;
        }

        public Criteria andAttractImgNotEqualTo(String value) {
            addCriterion("attract_img <>", value, "attractImg");
            return (Criteria) this;
        }

        public Criteria andAttractImgGreaterThan(String value) {
            addCriterion("attract_img >", value, "attractImg");
            return (Criteria) this;
        }

        public Criteria andAttractImgGreaterThanOrEqualTo(String value) {
            addCriterion("attract_img >=", value, "attractImg");
            return (Criteria) this;
        }

        public Criteria andAttractImgLessThan(String value) {
            addCriterion("attract_img <", value, "attractImg");
            return (Criteria) this;
        }

        public Criteria andAttractImgLessThanOrEqualTo(String value) {
            addCriterion("attract_img <=", value, "attractImg");
            return (Criteria) this;
        }

        public Criteria andAttractImgLike(String value) {
            addCriterion("attract_img like", value, "attractImg");
            return (Criteria) this;
        }

        public Criteria andAttractImgNotLike(String value) {
            addCriterion("attract_img not like", value, "attractImg");
            return (Criteria) this;
        }

        public Criteria andAttractImgIn(List<String> values) {
            addCriterion("attract_img in", values, "attractImg");
            return (Criteria) this;
        }

        public Criteria andAttractImgNotIn(List<String> values) {
            addCriterion("attract_img not in", values, "attractImg");
            return (Criteria) this;
        }

        public Criteria andAttractImgBetween(String value1, String value2) {
            addCriterion("attract_img between", value1, value2, "attractImg");
            return (Criteria) this;
        }

        public Criteria andAttractImgNotBetween(String value1, String value2) {
            addCriterion("attract_img not between", value1, value2, "attractImg");
            return (Criteria) this;
        }

        public Criteria andAttractElevatorIsNull() {
            addCriterion("attract_elevator is null");
            return (Criteria) this;
        }

        public Criteria andAttractElevatorIsNotNull() {
            addCriterion("attract_elevator is not null");
            return (Criteria) this;
        }

        public Criteria andAttractElevatorEqualTo(String value) {
            addCriterion("attract_elevator =", value, "attractElevator");
            return (Criteria) this;
        }

        public Criteria andAttractElevatorNotEqualTo(String value) {
            addCriterion("attract_elevator <>", value, "attractElevator");
            return (Criteria) this;
        }

        public Criteria andAttractElevatorGreaterThan(String value) {
            addCriterion("attract_elevator >", value, "attractElevator");
            return (Criteria) this;
        }

        public Criteria andAttractElevatorGreaterThanOrEqualTo(String value) {
            addCriterion("attract_elevator >=", value, "attractElevator");
            return (Criteria) this;
        }

        public Criteria andAttractElevatorLessThan(String value) {
            addCriterion("attract_elevator <", value, "attractElevator");
            return (Criteria) this;
        }

        public Criteria andAttractElevatorLessThanOrEqualTo(String value) {
            addCriterion("attract_elevator <=", value, "attractElevator");
            return (Criteria) this;
        }

        public Criteria andAttractElevatorLike(String value) {
            addCriterion("attract_elevator like", value, "attractElevator");
            return (Criteria) this;
        }

        public Criteria andAttractElevatorNotLike(String value) {
            addCriterion("attract_elevator not like", value, "attractElevator");
            return (Criteria) this;
        }

        public Criteria andAttractElevatorIn(List<String> values) {
            addCriterion("attract_elevator in", values, "attractElevator");
            return (Criteria) this;
        }

        public Criteria andAttractElevatorNotIn(List<String> values) {
            addCriterion("attract_elevator not in", values, "attractElevator");
            return (Criteria) this;
        }

        public Criteria andAttractElevatorBetween(String value1, String value2) {
            addCriterion("attract_elevator between", value1, value2, "attractElevator");
            return (Criteria) this;
        }

        public Criteria andAttractElevatorNotBetween(String value1, String value2) {
            addCriterion("attract_elevator not between", value1, value2, "attractElevator");
            return (Criteria) this;
        }

        public Criteria andAttractStatusIsNull() {
            addCriterion("attract_status is null");
            return (Criteria) this;
        }

        public Criteria andAttractStatusIsNotNull() {
            addCriterion("attract_status is not null");
            return (Criteria) this;
        }

        public Criteria andAttractStatusEqualTo(String value) {
            addCriterion("attract_status =", value, "attractStatus");
            return (Criteria) this;
        }

        public Criteria andAttractStatusNotEqualTo(String value) {
            addCriterion("attract_status <>", value, "attractStatus");
            return (Criteria) this;
        }

        public Criteria andAttractStatusGreaterThan(String value) {
            addCriterion("attract_status >", value, "attractStatus");
            return (Criteria) this;
        }

        public Criteria andAttractStatusGreaterThanOrEqualTo(String value) {
            addCriterion("attract_status >=", value, "attractStatus");
            return (Criteria) this;
        }

        public Criteria andAttractStatusLessThan(String value) {
            addCriterion("attract_status <", value, "attractStatus");
            return (Criteria) this;
        }

        public Criteria andAttractStatusLessThanOrEqualTo(String value) {
            addCriterion("attract_status <=", value, "attractStatus");
            return (Criteria) this;
        }

        public Criteria andAttractStatusLike(String value) {
            addCriterion("attract_status like", value, "attractStatus");
            return (Criteria) this;
        }

        public Criteria andAttractStatusNotLike(String value) {
            addCriterion("attract_status not like", value, "attractStatus");
            return (Criteria) this;
        }

        public Criteria andAttractStatusIn(List<String> values) {
            addCriterion("attract_status in", values, "attractStatus");
            return (Criteria) this;
        }

        public Criteria andAttractStatusNotIn(List<String> values) {
            addCriterion("attract_status not in", values, "attractStatus");
            return (Criteria) this;
        }

        public Criteria andAttractStatusBetween(String value1, String value2) {
            addCriterion("attract_status between", value1, value2, "attractStatus");
            return (Criteria) this;
        }

        public Criteria andAttractStatusNotBetween(String value1, String value2) {
            addCriterion("attract_status not between", value1, value2, "attractStatus");
            return (Criteria) this;
        }

        public Criteria andAttractCreatedIsNull() {
            addCriterion("attract_created is null");
            return (Criteria) this;
        }

        public Criteria andAttractCreatedIsNotNull() {
            addCriterion("attract_created is not null");
            return (Criteria) this;
        }

        public Criteria andAttractCreatedEqualTo(Date value) {
            addCriterionForJDBCDate("attract_created =", value, "attractCreated");
            return (Criteria) this;
        }

        public Criteria andAttractCreatedNotEqualTo(Date value) {
            addCriterionForJDBCDate("attract_created <>", value, "attractCreated");
            return (Criteria) this;
        }

        public Criteria andAttractCreatedGreaterThan(Date value) {
            addCriterionForJDBCDate("attract_created >", value, "attractCreated");
            return (Criteria) this;
        }

        public Criteria andAttractCreatedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("attract_created >=", value, "attractCreated");
            return (Criteria) this;
        }

        public Criteria andAttractCreatedLessThan(Date value) {
            addCriterionForJDBCDate("attract_created <", value, "attractCreated");
            return (Criteria) this;
        }

        public Criteria andAttractCreatedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("attract_created <=", value, "attractCreated");
            return (Criteria) this;
        }

        public Criteria andAttractCreatedIn(List<Date> values) {
            addCriterionForJDBCDate("attract_created in", values, "attractCreated");
            return (Criteria) this;
        }

        public Criteria andAttractCreatedNotIn(List<Date> values) {
            addCriterionForJDBCDate("attract_created not in", values, "attractCreated");
            return (Criteria) this;
        }

        public Criteria andAttractCreatedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("attract_created between", value1, value2, "attractCreated");
            return (Criteria) this;
        }

        public Criteria andAttractCreatedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("attract_created not between", value1, value2, "attractCreated");
            return (Criteria) this;
        }

        public Criteria andAttractUpdatedIsNull() {
            addCriterion("attract_updated is null");
            return (Criteria) this;
        }

        public Criteria andAttractUpdatedIsNotNull() {
            addCriterion("attract_updated is not null");
            return (Criteria) this;
        }

        public Criteria andAttractUpdatedEqualTo(Date value) {
            addCriterionForJDBCDate("attract_updated =", value, "attractUpdated");
            return (Criteria) this;
        }

        public Criteria andAttractUpdatedNotEqualTo(Date value) {
            addCriterionForJDBCDate("attract_updated <>", value, "attractUpdated");
            return (Criteria) this;
        }

        public Criteria andAttractUpdatedGreaterThan(Date value) {
            addCriterionForJDBCDate("attract_updated >", value, "attractUpdated");
            return (Criteria) this;
        }

        public Criteria andAttractUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("attract_updated >=", value, "attractUpdated");
            return (Criteria) this;
        }

        public Criteria andAttractUpdatedLessThan(Date value) {
            addCriterionForJDBCDate("attract_updated <", value, "attractUpdated");
            return (Criteria) this;
        }

        public Criteria andAttractUpdatedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("attract_updated <=", value, "attractUpdated");
            return (Criteria) this;
        }

        public Criteria andAttractUpdatedIn(List<Date> values) {
            addCriterionForJDBCDate("attract_updated in", values, "attractUpdated");
            return (Criteria) this;
        }

        public Criteria andAttractUpdatedNotIn(List<Date> values) {
            addCriterionForJDBCDate("attract_updated not in", values, "attractUpdated");
            return (Criteria) this;
        }

        public Criteria andAttractUpdatedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("attract_updated between", value1, value2, "attractUpdated");
            return (Criteria) this;
        }

        public Criteria andAttractUpdatedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("attract_updated not between", value1, value2, "attractUpdated");
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