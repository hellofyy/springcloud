package com.demo.servicefeign.dao;

import com.demo.servicefeign.util.ScheualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="service-hi/springcloudclient",fallback = ScheualServiceHiHystric.class)
@Service
public interface SchedualServiceHi {

    @RequestMapping(value ="/hello",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
