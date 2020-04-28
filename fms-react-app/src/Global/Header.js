import React from 'react';
const Header = () => {
  return (
    <React.Fragment>
      <div>
        <nav className="navbar navbar-expand-lg navbar-light bg-primary text-white">
          <a className="navbar-brand text-white" href="#">Outreach</a>
          <button className="navbar-toggler text-white" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarNavDropdown">
            <ul className="navbar-nav">
              <li className="nav-item active">
                <a className="nav-link  text-white" href="/dashboard">Dashboard <span className="sr-only">(current)</span></a>
              </li>
              <li className="nav-item">
                <a className="nav-link  text-white" href="/allevents">Events</a>
              </li>
              <li className="nav-item">
                <a className="nav-link text-white" href="/report">Reports</a>
              </li>
              <li className="nav-item dropdown">
                <a className="nav-link dropdown-toggle text-white" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  Configuration
        </a>
                <div className="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                  <a className="dropdown-item" href="#">Action</a>
                  <a className="dropdown-item" href="#">Action</a>
                </div>
              </li>
              <li className="nav-item">
                <a className="nav-link text-white" href="/login">Logout</a>
              </li>
            </ul>
          </div>
        </nav>
      </div>
    </React.Fragment>
  )
}

export default Header;