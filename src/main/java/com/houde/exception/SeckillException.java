package com.houde.exception;

/**
 * 秒杀相关的所有业务异常
 * Created by qiukun on 2017/5/21.
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
