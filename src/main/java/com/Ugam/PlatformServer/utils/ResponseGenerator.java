package com.Ugam.PlatformServer.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ResponseGenerator {

    public ResponseEntity<Object> getSucessResponse(Object data){
        if(null!=data) {
            CustomResponse customResponse = new CustomResponse(HttpStatus.OK.toString(), "Success", data);
            return new ResponseEntity<>(customResponse,HttpStatus.OK);
        }else {

            CustomResponse customResponse = new CustomResponse(HttpStatus.OK.toString(), "Success", "");
            return new ResponseEntity<>(customResponse,HttpStatus.OK);
        }
    }
}
