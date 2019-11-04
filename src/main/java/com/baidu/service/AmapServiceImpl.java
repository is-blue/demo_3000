package com.baidu.service;

import com.alibaba.fastjson.JSONObject;
import com.baidu.dao.AmapRepository;
import com.baidu.util.HttpUtil;
import com.baidu.vo.Amap;
import com.baidu.vo.AmapPois;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AmapServiceImpl implements IAmapService{

    @Autowired
    AmapRepository amapRepository;

    @Override
    public void insert(String url) throws Exception{
        //json字符串
       String JsonString = HttpUtil.doGet(url);

       //反序列化得到对象
        Amap amap = JSONObject.parseObject(JsonString, Amap.class);



        //得到索取数据的集合
        List<AmapPois> pois = amap.getPois();
        if(!pois.isEmpty()){
            //循环添加到数据库
            pois.forEach(i-> {

                String tag = i.getTag();
                String[] split = tag.split(",");
                for (String s : split) {
                    //数据库实体类
                    com.baidu.bean.Amap amap1 = new com.baidu.bean.Amap();
                    amap1.setAddress(s);
                    amap1.setType(i.getType());
                    amapRepository.save(amap1);
                }

            });


        }
    }
}

