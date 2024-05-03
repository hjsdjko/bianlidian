package com.entity.vo;

import com.entity.GoodsShouyinListEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 收银详情
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("goods_shouyin_list")
public class GoodsShouyinListVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 收银
     */

    @TableField(value = "goods_shouyin_id")
    private Integer goodsShouyinId;


    /**
     * 商品
     */

    @TableField(value = "goods_id")
    private Integer goodsId;


    /**
     * 购买数量
     */

    @TableField(value = "goods_shouyin_list_number")
    private Integer goodsShouyinListNumber;


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
	 * 设置：收银
	 */
    public Integer getGoodsShouyinId() {
        return goodsShouyinId;
    }


    /**
	 * 获取：收银
	 */

    public void setGoodsShouyinId(Integer goodsShouyinId) {
        this.goodsShouyinId = goodsShouyinId;
    }
    /**
	 * 设置：商品
	 */
    public Integer getGoodsId() {
        return goodsId;
    }


    /**
	 * 获取：商品
	 */

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
    /**
	 * 设置：购买数量
	 */
    public Integer getGoodsShouyinListNumber() {
        return goodsShouyinListNumber;
    }


    /**
	 * 获取：购买数量
	 */

    public void setGoodsShouyinListNumber(Integer goodsShouyinListNumber) {
        this.goodsShouyinListNumber = goodsShouyinListNumber;
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
