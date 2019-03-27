package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Caigouduepay implements Serializable {
    //
    private String duepayID;
    //
    private String payTime;
    //
    private String happenDate;
    //
    private String supplierID;
    //
    private String monetary;
    //
    private Double dueMoney;
    //
    private Double paidMoney;
    //
    private Double remainMoney;
    //
    private String buyORreturn;
    //
    private String operatorID;
    //
    private String examinerIID;
    //
    private String others;
    //
    private String chargeoff;
    //get set 方法
    public void setDuepayID (String  duepayID){
        this.duepayID=duepayID;
    }
    public  String getDuepayID(){
        return this.duepayID;
    }
    public void setPayTime (String  payTime){
        this.payTime=payTime;
    }
    public  String getPayTime(){
        return this.payTime;
    }
    public void setHappenDate (String  happenDate){
        this.happenDate=happenDate;
    }
    public  String getHappenDate(){
        return this.happenDate;
    }
    public void setSupplierID (String  supplierID){
        this.supplierID=supplierID;
    }
    public  String getSupplierID(){
        return this.supplierID;
    }
    public void setMonetary (String  monetary){
        this.monetary=monetary;
    }
    public  String getMonetary(){
        return this.monetary;
    }
    public void setDueMoney (Double  dueMoney){
        this.dueMoney=dueMoney;
    }
    public  Double getDueMoney(){
        return this.dueMoney;
    }
    public void setPaidMoney (Double  paidMoney){
        this.paidMoney=paidMoney;
    }
    public  Double getPaidMoney(){
        return this.paidMoney;
    }
    public void setRemainMoney (Double  remainMoney){
        this.remainMoney=remainMoney;
    }
    public  Double getRemainMoney(){
        return this.remainMoney;
    }
    public void setBuyORreturn (String  buyORreturn){
        this.buyORreturn=buyORreturn;
    }
    public  String getBuyORreturn(){
        return this.buyORreturn;
    }
    public void setOperatorID (String  operatorID){
        this.operatorID=operatorID;
    }
    public  String getOperatorID(){
        return this.operatorID;
    }
    public void setExaminerIID (String  examinerIID){
        this.examinerIID=examinerIID;
    }
    public  String getExaminerIID(){
        return this.examinerIID;
    }
    public void setOthers (String  others){
        this.others=others;
    }
    public  String getOthers(){
        return this.others;
    }
    public void setChargeoff (String  chargeoff){
        this.chargeoff=chargeoff;
    }
    public  String getChargeoff(){
        return this.chargeoff;
    }
}
