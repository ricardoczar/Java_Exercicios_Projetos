package model.entities;

import model.exceptions.InsufficientBalanceException;
import model.exceptions.WithdrawLimitExceededException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}


	public Double getWithdrawLimit() {
		return withdrawLimit;
	}


	public double deposit(Double amount) {
		return balance += amount;
	}

	public double withdraw(Double amount){
		validateWithdraw(amount);
		return balance -= amount;
	}
	
	private void validateWithdraw(double amount) {
		if (amount > getWithdrawLimit()) {
			throw new WithdrawLimitExceededException("Erro de saque: A quantia excede o limite de saque");
		}
		if (amount > getBalance()) {
			throw new InsufficientBalanceException("Erro de saque: Saldo insuficiente ");	
		}
	}

}	
