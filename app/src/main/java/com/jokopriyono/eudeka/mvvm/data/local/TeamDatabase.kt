package com.jokopriyono.eudeka.mvvm.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jokopriyono.eudeka.mvvm.model.TeamDetail

@Database(entities = [TeamDetail::class], version = 1)
abstract class TeamDatabase : RoomDatabase() {
    companion object {
        /*private lateinit var INSTANCE: TeamDatabase
        private val sLock = Object()

        fun getInstance(context: Context): TeamDatabase {
            synchronized(sLock) {
                INSTANCE?.let {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        TeamDatabase::class.java,
                        "Team.db"
                    ).build()
                }
                return INSTANCE
            }
        }*/
        private var INSTANCE: TeamDatabase? = null

        fun getInstance(context: Context): TeamDatabase? {
            if (INSTANCE == null) {
                synchronized(TeamDatabase::class) {
                    INSTANCE =
                        Room.databaseBuilder(context.applicationContext, TeamDatabase::class.java, "Team.db").build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }

    abstract fun teamDao(): TeamDao
}