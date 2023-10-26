package com.dansimons.habittracker.model;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Response<T> implements Serializable {

    private static final long serialVersionUID = 4298289194459129063L;
    private Integer code;
    private String message;
    private T data;
    private String traceMessage;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getTraceMessage() {
        return traceMessage;
    }

    public void setTraceMessage(String traceMessage) {
        this.traceMessage = traceMessage;
    }

    public void setSuccess() {
        this.setCode(HttpStatus.OK.value());
        this.setMessage(HttpStatus.OK.getReasonPhrase());
    }

    public void setSuccess(T data) {
        this.setCode(HttpStatus.OK.value());
        this.setData(data);
        this.setMessage(HttpStatus.OK.getReasonPhrase());
    }

    public void setForbiddenError() {
        this.setCode(HttpStatus.FORBIDDEN.value());
        this.setMessage(HttpStatus.FORBIDDEN.getReasonPhrase());
        this.setData(null);
    }

    public void setForbiddenError(String message) {
        this.setCode(HttpStatus.FORBIDDEN.value());
        this.setMessage(message);
        this.setData(null);
    }

    public void setBadRequestError() {
        this.setCode(HttpStatus.BAD_REQUEST.value());
        this.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        this.setData(null);
    }

    public void setBadRequestError(String message) {
        this.setCode(HttpStatus.BAD_REQUEST.value());
        this.setMessage(message);
        this.setData(null);
    }

    public void setUnauthorizedError() {
        this.setCode(HttpStatus.UNAUTHORIZED.value());
        this.setMessage(HttpStatus.UNAUTHORIZED.getReasonPhrase());
        this.setData(null);
    }

    public void setUnauthorizedError(String message) {
        this.setCode(HttpStatus.UNAUTHORIZED.value());
        this.setMessage(message);
        this.setData(null);
    }

    public void setInternalServerError() {
        this.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        this.setMessage(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        this.setData(null);
    }

    public void setInternalServerError(String message, String traceMessage) {
        this.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        this.setMessage(message);
        this.setTraceMessage(traceMessage);
        this.setData(null);
    }

    public void setCustomResponse(T data, Integer code, String message, String traceMessage) {
        this.setData(data);
        this.setCode(code);
        this.setMessage(message);
        this.setTraceMessage(traceMessage);
    }

    public void setCustomErrorResponse(Integer code, String message, String traceMessage) {
        this.setData(null);
        this.setCode(code);
        this.setMessage(message);
        this.setTraceMessage(traceMessage);
    }
}
