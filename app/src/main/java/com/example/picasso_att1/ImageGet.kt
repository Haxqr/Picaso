package com.example.picasso_att1

import java.io.Serializable

class ImageGet(val imageURL : String) : Serializable {
    companion object{
        fun getAndroidVersionList(): List<ImageGet>{
            val versionList = ArrayList<ImageGet>()
            versionList.clear()
            versionList.add(ImageGet("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/kitkat.png"))
            versionList.add(ImageGet("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/lollipop.png"))
            versionList.add(ImageGet("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/marshmallow.png"))
            versionList.add(ImageGet("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/nougat.png"))
            versionList.add(ImageGet("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/oreo.png"))
            return versionList
        }
    }
}
