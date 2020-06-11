package com.aprt.apartmentApp.exceptionshandler;

import com.aprt.apartmentApp.exception.NoSuchBillException;
import com.aprt.apartmentApp.exception.WrongTypeBillException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NoSuchBillException.class)
    public ResponseEntity<String> noSuchBillException(){
        logger.error("Customer entered wrong ID bill");
        return new ResponseEntity<>("Entered wrong ID bill! Try another.", HttpStatus.EXPECTATION_FAILED);
    }

    @ExceptionHandler(WrongTypeBillException.class)
    public  ResponseEntity<String> wrongTypeBillException(){
        logger.error("Customer entered wrong TYPE bill");
        return new ResponseEntity<>("Entered wrong TYPE bill! Try another", HttpStatus.EXPECTATION_FAILED);
    }
}
