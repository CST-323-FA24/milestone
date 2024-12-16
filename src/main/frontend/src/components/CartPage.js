// Importing React library to create the CartPage component
import React from 'react';
// Importing the NavigationBar component to include a navigation menu at the top
import NavigationBar from './Navbar';

// CartPage functional component definition
function CartPage() {
    return (
        <div>
            {/* Adding a navigation bar at the top of the page */}
            <NavigationBar />
            
            {/* Main container for the cart page content */}
            <div className="container text-center mt-5">
                {/* Displaying the shopping cart title */}
                <h1 className="display-4">Shopping Cart</h1>
                
                {/* Short description of the cart functionality */}
                <p className="lead">Review and manage the items in your cart before checkout.</p>
                
                {/* Card element to contain the list of cart items */}
                <div className="card my-3">
                    {/* Card header for labeling the cart items section */}
                    <div className="card-header">
                        Your Cart Items
                    </div>
                    
                    {/* List of cart items */}
                    <ul className="list-group list-group-flush">
                        {/* Example of a cart item with quantity and remove button */}
                        <li className="list-group-item">
                            Item 1 - Qty: 1 
                            <button className="btn btn-danger btn-sm ml-4">Remove</button>
                        </li>
                        <li className="list-group-item">
                            Item 2 - Qty: 2 
                            <button className="btn btn-danger btn-sm ml-4">Remove</button>
                        </li>
                        <li className="list-group-item">
                            Item 3 - Qty: 3 
                            <button className="btn btn-danger btn-sm ml-4">Remove</button>
                        </li>
                    </ul>
                </div>
                
                {/* Button to proceed to the checkout process */}
                <button className="btn btn-primary">Proceed to Checkout</button>
            </div>
        </div>
    );
}

// Exporting CartPage component for use in other parts of the application
export default CartPage;

