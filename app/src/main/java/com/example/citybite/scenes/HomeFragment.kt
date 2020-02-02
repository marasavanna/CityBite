package com.example.citybite.scenes

import android.os.Bundle
import android.view.View
import com.example.citybite.R
import com.example.citybite.databinding.ActivityMainBinding
import com.example.citybite.utils.BaseFragment

class HomeFragment : BaseFragment<ActivityMainBinding>() {
    override fun getLayoutRes(): Int = R.layout.activity_main

    private val viewModel = getViewModel<HomeViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.
    }
}