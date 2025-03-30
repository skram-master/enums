package com.skram_master.enums.room

import kotlinx.serialization.Serializable

@Serializable
enum class RoomStatus {
    Voting,
    Result,
}
