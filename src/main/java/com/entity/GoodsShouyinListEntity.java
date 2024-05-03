package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 收银详情
 *
 * @author 
 * @email
 */
@TableName("goods_shouyin_list")
public class GoodsShouyinListEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GoodsShouyinListEntity() {

	}

	public GoodsShouyinListEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "GoodsShouyinList{" +
            "id=" + id +
            ", goodsShouyinId=" + goodsShouyinId +
            ", goodsId=" + goodsId +
            ", goodsShouyinListNumber=" + goodsShouyinListNumber +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
