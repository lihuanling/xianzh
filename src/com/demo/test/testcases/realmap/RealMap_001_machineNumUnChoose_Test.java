package com.demo.test.testcases.realmap;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pages.RealMapPage;
import com.demo.test.pageshelper.LoginPageHelper;
import com.demo.test.pageshelper.RealMapPageHelper;
/**
 * 当前类验证标站没有勾选的状态下，显示标站名称不能被选择的测试
 * */
public class RealMap_001_machineNumUnChoose_Test extends BaseParpare{
	  @Test(dataProvider="testData")
	  public void realMap_machineNumUnChoose(Map<String, String> data) {
		  //等待登录页面加载
		  LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		  // 输入登录信息
		  LoginPageHelper.typeLoginInfo(seleniumUtil,data.get("USERNAME"), data.get("PASSWORD"));
		  
		  //等待实时图元素显示出来
		  RealMapPageHelper.waitHomePageLoad(seleniumUtil, timeOut);
		 
		  //验证设备号勾选
		  RealMapPageHelper.judgementCheck(seleniumUtil, RealMapPage.ZH_REALMAP_MACHINENUM);
		  RealMapPageHelper.UnjudgementCheck(seleniumUtil, RealMapPage.ZH_REALMAP_MACHINENUM);
	  }
}
