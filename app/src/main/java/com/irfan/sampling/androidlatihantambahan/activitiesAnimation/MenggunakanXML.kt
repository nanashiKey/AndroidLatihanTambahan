package com.irfan.sampling.androidlatihantambahan.activitiesAnimation

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import com.irfan.sampling.androidlatihantambahan.R


/**
 *   created by Irfan Assidiq on 2019-05-17
 *   email : assidiq.irfan@gmail.com
 **/
class MenggunakanXML :BaseAnimationActivity() {
    override fun onStartAnimation() {
        val rocketAnim = AnimatorInflater.loadAnimator(this,
            R.animator.jump_blink) as AnimatorSet
        rocketAnim.setTarget(rocket)

        val dogeAnim = AnimatorInflater.loadAnimator(this,
            R.animator.jump_blink) as AnimatorSet
        dogeAnim.setTarget(doge)

        val bothAnimSet = AnimatorSet()
        bothAnimSet.playTogether(rocketAnim, dogeAnim)
        bothAnimSet.duration = DEFAULT_ANIM_DURATION
        bothAnimSet.start()
    }
}