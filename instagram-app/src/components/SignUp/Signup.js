import React, { Component } from 'react';
import './Signup.css'

class Signup extends Component {
    constructor(props) {
        super(props);
        this.state = {};
    }
    render() { 
        return ( 
            <div>
                <input className="loginpage_text" type="text" placeholder="Mobile number email" />
                <input className="loginpage_text" type="text" placeholder="Fullname" />
                <input className="loginpage_text" type="text" placeholder="Username" />
                <input className="loginpage_text" type="password" placeholder="Password"/>
                <button className="loginpage_button">Sign up</button>
            </div>
         );
    }
}
 
export default Signup;