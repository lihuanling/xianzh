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
public class RealMap_001_ShowBZNameChoose2_Test extends BaseParpare{
	  @Test(dataProvider="testData")
	  public void realMap_ShowBiaoZhanNameController2(Map<String, String> data) {
		  //等待登录页面加载
		  LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		  // 输入登录信息
		  LoginPageHelper.typeLoginInfo(seleniumUtil,data.get("USERNAME"), data.get("PASSWORD"));
		  
		  //等待实时图元素显示出来
		  RealMapPageHelper.waitHomePageLoad(seleniumUtil, timeOut);
		 
		  //验证显示标站名称不能被勾选
		  if(!RealMapPageHelper.whetherCheck(seleniumUtil, RealMapPage.ZH_REALMAP_SHOWBIAOZHANNAME)) {
			  RealMapPageHelper.logger.info("如果标站没有勾选，显示标站名称是不可以点击的,该用例通过");
		  }else {
			  RealMapPageHelper.logger.info("如果标站没有勾选，显示标站名称是不可以点击的，所以该用例失败");
			  Assert.fail();
		  }
		  
	  }

}
