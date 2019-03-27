package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   æ¥è­¦
*/
public class Alarm implements Serializable {
    //编号
    private Integer Id;
    //报警时间
    private String date;
    //get set 方法
    public void setId (Integer  Id){
        this.Id=Id;
    }
    public  Integer getId(){
        return this.Id;
    }
    public void setDate (String  date){
        this.date=date;
    }
    public  String getDate(){
        return this.date;
    }
}
