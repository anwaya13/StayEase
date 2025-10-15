package com.example.hotelbooking.hotelpackage.exceptions;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
public class ApiRequestExceptionModel {

    private String message;
    private HttpStatus httpStatus;
    private Throwable throwable;

    ApiRequestExceptionModel(String message, HttpStatus httpStatus, Throwable throwable) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.throwable = throwable;
    }
}
