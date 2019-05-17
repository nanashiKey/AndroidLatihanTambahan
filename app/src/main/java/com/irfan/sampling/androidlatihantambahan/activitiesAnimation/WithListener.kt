package com.irfan.sampling.androidlatihantambahan.activitiesAnimation

import android.animation.Animator
import android.animation.ValueAnimator
import android.widget.Toast


/**
 *   created by Irfan Assidiq on 2019-05-17
 *   email : assidiq.irfan@gmail.com
 **/
class WithListener : BaseAnimationActivity() {
    override fun onStartAnimation() {
        val animator = ValueAnimator.ofFloat(0f, -screenHeight)
        animator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
            doge.translationY = value
        }

        animator.addListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator?) {
                Toast.makeText(applicationContext, "Doge Berangkat",
                    Toast.LENGTH_SHORT).show()
            }
            override fun onAnimationEnd(p0: Animator?) {
                Toast.makeText(applicationContext, "Doge dah sampe",
                    Toast.LENGTH_SHORT).show()
                finish()
            }
            //note use
            override fun onAnimationCancel(p0: Animator?) {}
            override fun onAnimationRepeat(p0: Animator?) {}
        })
        animator.duration = 5000L
        animator.start()
    }
}