import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import logo from './list/menu/logo/repsaclogo.png';
import './First.css';

function Index() {
  const [modalIsOpen, setModalIsOpen] = useState(false);

  const openModal = () => {
    setModalIsOpen(true);
  };

  const closeModal = () => {
    setModalIsOpen(false);
  };

  const handleOverlayClick = (e) => {
    // 모달 내부가 아닌 배경을 클릭했을 때만 모달 닫기
    if (e.target.className === 'modal-overlay') {
      closeModal();
    }
  };

  return (
    <div className="main">
      <div className="side">
        <img src={logo} alt="logo" />
        <button onClick={openModal}>회원</button>
      </div>
      <h2 className='side2'>Repsac Project Manager</h2>

      {modalIsOpen && (
        <div className="modal-overlay" onClick={handleOverlayClick}>
          <div className="modal-content">
            <h3>메뉴</h3>
            <ul>
              <li>
                <Link to="/login" className='item' onClick={closeModal}>Login</Link>
              </li>
              <li>
                <Link to="/newAccount" className='item' onClick={closeModal}>New Account</Link>
              </li>
              <li>
                <Link to="/list" className='item' onClick={closeModal}>List</Link>
              </li>
            </ul>
          </div>
        </div>
      )}
    </div>
  );
}

export default Index;


