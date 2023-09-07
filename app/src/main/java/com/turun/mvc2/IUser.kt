package com.turun.mvc2

interface IUser {

    fun getEmail():String?

    fun getPassword():String?

    fun isValid():Int
}