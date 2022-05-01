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


![link](https://lh3.googleusercontent.com/A0K5BWV3zgvKMGbV1Tpq1-xrAoaJDtaesZZZgh1ZzEw8uw1uWxyJofPgfnuA7Gd_VVItWJs1OUgXeY_yw45m_l6zIxsTG8sS1JL1roqM-1Z59s4Bngqt0b31laKsQVleiOnoFv3ljs23gDS3uy0SBn2ALPzzYcF-YsBzNHKGo651yUEDR7whp1psYzzcwxeNLHQClc3uooAyGW2esbqXorDQF7Av_70WqRznOaJ4Kv7t-og48koCTI2d7drcSpohndZRSrmswIxm6m2TJGVrthqMVv0N52HOeGTqrINTfi1BZCfwLh1mf46ap1_Tr7jDYbKxDXLd_jGR6mMLEtBfz3Md9H8t1ZtPK3Sma5FhGh1YfIYNlI_edLgs3YdPPWyYV_uQqF0XE8sBWC1L0S26RcYrSy6fTiViCgSYfHNxlV-g8mFKhGXbJiJGHYR8ul4uGiyMl1NAuTIAEjj9kmCdfopX0UsqwIapZXmF7v8nowd1YkTv1bZdRUSND0zFD5umPX-gwRgUjh83PkcqdPO0eo4K40n0cU3boYXQO5ZlJw0nAU-7q-DxQasoWAHf3G7LPekvvEHp7SNm853Ptnp7_y1yydd542GycT_vYqBYwv-Mu6-2yJL_7MitZf8ho29MGOtjwTz8-hA96PwntJk8OKmXh6uo3XONYRBXP9GihSfMEjVFspRblTtiH8sBhHlt7orhpg0hlXywNoqKQV1elab23fwXVD-xqfHuLEPL-CSWLkLe9EVncwMLWjI=w733-h545-no?authuser=0)


---

- **Authors** table


![link](https://lh3.googleusercontent.com/5oEKUwH3c6VMyoAhI2no8vEJ52fPz_d3b3tLanucVc_ODIo-1Q2cf_cwGbB2WoFMaCg75LO8t98YDnziPaXgiBjtagjdQaY2KVVJIW5dZUzQS0DrxiaMPf72RgYI07sMA6jLVzBFNVpSRTEF4lq2TA-TBmhS7V3hSK1vB1MxTlH0gNzt8WxRp51YseY-Evglp9LkfETIlz6vn4xReCuxMMa_RV-n48tGXy6fgW5pghvDVZoMdJrIWz-aaZZeBcikJb-iAuPK_7QdkhnuGlS6-8RgsrimGA_myWlToSoYDmdJYw5a4DdgIhAp3ots6afJhumbz0Qdlty6cAnJcD4vDJE4164wVo34Prgw9xRRWdtK_Ku5VVZ6zxEURkvL4THdNKsUxm8El4sUH9bUmbryELgaSkOc2tf3PPzNT9-02OqrYefh4fFjgkCtOqgnWfvb5ww2KRmvBQ7RxrYbhuUszO_wcVCh4yPTktKx-GFb6K9XQ_TUUPU3GgqgPACYjjUwMHBwyO6qLSbWrk0xCAloAI-zuGL3b2EhyROtQJ1yOfr84Fi36n__dftoC2g7g0aU5SYaYCLXwOVshrp_f4uLOIj4PZFVRdm1ckIB4DXLxcW6zhLbyscHrday7UbX4Tm_1GdoMOXLXRmsfiy2MvLfNSH6DeVEbM1wGcajl3-fQkzczp0Rg7tGB_QIv3XxdC16GKcJv5aDebRGe51UmNw47PJDR_xEO2eOKYLm8IO6uy4HfTsFwi1LXpOfiic=w604-h943-no?authuser=0)


---

- **Books** table

![link](https://lh3.googleusercontent.com/Dt9Ib5jDmAuI3c-rHU_BZ9VmNDrNRQiq-5Cky7lb9Th956fTy_59skfHjc6dh9eFMFucCuLie4QfrOxk1EVKOm7lYr85gfrBE64EAFG_KMpI9qZ4eCQsLhWUnpNe2F-3QXQrvT_lLGxPSGXe_syAnRn-F642BiFCmy5ajpLja7qu7-X5G8f3kDc7qkw8ZPChb74LReY_EzAZme9TaEU6fYUbIvioYzogopDQtspNLcIOoKGYOOlM9eG9MtNblhAccVa40ytR0E_SXhsksFg-y9usYFC1e99bUs2pqDPAPyVw8ltDwkkYm3l4CM4STzuN59muHlXrfbb0BUU9bk5QdUUrYqzVA6YU6fhRabofuNtLnGRBLDYH9TcGT-FpCt0j2IAgInOqwaF8ePZRy0NT5OmolRArhWIoox2sDLjVYrR5n5hEtHbepZuZyvI5dR-GeDHW_hl2udyMXcRP-vgdWvwtYyRLZ7_oSy35To1lwyxpZCpu_UiMT1IW6Ry4Th1OUzKeDkBrE2oWjBFGhvc4Gnu0t2eiLukvX4wtKvPKiznWLE0ITW1-mojSyESr1n3PtmIdnRV1u8CV3L28OqGT7897HZ1KHMj7I5TetjN58rdVWq6Zjvn76tc1Zdu8IH8Jj6cYWjIqWsjItJHBlAQplzeWeATaMqDb-QbimCmClzHcmbAU5frYS-JlcnvxhL5By9dQbdhHYLjz8WXOte5NoaGFCaIGI8NVk4fYnvYVyrxzv5P4hUyixpOk-p8=w763-h943-no?authuser=0)

---


- **authors_books** table

![link](https://lh3.googleusercontent.com/MJngtWq_6upr_E2KX4Tafs8EhphMYV5GxxPGbn3BMJf8CLJW11AHrPQZkDT1ia7ihUREQK5y6Hz-vlF1kNCWyT6x2u9i_F9cVSYd51NS1LJNViKA7J5Muf5AQI7NgUXCRTagm_m3g8rGE-bBn0b0nPCb60HyO1vr4_pJfVHL1z0cJZLaBvXPHKWIbAnZeF3mKRQZ8m6_2hae2QxVT7gqtN1LqNAPtYi_7WHc2EfUdQWVYNS0V_WeGNSvIaEhniG7Ce_P3DBfNCzp_V74tiRo2CYlNBoeFn49ApekUi4BoV6yWWzW7o8SAemFq_cuq_bQfE_SIgRFUknfUJSISWgr-X-DIeNDVXvsQFG8q8OvjTBES6ol_JU0k2rVYpM6edLOUq5ksDCOP20kiUJDU_Jf_MnZ3S6cYbrWGmIr_KkYzjTHUXigwAa_Eon6NVrVecGKweOS-qiKr7W5uxFrxSkrQapTz-KEgvD6QZLgViV7OpCRKbz-9e1GWzh-xlNKZrpddF3Wf6UXIZacA5Wmhp-Hhj94J1B1obcqunGdhEvCih1K9bVL6NHTJ1APkX4i7Y2ULYWwIhJNbXVc-p2gDcUVyrwcbIepbCeWWcZp3tvgolAdJEGGKB2LwuuxgovO1Wgsu3SptjlndDp2kyqlc72zpk3rra5-eoPfEIybtyuJgoNaE3QASCYjoJWJe_426qAoUjKdZDQ1XfxNJNuoB0SGHglG6FqXEkrj-IpUvlQ964GJfnZ9EZPpkli6Ur0=w333-h943-no?authuser=0)

---

**Users** table


![link](https://lh3.googleusercontent.com/UAt6QZv34glpWqO8RzQ_wQcnDjuTHn5PgXJDgLcNgTml11nf32_-VBemB0eSZdVPyhCkAzaP2DkiGP-UeaUf0_oexCqB4Iso6L9sprEHV7QIsircEAAdbRuVThGaeM_EynWtfBd0QKlQYNub6uCRdYjcAkXF7N-IfwabwZ6JA16uHoqQ_dPPaNBrpnNxCAD1Y9Lk7nQ73b_P4cHTYgTZrRX2hC3jCIaWrfYw3RQyRzoX5NVSGyR_7xBgPsGDis2uXZ3rRz1XX5IoatRllfH5nKsHiycc_z2ZGC88Qs1w7WSmC6Id4x3W_I7k_KfjyW1D0R75BfwrnQHKLQ2CdXGx8lxxBA4bgwB1a4LH2vo60BmzJuycKcp2hbntv3VWU9em5ME5ehpHNb8Do5I2evvnzsy9CbgIdq6fmQ7Pi0SKYi1jbM9CHwT2L61eJMxPeDg9Q3OpEPHy54l_FXZy4GRTo_zO5StEodFHztVNMjpLhV4nExHpkv0ooBuLLpo_L0KuB4fUK5gBWfRjQRp8fmfhTQMQsmuIDmpc5QnJeDd2uysqKj_wHsI8RKbh8NTyZSnK7ZT6w84PtOPbKHmwHGrheZ85J-3srfHoXuGbeSKAHlGzC6WuyTPrUMTKQM8AQtGjZEJFzpHcEbW4B0VU70pbJ5yZiupOUVab-SIXXWzIgrz7QrwHKtV_a7J6kieFd6j19WbWlfGDjDQTfjo8nCmaPEtaDR30mCBvOwSoFdwf-wTfD7XG4_WnkmEZhZs=w1123-h169-no?authuser=0)


--- - -


- **Authorities** table

-![link](https://lh3.googleusercontent.com/Ebe_pUEspdvlPhDyz7R7vMvUQMEmNXPb0t-uBSoSqYobt18b1u5DpIwghpQOZeSJsMRVMUC29qZ4uL47dVKn2FgrJHlm0wubmLP4EF57-V978BzjHUUCRHSND8nxlfmSB2X1F3naKC3tKQMRO74zJl3O0aFtv0FP7Hrm7Acw7sEl7m-FVm4LJ45oZrZAZ0BbVgW1vJP1AVR1_leefQ85FANTrUG_F44DsCpqWa-DpjbQtz_GCRowHT24VjtFcPrStlsJZ38D5JIl4L6DWrJi24jAaSncsWtLG13EWqDeeU3eHdaiwDTicMsgvEpe4qFL9BzyIMpiNzraKL10Imu7KBAdDEL4AeQ5Gq9cnDk0vo9QcZOkMkbiBPKVaWqshoNAXRYWuIktYsmqhdV--ZP_A-TqBJyFOEaHDso2w3S54q_NLy2Hw1IjgeX_4EX01hDrclS7zwr1DjWbGv3qNx5FgMcUDRx8BW6Lttl-033vIfWqixoNcbcS1JB265rQXx2ImOiROKxp6CRlw3SshI73L1CMfzTNvOi9Js-IZMKM5RymzCCO6HaGirukltHsGg5Q99kXQ-snj7eKIxeAnpnd_4CTzO-kfWGtwkURvTtniY21msyx-ief7r5vb6hx9gJXTQQ5zysGI9XgVU846W9rHm0ED7sWi4XT7mlmQZH6Dly2RoBg59gOiFLj17FfmQSVNswuzGgmNp3Z0tHVZfQ75RJYpQJ0IBgIsGvqjJoKtCFiJK0SApq2zz62D3Y=w318-h156-no?authuser=0)

---

- **user_authorities** table

![link](https://lh3.googleusercontent.com/9qZsbWjNqV6AK9RlSfCma74QXhWuIuo_RP_chhX0fczjJwHsM52IbO3Fcb9iA708hXniFwqh_Bq9OUZ8FLtvmCUVz1KaJlm7TMiw5PkTMMcPXdYPGYxr6yNjWpuUAK07f7M3eChk39r_5Sm2rlmLxYz4PcHfZ89GeHpOdVzpKu0L5Glr6zIuG4o4xlX1uFirBU2u6p4Wr2c6cTbXbX8xuENGs4nGs9p1GoVWa8JWe2BjO_iiYey6H2oPh5Ovt3AM7Gk6X5q2FjjnLCRoBv4VcL4M4GeirFj_QvugfaKAK4_uMjBlc_gKFJWeIw7tLpakP9QOfIRVcfIPVnOAlkqggpDZhMO4QNr5MK8wW9Pvv7tK5Rls3LcQNV9qb7XIdCJ1C0fC77_fgrJ32ayu321Qy2XgNXi56LeSguqp8mcuJvUp3zDb1mWOlkXhIEbeZWD7jseOw7LJHFs3ZniKzx2Fw70PYIulFAHFQwSNfLWd4Q1b97kVyft3KT-iPZN-bmrvhgYZY_9rdXGOcEJXPDakYiXnvDc4gfAZAlv5UhUmQOdz5W0B2cTb426aotcQ09_sFhtqCci2ZiffmNe4Ce4jB_ijaxk0HstVu1o8p908zhLcUr-i7ZF6yeHF-enTElXcTArZuZnWdUjuuvDrJCiYWnpfUQCaoho2uKkcvq3FZ00CWHizr5-9I_PjlSH8xbLkUmfs2jGbLrCSSRYqB1_okZF-DDzadz8PY2MvMVaqysG48HaH-iVHaox5yLQ=w407-h158-no?authuser=0)

 
---


- *Authorization*

  **username**| **password**| **role**
      --- | --- | --- |
  publisher| publisher1234| PUBLISHER
  user| user1234|      USER

AS **PUBLISHER**

![link](https://lh3.googleusercontent.com/qsbetCxUafRFmkNyhi0qWJ6c82-9ZdmI8cZ7YWTEF7N5g7Yf8knE0Q2k7c3eRr1XmzB1DGQD4_0Ex1AHrSc8Z6q55elPnqTeWp32nUgSgcMZKxS_H7F7YiFRSPUbtJhovdlugEiPe7236cdxWbU61gDrU36K3GThzzPi82JSvpKUrHyHSykmJulPZ8uGjQ4kt32twZ9XryaLFM2hyaWJX1WOopbkUFoBrgc_nESqe9cqA5dShAgVOaER7Igg1kVjJc5bQYRI7T8OaXlak_BJ32OwUJq7d-5RynyWOuJzTPuQr9lpp80VXexSGom_eFpi5k_uTrQ6EVl567Qu7jH9n30iWpzgBtI2hqjqDcu_ej7Wskf-0TaZeyHc9YDHXrdFp7tZkXZOS6StlhauE-uhg-LbeDV3rTKMHEB4hqtUt8kX2luySlbxvOdY23wyv7JFiPbOHlCb8D0v2Zzt6Q3HTZ06ulOUrP8_PiWm-eLSwfjbsQTXtDDJmibTo1TypyEWAalCpfxH4OAE42KujYaRij2lgVDGWvjcUy_vN17nfwjFlTAH-YPAeW4FEJSQZ8UNQY6gUjNAXrmpabRqR3he5OM4CS61TrSQFAnK4whN2ju9epJi-veruHUk6Nl4ta9Yl510uwx7ThsDeiZ4TaeSgEt-7lz8XTYvMTkANS7tQ-f13tyQzaiJb_FpfPzhgXXECDPatQB0b77bL-KEW7kEzzuxWMQeD2y0uRqYXid-j01FBG51V_4E5tgKVPA=w1882-h845-no?authuser=0)

AS **USER**

![link](https://lh3.googleusercontent.com/BGjhLKwln9a28MuYO2ThBfSBDlfrSIzgt0MSTyk2ktPZrxxnSP2o49ZXlHrfblkAWy7ek1RLtaF-1UPAQlmz0QN0WeZIb31eQPrm4PRHKbRudYOqw3DnrQ7_gmIVFooM1oMZEtFVHjZ_WfbHG6NNuKzXgVCJs7O76DiiTQqbd4Sb1HLceknqQ-gckgOqhwdG5XZn404A3-vvYiIymXl2KESuHTYB-W_fCKZwlQ5wJjaKkFyeZv-daYq7QT4p-0za7AxT9N8qQ2ahzpWbJaD-qCJUicOslLkiVrhv_ZO86p94iqv2qCgfNuSunCo-lv75HVPnTj9K1D_XHRak3aXgWHEF7xR2telCnNEzgieDd_vnO3AELN7Y4jA74To-uewj8O0kAXt4uQOvocWhQXntnU5lwn_IlX5NJ8D9Rax74Z5YuPOQlVw82sCmTJYMMftn7N5zrDODoKkIK-HZ3UHKC8lZtKlTZSMEw7PZOBwSYrDaDTh0iluC0gwNeQUXePe6vD_z_TW-6_XNfkELFOU-dy9KIFU_C5R3oVWfw_VRW_q9wEp6sWcn21c3H0_m7LpjNFg4sP1Ktxqutuhiejb8vZHFuZNOfsIoJysV1lIzfn_J40x2XhGBT2xMw87yn2nwT4iMgF4vjuqWpBV6mLHKq1bICYv-XpJ-1RM58scU7V9H0DYDjCJrBWsLmlF8xnzGOkjYJwl28q_UVEwH4kxDsuicy26gVXE1FDXlTqK6nODgDKe7mqAqSqAd22Q=w1876-h867-no?authuser=0)

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
