package com.rujirakongsomran.meowbottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.widget.Toast
import androidx.fragment.app.Fragment
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
                    replaceFragment(HomeFragment.newInstance())
                }
                1 -> {
                    replaceFragment(ExploreFragment.newInstance())
                }
                2 -> {
                    replaceFragment(ChatFragment.newInstance())
                }
                3 -> {
                    replaceFragment(NotificationFragment.newInstance())
                }
                4 -> {
                    replaceFragment(UserFragment.newInstance())
                }
                else -> {
                    replaceFragment(HomeFragment.newInstance())
                }
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()

        fragmentTransition
            .replace(R.id.fragmentContainer, fragment)
            .addToBackStack(Fragment::class.java.simpleName).commit()
    }
}
