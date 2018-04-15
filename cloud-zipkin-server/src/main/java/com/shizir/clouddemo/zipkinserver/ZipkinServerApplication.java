package com.shizir.clouddemo.zipkinserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class ZipkinServerApplication {
        public static void main(String[] args) {
            new SpringApplicationBuilder(ZipkinServerApplication.class).web(true).run(args);
        }
}
