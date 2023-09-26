package com.example.springboottomcat;

import cn.hutool.http.HttpUtil;

/**
 * @author think
 * @date 2023年09月25日 11:28
 */
public class MainTest {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            new Thread(() -> {
                HttpUtil.get("127.0.0.1:8080/getTest?num=" + finalI);
            }).start();
        }
        //阻塞主线程
        Thread.yield();
    }
}
