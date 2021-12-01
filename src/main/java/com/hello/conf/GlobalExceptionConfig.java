package com.hello.conf;

import com.hello.common.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestControllerAdvice
@ControllerAdvice
public class GlobalExceptionConfig {

//    @ResponseBody
//    @ExceptionHandler({MethodArgumentNotValidException.class})
//    @ResponseStatus(HttpStatus.OK)
//    String methodArgumentNotValidException(MethodArgumentNotValidException e) {
//        return ((ObjectError)e.getBindingResult().getAllErrors().get(0)).getDefaultMessage();
//    }

    @ResponseBody
    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.OK)
    Response exceptionHandler(Exception e) {
        log.info("error={}", e);
        return Response.error("操作过于频繁");
    }

    @ResponseBody
    @ExceptionHandler({HttpMessageNotReadableException.class})
    @ResponseStatus(HttpStatus.OK)
    Response httpMessageNotReadableException(HttpMessageNotReadableException e) {
        log.info("http请求异常:{}", e);
        return Response.error("http请求失败");
    }

    @ResponseBody
    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.OK)
    Response methodArgumentNotValidException(MethodArgumentNotValidException e) {
        log.info("接口参数校验异常: {}", e);
        return Response.error(((ObjectError)e.getBindingResult().getAllErrors().get(0)).getDefaultMessage());
    }
}
