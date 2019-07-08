package at.ict4d.dmiweather

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.Observer
import at.ict4d.dmiweather.databinding.WeatherSearchFragmentBinding

// public class WeatherSearchFragment extends Fragment
class WeatherSearchFragment : Fragment() {

    // private WeatherSearchViewModel viewModel = new WeatherSearchViewModel()
    private lateinit var viewModel: WeatherSearchViewModel

    private lateinit var binding: WeatherSearchFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = WeatherSearchFragmentBinding.inflate(inflater, container, false)
        binding.clickListener = this

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WeatherSearchViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onResume() {
        super.onResume()
        viewModel.searchResult.observe(viewLifecycleOwner, Observer { result ->
            Toast.makeText(activity, result?.description, Toast.LENGTH_SHORT).show()
        })
    }

    fun onSearchButtonClicked() {
        viewModel.searchForWeather(binding.editText.text.toString())
    }
}
