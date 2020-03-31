package com.example.demo.model.mysql;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBeanExample() {
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

        public Criteria andDuuidIsNull() {
            addCriterion("DUUID is null");
            return (Criteria) this;
        }

        public Criteria andDuuidIsNotNull() {
            addCriterion("DUUID is not null");
            return (Criteria) this;
        }

        public Criteria andDuuidEqualTo(String value) {
            addCriterion("DUUID =", value, "duuid");
            return (Criteria) this;
        }

        public Criteria andDuuidNotEqualTo(String value) {
            addCriterion("DUUID <>", value, "duuid");
            return (Criteria) this;
        }

        public Criteria andDuuidGreaterThan(String value) {
            addCriterion("DUUID >", value, "duuid");
            return (Criteria) this;
        }

        public Criteria andDuuidGreaterThanOrEqualTo(String value) {
            addCriterion("DUUID >=", value, "duuid");
            return (Criteria) this;
        }

        public Criteria andDuuidLessThan(String value) {
            addCriterion("DUUID <", value, "duuid");
            return (Criteria) this;
        }

        public Criteria andDuuidLessThanOrEqualTo(String value) {
            addCriterion("DUUID <=", value, "duuid");
            return (Criteria) this;
        }

        public Criteria andDuuidLike(String value) {
            addCriterion("DUUID like", value, "duuid");
            return (Criteria) this;
        }

        public Criteria andDuuidNotLike(String value) {
            addCriterion("DUUID not like", value, "duuid");
            return (Criteria) this;
        }

        public Criteria andDuuidIn(List<String> values) {
            addCriterion("DUUID in", values, "duuid");
            return (Criteria) this;
        }

        public Criteria andDuuidNotIn(List<String> values) {
            addCriterion("DUUID not in", values, "duuid");
            return (Criteria) this;
        }

        public Criteria andDuuidBetween(String value1, String value2) {
            addCriterion("DUUID between", value1, value2, "duuid");
            return (Criteria) this;
        }

        public Criteria andDuuidNotBetween(String value1, String value2) {
            addCriterion("DUUID not between", value1, value2, "duuid");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEncryptionRuleIsNull() {
            addCriterion("ENCRYPTION_RULE is null");
            return (Criteria) this;
        }

        public Criteria andEncryptionRuleIsNotNull() {
            addCriterion("ENCRYPTION_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptionRuleEqualTo(String value) {
            addCriterion("ENCRYPTION_RULE =", value, "encryptionRule");
            return (Criteria) this;
        }

        public Criteria andEncryptionRuleNotEqualTo(String value) {
            addCriterion("ENCRYPTION_RULE <>", value, "encryptionRule");
            return (Criteria) this;
        }

        public Criteria andEncryptionRuleGreaterThan(String value) {
            addCriterion("ENCRYPTION_RULE >", value, "encryptionRule");
            return (Criteria) this;
        }

        public Criteria andEncryptionRuleGreaterThanOrEqualTo(String value) {
            addCriterion("ENCRYPTION_RULE >=", value, "encryptionRule");
            return (Criteria) this;
        }

        public Criteria andEncryptionRuleLessThan(String value) {
            addCriterion("ENCRYPTION_RULE <", value, "encryptionRule");
            return (Criteria) this;
        }

        public Criteria andEncryptionRuleLessThanOrEqualTo(String value) {
            addCriterion("ENCRYPTION_RULE <=", value, "encryptionRule");
            return (Criteria) this;
        }

        public Criteria andEncryptionRuleLike(String value) {
            addCriterion("ENCRYPTION_RULE like", value, "encryptionRule");
            return (Criteria) this;
        }

        public Criteria andEncryptionRuleNotLike(String value) {
            addCriterion("ENCRYPTION_RULE not like", value, "encryptionRule");
            return (Criteria) this;
        }

        public Criteria andEncryptionRuleIn(List<String> values) {
            addCriterion("ENCRYPTION_RULE in", values, "encryptionRule");
            return (Criteria) this;
        }

        public Criteria andEncryptionRuleNotIn(List<String> values) {
            addCriterion("ENCRYPTION_RULE not in", values, "encryptionRule");
            return (Criteria) this;
        }

        public Criteria andEncryptionRuleBetween(String value1, String value2) {
            addCriterion("ENCRYPTION_RULE between", value1, value2, "encryptionRule");
            return (Criteria) this;
        }

        public Criteria andEncryptionRuleNotBetween(String value1, String value2) {
            addCriterion("ENCRYPTION_RULE not between", value1, value2, "encryptionRule");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNull() {
            addCriterion("VALID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNotNull() {
            addCriterion("VALID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_DATE =", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_DATE <>", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThan(Date value) {
            addCriterionForJDBCDate("VALID_DATE >", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_DATE >=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThan(Date value) {
            addCriterionForJDBCDate("VALID_DATE <", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_DATE <=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIn(List<Date> values) {
            addCriterionForJDBCDate("VALID_DATE in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("VALID_DATE not in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VALID_DATE between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VALID_DATE not between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andUserFromIsNull() {
            addCriterion("USER_FROM is null");
            return (Criteria) this;
        }

        public Criteria andUserFromIsNotNull() {
            addCriterion("USER_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andUserFromEqualTo(String value) {
            addCriterion("USER_FROM =", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromNotEqualTo(String value) {
            addCriterion("USER_FROM <>", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromGreaterThan(String value) {
            addCriterion("USER_FROM >", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromGreaterThanOrEqualTo(String value) {
            addCriterion("USER_FROM >=", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromLessThan(String value) {
            addCriterion("USER_FROM <", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromLessThanOrEqualTo(String value) {
            addCriterion("USER_FROM <=", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromLike(String value) {
            addCriterion("USER_FROM like", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromNotLike(String value) {
            addCriterion("USER_FROM not like", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromIn(List<String> values) {
            addCriterion("USER_FROM in", values, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromNotIn(List<String> values) {
            addCriterion("USER_FROM not in", values, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromBetween(String value1, String value2) {
            addCriterion("USER_FROM between", value1, value2, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromNotBetween(String value1, String value2) {
            addCriterion("USER_FROM not between", value1, value2, "userFrom");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNull() {
            addCriterion("IS_ONLINE is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNotNull() {
            addCriterion("IS_ONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineEqualTo(Boolean value) {
            addCriterion("IS_ONLINE =", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotEqualTo(Boolean value) {
            addCriterion("IS_ONLINE <>", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThan(Boolean value) {
            addCriterion("IS_ONLINE >", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_ONLINE >=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThan(Boolean value) {
            addCriterion("IS_ONLINE <", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_ONLINE <=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIn(List<Boolean> values) {
            addCriterion("IS_ONLINE in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotIn(List<Boolean> values) {
            addCriterion("IS_ONLINE not in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_ONLINE between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_ONLINE not between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPasswordDesIsNull() {
            addCriterion("PASSWORD_DES is null");
            return (Criteria) this;
        }

        public Criteria andPasswordDesIsNotNull() {
            addCriterion("PASSWORD_DES is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordDesEqualTo(String value) {
            addCriterion("PASSWORD_DES =", value, "passwordDes");
            return (Criteria) this;
        }

        public Criteria andPasswordDesNotEqualTo(String value) {
            addCriterion("PASSWORD_DES <>", value, "passwordDes");
            return (Criteria) this;
        }

        public Criteria andPasswordDesGreaterThan(String value) {
            addCriterion("PASSWORD_DES >", value, "passwordDes");
            return (Criteria) this;
        }

        public Criteria andPasswordDesGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD_DES >=", value, "passwordDes");
            return (Criteria) this;
        }

        public Criteria andPasswordDesLessThan(String value) {
            addCriterion("PASSWORD_DES <", value, "passwordDes");
            return (Criteria) this;
        }

        public Criteria andPasswordDesLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD_DES <=", value, "passwordDes");
            return (Criteria) this;
        }

        public Criteria andPasswordDesLike(String value) {
            addCriterion("PASSWORD_DES like", value, "passwordDes");
            return (Criteria) this;
        }

        public Criteria andPasswordDesNotLike(String value) {
            addCriterion("PASSWORD_DES not like", value, "passwordDes");
            return (Criteria) this;
        }

        public Criteria andPasswordDesIn(List<String> values) {
            addCriterion("PASSWORD_DES in", values, "passwordDes");
            return (Criteria) this;
        }

        public Criteria andPasswordDesNotIn(List<String> values) {
            addCriterion("PASSWORD_DES not in", values, "passwordDes");
            return (Criteria) this;
        }

        public Criteria andPasswordDesBetween(String value1, String value2) {
            addCriterion("PASSWORD_DES between", value1, value2, "passwordDes");
            return (Criteria) this;
        }

        public Criteria andPasswordDesNotBetween(String value1, String value2) {
            addCriterion("PASSWORD_DES not between", value1, value2, "passwordDes");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
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

        public Criteria andLoginTimeIsNull() {
            addCriterion("LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("LOGIN_TIME =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("LOGIN_TIME <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("LOGIN_TIME >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGIN_TIME >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("LOGIN_TIME <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("LOGIN_TIME <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("LOGIN_TIME in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("LOGIN_TIME not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("LOGIN_TIME between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("LOGIN_TIME not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginDeptIsNull() {
            addCriterion("LOGIN_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andLoginDeptIsNotNull() {
            addCriterion("LOGIN_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andLoginDeptEqualTo(String value) {
            addCriterion("LOGIN_DEPT =", value, "loginDept");
            return (Criteria) this;
        }

        public Criteria andLoginDeptNotEqualTo(String value) {
            addCriterion("LOGIN_DEPT <>", value, "loginDept");
            return (Criteria) this;
        }

        public Criteria andLoginDeptGreaterThan(String value) {
            addCriterion("LOGIN_DEPT >", value, "loginDept");
            return (Criteria) this;
        }

        public Criteria andLoginDeptGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_DEPT >=", value, "loginDept");
            return (Criteria) this;
        }

        public Criteria andLoginDeptLessThan(String value) {
            addCriterion("LOGIN_DEPT <", value, "loginDept");
            return (Criteria) this;
        }

        public Criteria andLoginDeptLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_DEPT <=", value, "loginDept");
            return (Criteria) this;
        }

        public Criteria andLoginDeptLike(String value) {
            addCriterion("LOGIN_DEPT like", value, "loginDept");
            return (Criteria) this;
        }

        public Criteria andLoginDeptNotLike(String value) {
            addCriterion("LOGIN_DEPT not like", value, "loginDept");
            return (Criteria) this;
        }

        public Criteria andLoginDeptIn(List<String> values) {
            addCriterion("LOGIN_DEPT in", values, "loginDept");
            return (Criteria) this;
        }

        public Criteria andLoginDeptNotIn(List<String> values) {
            addCriterion("LOGIN_DEPT not in", values, "loginDept");
            return (Criteria) this;
        }

        public Criteria andLoginDeptBetween(String value1, String value2) {
            addCriterion("LOGIN_DEPT between", value1, value2, "loginDept");
            return (Criteria) this;
        }

        public Criteria andLoginDeptNotBetween(String value1, String value2) {
            addCriterion("LOGIN_DEPT not between", value1, value2, "loginDept");
            return (Criteria) this;
        }

        public Criteria andLoginWardIsNull() {
            addCriterion("LOGIN_WARD is null");
            return (Criteria) this;
        }

        public Criteria andLoginWardIsNotNull() {
            addCriterion("LOGIN_WARD is not null");
            return (Criteria) this;
        }

        public Criteria andLoginWardEqualTo(String value) {
            addCriterion("LOGIN_WARD =", value, "loginWard");
            return (Criteria) this;
        }

        public Criteria andLoginWardNotEqualTo(String value) {
            addCriterion("LOGIN_WARD <>", value, "loginWard");
            return (Criteria) this;
        }

        public Criteria andLoginWardGreaterThan(String value) {
            addCriterion("LOGIN_WARD >", value, "loginWard");
            return (Criteria) this;
        }

        public Criteria andLoginWardGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_WARD >=", value, "loginWard");
            return (Criteria) this;
        }

        public Criteria andLoginWardLessThan(String value) {
            addCriterion("LOGIN_WARD <", value, "loginWard");
            return (Criteria) this;
        }

        public Criteria andLoginWardLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_WARD <=", value, "loginWard");
            return (Criteria) this;
        }

        public Criteria andLoginWardLike(String value) {
            addCriterion("LOGIN_WARD like", value, "loginWard");
            return (Criteria) this;
        }

        public Criteria andLoginWardNotLike(String value) {
            addCriterion("LOGIN_WARD not like", value, "loginWard");
            return (Criteria) this;
        }

        public Criteria andLoginWardIn(List<String> values) {
            addCriterion("LOGIN_WARD in", values, "loginWard");
            return (Criteria) this;
        }

        public Criteria andLoginWardNotIn(List<String> values) {
            addCriterion("LOGIN_WARD not in", values, "loginWard");
            return (Criteria) this;
        }

        public Criteria andLoginWardBetween(String value1, String value2) {
            addCriterion("LOGIN_WARD between", value1, value2, "loginWard");
            return (Criteria) this;
        }

        public Criteria andLoginWardNotBetween(String value1, String value2) {
            addCriterion("LOGIN_WARD not between", value1, value2, "loginWard");
            return (Criteria) this;
        }

        public Criteria andLoginClientIsNull() {
            addCriterion("LOGIN_CLIENT is null");
            return (Criteria) this;
        }

        public Criteria andLoginClientIsNotNull() {
            addCriterion("LOGIN_CLIENT is not null");
            return (Criteria) this;
        }

        public Criteria andLoginClientEqualTo(String value) {
            addCriterion("LOGIN_CLIENT =", value, "loginClient");
            return (Criteria) this;
        }

        public Criteria andLoginClientNotEqualTo(String value) {
            addCriterion("LOGIN_CLIENT <>", value, "loginClient");
            return (Criteria) this;
        }

        public Criteria andLoginClientGreaterThan(String value) {
            addCriterion("LOGIN_CLIENT >", value, "loginClient");
            return (Criteria) this;
        }

        public Criteria andLoginClientGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_CLIENT >=", value, "loginClient");
            return (Criteria) this;
        }

        public Criteria andLoginClientLessThan(String value) {
            addCriterion("LOGIN_CLIENT <", value, "loginClient");
            return (Criteria) this;
        }

        public Criteria andLoginClientLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_CLIENT <=", value, "loginClient");
            return (Criteria) this;
        }

        public Criteria andLoginClientLike(String value) {
            addCriterion("LOGIN_CLIENT like", value, "loginClient");
            return (Criteria) this;
        }

        public Criteria andLoginClientNotLike(String value) {
            addCriterion("LOGIN_CLIENT not like", value, "loginClient");
            return (Criteria) this;
        }

        public Criteria andLoginClientIn(List<String> values) {
            addCriterion("LOGIN_CLIENT in", values, "loginClient");
            return (Criteria) this;
        }

        public Criteria andLoginClientNotIn(List<String> values) {
            addCriterion("LOGIN_CLIENT not in", values, "loginClient");
            return (Criteria) this;
        }

        public Criteria andLoginClientBetween(String value1, String value2) {
            addCriterion("LOGIN_CLIENT between", value1, value2, "loginClient");
            return (Criteria) this;
        }

        public Criteria andLoginClientNotBetween(String value1, String value2) {
            addCriterion("LOGIN_CLIENT not between", value1, value2, "loginClient");
            return (Criteria) this;
        }

        public Criteria andQyWxFlagIsNull() {
            addCriterion("QY_WX_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andQyWxFlagIsNotNull() {
            addCriterion("QY_WX_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andQyWxFlagEqualTo(Short value) {
            addCriterion("QY_WX_FLAG =", value, "qyWxFlag");
            return (Criteria) this;
        }

        public Criteria andQyWxFlagNotEqualTo(Short value) {
            addCriterion("QY_WX_FLAG <>", value, "qyWxFlag");
            return (Criteria) this;
        }

        public Criteria andQyWxFlagGreaterThan(Short value) {
            addCriterion("QY_WX_FLAG >", value, "qyWxFlag");
            return (Criteria) this;
        }

        public Criteria andQyWxFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("QY_WX_FLAG >=", value, "qyWxFlag");
            return (Criteria) this;
        }

        public Criteria andQyWxFlagLessThan(Short value) {
            addCriterion("QY_WX_FLAG <", value, "qyWxFlag");
            return (Criteria) this;
        }

        public Criteria andQyWxFlagLessThanOrEqualTo(Short value) {
            addCriterion("QY_WX_FLAG <=", value, "qyWxFlag");
            return (Criteria) this;
        }

        public Criteria andQyWxFlagIn(List<Short> values) {
            addCriterion("QY_WX_FLAG in", values, "qyWxFlag");
            return (Criteria) this;
        }

        public Criteria andQyWxFlagNotIn(List<Short> values) {
            addCriterion("QY_WX_FLAG not in", values, "qyWxFlag");
            return (Criteria) this;
        }

        public Criteria andQyWxFlagBetween(Short value1, Short value2) {
            addCriterion("QY_WX_FLAG between", value1, value2, "qyWxFlag");
            return (Criteria) this;
        }

        public Criteria andQyWxFlagNotBetween(Short value1, Short value2) {
            addCriterion("QY_WX_FLAG not between", value1, value2, "qyWxFlag");
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