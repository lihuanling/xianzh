package com.demo.test.pages;

import org.openqa.selenium.By;
/**
 * @author Young
 * @description 登录页面元素定位声明
 * */
public class LoginPage {
	/**用户名输入框 .el-form-item>div>div>input[type='text']*/
	public static final By ZH_INPUT_USERNAME = By.cssSelector(".el-form-item>div>div>input[type='text']");//By.xpath(".//*[@id='components-layout-demo-top-side-2']/div/div/div[2]/div/div/form/div[1]/div/div/input");
	
	/**密码输入框*/
	public static final By ZH_INPUT_PASSWORD = By.cssSelector(".el-form-item>div>div>input[type='password']");
	
	/**登录按钮*/
	public static final By ZH_BUTTON_LOGIN = By.xpath(".//*[@id='components-layout-demo-top-side-2']/div/div/div[2]/div/div/form/button");
	
	/**登录错误信息*/
	public static final By ZH_TEXT_ERROR= By.xpath("html/body/div[2]");

	
	
}
