package com.example.roompactice;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0006\u0010\r\u001a\u00020\u001eJ\u0012\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006%"}, d2 = {"Lcom/example/roompactice/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/roompactice/RecyclerAdaptor$Click;", "()V", "binding", "Lcom/example/roompactice/databinding/ActivityMainBinding;", "getBinding", "()Lcom/example/roompactice/databinding/ActivityMainBinding;", "setBinding", "(Lcom/example/roompactice/databinding/ActivityMainBinding;)V", "list", "Ljava/util/ArrayList;", "Lcom/example/roompactice/NotesEntity;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "notesDatabase", "Lcom/example/roompactice/NotesDatabase;", "getNotesDatabase", "()Lcom/example/roompactice/NotesDatabase;", "setNotesDatabase", "(Lcom/example/roompactice/NotesDatabase;)V", "recyclerAdaptor", "Lcom/example/roompactice/RecyclerAdaptor;", "getRecyclerAdaptor", "()Lcom/example/roompactice/RecyclerAdaptor;", "setRecyclerAdaptor", "(Lcom/example/roompactice/RecyclerAdaptor;)V", "delete", "", "position", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "update", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.roompactice.RecyclerAdaptor.Click {
    public com.example.roompactice.databinding.ActivityMainBinding binding;
    public com.example.roompactice.RecyclerAdaptor recyclerAdaptor;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.roompactice.NotesEntity> list;
    public com.example.roompactice.NotesDatabase notesDatabase;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roompactice.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.roompactice.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roompactice.RecyclerAdaptor getRecyclerAdaptor() {
        return null;
    }
    
    public final void setRecyclerAdaptor(@org.jetbrains.annotations.NotNull()
    com.example.roompactice.RecyclerAdaptor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.roompactice.NotesEntity> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roompactice.NotesEntity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roompactice.NotesDatabase getNotesDatabase() {
        return null;
    }
    
    public final void setNotesDatabase(@org.jetbrains.annotations.NotNull()
    com.example.roompactice.NotesDatabase p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void update(int position) {
    }
    
    @java.lang.Override()
    public void delete(int position) {
    }
    
    public final void getList() {
    }
}