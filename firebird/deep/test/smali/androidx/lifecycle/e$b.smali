.class public Landroidx/lifecycle/e$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Landroidx/lifecycle/c$b;

.field public b:Landroidx/lifecycle/d;


# direct methods
.method public constructor <init>(Lm0/b;Landroidx/lifecycle/c$b;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lm0/e;->a:Ljava/util/Map;

    .line 1
    instance-of v0, p1, Landroidx/lifecycle/d;

    instance-of v1, p1, Lm0/a;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    new-instance v0, Landroidx/lifecycle/FullLifecycleObserverAdapter;

    move-object v1, p1

    check-cast v1, Lm0/a;

    check-cast p1, Landroidx/lifecycle/d;

    invoke-direct {v0, v1, p1}, Landroidx/lifecycle/FullLifecycleObserverAdapter;-><init>(Lm0/a;Landroidx/lifecycle/d;)V

    goto :goto_1

    :cond_0
    if-eqz v1, :cond_1

    new-instance v0, Landroidx/lifecycle/FullLifecycleObserverAdapter;

    check-cast p1, Lm0/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/FullLifecycleObserverAdapter;-><init>(Lm0/a;Landroidx/lifecycle/d;)V

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Landroidx/lifecycle/d;

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lm0/e;->c(Ljava/lang/Class;)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_5

    sget-object v1, Lm0/e;->b:Ljava/util/Map;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-static {v0, p1}, Lm0/e;->a(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/b;

    move-result-object p1

    new-instance v0, Landroidx/lifecycle/SingleGeneratedAdapterObserver;

    invoke-direct {v0, p1}, Landroidx/lifecycle/SingleGeneratedAdapterObserver;-><init>(Landroidx/lifecycle/b;)V

    goto :goto_1

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Landroidx/lifecycle/b;

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_4

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Constructor;

    invoke-static {v3, p1}, Lm0/e;->a(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/b;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    new-instance v0, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;

    invoke-direct {v0, v1}, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;-><init>([Landroidx/lifecycle/b;)V

    goto :goto_1

    :cond_5
    new-instance v0, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;

    invoke-direct {v0, p1}, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;-><init>(Ljava/lang/Object;)V

    .line 2
    :goto_1
    iput-object v0, p0, Landroidx/lifecycle/e$b;->b:Landroidx/lifecycle/d;

    iput-object p2, p0, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    return-void
.end method


# virtual methods
.method public a(Lm0/c;Landroidx/lifecycle/c$a;)V
    .locals 2

    invoke-static {p2}, Landroidx/lifecycle/e;->c(Landroidx/lifecycle/c$a;)Landroidx/lifecycle/c$b;

    move-result-object v0

    iget-object v1, p0, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    invoke-static {v1, v0}, Landroidx/lifecycle/e;->e(Landroidx/lifecycle/c$b;Landroidx/lifecycle/c$b;)Landroidx/lifecycle/c$b;

    move-result-object v1

    iput-object v1, p0, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    iget-object v1, p0, Landroidx/lifecycle/e$b;->b:Landroidx/lifecycle/d;

    invoke-interface {v1, p1, p2}, Landroidx/lifecycle/d;->c(Lm0/c;Landroidx/lifecycle/c$a;)V

    iput-object v0, p0, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    return-void
.end method
