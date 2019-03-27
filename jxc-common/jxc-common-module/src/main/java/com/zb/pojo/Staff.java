package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   åå·¥è¡¨
*/
public class Staff implements Serializable {
    //编号
    private String Id;
    //姓名
    private String name;
    //电话
    private String telephone;
    //get set 方法
    public void setId (String  Id){
        this.Id=Id;
    }
    public  String getId(){
        return this.Id;
    }
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
    public void setTelephone (String  telephone){
        this.telephone=telephone;
    }
    public  String getTelephone(){
        return this.telephone;
    }
}
