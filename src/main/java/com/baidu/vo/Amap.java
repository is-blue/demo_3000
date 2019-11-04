package com.baidu.vo;

import lombok.Data;

import java.util.List;

@Data
public class Amap {

    String status;
    String count;
    String info;
    String infocode;
    AmapSuggestion suggestion;
    List<AmapPois> pois;

}
