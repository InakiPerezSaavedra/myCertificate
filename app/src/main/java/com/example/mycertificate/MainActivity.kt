package com.example.mycertificate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycertificate.ui.theme.MyCertificateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyCertificateTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CertificatingCourse()
                }
            }
        }
    }
}

@Composable
fun CertificatingCourse(modifier: Modifier = Modifier) {
    val name = "Iñaki Pérez Saavedra"
    val number = 10 // Número de horas del curso
    val course = "Basic Kotlin Programming"

    Column(
        modifier = modifier.fillMaxSize().padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.escudo_izquierdo),
                contentDescription = null,
                modifier = Modifier.size(50.dp, 50.dp)
            )
            Text(
                text = "Fictitious Inc.",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Image(
                painter = painterResource(id = R.drawable.escudo_derecho),
                contentDescription = null,
                modifier = Modifier.size(50.dp, 50.dp)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "This certificate is presented to:",
            fontSize = 18.sp,
            textAlign = TextAlign.Center
        )
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_fondo),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                alpha = 0.1F
            )
            Text(
                text = name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "has completed a $number hours course on",
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = course,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(40.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "John Doe", fontWeight = FontWeight.Bold)
                Text(text = "Director")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Jane Smith", fontWeight = FontWeight.Bold)
                Text(text = "Manager")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CertificatingCoursePreview() {
    MyCertificateTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            CertificatingCourse()
        }
    }
}
