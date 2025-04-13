package com.example.tomatomall.exception;

public class TomatomallException extends RuntimeException {
    public TomatomallException(String message) {
        super(message);
    }

    public static TomatomallException usernameAlreadyExists() {
        return new TomatomallException("用户名已存在");
    }

    public static TomatomallException usernameOrPasswordError() {
        return new TomatomallException("用户名或密码错误");
    }

    public static TomatomallException usernameNotExits() {
        return new TomatomallException("用户名不存在");
    }

    public static TomatomallException notLogin() {
        return new TomatomallException("用户未登录");
    }
}
