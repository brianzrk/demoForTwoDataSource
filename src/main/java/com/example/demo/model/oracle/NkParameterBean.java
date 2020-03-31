package com.example.demo.model.oracle;

import java.math.BigDecimal;
import java.util.Date;

public class NkParameterBean {
    private String uuid;

    private String name;

    private String type;

    private String classA;

    private String classB;

    private String calcType;

    private String nature;

    private String significance;

    private String improve;

    private String nkFrom;

    private String modifier;

    private Date updatetime;

    private Short isavailable;

    private Short thresholdHospital;

    private Short thresholdCountry;

    private BigDecimal indicatorOrder;

    private BigDecimal indicatorsGuide;

    private BigDecimal nkLevel;

    private Short datasource;

    private Short editable;

    private String formula;

    private Short range;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getClassA() {
        return classA;
    }

    public void setClassA(String classA) {
        this.classA = classA == null ? null : classA.trim();
    }

    public String getClassB() {
        return classB;
    }

    public void setClassB(String classB) {
        this.classB = classB == null ? null : classB.trim();
    }

    public String getCalcType() {
        return calcType;
    }

    public void setCalcType(String calcType) {
        this.calcType = calcType == null ? null : calcType.trim();
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature == null ? null : nature.trim();
    }

    public String getSignificance() {
        return significance;
    }

    public void setSignificance(String significance) {
        this.significance = significance == null ? null : significance.trim();
    }

    public String getImprove() {
        return improve;
    }

    public void setImprove(String improve) {
        this.improve = improve == null ? null : improve.trim();
    }

    public String getNkFrom() {
        return nkFrom;
    }

    public void setNkFrom(String nkFrom) {
        this.nkFrom = nkFrom == null ? null : nkFrom.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Short getIsavailable() {
        return isavailable;
    }

    public void setIsavailable(Short isavailable) {
        this.isavailable = isavailable;
    }

    public Short getThresholdHospital() {
        return thresholdHospital;
    }

    public void setThresholdHospital(Short thresholdHospital) {
        this.thresholdHospital = thresholdHospital;
    }

    public Short getThresholdCountry() {
        return thresholdCountry;
    }

    public void setThresholdCountry(Short thresholdCountry) {
        this.thresholdCountry = thresholdCountry;
    }

    public BigDecimal getIndicatorOrder() {
        return indicatorOrder;
    }

    public void setIndicatorOrder(BigDecimal indicatorOrder) {
        this.indicatorOrder = indicatorOrder;
    }

    public BigDecimal getIndicatorsGuide() {
        return indicatorsGuide;
    }

    public void setIndicatorsGuide(BigDecimal indicatorsGuide) {
        this.indicatorsGuide = indicatorsGuide;
    }

    public BigDecimal getNkLevel() {
        return nkLevel;
    }

    public void setNkLevel(BigDecimal nkLevel) {
        this.nkLevel = nkLevel;
    }

    public Short getDatasource() {
        return datasource;
    }

    public void setDatasource(Short datasource) {
        this.datasource = datasource;
    }

    public Short getEditable() {
        return editable;
    }

    public void setEditable(Short editable) {
        this.editable = editable;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula == null ? null : formula.trim();
    }

    public Short getRange() {
        return range;
    }

    public void setRange(Short range) {
        this.range = range;
    }
}