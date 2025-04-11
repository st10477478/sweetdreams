package com.example.sweetdreams20

import android.content.Intent
import android.os.Bundle
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

class middayfood : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "midday menu")

                }


                Row {
                    Text(text = "cheese burger")
                }


                Row {
                    Text(text = "double pattie cheese burger")
                }

                Row {
                    Text(text = "quarter leg grill & chips")
                }

                Row {
                    Text(text = "chicken breast with mushroom sauce")
                }
                
                
                Button(
                    onClick = {
                    val back = Intent(this@middayfood, MainActivity::class.java) 
                    startActivity(back)}) {
                    Text(text = "back")
                    
                }
                }
            }
        }
    }





