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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
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