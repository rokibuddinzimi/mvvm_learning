package com.learn.mvvmapplication.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.learn.mvvmapplication.R
import com.learn.mvvmapplication.databinding.ActivityMainBinding
import com.learn.mvvmapplication.mock.ArticleMockHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val layoutManager = LinearLayoutManager(this)
        binding.contactList.layoutManager = layoutManager

        val articles = ArticleMockHelper.mockArticleData

        val adapter = ArticleAdapter(articles)
        binding.contactList.adapter = adapter
    }
}
