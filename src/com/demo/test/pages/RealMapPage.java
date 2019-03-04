package com.demo.test.pages;

import org.openqa.selenium.By;

/**
 * 
 * @description 实时图页面元素定位声明
 * */
public class RealMapPage {
	
	/**实时图*/
	public static final By ZH_TEXT_REALMAP= By.cssSelector("[data-label='permission_RealMap']");
	
	/**实时图模块中其他功能点*/
	//标站
	public static final By ZH_REALMAP_BIAOZHAN= By.cssSelector(".label_standard>span>input[type=checkbox]");
	//显示标站名称
	public static final By ZH_REALMAP_SHOWBIAOZHANNAME= By.cssSelector(".label_display_standard_name>span>input[type=checkbox]");
	//污染云图
	public static final By ZH_REALMAP_WURANYUNTU= By.cssSelector(".label_pollution_cloud_image>span>input[type=checkbox]");
	//标准/增强
	public static final By ZH_REALMAP_CHANGECOLOR= By.cssSelector("[data-label='label_standard_color']");
	//设备号
	public static final By ZH_REALMAP_MACHINENUM= By.cssSelector("[data-label='label_SN']>label>span>input[type=checkbox]");
	//显示报警图片
	public static final By ZH_REALMAP_SHOWPIC= By.cssSelector("[data-label='label_alarm_pictures']>label>span>input[type=checkbox]");
	//PM类型选择
	public static final By ZH_REALMAP_PMCHOOSE= By.cssSelector("[data-label='label_pm']");
	//输入设备号搜索
	public static final By ZH_REALMAP_CHECKMACHINENUM= By.cssSelector("[data-label='label_search']");
	//在线数量
	public static final By ZH_REALMAP_ONLINENUM= By.cssSelector("[data-label='label_online_quantity']");
	//总计数量
	//public static final By ZH_REALMAP_ALLNUM= By.cssSelector("[data-label='permission_RealMap']");
	//PM2.5均值
	public static final By ZH_REALMAP_AVGPM25= By.cssSelector("[data-label='label_average_PM25']");
	//PM10均值
	public static final By ZH_REALMAP_AVGPM10= By.cssSelector("[data-label='label_average_PM10']");
	//在线率
	public static final By ZH_REALMAP_ONLINERATE= By.cssSelector("[data-label='label_online_rate']");


	
	
}
