package com.entity.model;

import com.entity.GoodsShouyinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 收银
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GoodsShouyinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 收银流水号
     */
    private String goodsShouyinUuidNumber;


    /**
     * 员工
     */
    private Integer yuangongId;


    /**
     * 实付金额
     */
    private Double goodsShouyinTruePrice;


    /**
     * 收银类型
     */
    private Integer goodsShouyinTypes;


    /**
     * 备注
     */
    private String goodsShouyinContent;


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
	 * 获取：收银流水号
	 */
    public String getGoodsShouyinUuidNumber() {
        return goodsShouyinUuidNumber;
    }


    /**
	 * 设置：收银流水号
	 */
    public void setGoodsShouyinUuidNumber(String goodsShouyinUuidNumber) {
        this.goodsShouyinUuidNumber = goodsShouyinUuidNumber;
    }
    /**
	 * 获取：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 设置：员工
	 */
    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 获取：实付金额
	 */
    public Double getGoodsShouyinTruePrice() {
        return goodsShouyinTruePrice;
    }


    /**
	 * 设置：实付金额
	 */
    public void setGoodsShouyinTruePrice(Double goodsShouyinTruePrice) {
        this.goodsShouyinTruePrice = goodsShouyinTruePrice;
    }
    /**
	 * 获取：收银类型
	 */
    public Integer getGoodsShouyinTypes() {
        return goodsShouyinTypes;
    }


    /**
	 * 设置：收银类型
	 */
    public void setGoodsShouyinTypes(Integer goodsShouyinTypes) {
        this.goodsShouyinTypes = goodsShouyinTypes;
    }
    /**
	 * 获取：备注
	 */
    public String getGoodsShouyinContent() {
        return goodsShouyinContent;
    }


    /**
	 * 设置：备注
	 */
    public void setGoodsShouyinContent(String goodsShouyinContent) {
        this.goodsShouyinContent = goodsShouyinContent;
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
