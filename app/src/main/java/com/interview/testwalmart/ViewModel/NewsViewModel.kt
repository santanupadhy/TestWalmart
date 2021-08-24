package com.interview.testwalmart.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations.map
import com.interview.testwalmart.Data.Model.ArticlesItem
import com.interview.testwalmart.Data.Model.GetNewsList
import com.interview.testwalmart.Repository.Reporsitory
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.http.QueryMap

class NewsViewModel : BaseViewModel() {

    private val repostiory = Reporsitory()

    private val mutablePhotosListLiveData = MutableLiveData<List<ArticlesItem>>()
    val photosListLiveData: LiveData<List<ArticlesItem>> = mutablePhotosListLiveData

    fun getNewsList() {
        compositeDisposable.add(repostiory.getNewsList(mapOf(
            "county" to "us",
            "apiKey" to "50c1bd99f6464242aab6405aa2ca35a5"
        ))
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .doOnSubscribe {

            }
            .subscribe({
                mutablePhotosListLiveData.value = it.articles

            }, {

            })
        )


    }

    init {
        getNewsList()
    }
}