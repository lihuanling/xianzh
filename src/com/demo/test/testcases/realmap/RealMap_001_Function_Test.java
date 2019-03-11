package com.demo.test.testcases.realmap;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pages.RealMapPage;
import com.demo.test.pageshelper.LoginPageHelper;
import com.demo.test.pageshelper.RealMapPageHelper;

public class RealMap_001_Function_Test extends BaseParpare{
	
	/**
	   * 
	   * 
	   * 标站选择操作
	   * */
	  @Test(dataProvider="testData")
	  public void realMap_BiaoZhanChooseController(Map<String, String> data) {
		  //等待登录页面加载
		  LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		  // 输入登录信息
		  LoginPageHelper.typeLoginInfo(seleniumUtil,data.get("USERNAME"), data.get("PASSWORD"));
		  
		  //等待实时图元素显示出来
		  RealMapPageHelper.waitHomePageLoad(seleniumUtil, timeOut);
		  //判断标站是否可以勾选,可以就进行勾选
		  RealMapPageHelper.judgementCheck(seleniumUtil, RealMapPage.ZH_REALMAP_BIAOZHAN);
	  }
	  
	  
//	  @Test
//	  public void realMap_BiaoZhanStyleChoose() {
//		  seleniumUtil.addCookies(500);
//		  RealMapPageHelper.logger.info("标站类型执行选择操作");
//		  if(RealMapPageHelper.whetherCheck(seleniumUtil, RealMapPage.ZH_REALMAP_BIAOZHANSTYLE)) {
//			  RealMapPageHelper.logger.info("标站类型可以操作，下一步执行点击事件");
//			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_BIAOZHANSTYLE).click();
//			  seleniumUtil.pause(10000);
//		  }else {
//			  RealMapPageHelper.logger.info("标站类型不可以进行操作");
//			  Assert.fail();
//		  }
//		  
//		  
//	  }
	  /**
	   * 
	   * //标站取消选择
	   * 
	   * */
	  
