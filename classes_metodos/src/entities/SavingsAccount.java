package entities;

public final class SavingsAccount extends Account { // O "FINAL" n�o deixa criar uma nova classe tendo Extends de SavingAccount

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}

	@Override
	public final void withdraw(double amount) { // N�o permite criar um metodo para outra classe "FINAL"
		balance -= amount;
	}
}
