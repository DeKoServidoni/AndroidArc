package com.github.dekoservidoni.androidarc.dagger.modules

import com.github.dekoservidoni.androidarc.view.activities.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = arrayOf(FragmentModule::class))
    abstract fun bindMainActivity(): MainActivity
}