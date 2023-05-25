package com.apple.hotel.pojo;

import java.util.ArrayList;
import java.util.List;

public class DishOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishOrderExample() {
        oredCriteria = new ArrayList<>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        public Criteria andDishOrderIdIsNull() {
            addCriterion("dish_order_id is null");
            return (Criteria) this;
        }

        public Criteria andDishOrderIdIsNotNull() {
            addCriterion("dish_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andDishOrderIdEqualTo(Integer value) {
            addCriterion("dish_order_id =", value, "dishOrderId");
            return (Criteria) this;
        }

        public Criteria andDishOrderIdNotEqualTo(Integer value) {
            addCriterion("dish_order_id <>", value, "dishOrderId");
            return (Criteria) this;
        }

        public Criteria andDishOrderIdGreaterThan(Integer value) {
            addCriterion("dish_order_id >", value, "dishOrderId");
            return (Criteria) this;
        }

        public Criteria andDishOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dish_order_id >=", value, "dishOrderId");
            return (Criteria) this;
        }

        public Criteria andDishOrderIdLessThan(Integer value) {
            addCriterion("dish_order_id <", value, "dishOrderId");
            return (Criteria) this;
        }

        public Criteria andDishOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("dish_order_id <=", value, "dishOrderId");
            return (Criteria) this;
        }

        public Criteria andDishOrderIdIn(List<Integer> values) {
            addCriterion("dish_order_id in", values, "dishOrderId");
            return (Criteria) this;
        }

        public Criteria andDishOrderIdNotIn(List<Integer> values) {
            addCriterion("dish_order_id not in", values, "dishOrderId");
            return (Criteria) this;
        }

        public Criteria andDishOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("dish_order_id between", value1, value2, "dishOrderId");
            return (Criteria) this;
        }

        public Criteria andDishOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dish_order_id not between", value1, value2, "dishOrderId");
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

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andDishIdIsNull() {
            addCriterion("dish_id is null");
            return (Criteria) this;
        }

        public Criteria andDishIdIsNotNull() {
            addCriterion("dish_id is not null");
            return (Criteria) this;
        }

        public Criteria andDishIdEqualTo(Integer value) {
            addCriterion("dish_id =", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotEqualTo(Integer value) {
            addCriterion("dish_id <>", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdGreaterThan(Integer value) {
            addCriterion("dish_id >", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dish_id >=", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdLessThan(Integer value) {
            addCriterion("dish_id <", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdLessThanOrEqualTo(Integer value) {
            addCriterion("dish_id <=", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdIn(List<Integer> values) {
            addCriterion("dish_id in", values, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotIn(List<Integer> values) {
            addCriterion("dish_id not in", values, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdBetween(Integer value1, Integer value2) {
            addCriterion("dish_id between", value1, value2, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dish_id not between", value1, value2, "dishId");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andSpecialRequestIsNull() {
            addCriterion("special_request is null");
            return (Criteria) this;
        }

        public Criteria andSpecialRequestIsNotNull() {
            addCriterion("special_request is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialRequestEqualTo(String value) {
            addCriterion("special_request =", value, "specialRequest");
            return (Criteria) this;
        }

        public Criteria andSpecialRequestNotEqualTo(String value) {
            addCriterion("special_request <>", value, "specialRequest");
            return (Criteria) this;
        }

        public Criteria andSpecialRequestGreaterThan(String value) {
            addCriterion("special_request >", value, "specialRequest");
            return (Criteria) this;
        }

        public Criteria andSpecialRequestGreaterThanOrEqualTo(String value) {
            addCriterion("special_request >=", value, "specialRequest");
            return (Criteria) this;
        }

        public Criteria andSpecialRequestLessThan(String value) {
            addCriterion("special_request <", value, "specialRequest");
            return (Criteria) this;
        }

        public Criteria andSpecialRequestLessThanOrEqualTo(String value) {
            addCriterion("special_request <=", value, "specialRequest");
            return (Criteria) this;
        }

        public Criteria andSpecialRequestLike(String value) {
            addCriterion("special_request like", value, "specialRequest");
            return (Criteria) this;
        }

        public Criteria andSpecialRequestNotLike(String value) {
            addCriterion("special_request not like", value, "specialRequest");
            return (Criteria) this;
        }

        public Criteria andSpecialRequestIn(List<String> values) {
            addCriterion("special_request in", values, "specialRequest");
            return (Criteria) this;
        }

        public Criteria andSpecialRequestNotIn(List<String> values) {
            addCriterion("special_request not in", values, "specialRequest");
            return (Criteria) this;
        }

        public Criteria andSpecialRequestBetween(String value1, String value2) {
            addCriterion("special_request between", value1, value2, "specialRequest");
            return (Criteria) this;
        }

        public Criteria andSpecialRequestNotBetween(String value1, String value2) {
            addCriterion("special_request not between", value1, value2, "specialRequest");
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
    }
}