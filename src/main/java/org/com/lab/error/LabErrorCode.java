package org.com.lab.error;

import org.example.javaframework.web.common.InterfaceErrorCode;
import org.springframework.http.HttpStatus;

public enum LabErrorCode implements InterfaceErrorCode {
    NOT_FOUND_USER_INFO(HttpStatus.NOT_FOUND);

    private final HttpStatus httpStatus;

    LabErrorCode(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String getCode() {
        return name();
    }

    @Override
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
