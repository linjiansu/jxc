package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Orders implements Serializable {
    //订单ID
    private String id;
    //订单日期
    private String orderTime;
    //客户ID
    private String kh;
    //货币
    private Float money;
    //销售人ID
    private String sellId;
    //销售日期（外）
    private String sellTime;
    //付款方式
    private String pay;
    //交货地点
    private String address;
    //备注
    private String note;
    //完成状态
    private String finish;
    //操作员ID
    private String op;
    //审核人ID
    private String shr;
    //审核状态
    private String sh;
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
    public void setSellId (String  sellId){
        this.sellId=sellId;
    }
    public  String getSellId(){
        return this.sellId;
    }
    public void setSellTime (String  sellTime){
        this.sellTime=sellTime;
    }
    public  String getSellTime(){
        return this.sellTime;
    }
    public void setPay (String  pay){
        this.pay=pay;
    }
    public  String getPay(){
        return this.pay;
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
    public void setFinish (String  finish){
        this.finish=finish;
    }
    public  String getFinish(){
        return this.finish;
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
}
