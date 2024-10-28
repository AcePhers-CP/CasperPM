import React from "react";
import { Link } from 'react-router-dom';
import './login.css';

function Login() {
    const log = () => {
    }

    return (
        <div className="login-box">
            <h2>Login</h2>
            <form>
                <div className="user-box">
                    <input type="text" name="" required />
                    <label>아이디</label>
                </div>
                <div className="user-box">
                    <input type="password" name="" required />
                    <label>PassWord</label>
                </div>
            </form>
            <div className="but">
                    <button type="button" className="login-button" onClick={log}>로그인</button>
            </div>
            <p><Link to="/newAccount" className="new-account-link">new Account</Link></p>
        </div>
    );
}

export default Login;
