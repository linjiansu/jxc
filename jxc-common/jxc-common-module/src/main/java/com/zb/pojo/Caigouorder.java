package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Caigouorder implements Serializable {
    //
    private String orderID;
    //
    private String supplierID;
    //
    private String orderDate;
    //
    private String deliverDate;
    //
    private String monetary;
    //
    private String buyerID;
    //
    private String POD;
    //
    private String others;
    //
    private String operatorID;
    //
    private String examinerID;
    //
    private String examineState;
    //
    private String deal;
    //get set 方法
    public void setOrderID (String  orderID){
        this.orderID=orderID;
    }
    public  String getOrderID(){
        return this.orderID;
    }
    public void setSupplierID (String  supplierID){
        this.supplierID=supplierID;
    }
    public  String getSupplierID(){
        return this.supplierID;
    }
    public void setOrderDate (String  orderDate){
        this.orderDate=orderDate;
    }
    public  String getOrderDate(){
        return this.orderDate;
    }
    public void setDeliverDate (String  deliverDate){
        this.deliverDate=deliverDate;
    }
    public  String getDeliverDate(){
        return this.deliverDate;
    }
    public void setMonetary (String  monetary){
        this.monetary=monetary;
    }
    public  String getMonetary(){
        return this.monetary;
    }
    public void setBuyerID (String  buyerID){
        this.buyerID=buyerID;
    }
    public  String getBuyerID(){
        return this.buyerID;
    }
    public void setPOD (String  POD){
        this.POD=POD;
    }
    public  String getPOD(){
        return this.POD;
    }
    public void setOthers (String  others){
        this.others=others;
    }
    public  String getOthers(){
        return this.others;
    }
    public void setOperatorID (String  operatorID){
        this.operatorID=operatorID;
    }
    public  String getOperatorID(){
        return this.operatorID;
    }
    public void setExaminerID (String  examinerID){
        this.examinerID=examinerID;
    }
    public  String getExaminerID(){
        return this.examinerID;
    }
    public void setExamineState (String  examineState){
        this.examineState=examineState;
    }
    public  String getExamineState(){
        return this.examineState;
    }
    public void setDeal (String  deal){
        this.deal=deal;
    }
    public  String getDeal(){
        return this.deal;
    }
}
