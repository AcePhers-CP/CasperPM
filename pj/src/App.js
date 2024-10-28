import React from 'react';
import { Routes, Route, useLocation } from 'react-router-dom';
import CreateA from './main/createA';
import Login from './main/login';
import First from './main/first';
import List from './main/List';

function App() {
  const location = useLocation();
  const hideFirstRoutes = ['/list', '/login', '/newAccount','project'];

  return (
    <div className="App">
      <div className="content">
        {!hideFirstRoutes.some(route => location.pathname.startsWith(route)) && <First />}
        <Routes>
          <Route path="/login" element={<Login />} />
          <Route path="/newAccount" element={<CreateA />} />
          <Route path="/list/*" element={<List />} />
        </Routes>
      </div>
    </div>
  );
}

export default App;

