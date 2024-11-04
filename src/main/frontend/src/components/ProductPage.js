import React, { useEffect, useState } from 'react';
import NavigationBar from './Navbar';
import axios from 'axios';

function ProductPage() {
    const [products, setProducts] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        // Fetch products from the API
        axios.get('/products/getAll')
            .then(response => {
                setProducts(response.data);
                setLoading(false);
            })
            .catch(error => {
                setError(error.message);
                setLoading(false);
            });
    }, []);

    return (
        <div>
            <NavigationBar />
            <div className="container text-center mt-5">
                <h1 className="display-4">Our Products</h1>
                <p className="lead">Discover our exclusive collection.</p>

                {loading && <p>Loading products...</p>}
                {error && <p className="text-danger">Error: {error}</p>}

                {!loading && !error && (
                    <div className="row">
                        {products.length > 0 ? (
                            products.map(product => (
                                <div className="col-md-4 mb-4" key={product.id}>
                                    <div className="card">
                                        <div className="card-body">
                                            <h5 className="card-title">{product.name}</h5>
                                            <p className="card-text">{product.description}</p>
                                            <p className="card-text">${product.price.toFixed(2)}</p>
                                            <p className="card-text">In stock: {product.quantity}</p>
                                        </div>
                                    </div>
                                </div>
                            ))
                        ) : (
                            <p>No products available.</p>
                        )}
                    </div>
                )}
            </div>
        </div>
    );
}

export default ProductPage;