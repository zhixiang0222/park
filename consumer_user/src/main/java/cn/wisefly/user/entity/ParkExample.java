package cn.wisefly.user.entity;

import java.util.ArrayList;
import java.util.List;

public class ParkExample {

  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public ParkExample() {
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

    public Criteria andCidIsNull() {
      addCriterion("cid is null");
      return (Criteria) this;
    }

    public Criteria andCidIsNotNull() {
      addCriterion("cid is not null");
      return (Criteria) this;
    }

    public Criteria andCidEqualTo(Integer value) {
      addCriterion("cid =", value, "cid");
      return (Criteria) this;
    }

    public Criteria andCidNotEqualTo(Integer value) {
      addCriterion("cid <>", value, "cid");
      return (Criteria) this;
    }

    public Criteria andCidGreaterThan(Integer value) {
      addCriterion("cid >", value, "cid");
      return (Criteria) this;
    }

    public Criteria andCidGreaterThanOrEqualTo(Integer value) {
      addCriterion("cid >=", value, "cid");
      return (Criteria) this;
    }

    public Criteria andCidLessThan(Integer value) {
      addCriterion("cid <", value, "cid");
      return (Criteria) this;
    }

    public Criteria andCidLessThanOrEqualTo(Integer value) {
      addCriterion("cid <=", value, "cid");
      return (Criteria) this;
    }

    public Criteria andCidIn(List<Integer> values) {
      addCriterion("cid in", values, "cid");
      return (Criteria) this;
    }

    public Criteria andCidNotIn(List<Integer> values) {
      addCriterion("cid not in", values, "cid");
      return (Criteria) this;
    }

    public Criteria andCidBetween(Integer value1, Integer value2) {
      addCriterion("cid between", value1, value2, "cid");
      return (Criteria) this;
    }

    public Criteria andCidNotBetween(Integer value1, Integer value2) {
      addCriterion("cid not between", value1, value2, "cid");
      return (Criteria) this;
    }

    public Criteria andParkingSpaceIsNull() {
      addCriterion("parking_space is null");
      return (Criteria) this;
    }

    public Criteria andParkingSpaceIsNotNull(String parkingSpace) {
      addCriterion("parking_space is not null");
      return (Criteria) this;
    }

    public Criteria andParkingSpaceEqualTo(String value) {
      addCriterion("parking_space =", value, "parkingSpace");
      return (Criteria) this;
    }

    public Criteria andParkingSpaceNotEqualTo(String value) {
      addCriterion("parking_space <>", value, "parkingSpace");
      return (Criteria) this;
    }

    public Criteria andParkingSpaceGreaterThan(String value) {
      addCriterion("parking_space >", value, "parkingSpace");
      return (Criteria) this;
    }

    public Criteria andParkingSpaceGreaterThanOrEqualTo(String value) {
      addCriterion("parking_space >=", value, "parkingSpace");
      return (Criteria) this;
    }

    public Criteria andParkingSpaceLessThan(String value) {
      addCriterion("parking_space <", value, "parkingSpace");
      return (Criteria) this;
    }

    public Criteria andParkingSpaceLessThanOrEqualTo(String value) {
      addCriterion("parking_space <=", value, "parkingSpace");
      return (Criteria) this;
    }

    public Criteria andParkingSpaceLike(String value) {
      addCriterion("parking_space like", value, "parkingSpace");
      return (Criteria) this;
    }

    public Criteria andParkingSpaceNotLike(String value) {
      addCriterion("parking_space not like", value, "parkingSpace");
      return (Criteria) this;
    }

    public Criteria andParkingSpaceIn(List<String> values) {
      addCriterion("parking_space in", values, "parkingSpace");
      return (Criteria) this;
    }

    public Criteria andParkingSpaceNotIn(List<String> values) {
      addCriterion("parking_space not in", values, "parkingSpace");
      return (Criteria) this;
    }

    public Criteria andParkingSpaceBetween(String value1, String value2) {
      addCriterion("parking_space between", value1, value2, "parkingSpace");
      return (Criteria) this;
    }

    public Criteria andParkingSpaceNotBetween(String value1, String value2) {
      addCriterion("parking_space not between", value1, value2, "parkingSpace");
      return (Criteria) this;
    }

    public Criteria andParkingCostIsNull() {
      addCriterion("parking_cost is null");
      return (Criteria) this;
    }

    public Criteria andParkingCostIsNotNull() {
      addCriterion("parking_cost is not null");
      return (Criteria) this;
    }

    public Criteria andParkingCostEqualTo(Integer value) {
      addCriterion("parking_cost =", value, "parkingCost");
      return (Criteria) this;
    }

    public Criteria andParkingCostNotEqualTo(Integer value) {
      addCriterion("parking_cost <>", value, "parkingCost");
      return (Criteria) this;
    }

    public Criteria andParkingCostGreaterThan(Integer value) {
      addCriterion("parking_cost >", value, "parkingCost");
      return (Criteria) this;
    }

    public Criteria andParkingCostGreaterThanOrEqualTo(Integer value) {
      addCriterion("parking_cost >=", value, "parkingCost");
      return (Criteria) this;
    }

    public Criteria andParkingCostLessThan(Integer value) {
      addCriterion("parking_cost <", value, "parkingCost");
      return (Criteria) this;
    }

    public Criteria andParkingCostLessThanOrEqualTo(Integer value) {
      addCriterion("parking_cost <=", value, "parkingCost");
      return (Criteria) this;
    }

    public Criteria andParkingCostIn(List<Integer> values) {
      addCriterion("parking_cost in", values, "parkingCost");
      return (Criteria) this;
    }

    public Criteria andParkingCostNotIn(List<Integer> values) {
      addCriterion("parking_cost not in", values, "parkingCost");
      return (Criteria) this;
    }

    public Criteria andParkingCostBetween(Integer value1, Integer value2) {
      addCriterion("parking_cost between", value1, value2, "parkingCost");
      return (Criteria) this;
    }

    public Criteria andParkingCostNotBetween(Integer value1, Integer value2) {
      addCriterion("parking_cost not between", value1, value2, "parkingCost");
      return (Criteria) this;
    }

    public Criteria andParkingStateIsNull() {
      addCriterion("parking_state is null");
      return (Criteria) this;
    }

    public Criteria andParkingStateIsNotNull() {
      addCriterion("parking_state is not null");
      return (Criteria) this;
    }

    public Criteria andParkingStateEqualTo(Integer value) {
      addCriterion("parking_state =", value, "parkingState");
      return (Criteria) this;
    }

    public Criteria andParkingStateNotEqualTo(Integer value) {
      addCriterion("parking_state <>", value, "parkingState");
      return (Criteria) this;
    }

    public Criteria andParkingStateGreaterThan(Integer value) {
      addCriterion("parking_state >", value, "parkingState");
      return (Criteria) this;
    }

    public Criteria andParkingStateGreaterThanOrEqualTo(Integer value) {
      addCriterion("parking_state >=", value, "parkingState");
      return (Criteria) this;
    }

    public Criteria andParkingStateLessThan(Integer value) {
      addCriterion("parking_state <", value, "parkingState");
      return (Criteria) this;
    }

    public Criteria andParkingStateLessThanOrEqualTo(Integer value) {
      addCriterion("parking_state <=", value, "parkingState");
      return (Criteria) this;
    }

    public Criteria andParkingStateIn(List<Integer> values) {
      addCriterion("parking_state in", values, "parkingState");
      return (Criteria) this;
    }

    public Criteria andParkingStateNotIn(List<Integer> values) {
      addCriterion("parking_state not in", values, "parkingState");
      return (Criteria) this;
    }

    public Criteria andParkingStateBetween(Integer value1, Integer value2) {
      addCriterion("parking_state between", value1, value2, "parkingState");
      return (Criteria) this;
    }

    public Criteria andParkingStateNotBetween(Integer value1, Integer value2) {
      addCriterion("parking_state not between", value1, value2, "parkingState");
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