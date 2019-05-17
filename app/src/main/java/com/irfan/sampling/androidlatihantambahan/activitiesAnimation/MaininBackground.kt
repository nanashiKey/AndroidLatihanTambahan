package com.irfan.sampling.androidlatihantambahan.activitiesAnimation

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.support.v4.content.ContextCompat
import com.irfan.sampling.androidlatihantambahan.R


/**
 *   created by Irfan Assidiq on 2019-05-17
 *   email : assidiq.irfan@gmail.com
 **/
class MaininBackground : BaseAnimationActivity(){
    override fun onStartAnimation() {
        val objAnimator = ObjectAnimator.ofObject(
            framelayout,
            "backgroundColor",
            ArgbEvaluator(),
            ContextCompat.getColor(this, R.color.background_from),
            ContextCompat.getColor(this, R.color.background_to)
        )

        objAnimator.repeatCount = 1
        objAnimator.repeatMode = ValueAnimator.REVERSE

        objAnimator.duration = DEFAULT_ANIM_DURATION
        objAnimator.start()
    }
}