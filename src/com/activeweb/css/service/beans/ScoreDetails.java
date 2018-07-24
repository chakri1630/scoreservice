package com.activeweb.css.service.beans;

import java.util.List;

public class ScoreDetails {

	private List<String> bankAccountNumbers;
	private List<String> loanAccountNumbers;
	private Integer score;

	public List<String> getBankAccountNumbers() {
		return bankAccountNumbers;
	}

	public void setBankAccountNumbers(List<String> bankAccountNumbers) {
		this.bankAccountNumbers = bankAccountNumbers;
	}

	public List<String> getLoanAccountNumbers() {
		return loanAccountNumbers;
	}

	public void setLoanAccountNumbers(List<String> loanAccountNumbers) {
		this.loanAccountNumbers = loanAccountNumbers;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}
