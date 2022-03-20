package cn.flowkotlin

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

/**
 * Created by Lancet at 2022/3/19 22:27
 */

class WordRepository(private val wordDao: WordDao) {

    val allWords:Flow<List<Word>> = wordDao.getAlphabetizedWords()

    @Suppress("")
    @WorkerThread
    suspend fun insert(word: Word){
        wordDao.insert(word)
    }

}