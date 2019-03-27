package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Receiptdetail implements Serializable {
    //收款明细ID
    private String id;
    //原始单号ID
    private String receiptId;
    //本次收款
    private Float tMoney;
    //get set 方法
    public void setId (String  id){
        this.id=id;
    }
    public  String getId(){
        return this.id;
    }
    public void setReceiptId (String  receiptId){
        this.receiptId=receiptId;
    }
    public  String getReceiptId(){
        return this.receiptId;
    }
    public void setTMoney (Float  tMoney){
        this.tMoney=tMoney;
    }
    public  Float getTMoney(){
        return this.tMoney;
    }
}
