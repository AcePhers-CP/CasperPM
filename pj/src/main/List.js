import React, { useState } from "react";
import { Routes, Route, Link } from 'react-router-dom';
import Project from './list/Myproject';
import './Cist.css';
import logo from './list/menu/logo/repsaclogo.png';

function Pjlist() {
    const [projects, setProjects] = useState([]); // 프로젝트 목록 상태
    const [nextProjectId, setNextProjectId] = useState(1); // 다음 프로젝트 ID

    const NewProject = () => {
        // 새로운 프로젝트 객체 생성
        const newProject = { id: nextProjectId, name: `Project ${nextProjectId}` };
        // 기존 프로젝트 목록에 새로운 프로젝트 추가
        setProjects([...projects, newProject]);
        // 다음 프로젝트 ID 증가
        setNextProjectId(nextProjectId + 1);
    };

    return (
        <div className="list">
            <div className="up">
                <img src={logo} alt="logo" />
                <button onClick={NewProject}>New Project</button>
            </div>
            <div className="scroll-container">
                {projects.map((project) => (
                    <div
                        className="item_l"
                        key={project.id}
                    >
                        <Link to="project" className="item_p">{project.name}</Link>
                        <button>수정</button>
                        <button>삭제</button>
                    </div>
                ))}
            </div>
        </div>
    );
}

function App() {
    return (
        <Routes>
            <Route path="/" element={<Pjlist />} />
            <Route path="project/*" element={<Project />} />
        </Routes>
    );
}

export default App;








