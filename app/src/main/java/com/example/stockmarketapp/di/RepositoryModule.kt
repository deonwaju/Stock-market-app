package com.example.stockmarketapp.di

import com.example.stockmarketapp.data.csv.CompanyListingsParser
import com.example.stockmarketapp.data.csv.ICSVParser
import com.example.stockmarketapp.data.repo.StockRepositoryImpl
import com.example.stockmarketapp.domain.model.CompanyListing
import com.example.stockmarketapp.domain.repository.IStockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
//
//    @Binds
//    @Singleton
//    abstract fun bindCompanyListingsParser(
//        companyListingsParser: CompanyListingsParser
//    ): ICSVParser<CompanyListing>
//
////    @Binds
////    @Singleton
////    abstract fun bindIntradayInfoParser(
////        intradayInfoParser: IntradayInfoParser
////    ): CSVParser<IntradayInfo>
//
//    @Binds
//    @Singleton
//    abstract fun bindStockRepository(
//        stockRepositoryImpl: StockRepositoryImpl
//    ): IStockRepository
}