package com.prueba

class User {

    String userName
    String name
    String lastName
    String email
    String password

    static constraints = {
        email email: true
        password password:true, blank: false, size: 6..15
        userName unique: true
    }
}
