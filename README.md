Login and password for authentication

login: user password user1234 (USER) login: publisher password: publisher1234 (PUBLISHER) You can see database diagram https://docs.google.com/presentation/d/1t1pdqtyW8Wtdm-tc4JrDwY8BhmcTP30x_VM0QUH871w/edit?usp=sharing Info about this books you can see in this link or in liquibase files

PUT http://127.0.0.1:8088/v1/books/{bookId}/publishers/{publisherId} success case (1-1, 2-2, 35-9) Update specific books (PUBLISHER) Request Body (BookDto){ "genre": "PROGRAMMING", "name": "bookName", "pageCount": 150, "publishingYear": 2002 }

GET example http://127.0.0.1:8088/v1/books?count=10&name=EFFECTIVE JAVA&page=0 get books by name (pagination support) (PUBLISHER, USER)

GET http://127.0.0.1:8088/v1/books?count=10&page=2 get all books (PUBLISHER,USER)

GET http://127.0.0.1:8088/v1/publishers/1 id (1- 13) As a USER get all books published by specific publisher

POST http://127.0.0.1:8088/v1/publishers/1 id (1-13) As a PUBLISHER to add new book to the book list

Request Body (BookDto){ "genre": "TRAVEL", "name": "bookName", "pageCount": 150, "publishingYear": 2002 }

GET http://127.0.0.1:8088/v1/authors/{id} id (0 - 38) to see the details of book and author (PUBLISHER,USER)

POST http://127.0.0.1:8088/v1/users As a user, to register with a valid email (without authentication)

Request Body (UserRegisterDto) { "firstName" :"firstName", "lastName": "lastname", "age" : 20,
"username" : "username",
"password" : "password", "email": "email@gmail.com"
}

