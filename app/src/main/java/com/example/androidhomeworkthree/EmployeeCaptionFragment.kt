package com.example.androidhomeworkthree

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class EmployeeCaptionFragment : Fragment() {

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
        return inflater.inflate(R.layout.caption_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null) {
            setMockEmployee()
        }
    }

    private fun setMockEmployee() {
        val caption = requireView().findViewById<TextView>(R.id.caption_position)
        caption.text = employee.caption
        val userDescription = requireView().findViewById<TextView>(R.id.user_description)
        userDescription.text = employee.userDescription
    }

}