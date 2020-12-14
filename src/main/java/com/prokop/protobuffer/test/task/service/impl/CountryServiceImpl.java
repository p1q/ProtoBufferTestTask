package com.prokop.protobuffer.test.task.service.impl;

import com.prokop.protobuffer.test.task.service.CountryService;
import com.prokop.protobuffer.test.task.util.XmlUtility;

import java.io.File;

public class CountryServiceImpl implements CountryService {
    @Override
    public void generateCountryFile(String filePath) {
        XmlUtility.readXmlFromFile(filePath);

    }

    @Override
    public void findCountryByName(File a, String countryName) {

    }

    @Override
    public void findCountryByPoint(File a, double lat, double lon) {

    }
}
