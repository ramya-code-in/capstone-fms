import React, { Component } from 'react';
import Header from '../Global/Header';
import Footer from '../Global/Footer';

export default class Dashboard extends Component {

    constructor(props) {
        super(props);
        this.state = {
            events: [],
            livesImpacted: [],
            volunteers: [],
            participants: [],
            isLoaded: false,
        }
    }
    componentDidMount() {
        console.log(this.props.location.role);
        fetch('http://localhost:8083/events/dashboard')
            .then(res => res.json())
            .then(res => {
                this.setState({
                    events: res[0],
                    livesImpacted: res[1],
                    volunteers: res[2],
                    participants: res[2],
                    isLoaded: true,
                })
            });
    }

    render() {
        var { events, livesImpacted, volunteers, participants, isLoaded } = this.state;
        return (<div>
            <Header />
            <div class="container">
                <div class="row pt-4">
                    <div class="col-sm-3">
                        <div class="card text-white bg-success">
                            <div class="card-body">
                                <h6 class="card-title text-left">TOTAL EVENTS</h6>
                                <h5 class="card-text text-left">{this.state.events}</h5>
                                <a href="/allevents" class="text-white text-right">View details</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-3">
                        <div class="card text-white bg-info">
                            <div class="card-body">
                                <h6 class="card-title text-left">LIVES IMPACTED</h6>
                                <h5 class="card-text text-left">{this.state.livesImpacted}</h5>
                                <a href="/report" class="text-white text-right">View Details</a>>
      </div>
                        </div>
                    </div>
                    <div class="col-sm-3">
                        <div class="card text-white bg-warning">
                            <div class="card-body">
                                <h6 class="card-title text-left">TOTAL VOLUNTEERS</h6>
                                <h5 class="card-text text-left">{this.state.volunteers}</h5>
                                <a href="/report" class="text-white text-right">View Details</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-3">
                        <div class="card text-white bg-danger">
                            <div class="card-body">
                                <h6 class="card-title text-left">TOTAL PARTICIPANTS</h6>
                                <h5 class="card-text text-left">{this.state.participants}</h5>
                                <a href="/report" class="text-white text-right">View Details</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <Footer />
        </div>)
    }
}