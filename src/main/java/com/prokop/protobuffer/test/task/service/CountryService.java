package com.prokop.protobuffer.test.task.service;

import java.io.File;

public interface CountryService {
    void generateCountryFile(String filePath);

    void findCountryByName(File a, String countryName);

    void findCountryByPoint(File a, double lat, double lon);
}
