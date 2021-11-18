package com.hello.form;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class TestForm implements Serializable {

    @NotBlank(message = "username 不能为空")
    private String username;

    @NotBlank(message = "mobile 不能为空")
    private String mobile;
}
