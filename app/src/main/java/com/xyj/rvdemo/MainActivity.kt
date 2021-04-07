package com.xyj.rvdemo

import android.content.Intent
import android.content.res.Configuration
import android.icu.lang.UCharacter.GraphemeClusterBreak.L
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.OverScroller
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.xyj.rvdemo.databinding.ActivityMainBinding
import me.jessyan.autosize.AutoSize

class MainActivity : AppCompatActivity() {

    private val mContext by lazy { this }

    private lateinit var mDataBinding: ActivityMainBinding
    private lateinit var mRvAdapter: RvAdapter
    private lateinit var mData: MutableList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        mDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        mData = mutableListOf()
        for (i in 10 until 20) {
            mData.add(i.toString())
        }
        mRvAdapter = RvAdapter(mData)

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            mDataBinding.rv.overScrollMode = View.OVER_SCROLL_NEVER
//        }

        mDataBinding.rv.layoutManager = LinearLayoutManager(mContext)
        mDataBinding.rv.adapter = mRvAdapter

        mDataBinding.title.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        mDataBinding.btnDay.setOnClickListener {
            delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_NO
        }

        mDataBinding.btnNight.setOnClickListener {
            delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_YES
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
//        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            AutoSize.autoConvertDensityOfGlobal(this)
//        }
    }
}