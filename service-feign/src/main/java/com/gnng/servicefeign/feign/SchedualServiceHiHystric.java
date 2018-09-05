package com.gnng.servicefeign.feign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements  SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry , "+name;
    }
}
