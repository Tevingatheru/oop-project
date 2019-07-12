# Simple Store Sells System
Programed in java. 
Using IDE: NetBeans.

A store system that allows one to login,register and record sold products. The program is supported by a database called store.
The code is simple and easy to understand and buttons that make it user friendly.

Once you have registers you can login. Once you login you will be directed to the menu window.
From the menuu you can access the reports, add products and record your purchases
While making records of purchases users are shown a list of products and thier cost. Making records of purchases require it's ID, date and quantity. A button can be pressed to calculate the total price.

**run**

Open this project on netbeans for an easy time

**server**

running locally on Xampp

#Code

*classes*

The Code has been models as follows:
- DbConnection
- Items
- LonginF
- Menu
- Register
- ReportsF
- SellF

*DB*

Import the file store.sql.

The database is modeled as follows:
-(entity) items (Item_ID, item, cost)
-(entity) purchases(order_ID, Item_ID, date, quantity)
-(entity) users(user_ID, firstName, lastName, Password, username, dept_ID)
