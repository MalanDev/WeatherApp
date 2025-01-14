package lk.malanadev.weatherapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import lk.malanadev.weatherapp.ui.screens.Components.ActionBar
import lk.malanadev.weatherapp.ui.screens.Components.AirQuality
import lk.malanadev.weatherapp.ui.screens.Components.DailyForecast
import lk.malanadev.weatherapp.ui.theme.ColorBackground


@Composable
fun WeatherScreen(){
    Scaffold (
        modifier = Modifier.fillMaxSize(),
        containerColor = ColorBackground
    ){ padddings ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(padddings)
                .padding(
                    horizontal = 24.dp,
                    vertical = 24.dp
                )
        ){
            ActionBar()
            Spacer(modifier = Modifier.height(12.dp))
            DailyForecast()
            Spacer(
                modifier = Modifier.height(16.dp)
            )
            AirQuality()
        }

    }
}