import React from "react";
import { Link } from 'react-router-dom';
import './login.css';

function CreateA(){
    const newA = () => {
    }

    return(
        <div className="login-box">
            <h2>new Account</h2>
            <form>
                <div className="user-box">
                    <input type="text" name="" required />
                    <label>이름</label>
                </div>
                <div className="user-box">
                    <input type="text" name="" required />
                    <label>아이디</label>
                </div>
                <div className="user-box">
                    <input type="email" name="" required />
                    <label>이메일</label>
                </div>
                <div className="user-box">
                    <input type="password" name="" required />
                    <label>PassWord</label>
                </div>
            </form>
            <div className="but">
                <button type="button" className="login-button" onClick={newA}>계정 생성</button>
            </div>
            <p><Link to="/login" className="new-account-link">login</Link></p>
        </div>
    );
}

export default CreateA;