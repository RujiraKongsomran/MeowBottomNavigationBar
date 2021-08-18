package com.rujirakongsomran.meowbottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.rujirakongsomran.meowbottomnavigationbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.mbn.add(MeowBottomNavigation.Model(0, R.drawable.ic_home))
        binding.mbn.add(MeowBottomNavigation.Model(1, R.drawable.ic_explore))
        binding.mbn.add(MeowBottomNavigation.Model(2, R.drawable.ic_chat))
        binding.mbn.add(MeowBottomNavigation.Model(3, R.drawable.ic_notifications))
        binding.mbn.add(MeowBottomNavigation.Model(4, R.drawable.ic_user))

        binding.mbn.setOnClickMenuListener {
            when (it.id) {
                0 -> {
                    Toast.makeText(
                        applicationContext,
                        "Home Fragment",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                1 -> {
                    Toast.makeText(
                        applicationContext,
                        "Explore Fragment",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                2 -> {
                    Toast.makeText(
                        applicationContext,
                        "Chat Fragment",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                3 -> {
                    Toast.makeText(
                        applicationContext,
                        "Notification Fragment",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                4 -> {
                    Toast.makeText(
                        applicationContext,
                        "User Fragment",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                else -> {
                    Toast.makeText(
                        applicationContext,
                        "Home Fragment",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}