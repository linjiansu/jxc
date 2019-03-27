package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   è®¡éåä½ä¿¡æ¯è¡¨
*/
public class Unit implements Serializable {
    //编号
    private Integer Id;
    //名称
    private String name;
    //get set 方法
    public void setId (Integer  Id){
        this.Id=Id;
    }
    public  Integer getId(){
        return this.Id;
    }
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
}
