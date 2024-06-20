package error.demo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class NotFounException extends RuntimeException {

    private static  final long serialVersion =1L;


    public NotFounException(String msg){
        super(msg);
    }






}
