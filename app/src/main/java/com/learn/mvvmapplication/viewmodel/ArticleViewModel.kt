package com.learn.mvvmapplication.viewmodel

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.learn.mvvmapplication.BR
import com.learn.mvvmapplication.model.Article
import java.text.SimpleDateFormat
import java.util.*

class ArticleViewModel(private val mArticle: Article) : BaseObservable() {

    var title: String?
        @Bindable
        get() = mArticle.title
        set(title) {
            mArticle.title = title
            notifyPropertyChanged(BR.title)
        }

    var subtitle: String?
        @Bindable
        get() = mArticle.subtitle
        set(subtitle) {
            mArticle.subtitle = subtitle
            notifyPropertyChanged(BR.subtitle)
        }

    var excerpt: String?
        @Bindable
        get() = mArticle.excerpt
        set(excerpt) {
            mArticle.excerpt = excerpt
            notifyPropertyChanged(BR.excerpt)
        }

    val formattedDate: String
        @Bindable
        get() {
            val sdf = SimpleDateFormat("EEE, d MMM yyyy HH:mm", Locale.getDefault())
            return sdf.format(mArticle.date)
        }

    fun setDate(date: Date) {
        mArticle.date = date
        notifyPropertyChanged(BR.formattedDate)
    }
}
