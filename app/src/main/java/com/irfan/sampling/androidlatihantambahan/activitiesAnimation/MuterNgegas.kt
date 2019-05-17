package com.irfan.sampling.androidlatihantambahan.activitiesAnimation

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import kotlin.system.exitProcess


/**
 *   created by Irfan Assidiq on 2019-05-17
 *   email : assidiq.irfan@gmail.com
 **/
class MuterNgegas  : BaseAnimationActivity(){
    override fun onStartAnimation() {
        val positionAnimator = ValueAnimator.ofFloat(0f, -screenHeight)

        positionAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
        }

        val rotationAnimator = ObjectAnimator.ofFloat(rocket,
            "rotation", 0f, 360f)
        val animatorSet = AnimatorSet()

        animatorSet.play(positionAnimator).with(rotationAnimator)
        animatorSet.duration = DEFAULT_ANIM_DURATION
        animatorSet.start()
    }
}