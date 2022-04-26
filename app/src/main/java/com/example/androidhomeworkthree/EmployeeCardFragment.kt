package com.example.androidhomeworkthree

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class EmployeeCardFragment : Fragment() {

    private val employee = Employee(
        "Смурыгин Роман Ильич",
        R.drawable.avatar,
        "Ведущий инженер-программист (3 категории, моб.)",
        "Разработка/Розница, Presto и Салон красоты/Мобильные розница, Presto и Склад/Мобильная розница и Presto/менеджер продукта: Карасев И./Розница Android",
        "Телефонный номер: +79997860574",
        "https://vk.com/amaxasla_nomberone"
    )

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

        if (savedInstanceState == null) {
            setMockEmployee()
        }
    }

    private fun setMockEmployee() {
        val fullname = requireView().findViewById<TextView>(R.id.caption_full_name)
        fullname.text = employee.fullname
        val photo = requireView().findViewById<ImageView>(R.id.user_avatar)
        photo.setImageResource(employee.photoUrl)
        val caption = requireView().findViewById<TextView>(R.id.caption_position)
        caption.text = employee.caption
        val userDescription = requireView().findViewById<TextView>(R.id.user_description)
        userDescription.text = employee.userDescription
        val phone = requireView().findViewById<TextView>(R.id.phone_number)
        phone.text = employee.phone
    }

    private fun loadPage() {
        val socialMedia = requireView().findViewById<TextView>(R.id.social_media)
        socialMedia.text = employee.socialMedia

        val myWebLink = Intent(android.content.Intent.ACTION_VIEW)
        myWebLink.data = Uri.parse(socialMedia.toString())
        startActivity(myWebLink)
    }
}