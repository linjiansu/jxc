package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Caigoureturned implements Serializable {
    //
    private String returnedID;
    //
    private String supplierID;
    //
    private String monetary;
    //
    private String billID;
    //
    private String returnedDate;
    //
    private String shipperID;
    //
    private String operatorID;
    //
    private String enterDate;
    //
    private String opmanID;
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
    public void setReturnedID (String  returnedID){
        this.returnedID=returnedID;
    }
    public  String getReturnedID(){
        return this.returnedID;
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
    public void setBillID (String  billID){
        this.billID=billID;
    }
    public  String getBillID(){
        return this.billID;
    }
    public void setReturnedDate (String  returnedDate){
        this.returnedDate=returnedDate;
    }
    public  String getReturnedDate(){
        return this.returnedDate;
    }
    public void setShipperID (String  shipperID){
        this.shipperID=shipperID;
    }
    public  String getShipperID(){
        return this.shipperID;
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
    public void setOpmanID (String  opmanID){
        this.opmanID=opmanID;
    }
    public  String getOpmanID(){
        return this.opmanID;
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
