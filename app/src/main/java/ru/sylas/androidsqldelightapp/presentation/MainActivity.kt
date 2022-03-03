package ru.sylas.androidsqldelightapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.koin.androidx.viewmodel.ext.android.viewModel
import ru.sylas.androidsqldelightapp.R

class MainActivity : AppCompatActivity() {
     val viewModel : MainViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.save()
        var textView: TextView = findViewById(R.id.textView)
        viewModel.getusers().map {
            val temptextView = textView.text
            textView.text= "$temptextView \n ${it.firstName} + ${it.lastName}"
        }

    }


}