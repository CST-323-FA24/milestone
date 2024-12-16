// Importing React library to build the AdminPage component
import React from 'react';
// Importing the NavigationBar component to include a navigation menu at the top
import NavigationBar from './Navbar';

// AdminPage functional component definition
function AdminPage() {
    return (
        <div>
            {/* Adding a navigation bar at the top of the page */}
            <NavigationBar />
            
            {/* Main container for admin dashboard content */}
            <div className="container text-center mt-5">
                {/* Displaying the dashboard title */}
                <h1 className="display-4">Admin Dashboard</h1>
                
                {/* Short description of the dashboard functionalities */}
                <p className="lead">Manage your inventory, orders, and customer information.</p>
                
                {/* Placeholder for admin functionalities, represented by buttons */}
                <div className="btn-group mt-3" role="group" aria-label="Basic example">
                    {/* Button to navigate to product management functionality */}
                    <button type="button" className="btn btn-secondary">Manage Products</button>
                    
                    {/* Button to navigate to orders management */}
                    <button type="button" className="btn btn-secondary">View Orders</button>
                    
                    {/* Button to navigate to report generation */}
                    <button type="button" className="btn btn-secondary">Generate Reports</button>
                </div>
            </div>
        </div>
    );
}

// Exporting AdminPage component for use in other parts of the application
export default AdminPage;

