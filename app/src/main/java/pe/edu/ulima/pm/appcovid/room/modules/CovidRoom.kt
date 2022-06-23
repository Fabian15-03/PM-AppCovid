package pe.edu.ulima.pm.appcovid19.room.modules

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class CovidRoom (
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    @ColumnInfo(name = "fecha_corte")
    val fecha_corte : String,
    @ColumnInfo(name = "departamento")
    val departamento : String
)