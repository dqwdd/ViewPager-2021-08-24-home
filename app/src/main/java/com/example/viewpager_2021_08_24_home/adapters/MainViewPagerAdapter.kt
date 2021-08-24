package com.example.viewpager_2021_08_24_home.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpager_2021_08_24_home.fragments.BirthYearFragment
import com.example.viewpager_2021_08_24_home.fragments.HelloFragment
import com.example.viewpager_2021_08_24_home.fragments.NameFragment

class MainViewPagerAdapter( fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
//        CharSequence==String임
        if (position==0) {
            return "인사"
        }
        if (position==1) {
            return "이름"
        }
        else {
            return "출생년도"
        }
    }




    override fun getCount(): Int {
//        TODO("Not yet implemented")
//        뷰페이저가 총 몇장인지(겟카운트니까)
//        return > 우린 3장이니 3
        return 3

    }
//TODO주석 있는 상태로 앱 키면 죽으니까 지워줘야 함
    override fun getItem(position: Int): Fragment {
//        TODO("Not yet implemented")
//        각각의 position에 어떤 Fragment가 배치되어야 하는가?
        if (position==0) {
            return HelloFragment()
        }
    if (position==1) {
        return NameFragment()
    }

    else {
        return BirthYearFragment()
    }
    }

}