package com.demo.servicefeign.util;

import com.demo.servicefeign.dao.SchedualServiceHi;
import org.springframework.stereotype.Component;


@Component
public class  ScheualServiceHiHystric implements SchedualServiceHi {



    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,"+name;
    }


}
