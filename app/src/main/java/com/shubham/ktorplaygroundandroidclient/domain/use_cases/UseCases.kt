package com.shubham.ktorplaygroundandroidclient.domain.use_cases

import com.shubham.ktorplaygroundandroidclient.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import com.shubham.ktorplaygroundandroidclient.domain.use_cases.save_onboarding.SaveOnBoardingUseCase


data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
)