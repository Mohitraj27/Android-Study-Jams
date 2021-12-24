package com.android.registrationformapp

import java.io.Serializable
import java.net.PasswordAuthentication

data class User(

    val title: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val phone: String,
    val password: String
    ):Serializable
{
    fun getFullName() = "$title $firstName $lastName"
}
