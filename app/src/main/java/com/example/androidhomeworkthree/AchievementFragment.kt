package com.example.androidhomeworkthree

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment

class AchievementFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.achievement_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageView>(R.id.achievement_one).setOnLongClickListener {
            Toast.makeText(requireContext(), R.string.achievement_one, Toast.LENGTH_SHORT).show()
            true
        }

        view.findViewById<ImageView>(R.id.achievement_two).setOnLongClickListener {
            Toast.makeText(requireContext(), R.string.achievement_two, Toast.LENGTH_SHORT).show()
            true
        }

        view.findViewById<ImageView>(R.id.achievement_three).setOnLongClickListener {
            Toast.makeText(requireContext(), R.string.achievement_three, Toast.LENGTH_SHORT).show()
            true
        }

        view.findViewById<ImageView>(R.id.achievement_four).setOnLongClickListener {
            Toast.makeText(requireContext(), R.string.achievement_four, Toast.LENGTH_SHORT).show()
            true
        }

        view.findViewById<ImageView>(R.id.achievement_five).setOnLongClickListener {
            Toast.makeText(requireContext(), R.string.achievement_five, Toast.LENGTH_SHORT).show()
            true
        }
    }
}