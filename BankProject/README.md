# Bank Project

This assignement was to create a banking system using concepts learnt in class

This is a basic system with limited functionalities for the purpose of this assignment. Please be advised, passwords are not encrypted and customers detailed are not stored in a secure way.

## Functionalities
How my system works:

Bank.scala has the main class to start the system 
Customers details are store in a mySQL database, when logging in the system checks according the the daatabases records
When customers sign up their details are added to the database

Use of a local mySQL database which doesn't clear the table during each run.

Customers can open various types of bank accounts: *Current, Credit or Savings*
Customers can check if they are eligible for a loan and check interest rates
Customers are also able to provide feedback

#### Current Account  
deposit, withdraw, check balance
#### Credit account:
Set credit limit when you set up account
spend, check credit remaining, check the interest rate, check overdue amount, pay overdue amount
At the end of a term(i.e a month) interest is charged onto the credit spent from account
#### Savings account
deposit, withdraw
At the end of a term(i.e a month) interest is paid onto the money in account


