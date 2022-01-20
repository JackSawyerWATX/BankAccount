class TestBankAccount {
    public static void main(String[] args) {
		BankAccount Account1 = new BankAccount();
        System.out.println("New Acc No. 00000001");
		Account1.depositMoney(100, "checking");
		Account1.depositMoney(25, "savings");
		Account1.displayAccountBalance();

		System.out.println(BankAccount.totalAccounts);

		Account1.withdrawMoney(250, "checking");
		Account1.withdrawMoney(125, "savings");
		Account1.displayAccountBalance();

		System.out.println(BankAccount.totalAccounts);

        BankAccount Account2 = new BankAccount();
        System.out.println("New Acc No. 00000002");
		Account2.depositMoney(300, "checking");
		Account2.depositMoney(100, "savings");
		Account2.displayAccountBalance();
        Account2.withdrawMoney(50, "checking");
	}
}