/*
 * Copyright (c) 2018, New H3C Technologies Co., Ltd All rights reserved
 * <http://www.h3c.com/>
 * --------------------------------------------------------------------
 * Product      : NERV
 * Module Name  : DeviceInfoForRequest
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

package com.example.dailytest.entity.request;

import lombok.Data;

/**
 * @program: com.h3c.iot.iotinfomgr.lishuiduijie.entity.request
 * @description: xxx
 * @author: w15021
 * @create: 2020-03-12
 **/
@Data
public class DeviceInfoForRequest {
    private String nodeId;
    private String name;
    private String description;
    private String manufacturerId;
    private String manufacturerName;
    private String mac;
    private String location;
    private String deviceType;
    private String model;
    private String swVersion;
    private String fwVersion;
    private String hwVersion;
    private String protocolType;
    private String bridgeId;
    private String status;
    private String statusDetail;
    private String mute;
    private String supportedSecurity;
    private String isSecurity;
    private String signalStrength;
    private String sigVersion;
    private String serialNumber;
    private String batteryLevel;
}