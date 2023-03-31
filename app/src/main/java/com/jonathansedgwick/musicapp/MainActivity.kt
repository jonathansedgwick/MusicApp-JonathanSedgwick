package com.jonathansedgwick.musicapp

import android.content.Context
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.io.*
import java.net.HttpURLConnection
import java.net.URL
import java.util.concurrent.Executors


class MainActivity : AppCompatActivity() {

    lateinit var loginButton: Button
    lateinit var signupButton: Button
    lateinit var loginImage: ImageView
    lateinit var view: View
    lateinit var relativeLayout: RelativeLayout
    lateinit var scrollText: TextView
    var loginEmail: String = ""
    var loginPassword: String = ""
    var signupName: String = ""
    var signupEmail: String = ""
    var signupPassword: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton = findViewById(R.id.login_button)
        signupButton = findViewById(R.id.signup_button)

        loginButton.setOnClickListener {
            handleLoginDialogue()
        }
//
        signupButton.setOnClickListener {
            handleSignUpDialogue()
        }






//
//        val executor = Executors.newSingleThreadExecutor()
//        var response: String = ""
//        executor.execute {
//
//            try {
//                val url: URL = URL("http://1a77cdd.online-server.cloud/text/login_page.txt");
//                val connection: HttpURLConnection = url.openConnection() as HttpURLConnection
//                connection.doInput = true;
//                connection.requestMethod = "GET"
//                connection.doOutput = false
//                connection.setRequestProperty("Accept", "application/txt")
//                val responseCode = connection.responseCode
//                Log.e("RESPONSECODEFORTEXT", responseCode.toString())
//                val input: InputStream = BufferedInputStream(connection.inputStream)
//                if (responseCode == 200) {
//                    val bufferedReader = BufferedReader(InputStreamReader(input))
//                    response = bufferedReader.readText()
//                    Log.e("Response", response)
//
//
//                } else {
//                    response = "Can't get text"
//                }
//
//            } catch (e: IOException) {
//                // Log exception
//                Log.e("CANT CONNECT", e.toString())
//            }
//
//
//        }


//        val executor = Executors.newSingleThreadExecutor()
//            executor.execute {
//                try {
//                    val url: URL = URL("http://1a77cdd.online-server.cloud/images/goat");
//                    val connection: HttpURLConnection = url.openConnection() as HttpURLConnection
//                connection.doInput = true;
//                connection.requestMethod = "GET"
//                connection.doOutput = false
//                connection.setRequestProperty("Accept", "application/txt")
//                val responseCode = connection.responseCode
//                Log.e("RESPONSECODEFORTEXT", responseCode.toString())
//                val input: InputStream = BufferedInputStream(connection.inputStream)
//
//                if (responseCode == 200) {
//
//
//                }
//
//
//
//                } catch (e: IOException) {
//                    // Log exception
//
//                }
//
//            }
//
//
//
    }






        private fun handleLoginDialogue() {
            print("Inflater")
            val inflater: LayoutInflater =
                this@MainActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val viewGroup: ViewGroup = findViewById(R.id.login_linear_layout)
            viewGroup.removeAllViews()
            val view: ViewGroup =
                inflater.inflate(R.layout.login__dialogue, viewGroup, false) as ViewGroup
            signupButton.visibility = View.GONE
            loginButton.visibility = View.GONE
            viewGroup.addView(view)

            var loginBtn: Button = view.findViewById(R.id.login)
            var emailEdit: EditText = view.findViewById(R.id.loginEmailEdit)
            var passwordEdit: EditText = view.findViewById(R.id.loginPasswordEdit)

            loginBtn.setOnClickListener {
                loginEmail = emailEdit.text.toString()
                loginPassword = passwordEdit.text.toString()
                viewGroup.removeAllViews()
                signupButton.visibility = View.VISIBLE
                loginButton.visibility = View.VISIBLE
            }

        }

        private fun handleSignUpDialogue() {


            val inflater: LayoutInflater =
                this@MainActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val viewGroup: ViewGroup = findViewById(R.id.login_linear_layout)
            viewGroup.removeAllViews()
            val view: ViewGroup =
                inflater.inflate(R.layout.signup__dialogue, viewGroup, false) as ViewGroup
            signupButton.visibility = View.GONE
            loginButton.visibility = View.GONE
            viewGroup.addView(view)


            var signupBtn: Button = view.findViewById(R.id.signup)
            var nameEdit: EditText = view.findViewById(R.id.nameEdit)
            var emailEdit: EditText = view.findViewById(R.id.signupEmailEdit)
            var passwordEdit: EditText = view.findViewById(R.id.signupPasswordEdit)

            signupBtn.setOnClickListener {
                signupEmail = emailEdit.text.toString()
                signupName = nameEdit.text.toString()
                signupPassword = passwordEdit.text.toString()
                viewGroup.removeAllViews()
                signupButton.visibility = View.VISIBLE
                loginButton.visibility = View.VISIBLE
            }

//
        }


    }











