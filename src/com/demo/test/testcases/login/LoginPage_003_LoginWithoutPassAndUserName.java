package com.demo.test.testcases.login;
import java.util.Map;

import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.LoginPageHelper;
/**
 * 
 * @description 登录的时候不输入密码，用户名，点击操作
 * */

public class LoginPage_003_LoginWithoutPassAndUserName extends BaseParpare{
  @Test(dataProvider="testData")
  public void loginWithoutPassword(Map<String, String> data) {
	  //等待登录页面加载
	  LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
	  // 输入登录信息
	  LoginPageHelper.typeLoginInfo(seleniumUtil,data.get("USERNAME"), data.get("PASSWORD"));
	  //验证登录失败信息
	  LoginPageHelper.checkLoginErrorInfo(seleniumUtil,data.get("ERROR"));

  }
}
