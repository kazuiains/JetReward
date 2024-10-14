package id.adiyusuf.jetreward.di

import id.adiyusuf.jetreward.data.RewardRepository


object Injection {
    fun provideRepository(): RewardRepository {
        return RewardRepository.getInstance()
    }
}