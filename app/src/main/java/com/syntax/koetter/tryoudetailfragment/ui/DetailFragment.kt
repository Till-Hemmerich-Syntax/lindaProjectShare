package com.syntax.koetter.tryoudetailfragment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.syntax.koetter.tryoudetailfragment.MainViewModel
import com.syntax.koetter.tryoudetailfragment.adapter.ObservationAdapter
import com.syntax.koetter.tryoudetailfragment.databinding.FragmentDetailBinding

class DetailFragment: Fragment() {

    private val viewModel: MainViewModel by viewModels()

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        
        binding.toolbarDateText.text = "TODAY"
        binding.detailTitleEditText.hint = viewModel.thought.value?.title.toString()
        binding.detailContentEditMultiText.hint = viewModel.thought.value?.content.toString()

        val observationAdapter = ObservationAdapter()

        binding.observationRecycler.adapter = observationAdapter
    }



    /* observer */

}