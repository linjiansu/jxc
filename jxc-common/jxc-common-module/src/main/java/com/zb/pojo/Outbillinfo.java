package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   åºåºåæç»
*/
public class Outbillinfo implements Serializable {
    //出库明细单号
    private String billId;
    //商品
    private String goodname;
    //颜色
    private String color;
    //单价
    private Float price;
    //出库单编号
    private String outbillid;
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
    public void setOutbillid (String  outbillid){
        this.outbillid=outbillid;
    }
    public  String getOutbillid(){
        return this.outbillid;
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
