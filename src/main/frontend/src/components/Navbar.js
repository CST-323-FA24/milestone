// Importing React library to define the NavigationBar component
import React from 'react';
// Importing Link from react-router-dom to enable navigation between routes
import { Link } from 'react-router-dom';
// Importing Bootstrap components for the navigation bar layout and styling
import { Navbar, Nav, Container } from 'react-bootstrap';

// NavigationBar functional component definition
function NavigationBar() {
    return (
        // Bootstrap Navbar with dark theme and expandable for responsive design
        <Navbar bg="dark" variant="dark" expand="lg">
            <Container>
                {/* Brand name linked to the homepage */}
                <Navbar.Brand as={Link} to="/">Clothing Store</Navbar.Brand>
                
                {/* Toggle button for collapsing the navigation menu on smaller screens */}
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                
                {/* Collapsible section containing navigation links */}
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="me-auto">
                        {/* Navigation link to the Home page */}
                        <Nav.Link as={Link} to="/src/main/frontend/public">Home</Nav.Link>
                        
                        {/* Navigation link to the Products page */}
                        <Nav.Link as={Link} to="/products">Products</Nav.Link>
                        
                        {/* Navigation link to the Cart page */}
                        <Nav.Link as={Link} to="/cart">Cart</Nav.Link>
                        
                        {/* Navigation link to the Admin page */}
                        <Nav.Link as={Link} to="/admin">Admin</Nav.Link>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
    );
}

// Exporting NavigationBar component for use in other parts of the application
export default NavigationBar;


