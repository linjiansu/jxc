package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Enterdetail implements Serializable {
    //
    private String enterDetailID;
    //
    private String enterID;
    //
    private String goodsID;
    //
    private Integer quantity;
    //
    private Double uintprice;
    //
    private String others;
    //get set 方法
    public void setEnterDetailID (String  enterDetailID){
        this.enterDetailID=enterDetailID;
    }
    public  String getEnterDetailID(){
        return this.enterDetailID;
    }
    public void setEnterID (String  enterID){
        this.enterID=enterID;
    }
    public  String getEnterID(){
        return this.enterID;
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
    public void setUintprice (Double  uintprice){
        this.uintprice=uintprice;
    }
    public  Double getUintprice(){
        return this.uintprice;
    }
    public void setOthers (String  others){
        this.others=others;
    }
    public  String getOthers(){
        return this.others;
    }
}
