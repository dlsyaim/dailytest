/*
 * Copyright (c) 2018, New H3C Technologies Co., Ltd All rights reserved
 * <http://www.h3c.com/>
 * --------------------------------------------------------------------
 * Product      : NERV
 * Module Name  : TestController
 * Date Created : 2020-03-12
 * Creator      : w15021
 * Description  : xxx
 *
 * --------------------------------------------------------------------
 * Modification History
 * DATE             NAME                DESCRIPTION
 * --------------------------------------------------------------------
 * 2020-03-12       w15021     xxx
 * --------------------------------------------------------------------
 */

package com.example.dailytest.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.dailytest.entity.DeviceDetail;
import com.example.dailytest.entity.request.DeviceDataChanged;
import com.example.dailytest.testmain.TestAtValue;
import com.example.dailytest.utils.Constant;
import com.example.dailytest.utils.ConstantProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: com.example.lishuiduijie_test.controller
 * @description: xxx
 * @author: w15021
 * @create: 2020-03-12
 **/

@RestController
public class TestController {
    @Autowired
    ConstantProperties constantProperties;
    @Value("${testValue}")
    private String testValue;

    @PostMapping("/test/post")
    public String testPost(@RequestBody DeviceDetail deviceDetail){

        System.out.println(deviceDetail);
        System.out.println(deviceDetail.toString());
        return "yes";
    }

    @GetMapping("/test/atValue")
    public String atValue(){

        System.out.println(constantProperties.getTestValue());
        System.out.println(constantProperties.getCallbackBaseUrl());
        System.out.println(testValue);
        System.out.println(Constant.CALLBACK_BASE_URL);
        System.out.println(Constant.DEVICE_ADDED_CALLBACK_URL);
        System.out.println(new TestAtValue().testAtValue());
        return "yes";
    }

    @PostMapping("/test/requestToClass")
    public String requestToClass (@RequestBody DeviceDataChanged deviceDataChanged){
        System.out.println("the deviceDataChanged request: "+deviceDataChanged);

        return "hello test";
    }
    @PostMapping("/test/create")
    public JSONObject testCreate (@RequestBody JSONObject jsonObject){

        System.out.println(jsonObject.getString("paramA"));
        System.out.println(jsonObject.getIntValue("paramB"));
        //return "testCreate";
        JSONObject resultObj = new JSONObject();
        //resultObj.put("returnA", "returnA");
        resultObj.put("code", 200);
        JSONObject dataObj = new JSONObject();
        dataObj.put("a","a");
        dataObj.put("b", "b");
        resultObj.put("msg", "SUCCESS");
        resultObj.put("data", dataObj);
        return resultObj;
    }

    @PostMapping("/test/modId")
    public String testModId (String modId, @RequestBody JSONObject jsonObject){
        System.out.println("modId: "+ modId);
        System.out.println(jsonObject.toString());
        return modId;
    }
}