	  @Test
	  public void realMap_BiaoZhanUnChooseController() {
		  seleniumUtil.addCookies(500);
		  
		  if(RealMapPageHelper.DefaultChoose(seleniumUtil, RealMapPage.ZH_REALMAP_BIAOZHAN)) {
			  RealMapPageHelper.logger.info("标站执行取消选择");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_BIAOZHAN).click();
			  seleniumUtil.pause(2000);
		  }else if(seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_BIAOZHAN).isEnabled()){
			  RealMapPageHelper.logger.info("标站当前是没有选中状态，现在开始执行选择操作");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_BIAOZHAN).click();
			  seleniumUtil.pause(2000);
		  }else {
			  RealMapPageHelper.logger.info("标站不可被操作");
			  Assert.fail();
		  }
	  }
	  
	
	  /**
	   * 
	   * 
	   * //设备号选择操作
	   * */
	  
	  @Test
	  public void realMap_machineNumChoose() {
		  seleniumUtil.addCookies(500);
		  RealMapPageHelper.logger.info("设备号执行选择操作");
		  RealMapPageHelper.judgementCheck(seleniumUtil, RealMapPage.ZH_REALMAP_MACHINENUM);
		  RealMapPageHelper.logger.info("设备号复选框选择成功");
	  }
	  
	  /**
	   * 判断显示车辆是不是正常被选中
	   * */
	  @Test
	  public void realMap_ShowCar() {
		  seleniumUtil.addCookies(500);
		  if(RealMapPageHelper.DefaultChoose(seleniumUtil, RealMapPage.ZH_REALMAP_SHOWCAR)) {
			  RealMapPageHelper.logger.info("显示车辆选项正常被选中");
		  }else if(seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWCAR).isEnabled()) {
			  RealMapPageHelper.logger.info("显示车辆选项执行选中操作");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWCAR).click();
		  }else {
			  RealMapPageHelper.logger.info("显示车辆选项不能被操作");
			  Assert.fail();
		  }
	  }
	  
	  /**
	   * 显示车辆执行取消选择操作
	   * */
	  @Test
	  public void realMap_UnShowCar() {
		  seleniumUtil.addCookies(500);
		  if(RealMapPageHelper.DefaultChoose(seleniumUtil, RealMapPage.ZH_REALMAP_SHOWCAR)) {
			  RealMapPageHelper.logger.info("显示车辆选项正常被选中,现在开始执行取消选中操作");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWCAR).click();
			  seleniumUtil.pause(2000);
		  }else if(seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWCAR).isEnabled()) {
			  RealMapPageHelper.logger.info("显示车辆当前是未选中状态，开始执行选择操作");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWCAR).click();
			  seleniumUtil.pause(2000);
		  }else {
			  RealMapPageHelper.logger.info("显示车辆选项不能被操作");
			  Assert.fail();
		  }
	  }
	  /**
	   * 
	   * //设备号取消操作
	   * 
	   * */
	  
	  @Test
	  public void realMap_machineNumUnChoose() {
		  seleniumUtil.addCookies(500);
		  RealMapPageHelper.logger.info("设备号执行取消选择");
		  RealMapPageHelper.UnjudgementCheck(seleniumUtil, RealMapPage.ZH_REALMAP_MACHINENUM);
		  RealMapPageHelper.logger.info("设备号成功取消选择");
	  }
	  /**
	   * 
	   * 
	   * //污染云图选择操作
	   * */
	  
	  @Test
	  public void realMap_PollutionCloudMapChoose() {
		  seleniumUtil.addCookies(500);
		  if(RealMapPageHelper.DefaultChoose(seleniumUtil,RealMapPage.ZH_REALMAP_WURANYUNTU)) {
			  RealMapPageHelper.logger.info("污染云图已被选中");
		  }else if(seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_WURANYUNTU).isEnabled()){
			  RealMapPageHelper.logger.info("污染云图没有被选中，现在开始执行选择操作");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_WURANYUNTU).click();
			  seleniumUtil.pause(2000);
		  }else {
			  RealMapPageHelper.logger.info("污染云图不能正常选择");
			  Assert.fail();
		  }
	  }

	  /**
	   * 
	   * 
	   *    污染云图取消选择操作
	   * */
	  
	  @Test
	  public void realMap_PollutionCloudMapUnChoose() {
		  seleniumUtil.addCookies(500);
		  if(RealMapPageHelper.DefaultChoose(seleniumUtil,RealMapPage.ZH_REALMAP_WURANYUNTU)) {
			  RealMapPageHelper.logger.info("污染云图已被选中，现在开始执行取消选择操作");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_WURANYUNTU).click();
			  seleniumUtil.pause(2000);
			  if(!seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_WURANYUNTU).isSelected()) {
				  RealMapPageHelper.logger.info("污染云图已成功执行取消选择操作");
			  }else {
				  RealMapPageHelper.logger.info("污染云图没有成功执行取消选择");
				  Assert.fail();
			  }
		  }else if(seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_WURANYUNTU).isEnabled()){
			  RealMapPageHelper.logger.info("污染云图没有被选中，现在开始执行选择操作");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_WURANYUNTU).click();
			  seleniumUtil.pause(2000);
		  }else {
			  RealMapPageHelper.logger.info("污染云图不能正常选择");
			  Assert.fail();
		  }
	  }
	  /**
	   * 
	   * 
	   * //标站选中之后，判断标站名称是否默认被选中
	   * */
	  
	  @Test
	  public void realMap_ShowBZNameChoose() {
		  seleniumUtil.addCookies(500);
		  RealMapPageHelper.logger.info("标站选中，那么标站名称显示默认已选中");
		  if(RealMapPageHelper.DefaultChoose(seleniumUtil, RealMapPage.ZH_REALMAP_SHOWBIAOZHANNAME)) {
			  RealMapPageHelper.logger.info("标站名称显示正常");
		  }else {
			  RealMapPageHelper.logger.info("标站名称显示不正常");
			  Assert.fail();
		  }
	  }
	  /**
	   * 
	   * 
	   *  //标站名称显示取消选择操作
	   * */
	 
	  @Test
	  public void realMap_ShowBZNameUnChoose() {
		  seleniumUtil.addCookies(500);
		  if(RealMapPageHelper.DefaultChoose(seleniumUtil, RealMapPage.ZH_REALMAP_SHOWBIAOZHANNAME)) {
			  RealMapPageHelper.logger.info("标站名称显示功能已默认被选中，开始执行取消选择");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWBIAOZHANNAME).click();
			  seleniumUtil.pause(2000);
		  }else if(seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWBIAOZHANNAME).isEnabled()){
			  RealMapPageHelper.logger.info("标站名称显示功能没有被选中，开始执行选择操作");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWBIAOZHANNAME).click();
			  seleniumUtil.pause(2000);
			  if(seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWBIAOZHANNAME).isSelected()) {
				  RealMapPageHelper.logger.info("标站名称显示功能被成功选择,然后开始执行取消选择");
				  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWBIAOZHANNAME).click();
			  }else {
				  RealMapPageHelper.logger.info("标站名称显示功能没有成功选择");
				  Assert.fail();
			  }
		  }else {
			  RealMapPageHelper.logger.info("标站名称显示执行取消选择失败");
			  Assert.fail();
		  }
	  }
	  /**
	   * 
	   * //报警图片执行选中操作
	   * 
	   * */
	  
	  @Test
	  public void realMap_ShowAlarmPicChoose() {
		  seleniumUtil.addCookies(500);
		  if(RealMapPageHelper.DefaultChoose(seleniumUtil, RealMapPage.ZH_REALMAP_SHOWPIC)) {
			  RealMapPageHelper.logger.info("报警图片已被选中执行选择");
			  seleniumUtil.pause(2000);
		  }else if(seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWPIC).isEnabled()){
			  RealMapPageHelper.logger.info("报警图片执行选择操作");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWPIC).click();
			  seleniumUtil.pause(2000);
			  if(seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWPIC).isSelected()) {
				  RealMapPageHelper.logger.info("报警图片已经成功被选择");
			  }else {
				  RealMapPageHelper.logger.info("报警图片没有被选择");
				  Assert.fail();
			  }
		  }else {
			  RealMapPageHelper.logger.info("报警图片执行取消选择失败");
			  Assert.fail();
		  }
	  }
	  
	  /**
	   * 
	   * 报警图片执行取消选择操作
	   * 
	   * */
	  @Test
	  public void realMap_ShowAlarmPicUnChoose() {
		  seleniumUtil.addCookies(500);
		  if(RealMapPageHelper.DefaultChoose(seleniumUtil, RealMapPage.ZH_REALMAP_SHOWPIC)) {
			  RealMapPageHelper.logger.info("报警图片正常被选中，现在开始执行取消选择");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWPIC).click();
			  seleniumUtil.pause(2000);
		  }else if(seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWPIC).isEnabled()){
			  RealMapPageHelper.logger.info("报警图片没有被选中，现在开始执行选择操作");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWPIC).click();
			  seleniumUtil.pause(2000);
			  if(seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWPIC).isSelected()) {
				  RealMapPageHelper.logger.info("报警图片已被选中，执行取消选择");
				  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_SHOWPIC).click();
				  seleniumUtil.pause(2000);
			  }else {
				  RealMapPageHelper.logger.info("报警图片没有被选中，污无法执行取消选择");
				  Assert.fail();
			  }
			  
		  }else {
			  RealMapPageHelper.logger.info("报警图片执行取消选择失败");
			  Assert.fail();
		  }
		  
	  }
	  
	  /**
	   * 
	   * 
	   * 选择颜色标准
	   * */
	  @Test
	  public void RealMap_ColorChange() {
		  seleniumUtil.addCookies(500);
		  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_CHANGE_COLORCHOOSE).click();
		  if(RealMapPageHelper.whetherCheck(seleniumUtil,RealMapPage.ZH_REALMAP_CHANGE_ENHANCECOLOR)){
			  RealMapPageHelper.logger.info("选择增强渐变");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_CHANGE_ENHANCECOLOR).click();
			  RealMapPageHelper.logger.info("已成功将颜色类型改为增强渐变");
		  }else {
			  RealMapPageHelper.logger.info("增强渐变选项不能进行选择");
			  Assert.fail();
		  }
	  }

		  
	  /**
	   * 
	   * 选择数据类型为PM25
	   * 
	   * */
	  @Test
	  public void RealMap_dataStyleChoose25() {
		  seleniumUtil.addCookies(500);
		  if(RealMapPageHelper.whetherCheck(seleniumUtil, RealMapPage.ZH_REALMAP_DATASTYLE)) {
			  RealMapPageHelper.logger.info("点击下拉菜单，进行数据类型切换操作");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_DATASTYLE).click();
			  RealMapPageHelper.logger.info("下拉菜单点击成功，执行下一步选择数据类型为PM2.5");
			  if(RealMapPageHelper.whetherCheck(seleniumUtil, RealMapPage.ZH_REALMAP_DATASTYLE25)) {
				  RealMapPageHelper.logger.info("选择数据类型为PM2.5");
				  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_DATASTYLE25).click();
			  }else {
				  RealMapPageHelper.logger.info("PM2.5不能被选择");
				  Assert.fail();
			  }
			  
		  }else {
			  RealMapPageHelper.logger.info("当前下拉菜单不能进行点击操作");
			  Assert.fail();
		  }
	  }
	  
	  /**
	   * 选择数据类型为PM10
	   * 
	   * 
	   * */
	  @Test
	  public void RealMap_dataStyleChoose10() {
		  seleniumUtil.addCookies(500);
		  if(RealMapPageHelper.whetherCheck(seleniumUtil, RealMapPage.ZH_REALMAP_DATASTYLE)) {
			  RealMapPageHelper.logger.info("点击下拉菜单，进行数据类型切换操作");
			  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_DATASTYLE).click();
			  RealMapPageHelper.logger.info("下拉菜单点击成功，执行下一步选择数据类型为PM10");
			  if(RealMapPageHelper.whetherCheck(seleniumUtil, RealMapPage.ZH_REALMAP_DATASTYLE10)) {
				  RealMapPageHelper.logger.info("选择数据类型为PM10");
				  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_DATASTYLE10).click();
			  }else {
				  RealMapPageHelper.logger.info("PM10不能被选择");
				  Assert.fail();
			  }
		  }else {
			  RealMapPageHelper.logger.info("当前下拉菜单不能进行点击操作");
			  Assert.fail();
		  }
	  }
	  
	  /**
	   * 设备号搜索
	   * */
	  @Test
	  public void RealMap_machineNumSearch() {
		  seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_CHECKMACHINENUM).sendKeys("B605-0019");
		  seleniumUtil.pause(5000);
		  RealMapPageHelper.TableController(seleniumUtil,RealMapPage.ZH_REALMAP_CARTABLETR,RealMapPage.ZH_REALMAP_CARTABLETD);
		  seleniumUtil.pause(5000);
	  }
	  /**
	   * 显示实时图列表第一页
	   * */
	  @Test
	  public void RealMap_CarList() {
		  RealMapPageHelper.TableController(seleniumUtil, RealMapPage.ZH_REALMAP_CARTABLETR, RealMapPage.ZH_REALMAP_CARTABLETD);
		  seleniumUtil.pause(5000);
	  }
	  
	  
	  @Test
	  public void RealMap_TodayOnlineCar() {
		  RealMapPageHelper.logger.info("今日在线数量显示为：" + seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_ONLINENUM).getText());
		  seleniumUtil.pause(5000);
	  }
	  @Test
	  public void RealMap_AllListNum() {
		  RealMapPageHelper.logger.info("总计数量显示为：" + seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_ALLNUM).getText());
		  seleniumUtil.pause(5000);
	  }
	  @Test
	  public void RealMap_avgPM25() {
		  RealMapPageHelper.logger.info("PM25均值显示为：" + seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_AVGPM25).getText());
		  seleniumUtil.pause(5000);
	  }
	  @Test
	  public void RealMap_avgPM10() {
		  RealMapPageHelper.logger.info("PM10均值显示为：" + seleniumUtil.findElementBy(RealMapPage.ZH_REALMAP_AVGPM10).getText());
		  seleniumUtil.pause(5000);
	  }
	  
	
}
