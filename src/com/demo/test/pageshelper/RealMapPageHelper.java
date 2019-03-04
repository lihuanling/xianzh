package com.demo.test.pageshelper;

import static org.testng.Assert.fail;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.demo.test.pages.RealMapPage;
import com.demo.test.utils.SeleniumUtil;

/**
 * @author Young
 * @desciption 首页帮助类：专门提供在这个页面进行操作的方法封装*/
public class RealMapPageHelper {
	//提供本类中日志输出对象
	public static Logger logger = Logger.getLogger(RealMapPageHelper.class);
	
	/**
	 * @author Young
	 * @description 等待首页元素加载
	 * @param seleniumUtil selenium api封装引用对象
	 * @param timeOut 等待元素超时的时间
	 * */
	public static void waitHomePageLoad(SeleniumUtil seleniumUtil,int timeOut){
		logger.info("开始加载实时图");
		seleniumUtil.waitForElementToLoad(timeOut, RealMapPage.ZH_TEXT_REALMAP);
		seleniumUtil.pause(3000);
	}
	//取消元素选中
	public static void UnjudgementCheck(SeleniumUtil seleniumUtil,By by) {
		logger.info("判断元素是否被选中");
		if(seleniumUtil.findElementBy(by).isSelected()) {
			logger.info("元素已被选中，进行取消选中操作");
			seleniumUtil.pause(3000);
			seleniumUtil.click(by);
			seleniumUtil.pause(3000);
			logger.info("判断元素是否取消选中");
			if(seleniumUtil.findElementBy(by).isSelected() == false) {
				logger.info("该元素已成功取消选择");
			}else {
				logger.info("该元素没有取消选择");
				Assert.fail();
			}
		}else {
			logger.info("该元素没有被选择");
			Assert.fail();
		}
	}
	//判断各元素是否已选中，未选中进行选中操作
	public static void judgementCheck(SeleniumUtil seleniumUtil,By by) {
		if(seleniumUtil.findElementBy(by).isSelected()==false) {
			logger.info("勾选" + by + "元素");
			seleniumUtil.click(by);
			seleniumUtil.pause(2000);
			logger.info("判断该元素是否被选中");
			if(seleniumUtil.findElementBy(by).isSelected()) {
				logger.info("该元素成功选中");
			}else {
				logger.info("元素选择不成功");
				Assert.fail();
			}
		}else if(seleniumUtil.findElementBy(by).isSelected()){
			logger.info("当前元素已被勾选");
			Assert.fail();
		}
		else {
			logger.info("当前元素不可被勾选");
			Assert.fail();
		}
		
	}
	//判断元素是否可以被勾选
	public static Boolean judgementChildCheck(SeleniumUtil seleniumUtil,By by) {
		logger.info("判断元素是否已被选中");
		 if(seleniumUtil.findElementBy(by).isSelected()) {
			  logger.info("该元素已被选中");
			  return true;
		  }else {
			  logger.info("该元素没有被选中");
			  return false;
		  }
	}
	//判断一个元素是否可以被点击
	public static Boolean whetherCheck(SeleniumUtil seleniumUtil,By by) {
		if(seleniumUtil.findElementBy(by).isEnabled()) {
			logger.info("该元素可以被点击");
			return true;
		}else {
			logger.info("该元素不可以被点击");
			return false;
		}
	}

	//元素选择操作
	public static void elementChoose(SeleniumUtil seleniumUtil,By by) {
		
	}
	//判断元素是否已选中
	public static void elementAlreadyChoose() {
		
	}
	//判断元素是否可以点击
	public static void elementWetherClick() {
		
	}
	//元素取消操作
	public static void elementUnClick() {
		
	}
}
