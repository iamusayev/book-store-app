                                                  BOOKS STORE APPLICATION
---

**Requirements**

**as a**

- **USER** and  **PUBLISHER**
 
   - I should get an error message if the username and password are wrong
    - I should be able to list books
   - Search specific book (pagination support)
  - See the details of book and author (GET)

- **USER**
   - I should be able to list all books published by specific publisher
   - I should be able to register with a valid email (bonus)

- **PUBLISHER**
   -  I should be able to login to the system when a valid username and password supplied
   - I should be able to list books
   - I should be able to add new book to the book list
   - I should be able update a specific book details that has been published by me
---


- **Database Diagram**

![link](https://i.postimg.cc/TwqnjCGw/DB-diagram.png)

---

- **Publishers** table


![link](https://i.postimg.cc/NjdX05Dy/publishers-tablee.png)

---

- **Authors** table

![link](https://i.postimg.cc/kG9JPvkk/authors.png)


---


- **Books** table

![link](https://i.postimg.cc/g08bc6qd/books-tableee.png)

---


- **authors_books** table

![link](https://i.postimg.cc/nh96TQW7/autho-books-table.png)

---

**Users** table

![link](https://i.postimg.cc/PxT9tV5z/users.png)


--- - -


- **Authorities** table

![link](https://i.postimg.cc/j2sD4Tdw/authorities.png)

---

- **user_authorities** table

![link](https://i.postimg.cc/j5T2RTfg/user-author.png)
 
---


- *Authorization*

  **username**| **password**| **role**
      --- | --- | --- |
  publisher| publisher1234| PUBLISHER
  user| user1234|      USER

AS **PUBLISHER**

![link](https://i.postimg.cc/KYPcqWWn/user.png)

AS **USER**

![link](https://i.postimg.cc/X7rjSqhN/user1.png)
---

- **GET**

As a **USER** and **PUBLISHER** to search specific book (pagination support)

http://127.0.0.1:8088/v1/books?count=10&name=somename&page=0

-- -

- **GET**

As a **USER** and **PUBLISHER**  Get all books

http://127.0.0.1:8088/v1/books?count=10&page=0

----
- **GET**

As a **USER** and **PUBLISHER**  to see the details of book and author

http://127.0.0.1:8088/v1/authors/{id} (1-38)

- ----
- **GET**

As a **USER**, I should be able to list all books published by specific publisher

http://127.0.0.1:8088/v1/publishers/{id}  (1-13)

----
- **POST**

As a **USER**, I should be able to register with a valid email


http://127.0.0.1:8088/v1/users (without authentication)


Request  Body
```json
{
  "firstName" :"firstName",
  "lastName": "lastname",
  "age" : 20,
  "username" : "username",
  "password" : "password",
  "email": "email@gmail.com"
}
```

Validation

```java
    @NotNull
    @NotBlank
    private String firstName;

    @NotBlank
    @NotNull
    private String lastName;

    @NotNull
    @Min(value = 12)
    @Max(value = 80)
    private Integer age;

    @NotNull
    @NotBlank
    @Size(min = 6, max = 16)
    private String username; (unique)
    
    @NotNull
    @NotBlank
    @Size(min = 6, max = 16)
    private String password;
    
    @Email
    @Size(min = 14, max = 26)
    @NotNull
    private String email; (unique)
```
------

- **POST**

As a **PUBLISHER**, I should be able to add new book to the book list

http://127.0.0.1:8088/v1/publishers/{id}  id (1-13)

Request Body
```json
 {
  "genre": "TRAVEL",                                                
  "name": "bookName",  
  "pageCount": 150,
  "publishingYear": 2002
}

```
Validation
```java

    @NotBlank
    @NotNull
    @Size(min = 4)
    private String name;   (unique)

    @Min(value = 1940)
    @Max(value = 2022)
    private Integer publishingYear;

    @Min(value = 100)
    @Max(value = 800)
    private Integer pageCount;

    @NotNull
    private Genre genre;

}
```
-----

- **PUT**


http://127.0.0.1:8088/v1/books/{bookId}/publishers/{publisherId}            success case  (1-1, 2-2, 35-9)

As a **PUBLISHER**, I should be able update a specific book details that has been published by me publisher

Request Body
```json
{
  "genre": "PROGRAMMING",                                          
  "name": "bookName",
  "pageCount": 150,   
  "publishingYear": 2002
}       

```
Validation
```java

    @NotBlank
    @NotNull
    @Size(min = 4)
    private String name;   (unique)

    @Min(value = 1940)
    @Max(value = 2022)
    private Integer publishingYear;

    @Min(value = 100)
    @Max(value = 800)
    private Integer pageCount;

    @NotNull
    private Genre genre;

}
```
