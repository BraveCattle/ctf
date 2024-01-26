.class public Landroidx/lifecycle/e;
.super Landroidx/lifecycle/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/e$b;
    }
.end annotation


# instance fields
.field public a:Lj/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/a<",
            "Lm0/b;",
            "Landroidx/lifecycle/e$b;",
            ">;"
        }
    .end annotation
.end field

.field public b:Landroidx/lifecycle/c$b;

.field public final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lm0/c;",
            ">;"
        }
    .end annotation
.end field

.field public d:I

.field public e:Z

.field public f:Z

.field public g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/lifecycle/c$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm0/c;)V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/c;-><init>()V

    new-instance v0, Lj/a;

    invoke-direct {v0}, Lj/a;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/e;->a:Lj/a;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/e;->d:I

    iput-boolean v0, p0, Landroidx/lifecycle/e;->e:Z

    iput-boolean v0, p0, Landroidx/lifecycle/e;->f:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/e;->g:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/lifecycle/e;->c:Ljava/lang/ref/WeakReference;

    sget-object p1, Landroidx/lifecycle/c$b;->b:Landroidx/lifecycle/c$b;

    iput-object p1, p0, Landroidx/lifecycle/e;->b:Landroidx/lifecycle/c$b;

    return-void
.end method

.method public static c(Landroidx/lifecycle/c$a;)Landroidx/lifecycle/c$b;
    .locals 3

    sget-object v0, Landroidx/lifecycle/e$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected event value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p0, Landroidx/lifecycle/c$b;->a:Landroidx/lifecycle/c$b;

    return-object p0

    :pswitch_1
    sget-object p0, Landroidx/lifecycle/c$b;->e:Landroidx/lifecycle/c$b;

    return-object p0

    :pswitch_2
    sget-object p0, Landroidx/lifecycle/c$b;->d:Landroidx/lifecycle/c$b;

    return-object p0

    :pswitch_3
    sget-object p0, Landroidx/lifecycle/c$b;->c:Landroidx/lifecycle/c$b;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static e(Landroidx/lifecycle/c$b;Landroidx/lifecycle/c$b;)Landroidx/lifecycle/c$b;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_0

    move-object p0, p1

    :cond_0
    return-object p0
.end method

.method public static i(Landroidx/lifecycle/c$b;)Landroidx/lifecycle/c$a;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected state value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Landroidx/lifecycle/c$a;->ON_RESUME:Landroidx/lifecycle/c$a;

    return-object p0

    :cond_2
    sget-object p0, Landroidx/lifecycle/c$a;->ON_START:Landroidx/lifecycle/c$a;

    return-object p0

    :cond_3
    sget-object p0, Landroidx/lifecycle/c$a;->ON_CREATE:Landroidx/lifecycle/c$a;

    return-object p0
.end method


