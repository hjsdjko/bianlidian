package com.entity.model;

import com.entity.GongyingshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 供应商信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongyingshangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 供应商名称
     */
    private String gongyingshangName;


    /**
     * 供应商联系人
     */
    private String gongyingshangLianxiName;


    /**
     * 供应商联系人手机号
     */
    private String gongyingshangPhone;


    /**
     * 供应商类型
     */
    private Integer gongyingshangTypes;


    /**
     * 所在地区
     */
    private Integer gongyingshangSuozaidiquTypes;


    /**
     * 信用等级
     */
    private Integer gongyingshangXinyongdengjiTypes;


    /**
     * 供应商详情
     */
    private String gongyingshangContent;


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
	 * 获取：供应商名称
	 */
    public String getGongyingshangName() {
        return gongyingshangName;
    }


    /**
	 * 设置：供应商名称
	 */
    public void setGongyingshangName(String gongyingshangName) {
        this.gongyingshangName = gongyingshangName;
    }
    /**
	 * 获取：供应商联系人
	 */
    public String getGongyingshangLianxiName() {
        return gongyingshangLianxiName;
    }


    /**
	 * 设置：供应商联系人
	 */
    public void setGongyingshangLianxiName(String gongyingshangLianxiName) {
        this.gongyingshangLianxiName = gongyingshangLianxiName;
    }
    /**
	 * 获取：供应商联系人手机号
	 */
    public String getGongyingshangPhone() {
        return gongyingshangPhone;
    }


    /**
	 * 设置：供应商联系人手机号
	 */
    public void setGongyingshangPhone(String gongyingshangPhone) {
        this.gongyingshangPhone = gongyingshangPhone;
    }
    /**
	 * 获取：供应商类型
	 */
    public Integer getGongyingshangTypes() {
        return gongyingshangTypes;
    }


    /**
	 * 设置：供应商类型
	 */
    public void setGongyingshangTypes(Integer gongyingshangTypes) {
        this.gongyingshangTypes = gongyingshangTypes;
    }
    /**
	 * 获取：所在地区
	 */
    public Integer getGongyingshangSuozaidiquTypes() {
        return gongyingshangSuozaidiquTypes;
    }


    /**
	 * 设置：所在地区
	 */
    public void setGongyingshangSuozaidiquTypes(Integer gongyingshangSuozaidiquTypes) {
        this.gongyingshangSuozaidiquTypes = gongyingshangSuozaidiquTypes;
    }
    /**
	 * 获取：信用等级
	 */
    public Integer getGongyingshangXinyongdengjiTypes() {
        return gongyingshangXinyongdengjiTypes;
    }


    /**
	 * 设置：信用等级
	 */
    public void setGongyingshangXinyongdengjiTypes(Integer gongyingshangXinyongdengjiTypes) {
        this.gongyingshangXinyongdengjiTypes = gongyingshangXinyongdengjiTypes;
    }
    /**
	 * 获取：供应商详情
	 */
    public String getGongyingshangContent() {
        return gongyingshangContent;
    }


    /**
	 * 设置：供应商详情
	 */
    public void setGongyingshangContent(String gongyingshangContent) {
        this.gongyingshangContent = gongyingshangContent;
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
