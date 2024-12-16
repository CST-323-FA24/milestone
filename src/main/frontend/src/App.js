// Importing necessary modules and components
import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import HomePage from './components/HomePage'; // Home page component
import ProductPage from './components/ProductPage'; // Product page component
import CartPage from './components/CartPage'; // Cart page component
import AdminPage from './components/AdminPage'; // Admin page component
import 'bootstrap/dist/css/bootstrap.min.css'; // Bootstrap for styling
import './custom.css'; // Custom CSS for additional styles

// Main application component
function App() {
  return (
    <Router>
      {/* Define routes for different pages */}
      <Routes>
        <Route path="/" element={<HomePage />} exact /> {/* Home page route */}
        <Route path="/products" element={<ProductPage />} /> {/* Products page route */}
        <Route path="/cart" element={<CartPage />} /> {/* Cart page route */}
        <Route path="/admin" element={<AdminPage />} /> {/* Admin page route */}
      </Routes>
    </Router>
  );
}

export default App; // Export the App component


