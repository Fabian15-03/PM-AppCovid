package pe.edu.ulima.pm.appcovid19.room.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\f"}, d2 = {"Lpe/edu/ulima/pm/appcovid19/room/dao/CovidRoomDAO;", "", "delete", "", "planeta", "Lpe/edu/ulima/pm/appcovid19/room/modules/CovidRoom;", "findById", "id", "", "getAll", "", "insert", "app_debug"})
public abstract interface CovidRoomDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM CovidRoom")
    public abstract java.util.List<pe.edu.ulima.pm.appcovid19.room.modules.CovidRoom> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Covidroom WHERE id=:id")
    public abstract pe.edu.ulima.pm.appcovid19.room.modules.CovidRoom findById(int id);
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    pe.edu.ulima.pm.appcovid19.room.modules.CovidRoom planeta);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    pe.edu.ulima.pm.appcovid19.room.modules.CovidRoom planeta);
}