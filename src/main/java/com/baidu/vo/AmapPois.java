package com.baidu.vo;

import lombok.Data;

import java.util.List;

@Data
public class AmapPois {

    String id;
    List<String> parent;
    List<String> childtype;
    String tag;
    String name;
    String type;
    String typecode;
    String biz_type;
    String address;
    String location;
    String tel;
    List<String> postcode;
    List<String> website;
    List<String> email;
    String pcode;
    String pname;
    String citycode;
    String cityname;
    String adcode;
    String adname;
    List<String> importance;
    List<String> shopid;
    String shopinfo;
    List<String> poiweight;
    String gridcode;
    String distance;
    List<String> navi_poiid;
    List<String> entr_location;
    List<String> exit_location;
    String match;
    String recommend;
    String timestamp;
    List<String> alias;
    String indoor_map;
    AmapIndoorData indoor_data;
    String groupbuy_num;
    String business_area;
    String discount_num;
    AmapBizExt biz_ext;
    List<String> event;
    List<AmapPhotos> photos;
    List<String> children;



}
