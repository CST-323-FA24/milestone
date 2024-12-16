// Importing necessary libraries and components
import React, { useEffect, useState } from 'react'; // React for component creation, useEffect for lifecycle methods, and useState for state management
import NavigationBar from './Navbar'; // Navigation bar component for consistent UI
import axios from 'axios'; // Axios library for making HTTP requests

// ProductPage functional component definition
function ProductPage() {
    // State to hold the list of products
    const [products, setProducts] = useState([]);
    // State to manage the loading status
    const [loading, setLoading] = useState(true);
    // State to handle and display errors
    const [error, setError] = useState(null);

    // useEffect hook to fetch product data from the API when the component mounts
    useEffect(() => {
        // Making a GET request to fetch all products
        axios.get('/products/getAll')
            .then(response => {
                // Update the products state with fetched data
                setProducts(response.data);
                // Set loading to false after data is loaded
                setLoading(false);
            })
            .catch(error => {
                // Set error message in case of a failure
                setError(error.message);
                // Set loading to false even if there is an error
                setLoading(false);
            });
    }, []); // Empty dependency array ensures this runs only once on component mount

    return (
        <div>
            {/* Adding the navigation bar at the top */}
            <NavigationBar />
            
            {/* Main container for the product page content */}
            <div className="container text-center mt-5">
                {/* Title for the products page */}
                <h1 className="display-4">Our Products</h1>
                
                {/* Short description for the page */}
                <p className="lead">Discover our exclusive collection.</p>

                {/* Conditional rendering to show loading status */}
                {loading && <p>Loading products...</p>}
                
                {/* Conditional rendering to show error message */}
                {error && <p className="text-danger">Error: {error}</p>}

                {/* Displaying products if data is successfully fetched */}
                {!loading && !error && (
                    <div className="row">
                        {/* Check if there are any products to display */}
                        {products.length > 0 ? (
                            // Map through the products and render each product card
                            products.map(product => (
                                <div className="col-md-4 mb-4" key={product.id}>
                                    <div className="card">
                                        <div className="card-body">
                                            {/* Product name */}
                                            <h5 className="card-title">{product.name}</h5>
                                            
                                            {/* Product description */}
                                            <p className="card-text">{product.description}</p>
                                            
                                            {/* Product price formatted to two decimal places */}
                                            <p className="card-text">${product.price.toFixed(2)}</p>
                                            
                                            {/* Displaying available quantity */}
                                            <p className="card-text">In stock: {product.quantity}</p>
                                        </div>
                                    </div>
                                </div>
                            ))
                        ) : (
                            // Display a message if no products are available
                            <p>No products available.</p>
                        )}
                    </div>
                )}
            </div>
        </div>
    );
}

// Exporting ProductPage component for use in other parts of the application
export default ProductPage;
