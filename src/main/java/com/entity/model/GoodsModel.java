package com.entity.model;

import com.entity.GoodsEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商品
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GoodsModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 商品唯一编号
     */
    private String goodsUuidNumber;


    /**
     * 商品名称
     */
    private String goodsName;


    /**
     * 商品照片
     */
    private String goodsPhoto;


    /**
     * 商品类型
     */
    private Integer goodsTypes;


    /**
     * 商品库存
     */
    private Integer goodsKucunNumber;


    /**
     * 进价
     */
    private Double goodsNewMoney;


    /**
     * 售价
     */
    private Double goodsXiaoshouMoney;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer goodsDelete;


    /**
     * 商品简介
     */
    private String goodsContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：商品唯一编号
	 */
    public String getGoodsUuidNumber() {
        return goodsUuidNumber;
    }


    /**
	 * 设置：商品唯一编号
	 */
    public void setGoodsUuidNumber(String goodsUuidNumber) {
        this.goodsUuidNumber = goodsUuidNumber;
    }
    /**
	 * 获取：商品名称
	 */
    public String getGoodsName() {
        return goodsName;
    }


    /**
	 * 设置：商品名称
	 */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    /**
	 * 获取：商品照片
	 */
    public String getGoodsPhoto() {
        return goodsPhoto;
    }


    /**
	 * 设置：商品照片
	 */
    public void setGoodsPhoto(String goodsPhoto) {
        this.goodsPhoto = goodsPhoto;
    }
    /**
	 * 获取：商品类型
	 */
    public Integer getGoodsTypes() {
        return goodsTypes;
    }


    /**
	 * 设置：商品类型
	 */
    public void setGoodsTypes(Integer goodsTypes) {
        this.goodsTypes = goodsTypes;
    }
    /**
	 * 获取：商品库存
	 */
    public Integer getGoodsKucunNumber() {
        return goodsKucunNumber;
    }


    /**
	 * 设置：商品库存
	 */
    public void setGoodsKucunNumber(Integer goodsKucunNumber) {
        this.goodsKucunNumber = goodsKucunNumber;
    }
    /**
	 * 获取：进价
	 */
    public Double getGoodsNewMoney() {
        return goodsNewMoney;
    }


    /**
	 * 设置：进价
	 */
    public void setGoodsNewMoney(Double goodsNewMoney) {
        this.goodsNewMoney = goodsNewMoney;
    }
    /**
	 * 获取：售价
	 */
    public Double getGoodsXiaoshouMoney() {
        return goodsXiaoshouMoney;
    }


    /**
	 * 设置：售价
	 */
    public void setGoodsXiaoshouMoney(Double goodsXiaoshouMoney) {
        this.goodsXiaoshouMoney = goodsXiaoshouMoney;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getGoodsDelete() {
        return goodsDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setGoodsDelete(Integer goodsDelete) {
        this.goodsDelete = goodsDelete;
    }
    /**
	 * 获取：商品简介
	 */
    public String getGoodsContent() {
        return goodsContent;
    }


    /**
	 * 设置：商品简介
	 */
    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
