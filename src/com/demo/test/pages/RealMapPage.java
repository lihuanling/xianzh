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
	//颜色渐变下拉选择
	public static final By ZH_REALMAP_CHANGE_COLORCHOOSE= By.cssSelector(".ant-select-selection-selected-value[title='标准渐变']");
	//标准渐变
	public static final By ZH_REALMAP_CHANGE_STANDARDCOLOR=By.cssSelector("li[data-label='color_standard']");
	//增强渐变
	public static final By ZH_REALMAP_CHANGE_ENHANCECOLOR=By.cssSelector("li[data-label='color_enhance']");
	//标准阶梯
	public static final By ZH_REALMAP_CHANGE_STAIRCOLOR=By.cssSelector("li[data-label='color_stair']");
	
	//标站类型选择（标站选择之后才可以进行操作）
	public static final By ZH_REALMAP_BIAOZHANSTYLE=By.cssSelector("div[data-label='gf_choose']>div>div");
	public static final By ZH_REALMAP_BIAOZHANSTYLELIST=By.cssSelector("li.ant-select-selection__choice");
	//车牌号
	public static final By ZH_REALMAP_DISPLAYCAR = By.cssSelector("span[data-label='label_showCar']>label>span>input");
	
	//数据类型切换
	public static final By ZH_REALMAP_DATASTYLE = By.cssSelector("div[data-label='label_pm']");
	public static final By ZH_REALMAP_DATASTYLE25 = By.cssSelector("li[data-label='label_RealMap_PM₂.₅']");
	public static final By ZH_REALMAP_DATASTYLE10 = By.cssSelector("li[data-label='label_RealMap_PM₁₀']");
	//设备号
	public static final By ZH_REALMAP_MACHINENUM= By.cssSelector("[data-label='label_SN']>label>span>input[type=checkbox]");
	//显示报警图片
	public static final By ZH_REALMAP_SHOWPIC= By.cssSelector("[data-label='label_alarm_pictures']>label>span>input[type=checkbox]");
	
	//输入设备号搜索
	public static final By ZH_REALMAP_CHECKMACHINENUM= By.cssSelector("span[data-label='label_search']>input");
	//在线数量
	public static final By ZH_REALMAP_ONLINENUM= By.cssSelector("[data-label='label_online_quantity']");
	//总计数量
	public static final By ZH_REALMAP_ALLNUM= By.cssSelector("[data-label='permission_RealMap']");
	//PM2.5均值
	public static final By ZH_REALMAP_AVGPM25= By.cssSelector("[data-label='label_average_PM25']");
	//PM10均值
	public static final By ZH_REALMAP_AVGPM10= By.cssSelector("[data-label='label_average_PM10']");
	//在线率
	public static final By ZH_REALMAP_ONLINERATE= By.cssSelector("[data-label='label_online_rate']");

	//实时图列表
	public static final By ZH_REALMAP_CARTABLETR = By.cssSelector("div.ant-table-content>div.ant-table-body>table>tbody>tr");
	public static final By ZH_REALMAP_CARTABLETD = By.cssSelector("div.ant-table-content>div.ant-table-body>table>tbody>tr>td");
	
	

	
	
}
