package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Returneddetail implements Serializable {
    //
    private String returnDetailID;
    //
    private String returnedID;
    //
    private String goodsID;
    //
    private Integer quantity;
    //
    private Double uintprice;
    //
    private String others;
    //get set 方法
    public void setReturnDetailID (String  returnDetailID){
        this.returnDetailID=returnDetailID;
    }
    public  String getReturnDetailID(){
        return this.returnDetailID;
    }
    public void setReturnedID (String  returnedID){
        this.returnedID=returnedID;
    }
    public  String getReturnedID(){
        return this.returnedID;
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
