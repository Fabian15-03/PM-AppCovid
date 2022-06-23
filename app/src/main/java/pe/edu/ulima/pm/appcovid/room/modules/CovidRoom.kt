package pe.edu.ulima.pm.appcovid19.room.modules

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class CovidRoom(
    @PrimaryKey
    val id: Int,
    @ColumnInfo(name = "nombre")
    val nombre: String,
    @ColumnInfo(name = "terreno")
    val terreno: String,
    @ColumnInfo(name = "poblacion")
    val poblacion: String,
)