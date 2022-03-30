package com.example.recyclerviewfortheclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewfortheclass.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\": \"Funny Video\", \"channel\": \"ChannelName\", \"views\": \"6k views\", \"dataPosted\": \"5 days ago\", \"duration\": \"05:00\"}"),
            JSONObject("{\"title\": \"Not Funny Video\", \"channel\": \"ChannelSurfing\", \"views\": \"8k views\", \"dataPosted\": \"few minutes ago\", \"duration\": \"15:00\"}"),
            JSONObject("{\"title\": \"Some Video\", \"channel\": \"ChannelNetflix\", \"views\": \"10k views\", \"dataPosted\": \"5 hours ago\", \"duration\": \"02:25\"}"),
            JSONObject("{\"title\": \"Tutorial Video\", \"channel\": \"ChannelFB\", \"views\": \"150k views\", \"dataPosted\": \"A month ago\", \"duration\": \"00:09\"}"),
            JSONObject("{\"title\": \"Don't see me\", \"channel\": \"ChannelHolo\", \"views\": \"234k views\", \"dataPosted\": \"Just now\", \"duration\": \"01:00\"}")

        )

        binding.rvVideoEntries.adapter = MainAdapter(fakeVideoData)
    }
}