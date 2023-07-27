package com.byteapimanagement.bytedancejavaapi.service.impl;

import com.byteapimanagement.bytedancejavaapi.service.CommonGenerate;
import org.springframework.stereotype.Service;

@Service
public class CommonGenerateImpl implements CommonGenerate {
    @Override
    public String verificationCodeGenerate() {
        double random = (Math.random()*9+1)*Math.pow(10,6-1);
        Integer Intresult = (int) random;
        String result = Integer.toString(Intresult);
        return result;
    }
}
