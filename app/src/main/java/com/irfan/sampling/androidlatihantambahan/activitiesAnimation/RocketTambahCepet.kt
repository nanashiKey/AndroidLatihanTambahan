package com.irfan.sampling.androidlatihantambahan.activitiesAnimation

import android.animation.ValueAnimator
import android.view.animation.AccelerateInterpolator
import android.view.animation.LinearInterpolator


/**
 *   created by Irfan Assidiq on 2019-05-17
 *   email : assidiq.irfan@gmail.com
 **/
class RocketTambahCepet : BaseAnimationActivity() {
    override fun onStartAnimation() {
        val valueAnimator = ValueAnimator.ofFloat(0f, -screenHeight)
        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float

            rocket.translationY = value
        }

        valueAnimator.interpolator = AccelerateInterpolator(2.5f)
        valueAnimator.duration = DEFAULT_ANIM_DURATION

        valueAnimator.start()
    }
}