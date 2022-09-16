class Account(private val accountHolder: String, private val accountNumber: Int) {

    var accountBalance: Double = 0.0
        private set

    fun accountInfos() {
        println("Account holder: " + accountHolder)
        println("Account number: " + accountNumber)
        println("Account balance: " + accountBalance)
    }

    fun withdrawal(value: Double): Boolean {
        if (this.accountBalance >= value && value > 0.0) {
            this.accountBalance -= value
            return true
        }
        return false
    }

    fun deposit(value: Double) {
        if (value > 0.0) {
            this.accountBalance += value
        }
    }

    fun transfer(value: Double, account: Account) {
        if (withdrawal(value)) {
            account.deposit(value)
        }
    }
}
