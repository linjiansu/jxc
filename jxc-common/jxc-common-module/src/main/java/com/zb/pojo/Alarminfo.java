package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   æ¥è­¦æç»
*/
public class Alarminfo implements Serializable {
    //报警明细编号
    private String Id;
    //商品
    private String goodname;
    //单位
    private String unit;
    //所在仓库
    private String ckname;
    //状态
    private String check;
    //报警单号
    private String alarmid;
    //get set 方法
    public void setId (String  Id){
        this.Id=Id;
    }
    public  String getId(){
        return this.Id;
    }
    public void setGoodname (String  goodname){
        this.goodname=goodname;
    }
    public  String getGoodname(){
        return this.goodname;
    }
    public void setUnit (String  unit){
        this.unit=unit;
    }
    public  String getUnit(){
        return this.unit;
    }
    public void setCkname (String  ckname){
        this.ckname=ckname;
    }
    public  String getCkname(){
        return this.ckname;
    }
    public void setCheck (String  check){
        this.check=check;
    }
    public  String getCheck(){
        return this.check;
    }
    public void setAlarmid (String  alarmid){
        this.alarmid=alarmid;
    }
    public  String getAlarmid(){
        return this.alarmid;
    }
}
