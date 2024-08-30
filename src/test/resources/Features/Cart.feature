Feature: Cart

Background: 

Scenario Outline: Adding different items to the cart

Given I am on the BestBuy home page
When I search for a product named <"product_name">
And I select the product from the search results
And I choose any necessary options if applicable
And I click the "Add to Cart" button
Then The item <"product_name"> should be added to the cart
And The cart should reflect the correct quantity and details of <"product_name">

Examples:
| product_name         | quantity |
| Samsung Galaxy S21   | 1        |
| Apple AirPods Pro    | 2        |
| Dell XPS 13 Laptop   | 1        |

Scenario:



