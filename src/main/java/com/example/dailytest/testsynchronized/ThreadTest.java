/*
 * Copyright (c) 2018, New H3C Technologies Co., Ltd All rights reserved
 * <http://www.h3c.com/>
 * --------------------------------------------------------------------
 * Product      : NERV
 * Module Name  : ThreadTest
 * Date Created : 2020-05-09
 * Creator      : w15021
 * Description  : xxx
 *
 * --------------------------------------------------------------------
 * Modification History
 * DATE             NAME                DESCRIPTION
 * --------------------------------------------------------------------
 * 2020-05-09       w15021     xxx
 * --------------------------------------------------------------------
 */

package com.example.dailytest.testsynchronized;

/**
 * @program: com.example.dailytest.testsynchronized
 * @description: xxx
 * @author: w15021
 * @create: 2020-05-09
 **/
public class ThreadTest extends Thread{

    private Test test;

    public ThreadTest(String name,Test test) {
        super(name);
        this.test = test;
    }

    @Override
    public void run() {
        test.method();
    }

}