package pe.edu.ulima.pm.appcovid19.room.modules;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lpe/edu/ulima/pm/appcovid19/room/modules/CovidRoom;", "", "id", "", "fecha_corte", "departamento", "", "fecha_resultado", "(IILjava/lang/String;I)V", "getDepartamento", "()Ljava/lang/String;", "getFecha_corte", "()I", "getFecha_resultado", "getId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class CovidRoom {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    @androidx.room.ColumnInfo(name = "fecha_corte")
    private final int fecha_corte = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "departamento")
    private final java.lang.String departamento = null;
    @androidx.room.ColumnInfo(name = "fecha_resultado")
    private final int fecha_resultado = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final pe.edu.ulima.pm.appcovid19.room.modules.CovidRoom copy(int id, int fecha_corte, @org.jetbrains.annotations.NotNull()
    java.lang.String departamento, int fecha_resultado) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CovidRoom(int id, int fecha_corte, @org.jetbrains.annotations.NotNull()
    java.lang.String departamento, int fecha_resultado) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getFecha_corte() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDepartamento() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getFecha_resultado() {
        return 0;
    }
}