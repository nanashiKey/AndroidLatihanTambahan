package com.irfan.sampling.androidlatihantambahan.activitiesAnimation

import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator
import kotlin.random.Random


/**
 *   created by Irfan Assidiq on 2019-05-17
 *   email : assidiq.irfan@gmail.com
 **/
class RocketMuter : BaseAnimationActivity(){
    override fun onStartAnimation() {
        val valueAnimator = ValueAnimator.ofFloat(0f, 360f)

        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.rotation = value
        }

        valueAnimator.interpolator = LinearInterpolator()
        valueAnimator.duration = DEFAULT_ANIM_DURATION
        valueAnimator.start()
    }
}