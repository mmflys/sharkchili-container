package com.shark.container.exception;

import com.shark.util.util.StringUtil;

/**
 * Container exception
 * @Author: Shark Chili
 * @Date: 2018/11/14
 */
abstract class ContainerException extends RuntimeException{
	ContainerException() {
		super();
	}

	ContainerException(String message, Object... args) {
		super(StringUtil.format(message,args));
	}

	ContainerException(String message, Throwable cause, Object... args) {
		super(StringUtil.format(message,args), cause);
	}

	ContainerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Object... args) {
		super(StringUtil.format(message,args), cause, enableSuppression, writableStackTrace);
	}
}
