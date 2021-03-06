package com.qimalocl.manage.core.common;

/**
 * 请求地址帮助类
 *
 * @author LiDongYao
 *
 * @version v1.0 2016-4-7
 */
public class Urls {

	public static String HTTP = "http://";
	public static String host = HTTP + "app.7mate.cn";

	/**存入设备信息*/
	public static String DevicePostUrl = host + "/index.php?g=App&m=Login&a=verifyDevice_info";
	/**账号密码登录*/
	public static String loginNormal = host + "/index.php?g=App&m=Login&a=loginNormalDdy";
	/**扫码用车*/
	public static String useCar = host + "/index.php?g=App&m=User&a=useCarDdy";
	/**获取启动页图广告*/
	public static String getIndexAd = host + "/index.php?g=App&m=Index&a=getIndexAd";
	/**上报位置*/
	public static String upcarmap = host + "/index.php?g=App&m=User&a=upcarmap";
	/**附近车接口*/
	public static String nearby = host + "/index.php?g=App&m=Index&a=nearby";
	/**历史订单*/
	public static String historys = host + "/index.php?g=App&m=UserManage&a=historys";
	/**扣分接口*/
	public static String delpoints = host + "/index.php?g=App&m=UserManage&a=delpoints";
	/**车辆位置*/
	public static String carsLocation = host + "/index.php?g=App&m=UserManage&a=cars";
	/**提交密钥*/
	public static String changeKey = host + "/index.php?g=App&m=UserManage&a=pdk";
	/**提交密码*/
	public static String changePsd = host + "/index.php?g=App&m=UserManage&a=pwd";
	/**入库*/
	public static String addCar = host + "/index.php?g=App&m=Index&a=addblueCar";
	/**锁定*/
	public static String lock = host + "/index.php?g=App&m=UserManage&a=update_car_status_lock";
	/**解锁*/
	public static String unLock = host + "/index.php?g=App&m=UserManage&a=update_car_status";
	/**结束用车*/
	public static String endCar = host + "/index.php?g=App&m=UserManage&a=normal_back_car";
}
