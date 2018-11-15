package com.inmobi.thriftself.service.configuration;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class Configuration {
    private final String host;
    private final Integer port;
    private final String dbName;
    private final String username;
    private final String password;
}
