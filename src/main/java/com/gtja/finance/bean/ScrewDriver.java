package com.gtja.finance.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class ScrewDriver {

    @Autowired
    private Header header;

    //xml中有autowire注入须有set函数
  /*  public void setHeader(Header header) {
        this.header = header;
    }*/


    public void use() {
        System.out.println("use header:" + header.getInfo());
        header.dowork();
    }

}
