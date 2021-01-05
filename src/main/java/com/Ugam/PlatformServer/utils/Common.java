package com.Ugam.PlatformServer.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@Repository
public class Common {

    public Map<?,?> getRequest(HttpServletRequest request){
        Enumeration enumeration=request.getParameterNames();
        Map <String,Object> map=new HashMap<>();
        while (enumeration.hasMoreElements()){
            String parameter=(String)enumeration.nextElement();
            map.put(parameter,request.getParameter(parameter));
        }
        return map;
    }
    public Map<?,?> getRequestBody(HttpServletRequest request) throws IOException {
        Object requestObject=new ObjectMapper().readValue(request.getInputStream(),Object.class);
        Map<String,Object> map= (Map<String, Object>) requestObject;
        return map;
    }

}
