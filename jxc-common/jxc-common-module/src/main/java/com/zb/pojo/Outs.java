package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Outs implements Serializable {
    //出库ID
    private String id;
    //销售日期
    private String orderTime;
    //客户ID
    private String kh;
    //货币
    private Float money;
    //付款方式
    private String pay;
    //销售人ID
    private String sellId;
    //发货人ID
    private String sendId;
    //送货地址
    private String address;
    //备注
    private String note;
    //操作员ID
    private String op;
    //审核人ID
    private String shr;
    //审核状态
    private String sh;
    //订单号ID
    private String orderId;
    //录入时间
    private String inTime;
    //审核时间
    private String shTime;
    //get set 方法
    public void setId (String  id){
        this.id=id;
    }
    public  String getId(){
        return this.id;
    }
    public void setOrderTime (String  orderTime){
        this.orderTime=orderTime;
    }
    public  String getOrderTime(){
        return this.orderTime;
    }
    public void setKh (String  kh){
        this.kh=kh;
    }
    public  String getKh(){
        return this.kh;
    }
    public void setMoney (Float  money){
        this.money=money;
    }
    public  Float getMoney(){
        return this.money;
    }
    public void setPay (String  pay){
        this.pay=pay;
    }
    public  String getPay(){
        return this.pay;
    }
    public void setSellId (String  sellId){
        this.sellId=sellId;
    }
    public  String getSellId(){
        return this.sellId;
    }
    public void setSendId (String  sendId){
        this.sendId=sendId;
    }
    public  String getSendId(){
        return this.sendId;
    }
    public void setAddress (String  address){
        this.address=address;
    }
    public  String getAddress(){
        return this.address;
    }
    public void setNote (String  note){
        this.note=note;
    }
    public  String getNote(){
        return this.note;
    }
    public void setOp (String  op){
        this.op=op;
    }
    public  String getOp(){
        return this.op;
    }
    public void setShr (String  shr){
        this.shr=shr;
    }
    public  String getShr(){
        return this.shr;
    }
    public void setSh (String  sh){
        this.sh=sh;
    }
    public  String getSh(){
        return this.sh;
    }
    public void setOrderId (String  orderId){
        this.orderId=orderId;
    }
    public  String getOrderId(){
        return this.orderId;
    }
    public void setInTime (String  inTime){
        this.inTime=inTime;
    }
    public  String getInTime(){
        return this.inTime;
    }
    public void setShTime (String  shTime){
        this.shTime=shTime;
    }
    public  String getShTime(){
        return this.shTime;
    }
}
