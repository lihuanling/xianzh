package com.demo.test.pageshelper;

import org.apache.log4j.Logger;

import com.demo.test.pages.LoginPage;
import com.demo.test.utils.SeleniumUtil;

/**
 * 
 * @description 登录页面帮助类：提供在这个页面上做的操作的方法封装
 * */
public class LoginPageHelper {
		//提供本类中日志输出对象
		public static Logger logger = Logger.getLogger(LoginPageHelper.class);
		
		/**
		 * 
		 * @description 等待登录页面元素加载
		 * @param seleniumUtil selenium api封装引用对象
		 * @param timeOut 等待元素超时的时间
		 * */
		public static void waitLoginPageLoad(SeleniumUtil seleniumUtil,int timeOut){
			seleniumUtil.pause(1000);
			logger.info("开始检查登录页面元素");
			seleniumUtil.waitForElementToLoad(timeOut, LoginPage.ZH_INPUT_USERNAME);
			seleniumUtil.waitForElementToLoad(timeOut, LoginPage.ZH_INPUT_PASSWORD);
			seleniumUtil.waitForElementToLoad(timeOut, LoginPage.ZH_BUTTON_LOGIN);
			logger.info("检查登录页面元素完毕");
		}
		
		
		
		/**
		 * @description 登录操作封装
		 * @param seleniumUtil selenium api封装引用对象
		 * @param username 用户名值
		 * @param password 用户密码值 
		 * */
		public static void typeLoginInfo(SeleniumUtil seleniumUtil,String username,String password){
		
			logger.info("开始输入登录信息");
			//清空用户名输入框
			seleniumUtil.click(LoginPage.ZH_INPUT_USERNAME);
			System.out.println(LoginPage.ZH_INPUT_USERNAME);
			seleniumUtil.clear(LoginPage.ZH_INPUT_USERNAME);
			//输入用户名到用户名输入框
			seleniumUtil.type(LoginPage.ZH_INPUT_USERNAME,username);
			//清空密码输入框
			seleniumUtil.clear(LoginPage.ZH_INPUT_PASSWORD);
			//输入密码到密码输入框
			seleniumUtil.type(LoginPage.ZH_INPUT_PASSWORD, password);
			logger.info("输入登录信息完毕");
			//点击登录按钮
			seleniumUtil.click(LoginPage.ZH_BUTTON_LOGIN);
			seleniumUtil.pause(2000);

			
		}
		
		/**
		 * @description 验证登录错误信息
		 * @param seleniumUtil selenium api封装引用对象
		 * @param error 错误文本
		 * */
		public static void checkLoginErrorInfo(SeleniumUtil seleniumUtil,String error){
			seleniumUtil.isTextCorrect(seleniumUtil.getText(LoginPage.ZH_TEXT_ERROR), error);
		}


}
