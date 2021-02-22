package com.learn.mvvmapplication.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView

import com.learn.mvvmapplication.R
import com.learn.mvvmapplication.databinding.RowArticleBinding
import com.learn.mvvmapplication.model.Article
import com.learn.mvvmapplication.viewmodel.ArticleViewModel

class ArticleAdapter(private val mArticles: List<Article>) :
    RecyclerView.Adapter<ArticleAdapter.BindingHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingHolder {
        val binding = DataBindingUtil.inflate<RowArticleBinding>(
            LayoutInflater.from(parent.context),
            R.layout.row_article, parent, false
        )
        return BindingHolder(binding)
    }

    override fun onBindViewHolder(holder: BindingHolder, position: Int) {
        val binding = holder.binding
        binding.avm = ArticleViewModel(mArticles[position])
    }

    override fun getItemCount(): Int {
        return mArticles.size
    }

    class BindingHolder(val binding: RowArticleBinding) :
        RecyclerView.ViewHolder(binding.mainLayout)
}
