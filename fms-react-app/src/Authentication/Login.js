import React, { Component } from 'react';

export default class Login extends Component {
    constructor(props) {
        super(props);
        this.state = {
            email: null,
            password: null,
            role: "",
            logged: false,
            error: false
        }
    }
    login() {
        console.log(this.state.email);
        console.log(this.state.password);
        var credentials = btoa(this.state.email + ':' + this.state.password);
        var basicAuth = 'Basic ' + credentials;

        fetch('http://localhost:8082/login/login', { headers: { 'Authorization': basicAuth } }

        ).then(res => {
            if (res.ok) {
                return res.json()
            }
            else {
                throw new Error("Authentication Failed")
            }
        })
            //.then(res=>res.json())
            .then(res => {
                this.setState({
                    role: res.role,
                    logged: true,
                })
                this.props.history.push({ pathname: '/dashboard', role: res.role })
            })
            .catch(error => {
                console.log(error);
                this.setState({
                    error: true
                })
            })
    }
    render() {
        var { role } = this.state;
        if (this.state.error) {
            return (<div>
                <nav className="navbar navbar-expand-lg navbar-light bg-primary text-white">
                    <a className="navbar-brand text-white" href="#">Outreach</a>

                </nav>
                <div class="pt-5 text-danger">Authentication Error!Please try again<a href="/login">Login</a></div>
            </div>)
        }
        else {
            return (
                <div>
                    <nav className="navbar navbar-expand-lg navbar-light bg-primary text-white">
                        <a className="navbar-brand text-white" href="#">Outreach</a>

                    </nav>
                    <div class="row pt-5">
                        <div class="col-sm-4"></div>
                        <div class="col-sm-4">
                            <div class="card">
                                <h5 class="card-header">Cognizant Outreach</h5>
                                <div class="card-body">

                                    <input class="m-3" type="text" placeholder="Email Address" onChange={(event) => { this.setState({ email: event.target.value }) }} />

                                    <input class="m-3" type="password" placeholder="Password" onChange={(event) => { this.setState({ password: event.target.value }) }} />
                                    <br></br><button class="btn btn-success m-3" onClick={() => { this.login() }}>Sign me in</button>

                                </div>
                            </div>
                        </div>
                        <div class="col-sm-4"></div>
                    </div>
                </div>)
        }
    }
}