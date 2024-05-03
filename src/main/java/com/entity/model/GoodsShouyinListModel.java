package com.entity.model;

import com.entity.GoodsShouyinListEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 收银详情
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GoodsShouyinListModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 收银
     */
    private Integer goodsShouyinId;


    /**
     * 商品
     */
    private Integer goodsId;


    /**
     * 购买数量
     */
    private Integer goodsShouyinListNumber;


    /**
     * 购买时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：收银
	 */
    public Integer getGoodsShouyinId() {
        return goodsShouyinId;
    }


    /**
	 * 设置：收银
	 */
    public void setGoodsShouyinId(Integer goodsShouyinId) {
        this.goodsShouyinId = goodsShouyinId;
    }
    /**
	 * 获取：商品
	 */
    public Integer getGoodsId() {
        return goodsId;
    }


    /**
	 * 设置：商品
	 */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
    /**
	 * 获取：购买数量
	 */
    public Integer getGoodsShouyinListNumber() {
        return goodsShouyinListNumber;
    }


    /**
	 * 设置：购买数量
	 */
    public void setGoodsShouyinListNumber(Integer goodsShouyinListNumber) {
        this.goodsShouyinListNumber = goodsShouyinListNumber;
    }
    /**
	 * 获取：购买时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：购买时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
