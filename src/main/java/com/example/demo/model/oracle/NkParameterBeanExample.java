package com.example.demo.model.oracle;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NkParameterBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NkParameterBeanExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andClassAIsNull() {
            addCriterion("CLASS_A is null");
            return (Criteria) this;
        }

        public Criteria andClassAIsNotNull() {
            addCriterion("CLASS_A is not null");
            return (Criteria) this;
        }

        public Criteria andClassAEqualTo(String value) {
            addCriterion("CLASS_A =", value, "classA");
            return (Criteria) this;
        }

        public Criteria andClassANotEqualTo(String value) {
            addCriterion("CLASS_A <>", value, "classA");
            return (Criteria) this;
        }

        public Criteria andClassAGreaterThan(String value) {
            addCriterion("CLASS_A >", value, "classA");
            return (Criteria) this;
        }

        public Criteria andClassAGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_A >=", value, "classA");
            return (Criteria) this;
        }

        public Criteria andClassALessThan(String value) {
            addCriterion("CLASS_A <", value, "classA");
            return (Criteria) this;
        }

        public Criteria andClassALessThanOrEqualTo(String value) {
            addCriterion("CLASS_A <=", value, "classA");
            return (Criteria) this;
        }

        public Criteria andClassALike(String value) {
            addCriterion("CLASS_A like", value, "classA");
            return (Criteria) this;
        }

        public Criteria andClassANotLike(String value) {
            addCriterion("CLASS_A not like", value, "classA");
            return (Criteria) this;
        }

        public Criteria andClassAIn(List<String> values) {
            addCriterion("CLASS_A in", values, "classA");
            return (Criteria) this;
        }

        public Criteria andClassANotIn(List<String> values) {
            addCriterion("CLASS_A not in", values, "classA");
            return (Criteria) this;
        }

        public Criteria andClassABetween(String value1, String value2) {
            addCriterion("CLASS_A between", value1, value2, "classA");
            return (Criteria) this;
        }

        public Criteria andClassANotBetween(String value1, String value2) {
            addCriterion("CLASS_A not between", value1, value2, "classA");
            return (Criteria) this;
        }

        public Criteria andClassBIsNull() {
            addCriterion("CLASS_B is null");
            return (Criteria) this;
        }

        public Criteria andClassBIsNotNull() {
            addCriterion("CLASS_B is not null");
            return (Criteria) this;
        }

        public Criteria andClassBEqualTo(String value) {
            addCriterion("CLASS_B =", value, "classB");
            return (Criteria) this;
        }

        public Criteria andClassBNotEqualTo(String value) {
            addCriterion("CLASS_B <>", value, "classB");
            return (Criteria) this;
        }

        public Criteria andClassBGreaterThan(String value) {
            addCriterion("CLASS_B >", value, "classB");
            return (Criteria) this;
        }

        public Criteria andClassBGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_B >=", value, "classB");
            return (Criteria) this;
        }

        public Criteria andClassBLessThan(String value) {
            addCriterion("CLASS_B <", value, "classB");
            return (Criteria) this;
        }

        public Criteria andClassBLessThanOrEqualTo(String value) {
            addCriterion("CLASS_B <=", value, "classB");
            return (Criteria) this;
        }

        public Criteria andClassBLike(String value) {
            addCriterion("CLASS_B like", value, "classB");
            return (Criteria) this;
        }

        public Criteria andClassBNotLike(String value) {
            addCriterion("CLASS_B not like", value, "classB");
            return (Criteria) this;
        }

        public Criteria andClassBIn(List<String> values) {
            addCriterion("CLASS_B in", values, "classB");
            return (Criteria) this;
        }

        public Criteria andClassBNotIn(List<String> values) {
            addCriterion("CLASS_B not in", values, "classB");
            return (Criteria) this;
        }

        public Criteria andClassBBetween(String value1, String value2) {
            addCriterion("CLASS_B between", value1, value2, "classB");
            return (Criteria) this;
        }

        public Criteria andClassBNotBetween(String value1, String value2) {
            addCriterion("CLASS_B not between", value1, value2, "classB");
            return (Criteria) this;
        }

        public Criteria andCalcTypeIsNull() {
            addCriterion("CALC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCalcTypeIsNotNull() {
            addCriterion("CALC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCalcTypeEqualTo(String value) {
            addCriterion("CALC_TYPE =", value, "calcType");
            return (Criteria) this;
        }

        public Criteria andCalcTypeNotEqualTo(String value) {
            addCriterion("CALC_TYPE <>", value, "calcType");
            return (Criteria) this;
        }

        public Criteria andCalcTypeGreaterThan(String value) {
            addCriterion("CALC_TYPE >", value, "calcType");
            return (Criteria) this;
        }

        public Criteria andCalcTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CALC_TYPE >=", value, "calcType");
            return (Criteria) this;
        }

        public Criteria andCalcTypeLessThan(String value) {
            addCriterion("CALC_TYPE <", value, "calcType");
            return (Criteria) this;
        }

        public Criteria andCalcTypeLessThanOrEqualTo(String value) {
            addCriterion("CALC_TYPE <=", value, "calcType");
            return (Criteria) this;
        }

        public Criteria andCalcTypeLike(String value) {
            addCriterion("CALC_TYPE like", value, "calcType");
            return (Criteria) this;
        }

        public Criteria andCalcTypeNotLike(String value) {
            addCriterion("CALC_TYPE not like", value, "calcType");
            return (Criteria) this;
        }

        public Criteria andCalcTypeIn(List<String> values) {
            addCriterion("CALC_TYPE in", values, "calcType");
            return (Criteria) this;
        }

        public Criteria andCalcTypeNotIn(List<String> values) {
            addCriterion("CALC_TYPE not in", values, "calcType");
            return (Criteria) this;
        }

        public Criteria andCalcTypeBetween(String value1, String value2) {
            addCriterion("CALC_TYPE between", value1, value2, "calcType");
            return (Criteria) this;
        }

        public Criteria andCalcTypeNotBetween(String value1, String value2) {
            addCriterion("CALC_TYPE not between", value1, value2, "calcType");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("NATURE is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("NATURE is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(String value) {
            addCriterion("NATURE =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(String value) {
            addCriterion("NATURE <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(String value) {
            addCriterion("NATURE >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(String value) {
            addCriterion("NATURE >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(String value) {
            addCriterion("NATURE <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(String value) {
            addCriterion("NATURE <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLike(String value) {
            addCriterion("NATURE like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotLike(String value) {
            addCriterion("NATURE not like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<String> values) {
            addCriterion("NATURE in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<String> values) {
            addCriterion("NATURE not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(String value1, String value2) {
            addCriterion("NATURE between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(String value1, String value2) {
            addCriterion("NATURE not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andSignificanceIsNull() {
            addCriterion("SIGNIFICANCE is null");
            return (Criteria) this;
        }

        public Criteria andSignificanceIsNotNull() {
            addCriterion("SIGNIFICANCE is not null");
            return (Criteria) this;
        }

        public Criteria andSignificanceEqualTo(String value) {
            addCriterion("SIGNIFICANCE =", value, "significance");
            return (Criteria) this;
        }

        public Criteria andSignificanceNotEqualTo(String value) {
            addCriterion("SIGNIFICANCE <>", value, "significance");
            return (Criteria) this;
        }

        public Criteria andSignificanceGreaterThan(String value) {
            addCriterion("SIGNIFICANCE >", value, "significance");
            return (Criteria) this;
        }

        public Criteria andSignificanceGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNIFICANCE >=", value, "significance");
            return (Criteria) this;
        }

        public Criteria andSignificanceLessThan(String value) {
            addCriterion("SIGNIFICANCE <", value, "significance");
            return (Criteria) this;
        }

        public Criteria andSignificanceLessThanOrEqualTo(String value) {
            addCriterion("SIGNIFICANCE <=", value, "significance");
            return (Criteria) this;
        }

        public Criteria andSignificanceLike(String value) {
            addCriterion("SIGNIFICANCE like", value, "significance");
            return (Criteria) this;
        }

        public Criteria andSignificanceNotLike(String value) {
            addCriterion("SIGNIFICANCE not like", value, "significance");
            return (Criteria) this;
        }

        public Criteria andSignificanceIn(List<String> values) {
            addCriterion("SIGNIFICANCE in", values, "significance");
            return (Criteria) this;
        }

        public Criteria andSignificanceNotIn(List<String> values) {
            addCriterion("SIGNIFICANCE not in", values, "significance");
            return (Criteria) this;
        }

        public Criteria andSignificanceBetween(String value1, String value2) {
            addCriterion("SIGNIFICANCE between", value1, value2, "significance");
            return (Criteria) this;
        }

        public Criteria andSignificanceNotBetween(String value1, String value2) {
            addCriterion("SIGNIFICANCE not between", value1, value2, "significance");
            return (Criteria) this;
        }

        public Criteria andImproveIsNull() {
            addCriterion("IMPROVE is null");
            return (Criteria) this;
        }

        public Criteria andImproveIsNotNull() {
            addCriterion("IMPROVE is not null");
            return (Criteria) this;
        }

        public Criteria andImproveEqualTo(String value) {
            addCriterion("IMPROVE =", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveNotEqualTo(String value) {
            addCriterion("IMPROVE <>", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveGreaterThan(String value) {
            addCriterion("IMPROVE >", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveGreaterThanOrEqualTo(String value) {
            addCriterion("IMPROVE >=", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveLessThan(String value) {
            addCriterion("IMPROVE <", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveLessThanOrEqualTo(String value) {
            addCriterion("IMPROVE <=", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveLike(String value) {
            addCriterion("IMPROVE like", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveNotLike(String value) {
            addCriterion("IMPROVE not like", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveIn(List<String> values) {
            addCriterion("IMPROVE in", values, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveNotIn(List<String> values) {
            addCriterion("IMPROVE not in", values, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveBetween(String value1, String value2) {
            addCriterion("IMPROVE between", value1, value2, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveNotBetween(String value1, String value2) {
            addCriterion("IMPROVE not between", value1, value2, "improve");
            return (Criteria) this;
        }

        public Criteria andNkFromIsNull() {
            addCriterion("NK_FROM is null");
            return (Criteria) this;
        }

        public Criteria andNkFromIsNotNull() {
            addCriterion("NK_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andNkFromEqualTo(String value) {
            addCriterion("NK_FROM =", value, "nkFrom");
            return (Criteria) this;
        }

        public Criteria andNkFromNotEqualTo(String value) {
            addCriterion("NK_FROM <>", value, "nkFrom");
            return (Criteria) this;
        }

        public Criteria andNkFromGreaterThan(String value) {
            addCriterion("NK_FROM >", value, "nkFrom");
            return (Criteria) this;
        }

        public Criteria andNkFromGreaterThanOrEqualTo(String value) {
            addCriterion("NK_FROM >=", value, "nkFrom");
            return (Criteria) this;
        }

        public Criteria andNkFromLessThan(String value) {
            addCriterion("NK_FROM <", value, "nkFrom");
            return (Criteria) this;
        }

        public Criteria andNkFromLessThanOrEqualTo(String value) {
            addCriterion("NK_FROM <=", value, "nkFrom");
            return (Criteria) this;
        }

        public Criteria andNkFromLike(String value) {
            addCriterion("NK_FROM like", value, "nkFrom");
            return (Criteria) this;
        }

        public Criteria andNkFromNotLike(String value) {
            addCriterion("NK_FROM not like", value, "nkFrom");
            return (Criteria) this;
        }

        public Criteria andNkFromIn(List<String> values) {
            addCriterion("NK_FROM in", values, "nkFrom");
            return (Criteria) this;
        }

        public Criteria andNkFromNotIn(List<String> values) {
            addCriterion("NK_FROM not in", values, "nkFrom");
            return (Criteria) this;
        }

        public Criteria andNkFromBetween(String value1, String value2) {
            addCriterion("NK_FROM between", value1, value2, "nkFrom");
            return (Criteria) this;
        }

        public Criteria andNkFromNotBetween(String value1, String value2) {
            addCriterion("NK_FROM not between", value1, value2, "nkFrom");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andIsavailableIsNull() {
            addCriterion("ISAVAILABLE is null");
            return (Criteria) this;
        }

        public Criteria andIsavailableIsNotNull() {
            addCriterion("ISAVAILABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsavailableEqualTo(Short value) {
            addCriterion("ISAVAILABLE =", value, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableNotEqualTo(Short value) {
            addCriterion("ISAVAILABLE <>", value, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableGreaterThan(Short value) {
            addCriterion("ISAVAILABLE >", value, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableGreaterThanOrEqualTo(Short value) {
            addCriterion("ISAVAILABLE >=", value, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableLessThan(Short value) {
            addCriterion("ISAVAILABLE <", value, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableLessThanOrEqualTo(Short value) {
            addCriterion("ISAVAILABLE <=", value, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableIn(List<Short> values) {
            addCriterion("ISAVAILABLE in", values, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableNotIn(List<Short> values) {
            addCriterion("ISAVAILABLE not in", values, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableBetween(Short value1, Short value2) {
            addCriterion("ISAVAILABLE between", value1, value2, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableNotBetween(Short value1, Short value2) {
            addCriterion("ISAVAILABLE not between", value1, value2, "isavailable");
            return (Criteria) this;
        }

        public Criteria andThresholdHospitalIsNull() {
            addCriterion("THRESHOLD_HOSPITAL is null");
            return (Criteria) this;
        }

        public Criteria andThresholdHospitalIsNotNull() {
            addCriterion("THRESHOLD_HOSPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdHospitalEqualTo(Short value) {
            addCriterion("THRESHOLD_HOSPITAL =", value, "thresholdHospital");
            return (Criteria) this;
        }

        public Criteria andThresholdHospitalNotEqualTo(Short value) {
            addCriterion("THRESHOLD_HOSPITAL <>", value, "thresholdHospital");
            return (Criteria) this;
        }

        public Criteria andThresholdHospitalGreaterThan(Short value) {
            addCriterion("THRESHOLD_HOSPITAL >", value, "thresholdHospital");
            return (Criteria) this;
        }

        public Criteria andThresholdHospitalGreaterThanOrEqualTo(Short value) {
            addCriterion("THRESHOLD_HOSPITAL >=", value, "thresholdHospital");
            return (Criteria) this;
        }

        public Criteria andThresholdHospitalLessThan(Short value) {
            addCriterion("THRESHOLD_HOSPITAL <", value, "thresholdHospital");
            return (Criteria) this;
        }

        public Criteria andThresholdHospitalLessThanOrEqualTo(Short value) {
            addCriterion("THRESHOLD_HOSPITAL <=", value, "thresholdHospital");
            return (Criteria) this;
        }

        public Criteria andThresholdHospitalIn(List<Short> values) {
            addCriterion("THRESHOLD_HOSPITAL in", values, "thresholdHospital");
            return (Criteria) this;
        }

        public Criteria andThresholdHospitalNotIn(List<Short> values) {
            addCriterion("THRESHOLD_HOSPITAL not in", values, "thresholdHospital");
            return (Criteria) this;
        }

        public Criteria andThresholdHospitalBetween(Short value1, Short value2) {
            addCriterion("THRESHOLD_HOSPITAL between", value1, value2, "thresholdHospital");
            return (Criteria) this;
        }

        public Criteria andThresholdHospitalNotBetween(Short value1, Short value2) {
            addCriterion("THRESHOLD_HOSPITAL not between", value1, value2, "thresholdHospital");
            return (Criteria) this;
        }

        public Criteria andThresholdCountryIsNull() {
            addCriterion("THRESHOLD_COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andThresholdCountryIsNotNull() {
            addCriterion("THRESHOLD_COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdCountryEqualTo(Short value) {
            addCriterion("THRESHOLD_COUNTRY =", value, "thresholdCountry");
            return (Criteria) this;
        }

        public Criteria andThresholdCountryNotEqualTo(Short value) {
            addCriterion("THRESHOLD_COUNTRY <>", value, "thresholdCountry");
            return (Criteria) this;
        }

        public Criteria andThresholdCountryGreaterThan(Short value) {
            addCriterion("THRESHOLD_COUNTRY >", value, "thresholdCountry");
            return (Criteria) this;
        }

        public Criteria andThresholdCountryGreaterThanOrEqualTo(Short value) {
            addCriterion("THRESHOLD_COUNTRY >=", value, "thresholdCountry");
            return (Criteria) this;
        }

        public Criteria andThresholdCountryLessThan(Short value) {
            addCriterion("THRESHOLD_COUNTRY <", value, "thresholdCountry");
            return (Criteria) this;
        }

        public Criteria andThresholdCountryLessThanOrEqualTo(Short value) {
            addCriterion("THRESHOLD_COUNTRY <=", value, "thresholdCountry");
            return (Criteria) this;
        }

        public Criteria andThresholdCountryIn(List<Short> values) {
            addCriterion("THRESHOLD_COUNTRY in", values, "thresholdCountry");
            return (Criteria) this;
        }

        public Criteria andThresholdCountryNotIn(List<Short> values) {
            addCriterion("THRESHOLD_COUNTRY not in", values, "thresholdCountry");
            return (Criteria) this;
        }

        public Criteria andThresholdCountryBetween(Short value1, Short value2) {
            addCriterion("THRESHOLD_COUNTRY between", value1, value2, "thresholdCountry");
            return (Criteria) this;
        }

        public Criteria andThresholdCountryNotBetween(Short value1, Short value2) {
            addCriterion("THRESHOLD_COUNTRY not between", value1, value2, "thresholdCountry");
            return (Criteria) this;
        }

        public Criteria andIndicatorOrderIsNull() {
            addCriterion("INDICATOR_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andIndicatorOrderIsNotNull() {
            addCriterion("INDICATOR_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andIndicatorOrderEqualTo(BigDecimal value) {
            addCriterion("INDICATOR_ORDER =", value, "indicatorOrder");
            return (Criteria) this;
        }

        public Criteria andIndicatorOrderNotEqualTo(BigDecimal value) {
            addCriterion("INDICATOR_ORDER <>", value, "indicatorOrder");
            return (Criteria) this;
        }

        public Criteria andIndicatorOrderGreaterThan(BigDecimal value) {
            addCriterion("INDICATOR_ORDER >", value, "indicatorOrder");
            return (Criteria) this;
        }

        public Criteria andIndicatorOrderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INDICATOR_ORDER >=", value, "indicatorOrder");
            return (Criteria) this;
        }

        public Criteria andIndicatorOrderLessThan(BigDecimal value) {
            addCriterion("INDICATOR_ORDER <", value, "indicatorOrder");
            return (Criteria) this;
        }

        public Criteria andIndicatorOrderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INDICATOR_ORDER <=", value, "indicatorOrder");
            return (Criteria) this;
        }

        public Criteria andIndicatorOrderIn(List<BigDecimal> values) {
            addCriterion("INDICATOR_ORDER in", values, "indicatorOrder");
            return (Criteria) this;
        }

        public Criteria andIndicatorOrderNotIn(List<BigDecimal> values) {
            addCriterion("INDICATOR_ORDER not in", values, "indicatorOrder");
            return (Criteria) this;
        }

        public Criteria andIndicatorOrderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INDICATOR_ORDER between", value1, value2, "indicatorOrder");
            return (Criteria) this;
        }

        public Criteria andIndicatorOrderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INDICATOR_ORDER not between", value1, value2, "indicatorOrder");
            return (Criteria) this;
        }

        public Criteria andIndicatorsGuideIsNull() {
            addCriterion("INDICATORS_GUIDE is null");
            return (Criteria) this;
        }

        public Criteria andIndicatorsGuideIsNotNull() {
            addCriterion("INDICATORS_GUIDE is not null");
            return (Criteria) this;
        }

        public Criteria andIndicatorsGuideEqualTo(BigDecimal value) {
            addCriterion("INDICATORS_GUIDE =", value, "indicatorsGuide");
            return (Criteria) this;
        }

        public Criteria andIndicatorsGuideNotEqualTo(BigDecimal value) {
            addCriterion("INDICATORS_GUIDE <>", value, "indicatorsGuide");
            return (Criteria) this;
        }

        public Criteria andIndicatorsGuideGreaterThan(BigDecimal value) {
            addCriterion("INDICATORS_GUIDE >", value, "indicatorsGuide");
            return (Criteria) this;
        }

        public Criteria andIndicatorsGuideGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INDICATORS_GUIDE >=", value, "indicatorsGuide");
            return (Criteria) this;
        }

        public Criteria andIndicatorsGuideLessThan(BigDecimal value) {
            addCriterion("INDICATORS_GUIDE <", value, "indicatorsGuide");
            return (Criteria) this;
        }

        public Criteria andIndicatorsGuideLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INDICATORS_GUIDE <=", value, "indicatorsGuide");
            return (Criteria) this;
        }

        public Criteria andIndicatorsGuideIn(List<BigDecimal> values) {
            addCriterion("INDICATORS_GUIDE in", values, "indicatorsGuide");
            return (Criteria) this;
        }

        public Criteria andIndicatorsGuideNotIn(List<BigDecimal> values) {
            addCriterion("INDICATORS_GUIDE not in", values, "indicatorsGuide");
            return (Criteria) this;
        }

        public Criteria andIndicatorsGuideBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INDICATORS_GUIDE between", value1, value2, "indicatorsGuide");
            return (Criteria) this;
        }

        public Criteria andIndicatorsGuideNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INDICATORS_GUIDE not between", value1, value2, "indicatorsGuide");
            return (Criteria) this;
        }

        public Criteria andNkLevelIsNull() {
            addCriterion("NK_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andNkLevelIsNotNull() {
            addCriterion("NK_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andNkLevelEqualTo(BigDecimal value) {
            addCriterion("NK_LEVEL =", value, "nkLevel");
            return (Criteria) this;
        }

        public Criteria andNkLevelNotEqualTo(BigDecimal value) {
            addCriterion("NK_LEVEL <>", value, "nkLevel");
            return (Criteria) this;
        }

        public Criteria andNkLevelGreaterThan(BigDecimal value) {
            addCriterion("NK_LEVEL >", value, "nkLevel");
            return (Criteria) this;
        }

        public Criteria andNkLevelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NK_LEVEL >=", value, "nkLevel");
            return (Criteria) this;
        }

        public Criteria andNkLevelLessThan(BigDecimal value) {
            addCriterion("NK_LEVEL <", value, "nkLevel");
            return (Criteria) this;
        }

        public Criteria andNkLevelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NK_LEVEL <=", value, "nkLevel");
            return (Criteria) this;
        }

        public Criteria andNkLevelIn(List<BigDecimal> values) {
            addCriterion("NK_LEVEL in", values, "nkLevel");
            return (Criteria) this;
        }

        public Criteria andNkLevelNotIn(List<BigDecimal> values) {
            addCriterion("NK_LEVEL not in", values, "nkLevel");
            return (Criteria) this;
        }

        public Criteria andNkLevelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NK_LEVEL between", value1, value2, "nkLevel");
            return (Criteria) this;
        }

        public Criteria andNkLevelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NK_LEVEL not between", value1, value2, "nkLevel");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNull() {
            addCriterion("DATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNotNull() {
            addCriterion("DATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceEqualTo(Short value) {
            addCriterion("DATASOURCE =", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotEqualTo(Short value) {
            addCriterion("DATASOURCE <>", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThan(Short value) {
            addCriterion("DATASOURCE >", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThanOrEqualTo(Short value) {
            addCriterion("DATASOURCE >=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThan(Short value) {
            addCriterion("DATASOURCE <", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThanOrEqualTo(Short value) {
            addCriterion("DATASOURCE <=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceIn(List<Short> values) {
            addCriterion("DATASOURCE in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotIn(List<Short> values) {
            addCriterion("DATASOURCE not in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceBetween(Short value1, Short value2) {
            addCriterion("DATASOURCE between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotBetween(Short value1, Short value2) {
            addCriterion("DATASOURCE not between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andEditableIsNull() {
            addCriterion("EDITABLE is null");
            return (Criteria) this;
        }

        public Criteria andEditableIsNotNull() {
            addCriterion("EDITABLE is not null");
            return (Criteria) this;
        }

        public Criteria andEditableEqualTo(Short value) {
            addCriterion("EDITABLE =", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableNotEqualTo(Short value) {
            addCriterion("EDITABLE <>", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableGreaterThan(Short value) {
            addCriterion("EDITABLE >", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableGreaterThanOrEqualTo(Short value) {
            addCriterion("EDITABLE >=", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableLessThan(Short value) {
            addCriterion("EDITABLE <", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableLessThanOrEqualTo(Short value) {
            addCriterion("EDITABLE <=", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableIn(List<Short> values) {
            addCriterion("EDITABLE in", values, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableNotIn(List<Short> values) {
            addCriterion("EDITABLE not in", values, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableBetween(Short value1, Short value2) {
            addCriterion("EDITABLE between", value1, value2, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableNotBetween(Short value1, Short value2) {
            addCriterion("EDITABLE not between", value1, value2, "editable");
            return (Criteria) this;
        }

        public Criteria andFormulaIsNull() {
            addCriterion("FORMULA is null");
            return (Criteria) this;
        }

        public Criteria andFormulaIsNotNull() {
            addCriterion("FORMULA is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaEqualTo(String value) {
            addCriterion("FORMULA =", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotEqualTo(String value) {
            addCriterion("FORMULA <>", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaGreaterThan(String value) {
            addCriterion("FORMULA >", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaGreaterThanOrEqualTo(String value) {
            addCriterion("FORMULA >=", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLessThan(String value) {
            addCriterion("FORMULA <", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLessThanOrEqualTo(String value) {
            addCriterion("FORMULA <=", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLike(String value) {
            addCriterion("FORMULA like", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotLike(String value) {
            addCriterion("FORMULA not like", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaIn(List<String> values) {
            addCriterion("FORMULA in", values, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotIn(List<String> values) {
            addCriterion("FORMULA not in", values, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaBetween(String value1, String value2) {
            addCriterion("FORMULA between", value1, value2, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotBetween(String value1, String value2) {
            addCriterion("FORMULA not between", value1, value2, "formula");
            return (Criteria) this;
        }

        public Criteria andRangeIsNull() {
            addCriterion("RANGE is null");
            return (Criteria) this;
        }

        public Criteria andRangeIsNotNull() {
            addCriterion("RANGE is not null");
            return (Criteria) this;
        }

        public Criteria andRangeEqualTo(Short value) {
            addCriterion("RANGE =", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotEqualTo(Short value) {
            addCriterion("RANGE <>", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeGreaterThan(Short value) {
            addCriterion("RANGE >", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeGreaterThanOrEqualTo(Short value) {
            addCriterion("RANGE >=", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLessThan(Short value) {
            addCriterion("RANGE <", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLessThanOrEqualTo(Short value) {
            addCriterion("RANGE <=", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeIn(List<Short> values) {
            addCriterion("RANGE in", values, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotIn(List<Short> values) {
            addCriterion("RANGE not in", values, "range");
            return (Criteria) this;
        }

        public Criteria andRangeBetween(Short value1, Short value2) {
            addCriterion("RANGE between", value1, value2, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotBetween(Short value1, Short value2) {
            addCriterion("RANGE not between", value1, value2, "range");
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