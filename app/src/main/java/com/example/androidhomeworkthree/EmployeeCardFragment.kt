package com.example.androidhomeworkthree

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.Fragment

class EmployeeCardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.employee_card_fragment , container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageButton>(R.id.arrow).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, EmployeeCaptionFragment())
                .addToBackStack(null)
                .commit()
        }

        view.findViewById<ImageButton>(R.id.arrow2).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, AchievementFragment())
                .addToBackStack(null)
                .commit()
        }

        view.findViewById<ImageView>(R.id.vk_icon).setOnClickListener {
            val myWebLink = Intent(android.content.Intent.ACTION_VIEW)
            myWebLink.data = Uri.parse("https://vk.com/amaxasla_nomberone")
            startActivity(myWebLink)
        }
    }
}