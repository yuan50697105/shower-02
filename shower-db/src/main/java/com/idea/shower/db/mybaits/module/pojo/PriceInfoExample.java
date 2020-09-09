package com.idea.shower.db.mybaits.module.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PriceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PriceInfoExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Long value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Long value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Long value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Long value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Long value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Long value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Long> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Long> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Long value1, Long value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Long value1, Long value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPriceCodeIsNull() {
            addCriterion("price_code is null");
            return (Criteria) this;
        }

        public Criteria andPriceCodeIsNotNull() {
            addCriterion("price_code is not null");
            return (Criteria) this;
        }

        public Criteria andPriceCodeEqualTo(String value) {
            addCriterion("price_code =", value, "priceCode");
            return (Criteria) this;
        }

        public Criteria andPriceCodeNotEqualTo(String value) {
            addCriterion("price_code <>", value, "priceCode");
            return (Criteria) this;
        }

        public Criteria andPriceCodeGreaterThan(String value) {
            addCriterion("price_code >", value, "priceCode");
            return (Criteria) this;
        }

        public Criteria andPriceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("price_code >=", value, "priceCode");
            return (Criteria) this;
        }

        public Criteria andPriceCodeLessThan(String value) {
            addCriterion("price_code <", value, "priceCode");
            return (Criteria) this;
        }

        public Criteria andPriceCodeLessThanOrEqualTo(String value) {
            addCriterion("price_code <=", value, "priceCode");
            return (Criteria) this;
        }

        public Criteria andPriceCodeLike(String value) {
            addCriterion("price_code like", value, "priceCode");
            return (Criteria) this;
        }

        public Criteria andPriceCodeNotLike(String value) {
            addCriterion("price_code not like", value, "priceCode");
            return (Criteria) this;
        }

        public Criteria andPriceCodeIn(List<String> values) {
            addCriterion("price_code in", values, "priceCode");
            return (Criteria) this;
        }

        public Criteria andPriceCodeNotIn(List<String> values) {
            addCriterion("price_code not in", values, "priceCode");
            return (Criteria) this;
        }

        public Criteria andPriceCodeBetween(String value1, String value2) {
            addCriterion("price_code between", value1, value2, "priceCode");
            return (Criteria) this;
        }

        public Criteria andPriceCodeNotBetween(String value1, String value2) {
            addCriterion("price_code not between", value1, value2, "priceCode");
            return (Criteria) this;
        }

        public Criteria andTimePriceIsNull() {
            addCriterion("time_price is null");
            return (Criteria) this;
        }

        public Criteria andTimePriceIsNotNull() {
            addCriterion("time_price is not null");
            return (Criteria) this;
        }

        public Criteria andTimePriceEqualTo(BigDecimal value) {
            addCriterion("time_price =", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceNotEqualTo(BigDecimal value) {
            addCriterion("time_price <>", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceGreaterThan(BigDecimal value) {
            addCriterion("time_price >", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("time_price >=", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceLessThan(BigDecimal value) {
            addCriterion("time_price <", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("time_price <=", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceIn(List<BigDecimal> values) {
            addCriterion("time_price in", values, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceNotIn(List<BigDecimal> values) {
            addCriterion("time_price not in", values, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_price between", value1, value2, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_price not between", value1, value2, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalIsNull() {
            addCriterion("time_interval is null");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalIsNotNull() {
            addCriterion("time_interval is not null");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalEqualTo(Double value) {
            addCriterion("time_interval =", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalNotEqualTo(Double value) {
            addCriterion("time_interval <>", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalGreaterThan(Double value) {
            addCriterion("time_interval >", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalGreaterThanOrEqualTo(Double value) {
            addCriterion("time_interval >=", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalLessThan(Double value) {
            addCriterion("time_interval <", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalLessThanOrEqualTo(Double value) {
            addCriterion("time_interval <=", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalIn(List<Double> values) {
            addCriterion("time_interval in", values, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalNotIn(List<Double> values) {
            addCriterion("time_interval not in", values, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalBetween(Double value1, Double value2) {
            addCriterion("time_interval between", value1, value2, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalNotBetween(Double value1, Double value2) {
            addCriterion("time_interval not between", value1, value2, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeUnitIsNull() {
            addCriterion("time_unit is null");
            return (Criteria) this;
        }

        public Criteria andTimeUnitIsNotNull() {
            addCriterion("time_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeUnitEqualTo(Integer value) {
            addCriterion("time_unit =", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotEqualTo(Integer value) {
            addCriterion("time_unit <>", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitGreaterThan(Integer value) {
            addCriterion("time_unit >", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_unit >=", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitLessThan(Integer value) {
            addCriterion("time_unit <", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitLessThanOrEqualTo(Integer value) {
            addCriterion("time_unit <=", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitIn(List<Integer> values) {
            addCriterion("time_unit in", values, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotIn(List<Integer> values) {
            addCriterion("time_unit not in", values, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitBetween(Integer value1, Integer value2) {
            addCriterion("time_unit between", value1, value2, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("time_unit not between", value1, value2, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andWaterPriceIsNull() {
            addCriterion("water_price is null");
            return (Criteria) this;
        }

        public Criteria andWaterPriceIsNotNull() {
            addCriterion("water_price is not null");
            return (Criteria) this;
        }

        public Criteria andWaterPriceEqualTo(BigDecimal value) {
            addCriterion("water_price =", value, "waterPrice");
            return (Criteria) this;
        }

        public Criteria andWaterPriceNotEqualTo(BigDecimal value) {
            addCriterion("water_price <>", value, "waterPrice");
            return (Criteria) this;
        }

        public Criteria andWaterPriceGreaterThan(BigDecimal value) {
            addCriterion("water_price >", value, "waterPrice");
            return (Criteria) this;
        }

        public Criteria andWaterPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("water_price >=", value, "waterPrice");
            return (Criteria) this;
        }

        public Criteria andWaterPriceLessThan(BigDecimal value) {
            addCriterion("water_price <", value, "waterPrice");
            return (Criteria) this;
        }

        public Criteria andWaterPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("water_price <=", value, "waterPrice");
            return (Criteria) this;
        }

        public Criteria andWaterPriceIn(List<BigDecimal> values) {
            addCriterion("water_price in", values, "waterPrice");
            return (Criteria) this;
        }

        public Criteria andWaterPriceNotIn(List<BigDecimal> values) {
            addCriterion("water_price not in", values, "waterPrice");
            return (Criteria) this;
        }

        public Criteria andWaterPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("water_price between", value1, value2, "waterPrice");
            return (Criteria) this;
        }

        public Criteria andWaterPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("water_price not between", value1, value2, "waterPrice");
            return (Criteria) this;
        }

        public Criteria andWaterIntervalIsNull() {
            addCriterion("water_interval is null");
            return (Criteria) this;
        }

        public Criteria andWaterIntervalIsNotNull() {
            addCriterion("water_interval is not null");
            return (Criteria) this;
        }

        public Criteria andWaterIntervalEqualTo(Double value) {
            addCriterion("water_interval =", value, "waterInterval");
            return (Criteria) this;
        }

        public Criteria andWaterIntervalNotEqualTo(Double value) {
            addCriterion("water_interval <>", value, "waterInterval");
            return (Criteria) this;
        }

        public Criteria andWaterIntervalGreaterThan(Double value) {
            addCriterion("water_interval >", value, "waterInterval");
            return (Criteria) this;
        }

        public Criteria andWaterIntervalGreaterThanOrEqualTo(Double value) {
            addCriterion("water_interval >=", value, "waterInterval");
            return (Criteria) this;
        }

        public Criteria andWaterIntervalLessThan(Double value) {
            addCriterion("water_interval <", value, "waterInterval");
            return (Criteria) this;
        }

        public Criteria andWaterIntervalLessThanOrEqualTo(Double value) {
            addCriterion("water_interval <=", value, "waterInterval");
            return (Criteria) this;
        }

        public Criteria andWaterIntervalIn(List<Double> values) {
            addCriterion("water_interval in", values, "waterInterval");
            return (Criteria) this;
        }

        public Criteria andWaterIntervalNotIn(List<Double> values) {
            addCriterion("water_interval not in", values, "waterInterval");
            return (Criteria) this;
        }

        public Criteria andWaterIntervalBetween(Double value1, Double value2) {
            addCriterion("water_interval between", value1, value2, "waterInterval");
            return (Criteria) this;
        }

        public Criteria andWaterIntervalNotBetween(Double value1, Double value2) {
            addCriterion("water_interval not between", value1, value2, "waterInterval");
            return (Criteria) this;
        }

        public Criteria andWaterUnitIsNull() {
            addCriterion("water_unit is null");
            return (Criteria) this;
        }

        public Criteria andWaterUnitIsNotNull() {
            addCriterion("water_unit is not null");
            return (Criteria) this;
        }

        public Criteria andWaterUnitEqualTo(Integer value) {
            addCriterion("water_unit =", value, "waterUnit");
            return (Criteria) this;
        }

        public Criteria andWaterUnitNotEqualTo(Integer value) {
            addCriterion("water_unit <>", value, "waterUnit");
            return (Criteria) this;
        }

        public Criteria andWaterUnitGreaterThan(Integer value) {
            addCriterion("water_unit >", value, "waterUnit");
            return (Criteria) this;
        }

        public Criteria andWaterUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("water_unit >=", value, "waterUnit");
            return (Criteria) this;
        }

        public Criteria andWaterUnitLessThan(Integer value) {
            addCriterion("water_unit <", value, "waterUnit");
            return (Criteria) this;
        }

        public Criteria andWaterUnitLessThanOrEqualTo(Integer value) {
            addCriterion("water_unit <=", value, "waterUnit");
            return (Criteria) this;
        }

        public Criteria andWaterUnitIn(List<Integer> values) {
            addCriterion("water_unit in", values, "waterUnit");
            return (Criteria) this;
        }

        public Criteria andWaterUnitNotIn(List<Integer> values) {
            addCriterion("water_unit not in", values, "waterUnit");
            return (Criteria) this;
        }

        public Criteria andWaterUnitBetween(Integer value1, Integer value2) {
            addCriterion("water_unit between", value1, value2, "waterUnit");
            return (Criteria) this;
        }

        public Criteria andWaterUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("water_unit not between", value1, value2, "waterUnit");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Integer value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Integer value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Integer value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Integer value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Integer value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Integer> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Integer> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Integer value1, Integer value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Integer value1, Integer value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private final String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private final String typeHandler;

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