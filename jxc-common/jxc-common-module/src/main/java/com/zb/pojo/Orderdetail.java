package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Orderdetail implements Serializable {
    //
    private String orderDetailID;
    //
    private String orderID;
    //
    private String goodsID;
    //
    private Integer quantity;
    //
    private Double uintprice;
    //
    private String others;
    //get set 方法
    public void setOrderDetailID (String  orderDetailID){
        this.orderDetailID=orderDetailID;
    }
    public  String getOrderDetailID(){
        return this.orderDetailID;
    }
    public void setOrderID (String  orderID){
        this.orderID=orderID;
    }
    public  String getOrderID(){
        return this.orderID;
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
