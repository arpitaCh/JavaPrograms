package com.thinkconstructive.restdemo.util;

import com.thinkconstructive.restdemo.exception.insufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class paymentUtil {

    private static Map<String,Double> paymentMap= new HashMap<>();

    static{
        paymentMap.put("acc1", 12000.0);
        paymentMap.put("acc2", 16000.0);
        paymentMap.put("acc3", 7000.0);

    }

    public static boolean validateCreditLimit(String accountNum, Double paidamt){

        if(paidamt>  paymentMap.get(accountNum)){
throw new insufficientAmountException("paisa nehi hai");
        }
        else{
            return true;
        }
    }

}
