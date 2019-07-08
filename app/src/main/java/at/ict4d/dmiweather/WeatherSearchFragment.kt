package at.ict4d.dmiweather

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class WeatherSearchFragment : Fragment() {

    companion object {
        fun newInstance() = WeatherSearchFragment()
    }

    private lateinit var viewModel: WeatherSearchViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.weather_search_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WeatherSearchViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
