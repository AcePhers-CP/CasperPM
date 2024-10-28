import React from 'react';
import logo from './logo/repsaclogo.png';
import { Link } from 'react-router-dom';



function Sidebar(){
    return (
        <div className='sidebar'>
            <Link to="Dashboard"><img src={logo} alt="logo" /></Link>
            <div className='sidebar'>
                <Link to="Dashboard" className="menu-item">DashBoard</Link>
                <Link to="Todo" className="menu-item">Todo</Link>
                <Link to="Comments" className="menu-item">Chat</Link>
                <Link to="Calendar" className="menu-item">Calendar</Link>
                <Link to="Settings" className="menu-item">Settings</Link>
            </div>
        </div>
    );
}

export default Sidebar;