package com.example.ui_main

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ui_main.R
import com.google.android.material.tabs.TabLayout

class Sub1Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub1)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when (tab.position) {
                    0 -> {
                        val intent = Intent(this@Sub1Activity, MainActivity::class.java)
                        startActivity(intent)
                    }
                    1 -> {
                        recreate()
                    }
                    2 -> {
                        // "서브 2" 탭이 선택되었을 때 다른 액티비티로 이동 (예: Sub2Activity)
                        val intent = Intent(this@Sub1Activity, Sub2Activity::class.java)
                        startActivity(intent)
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                // 선택 해제 시 처리할 내용
            }

            override fun onTabReselected(tab: TabLayout.Tab) {
                // 다시 선택 시 처리할 내용
            }
        })
    }
}
