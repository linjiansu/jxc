package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Caigouenter implements Serializable {
    //
    private String enterID;
    //
    private String supplierName;
    //
    private String monetary;
    //
    private String billID;
    //
    private String buyDate;
    //
    private String buyerID;
    //
    private String orderID;
    //
    private String operatorID;
    //
    private String enterDate;
    //
    private String opmanIID;
    //
    private String opDate;
    //
    private String examinerID;
    //
    private String examineDate;
    //
    private String others;
    //
    private String examineState;
    //get set 方法
    public void setEnterID (String  enterID){
        this.enterID=enterID;
    }
    public  String getEnterID(){
        return this.enterID;
    }
    public void setSupplierName (String  supplierName){
        this.supplierName=supplierName;
    }
    public  String getSupplierName(){
        return this.supplierName;
    }
    public void setMonetary (String  monetary){
        this.monetary=monetary;
    }
    public  String getMonetary(){
        return this.monetary;
    }
    public void setBillID (String  billID){
        this.billID=billID;
    }
    public  String getBillID(){
        return this.billID;
    }
    public void setBuyDate (String  buyDate){
        this.buyDate=buyDate;
    }
    public  String getBuyDate(){
        return this.buyDate;
    }
    public void setBuyerID (String  buyerID){
        this.buyerID=buyerID;
    }
    public  String getBuyerID(){
        return this.buyerID;
    }
    public void setOrderID (String  orderID){
        this.orderID=orderID;
    }
    public  String getOrderID(){
        return this.orderID;
    }
    public void setOperatorID (String  operatorID){
        this.operatorID=operatorID;
    }
    public  String getOperatorID(){
        return this.operatorID;
    }
    public void setEnterDate (String  enterDate){
        this.enterDate=enterDate;
    }
    public  String getEnterDate(){
        return this.enterDate;
    }
    public void setOpmanIID (String  opmanIID){
        this.opmanIID=opmanIID;
    }
    public  String getOpmanIID(){
        return this.opmanIID;
    }
    public void setOpDate (String  opDate){
        this.opDate=opDate;
    }
    public  String getOpDate(){
        return this.opDate;
    }
    public void setExaminerID (String  examinerID){
        this.examinerID=examinerID;
    }
    public  String getExaminerID(){
        return this.examinerID;
    }
    public void setExamineDate (String  examineDate){
        this.examineDate=examineDate;
    }
    public  String getExamineDate(){
        return this.examineDate;
    }
    public void setOthers (String  others){
        this.others=others;
    }
    public  String getOthers(){
        return this.others;
    }
    public void setExamineState (String  examineState){
        this.examineState=examineState;
    }
    public  String getExamineState(){
        return this.examineState;
    }
}
