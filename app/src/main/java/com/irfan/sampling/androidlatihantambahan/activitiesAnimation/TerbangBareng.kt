package com.irfan.sampling.androidlatihantambahan.activitiesAnimation

import android.animation.AnimatorSet
import android.animation.ValueAnimator


/**
 *   created by Irfan Assidiq on 2019-05-17
 *   email : assidiq.irfan@gmail.com
 **/
class TerbangBareng : BaseAnimationActivity(){
    override fun onStartAnimation() {
        val positionAnimator = ValueAnimator.ofFloat(0f, -screenHeight)
        positionAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
            doge.translationY = value
        }

        val rotationAnimator = ValueAnimator.ofFloat(0f, 360f)
        rotationAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            doge.rotation = value
        }

        val animatorSet = AnimatorSet()
        animatorSet.play(positionAnimator).with(rotationAnimator)
        animatorSet.duration = DEFAULT_ANIM_DURATION
        animatorSet.start()

    }
}