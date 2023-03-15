Feature:Place Order
User will Add item cart, Delete an item from cart and Place an order

Scenario: Add items to cart 
Given: Login into App
When: Add an item to cart
Then: Items must be added to cart

Scenario: Delete an Item
Given: Login into App
When: List of Items should be available in cart
Then: Delete an item from Cart

Scenario: Place Order 
Given: Login into App
When: Item should be available in Cart
Then: Place Order 
Purchase Items