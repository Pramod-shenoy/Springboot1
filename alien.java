package com.telusko.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class alien {
    @Autowired
    Laptop laptop;
    public void code()
    {
        laptop.compile();
    }
}