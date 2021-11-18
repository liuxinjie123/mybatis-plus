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
        List<UserT> list = new ArrayList<>();
//        UserT user = new UserT();
//        user.setUsername("jack");
//        list.add(user);
//
//        user = new UserT();
//        user.setUsername("hello");
//        list.add(user);
//
//        user = new UserT();
//        user.setUsername("dream");
//        list.add(user);

//        String userName = list.parallelStream().map(UserT::getUsername).collect(Collectors.joining(","));
//        System.out.println(userName);

//        Integer amount = 7900;
//        BigDecimal platamountrate = BigDecimal.valueOf(1.144);
//        Integer platamount = div(platamountrate.multiply(BigDecimal.valueOf(amount)), 100);;
//        System.out.println("platamount=" + platamount);
//        System.out.println("amount=" + amount);
//        amount = amount - platamount;
//        System.out.println("amount=" + amount);


        BigDecimal amount = BigDecimal.ONE;
        BigDecimal a2 = BigDecimal.ZERO.max(amount);
        System.out.println(a2);
    }

    public static int div(BigDecimal a, int b) {
        BigDecimal res = BigDecimal.ZERO;
        BigDecimal b3 = a;//(mlr/2)*0.3
        BigDecimal b4 = new BigDecimal(b);
        res = b3.divide(b4, 2, BigDecimal.ROUND_HALF_UP);
        return res.intValue();
    }


}
