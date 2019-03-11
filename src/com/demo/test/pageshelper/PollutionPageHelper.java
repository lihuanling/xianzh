package com.demo.test.pageshelper;
import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.demo.test.pages.PollutionCloudMap;
import com.demo.test.utils.SeleniumUtil;

/**
 * @desciption 首页帮助类：专门提供在这个页面进行操作的方法封装*/
public class PollutionPageHelper {
	//提供本类中日志输出对象
	public static Logger logger = Logger.getLogger(PollutionPageHelper.class);
	
	/**
	 * @description 等待首页元素加载
	 * @param seleniumUtil selenium api封装引用对象
	 * @param timeOut 等待元素超时的时间
	 * */
	public static void waitHomePageLoad(SeleniumUtil seleniumUtil,int timeOut){
		logger.info("开始加载污染云图");
		seleniumUtil.waitForElementToLoad(timeOut, PollutionCloudMap.ZH_POLLUTIONCLOUDMAP);
		logger.info("污染云图加载成功，页面登录成功，点击进入污染云图模块");
		seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP).click();
		seleniumUtil.pause(2000);
		logger.info("成功进入污染云图界面");
	}
	
//	public static Boolean elementCanChoose(SeleniumUtil seleniumUtil,WebElement element) {
//		
//	}
//	
	
	
	
	/*
	 * 判断复选框是否被勾选,如果不是默认选中的，则定义为失败
	 * **/
	public static Boolean ifCheckBoxChoose(SeleniumUtil seleniumUtil,By by) {
		
		if(seleniumUtil.findElementBy(by).isSelected()) {
			logger.info("该复选框已被选择");
			return false;
		}else {
			if(seleniumUtil.findElementBy(by).isEnabled()) {
				logger.info("该复选框可以正常操作");
				return true;
			}else {
				logger.info("该复选框不可以被操作");
				return false;
			}
			
		}
	} 
	
	    /**
	     * 默认选中的元素进行操作
	     * */
		public static boolean DefaultChoose(SeleniumUtil seleniumUtil,By by) {
			if(seleniumUtil.findElementBy(by).isSelected()) {
				logger.info("该元素已默认被选中");
				return true;
			}else{
				logger.info("该元素没有默认选中");
				return false;
			}
		}
		
		 /**
	     * 判断原始是不是可以被点击
	     * */
		public static Boolean whetherCheck(SeleniumUtil seleniumUtil,By by) {
			if(seleniumUtil.findElementBy(by).isEnabled()) {
				logger.info("该元素可以被点击");
				return true;
			}else {
				logger.info("该元素不可以被点击");
				return false;
			}
		}
	
		/**
		 * 
		 * 获取多个元素中的一个元素
		 * */
		public static WebElement el(SeleniumUtil seleniumUtil,int i,By by) {
			List<WebElement> le = seleniumUtil.findElementsBy(by);
			if(le.isEmpty()) {
				Assert.fail();
			}else {
				logger.info("当前所选择的元素是：" + le.get(i).getText());
				return le.get(i);
			}
		    return null;
		}
	
		//操作table列表
		public static void TableController(SeleniumUtil seleniumUtil,By by1,By by2) {
			List<WebElement> listElements = seleniumUtil.findElementsBy(by1);
			for(WebElement e:listElements) {
				List<WebElement> e2 = e.findElements(by2);
				for(WebElement e3:e2) {
					logger.info("所查询的信息为：" + e3.getText());
				}
				System.out.println();
			}
		}

	
	
	
	
	
	
	
	
	
	

	
	
	
	//取消元素选中
	public static void UnjudgementCheck(SeleniumUtil seleniumUtil,By by) {
		logger.info("判断元素是否被选中");
		if(seleniumUtil.findElementBy(by).isSelected()) {
			logger.info("元素已被选中，进行取消选中操作");
			seleniumUtil.click(by);
			logger.info("判断元素是否取消选中");
			if(seleniumUtil.findElementBy(by).isSelected() == false) {
				logger.info("该元素已成功取消选择");
			}else {
				logger.info("该元素没有成功取消选择");
				Assert.fail();
			}
		}else {
			logger.info("该元素没有被选择,无法进行取消选择操作");
			Assert.fail();
		}
	}
	
	
	
	
	//判断各元素是否已选中，未选中进行选中操作
	public static void judgementCheck(SeleniumUtil seleniumUtil,By by) {
		if(seleniumUtil.findElementBy(by).isSelected()==false) {
			logger.info("勾选元素");
			seleniumUtil.click(by);
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
	
}
