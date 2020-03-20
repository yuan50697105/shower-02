package com.idea.shower.app.commons.db.module.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderItemExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andCustomerUnionIdIsNull() {
            addCriterion("customer_union_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerUnionIdIsNotNull() {
            addCriterion("customer_union_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerUnionIdEqualTo(String value) {
            addCriterion("customer_union_id =", value, "customerUnionId");
            return (Criteria) this;
        }

        public Criteria andCustomerUnionIdNotEqualTo(String value) {
            addCriterion("customer_union_id <>", value, "customerUnionId");
            return (Criteria) this;
        }

        public Criteria andCustomerUnionIdGreaterThan(String value) {
            addCriterion("customer_union_id >", value, "customerUnionId");
            return (Criteria) this;
        }

        public Criteria andCustomerUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_union_id >=", value, "customerUnionId");
            return (Criteria) this;
        }

        public Criteria andCustomerUnionIdLessThan(String value) {
            addCriterion("customer_union_id <", value, "customerUnionId");
            return (Criteria) this;
        }

        public Criteria andCustomerUnionIdLessThanOrEqualTo(String value) {
            addCriterion("customer_union_id <=", value, "customerUnionId");
            return (Criteria) this;
        }

        public Criteria andCustomerUnionIdLike(String value) {
            addCriterion("customer_union_id like", value, "customerUnionId");
            return (Criteria) this;
        }

        public Criteria andCustomerUnionIdNotLike(String value) {
            addCriterion("customer_union_id not like", value, "customerUnionId");
            return (Criteria) this;
        }

        public Criteria andCustomerUnionIdIn(List<String> values) {
            addCriterion("customer_union_id in", values, "customerUnionId");
            return (Criteria) this;
        }

        public Criteria andCustomerUnionIdNotIn(List<String> values) {
            addCriterion("customer_union_id not in", values, "customerUnionId");
            return (Criteria) this;
        }

        public Criteria andCustomerUnionIdBetween(String value1, String value2) {
            addCriterion("customer_union_id between", value1, value2, "customerUnionId");
            return (Criteria) this;
        }

        public Criteria andCustomerUnionIdNotBetween(String value1, String value2) {
            addCriterion("customer_union_id not between", value1, value2, "customerUnionId");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameIsNull() {
            addCriterion("customer_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameIsNotNull() {
            addCriterion("customer_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameEqualTo(String value) {
            addCriterion("customer_nick_name =", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameNotEqualTo(String value) {
            addCriterion("customer_nick_name <>", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameGreaterThan(String value) {
            addCriterion("customer_nick_name >", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_nick_name >=", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameLessThan(String value) {
            addCriterion("customer_nick_name <", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameLessThanOrEqualTo(String value) {
            addCriterion("customer_nick_name <=", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameLike(String value) {
            addCriterion("customer_nick_name like", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameNotLike(String value) {
            addCriterion("customer_nick_name not like", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameIn(List<String> values) {
            addCriterion("customer_nick_name in", values, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameNotIn(List<String> values) {
            addCriterion("customer_nick_name not in", values, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameBetween(String value1, String value2) {
            addCriterion("customer_nick_name between", value1, value2, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameNotBetween(String value1, String value2) {
            addCriterion("customer_nick_name not between", value1, value2, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(Integer value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(Integer value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(Integer value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(Integer value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<Integer> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<Integer> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(Integer value1, Integer value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemOrderNoIsNull() {
            addCriterion("item_order_no is null");
            return (Criteria) this;
        }

        public Criteria andItemOrderNoIsNotNull() {
            addCriterion("item_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andItemOrderNoEqualTo(String value) {
            addCriterion("item_order_no =", value, "itemOrderNo");
            return (Criteria) this;
        }

        public Criteria andItemOrderNoNotEqualTo(String value) {
            addCriterion("item_order_no <>", value, "itemOrderNo");
            return (Criteria) this;
        }

        public Criteria andItemOrderNoGreaterThan(String value) {
            addCriterion("item_order_no >", value, "itemOrderNo");
            return (Criteria) this;
        }

        public Criteria andItemOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("item_order_no >=", value, "itemOrderNo");
            return (Criteria) this;
        }

        public Criteria andItemOrderNoLessThan(String value) {
            addCriterion("item_order_no <", value, "itemOrderNo");
            return (Criteria) this;
        }

        public Criteria andItemOrderNoLessThanOrEqualTo(String value) {
            addCriterion("item_order_no <=", value, "itemOrderNo");
            return (Criteria) this;
        }

        public Criteria andItemOrderNoLike(String value) {
            addCriterion("item_order_no like", value, "itemOrderNo");
            return (Criteria) this;
        }

        public Criteria andItemOrderNoNotLike(String value) {
            addCriterion("item_order_no not like", value, "itemOrderNo");
            return (Criteria) this;
        }

        public Criteria andItemOrderNoIn(List<String> values) {
            addCriterion("item_order_no in", values, "itemOrderNo");
            return (Criteria) this;
        }

        public Criteria andItemOrderNoNotIn(List<String> values) {
            addCriterion("item_order_no not in", values, "itemOrderNo");
            return (Criteria) this;
        }

        public Criteria andItemOrderNoBetween(String value1, String value2) {
            addCriterion("item_order_no between", value1, value2, "itemOrderNo");
            return (Criteria) this;
        }

        public Criteria andItemOrderNoNotBetween(String value1, String value2) {
            addCriterion("item_order_no not between", value1, value2, "itemOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("device_type is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("device_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(Integer value) {
            addCriterion("device_type =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(Integer value) {
            addCriterion("device_type <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(Integer value) {
            addCriterion("device_type >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_type >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(Integer value) {
            addCriterion("device_type <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("device_type <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<Integer> values) {
            addCriterion("device_type in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<Integer> values) {
            addCriterion("device_type not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(Integer value1, Integer value2) {
            addCriterion("device_type between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_type not between", value1, value2, "deviceType");
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

        public Criteria andRangeCodeIsNull() {
            addCriterion("range_code is null");
            return (Criteria) this;
        }

        public Criteria andRangeCodeIsNotNull() {
            addCriterion("range_code is not null");
            return (Criteria) this;
        }

        public Criteria andRangeCodeEqualTo(String value) {
            addCriterion("range_code =", value, "rangeCode");
            return (Criteria) this;
        }

        public Criteria andRangeCodeNotEqualTo(String value) {
            addCriterion("range_code <>", value, "rangeCode");
            return (Criteria) this;
        }

        public Criteria andRangeCodeGreaterThan(String value) {
            addCriterion("range_code >", value, "rangeCode");
            return (Criteria) this;
        }

        public Criteria andRangeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("range_code >=", value, "rangeCode");
            return (Criteria) this;
        }

        public Criteria andRangeCodeLessThan(String value) {
            addCriterion("range_code <", value, "rangeCode");
            return (Criteria) this;
        }

        public Criteria andRangeCodeLessThanOrEqualTo(String value) {
            addCriterion("range_code <=", value, "rangeCode");
            return (Criteria) this;
        }

        public Criteria andRangeCodeLike(String value) {
            addCriterion("range_code like", value, "rangeCode");
            return (Criteria) this;
        }

        public Criteria andRangeCodeNotLike(String value) {
            addCriterion("range_code not like", value, "rangeCode");
            return (Criteria) this;
        }

        public Criteria andRangeCodeIn(List<String> values) {
            addCriterion("range_code in", values, "rangeCode");
            return (Criteria) this;
        }

        public Criteria andRangeCodeNotIn(List<String> values) {
            addCriterion("range_code not in", values, "rangeCode");
            return (Criteria) this;
        }

        public Criteria andRangeCodeBetween(String value1, String value2) {
            addCriterion("range_code between", value1, value2, "rangeCode");
            return (Criteria) this;
        }

        public Criteria andRangeCodeNotBetween(String value1, String value2) {
            addCriterion("range_code not between", value1, value2, "rangeCode");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdIsNull() {
            addCriterion("goods_info_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdIsNotNull() {
            addCriterion("goods_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdEqualTo(Long value) {
            addCriterion("goods_info_id =", value, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdNotEqualTo(Long value) {
            addCriterion("goods_info_id <>", value, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdGreaterThan(Long value) {
            addCriterion("goods_info_id >", value, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_info_id >=", value, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdLessThan(Long value) {
            addCriterion("goods_info_id <", value, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_info_id <=", value, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdIn(List<Long> values) {
            addCriterion("goods_info_id in", values, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdNotIn(List<Long> values) {
            addCriterion("goods_info_id not in", values, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdBetween(Long value1, Long value2) {
            addCriterion("goods_info_id between", value1, value2, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_info_id not between", value1, value2, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoCodeIsNull() {
            addCriterion("goods_info_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoCodeIsNotNull() {
            addCriterion("goods_info_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoCodeEqualTo(String value) {
            addCriterion("goods_info_code =", value, "goodsInfoCode");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoCodeNotEqualTo(String value) {
            addCriterion("goods_info_code <>", value, "goodsInfoCode");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoCodeGreaterThan(String value) {
            addCriterion("goods_info_code >", value, "goodsInfoCode");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_info_code >=", value, "goodsInfoCode");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoCodeLessThan(String value) {
            addCriterion("goods_info_code <", value, "goodsInfoCode");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_info_code <=", value, "goodsInfoCode");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoCodeLike(String value) {
            addCriterion("goods_info_code like", value, "goodsInfoCode");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoCodeNotLike(String value) {
            addCriterion("goods_info_code not like", value, "goodsInfoCode");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoCodeIn(List<String> values) {
            addCriterion("goods_info_code in", values, "goodsInfoCode");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoCodeNotIn(List<String> values) {
            addCriterion("goods_info_code not in", values, "goodsInfoCode");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoCodeBetween(String value1, String value2) {
            addCriterion("goods_info_code between", value1, value2, "goodsInfoCode");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoCodeNotBetween(String value1, String value2) {
            addCriterion("goods_info_code not between", value1, value2, "goodsInfoCode");
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

        public Criteria andTimeIntervalEqualTo(BigDecimal value) {
            addCriterion("time_interval =", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalNotEqualTo(BigDecimal value) {
            addCriterion("time_interval <>", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalGreaterThan(BigDecimal value) {
            addCriterion("time_interval >", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("time_interval >=", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalLessThan(BigDecimal value) {
            addCriterion("time_interval <", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("time_interval <=", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalIn(List<BigDecimal> values) {
            addCriterion("time_interval in", values, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalNotIn(List<BigDecimal> values) {
            addCriterion("time_interval not in", values, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_interval between", value1, value2, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_interval not between", value1, value2, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeTotalPriceIsNull() {
            addCriterion("time_total_price is null");
            return (Criteria) this;
        }

        public Criteria andTimeTotalPriceIsNotNull() {
            addCriterion("time_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTimeTotalPriceEqualTo(BigDecimal value) {
            addCriterion("time_total_price =", value, "timeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTimeTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("time_total_price <>", value, "timeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTimeTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("time_total_price >", value, "timeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTimeTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("time_total_price >=", value, "timeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTimeTotalPriceLessThan(BigDecimal value) {
            addCriterion("time_total_price <", value, "timeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTimeTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("time_total_price <=", value, "timeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTimeTotalPriceIn(List<BigDecimal> values) {
            addCriterion("time_total_price in", values, "timeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTimeTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("time_total_price not in", values, "timeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTimeTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_total_price between", value1, value2, "timeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTimeTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_total_price not between", value1, value2, "timeTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceUnitIsNull() {
            addCriterion("time_price_unit is null");
            return (Criteria) this;
        }

        public Criteria andTimePriceUnitIsNotNull() {
            addCriterion("time_price_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTimePriceUnitEqualTo(Integer value) {
            addCriterion("time_price_unit =", value, "timePriceUnit");
            return (Criteria) this;
        }

        public Criteria andTimePriceUnitNotEqualTo(Integer value) {
            addCriterion("time_price_unit <>", value, "timePriceUnit");
            return (Criteria) this;
        }

        public Criteria andTimePriceUnitGreaterThan(Integer value) {
            addCriterion("time_price_unit >", value, "timePriceUnit");
            return (Criteria) this;
        }

        public Criteria andTimePriceUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_price_unit >=", value, "timePriceUnit");
            return (Criteria) this;
        }

        public Criteria andTimePriceUnitLessThan(Integer value) {
            addCriterion("time_price_unit <", value, "timePriceUnit");
            return (Criteria) this;
        }

        public Criteria andTimePriceUnitLessThanOrEqualTo(Integer value) {
            addCriterion("time_price_unit <=", value, "timePriceUnit");
            return (Criteria) this;
        }

        public Criteria andTimePriceUnitIn(List<Integer> values) {
            addCriterion("time_price_unit in", values, "timePriceUnit");
            return (Criteria) this;
        }

        public Criteria andTimePriceUnitNotIn(List<Integer> values) {
            addCriterion("time_price_unit not in", values, "timePriceUnit");
            return (Criteria) this;
        }

        public Criteria andTimePriceUnitBetween(Integer value1, Integer value2) {
            addCriterion("time_price_unit between", value1, value2, "timePriceUnit");
            return (Criteria) this;
        }

        public Criteria andTimePriceUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("time_price_unit not between", value1, value2, "timePriceUnit");
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

        public Criteria andTimeUseAmountIsNull() {
            addCriterion("time_use_amount is null");
            return (Criteria) this;
        }

        public Criteria andTimeUseAmountIsNotNull() {
            addCriterion("time_use_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTimeUseAmountEqualTo(BigDecimal value) {
            addCriterion("time_use_amount =", value, "timeUseAmount");
            return (Criteria) this;
        }

        public Criteria andTimeUseAmountNotEqualTo(BigDecimal value) {
            addCriterion("time_use_amount <>", value, "timeUseAmount");
            return (Criteria) this;
        }

        public Criteria andTimeUseAmountGreaterThan(BigDecimal value) {
            addCriterion("time_use_amount >", value, "timeUseAmount");
            return (Criteria) this;
        }

        public Criteria andTimeUseAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("time_use_amount >=", value, "timeUseAmount");
            return (Criteria) this;
        }

        public Criteria andTimeUseAmountLessThan(BigDecimal value) {
            addCriterion("time_use_amount <", value, "timeUseAmount");
            return (Criteria) this;
        }

        public Criteria andTimeUseAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("time_use_amount <=", value, "timeUseAmount");
            return (Criteria) this;
        }

        public Criteria andTimeUseAmountIn(List<BigDecimal> values) {
            addCriterion("time_use_amount in", values, "timeUseAmount");
            return (Criteria) this;
        }

        public Criteria andTimeUseAmountNotIn(List<BigDecimal> values) {
            addCriterion("time_use_amount not in", values, "timeUseAmount");
            return (Criteria) this;
        }

        public Criteria andTimeUseAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_use_amount between", value1, value2, "timeUseAmount");
            return (Criteria) this;
        }

        public Criteria andTimeUseAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_use_amount not between", value1, value2, "timeUseAmount");
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

        public Criteria andWaterSpaceIsNull() {
            addCriterion("water_space is null");
            return (Criteria) this;
        }

        public Criteria andWaterSpaceIsNotNull() {
            addCriterion("water_space is not null");
            return (Criteria) this;
        }

        public Criteria andWaterSpaceEqualTo(BigDecimal value) {
            addCriterion("water_space =", value, "waterSpace");
            return (Criteria) this;
        }

        public Criteria andWaterSpaceNotEqualTo(BigDecimal value) {
            addCriterion("water_space <>", value, "waterSpace");
            return (Criteria) this;
        }

        public Criteria andWaterSpaceGreaterThan(BigDecimal value) {
            addCriterion("water_space >", value, "waterSpace");
            return (Criteria) this;
        }

        public Criteria andWaterSpaceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("water_space >=", value, "waterSpace");
            return (Criteria) this;
        }

        public Criteria andWaterSpaceLessThan(BigDecimal value) {
            addCriterion("water_space <", value, "waterSpace");
            return (Criteria) this;
        }

        public Criteria andWaterSpaceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("water_space <=", value, "waterSpace");
            return (Criteria) this;
        }

        public Criteria andWaterSpaceIn(List<BigDecimal> values) {
            addCriterion("water_space in", values, "waterSpace");
            return (Criteria) this;
        }

        public Criteria andWaterSpaceNotIn(List<BigDecimal> values) {
            addCriterion("water_space not in", values, "waterSpace");
            return (Criteria) this;
        }

        public Criteria andWaterSpaceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("water_space between", value1, value2, "waterSpace");
            return (Criteria) this;
        }

        public Criteria andWaterSpaceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("water_space not between", value1, value2, "waterSpace");
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

        public Criteria andWaterTotalPriceIsNull() {
            addCriterion("water_total_price is null");
            return (Criteria) this;
        }

        public Criteria andWaterTotalPriceIsNotNull() {
            addCriterion("water_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andWaterTotalPriceEqualTo(BigDecimal value) {
            addCriterion("water_total_price =", value, "waterTotalPrice");
            return (Criteria) this;
        }

        public Criteria andWaterTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("water_total_price <>", value, "waterTotalPrice");
            return (Criteria) this;
        }

        public Criteria andWaterTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("water_total_price >", value, "waterTotalPrice");
            return (Criteria) this;
        }

        public Criteria andWaterTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("water_total_price >=", value, "waterTotalPrice");
            return (Criteria) this;
        }

        public Criteria andWaterTotalPriceLessThan(BigDecimal value) {
            addCriterion("water_total_price <", value, "waterTotalPrice");
            return (Criteria) this;
        }

        public Criteria andWaterTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("water_total_price <=", value, "waterTotalPrice");
            return (Criteria) this;
        }

        public Criteria andWaterTotalPriceIn(List<BigDecimal> values) {
            addCriterion("water_total_price in", values, "waterTotalPrice");
            return (Criteria) this;
        }

        public Criteria andWaterTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("water_total_price not in", values, "waterTotalPrice");
            return (Criteria) this;
        }

        public Criteria andWaterTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("water_total_price between", value1, value2, "waterTotalPrice");
            return (Criteria) this;
        }

        public Criteria andWaterTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("water_total_price not between", value1, value2, "waterTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andRemainPriceIsNull() {
            addCriterion("remain_price is null");
            return (Criteria) this;
        }

        public Criteria andRemainPriceIsNotNull() {
            addCriterion("remain_price is not null");
            return (Criteria) this;
        }

        public Criteria andRemainPriceEqualTo(BigDecimal value) {
            addCriterion("remain_price =", value, "remainPrice");
            return (Criteria) this;
        }

        public Criteria andRemainPriceNotEqualTo(BigDecimal value) {
            addCriterion("remain_price <>", value, "remainPrice");
            return (Criteria) this;
        }

        public Criteria andRemainPriceGreaterThan(BigDecimal value) {
            addCriterion("remain_price >", value, "remainPrice");
            return (Criteria) this;
        }

        public Criteria andRemainPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_price >=", value, "remainPrice");
            return (Criteria) this;
        }

        public Criteria andRemainPriceLessThan(BigDecimal value) {
            addCriterion("remain_price <", value, "remainPrice");
            return (Criteria) this;
        }

        public Criteria andRemainPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_price <=", value, "remainPrice");
            return (Criteria) this;
        }

        public Criteria andRemainPriceIn(List<BigDecimal> values) {
            addCriterion("remain_price in", values, "remainPrice");
            return (Criteria) this;
        }

        public Criteria andRemainPriceNotIn(List<BigDecimal> values) {
            addCriterion("remain_price not in", values, "remainPrice");
            return (Criteria) this;
        }

        public Criteria andRemainPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_price between", value1, value2, "remainPrice");
            return (Criteria) this;
        }

        public Criteria andRemainPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_price not between", value1, value2, "remainPrice");
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