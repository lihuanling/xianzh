package com.demo.test.pages;

import org.openqa.selenium.By;

public class PollutionCloudMap {
	
	//污染云图
	public static final By ZH_POLLUTIONCLOUDMAP = By.cssSelector("[data-label='permission_TileMap']");
	/**污染云图中其他功能点*/
	//标站
	public static final By ZH_POLLUTIONCLOUDMAP_BIAOZHAN = By.cssSelector(".label_standard>span>input");
	//显示标站名称
	public static final By ZH_POLLUTIONCLOUDMAP_SHOWBIAOZHANNAME = By.cssSelector(".label_display_standard_name>span>input");
	//显示报警图片
	public static final By ZH_POLLUTIONCLOUDMAP_SHOWALARMPIC = By.cssSelector("span[data-label='label_alarm_pictures']>label>span>input");
	//污染云图
	public static final By ZH_POLLUTIONCLOUDMAP_WURANYUNTU = By.cssSelector("label.label_pollution_cloud_image>span>input");
	
	//颜色渐变下拉选择
	public static final By ZH_POLLUTIONCLOUDMAP_CHANGE_COLORCHOOSE= By.cssSelector(".ant-select-selection-selected-value[title='标准渐变']");
	//标准渐变
	public static final By ZH_POLLUTIONCLOUDMAP_COLORCHANGE = By.cssSelector("li[data-label='color_standard']");
	//增强渐变
	public static final By ZH_POLLUTIONCLOUDMAP_ENHANCECOLOR=By.cssSelector("li[data-label='color_enhance']");
	//标准阶梯
	public static final By ZH_POLLUTIONCLOUDMAP_STAIRCOLOR=By.cssSelector("li[data-label='color_stair']");
	
	
	
	//时间框时间选择
	public static final By ZH_POLLUTIONCLOUDMAP_TIMECHOOSE = By.cssSelector("span.ant-calendar-picker>div>input");
	//点数过滤
	public static final By ZH_POLLUTIONCLOUDMAP_POINTFILTER = By.cssSelector("div[role='spinbutton']>input");
	//数据类型选择
	public static final By ZH_POLLUTIONCLOUDMAP_DATASTYLE = By.cssSelector("div[data-label='label_TileMap_PMchoose']");
	public static final By ZH_POLLUTIONCLOUDMAP_DATASTYLE25 = By.cssSelector("li[data-label='label_TileMapPM₂.₅']");
	public static final By ZH_POLLUTIONCLOUDMAP_DATASTYLE10 = By.cssSelector("li[data-label='label_TileMapPM₁₀']");
	//时间类型
	public static final By ZH_POLLUTIONCLOUDMAP_TIMESTYLE = By.cssSelector("label.label_pollution_cloud_image>span>input");
	//列表中页签（污染点、区县排名、街镇排名、标站对比）
	public static final By ZH_POLLUTIONCLOUDMAP_POLLUTIONPOINT = By.cssSelector("div[role='tab']");
	
	//选择地区
	public static final By ZH_POLLUTIONCLOUDMAP_SELECTAREA = By.cssSelector("div[title='西安']");
	public static final By ZH_POLLUTIONCLOUDMAP_SELECCHILDTAREA = By.cssSelector(".ant-select-dropdown-menu.ant-select-dropdown-menu-vertical.ant-select-dropdown-menu-root>li");
	
	
	//清洁排名
	public static final By ZH_POLLUTIONCLOUDMAP_CLEARRANKING = By.cssSelector("label.label_pollution_cloud_image>span>input");
	//污染排名
	public static final By ZH_POLLUTIONCLOUDMAP_POLLUTIONRANKING = By.cssSelector("label.label_pollution_cloud_image>span>input");
	//显示污染点
	public static final By ZH_POLLUTIONCLOUDMAP_SHOWPOLLUTIONPOINT = By.cssSelector("label.label_pollution_cloud_image>span>input");
	//刷新
	public static final By ZH_POLLUTIONCLOUDMAP_UPDATE = By.cssSelector("label.label_pollution_cloud_image>span>input");
	//导出
	public static final By ZH_POLLUTIONCLOUDMAP_EXPORT = By.cssSelector("label.label_pollution_cloud_image>span>input");


}
