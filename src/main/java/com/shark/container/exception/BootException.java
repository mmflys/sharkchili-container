package com.shark.container.exception;

/**
 * Boot exception
 * @Author: SuLiang
 * @Date: 2018/11/14
 */
public class BootException extends ContainerException{
	public BootException() {
		super();
	}

	public BootException(String message, Object... args) {
		super(message, args);
	}

	public BootException(String message, Throwable cause, Object... args) {
		super(message, cause, args);
	}

	public BootException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Object... args) {
		super(message, cause, enableSuppression, writableStackTrace, args);
	}
}
