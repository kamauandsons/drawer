package com.example.chege

import android.content.Context
import android.media.*
import android.media.MediaPlayer.create
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.chege.R.raw.kiawala
import com.example.chege.databinding.ActivityMainBinding
import timber.log.Timber


class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout:DrawerLayout
    private lateinit var binding: ActivityMainBinding
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        Timber.plant(Timber.DebugTree())
        Timber.i("on create called")
        binding=DataBindingUtil.setContentView(this, R.layout.activity_main)
        drawerLayout=binding.drawerLayout

        val navController=this.findNavController(R.id.nvh)
        NavigationUI.setupActionBarWithNavController(this,navController,drawerLayout)
        NavigationUI.setupWithNavController(binding.navd, navController)




    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.nvh)
        return NavigationUI.navigateUp(navController,drawerLayout)
    }

    override fun onStart() {
        super.onStart()
        Timber.i("onstart called")
        mediaPlayer = MediaPlayer.create(applicationContext,R.raw.kiawala)
        mediaPlayer.start()


    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("onrestart called")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onresume called")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onpause called")
        mediaPlayer.pause()
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onstop called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("ondestroy called")
        mediaPlayer.release()
    }



}
