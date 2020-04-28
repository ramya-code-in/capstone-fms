COGNIZANT OUTREACH FEEDBACK MANAGEMENT SYSTEM

-to manage the feedback from outreach participants

Backend Services/spring 5 reactive

1.authentication - authenticates user by jwt authorisation method.

2.event - manages all the crud operations related to event details and event reports

3.feedback - manages all the crud operations related to feedback

4.datamigration - upload excel data-event/summary

Front end

fms-app - frontend implementation using reactjs

1.Global - contains global header and footer

2.events - displays all events and navigates to eventInfo to view details of a particular event

3.reports - deals with event report/summary

4.dashboard - shows total no of events/volunteers etc which navigates to respective pages.

5.authentication - deals with authenticating the user.

Dbscripts

1.fms_schema - table creations

2.fms_data - data insertions/updations.