package com.irfan.sampling.androidlatihantambahan.activitiesAnimation

import android.animation.ValueAnimator


/**
 *   created by Irfan Assidiq on 2019-05-17
 *   email : assidiq.irfan@gmail.com
 **/
class MajuMundurCantik : BaseAnimationActivity() {
    override fun onStartAnimation() {
        val animator = ValueAnimator.ofFloat(0f, -screenHeight)
        animator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
            doge.translationY = value
        }

        animator.repeatMode = ValueAnimator.REVERSE
        animator.repeatCount = 5
        animator.duration = 100L
        animator.start()
    }
}