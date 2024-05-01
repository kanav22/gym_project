package com.wadhawan.mcp.gymsharkhomework.data

import CDNRepository
import com.wadhawan.mcp.gymsharkhomework.data.product.ProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


// Module providing dependencies for repositories
@Module
// Scoped to ViewModel lifecycle
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    // Provide ProductRepository dependency
    @Provides
    fun provideProductRepository(): ProductRepository = CDNRepository() //MockProductRepository()


}