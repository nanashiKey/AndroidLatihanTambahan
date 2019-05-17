package com.irfan.sampling.androidlatihantambahan.activitiesAnimation

import android.animation.ObjectAnimator


/**
 *   created by Irfan Assidiq on 2019-05-17
 *   email : assidiq.irfan@gmail.com
 **/
class LaunchRocketObject : BaseAnimationActivity() {
    override fun onStartAnimation() {
        val objAnimator = ObjectAnimator.ofFloat(rocket,
            "translationY", 0f, -screenHeight)

        objAnimator.duration = DEFAULT_ANIM_DURATION
        objAnimator.start()
    }
}