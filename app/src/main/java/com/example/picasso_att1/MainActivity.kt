package com.example.picasso_att1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*

class MainActivity : AppCompatActivity() {
    var users: ArrayList<String> = ArrayList()
    private var client = OkHttpClient()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getUserList()
    }
    private fun getUserList(){
        imgRc.visibility = View.VISIBLE
        imgRc.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val versions = ArrayList<ImageGet>()
        versions.addAll(ImageGet.getAndroidVersionList())
        val adptr = ImageAdapter(versions)
        imgRc.adapter = adptr
    }
}
