package com.example.roompactice;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/roompactice/NotesInterface;", "", "add", "", "notesEntity", "Lcom/example/roompactice/NotesEntity;", "delete", "get", "", "update", "id", "", "title", "", "description", "app_debug"})
@androidx.room.Dao()
public abstract interface NotesInterface {
    
    @androidx.room.Insert()
    public abstract void add(@org.jetbrains.annotations.NotNull()
    com.example.roompactice.NotesEntity notesEntity);
    
    @androidx.room.Query(value = "SELECT * FROM NotesEntity")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.roompactice.NotesEntity> get();
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.roompactice.NotesEntity notesEntity);
    
    @androidx.room.Query(value = "UPDATE NotesEntity SET title=(:title),description=(:description) WHERE id=(:id)")
    public abstract void update(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description);
}