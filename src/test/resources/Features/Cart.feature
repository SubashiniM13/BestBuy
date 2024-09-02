Feature: Cart Management

Background: Opening the webpage

Given I am on the basepage
When I select country if needed
Then the user close the location popup

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

Scenario: search products and adding to cart

Given I am on the BestBuy home page
When I search for "laptop"
And I add 1 "Laptop" to the cart
Then the cart should contain:
| Product     | Quantity | Price   |
| Laptop      | 1        | 1399.99  |

Scenario: Search for products and add them to the wishlist

Given I am on the BestBuy home page
When I search for "headphones"
And I add 1 "Headphones" to my wishlist/saved items
Then my wishlist should contain:
| Product     | Quantity | Price   |
| Headphones  | 1        | 249.99  |

When I search for "ps5 controller"
And I add "ps5 controller" to my wishlist
Then my wishlist should contain:
| Product         | Quantity | Price   |
| Headphones      | 1        | 249.99  |
| ps5 controller  | 1        | 69.99   |

Scenario: User enters an invalid shipping pincode 

Given the user is on the your Cart page
And the user has added items to the cart
When the user enters "99999" as the shipping pincode
And the user proceeds to update location
Then the system should display an error message indicating that the shipping pincode is invalid

Scenario: Remove products from the cart

Given I am on the BestBuy home page
When i go to cart
And the following items are in my cart:
| product_name         | quantity |
| Samsung Galaxy S21   | 1        |
| Apple AirPods Pro    | 2        |
| Dell XPS 13 Laptop   | 1        |
| Logitech-M240 Mouse  | 1        |
| Acer-Chromebook 315  | 2        |

And I remove 1 "Logitech-M240 Mouse" from my cart
Then my cart should contain:
| product_name         | quantity |
| Samsung Galaxy S21   | 1        |
| Apple AirPods Pro    | 2        |
| Dell XPS 13 Laptop   | 1        |
| Acer-Chromebook 315  | 2        |

When I remove "Acer-Chromebook 315" from my cart
Then my cart should contain:
| product_name         | quantity |
| Samsung Galaxy S21   | 1        |
| Apple AirPods Pro    | 2        |
| Dell XPS 13 Laptop   | 1        |
| Acer-Chromebook 315  | 1        |     

Scenario: Remove products from the wishlist

Given I am on the BestBuy home page
And the following items are in my wishlist:
| Product          | Quantity | Price   |
| Headphones       | 1        | 249.99  |
| ps5 controller   | 1        | 69.99   |
| Sony speaker     | 1        | 39.99   |
| Panasonic Camera | 1        | 479.99  |

When I remove 1 "Headphones" from my wishlist
Then my wishlist should contain:
| Product          | Quantity | Price   |
| ps5 controller   | 1        | 69.99   |
| Sony speaker     | 1        | 39.99   |
| Panasonic Camera | 1        | 479.99  |
