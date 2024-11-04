import React from 'react';
import NavigationBar from './Navbar';

function ProductPage() {
    return (
        <div>
            <NavigationBar />
            <div className="container text-center mt-5">
                <h1 className="display-4">Our Products</h1>
                <p className="lead">Discover our exclusive collection.</p>
            </div>
        </div>
    );
}

export default ProductPage;

