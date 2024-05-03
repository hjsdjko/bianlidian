package com.entity.vo;

import com.entity.GongyingshangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 供应商信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongyingshang")
public class GongyingshangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 供应商名称
     */

    @TableField(value = "gongyingshang_name")
    private String gongyingshangName;


    /**
     * 供应商联系人
     */

    @TableField(value = "gongyingshang_lianxi_name")
    private String gongyingshangLianxiName;


    /**
     * 供应商联系人手机号
     */

    @TableField(value = "gongyingshang_phone")
    private String gongyingshangPhone;


    /**
     * 供应商类型
     */

    @TableField(value = "gongyingshang_types")
    private Integer gongyingshangTypes;


    /**
     * 所在地区
     */

    @TableField(value = "gongyingshang_suozaidiqu_types")
    private Integer gongyingshangSuozaidiquTypes;


    /**
     * 信用等级
     */

    @TableField(value = "gongyingshang_xinyongdengji_types")
    private Integer gongyingshangXinyongdengjiTypes;


    /**
     * 供应商详情
     */

    @TableField(value = "gongyingshang_content")
    private String gongyingshangContent;


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
	 * 设置：供应商名称
	 */
    public String getGongyingshangName() {
        return gongyingshangName;
    }


    /**
	 * 获取：供应商名称
	 */

    public void setGongyingshangName(String gongyingshangName) {
        this.gongyingshangName = gongyingshangName;
    }
    /**
	 * 设置：供应商联系人
	 */
    public String getGongyingshangLianxiName() {
        return gongyingshangLianxiName;
    }


    /**
	 * 获取：供应商联系人
	 */

    public void setGongyingshangLianxiName(String gongyingshangLianxiName) {
        this.gongyingshangLianxiName = gongyingshangLianxiName;
    }
    /**
	 * 设置：供应商联系人手机号
	 */
    public String getGongyingshangPhone() {
        return gongyingshangPhone;
    }


    /**
	 * 获取：供应商联系人手机号
	 */

    public void setGongyingshangPhone(String gongyingshangPhone) {
        this.gongyingshangPhone = gongyingshangPhone;
    }
    /**
	 * 设置：供应商类型
	 */
    public Integer getGongyingshangTypes() {
        return gongyingshangTypes;
    }


    /**
	 * 获取：供应商类型
	 */

    public void setGongyingshangTypes(Integer gongyingshangTypes) {
        this.gongyingshangTypes = gongyingshangTypes;
    }
    /**
	 * 设置：所在地区
	 */
    public Integer getGongyingshangSuozaidiquTypes() {
        return gongyingshangSuozaidiquTypes;
    }


    /**
	 * 获取：所在地区
	 */

    public void setGongyingshangSuozaidiquTypes(Integer gongyingshangSuozaidiquTypes) {
        this.gongyingshangSuozaidiquTypes = gongyingshangSuozaidiquTypes;
    }
    /**
	 * 设置：信用等级
	 */
    public Integer getGongyingshangXinyongdengjiTypes() {
        return gongyingshangXinyongdengjiTypes;
    }


    /**
	 * 获取：信用等级
	 */

    public void setGongyingshangXinyongdengjiTypes(Integer gongyingshangXinyongdengjiTypes) {
        this.gongyingshangXinyongdengjiTypes = gongyingshangXinyongdengjiTypes;
    }
    /**
	 * 设置：供应商详情
	 */
    public String getGongyingshangContent() {
        return gongyingshangContent;
    }


    /**
	 * 获取：供应商详情
	 */

    public void setGongyingshangContent(String gongyingshangContent) {
        this.gongyingshangContent = gongyingshangContent;
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
