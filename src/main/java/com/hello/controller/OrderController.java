package com.hello.controller;

import com.hello.form.TestForm;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author xjliu
 * @since 2021-07-05
 */
@RestController
@RequestMapping("/order")
public class OrderController extends BaseController {

    @RequestMapping(value = "/testValidate", method = {RequestMethod.GET, RequestMethod.POST})
    public String testValidate(@Validated TestForm testForm) {
        System.out.println(testForm);
        return testForm.toString();
    }
}
