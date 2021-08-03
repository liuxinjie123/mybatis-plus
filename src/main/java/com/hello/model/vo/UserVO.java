package com.hello.model.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserVO implements Serializable {

    private Integer id;

    @TableField("user_name")
    private String nameId;
}
