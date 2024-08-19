package com.inn.cafe.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CafeUtils {
    public static ResponseEntity <String> getRequestEntity(String responseMessage, HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"message\":\""+responseMessage+"\"}",httpStatus);


    }
}
