package com.entity.view;

import com.entity.GoodsShouyinListEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 收银详情
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("goods_shouyin_list")
public class GoodsShouyinListView extends GoodsShouyinListEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 goods
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
				* 商品类型的值
				*/
				private String goodsValue;
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
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer goodsDelete;
			/**
			* 商品简介
			*/
			private String goodsContent;

		//级联表 goods_shouyin
			/**
			* 收银流水号
			*/
			private String goodsShouyinUuidNumber;
			/**
			* 实付金额
			*/
			private Double goodsShouyinTruePrice;
			/**
			* 收银类型
			*/
			private Integer goodsShouyinTypes;
				/**
				* 收银类型的值
				*/
				private String goodsShouyinValue;
			/**
			* 备注
			*/
			private String goodsShouyinContent;

	public GoodsShouyinListView() {

	}

	public GoodsShouyinListView(GoodsShouyinListEntity goodsShouyinListEntity) {
		try {
			BeanUtils.copyProperties(this, goodsShouyinListEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}














				//级联表的get和set goods
					/**
					* 获取： 商品唯一编号
					*/
					public String getGoodsUuidNumber() {
						return goodsUuidNumber;
					}
					/**
					* 设置： 商品唯一编号
					*/
					public void setGoodsUuidNumber(String goodsUuidNumber) {
						this.goodsUuidNumber = goodsUuidNumber;
					}
					/**
					* 获取： 商品名称
					*/
					public String getGoodsName() {
						return goodsName;
					}
					/**
					* 设置： 商品名称
					*/
					public void setGoodsName(String goodsName) {
						this.goodsName = goodsName;
					}
					/**
					* 获取： 商品照片
					*/
					public String getGoodsPhoto() {
						return goodsPhoto;
					}
					/**
					* 设置： 商品照片
					*/
					public void setGoodsPhoto(String goodsPhoto) {
						this.goodsPhoto = goodsPhoto;
					}
					/**
					* 获取： 商品类型
					*/
					public Integer getGoodsTypes() {
						return goodsTypes;
					}
					/**
					* 设置： 商品类型
					*/
					public void setGoodsTypes(Integer goodsTypes) {
						this.goodsTypes = goodsTypes;
					}


						/**
						* 获取： 商品类型的值
						*/
						public String getGoodsValue() {
							return goodsValue;
						}
						/**
						* 设置： 商品类型的值
						*/
						public void setGoodsValue(String goodsValue) {
							this.goodsValue = goodsValue;
						}
					/**
					* 获取： 商品库存
					*/
					public Integer getGoodsKucunNumber() {
						return goodsKucunNumber;
					}
					/**
					* 设置： 商品库存
					*/
					public void setGoodsKucunNumber(Integer goodsKucunNumber) {
						this.goodsKucunNumber = goodsKucunNumber;
					}
					/**
					* 获取： 进价
					*/
					public Double getGoodsNewMoney() {
						return goodsNewMoney;
					}
					/**
					* 设置： 进价
					*/
					public void setGoodsNewMoney(Double goodsNewMoney) {
						this.goodsNewMoney = goodsNewMoney;
					}
					/**
					* 获取： 售价
					*/
					public Double getGoodsXiaoshouMoney() {
						return goodsXiaoshouMoney;
					}
					/**
					* 设置： 售价
					*/
					public void setGoodsXiaoshouMoney(Double goodsXiaoshouMoney) {
						this.goodsXiaoshouMoney = goodsXiaoshouMoney;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getGoodsDelete() {
						return goodsDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setGoodsDelete(Integer goodsDelete) {
						this.goodsDelete = goodsDelete;
					}
					/**
					* 获取： 商品简介
					*/
					public String getGoodsContent() {
						return goodsContent;
					}
					/**
					* 设置： 商品简介
					*/
					public void setGoodsContent(String goodsContent) {
						this.goodsContent = goodsContent;
					}








				//级联表的get和set goods_shouyin
					/**
					* 获取： 收银流水号
					*/
					public String getGoodsShouyinUuidNumber() {
						return goodsShouyinUuidNumber;
					}
					/**
					* 设置： 收银流水号
					*/
					public void setGoodsShouyinUuidNumber(String goodsShouyinUuidNumber) {
						this.goodsShouyinUuidNumber = goodsShouyinUuidNumber;
					}
					/**
					* 获取： 实付金额
					*/
					public Double getGoodsShouyinTruePrice() {
						return goodsShouyinTruePrice;
					}
					/**
					* 设置： 实付金额
					*/
					public void setGoodsShouyinTruePrice(Double goodsShouyinTruePrice) {
						this.goodsShouyinTruePrice = goodsShouyinTruePrice;
					}
					/**
					* 获取： 收银类型
					*/
					public Integer getGoodsShouyinTypes() {
						return goodsShouyinTypes;
					}
					/**
					* 设置： 收银类型
					*/
					public void setGoodsShouyinTypes(Integer goodsShouyinTypes) {
						this.goodsShouyinTypes = goodsShouyinTypes;
					}


						/**
						* 获取： 收银类型的值
						*/
						public String getGoodsShouyinValue() {
							return goodsShouyinValue;
						}
						/**
						* 设置： 收银类型的值
						*/
						public void setGoodsShouyinValue(String goodsShouyinValue) {
							this.goodsShouyinValue = goodsShouyinValue;
						}
					/**
					* 获取： 备注
					*/
					public String getGoodsShouyinContent() {
						return goodsShouyinContent;
					}
					/**
					* 设置： 备注
					*/
					public void setGoodsShouyinContent(String goodsShouyinContent) {
						this.goodsShouyinContent = goodsShouyinContent;
					}










}
