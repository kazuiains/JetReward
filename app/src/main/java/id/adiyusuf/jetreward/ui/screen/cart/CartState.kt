package id.adiyusuf.jetreward.ui.screen.cart

import id.adiyusuf.jetreward.model.OrderReward

data class CartState(
    val orderReward: List<OrderReward>,
    val totalRequiredPoint: Int
)