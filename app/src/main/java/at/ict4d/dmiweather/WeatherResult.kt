package at.ict4d.dmiweather

data class WeatherResult(
    val name: String,
    val description: String,
    val temperature: String,
    val humidity: String,
    val windSpeed: String
)