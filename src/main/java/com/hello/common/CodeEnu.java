package com.hello.common;

public enum CodeEnu {
    SUCCESS("0", "成功"),
    ERROR("1", "ERROR"),


    ;
    public String code;
    public String desc;
    CodeEnu() {}

    CodeEnu(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
