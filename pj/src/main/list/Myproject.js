import React from 'react';
import { Routes, Route } from 'react-router-dom';
import Sidebar from './menu/Sidebar';
import Header from './menu/Header';
import Todo from './menu/Todo';
import Comments from './menu/Comments';
import Settings from './menu/Settings';
import Calendar from './menu/Calendar';
import DashBoard from './menu/Dashboard';

function Myproject() {
  return (
    <>
      <div className="main-content">
      <Sidebar />
        <div className="pj_content">
          <Header />
          <Routes>
            <Route path="/" element={<DashBoard />} />
            <Route path="Dashboard" element={<DashBoard />} />
            <Route path="todo" element={<Todo />} />
            <Route path="calendar" element={<Calendar />} />
            <Route path="comments" element={<Comments />} />
            <Route path="settings" element={<Settings />} />
          </Routes>
        </div>
      </div>
    </>
  );
}

export default Myproject;
