package id.adiyusuf.jetreward.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.adiyusuf.jetreward.data.RewardRepository
import id.adiyusuf.jetreward.ui.screen.cart.CartViewModel
import id.adiyusuf.jetreward.ui.screen.detail.DetailRewardViewModel
import id.adiyusuf.jetreward.ui.screen.home.HomeViewModel

class ViewModelFactory(private val repository: RewardRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(DetailRewardViewModel::class.java)) {
            return DetailRewardViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(CartViewModel::class.java)) {
            return CartViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}