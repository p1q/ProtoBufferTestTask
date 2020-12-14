package com.prokop.protobuffer.test.task;

import com.prokop.protobuffer.test.task.service.CountryService;
import com.prokop.protobuffer.test.task.service.impl.CountryServiceImpl;

public class Main {
    public static void main(String[] args) {
        CountryService countryService = new CountryServiceImpl();
        countryService.generateCountryFile("src/main/resources/regions.xml");
    }
}
