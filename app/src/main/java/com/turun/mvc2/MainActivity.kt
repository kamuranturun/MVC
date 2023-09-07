package com.turun.mvc2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(),ILoginView {
    var email: EditText? = null
    var password: EditText? = null
    var loginButton: Button? = null

    var loginPresenter: ILoginController? = null


    var tvEmailErr: TextView? = null
    var tvPasswordErr: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.edtUserName)
        password = findViewById(R.id.edtPassword)
        loginButton = findViewById(R.id.mButtonLogin)

        loginPresenter=LoginController(this)

        tvEmailErr = findViewById(R.id.txtUserNameError)
        tvPasswordErr = findViewById(R.id.txtPasswordError)


        loginButton?.setOnClickListener {
            (loginPresenter as LoginController).onLogin(
                email?.text.toString(),
                password?.text.toString().trim()

            )
        }
    }

    override fun onLoginSucces(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    }

    override fun onLoginError(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


}