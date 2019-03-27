package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   ååä¿¡æ¯è¡¨
*/
public class Goodinfo implements Serializable {
    //商品编码
    private String goodId;
    //商品名称
    private String goodname;
    //类别
    private String kinds;
    //型号
    private String model;
    //单位
    private String unit;
    //仓库编码
    private String ckid;
    //仓库名称
    private String ckname;
    //入库计划单价
    private Float inprice;
    //出库计划单价
    private Float outprice;
    //库存
    private Float stock;
    //get set 方法
    public void setGoodId (String  goodId){
        this.goodId=goodId;
    }
    public  String getGoodId(){
        return this.goodId;
    }
    public void setGoodname (String  goodname){
        this.goodname=goodname;
    }
    public  String getGoodname(){
        return this.goodname;
    }
    public void setKinds (String  kinds){
        this.kinds=kinds;
    }
    public  String getKinds(){
        return this.kinds;
    }
    public void setModel (String  model){
        this.model=model;
    }
    public  String getModel(){
        return this.model;
    }
    public void setUnit (String  unit){
        this.unit=unit;
    }
    public  String getUnit(){
        return this.unit;
    }
    public void setCkid (String  ckid){
        this.ckid=ckid;
    }
    public  String getCkid(){
        return this.ckid;
    }
    public void setCkname (String  ckname){
        this.ckname=ckname;
    }
    public  String getCkname(){
        return this.ckname;
    }
    public void setInprice (Float  inprice){
        this.inprice=inprice;
    }
    public  Float getInprice(){
        return this.inprice;
    }
    public void setOutprice (Float  outprice){
        this.outprice=outprice;
    }
    public  Float getOutprice(){
        return this.outprice;
    }
    public void setStock (Float  stock){
        this.stock=stock;
    }
    public  Float getStock(){
        return this.stock;
    }
}
