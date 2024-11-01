import React from 'react';
import NavigationBar from './Navbar';  // Make sure this imports correctly

function HomePage() {
    return (
        <div>
            <NavigationBar />
            <div className="container text-center mt-5">
                <h1 className="display-4">Welcome to Our Clothing Store</h1>
                <p className="lead">Explore our wide range of clothing and accessories.</p>
            </div>
        </div>
    );
}

export default HomePage;

