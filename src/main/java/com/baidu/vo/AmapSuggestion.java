package com.baidu.vo;

import lombok.Data;

import java.util.List;

@Data
public class AmapSuggestion {

    List<String> keyword;
    List<String> cities;

}
