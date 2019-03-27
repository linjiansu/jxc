package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Goodbackdetail implements Serializable {
    //退货明细ID
    private String id;
    //商品ID
    private String good;
    //单价
    private Float price;
    //退货单ID
    private String goodbackId;
    //数量
    private Integer quantity;
    //get set 方法
    public void setId (String  id){
        this.id=id;
    }
    public  String getId(){
        return this.id;
    }
    public void setGood (String  good){
        this.good=good;
    }
    public  String getGood(){
        return this.good;
    }
    public void setPrice (Float  price){
        this.price=price;
    }
    public  Float getPrice(){
        return this.price;
    }
    public void setGoodbackId (String  goodbackId){
        this.goodbackId=goodbackId;
    }
    public  String getGoodbackId(){
        return this.goodbackId;
    }
    public void setQuantity (Integer  quantity){
        this.quantity=quantity;
    }
    public  Integer getQuantity(){
        return this.quantity;
    }
}
