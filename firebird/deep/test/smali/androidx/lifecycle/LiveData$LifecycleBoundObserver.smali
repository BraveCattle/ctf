.class public Landroidx/lifecycle/LiveData$LifecycleBoundObserver;
.super Landroidx/lifecycle/LiveData$a;
.source ""

# interfaces
.implements Landroidx/lifecycle/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/LiveData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LifecycleBoundObserver"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/lifecycle/LiveData<",
        "TT;>.a;"
    }
.end annotation


# instance fields
.field public final e:Lm0/c;

.field public final synthetic f:Landroidx/lifecycle/LiveData;


# virtual methods
.method public c(Lm0/c;Landroidx/lifecycle/c$a;)V
    .locals 0

    iget-object p1, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->e:Lm0/c;

    invoke-interface {p1}, Lm0/c;->a()Landroidx/lifecycle/c;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/e;

    .line 1
    iget-object p1, p1, Landroidx/lifecycle/e;->b:Landroidx/lifecycle/c$b;

    .line 2
    sget-object p2, Landroidx/lifecycle/c$b;->a:Landroidx/lifecycle/c$b;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->f:Landroidx/lifecycle/LiveData;

    iget-object p2, p0, Landroidx/lifecycle/LiveData$a;->a:Lm0/g;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/LiveData;->f(Lm0/g;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->j()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/LiveData$a;->h(Z)V

    return-void
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->e:Lm0/c;

    invoke-interface {v0}, Lm0/c;->a()Landroidx/lifecycle/c;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/e;

    .line 1
    iget-object v0, v0, Landroidx/lifecycle/e;->a:Lj/a;

    invoke-virtual {v0, p0}, Lj/a;->d(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public j()Z
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->e:Lm0/c;

    invoke-interface {v0}, Lm0/c;->a()Landroidx/lifecycle/c;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/e;

    .line 1
    iget-object v0, v0, Landroidx/lifecycle/e;->b:Landroidx/lifecycle/c$b;

    .line 2
    sget-object v1, Landroidx/lifecycle/c$b;->d:Landroidx/lifecycle/c$b;

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
