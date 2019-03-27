package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Plandetail implements Serializable {
    //
    private String planDetailID;
    //
    private String planID;
    //
    private String goodsID;
    //
    private Integer quantity;
    //
    private String others;
    //get set 方法
    public void setPlanDetailID (String  planDetailID){
        this.planDetailID=planDetailID;
    }
    public  String getPlanDetailID(){
        return this.planDetailID;
    }
    public void setPlanID (String  planID){
        this.planID=planID;
    }
    public  String getPlanID(){
        return this.planID;
    }
    public void setGoodsID (String  goodsID){
        this.goodsID=goodsID;
    }
    public  String getGoodsID(){
        return this.goodsID;
    }
    public void setQuantity (Integer  quantity){
        this.quantity=quantity;
    }
    public  Integer getQuantity(){
        return this.quantity;
    }
    public void setOthers (String  others){
        this.others=others;
    }
    public  String getOthers(){
        return this.others;
    }
}
