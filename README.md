# OOD-Week-5-State-Pattern
### Solution for week 5 assignment using state pattern

The application is developed for a restaurant which is also my main project subject. For the demo purpose, the restaurant can handle only single customer. The state pattern is implemented for the customer. There are several (sequential) states of the customer. There is an interface representing different tasks that can be done for different states and there are classes representing each of the states. Following are the states of the customer.

**States of customer:**

**No state** -> *(welcome)* -> **Arrived state** -> *(request to wait for table)* -> **Waiting for table state** -> *(bring to the table)* -> **At the table state** -> *(show menu)* -> **Placing order state** -> *(take order)* -> **Waiting for food state** -> *(serve food)* -> **Eating food state** -> *(show bill)* -> **Paying bill state** -> *(farewell)* -> **Left state**


**JUnit** is used to prepare a test case which acts as a **Client**.