# virtual methods
.method public a(Lm0/b;)V
    .locals 6

    iget-object v0, p0, Landroidx/lifecycle/e;->b:Landroidx/lifecycle/c$b;

    sget-object v1, Landroidx/lifecycle/c$b;->a:Landroidx/lifecycle/c$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Landroidx/lifecycle/c$b;->b:Landroidx/lifecycle/c$b;

    :goto_0
    new-instance v0, Landroidx/lifecycle/e$b;

    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/e$b;-><init>(Lm0/b;Landroidx/lifecycle/c$b;)V

    iget-object v1, p0, Landroidx/lifecycle/e;->a:Lj/a;

    invoke-virtual {v1, p1, v0}, Lj/a;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/e$b;

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Landroidx/lifecycle/e;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/c;

    if-nez v1, :cond_2

    return-void

    :cond_2
    iget v2, p0, Landroidx/lifecycle/e;->d:I

    const/4 v3, 0x1

    if-nez v2, :cond_4

    iget-boolean v2, p0, Landroidx/lifecycle/e;->e:Z

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    move v2, v3

    :goto_2
    invoke-virtual {p0, p1}, Landroidx/lifecycle/e;->b(Lm0/b;)Landroidx/lifecycle/c$b;

    move-result-object v4

    iget v5, p0, Landroidx/lifecycle/e;->d:I

    add-int/2addr v5, v3

    iput v5, p0, Landroidx/lifecycle/e;->d:I

    :goto_3
    iget-object v5, v0, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    invoke-virtual {v5, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gez v4, :cond_5

    iget-object v4, p0, Landroidx/lifecycle/e;->a:Lj/a;

    .line 1
    iget-object v4, v4, Lj/a;->e:Ljava/util/HashMap;

    invoke-virtual {v4, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 2
    iget-object v4, v0, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    .line 3
    iget-object v5, p0, Landroidx/lifecycle/e;->g:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v4, v0, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    invoke-static {v4}, Landroidx/lifecycle/e;->i(Landroidx/lifecycle/c$b;)Landroidx/lifecycle/c$a;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Landroidx/lifecycle/e$b;->a(Lm0/c;Landroidx/lifecycle/c$a;)V

    invoke-virtual {p0}, Landroidx/lifecycle/e;->g()V

    invoke-virtual {p0, p1}, Landroidx/lifecycle/e;->b(Lm0/b;)Landroidx/lifecycle/c$b;

    move-result-object v4

    goto :goto_3

    :cond_5
    if-nez v2, :cond_6

    invoke-virtual {p0}, Landroidx/lifecycle/e;->h()V

    :cond_6
    iget p1, p0, Landroidx/lifecycle/e;->d:I

    sub-int/2addr p1, v3

    iput p1, p0, Landroidx/lifecycle/e;->d:I

    return-void
.end method

.method public final b(Lm0/b;)Landroidx/lifecycle/c$b;
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/e;->a:Lj/a;

    .line 1
    iget-object v1, v0, Lj/a;->e:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 2
    iget-object v0, v0, Lj/a;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj/b$c;

    iget-object p1, p1, Lj/b$c;->d:Lj/b$c;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p1, Lj/b$c;->b:Ljava/lang/Object;

    .line 4
    check-cast p1, Landroidx/lifecycle/e$b;

    iget-object p1, p1, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    goto :goto_1

    :cond_1
    move-object p1, v2

    :goto_1
    iget-object v0, p0, Landroidx/lifecycle/e;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/lifecycle/e;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/lifecycle/c$b;

    :cond_2
    iget-object v0, p0, Landroidx/lifecycle/e;->b:Landroidx/lifecycle/c$b;

    invoke-static {v0, p1}, Landroidx/lifecycle/e;->e(Landroidx/lifecycle/c$b;Landroidx/lifecycle/c$b;)Landroidx/lifecycle/c$b;

    move-result-object p1

    invoke-static {p1, v2}, Landroidx/lifecycle/e;->e(Landroidx/lifecycle/c$b;Landroidx/lifecycle/c$b;)Landroidx/lifecycle/c$b;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroidx/lifecycle/c$a;)V
    .locals 0

    invoke-static {p1}, Landroidx/lifecycle/e;->c(Landroidx/lifecycle/c$a;)Landroidx/lifecycle/c$b;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/e;->f(Landroidx/lifecycle/c$b;)V

    return-void
.end method

.method public final f(Landroidx/lifecycle/c$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/e;->b:Landroidx/lifecycle/c$b;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Landroidx/lifecycle/e;->b:Landroidx/lifecycle/c$b;

    iget-boolean p1, p0, Landroidx/lifecycle/e;->e:Z

    const/4 v0, 0x1

    if-nez p1, :cond_2

    iget p1, p0, Landroidx/lifecycle/e;->d:I

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iput-boolean v0, p0, Landroidx/lifecycle/e;->e:Z

    invoke-virtual {p0}, Landroidx/lifecycle/e;->h()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/lifecycle/e;->e:Z

    return-void

    :cond_2
    :goto_0
    iput-boolean v0, p0, Landroidx/lifecycle/e;->f:Z

    return-void
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/e;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public final h()V
    .locals 8

    iget-object v0, p0, Landroidx/lifecycle/e;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/c;

    if-eqz v0, :cond_c

    .line 1
    :cond_0
    iget-object v1, p0, Landroidx/lifecycle/e;->a:Lj/a;

    .line 2
    iget v2, v1, Lj/b;->d:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    iget-object v2, v1, Lj/b;->a:Lj/b$c;

    .line 4
    iget-object v2, v2, Lj/b$c;->b:Ljava/lang/Object;

    .line 5
    check-cast v2, Landroidx/lifecycle/e$b;

    iget-object v2, v2, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    .line 6
    iget-object v5, v1, Lj/b;->b:Lj/b$c;

    .line 7
    iget-object v5, v5, Lj/b$c;->b:Ljava/lang/Object;

    .line 8
    check-cast v5, Landroidx/lifecycle/e$b;

    iget-object v5, v5, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    if-ne v2, v5, :cond_2

    iget-object v2, p0, Landroidx/lifecycle/e;->b:Landroidx/lifecycle/c$b;

    if-ne v2, v5, :cond_2

    :goto_0
    move v2, v3

    goto :goto_1

    :cond_2
    move v2, v4

    .line 9
    :goto_1
    iput-boolean v4, p0, Landroidx/lifecycle/e;->f:Z

    if-nez v2, :cond_b

    iget-object v2, p0, Landroidx/lifecycle/e;->b:Landroidx/lifecycle/c$b;

    .line 10
    iget-object v1, v1, Lj/b;->a:Lj/b$c;

    .line 11
    iget-object v1, v1, Lj/b$c;->b:Ljava/lang/Object;

    .line 12
    check-cast v1, Landroidx/lifecycle/e$b;

    iget-object v1, v1, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_9

    .line 13
    iget-object v1, p0, Landroidx/lifecycle/e;->a:Lj/a;

    .line 14
    new-instance v2, Lj/b$b;

    iget-object v4, v1, Lj/b;->b:Lj/b$c;

    iget-object v5, v1, Lj/b;->a:Lj/b$c;

    invoke-direct {v2, v4, v5}, Lj/b$b;-><init>(Lj/b$c;Lj/b$c;)V

    iget-object v1, v1, Lj/b;->c:Ljava/util/WeakHashMap;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    :cond_3
    invoke-virtual {v2}, Lj/b$e;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-boolean v1, p0, Landroidx/lifecycle/e;->f:Z

    if-nez v1, :cond_9

    invoke-virtual {v2}, Lj/b$e;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/e$b;

    :goto_2
    iget-object v5, v4, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    iget-object v6, p0, Landroidx/lifecycle/e;->b:Landroidx/lifecycle/c$b;

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-lez v5, :cond_3

    iget-boolean v5, p0, Landroidx/lifecycle/e;->f:Z

    if-nez v5, :cond_3

    iget-object v5, p0, Landroidx/lifecycle/e;->a:Lj/a;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Lj/a;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v5, v4, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    .line 16
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_8

    if-eq v6, v3, :cond_7

    const/4 v7, 0x2

    if-eq v6, v7, :cond_6

    const/4 v7, 0x3

    if-eq v6, v7, :cond_5

    const/4 v7, 0x4

    if-ne v6, v7, :cond_4

    sget-object v5, Landroidx/lifecycle/c$a;->ON_PAUSE:Landroidx/lifecycle/c$a;

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected state value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    sget-object v5, Landroidx/lifecycle/c$a;->ON_STOP:Landroidx/lifecycle/c$a;

    goto :goto_3

    :cond_6
    sget-object v5, Landroidx/lifecycle/c$a;->ON_DESTROY:Landroidx/lifecycle/c$a;

    .line 17
    :goto_3
    invoke-static {v5}, Landroidx/lifecycle/e;->c(Landroidx/lifecycle/c$a;)Landroidx/lifecycle/c$b;

    move-result-object v6

    .line 18
    iget-object v7, p0, Landroidx/lifecycle/e;->g:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    invoke-virtual {v4, v0, v5}, Landroidx/lifecycle/e$b;->a(Lm0/c;Landroidx/lifecycle/c$a;)V

    invoke-virtual {p0}, Landroidx/lifecycle/e;->g()V

    goto :goto_2

    .line 20
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 21
    :cond_9
    iget-object v1, p0, Landroidx/lifecycle/e;->a:Lj/a;

    .line 22
    iget-object v1, v1, Lj/b;->b:Lj/b$c;

    .line 23
    iget-boolean v2, p0, Landroidx/lifecycle/e;->f:Z

    if-nez v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, Landroidx/lifecycle/e;->b:Landroidx/lifecycle/c$b;

    .line 24
    iget-object v1, v1, Lj/b$c;->b:Ljava/lang/Object;

    .line 25
    check-cast v1, Landroidx/lifecycle/e$b;

    iget-object v1, v1, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_0

    .line 26
    iget-object v1, p0, Landroidx/lifecycle/e;->a:Lj/a;

    invoke-virtual {v1}, Lj/b;->b()Lj/b$d;

    move-result-object v1

    :cond_a
    invoke-virtual {v1}, Lj/b$d;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Landroidx/lifecycle/e;->f:Z

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lj/b$d;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/lifecycle/e$b;

    :goto_4
    iget-object v4, v3, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    iget-object v5, p0, Landroidx/lifecycle/e;->b:Landroidx/lifecycle/c$b;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gez v4, :cond_a

    iget-boolean v4, p0, Landroidx/lifecycle/e;->f:Z

    if-nez v4, :cond_a

    iget-object v4, p0, Landroidx/lifecycle/e;->a:Lj/a;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Lj/a;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    iget-object v4, v3, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    .line 27
    iget-object v5, p0, Landroidx/lifecycle/e;->g:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    iget-object v4, v3, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/c$b;

    invoke-static {v4}, Landroidx/lifecycle/e;->i(Landroidx/lifecycle/c$b;)Landroidx/lifecycle/c$a;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Landroidx/lifecycle/e$b;->a(Lm0/c;Landroidx/lifecycle/c$a;)V

    invoke-virtual {p0}, Landroidx/lifecycle/e;->g()V

    goto :goto_4

    :cond_b
    return-void

    .line 29
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
