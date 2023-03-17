package com.syntax.koetter.tryoudetailfragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syntax.koetter.tryoudetailfragment.data.Repository
import com.syntax.koetter.tryoudetailfragment.data.model.Distortion
import com.syntax.koetter.tryoudetailfragment.data.model.Observation
import com.syntax.koetter.tryoudetailfragment.data.model.Thought

class MainViewModel: ViewModel() {

    private val repository = Repository()

    /* live data */

    private val _thought = MutableLiveData<Thought>(repository.loadThought())
    val thought: LiveData<Thought>
        get() = _thought

    private val _observations = MutableLiveData<MutableList<Observation>>(repository.loadObservations())
    val observations: LiveData<MutableList<Observation>>
        get() = _observations

    private val _aiOpinion = MutableLiveData<List<Observation>>(repository.loadAiOpinion())
    val aiOpinion: LiveData<List<Observation>>
        get() = _aiOpinion

    private val _distortions = MutableLiveData<List<Distortion>>(repository.loadDistortionList())
    val distortions: LiveData<List<Distortion>>
        get() = _distortions

}