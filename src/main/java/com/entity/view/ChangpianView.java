package com.entity.view;

import com.entity.ChangpianEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("changpian")
public class ChangpianView extends ChangpianEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 商品类型的值
		*/
		private String changpianValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public ChangpianView() {

	}

	public ChangpianView(ChangpianEntity changpianEntity) {
		try {
			BeanUtils.copyProperties(this, changpianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 商品类型的值
			*/
			public String getChangpianValue() {
				return changpianValue;
			}
			/**
			* 设置： 商品类型的值
			*/
			public void setChangpianValue(String changpianValue) {
				this.changpianValue = changpianValue;
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




















}
