package com.shubham.ktorplaygroundandroidclient.domain.use_cases.save_onboarding

import com.shubham.ktorplaygroundandroidclient.data.repository.Repository


class SaveOnBoardingUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(completed: Boolean) {
        repository.saveOnBoardingState(completed = completed)
    }
}