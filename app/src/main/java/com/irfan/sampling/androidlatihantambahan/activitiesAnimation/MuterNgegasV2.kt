package com.irfan.sampling.androidlatihantambahan.activitiesAnimation


/**
 *   created by Irfan Assidiq on 2019-05-17
 *   email : assidiq.irfan@gmail.com
 **/
class MuterNgegasV2 : BaseAnimationActivity() {
    override fun onStartAnimation() {
        rocket.animate()
            .translationY(-screenHeight)
            .rotationBy(360f)
            .setDuration(DEFAULT_ANIM_DURATION)
            .start()
    }
}