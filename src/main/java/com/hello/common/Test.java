package com.hello.common;

import com.hello.model.entity.UserT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class Test {
    public static void main(String[] args) {
//        String num = "1306020000";
//        Integer statncd = (int)num;
//        System.out.println(statncd);

        String yesterday = LocalDate.now().minusDays(1).toString();
        System.out.println(yesterday);
    }

    public static int div(BigDecimal a, int b) {
        BigDecimal res = BigDecimal.ZERO;
        BigDecimal b3 = a;//(mlr/2)*0.3
        BigDecimal b4 = new BigDecimal(b);
        res = b3.divide(b4, 2, BigDecimal.ROUND_HALF_UP);
        return res.intValue();
    }


}
