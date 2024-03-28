package com.zhang.bruce.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zhang.bruce.util.HttpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @description: 高德服务
 * @email: pan.zhang@yeepay.com
 * @date: 2023/6/8 11:35 上午
 */
@Service
public class AutoAmapService {
    private static final Logger logger = LoggerFactory.getLogger(AutoNaviService.class);
    /**
     * 地理编码地址
     */
    @Value("${fs.autonavi.geo.server.url:https://restapi.amap.com/v3/geocode/geo}")
    private String geocodeUrl = "https://restapi.amap.com/v3/geocode/geo";
    /**
     * 逆地理编码地址
     */
    @Value("${fs.autonavi.regeo.server.url:https://restapi.amap.com/v3/geocode/regeo}")
    private String revertGeocodeUrl = "https://restapi.amap.com/v3/geocode/regeo";
    /**
     * 智能硬件定位
     */
    @Value("${fs.autonavi.position.server.url:https://restapi.amap.com/v5/position/IoT}")
    private String baseStation = "http://apilocate.amap.com/position";

    /**
     * 高德应用key
     */
    @Value("${navi.appkey:61f99da1e3e96ff8e0f13714eb2cf99e}")
    private String appKey = "61f99da1e3e96ff8e0f13714eb2cf99e";

    /**
     * 通过地址获取 地理编码
     *
     * @param address
     * @return
     */
    public String getGeocode(String address) {
        // 高德请求接口拼接地址
        StringBuffer str = new StringBuffer();
        str.append("address=").append(address).append("&key=").append(appKey).append("&output=json");
        String location = HttpUtil.sendGet1(geocodeUrl, str.toString());
        //把String对象反序列化为Json对象
        JSONObject result = JSONObject.parseObject(location);
        String status = result.getString("status");
        if ((status.equals("1"))) {
            // 地址信息
            JSONArray info = result.getJSONArray("geocodes");
            JSONObject geocodes = info.getJSONObject(0);
            return geocodes.getString("location");
        }
        return null;
    }
    /**
     * 通过经纬度获取地址
     *
     * @param log 经度
     * @param lat 维度
     * @return
     */
    public String getRevertGeocode(String log,String lat) {
        // 高德请求接口拼接地址
        StringBuffer str = new StringBuffer();
        str.append("location=").append(log).append(",").append(lat).append("&key=").append(appKey).append("&output=json");
        String location = HttpUtil.sendGet1(revertGeocodeUrl, str.toString());
        return location;
    }

    /**
     *  入参为组装好的基站信息
     * @param nearbts
     * @return
     * bsCountryCode + bsNetworkNo + bsLocationCode + bsAreaId + bsSignal + 0
     * accesstype 移动段接入网络方式 0未知，1移动，2wifi
     */
    public String getAddressAndPosition(String nearbts) {
        // 高德请求接口拼接地址
        StringBuffer str = new StringBuffer();
        str.append("accesstype=").append("1").append("&nearbts=").append(nearbts).append("&show_fields=addressComponent")
                .append("&key=").append(appKey).append("&output=json");
        String location = HttpUtil.sendGet1(baseStation, str.toString());
        return location;
    }

    public static void main(String[] args) {
        AutoAmapService autoNaviService = new AutoAmapService();
//        String log = "-73.98751";
//        String lat = "40.74129";
//        System.out.println(autoNaviService.getRevertGeocode(log,lat));
//
//        String address = "北京市朝阳区阜通东大街6号";
//        System.out.println(autoNaviService.getGeocode(address));
        // 460,15,35698,7420000000035,00099,0
        String nearbts = "218,28,72554,44300037460,00000";
        JSONObject object = JSONObject.parseObject(autoNaviService.getAddressAndPosition(nearbts));
        System.out.println(object.toString());
        String status = object.getString("status");
        if ((status.equals("1"))) {
            // 地址信息
//            JSONObject info = object.getJSONObject("addressComponent");
//            String country = info.get("country").toString();
//            System.out.println(country);
        }

    }
}
