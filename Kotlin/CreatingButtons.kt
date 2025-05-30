package com.example.creatingbuttons

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var texttest:EditText
    lateinit var button1:Button
    lateinit var button2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texttest=findViewById(R.id.editTextText2)
        button1=findViewById(R.id.button)
        button2=findViewById(R.id.button2)

        button1.setOnClickListener{
        var texttest2 = texttest.text.toString()
        Toast.makeText(this, texttest2,Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val texttest2 = texttest.text.toString()
                Toast.makeText(this@MainActivity,texttest2,Toast.LENGTH_SHORT).show()
            }
            
        })

        }
    }

/* 
activity_main.xml:

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/editTextText2"
        android:layout_width="239dp"
        android:layout_height="184dp"
        android:ems="10"
        android:inputType="text"
        android:text="Hello World"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.3"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.3"
        android:textAlignment="gravity"
        android:gravity="start|top"/>

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0."
        app:layout_constraintStart_toStartOf="@+id/editTextText2"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.585" />

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="@+id/button"
        app:layout_constraintTop_toBottomOf="@+id/button"
        app:layout_constraintVertical_bias="0.1" />

</androidx.constraintlayout.widget.ConstraintLayout> */ 
