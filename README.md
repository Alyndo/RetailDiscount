API Endpoint
Http Method - POST
Endpoint - localhost:8080/api/v1/discounts
Example request


{
    "user": {
        "type": "EMPLOYEE",
        "registerDate": "2019-06-27"
    },
    "bill": {
        "items": [
            {
                "type": "GROCERY",
                "price": 20.6
            },
            {
                "type": "TECHNOLOGY",
                "price": 900
            },
            {
                "type": "CLOTHES",
                "price": 10.5
            }
        ]
    }
}

The response is net payable amount = 612.950
