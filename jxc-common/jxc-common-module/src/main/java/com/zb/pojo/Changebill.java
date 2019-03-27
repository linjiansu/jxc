package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   è°æ¨å
*/
public class Changebill implements Serializable {
    //调库单号
    private String Id;
    //调库日期
    private String changedate;
    //审核人
    private String checker;
    //经手人
    private String issuer;
    //收货仓库
    private String receiveck;
    //发货仓库
    private String deliverck;
    //审核
    private String check;
    //审核日期
    private String checkdate;
    //get set 方法
    public void setId (String  Id){
        this.Id=Id;
    }
    public  String getId(){
        return this.Id;
    }
    public void setChangedate (String  changedate){
        this.changedate=changedate;
    }
    public  String getChangedate(){
        return this.changedate;
    }
    public void setChecker (String  checker){
        this.checker=checker;
    }
    public  String getChecker(){
        return this.checker;
    }
    public void setIssuer (String  issuer){
        this.issuer=issuer;
    }
    public  String getIssuer(){
        return this.issuer;
    }
    public void setReceiveck (String  receiveck){
        this.receiveck=receiveck;
    }
    public  String getReceiveck(){
        return this.receiveck;
    }
    public void setDeliverck (String  deliverck){
        this.deliverck=deliverck;
    }
    public  String getDeliverck(){
        return this.deliverck;
    }
    public void setCheck (String  check){
        this.check=check;
    }
    public  String getCheck(){
        return this.check;
    }
    public void setCheckdate (String  checkdate){
        this.checkdate=checkdate;
    }
    public  String getCheckdate(){
        return this.checkdate;
    }
}
