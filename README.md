# ATM-Interface
The code is an example of an ATM program implemented in Java. When the program starts, it prompts the user to enter their account number. Once the account number is entered, the user is presented with a menu of options to choose from:

Check Balance: This option displays the user's current balance.

Withdraw: This option allows the user to withdraw money from their account.

Deposit: This option allows the user to deposit money into their account.

Transfer: This option allows the user to transfer money from their account to another account.

Transaction History: This option displays the user's transaction history, which is a list of all the transactions they have made so far.

Quit: This option allows the user to exit the program.

The program uses a balance variable to keep track of the user's account balance, and an ArrayList called transactionHistory to keep track of all the transactions made by the user. Each transaction is added to the transactionHistory list with a description of the transaction, which includes the amount of money involved and the current account balance.

The program uses a switch statement to handle the user's menu selection. Depending on the user's selection, the program calls one of several methods, such as checkBalance(), withdraw(), deposit(), transfer(), or showTransactionHistory(), to perform the desired action.

Overall, the program provides a basic implementation of an ATM system with several useful features, such as transaction history and the ability to transfer money to another account.
