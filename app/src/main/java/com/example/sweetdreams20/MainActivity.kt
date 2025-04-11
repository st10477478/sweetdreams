package com.example.sweetdreams20

import android.content.Intent
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sweetdreams20.ui.theme.Sweetdreams20Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Text(text = "Hello Hera!!")
                
                Text(text = "Please select the time of day to see what we have in store for you")


            Row {
                Button(
                    onClick = {
                        val morning = Intent(this@MainActivity, menu::class.java)
                        startActivity(morning)
                    }){



                    Text(text = "Morning")

                    
                }    

            Row {
                Button(
                    onClick = {
                    val midday = Intent (this@MainActivity, middayfood::class.java)
                    startActivity(midday)}) {
                    Text(text = "Mid-day")

                
                }
                
            Row {
                Button(onClick = {
                val dinner = Intent(this@MainActivity, dinner::class.java)
                startActivity(dinner)}) {
                    Text(text = "Dinner")
                    
                }
            }    
            }
                    

                }
            }
            }
            
        
        }    
            


        }






    





