package com.example.footballmemory

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView

class FaqActivity : AppCompatActivity() {

    private lateinit var tvFaq : TextView
    private lateinit var btnBack : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq)

        btnBack = findViewById(R.id.btnBack)
        tvFaq = findViewById(R.id.tvFaq)
        val toolbar: Toolbar = findViewById(R.id.toolbar)

        val faqContent = listOf(
            "Q1: What is a memory game app?",
            "A1:A memory game app is a digital version of the classic memory card game designed for mobile devices. It challenges players to match pairs of cards to test and enhance memory skills.",
            "Q2: How do I play the memory game?",
            "A2: The game usually begins with all cards face down. Players take turns flipping two cards, trying to find matching pairs. If successful, they keep the pair and take another turn. The goal is to match all pairs.",
            "Q3: How can I make a memory game more challenging?",
            "A3: You can increase the difficulty by using more cards",
            "Q4: How can I create my own memory game?",
            "A4: You can upload your own images from the phone and set as the cards. "

            )
        tvFaq.text = faqContent.joinToString("\n\n")

        btnBack.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


}