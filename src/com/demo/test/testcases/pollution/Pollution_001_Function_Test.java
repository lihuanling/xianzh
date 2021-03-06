package com.demo.test.testcases.pollution;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pages.PollutionCloudMap;
import com.demo.test.pageshelper.LoginPageHelper;
import com.demo.test.pageshelper.PollutionPageHelper;

public class Pollution_001_Function_Test extends BaseParpare {
	
	/**
	   * 
	   * 
	   * 标站选择操作
	   * */
	  @Test(dataProvider="testData")
	  public void pollution_BiaoZhanChooseController(Map<String, String> data) {
		  //等待登录页面加载
		  LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		  // 输入登录信息
		  LoginPageHelper.typeLoginInfo(seleniumUtil,data.get("USERNAME"), data.get("PASSWORD"));
		  //等待污染云图加载
		  PollutionPageHelper.waitHomePageLoad(seleniumUtil, timeOut);
		  //执行标站勾选操作，首选判断该复选框没有被勾选之后再进行操作
		  if(PollutionPageHelper.ifCheckBoxChoose(seleniumUtil,PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_BIAOZHAN)) {
			  //对标站复选框进行选择操作
			  PollutionPageHelper.logger.info("等待成功加载，然后勾选标站复选框");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_BIAOZHAN).click();
			  seleniumUtil.pause(2000);
			  PollutionPageHelper.logger.info("成功勾选标站复选框");
		  }else {
			  PollutionPageHelper.logger.info("标站复选框选择不正常");
			  Assert.fail();
		  }
	  }
	  @Test
	  public void pollution_Show_pollution_point() {
		  if(PollutionPageHelper.DefaultChoose(seleniumUtil, PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWPOLLUTIONPOINT)) {
			  PollutionPageHelper.logger.info("污染点已默认被选中");
		  }else if(seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWPOLLUTIONPOINT).isEnabled()) {
			  PollutionPageHelper.logger.info("对污染点进行选择操作");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWPOLLUTIONPOINT).click();
			  seleniumUtil.pause(2000);
		  }else {
			  PollutionPageHelper.logger.info("污染点选项不能执行操作");
			  Assert.fail();
		  }
	  }
	  
	  @Test
	  public void pollution_Show_pollution_pointUnchoose() {
		  if(PollutionPageHelper.DefaultChoose(seleniumUtil, PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWPOLLUTIONPOINT)) {
			  PollutionPageHelper.logger.info("污染点已默认被选中,执行取消选择操作");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWPOLLUTIONPOINT).click();
			  seleniumUtil.pause(2000);
		  }else if(seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWPOLLUTIONPOINT).isEnabled()) {
			  PollutionPageHelper.logger.info("对污染点进行选择操作");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWPOLLUTIONPOINT).click();
			  seleniumUtil.pause(2000);
		  }else {
			  PollutionPageHelper.logger.info("污染点选项不能执行操作");
			  Assert.fail();
		  }
	  }
	  
	  @Test
	  public void pollution_Refresh() {
		  seleniumUtil.addCookies(500);
		  PollutionPageHelper.logger.info("执行刷新操作，验证当前功能点是否正常使用");
		  if(seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_UPDATE).isEnabled()) {
			  PollutionPageHelper.logger.info("点击刷新按钮");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_UPDATE).click();
			  seleniumUtil.pause(2000);
		  }else {
			  PollutionPageHelper.logger.info("当前刷新按钮不能正常使用");
			  Assert.fail();
		  }
		  
	  }
	  
	  
	  
	  @Test 
	  public void pollution_clean_ranking() {
		  seleniumUtil.addCookies(500);
		  if(seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_CLEARRANKING).isSelected()) {
			  PollutionPageHelper.logger.info("该操作框已选中");
			  Assert.fail();
		  }else {
			  PollutionPageHelper.logger.info("对清洁排名执行选中操作");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_CLEARRANKING).click();
			  seleniumUtil.pause(2000);
		  }
	  }
	  @Test 
	  public void pollution_pollution_ranking() {
		  seleniumUtil.addCookies(500);
		  if(PollutionPageHelper.DefaultChoose(seleniumUtil, PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_POLLUTIONRANKING)) {
			  PollutionPageHelper.logger.info("污染排名选项已默认被选中");
			  
		  }else if(seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_POLLUTIONRANKING).isEnabled()){
			  PollutionPageHelper.logger.info("对污染排名执行选中操作");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_POLLUTIONRANKING).click();
			  seleniumUtil.pause(2000);
		  }else {
			  PollutionPageHelper.logger.info("污染排名选项不能执行操作");
			  Assert.fail();
		  }
	  }
	  
	  
	  
	  
	  
	  /**
	   * 污染云图复选框操作，默认已选中，判断已选中即为成功
	   * **/
	  @Test 
	  public void pollution_PollutionCloudMap() {
		  seleniumUtil.addCookies(500);
		  if(PollutionPageHelper.DefaultChoose(seleniumUtil,PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_WURANYUNTU)) {
			  PollutionPageHelper.logger.info("污染云图选项已被选中");
		  }else if(seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_WURANYUNTU).isEnabled()){
			  PollutionPageHelper.logger.info("对污染云图选项进行点击操作");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_WURANYUNTU).click();
			  seleniumUtil.pause(2000);
			  if(seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_WURANYUNTU).isSelected()) {
				  PollutionPageHelper.logger.info("污染云图成功被选中");
			  }else {
				  PollutionPageHelper.logger.info("污染云图不能正常操作");
				  Assert.fail();
			  }
		  }else {
			  
		  }
	  }
	  
	  
	  
	  
	  /**
	   * 
	   * 标站显示名称操作，标站成功选择，则该选项默认选中，直接判断是否选中即可
	   * */
	  
	  @Test
	  public void pollution_ShowBiaoZhanName() {
		  seleniumUtil.addCookies(500);
		  
		  if(PollutionPageHelper.DefaultChoose(seleniumUtil,PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWBIAOZHANNAME)) {
			  PollutionPageHelper.logger.info("标站勾选成功，那么标站名称也会默认显示");
		  }else if(seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWBIAOZHANNAME).isEnabled()){
			  PollutionPageHelper.logger.info("标站没有被勾选，执行勾选操作");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWBIAOZHANNAME).click();
			  seleniumUtil.pause(2000);
		  }else {
			  PollutionPageHelper.logger.info("标站没有被勾选，无法执行勾选操作");
			  Assert.fail();
		  }
		  
	  }
	  /**
	   * 
	   * 标站显示名称执行取消操作，需要先判断该选项是否被选择，且是否可以正常操作
	   * */
	  @Test
	  public void pollution_ShowBiaoZhanNameUnChoose() {
		  seleniumUtil.addCookies(500);
		  if(PollutionPageHelper.DefaultChoose(seleniumUtil,PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWBIAOZHANNAME)) {
			  PollutionPageHelper.logger.info("标站名称已选中，可以进行取消操作");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWBIAOZHANNAME).click();
			  seleniumUtil.pause(2000);
			  if(seleniumUtil.isSelected(seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWBIAOZHANNAME)) == false) {
				  PollutionPageHelper.logger.info("标站名称成功取消操作");
			  }else {
				  PollutionPageHelper.logger.info("标站名称由于其他原因，没有成功取消操作");
				  Assert.fail();
			  }
		  }else {
			  PollutionPageHelper.logger.info("标站名称由于其他原因，没有被勾选");
			  Assert.fail();
		  }
		  
	  }
	  
	  
	  /**
	   * 标站取消选择
	   * */
	  @Test
	  public void pollution_BiaoZhanUnChoose() {
		  seleniumUtil.addCookies(500);
		  if(PollutionPageHelper.DefaultChoose(seleniumUtil,PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_BIAOZHAN)) {
			  //对标站复选框进行取消选择操作
			  PollutionPageHelper.logger.info("等待成功加载，然后执行取消勾选标站复选框");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_BIAOZHAN).click();
			  seleniumUtil.pause(2000);
			  if(!seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_BIAOZHAN).isSelected()) {
				  PollutionPageHelper.logger.info("成功取消勾选标站复选框");
			  }else {
				  PollutionPageHelper.logger.info("没有成功取消勾选标站复选框");
				  Assert.fail();
			  }
			  
		  }else if(seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_BIAOZHAN).isEnabled()) {
			  PollutionPageHelper.logger.info("标站没有被勾选，现在开始执行勾选操作");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_BIAOZHAN).click();
			  seleniumUtil.pause(2000);
		  }else{
			  PollutionPageHelper.logger.info("标站复选框取消不正常");
			  Assert.fail();
		  }
	  }
	  /**
	   * 显示报警图片，该选项默认选中
	   * */
	  @Test
	  public void pollution_ShowAlarmPic() {
		  seleniumUtil.addCookies(500);
		  if(PollutionPageHelper.DefaultChoose(seleniumUtil,PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWALARMPIC)) {
			  PollutionPageHelper.logger.info("报警图片显示正常");
		  }else if(seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWALARMPIC).isEnabled()) {
			  PollutionPageHelper.logger.info("报警图片没有被选中，现在开始执行选择操作");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWALARMPIC).click();
			  seleniumUtil.pause(2000);
			  if(seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWALARMPIC).isSelected()) {
				  PollutionPageHelper.logger.info("报警图片被成功选中");
			  }else {
				  PollutionPageHelper.logger.info("报警图片没有被成功选中");
			  }
		  }else {
			  PollutionPageHelper.logger.info("报警图片没有被选中，也无法成功执行操作");
			  Assert.fail();
		  }
	  }
	  
	  /**
	   * 取消报警图片显示操作
	   * */
	  @Test
	  public void pollution_UnShowAlarmPic() {
		  seleniumUtil.addCookies(500);
		  if(seleniumUtil.isSelected(seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWALARMPIC))) {
			  PollutionPageHelper.logger.info("执行取消报警图片显示操作");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWALARMPIC).click();
			  seleniumUtil.pause(2000);
			  if(!seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SHOWALARMPIC).isSelected()) {
				  PollutionPageHelper.logger.info("取消报警图片显示操作正常");
			  }else {
				  PollutionPageHelper.logger.info("执行取消报警图片显示操作失败");
				  Assert.fail();
			  }
		  }else {
			  PollutionPageHelper.logger.info("执行取消报警图片显示操作失败，可能由于该元素没有选中");
			  Assert.fail();
		  }
	  }
	 
	  @Test
	  public void pollution_ChooseArea() {
		  seleniumUtil.addCookies(500);
		  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SELECTAREA).click();
		  PollutionPageHelper.el(seleniumUtil, 2, PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_SELECCHILDTAREA).click();
		  seleniumUtil.pause(2000);
	  }
	  /**
	   * 污染云图默认选中，现在执行取消操作，判断已选中，执行点击事件
	   * */
	  @Test
	  public void pollution_PollutionCloudMapUnChoose() {
		  seleniumUtil.addCookies(500);
		  if(seleniumUtil.isSelected(seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_WURANYUNTU))) {
			  PollutionPageHelper.logger.info("污染云图已正常选中，执行取消操作");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_WURANYUNTU).click();
			  PollutionPageHelper.logger.info("污染云图执行取消操作成功");
		  }else {
			  PollutionPageHelper.logger.info("污染云图没有被选中，不能执行取消操作");
			  Assert.fail();
		  }
	  }
	  
	  
	  /**
	   * 颜色类型选择，先直接执行选择，后期优化逻辑选择
	   * **/
	  @Test
	  public void pollution_ColorChange() {
		  seleniumUtil.addCookies(500);
		  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_CHANGE_COLORCHOOSE).click();
		  seleniumUtil.pause(1000);
		  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_ENHANCECOLOR).click();
		  seleniumUtil.pause(1000);
	  }
	  
	  /**
	   * 
	   * 选择数据类型为PM25
	   * 
	   * */
	  @Test
	  public void Pollution_dataStyleChoose25() {
		  seleniumUtil.addCookies(500);
		  if(PollutionPageHelper.whetherCheck(seleniumUtil, PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_DATASTYLE)) {
			  PollutionPageHelper.logger.info("点击下拉菜单，进行数据类型切换操作");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_DATASTYLE).click();
			  seleniumUtil.pause(1000);
			  PollutionPageHelper.logger.info("下拉菜单点击成功，执行下一步选择数据类型为PM2.5");
			  if(PollutionPageHelper.whetherCheck(seleniumUtil, PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_DATASTYLE25)) {
				  PollutionPageHelper.logger.info("选择数据类型为PM2.5");
				  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_DATASTYLE25).click();
				  seleniumUtil.pause(1000);
			  }else {
				  PollutionPageHelper.logger.info("PM2.5不能被选择");
				  Assert.fail();
			  }
			  
		  }else {
			  PollutionPageHelper.logger.info("当前下拉菜单不能进行点击操作");
			  Assert.fail();
		  }
	  }
	  
	  /**
	   * 选择数据类型为PM10
	   * 
	   * 
	   * */
	  @Test
	  public void Pollution_dataStyleChoose10() {
		  seleniumUtil.addCookies(500);
		  if(PollutionPageHelper.whetherCheck(seleniumUtil, PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_DATASTYLE)) {
			  PollutionPageHelper.logger.info("点击下拉菜单，进行数据类型切换操作");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_DATASTYLE).click();
			  seleniumUtil.pause(2000);
			  PollutionPageHelper.logger.info("下拉菜单点击成功，执行下一步选择数据类型为PM10");
			  if(PollutionPageHelper.whetherCheck(seleniumUtil, PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_DATASTYLE10)) {
				  PollutionPageHelper.logger.info("选择数据类型为PM10");
				  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_DATASTYLE10).click();
				  seleniumUtil.pause(2000);
			  }else {
				  PollutionPageHelper.logger.info("PM10不能被选择");
				  Assert.fail();
			  }
		  }else {
			  PollutionPageHelper.logger.info("当前下拉菜单不能进行点击操作");
			  Assert.fail();
		  }
	  }
	  
	  @Test
	  public void Pollution_pointFilter() {
		  seleniumUtil.addCookies(500);
		  if(seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_POINTFILTER).isEnabled()) {
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_POINTFILTER).clear();
			  PollutionPageHelper.logger.info("向点数过滤输入框中输入一个数字");
			  seleniumUtil.findElementBy(PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_POINTFILTER).sendKeys("3");
			  seleniumUtil.pause(10000);
		  }else {
			  PollutionPageHelper.logger.info("点数过滤输入框不能正常输入");
			  Assert.fail();
		  }
	  }

	  /**
	   * 
	   * 选择不同的页签进行点击操作
	   * */
	  @Test
	  public void Pollution_tabChoose() {
		  if(PollutionPageHelper.whetherCheck(seleniumUtil, PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_POLLUTIONPOINT)) {
			  PollutionPageHelper.logger.info("该页签可以正常点击，执行选择页签操作");
			  WebElement t = PollutionPageHelper.el(seleniumUtil, 1,PollutionCloudMap.ZH_POLLUTIONCLOUDMAP_POLLUTIONPOINT);
			  if(t.isEnabled()) {
				  PollutionPageHelper.logger.info("执行点击操作");
				  t.click();
			  }else {
				  Assert.fail();
			  }
			  seleniumUtil.pause(1000);
		  }else {
			  PollutionPageHelper.logger.info("该页签不能正常点击");
			  Assert.fail();
		  }
	  }
}
