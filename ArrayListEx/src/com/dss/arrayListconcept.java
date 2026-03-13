package com.dss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class arrayListconcept {

    public  static  void main(String[] Str){

        List<String> lt=new ArrayList<>();
        lt.add("aa");
        lt.add("bb");
        System.out.println("le" +lt);
        List<String> lt4= lt.stream().sorted().collect(Collectors.toList());
        assert(lt.equals(lt4));


    }

    //function to generate an alphanumeric strings



}
