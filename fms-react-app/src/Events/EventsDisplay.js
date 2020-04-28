import React, { Component } from "react";
import Header from '../Global/Header';
import Footer from '../Global/Footer';

export default class EventsDisplay extends Component {
    constructor(props) {
        super(props);
        this.state = {
            eventList: [],
            isLoaded: false,
        }
        //this.buttonHandler = this.buttonHandler.bind(this);
    }
    buttonHandler(id) {
        console.log("button clicked" + id);
        // window.open('./eventbyid');
        this.props.history.push({ pathname: '/eventbyid/' + id })
    }
    componentDidMount() {
        fetch('http://localhost:8083/events/all')
            .then(res => res.json())

            .then(json => {
                this.setState({
                    eventList: json,
                    isLoaded: true,
                })
                //.then(res=>{console.log(res.data)})
            });
        //console.log(this.state.eventList);
    }
    render() {
        var { eventList, isLoaded } = this.state;
        if (!isLoaded) {
            return <div>loading..</div>;
        }
        else {
            return (
                <div className="EventsDisplay">
                    <Header/>
                    <div class="container">

                    <div class="container pt-5">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th scope="col" class="bg-primary text-white col">EventId</th>
                                    <th scope="col" class="bg-primary text-white col">Event Date</th>
                                    <th scope="col" class="bg-primary text-white col">base location</th>
                                    <th scope="col" class="bg-primary text-white col">Council Name</th>
                                    <th scope="col" class="bg-primary text-white col">beneficiary name</th>
                                    <th scope="col" class="bg-primary text-white col">Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                {eventList.map(item => (<tr key={item.eventNo}>
                                    <td >
                                        {item.eventId}
                                    </td>
                                    <td>{item.eventDate}</td>
                                    <td>{item.baseLocation}</td>
                                    <td>{item.councilName}</td>
                                    <td>{item.beneficiaryName}</td>
                                    <td><button onClick={this.buttonHandler.bind(this, item.eventId)}>View</button></td>
                                    {/* <td><Link class="btn btn-primary" to="/eventbyid/${item.eventNo}">View</Link></td> */}
                                </tr>
                                ))};
    </tbody>
                        </table>
                    </div>
                    </div>
                    <Footer/>
                </div>
            );
        }
    }
}