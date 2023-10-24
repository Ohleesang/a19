package com.example.a19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(n: Long): Long {
                var result = sqrt(n.toDouble())
                var answer = result-result.toLong()
                if(answer==0.0) {
                    var x = result.toLong()+1
                    return x*x
                }
                else return -1
            }
        }
        val a = Solution()
        a.solution(121)
        a.solution(3)
    }

}