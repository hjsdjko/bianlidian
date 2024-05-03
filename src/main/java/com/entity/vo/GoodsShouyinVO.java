package com.entity.vo;

import com.entity.GoodsShouyinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 收银
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("goods_shouyin")
public class GoodsShouyinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 收银流水号
     */

    @TableField(value = "goods_shouyin_uuid_number")
    private String goodsShouyinUuidNumber;


    /**
     * 员工
     */

    @TableField(value = "yuangong_id")
    private Integer yuangongId;


    /**
     * 实付金额
     */

    @TableField(value = "goods_shouyin_true_price")
    private Double goodsShouyinTruePrice;


    /**
     * 收银类型
     */

    @TableField(value = "goods_shouyin_types")
    private Integer goodsShouyinTypes;


    /**
     * 备注
     */

    @TableField(value = "goods_shouyin_content")
    private String goodsShouyinContent;


    /**
     * 购买时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：收银流水号
	 */
    public String getGoodsShouyinUuidNumber() {
        return goodsShouyinUuidNumber;
    }


    /**
	 * 获取：收银流水号
	 */

    public void setGoodsShouyinUuidNumber(String goodsShouyinUuidNumber) {
        this.goodsShouyinUuidNumber = goodsShouyinUuidNumber;
    }
    /**
	 * 设置：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 获取：员工
	 */

    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 设置：实付金额
	 */
    public Double getGoodsShouyinTruePrice() {
        return goodsShouyinTruePrice;
    }


    /**
	 * 获取：实付金额
	 */

    public void setGoodsShouyinTruePrice(Double goodsShouyinTruePrice) {
        this.goodsShouyinTruePrice = goodsShouyinTruePrice;
    }
    /**
	 * 设置：收银类型
	 */
    public Integer getGoodsShouyinTypes() {
        return goodsShouyinTypes;
    }


    /**
	 * 获取：收银类型
	 */

    public void setGoodsShouyinTypes(Integer goodsShouyinTypes) {
        this.goodsShouyinTypes = goodsShouyinTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getGoodsShouyinContent() {
        return goodsShouyinContent;
    }


    /**
	 * 获取：备注
	 */

    public void setGoodsShouyinContent(String goodsShouyinContent) {
        this.goodsShouyinContent = goodsShouyinContent;
    }
    /**
	 * 设置：购买时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：购买时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
