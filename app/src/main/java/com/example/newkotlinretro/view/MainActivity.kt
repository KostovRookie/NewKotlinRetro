package com.example.newkotlinretro.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.newkotlinretro.R
import com.example.newkotlinretro.retrofit.jsonDefaultInstance
import com.example.newkotlinretro.model.Data
import com.example.newkotlinretro.viewModel.MainActivityViewModel
import kotlinx.serialization.encodeToString


class MainActivity : AppCompatActivity() {

    private lateinit var context: Context

    lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        context = this@MainActivity

        mainActivityViewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        val buttonClick = findViewById<Button>(R.id.btnClick)     // i use the button for manual calls
        buttonClick.setOnClickListener {


            mainActivityViewModel.getUser()!!.observe(this) {

                val data = Data(
                    login = "test",
                    type = "Type",
                    id = 1,
                    avatar = "testAvatarUrl",
                    url = "Doe"
                )
                val string = jsonDefaultInstance.encodeToString(data)

                print(string)    // testing only


            }

        }

    }
}