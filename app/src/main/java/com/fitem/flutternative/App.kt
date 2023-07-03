package com.fitem.flutternative

import android.app.Application
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor

/**
 * Name: Application
 * Created by leiguangwu on 2023/7/3
 */
class App : Application() {

    // 初始化Flutter引擎
    private val flutterEngine by lazy {
        FlutterEngine(this).apply {
            dartExecutor.executeDartEntrypoint(DartExecutor.DartEntrypoint.createDefault())
        }
    }

    override fun onCreate() {
        super.onCreate()
        // 缓存Flutter引擎
        FlutterEngineCache.getInstance().put("my_engine_id", flutterEngine)
    }

    override fun onTerminate() {
        super.onTerminate()
        flutterEngine.destroy()
    }
}