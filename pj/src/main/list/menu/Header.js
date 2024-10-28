import React from "react";
import logo from './logo/profile.svg';

function Header(){
    return(
        <div className="header">
            <h2>Dashboard</h2>
            <div className="header2"><img src={logo} alt="logo"/></div>
        </div>
    );
}

export default Header;