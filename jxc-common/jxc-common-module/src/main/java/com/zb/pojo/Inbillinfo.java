package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   å¥åºåæç»
*/
public class Inbillinfo implements Serializable {
    //入库明细单号
    private String billId;
    //商品
    private String goodname;
    //颜色
    private String color;
    //单价
    private Float price;
    //入库单编号
    private String inbillid;
    //数量
    private Integer number;
    //单位
    private String unit;
    //get set 方法
    public void setBillId (String  billId){
        this.billId=billId;
    }
    public  String getBillId(){
        return this.billId;
    }
    public void setGoodname (String  goodname){
        this.goodname=goodname;
    }
    public  String getGoodname(){
        return this.goodname;
    }
    public void setColor (String  color){
        this.color=color;
    }
    public  String getColor(){
        return this.color;
    }
    public void setPrice (Float  price){
        this.price=price;
    }
    public  Float getPrice(){
        return this.price;
    }
    public void setInbillid (String  inbillid){
        this.inbillid=inbillid;
    }
    public  String getInbillid(){
        return this.inbillid;
    }
    public void setNumber (Integer  number){
        this.number=number;
    }
    public  Integer getNumber(){
        return this.number;
    }
    public void setUnit (String  unit){
        this.unit=unit;
    }
    public  String getUnit(){
        return this.unit;
    }
}
