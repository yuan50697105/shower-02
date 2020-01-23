package org.yuan.boot.shower.db.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
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

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
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

        public Criteria andTotalRemainPriceIsNull() {
            addCriterion("total_remain_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalRemainPriceIsNotNull() {
            addCriterion("total_remain_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRemainPriceEqualTo(BigDecimal value) {
            addCriterion("total_remain_price =", value, "totalRemainPrice");
            return (Criteria) this;
        }

        public Criteria andTotalRemainPriceNotEqualTo(BigDecimal value) {
            addCriterion("total_remain_price <>", value, "totalRemainPrice");
            return (Criteria) this;
        }

        public Criteria andTotalRemainPriceGreaterThan(BigDecimal value) {
            addCriterion("total_remain_price >", value, "totalRemainPrice");
            return (Criteria) this;
        }

        public Criteria andTotalRemainPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_remain_price >=", value, "totalRemainPrice");
            return (Criteria) this;
        }

        public Criteria andTotalRemainPriceLessThan(BigDecimal value) {
            addCriterion("total_remain_price <", value, "totalRemainPrice");
            return (Criteria) this;
        }

        public Criteria andTotalRemainPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_remain_price <=", value, "totalRemainPrice");
            return (Criteria) this;
        }

        public Criteria andTotalRemainPriceIn(List<BigDecimal> values) {
            addCriterion("total_remain_price in", values, "totalRemainPrice");
            return (Criteria) this;
        }

        public Criteria andTotalRemainPriceNotIn(List<BigDecimal> values) {
            addCriterion("total_remain_price not in", values, "totalRemainPrice");
            return (Criteria) this;
        }

        public Criteria andTotalRemainPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_remain_price between", value1, value2, "totalRemainPrice");
            return (Criteria) this;
        }

        public Criteria andTotalRemainPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_remain_price not between", value1, value2, "totalRemainPrice");
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