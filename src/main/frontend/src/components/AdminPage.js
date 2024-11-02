import React from 'react';
import NavigationBar from './Navbar';

function AdminPage() {
    return (
        <div>
            <NavigationBar />
            <div className="container text-center mt-5">
                <h1 className="display-4">Admin Dashboard</h1>
                <p className="lead">Manage your inventory, orders, and customer information.</p>
                {/* Placeholder for admin functionalities */}
                <div className="btn-group mt-3" role="group" aria-label="Basic example">
                    <button type="button" className="btn btn-secondary">Manage Products</button>
                    <button type="button" className="btn btn-secondary">View Orders</button>
                    <button type="button" className="btn btn-secondary">Generate Reports</button>
                </div>
            </div>
        </div>
    );
}

export default AdminPage;
