import React from 'react';
import NavigationBar from './Navbar';

function CartPage() {
    return (
        <div>
            <NavigationBar />
            <div className="container text-center mt-5">
                <h1 className="display-4">Shopping Cart</h1>
                <p className="lead">Review and manage the items in your cart before checkout.</p>
                {/* Placeholder for cart items */}
                <div className="card my-3">
                    <div className="card-header">
                        Your Cart Items
                    </div>
                    <ul className="list-group list-group-flush">
                        <li className="list-group-item">Item 1 - Qty: 1 <button className="btn btn-danger btn-sm ml-4">Remove</button></li>
                        <li className="list-group-item">Item 2 - Qty: 2 <button className="btn btn-danger btn-sm ml-4">Remove</button></li>
                        <li className="list-group-item">Item 3 - Qty: 3 <button className="btn btn-danger btn-sm ml-4">Remove</button></li>
                    </ul>
                </div>
                <button className="btn btn-primary">Proceed to Checkout</button>
            </div>
        </div>
    );
}

export default CartPage;
