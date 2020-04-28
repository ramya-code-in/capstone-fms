import React, { Component } from 'react';
import logo from './logo.svg';
import {Route, BrowserRouter as Router} from 'react-router-dom';
import './App.css';
import Header from './Global/Header';
import EventsDisplay from './Events/EventsDisplay';
import EventInfo from './Events/EventInfo';
import EventReport  from './report/EventReport';
import Dashboard from './Dashboard/Dashboard';
import Login from './Authentication/Login';
import Footer from './Global/Footer';

class App extends Component {
  render() {
    return (
      <div className="App">
      <Router>
      <div>
      <Route exact path="/" component={Login}></Route>
      <Route path="/login" component={Login}></Route>
      <Route path="/eventbyid/:id" component={EventInfo}/>
      <Route path="/allevents" component={EventsDisplay}/>
      <Route path="/report" component={EventReport}/>
      <Route path="/dashboard" component={Dashboard}/>
      </div>
      </Router>
      </div>
    );
  }
}

export default App;
