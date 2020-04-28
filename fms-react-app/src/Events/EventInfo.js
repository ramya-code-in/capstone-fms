import React, { Component } from "react";
import Header from '../Global/Header';
import Footer from '../Global/Footer';

export default class EventInfo extends Component {
  constructor(props) {
    super(props);
    this.state = {
      eventList: [],
      unRegistered: [],
      notParticipated: [],
      participated: [],
      isLoaded: false,
      averageRating: null,
      feedbackCount: null
    }
  }
  componentDidMount() {
    console.log(this.props);
    let id = this.props.match.params.id;
    console.log(id);
    fetch('http://localhost:8083/events/report/' + id)
      .then(res => res.json())

      .then(json => {
        this.setState({
          eventList: json
        })
        //.then(res=>{console.log(res.data)})
      });
    fetch('http://localhost:8089/feedback/unreg/' + id)
      .then(res => res.json())
      .then(obj => {
        this.setState({
          unRegistered: obj
        })
      });
    fetch('http://localhost:8089/feedback/notpart/' + id)
      .then(res => res.json())
      .then(obj => {
        this.setState({
          notParticipated: obj
        })
      });
    fetch('http://localhost:8089/feedback/part/' + id)
      .then(res => res.json())
      .then(obj => {
        this.setState({
          participated: obj,
          isLoaded: true,
        })
      });
    fetch('http://localhost:8089/feedback/data/' + id)
      .then(res => res.json())
      .then(json => {
        this.setState({
          averageRating: json[0],
          feedbackCount: json[1]
        })
      });
  }



  render() {
    var { eventList, isLoaded, unRegistered, notParticipated, participated, averageRating, feedbackCount } = this.state;
    return (<div>
      <Header/>
      <div class="container">
      <div class="row pt-3">
        <div class="col-sm-6">
          <div class="card">
            <div class="card-header bg-primary text-white">
              <div class="row"><div class="col-sm-6">              <span class="text-left">ID:{eventList.eventId}</span>
              </div>
                <div class="col-sm-6">              <span class="text-right">Date:{eventList.eventDate}s</span>
                </div></div>
            </div>
            <div class="card-body">
              <h5 class="card-title">{eventList.eventName}</h5>
              <p class="card-text">{eventList.eventDescription}</p>
            </div>
            <div class="card-header bg-light text-dark">
              <div class="row"><div class="col-sm-6">
                Status:<span class="text-left badge badge-success">{eventList.status}</span>
              </div>
                <div class="col-sm-6">
                  <span class="text-right">Category:{eventList.category}</span>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-6">
          <div class="card">
            <div class="card-header bg-primary text-white">
              <div class="row"><div class="col-sm-6"><span class="text-left">Location:{eventList.baseLocation}</span></div>
                <div class="col-sm-6"><span class="text-right">Council:{eventList.councilName}</span>s</div></div>
            </div>
            <div class="card-body">
              <h5 class="card-title">{eventList.beneficiaryName}</h5>
              <p class="card-text">{eventList.venueAddress}</p>
            </div>
            <div class="card-header bg-light text-dark">
              <div class="row">
                <div class="col-sm-6">Feedback:<span class="text-left badge badge-warning">{feedbackCount}</span></div>

                <div class="col-sm-6">Average Rating<span class="text-right badge badge-success">{averageRating}</span></div>
              </div>
            </div>

          </div>
        </div>
      </div>
      <div class="row pt-3">
        <div class="col-sm-4">
          <div class="card">
            <div class="card-header bg-primary text-white">PARTICIPATED</div>
            <div class="card-body">
              {this.state.participated.map(read => (<p class="card-text" key={read.ansId}>
                <tr class="text-left">Feedback:{read.feedbackAns}</tr>
                <tr class="text-left">Rating:{read.rating}</tr>
                {/* <tr class="border-bottom-1 border-secondary"></tr> */}
              </p>))}
            </div>
          </div>
        </div>
        <div class="col-sm-4">
          <div class="card">
            <div class="card-header bg-primary text-white">NOT PARTICIPATED</div>
            <div class="card-body">
              {this.state.notParticipated.map(read => (<p class="card-text" key={read.ansId}>
                <tr class="text-left">Reason:{read.feedbackAns}</tr>
              </p>))}
            </div>
          </div>
        </div>
        <div class="col-sm-4">
          <div class="card">
            <div class="card-header bg-primary text-white">UNREGISTERED</div>
            <div class="card-body">
              {this.state.unRegistered.map(read => (<p class="card-text" key={read.ansId}>
                <tr class="text-left">Reason:{read.feedbackAns}</tr>
              </p>))}
            </div>
          </div>
        </div>
      </div>
      <div class="row pt-3">
        <div class="col-sm-6">
          <div class="card">
            <div class="card-header bg-primary text-white">STATISTICS</div>
            <div class="card-body table-responsive">
              <table class="card-table table">
                <thead>
                  <tr>
                    <th scope="col">AVERAGE RATING</th>
                    <th scope="col">VOLUNTEERS</th>
                    <th scope="col">VOLUNTEER HOURS</th>
                    <th scope="col">OVERALL HOURS</th>
                    <th scope="col">TRAVEL HOURS</th>
                    <th scope="col">LIVES IMPACTED</th>
                  </tr>
                </thead>
                <tbody>
                  <tr key={eventList.eventId}>

                    <td >{averageRating}</td>
                    <td>{eventList.totalNoOfVolunteers}</td>
                    <td>{eventList.totalVolunteerHours}</td>
                    <td>{eventList.OverallVolunteerHours}</td>
                    <td>{eventList.totalTravelHours}</td>
                    <td>{eventList.livesImpacted}</td>
                  </tr>

                </tbody>
              </table>
            </div>
          </div>
        </div>
        <div class="col-sm-6">
          <div class="card">
            <div class="card-header bg-primary text-white">POC DETAILS</div>

            <div class="card-body">
              <table class="table">
                <thead>
                  <th>POC NAME</th>
                  <th>POC EMPLOYEE ID</th>
                  <th>POC CONTACT</th>
                </thead>
                <tbody>

                  <tr key={eventList.eventId}>
                    <td>{eventList.pocName}</td>
                    <td>{eventList.pocId}</td>
                    <td>{eventList.pocContactnumber}</td>
                  </tr>

                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
      </div>
      <Footer/>
    </div>)
  }
}

