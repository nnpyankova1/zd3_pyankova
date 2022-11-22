package com.example.myapplication

import androidx.lifecycle.ViewModel
import java.util.*

class CrimeListViewModel: ViewModel() {
    val crimes = mutableListOf<Crime>()
    lateinit var crime: Crime

    init{
        crime = Crime()
        val dateNow = Date()
        for(i in 1..100){
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = (i % 2 == 0)
            crime._requiresPolice = (i % 5 == 0)
            crime.date =dateNow
            crimes+=crime
        }
    }
}