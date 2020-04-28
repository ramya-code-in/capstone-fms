import React, { Component } from "react";
import Header from '../Global/Header';
import Footer from '../Global/Footer';

export default class EventReport extends Component {
    constructor(props) {
        super(props);
        this.state = {
            reportList: [],
            isLoaded: false,
        }
    }

    componentDidMount() {
        fetch('http://localhost:8083/events/summary/all')
            .then(res => res.json())
            .then(json => {
                this.setState({
                    reportList: json,
                    isLoaded: true,
                })
            });
    }

    render() {
        var { reportList, isLoaded } = this.state;
        if (!isLoaded) {
            return <div>...Loading</div>
        }
        else {
            return (<div>
                <Header />
                <div class="container">

                <div class="pt-5">
                    <div class="table-responsive">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th scope="col" class="bg-primary text-white col">EventId</th>
                                    <th scope="col" class="bg-primary text-white col">Event Name</th>
                                    <th scope="col" class="bg-primary text-white col">Month</th>
                                    <th scope="col" class="bg-primary text-white col">Base Location</th>
                                    <th scope="col" class="bg-primary text-white col">Venue Address</th>
                                    <th scope="col" class="bg-primary text-white col">Council Name</th>
                                    <th scope="col" class="bg-primary text-white col">Project</th>
                                    <th scope="col" class="bg-primary text-white col">Category</th>
                                    <th scope="col" class="bg-primary text-white col">No of Volunteers</th>
                                    <th scope="col" class="bg-primary text-white col">Volunteer Hours</th>
                                    <th scope="col" class="bg-primary text-white col">Travel Hours</th>
                                    <th scope="col" class="bg-primary text-white col">Overall Volunteer Hours</th>
                                    <th scope="col" class="bg-primary text-white col">Lives Impacted</th>
                                    <th scope="col" class="bg-primary text-white col">Activity Type</th>
                                    <th scope="col" class="bg-primary text-white col">Status</th>
                                    <th scope="col" class="bg-primary text-white col">Poc Id</th>
                                    <th scope="col" class="bg-primary text-white col">Poc Name</th>
                                    <th scope="col" class="bg-primary text-white col">Poc Contact Number</th>

                                </tr>
                            </thead>
                            <tbody>
                                {reportList.map(item => (<tr key={item.summaryId}>
                                    <td >{item.eventId}</td>
                                    <td >{item.eventName}</td>
                                    <td >{item.month}</td>
                                    <td >{item.baseLocation}</td>
                                    <td >{item.venueAddress}</td>
                                    <td >{item.councilName}</td>
                                    <td >{item.project}</td>
                                    <td >{item.category}</td>
                                    <td >{item.totalNoOfVolunteers}</td>
                                    <td >{item.totalVolunteerHours}</td>
                                    <td >{item.totalTravelHours}</td>
                                    <td >{item.OverallVolunteerHours}</td>

                                    <td >{item.livesImpacted}</td>
                                    <td >{item.activityType}</td>
                                    <td >{item.status}</td>
                                    <td >{item.pocId}</td>
                                    <td >{item.pocName}</td>
                                    <td>{item.pocContactnumber}</td>


                                </tr>))}
                            </tbody>
                        </table>
                    </div>
                </div>
                </div>
                <Footer />
            </div>
            )
        }
    }
}
