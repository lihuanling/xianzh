package com.demo.test.testcases.realmap;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pages.RealMapPage;
import com.demo.test.pageshelper.LoginPageHelper;
import com.demo.test.pageshelper.RealMapPageHelper;

public class RealMap_001_ShowBiaoZhanNameChoose_Test extends BaseParpare{
	  @Test(dataProvider="testData")
	  public void realMap_ShowBiaoZhanNameController1(Map<String, String> data) {
		  //等待登录页面加载
		  LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		  // 输入登录信息
		  LoginPageHelper.typeLoginInfo(seleniumUtil,data.get("USERNAME"), data.get("PASSWORD"));
		  
		  //等待实时图元素显示出来
		  RealMapPageHelper.waitHomePageLoad(seleniumUtil, timeOut);
		  
		  //判断标站是否可以勾选,可以就进行勾选
		  RealMapPageHelper.judgementCheck(seleniumUtil, RealMapPage.ZH_REALMAP_BIAOZHAN);
		  //验证显示标站名称是否被勾选
		  if(RealMapPageHelper.judgementChildCheck(seleniumUtil, RealMapPage.ZH_REALMAP_SHOWBIAOZHANNAME)) {
			  RealMapPageHelper.logger.info("显示标站名称已被勾选");
		  }else {
			  RealMapPageHelper.logger.info("显示标站名称没有被勾选");
			  Assert.fail();
		  }
		  
	  }

}
