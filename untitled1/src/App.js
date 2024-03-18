import React from 'react';
import RegisterForm from './RegisterForm';
import LoginForm from './LoginForm';


function App() {
    return (
        <div className="App">
            <h1>Register New Investor</h1>
            <RegisterForm />
        </div>
    );

    const onRegister = (name, email, password) => {
        // Similar to the login, implement the registration logic here.
        console.log('Register with:', name, email, password);
    };

    const onLogin = (email, password) => {
        // Implement the login logic here. For example, use fetch or axios to send a POST request to your Spring Boot backend.
        console.log('Login with:', email, password);
    };

    return (
        <div>
            <RegisterForm onRegister={onRegister} />
            <LoginForm onLogin={onLogin} />
        </div>
    );
}

export default App;
