Instructions for API

**UserLoginCOntroller
1)add User
endpoint- "/addUsers"

JSON-{
	"name":"vikas",
	"age":23,
	"gender":0,
	"email":"vikas@gmail.com",
	"password":12345,
	"role":1
}

2)Login
endpoint- "/loginUser"
 JSON-
 AS Admin
 {
	"email":"vikas@gmail.com",
	"password":12345,
	"role":1
}
AS User

 {
	"email":"vikas@gmail.com",
	"password":12345,
	"role":0
}

**AdminController

Endpoints
1) /addtTrain (POST)

JSON-
   {
        "id": 12830,
        "name": "Intercity",
        "originatingTime": "2019-12-19T04:41:47.736537Z",
        "stops": [
            {
                "id": 25,
                "arrivalTime": "2019-12-19T04:41:47.723537Z",
                "departureTime": "2019-12-19T04:41:47.723537Z",
                "distanceTravelled": 200,
                "currentAvailability": {
                    "SECOND_AC": 5
                },
                "stationName": "Pune"
            },
            {
                "id": 26,
                "arrivalTime": "2019-12-19T04:41:47.726537Z",
                "departureTime": "2019-12-19T04:41:47.726537Z",
                "distanceTravelled": 200,
                "currentAvailability": {
                    "SLEEPER": 8,
                    "SECOND_AC": 10,
                    "FIRST_AC": 5
                },
                "stationName": "Mumbai"
            },
            {
                "id": 27,
                "arrivalTime": "2019-12-19T04:41:47.726537Z",
                "departureTime": "2019-12-19T04:41:47.726537Z",
                "distanceTravelled": 500,
                "currentAvailability": {
                    "FIRST_AC": 5
                },
                "stationName": "Andheri"
            },
            {
                "id": 28,
                "arrivalTime": "2019-12-19T04:41:47.726537Z",
                "departureTime": "2019-12-19T04:41:47.726537Z",
                "distanceTravelled": 550,
                "currentAvailability": {
                    "FIRST_AC": 10
                },
                "stationName": "Dadar"
            }
        ],
        "farePerKM": {
            "SECOND_AC": 5.2,
            "FIRST_AC": 3.0
        },
        "totalSeats": {
            "SECOND_AC": 5,
            "FIRST_AC": 3
        }
    }

2)ShowALLTrains(GET)

endpoint- "/trains" 

3)GetTrainByID

endpoint-
        "/findTrain/{id}"

4)Modify train(PUT)
endpoint - "/modifyTrains"

json- {
        "id": 12830,
        "name": "Intercity-Exp",
        "originatingTime": "2019-12-19T04:41:47.736537Z",
        "stops": [
            {
                "id": 25,
                "arrivalTime": "2019-12-19T04:41:47.723537Z",
                "departureTime": "2019-12-19T04:41:47.723537Z",
                "distanceTravelled": 200,
                "currentAvailability": {
                    "SECOND_AC": 5,
                    "FIRST_AC": 5
                },
                "stationName": "Pune"
            },
            {
                "id": 26,
                "arrivalTime": "2019-12-19T04:41:47.726537Z",
                "departureTime": "2019-12-19T04:41:47.726537Z",
                "distanceTravelled": 200,
                "currentAvailability": {
                    "SLEEPER": 8,
                    "SECOND_AC": 10,
                    "FIRST_AC": 5
                },
                "stationName": "Mumbai"
            },
            {
                "id": 27,
                "arrivalTime": "2019-12-19T04:41:47.726537Z",
                "departureTime": "2019-12-19T04:41:47.726537Z",
                "distanceTravelled": 500,
                "currentAvailability": {
                    "FIRST_AC": 5
                },
                "stationName": "Andheri"
            },
            {
                "id": 28,
                "arrivalTime": "2019-12-19T04:41:47.726537Z",
                "departureTime": "2019-12-19T04:41:47.726537Z",
                "distanceTravelled": 550,
                "currentAvailability": {
                    "FIRST_AC": 10
                },
                "stationName": "Dadar"
            }
        ],
        "farePerKM": {
            "SECOND_AC": 5.2,
            "FIRST_AC": 3.0
        },
        "totalSeats": {
            "SECOND_AC": 5,
            "FIRST_AC": 3
        }
    }

 5)Delete train by id(GET)
 endpoint- /deleteTrain/{id} 


**USER Controller

1)Search Trains by Source and Destination Station

endpoint- "/searchTrains/{source}/{destination}"

**BOOKing Controller

1)BOOK TICKET

endpoint- "/bookTicket"

JSON-
{
    "id": 7,
    "trainId": 12830,
    "trainName": "Intercity",
    "bookingDate": "2019-12-22T09:32:18.622199Z",
    "journeyDate": "2019-12-22T09:32:18.622199Z",
    "price": 500.0,
    "berthType": "SECOND_AC",
    "source": "Pune",
    "destination": "Mumbai",
    "distance": 500,
    "passengerList": [
        {
            "id": 1,
            "name": "A",
            "gender": "MALE",
            "age": 20
        },
        {
            "id": 2,
            "name": "B",
            "gender": "FEMALE",
            "age": 20
        }
    ]
}

2)GET fare (GET)

endpoint- "/getFare/{tid}/{berthType}/{seats}/{src}/{destination}"

        localhost:8080/getFare/12830/FIRST_AC/3/Pune/Mumbai

3)Booked Ticket History By User ID(GET)
endpoint - "/bookedTickets/{id}"


4)Find ticket by id(GET)
endpoint- "/findTicket/{id}"