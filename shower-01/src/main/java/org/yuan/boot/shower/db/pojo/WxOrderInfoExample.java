package org.yuan.boot.shower.db.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WxOrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxOrderInfoExample() {
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

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdIsNull() {
            addCriterion("customer_open_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdIsNotNull() {
            addCriterion("customer_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdEqualTo(String value) {
            addCriterion("customer_open_id =", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdNotEqualTo(String value) {
            addCriterion("customer_open_id <>", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdGreaterThan(String value) {
            addCriterion("customer_open_id >", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_open_id >=", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdLessThan(String value) {
            addCriterion("customer_open_id <", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdLessThanOrEqualTo(String value) {
            addCriterion("customer_open_id <=", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdLike(String value) {
            addCriterion("customer_open_id like", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdNotLike(String value) {
            addCriterion("customer_open_id not like", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdIn(List<String> values) {
            addCriterion("customer_open_id in", values, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdNotIn(List<String> values) {
            addCriterion("customer_open_id not in", values, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdBetween(String value1, String value2) {
            addCriterion("customer_open_id between", value1, value2, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdNotBetween(String value1, String value2) {
            addCriterion("customer_open_id not between", value1, value2, "customerOpenId");
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

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPredicatePayTimeIsNull() {
            addCriterion("predicate_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPredicatePayTimeIsNotNull() {
            addCriterion("predicate_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPredicatePayTimeEqualTo(Date value) {
            addCriterion("predicate_pay_time =", value, "predicatePayTime");
            return (Criteria) this;
        }

        public Criteria andPredicatePayTimeNotEqualTo(Date value) {
            addCriterion("predicate_pay_time <>", value, "predicatePayTime");
            return (Criteria) this;
        }

        public Criteria andPredicatePayTimeGreaterThan(Date value) {
            addCriterion("predicate_pay_time >", value, "predicatePayTime");
            return (Criteria) this;
        }

        public Criteria andPredicatePayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("predicate_pay_time >=", value, "predicatePayTime");
            return (Criteria) this;
        }

        public Criteria andPredicatePayTimeLessThan(Date value) {
            addCriterion("predicate_pay_time <", value, "predicatePayTime");
            return (Criteria) this;
        }

        public Criteria andPredicatePayTimeLessThanOrEqualTo(Date value) {
            addCriterion("predicate_pay_time <=", value, "predicatePayTime");
            return (Criteria) this;
        }

        public Criteria andPredicatePayTimeIn(List<Date> values) {
            addCriterion("predicate_pay_time in", values, "predicatePayTime");
            return (Criteria) this;
        }

        public Criteria andPredicatePayTimeNotIn(List<Date> values) {
            addCriterion("predicate_pay_time not in", values, "predicatePayTime");
            return (Criteria) this;
        }

        public Criteria andPredicatePayTimeBetween(Date value1, Date value2) {
            addCriterion("predicate_pay_time between", value1, value2, "predicatePayTime");
            return (Criteria) this;
        }

        public Criteria andPredicatePayTimeNotBetween(Date value1, Date value2) {
            addCriterion("predicate_pay_time not between", value1, value2, "predicatePayTime");
            return (Criteria) this;
        }

        public Criteria andFinalPayTimeIsNull() {
            addCriterion("final_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andFinalPayTimeIsNotNull() {
            addCriterion("final_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinalPayTimeEqualTo(Date value) {
            addCriterion("final_pay_time =", value, "finalPayTime");
            return (Criteria) this;
        }

        public Criteria andFinalPayTimeNotEqualTo(Date value) {
            addCriterion("final_pay_time <>", value, "finalPayTime");
            return (Criteria) this;
        }

        public Criteria andFinalPayTimeGreaterThan(Date value) {
            addCriterion("final_pay_time >", value, "finalPayTime");
            return (Criteria) this;
        }

        public Criteria andFinalPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("final_pay_time >=", value, "finalPayTime");
            return (Criteria) this;
        }

        public Criteria andFinalPayTimeLessThan(Date value) {
            addCriterion("final_pay_time <", value, "finalPayTime");
            return (Criteria) this;
        }

        public Criteria andFinalPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("final_pay_time <=", value, "finalPayTime");
            return (Criteria) this;
        }

        public Criteria andFinalPayTimeIn(List<Date> values) {
            addCriterion("final_pay_time in", values, "finalPayTime");
            return (Criteria) this;
        }

        public Criteria andFinalPayTimeNotIn(List<Date> values) {
            addCriterion("final_pay_time not in", values, "finalPayTime");
            return (Criteria) this;
        }

        public Criteria andFinalPayTimeBetween(Date value1, Date value2) {
            addCriterion("final_pay_time between", value1, value2, "finalPayTime");
            return (Criteria) this;
        }

        public Criteria andFinalPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("final_pay_time not between", value1, value2, "finalPayTime");
            return (Criteria) this;
        }

        public Criteria andPredicateDecimalIsNull() {
            addCriterion("predicate_decimal is null");
            return (Criteria) this;
        }

        public Criteria andPredicateDecimalIsNotNull() {
            addCriterion("predicate_decimal is not null");
            return (Criteria) this;
        }

        public Criteria andPredicateDecimalEqualTo(BigDecimal value) {
            addCriterion("predicate_decimal =", value, "predicateDecimal");
            return (Criteria) this;
        }

        public Criteria andPredicateDecimalNotEqualTo(BigDecimal value) {
            addCriterion("predicate_decimal <>", value, "predicateDecimal");
            return (Criteria) this;
        }

        public Criteria andPredicateDecimalGreaterThan(BigDecimal value) {
            addCriterion("predicate_decimal >", value, "predicateDecimal");
            return (Criteria) this;
        }

        public Criteria andPredicateDecimalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("predicate_decimal >=", value, "predicateDecimal");
            return (Criteria) this;
        }

        public Criteria andPredicateDecimalLessThan(BigDecimal value) {
            addCriterion("predicate_decimal <", value, "predicateDecimal");
            return (Criteria) this;
        }

        public Criteria andPredicateDecimalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("predicate_decimal <=", value, "predicateDecimal");
            return (Criteria) this;
        }

        public Criteria andPredicateDecimalIn(List<BigDecimal> values) {
            addCriterion("predicate_decimal in", values, "predicateDecimal");
            return (Criteria) this;
        }

        public Criteria andPredicateDecimalNotIn(List<BigDecimal> values) {
            addCriterion("predicate_decimal not in", values, "predicateDecimal");
            return (Criteria) this;
        }

        public Criteria andPredicateDecimalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predicate_decimal between", value1, value2, "predicateDecimal");
            return (Criteria) this;
        }

        public Criteria andPredicateDecimalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predicate_decimal not between", value1, value2, "predicateDecimal");
            return (Criteria) this;
        }

        public Criteria andRemainDecimalIsNull() {
            addCriterion("remain_decimal is null");
            return (Criteria) this;
        }

        public Criteria andRemainDecimalIsNotNull() {
            addCriterion("remain_decimal is not null");
            return (Criteria) this;
        }

        public Criteria andRemainDecimalEqualTo(BigDecimal value) {
            addCriterion("remain_decimal =", value, "remainDecimal");
            return (Criteria) this;
        }

        public Criteria andRemainDecimalNotEqualTo(BigDecimal value) {
            addCriterion("remain_decimal <>", value, "remainDecimal");
            return (Criteria) this;
        }

        public Criteria andRemainDecimalGreaterThan(BigDecimal value) {
            addCriterion("remain_decimal >", value, "remainDecimal");
            return (Criteria) this;
        }

        public Criteria andRemainDecimalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_decimal >=", value, "remainDecimal");
            return (Criteria) this;
        }

        public Criteria andRemainDecimalLessThan(BigDecimal value) {
            addCriterion("remain_decimal <", value, "remainDecimal");
            return (Criteria) this;
        }

        public Criteria andRemainDecimalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_decimal <=", value, "remainDecimal");
            return (Criteria) this;
        }

        public Criteria andRemainDecimalIn(List<BigDecimal> values) {
            addCriterion("remain_decimal in", values, "remainDecimal");
            return (Criteria) this;
        }

        public Criteria andRemainDecimalNotIn(List<BigDecimal> values) {
            addCriterion("remain_decimal not in", values, "remainDecimal");
            return (Criteria) this;
        }

        public Criteria andRemainDecimalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_decimal between", value1, value2, "remainDecimal");
            return (Criteria) this;
        }

        public Criteria andRemainDecimalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_decimal not between", value1, value2, "remainDecimal");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeIsNull() {
            addCriterion("spend_time is null");
            return (Criteria) this;
        }

        public Criteria andSpendTimeIsNotNull() {
            addCriterion("spend_time is not null");
            return (Criteria) this;
        }

        public Criteria andSpendTimeEqualTo(BigDecimal value) {
            addCriterion("spend_time =", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeNotEqualTo(BigDecimal value) {
            addCriterion("spend_time <>", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeGreaterThan(BigDecimal value) {
            addCriterion("spend_time >", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("spend_time >=", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeLessThan(BigDecimal value) {
            addCriterion("spend_time <", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("spend_time <=", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeIn(List<BigDecimal> values) {
            addCriterion("spend_time in", values, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeNotIn(List<BigDecimal> values) {
            addCriterion("spend_time not in", values, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spend_time between", value1, value2, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spend_time not between", value1, value2, "spendTime");
            return (Criteria) this;
        }

        public Criteria andMinDecimalIsNull() {
            addCriterion("min_decimal is null");
            return (Criteria) this;
        }

        public Criteria andMinDecimalIsNotNull() {
            addCriterion("min_decimal is not null");
            return (Criteria) this;
        }

        public Criteria andMinDecimalEqualTo(BigDecimal value) {
            addCriterion("min_decimal =", value, "minDecimal");
            return (Criteria) this;
        }

        public Criteria andMinDecimalNotEqualTo(BigDecimal value) {
            addCriterion("min_decimal <>", value, "minDecimal");
            return (Criteria) this;
        }

        public Criteria andMinDecimalGreaterThan(BigDecimal value) {
            addCriterion("min_decimal >", value, "minDecimal");
            return (Criteria) this;
        }

        public Criteria andMinDecimalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_decimal >=", value, "minDecimal");
            return (Criteria) this;
        }

        public Criteria andMinDecimalLessThan(BigDecimal value) {
            addCriterion("min_decimal <", value, "minDecimal");
            return (Criteria) this;
        }

        public Criteria andMinDecimalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_decimal <=", value, "minDecimal");
            return (Criteria) this;
        }

        public Criteria andMinDecimalIn(List<BigDecimal> values) {
            addCriterion("min_decimal in", values, "minDecimal");
            return (Criteria) this;
        }

        public Criteria andMinDecimalNotIn(List<BigDecimal> values) {
            addCriterion("min_decimal not in", values, "minDecimal");
            return (Criteria) this;
        }

        public Criteria andMinDecimalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_decimal between", value1, value2, "minDecimal");
            return (Criteria) this;
        }

        public Criteria andMinDecimalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_decimal not between", value1, value2, "minDecimal");
            return (Criteria) this;
        }

        public Criteria andPerDecimalIsNull() {
            addCriterion("per_decimal is null");
            return (Criteria) this;
        }

        public Criteria andPerDecimalIsNotNull() {
            addCriterion("per_decimal is not null");
            return (Criteria) this;
        }

        public Criteria andPerDecimalEqualTo(BigDecimal value) {
            addCriterion("per_decimal =", value, "perDecimal");
            return (Criteria) this;
        }

        public Criteria andPerDecimalNotEqualTo(BigDecimal value) {
            addCriterion("per_decimal <>", value, "perDecimal");
            return (Criteria) this;
        }

        public Criteria andPerDecimalGreaterThan(BigDecimal value) {
            addCriterion("per_decimal >", value, "perDecimal");
            return (Criteria) this;
        }

        public Criteria andPerDecimalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("per_decimal >=", value, "perDecimal");
            return (Criteria) this;
        }

        public Criteria andPerDecimalLessThan(BigDecimal value) {
            addCriterion("per_decimal <", value, "perDecimal");
            return (Criteria) this;
        }

        public Criteria andPerDecimalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("per_decimal <=", value, "perDecimal");
            return (Criteria) this;
        }

        public Criteria andPerDecimalIn(List<BigDecimal> values) {
            addCriterion("per_decimal in", values, "perDecimal");
            return (Criteria) this;
        }

        public Criteria andPerDecimalNotIn(List<BigDecimal> values) {
            addCriterion("per_decimal not in", values, "perDecimal");
            return (Criteria) this;
        }

        public Criteria andPerDecimalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("per_decimal between", value1, value2, "perDecimal");
            return (Criteria) this;
        }

        public Criteria andPerDecimalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("per_decimal not between", value1, value2, "perDecimal");
            return (Criteria) this;
        }

        public Criteria andExtDecimalIsNull() {
            addCriterion("ext_decimal is null");
            return (Criteria) this;
        }

        public Criteria andExtDecimalIsNotNull() {
            addCriterion("ext_decimal is not null");
            return (Criteria) this;
        }

        public Criteria andExtDecimalEqualTo(BigDecimal value) {
            addCriterion("ext_decimal =", value, "extDecimal");
            return (Criteria) this;
        }

        public Criteria andExtDecimalNotEqualTo(BigDecimal value) {
            addCriterion("ext_decimal <>", value, "extDecimal");
            return (Criteria) this;
        }

        public Criteria andExtDecimalGreaterThan(BigDecimal value) {
            addCriterion("ext_decimal >", value, "extDecimal");
            return (Criteria) this;
        }

        public Criteria andExtDecimalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ext_decimal >=", value, "extDecimal");
            return (Criteria) this;
        }

        public Criteria andExtDecimalLessThan(BigDecimal value) {
            addCriterion("ext_decimal <", value, "extDecimal");
            return (Criteria) this;
        }

        public Criteria andExtDecimalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ext_decimal <=", value, "extDecimal");
            return (Criteria) this;
        }

        public Criteria andExtDecimalIn(List<BigDecimal> values) {
            addCriterion("ext_decimal in", values, "extDecimal");
            return (Criteria) this;
        }

        public Criteria andExtDecimalNotIn(List<BigDecimal> values) {
            addCriterion("ext_decimal not in", values, "extDecimal");
            return (Criteria) this;
        }

        public Criteria andExtDecimalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ext_decimal between", value1, value2, "extDecimal");
            return (Criteria) this;
        }

        public Criteria andExtDecimalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ext_decimal not between", value1, value2, "extDecimal");
            return (Criteria) this;
        }

        public Criteria andTotalDecimalIsNull() {
            addCriterion("total_decimal is null");
            return (Criteria) this;
        }

        public Criteria andTotalDecimalIsNotNull() {
            addCriterion("total_decimal is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDecimalEqualTo(BigDecimal value) {
            addCriterion("total_decimal =", value, "totalDecimal");
            return (Criteria) this;
        }

        public Criteria andTotalDecimalNotEqualTo(BigDecimal value) {
            addCriterion("total_decimal <>", value, "totalDecimal");
            return (Criteria) this;
        }

        public Criteria andTotalDecimalGreaterThan(BigDecimal value) {
            addCriterion("total_decimal >", value, "totalDecimal");
            return (Criteria) this;
        }

        public Criteria andTotalDecimalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_decimal >=", value, "totalDecimal");
            return (Criteria) this;
        }

        public Criteria andTotalDecimalLessThan(BigDecimal value) {
            addCriterion("total_decimal <", value, "totalDecimal");
            return (Criteria) this;
        }

        public Criteria andTotalDecimalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_decimal <=", value, "totalDecimal");
            return (Criteria) this;
        }

        public Criteria andTotalDecimalIn(List<BigDecimal> values) {
            addCriterion("total_decimal in", values, "totalDecimal");
            return (Criteria) this;
        }

        public Criteria andTotalDecimalNotIn(List<BigDecimal> values) {
            addCriterion("total_decimal not in", values, "totalDecimal");
            return (Criteria) this;
        }

        public Criteria andTotalDecimalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_decimal between", value1, value2, "totalDecimal");
            return (Criteria) this;
        }

        public Criteria andTotalDecimalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_decimal not between", value1, value2, "totalDecimal");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Date value) {
            addCriterion("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Date value) {
            addCriterion("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Date value) {
            addCriterion("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Date value) {
            addCriterion("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Date> values) {
            addCriterion("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Date> values) {
            addCriterion("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Date value1, Date value2) {
            addCriterion("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("leave_time not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIsNull() {
            addCriterion("crate_time is null");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIsNotNull() {
            addCriterion("crate_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrateTimeEqualTo(Date value) {
            addCriterion("crate_time =", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotEqualTo(Date value) {
            addCriterion("crate_time <>", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeGreaterThan(Date value) {
            addCriterion("crate_time >", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crate_time >=", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeLessThan(Date value) {
            addCriterion("crate_time <", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeLessThanOrEqualTo(Date value) {
            addCriterion("crate_time <=", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIn(List<Date> values) {
            addCriterion("crate_time in", values, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotIn(List<Date> values) {
            addCriterion("crate_time not in", values, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeBetween(Date value1, Date value2) {
            addCriterion("crate_time between", value1, value2, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotBetween(Date value1, Date value2) {
            addCriterion("crate_time not between", value1, value2, "crateTime");
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