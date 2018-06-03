package com.niepengfei.langjitianya.backend.vo.item;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jack
 */
@ApiModel(value = "ItemBO",description = "商品信息模型简介")
public class ItemVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="商品id，同时也是商品编号")
    private Long id;

    @ApiModelProperty(value="商品标题")
    private String title;

    @ApiModelProperty(value="商品卖点")
    private String sellPoint;

    @ApiModelProperty(value="商品价格，单位为：分")
    private Long price;

    @ApiModelProperty(value="商品库存")
    private Integer num;

    @ApiModelProperty(value="商品条形码")
    private String barcode;

    @ApiModelProperty(value="商品图片")
    private String image;

    @ApiModelProperty(value="所属类目，叶子类目")
    private Long cid;

    @ApiModelProperty(value="商品状态，1-正常，2-下架，3-删除")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date created;

    @ApiModelProperty(value="更新时间")
    private Date updated;

    public void setId(Long id){
        this.id=id;
    }

    public Long getId(){
        return id;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getTitle(){
        return title;
    }

    public void setSellPoint(String sellPoint){
        this.sellPoint=sellPoint;
    }

    public String getSellPoint(){
        return sellPoint;
    }

    public void setPrice(Long price){
        this.price=price;
    }

    public Long getPrice(){
        return price;
    }

    public void setNum(Integer num){
        this.num=num;
    }

    public Integer getNum(){
        return num;
    }

    public void setBarcode(String barcode){
        this.barcode=barcode;
    }

    public String getBarcode(){
        return barcode;
    }

    public void setImage(String image){
        this.image=image;
    }

    public String getImage(){
        return image;
    }

    public void setCid(Long cid){
        this.cid=cid;
    }

    public Long getCid(){
        return cid;
    }

    public void setStatus(Integer status){
        this.status=status;
    }

    public Integer getStatus(){
        return status;
    }

    public void setCreated(Date created){
        this.created=created;
    }

    public Date getCreated(){
        return created;
    }

    public void setUpdated(Date updated){
        this.updated=updated;
    }

    public Date getUpdated(){
        return updated;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", sellPoint='" + sellPoint + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", barcode='" + barcode + '\'' +
                ", image='" + image + '\'' +
                ", cid=" + cid +
                ", status=" + status +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
