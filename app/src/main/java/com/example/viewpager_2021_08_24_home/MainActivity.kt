package com.example.viewpager_2021_08_24_home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager_2021_08_24_home.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mvpa = MainViewPagerAdapter( supportFragmentManager )
        mainViewPager.adapter = mvpa

//        탭 레이아웃과 뷰페이저 연동하는 기능 추가!
        mainTabLayout.setupWithViewPager(mainViewPager)


    }
}