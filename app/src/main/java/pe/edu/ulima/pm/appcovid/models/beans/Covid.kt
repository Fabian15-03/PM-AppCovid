package pe.edu.ulima.pm.appcovid.models.beans

data class Covid(
    val fecha_corte:String,
    val departamento:String,
    val provincia:String,
    val distrito:String,
    val metododx:String,
    val edad:Int,
    val sexo:String,
    val fecha_resultado:String,
    val ubigeo:String,
    val id_persona:Int
)