package com.syntax.koetter.tryoudetailfragment.data

import com.syntax.koetter.tryoudetailfragment.data.model.Distortion
import com.syntax.koetter.tryoudetailfragment.data.model.Observation
import com.syntax.koetter.tryoudetailfragment.data.model.Thought

class Repository {

    fun loadThought(): Thought {
        return Thought("JOHN", "He did not come home last night. He probably left me for good.")
    }

    fun loadObservations(): MutableList<Observation>{
        return mutableListOf(
            Observation("Distortion 1", "Explanation ............."),
            Observation("Distortion 4", "Explanation ............."),
            Observation("Distortion 2", "Explanation .............")
        )
    }

    fun loadAiOpinion(): List<Observation>{
        return listOf(
            Observation("Distortion 1", "Explanation ............."),
            Observation("Distortion 2", "Explanation .............")
        )
    }

    fun loadDistortionList(): List<Distortion>{
        return listOf(
            Distortion("Distortion 1", "Definition .............."),
            Distortion("Distortion 2", "Definition .............."),
            Distortion("Distortion 3", "Definition .............."),
            Distortion("Distortion 4", "Definition .............."),
            Distortion("Distortion 5", "Definition .............."),
            Distortion("Distortion 6", "Definition .............."),
            Distortion("Distortion 7", "Definition .............."),
        )
    }
}