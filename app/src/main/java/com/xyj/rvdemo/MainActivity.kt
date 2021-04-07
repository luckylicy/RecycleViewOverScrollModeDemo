package com.xyj.rvdemo

import android.icu.lang.UCharacter.GraphemeClusterBreak.L
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.OverScroller
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.xyj.rvdemo.databinding.ActivityMainBinding

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


    }
}