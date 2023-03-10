package StaticDemo;
/*
 * Let's Rock event management company organizes various kinds of events. They are needed to keep track of every time a hall is booked for any event to avoid booking conflicts and need to collect the details into the system. Arun, a Final year undergraduate student is involved in many social welfare activities. The hall manager asked Arun for help in collecting event details like eventName, hallName, startDate and endDate, and noOfPeople. Help the authorities to collect the details and to display them using programming. Use the concept of static and non-static member functions to display the event details as shown in sample input/output.

Strictly adhere to the Object-Oriented specifications given in the problem statement. All class names, member variable names, and function names should be the same as specified in the problem statement.

Create a class named Event with the following data member variables.

Data type	Member Name
string	eventName
string	hallName
string	startDate
string	endDate
int	noOfPeople
 

Include appropriate getters and setters.

Include the following member function in the Event class

Member Function	Description
display()	This method is used to display the details of the event.
 

Include the following member function in the Main class

Member Function	Description
static void displayDetails(Event e)	This method is used to display the event object details
 

Create a driver class called Main. In the main method, obtain input from the user in the console and call the static and non-static member functions to display the details.

Refer to sample input and output for formatting specifications. 

Strictly adhere to the Object-Oriented specifications given in the problem statement. All class names, member variable names, and function names should be the same as specified in the problem statement.

[All text in bold corresponds to input and rest corresponds to output]
Sample Input and Output 1:

Enter the event name
Kiran
Enter the hall name
Raj Mohan Hall
Enter the start date(dd/MM/yyyy)
06/01/2021
Enter the end date(dd/MM/yyyy)
07/01/2021
Enter the no of people
500
Inside Static Method
Event Name: Kiran
Hall Name: Raj Mohan Hall
Start Date: 06/01/2021
End Date: 07/01/2021
No of People: 500
Inside Non-Static Method
Event Name: Kiran
Hall Name: Raj Mohan Hall
Start Date: 06/01/2021
End Date: 07/01/2021
No of People: 500
 */
public class Event {
    String eventName,hallName,startDate,endDate;
    int noOfPeople;

    public void setEName(String eventName){
        this.eventName=eventName;
    }
    public void setHName(String hallName){
        this.hallName=hallName;
    }
    public void setSDAte(String startDate){
        this.startDate=startDate;
    }
    public void setEDate(String endDate){
        this.endDate=endDate;
    }
    public void setPeople(int noOfPeople){
        this.noOfPeople=noOfPeople;
    }
    // ------------------------------
    public String getEName(){
        return eventName;
    }
    public String getHName(){
        return hallName;
    }

    public String getSDAte(){
        return startDate;
    }

    public String getEDate(){
        return endDate;
    }

    public int getPeople(){
        return noOfPeople;
    }
    public void display(){
        System.out.println("Inside Non-Static Method");
        System.out.println("Event Name: "+getEName());
        System.out.println("Hall Name: "+getHName());
        System.out.println("Start Date: "+getSDAte());
        System.out.println("End Date: "+getEDate());
        System.out.println("No of People: "+getPeople());
    }
}
