package com.syntax.koetter.tryoudetailfragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syntax.koetter.tryoudetailfragment.data.model.Distortion
import com.syntax.koetter.tryoudetailfragment.databinding.DistortionItemBinding

class DistortionAdapter: RecyclerView.Adapter<DistortionAdapter.DistortionViewHolder>() {


    /* list of item to recycle */

    private var distortions = listOf<Distortion>()


    /* ObservationViewHolder class */

    inner class DistortionViewHolder(val binding: DistortionItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindDistortion(distortion: Distortion) {
            binding.distortionNameText.text = distortion.type
            binding.distortionDescriptionText.text = distortion.description
            binding.distortionCheckBox.isChecked = distortion.isChecked
        }
    }


    /* inflate layout */

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DistortionAdapter.DistortionViewHolder {
        val binding =
            DistortionItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DistortionViewHolder(binding)
    }


    /* filling */

    override fun onBindViewHolder(holder: DistortionViewHolder, position: Int) {
        val dis = distortions[position]
        holder.bindDistortion(dis)
    }


    /* item count */

    override fun getItemCount(): Int {
        return distortions.size
    }


    /* submit() */

    fun submitList(list: List<Distortion>) {
        distortions = list
    }
}