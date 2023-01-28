package com.ex.exception;

public class UserNotFoundException extends RuntimeException{
	private static final long serialVersionId=-465320L;
	public UserNotFoundException() {
		super();
	}
	public UserNotFoundException(String message) {
		super(message);
	}
}
