package com.turun.mvc2

class LoginController(private val loginView: ILoginView) : ILoginController {
    override fun onLogin(email: String?, password: String?) {
        val user = User(email, password)
        val loginCode = user.isValid()

        when (loginCode) {
            0 -> {
                loginView.onLoginError("lütfen mail adresinizi giriniz")
            }
            1 -> {
                loginView.onLoginError("e-maill eşleşmiyor")
            }
            2 -> {
                loginView.onLoginError("şifre hatalı")
            }
            3 -> {
                loginView.onLoginSucces("giriş başarılı")
            }

        }
    }
}