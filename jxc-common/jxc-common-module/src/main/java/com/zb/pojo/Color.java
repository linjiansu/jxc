package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   é¢è²è¡¨
*/
public class Color implements Serializable {
    //颜色编号
    private String colorId;
    //名称
    private String name;
    //get set 方法
    public void setColorId (String  colorId){
        this.colorId=colorId;
    }
    public  String getColorId(){
        return this.colorId;
    }
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
}
