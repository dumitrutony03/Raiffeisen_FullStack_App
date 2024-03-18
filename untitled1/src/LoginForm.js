import React, { useState } from 'react';
import axios from 'axios';

function LoginForm() {
    const [investor, setInvestor] = useState({
        name: '',
        email: '',
        password: ''
    });

    const handleChange = (e) => {
        const { name, value } = e.target;
        setInvestor(prevState => ({
            ...prevState,
            [name]: value
        }));
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        const apiUrl = 'http://localhost:8080/api/investor/login';
        try {
            const response = await axios.post(apiUrl, investor);
            console.log('Investor LoggedIn', response.data);
            // Reset the form or give user feedback here
        } catch (error) {
            console.error('There was an error with the loggin part!', error);
        }
    };


    return (
        <form onSubmit={handleSubmit}>
            <input
                type="email"
                name="email"
                value={investor.email}
                onChange={handleChange}
                placeholder="Email"
                required
            />
            <input
                type="password"
                name="password"
                value={investor.password}
                onChange={handleChange}
                placeholder="Password"
                required
            />
            <button type="submit">Register Investor</button>
        </form>
    );
}

export default LoginForm;
