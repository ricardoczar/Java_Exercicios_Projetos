package model.exceptions;

public class WithdrawLimitExceededException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public WithdrawLimitExceededException(String msg) {
		super(msg);
	}
}
