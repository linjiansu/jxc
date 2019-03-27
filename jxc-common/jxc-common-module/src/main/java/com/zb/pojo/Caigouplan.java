package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Caigouplan implements Serializable {
    //
    private String planID;
    //
    private String depart;
    //
    private String planDate;
    //
    private String plannerID;
    //
    private String others;
    //
    private String operatorID;
    //
    private String inDate;
    //
    private String examinerID;
    //
    private String examineState;
    //
    private String deal;
    //get set 方法
    public void setPlanID (String  planID){
        this.planID=planID;
    }
    public  String getPlanID(){
        return this.planID;
    }
    public void setDepart (String  depart){
        this.depart=depart;
    }
    public  String getDepart(){
        return this.depart;
    }
    public void setPlanDate (String  planDate){
        this.planDate=planDate;
    }
    public  String getPlanDate(){
        return this.planDate;
    }
    public void setPlannerID (String  plannerID){
        this.plannerID=plannerID;
    }
    public  String getPlannerID(){
        return this.plannerID;
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
    public void setInDate (String  inDate){
        this.inDate=inDate;
    }
    public  String getInDate(){
        return this.inDate;
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
