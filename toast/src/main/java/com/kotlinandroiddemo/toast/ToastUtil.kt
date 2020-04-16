package com.kotlinandroiddemo.toast

import android.content.Context
import android.speech.tts.TextToSpeech
import android.widget.Toast

class ToastUtil(var context: Context,var msg:String) {
    fun show(){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }
}