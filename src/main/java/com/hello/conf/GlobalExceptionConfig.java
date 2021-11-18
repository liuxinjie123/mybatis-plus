package com.hello.conf;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
@ControllerAdvice
public class GlobalExceptionConfig {

    @ResponseBody
    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.OK)
    String methodArgumentNotValidException(MethodArgumentNotValidException e) {
        return ((ObjectError)e.getBindingResult().getAllErrors().get(0)).getDefaultMessage();
    }

}
