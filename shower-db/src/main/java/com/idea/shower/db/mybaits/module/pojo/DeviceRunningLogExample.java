package com.idea.shower.db.mybaits.module.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceRunningLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceRunningLogExample() {
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

        public Criteria andUpdaterEqualTo(Long value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(Long value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(Long value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(Long value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(Long value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(Long value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<Long> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<Long> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(Long value1, Long value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(Long value1, Long value2) {
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

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Long value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Long value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Long value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Long value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Long value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Long> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Long> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Long value1, Long value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Long value1, Long value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeIsNull() {
            addCriterion("device_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeIsNotNull() {
            addCriterion("device_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeEqualTo(String value) {
            addCriterion("device_code =", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotEqualTo(String value) {
            addCriterion("device_code <>", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeGreaterThan(String value) {
            addCriterion("device_code >", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("device_code >=", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeLessThan(String value) {
            addCriterion("device_code <", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeLessThanOrEqualTo(String value) {
            addCriterion("device_code <=", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeLike(String value) {
            addCriterion("device_code like", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotLike(String value) {
            addCriterion("device_code not like", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeIn(List<String> values) {
            addCriterion("device_code in", values, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotIn(List<String> values) {
            addCriterion("device_code not in", values, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeBetween(String value1, String value2) {
            addCriterion("device_code between", value1, value2, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotBetween(String value1, String value2) {
            addCriterion("device_code not between", value1, value2, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPersonStatusIsNull() {
            addCriterion("person_status is null");
            return (Criteria) this;
        }

        public Criteria andPersonStatusIsNotNull() {
            addCriterion("person_status is not null");
            return (Criteria) this;
        }

        public Criteria andPersonStatusEqualTo(Integer value) {
            addCriterion("person_status =", value, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusNotEqualTo(Integer value) {
            addCriterion("person_status <>", value, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusGreaterThan(Integer value) {
            addCriterion("person_status >", value, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_status >=", value, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusLessThan(Integer value) {
            addCriterion("person_status <", value, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusLessThanOrEqualTo(Integer value) {
            addCriterion("person_status <=", value, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusIn(List<Integer> values) {
            addCriterion("person_status in", values, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusNotIn(List<Integer> values) {
            addCriterion("person_status not in", values, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusBetween(Integer value1, Integer value2) {
            addCriterion("person_status between", value1, value2, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("person_status not between", value1, value2, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonSpeedIsNull() {
            addCriterion("person_speed is null");
            return (Criteria) this;
        }

        public Criteria andPersonSpeedIsNotNull() {
            addCriterion("person_speed is not null");
            return (Criteria) this;
        }

        public Criteria andPersonSpeedEqualTo(Double value) {
            addCriterion("person_speed =", value, "personSpeed");
            return (Criteria) this;
        }

        public Criteria andPersonSpeedNotEqualTo(Double value) {
            addCriterion("person_speed <>", value, "personSpeed");
            return (Criteria) this;
        }

        public Criteria andPersonSpeedGreaterThan(Double value) {
            addCriterion("person_speed >", value, "personSpeed");
            return (Criteria) this;
        }

        public Criteria andPersonSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("person_speed >=", value, "personSpeed");
            return (Criteria) this;
        }

        public Criteria andPersonSpeedLessThan(Double value) {
            addCriterion("person_speed <", value, "personSpeed");
            return (Criteria) this;
        }

        public Criteria andPersonSpeedLessThanOrEqualTo(Double value) {
            addCriterion("person_speed <=", value, "personSpeed");
            return (Criteria) this;
        }

        public Criteria andPersonSpeedIn(List<Double> values) {
            addCriterion("person_speed in", values, "personSpeed");
            return (Criteria) this;
        }

        public Criteria andPersonSpeedNotIn(List<Double> values) {
            addCriterion("person_speed not in", values, "personSpeed");
            return (Criteria) this;
        }

        public Criteria andPersonSpeedBetween(Double value1, Double value2) {
            addCriterion("person_speed between", value1, value2, "personSpeed");
            return (Criteria) this;
        }

        public Criteria andPersonSpeedNotBetween(Double value1, Double value2) {
            addCriterion("person_speed not between", value1, value2, "personSpeed");
            return (Criteria) this;
        }

        public Criteria andTemperature01IsNull() {
            addCriterion("temperature01 is null");
            return (Criteria) this;
        }

        public Criteria andTemperature01IsNotNull() {
            addCriterion("temperature01 is not null");
            return (Criteria) this;
        }

        public Criteria andTemperature01EqualTo(Double value) {
            addCriterion("temperature01 =", value, "temperature01");
            return (Criteria) this;
        }

        public Criteria andTemperature01NotEqualTo(Double value) {
            addCriterion("temperature01 <>", value, "temperature01");
            return (Criteria) this;
        }

        public Criteria andTemperature01GreaterThan(Double value) {
            addCriterion("temperature01 >", value, "temperature01");
            return (Criteria) this;
        }

        public Criteria andTemperature01GreaterThanOrEqualTo(Double value) {
            addCriterion("temperature01 >=", value, "temperature01");
            return (Criteria) this;
        }

        public Criteria andTemperature01LessThan(Double value) {
            addCriterion("temperature01 <", value, "temperature01");
            return (Criteria) this;
        }

        public Criteria andTemperature01LessThanOrEqualTo(Double value) {
            addCriterion("temperature01 <=", value, "temperature01");
            return (Criteria) this;
        }

        public Criteria andTemperature01In(List<Double> values) {
            addCriterion("temperature01 in", values, "temperature01");
            return (Criteria) this;
        }

        public Criteria andTemperature01NotIn(List<Double> values) {
            addCriterion("temperature01 not in", values, "temperature01");
            return (Criteria) this;
        }

        public Criteria andTemperature01Between(Double value1, Double value2) {
            addCriterion("temperature01 between", value1, value2, "temperature01");
            return (Criteria) this;
        }

        public Criteria andTemperature01NotBetween(Double value1, Double value2) {
            addCriterion("temperature01 not between", value1, value2, "temperature01");
            return (Criteria) this;
        }

        public Criteria andTemperature02IsNull() {
            addCriterion("temperature02 is null");
            return (Criteria) this;
        }

        public Criteria andTemperature02IsNotNull() {
            addCriterion("temperature02 is not null");
            return (Criteria) this;
        }

        public Criteria andTemperature02EqualTo(Double value) {
            addCriterion("temperature02 =", value, "temperature02");
            return (Criteria) this;
        }

        public Criteria andTemperature02NotEqualTo(Double value) {
            addCriterion("temperature02 <>", value, "temperature02");
            return (Criteria) this;
        }

        public Criteria andTemperature02GreaterThan(Double value) {
            addCriterion("temperature02 >", value, "temperature02");
            return (Criteria) this;
        }

        public Criteria andTemperature02GreaterThanOrEqualTo(Double value) {
            addCriterion("temperature02 >=", value, "temperature02");
            return (Criteria) this;
        }

        public Criteria andTemperature02LessThan(Double value) {
            addCriterion("temperature02 <", value, "temperature02");
            return (Criteria) this;
        }

        public Criteria andTemperature02LessThanOrEqualTo(Double value) {
            addCriterion("temperature02 <=", value, "temperature02");
            return (Criteria) this;
        }

        public Criteria andTemperature02In(List<Double> values) {
            addCriterion("temperature02 in", values, "temperature02");
            return (Criteria) this;
        }

        public Criteria andTemperature02NotIn(List<Double> values) {
            addCriterion("temperature02 not in", values, "temperature02");
            return (Criteria) this;
        }

        public Criteria andTemperature02Between(Double value1, Double value2) {
            addCriterion("temperature02 between", value1, value2, "temperature02");
            return (Criteria) this;
        }

        public Criteria andTemperature02NotBetween(Double value1, Double value2) {
            addCriterion("temperature02 not between", value1, value2, "temperature02");
            return (Criteria) this;
        }

        public Criteria andVolume01IsNull() {
            addCriterion("volume01 is null");
            return (Criteria) this;
        }

        public Criteria andVolume01IsNotNull() {
            addCriterion("volume01 is not null");
            return (Criteria) this;
        }

        public Criteria andVolume01EqualTo(Double value) {
            addCriterion("volume01 =", value, "volume01");
            return (Criteria) this;
        }

        public Criteria andVolume01NotEqualTo(Double value) {
            addCriterion("volume01 <>", value, "volume01");
            return (Criteria) this;
        }

        public Criteria andVolume01GreaterThan(Double value) {
            addCriterion("volume01 >", value, "volume01");
            return (Criteria) this;
        }

        public Criteria andVolume01GreaterThanOrEqualTo(Double value) {
            addCriterion("volume01 >=", value, "volume01");
            return (Criteria) this;
        }

        public Criteria andVolume01LessThan(Double value) {
            addCriterion("volume01 <", value, "volume01");
            return (Criteria) this;
        }

        public Criteria andVolume01LessThanOrEqualTo(Double value) {
            addCriterion("volume01 <=", value, "volume01");
            return (Criteria) this;
        }

        public Criteria andVolume01In(List<Double> values) {
            addCriterion("volume01 in", values, "volume01");
            return (Criteria) this;
        }

        public Criteria andVolume01NotIn(List<Double> values) {
            addCriterion("volume01 not in", values, "volume01");
            return (Criteria) this;
        }

        public Criteria andVolume01Between(Double value1, Double value2) {
            addCriterion("volume01 between", value1, value2, "volume01");
            return (Criteria) this;
        }

        public Criteria andVolume01NotBetween(Double value1, Double value2) {
            addCriterion("volume01 not between", value1, value2, "volume01");
            return (Criteria) this;
        }

        public Criteria andVolume02IsNull() {
            addCriterion("volume02 is null");
            return (Criteria) this;
        }

        public Criteria andVolume02IsNotNull() {
            addCriterion("volume02 is not null");
            return (Criteria) this;
        }

        public Criteria andVolume02EqualTo(Double value) {
            addCriterion("volume02 =", value, "volume02");
            return (Criteria) this;
        }

        public Criteria andVolume02NotEqualTo(Double value) {
            addCriterion("volume02 <>", value, "volume02");
            return (Criteria) this;
        }

        public Criteria andVolume02GreaterThan(Double value) {
            addCriterion("volume02 >", value, "volume02");
            return (Criteria) this;
        }

        public Criteria andVolume02GreaterThanOrEqualTo(Double value) {
            addCriterion("volume02 >=", value, "volume02");
            return (Criteria) this;
        }

        public Criteria andVolume02LessThan(Double value) {
            addCriterion("volume02 <", value, "volume02");
            return (Criteria) this;
        }

        public Criteria andVolume02LessThanOrEqualTo(Double value) {
            addCriterion("volume02 <=", value, "volume02");
            return (Criteria) this;
        }

        public Criteria andVolume02In(List<Double> values) {
            addCriterion("volume02 in", values, "volume02");
            return (Criteria) this;
        }

        public Criteria andVolume02NotIn(List<Double> values) {
            addCriterion("volume02 not in", values, "volume02");
            return (Criteria) this;
        }

        public Criteria andVolume02Between(Double value1, Double value2) {
            addCriterion("volume02 between", value1, value2, "volume02");
            return (Criteria) this;
        }

        public Criteria andVolume02NotBetween(Double value1, Double value2) {
            addCriterion("volume02 not between", value1, value2, "volume02");
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