package com.learn.mvvmapplication.mock

import com.learn.mvvmapplication.model.Article
import java.util.*

object ArticleMockHelper {

    val mockArticleData: List<Article>
        get() {
            val list = ArrayList<Article>()
            for (i in 0..20) {
                val article = Article()
                article.title = "Some random food talk"
                article.subtitle = "Eating outside is more fun"
                article.excerpt = "Choose meals that contain a balance of lean proteins (like fish, chicken, or beans if you're a vegetarian), fruits and vegetables (fries and potato chips don't qualify as veggies!), and whole grains (like whole-wheat bread and brown rice). That's why a turkey sandwich on whole wheat with lettuce and tomato is a better choice than a cheeseburger on a white bun."
                article.date = Date()

                list.add(article)
            }
            return list
        }
}
