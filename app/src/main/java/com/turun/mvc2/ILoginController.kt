package com.turun.mvc2

import android.provider.ContactsContract.CommonDataKinds.Email

interface ILoginController {

    fun onLogin(email:String?,password:String?)

}