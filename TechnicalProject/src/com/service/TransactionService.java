package com.service;

import com.exception.AccountNotFoundException;
import com.exception.IncorrectAmountException;
import com.jdbc.TransactionJDBCRepo;
import com.pojo.Account;
import com.pojo.Transaction;
import com.repo.TransactionRepository;

public class TransactionService {
	
	private static TransactionJDBCRepo transactionJDBCRepo = new TransactionJDBCRepo();
	
	public static void deposit(Transaction transaction) {
		if (transaction.getTamount() <= 0)
			throw new IncorrectAmountException("Invalid amount : " + transaction.getTamount());

		transactionJDBCRepo.addTransaction(transaction);
	}
	
	public static void withdraw(Transaction transaction) {
		if (transaction.getTamount() <= 0)
			throw new IncorrectAmountException("Invalid amount : " + transaction.getTamount());

		transactionJDBCRepo.addTransaction(transaction);
	}
	
	public static void transfer(Transaction t1, Transaction t2) {
		TransactionRepository.transfer(t1, t2);
	}
}
