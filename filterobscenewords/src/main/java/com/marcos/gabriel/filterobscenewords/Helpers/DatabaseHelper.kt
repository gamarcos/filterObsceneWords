package com.marcos.gabriel.filterobscenewords.Helpers

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

/**
 * Created by gabri on 13/03/2018.
 */
class DatabaseHelper {
    private val DATABASE_NAME = "obscene"

    var censoredWords: ArrayList<String>? = null

    init {
        val databaseReference = FirebaseDatabase.getInstance().getReference(DATABASE_NAME)
        databaseReference.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                censoredWords = arrayToUpperCase(dataSnapshot.value as? ArrayList<String>)
            }
            override fun onCancelled(error: DatabaseError) {}
        })
    }

    fun hasObsceneWords(text: String): Boolean {
        val words = text.split("[\\p{Punct}\\s]+".toRegex())
        for (word in words) {
            censoredWords.let {
                if (censoredWords!!.contains(word.toUpperCase())) {
                    return true
                }
            }
        }
        return false
    }

    private fun arrayToUpperCase(list: ArrayList<String>?): ArrayList<String> {
        val upperList = ArrayList<String>()
        list?.forEach { upperList.add(it.toUpperCase()) }
        return upperList
    }
}