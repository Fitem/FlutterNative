package com.fitem.flutternative

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fitem.flutternative.databinding.ActivityMainBinding
import io.flutter.embedding.android.FlutterActivity

/**
 * Name: 首页
 * Created by leiguangwu on 2023/7/3
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        // 跳转到Flutter页面
        binding.button.setOnClickListener {
            startActivity(FlutterActivity.withCachedEngine("my_engine_id").build(this))
        }
    }

}