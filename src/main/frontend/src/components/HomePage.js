// Importing React library to define the HomePage component
import React from 'react';
// Importing the NavigationBar component to include a navigation menu at the top
import NavigationBar from './Navbar';  // Ensure the Navbar file is correctly named and located in the same directory

// HomePage functional component definition
function HomePage() {
    return (
        <div>
            {/* Adding a navigation bar at the top of the page */}
            <NavigationBar />
            
            {/* Main container for the homepage content */}
            <div className="container text-center mt-5">
                {/* Displaying the homepage title */}
                <h1 className="display-4">Welcome to Our Clothing Store</h1>
                
                {/* Short description encouraging users to explore the store */}
                <p className="lead">Explore our wide range of clothing and accessories.</p>
            </div>
        </div>
    );
}

// Exporting HomePage component for use in other parts of the application
export default HomePage;


