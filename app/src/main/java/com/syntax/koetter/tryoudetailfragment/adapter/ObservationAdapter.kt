package com.syntax.koetter.tryoudetailfragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syntax.koetter.tryoudetailfragment.data.model.Observation
import com.syntax.koetter.tryoudetailfragment.databinding.ObservationItemBinding


class ObservationAdapter: RecyclerView.Adapter<ObservationAdapter.ObservationViewHolder>() {


    /* list of item to recycle */

    private var observations = listOf<Observation>()


    /* ObservationViewHolder class */

    inner class ObservationViewHolder(val binding: ObservationItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindObservation(observation: Observation) {
            binding.observationTypeText.text = observation.title
            binding.observationExplanationText.text = observation.explanation
        }
    }


    /* inflate layout */

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ObservationViewHolder {
        val binding =
            ObservationItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ObservationViewHolder(binding)
    }


    /* filling */

    override fun onBindViewHolder(holder: ObservationViewHolder, position: Int) {
        val ob = observations[position]
        holder.bindObservation(ob)
    }


    /* item count */

    override fun getItemCount(): Int {
        return observations.size
    }


    /* submit() */

    fun submitList(list: List<Observation>) {
        observations = list
    }
}