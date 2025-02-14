package com.example.roompactice;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/example/roompactice/RecyclerAdaptor;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/roompactice/RecyclerAdaptor$Viewholder;", "list", "Ljava/util/ArrayList;", "Lcom/example/roompactice/NotesEntity;", "Lkotlin/collections/ArrayList;", "listinterface", "Lcom/example/roompactice/RecyclerAdaptor$Click;", "(Ljava/util/ArrayList;Lcom/example/roompactice/RecyclerAdaptor$Click;)V", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "getListinterface", "()Lcom/example/roompactice/RecyclerAdaptor$Click;", "setListinterface", "(Lcom/example/roompactice/RecyclerAdaptor$Click;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Click", "Viewholder", "app_debug"})
public final class RecyclerAdaptor extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.roompactice.RecyclerAdaptor.Viewholder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.roompactice.NotesEntity> list;
    @org.jetbrains.annotations.NotNull()
    private com.example.roompactice.RecyclerAdaptor.Click listinterface;
    
    public RecyclerAdaptor(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roompactice.NotesEntity> list, @org.jetbrains.annotations.NotNull()
    com.example.roompactice.RecyclerAdaptor.Click listinterface) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.roompactice.NotesEntity> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roompactice.NotesEntity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roompactice.RecyclerAdaptor.Click getListinterface() {
        return null;
    }
    
    public final void setListinterface(@org.jetbrains.annotations.NotNull()
    com.example.roompactice.RecyclerAdaptor.Click p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.roompactice.RecyclerAdaptor.Viewholder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.roompactice.RecyclerAdaptor.Viewholder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/roompactice/RecyclerAdaptor$Click;", "", "delete", "", "position", "", "update", "app_debug"})
    public static abstract interface Click {
        
        public abstract void update(int position);
        
        public abstract void delete(int position);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u000f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004\u00a8\u0006\u0015"}, d2 = {"Lcom/example/roompactice/RecyclerAdaptor$Viewholder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "name", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getName", "()Landroid/widget/TextView;", "setName", "(Landroid/widget/TextView;)V", "roll", "getRoll", "setRoll", "subject", "getSubject", "setSubject", "getView", "()Landroid/view/View;", "setView", "app_debug"})
    public static final class Viewholder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.view.View view;
        private android.widget.TextView roll;
        private android.widget.TextView name;
        private android.widget.TextView subject;
        
        public Viewholder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public final void setView(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public final android.widget.TextView getRoll() {
            return null;
        }
        
        public final void setRoll(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getName() {
            return null;
        }
        
        public final void setName(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getSubject() {
            return null;
        }
        
        public final void setSubject(android.widget.TextView p0) {
        }
    }
}