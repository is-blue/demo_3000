package com.baidu.controller;

import com.baidu.service.IAmapService;
import com.baidu.vo.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Amap")
public class AmapController {

    @Autowired
    private IAmapService iAmapService;

    @GetMapping("/save")
    public CommonResponse save(@RequestParam("keyword") String keyword){
        String url="https://restapi.amap.com/v3/place/around?key=60c964d9f4a5004205e74f16f180ec08&location=116.473168,39.993015&keywords="+keyword+"&types=&radius=1000&offset=20&page=1&extensions=all";
        try {
            iAmapService.insert(url);
            return new CommonResponse(0,"保存成功");
        }catch (Exception e){
            e.printStackTrace();
            return new CommonResponse(1,"保存失败");
        }
    }

}
