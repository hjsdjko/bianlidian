package com.entity.view;

import com.entity.GoodsChuruInoutEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 采购
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("goods_churu_inout")
public class GoodsChuruInoutView extends GoodsChuruInoutEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 出采购类型的值
		*/
		private String goodsChuruInoutValue;



		//级联表 gongyingshang
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
				* 供应商类型的值
				*/
				private String gongyingshangValue;
			/**
			* 所在地区
			*/
			private Integer gongyingshangSuozaidiquTypes;
				/**
				* 所在地区的值
				*/
				private String gongyingshangSuozaidiquValue;
			/**
			* 信用等级
			*/
			private Integer gongyingshangXinyongdengjiTypes;
				/**
				* 信用等级的值
				*/
				private String gongyingshangXinyongdengjiValue;
			/**
			* 供应商详情
			*/
			private String gongyingshangContent;

	public GoodsChuruInoutView() {

	}

	public GoodsChuruInoutView(GoodsChuruInoutEntity goodsChuruInoutEntity) {
		try {
			BeanUtils.copyProperties(this, goodsChuruInoutEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 出采购类型的值
			*/
			public String getGoodsChuruInoutValue() {
				return goodsChuruInoutValue;
			}
			/**
			* 设置： 出采购类型的值
			*/
			public void setGoodsChuruInoutValue(String goodsChuruInoutValue) {
				this.goodsChuruInoutValue = goodsChuruInoutValue;
			}






				//级联表的get和set gongyingshang
					/**
					* 获取： 供应商名称
					*/
					public String getGongyingshangName() {
						return gongyingshangName;
					}
					/**
					* 设置： 供应商名称
					*/
					public void setGongyingshangName(String gongyingshangName) {
						this.gongyingshangName = gongyingshangName;
					}
					/**
					* 获取： 供应商联系人
					*/
					public String getGongyingshangLianxiName() {
						return gongyingshangLianxiName;
					}
					/**
					* 设置： 供应商联系人
					*/
					public void setGongyingshangLianxiName(String gongyingshangLianxiName) {
						this.gongyingshangLianxiName = gongyingshangLianxiName;
					}
					/**
					* 获取： 供应商联系人手机号
					*/
					public String getGongyingshangPhone() {
						return gongyingshangPhone;
					}
					/**
					* 设置： 供应商联系人手机号
					*/
					public void setGongyingshangPhone(String gongyingshangPhone) {
						this.gongyingshangPhone = gongyingshangPhone;
					}
					/**
					* 获取： 供应商类型
					*/
					public Integer getGongyingshangTypes() {
						return gongyingshangTypes;
					}
					/**
					* 设置： 供应商类型
					*/
					public void setGongyingshangTypes(Integer gongyingshangTypes) {
						this.gongyingshangTypes = gongyingshangTypes;
					}


						/**
						* 获取： 供应商类型的值
						*/
						public String getGongyingshangValue() {
							return gongyingshangValue;
						}
						/**
						* 设置： 供应商类型的值
						*/
						public void setGongyingshangValue(String gongyingshangValue) {
							this.gongyingshangValue = gongyingshangValue;
						}
					/**
					* 获取： 所在地区
					*/
					public Integer getGongyingshangSuozaidiquTypes() {
						return gongyingshangSuozaidiquTypes;
					}
					/**
					* 设置： 所在地区
					*/
					public void setGongyingshangSuozaidiquTypes(Integer gongyingshangSuozaidiquTypes) {
						this.gongyingshangSuozaidiquTypes = gongyingshangSuozaidiquTypes;
					}


						/**
						* 获取： 所在地区的值
						*/
						public String getGongyingshangSuozaidiquValue() {
							return gongyingshangSuozaidiquValue;
						}
						/**
						* 设置： 所在地区的值
						*/
						public void setGongyingshangSuozaidiquValue(String gongyingshangSuozaidiquValue) {
							this.gongyingshangSuozaidiquValue = gongyingshangSuozaidiquValue;
						}
					/**
					* 获取： 信用等级
					*/
					public Integer getGongyingshangXinyongdengjiTypes() {
						return gongyingshangXinyongdengjiTypes;
					}
					/**
					* 设置： 信用等级
					*/
					public void setGongyingshangXinyongdengjiTypes(Integer gongyingshangXinyongdengjiTypes) {
						this.gongyingshangXinyongdengjiTypes = gongyingshangXinyongdengjiTypes;
					}


						/**
						* 获取： 信用等级的值
						*/
						public String getGongyingshangXinyongdengjiValue() {
							return gongyingshangXinyongdengjiValue;
						}
						/**
						* 设置： 信用等级的值
						*/
						public void setGongyingshangXinyongdengjiValue(String gongyingshangXinyongdengjiValue) {
							this.gongyingshangXinyongdengjiValue = gongyingshangXinyongdengjiValue;
						}
					/**
					* 获取： 供应商详情
					*/
					public String getGongyingshangContent() {
						return gongyingshangContent;
					}
					/**
					* 设置： 供应商详情
					*/
					public void setGongyingshangContent(String gongyingshangContent) {
						this.gongyingshangContent = gongyingshangContent;
					}














}
