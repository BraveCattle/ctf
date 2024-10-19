.class public Le0/s$h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public final a:Le0/s;


# direct methods
.method public constructor <init>(Le0/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le0/s$h;->a:Le0/s;

    return-void
.end method


# virtual methods
.method public a()Le0/s;
    .locals 1

    iget-object v0, p0, Le0/s$h;->a:Le0/s;

    return-object v0
.end method

.method public b()Le0/s;
    .locals 1

    iget-object v0, p0, Le0/s$h;->a:Le0/s;

    return-object v0
.end method

.method public c()Le0/s;
    .locals 1

    iget-object v0, p0, Le0/s$h;->a:Le0/s;

    return-object v0
.end method

.method public d()Le0/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Lx/b;
    .locals 1

    sget-object v0, Lx/b;->e:Lx/b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Le0/s$h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Le0/s$h;

    invoke-virtual {p0}, Le0/s$h;->i()Z

    move-result v1

    invoke-virtual {p1}, Le0/s$h;->i()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, Le0/s$h;->h()Z

    move-result v1

    invoke-virtual {p1}, Le0/s$h;->h()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, Le0/s$h;->f()Lx/b;

    move-result-object v1

    invoke-virtual {p1}, Le0/s$h;->f()Lx/b;

    move-result-object v3

    .line 1
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2
    invoke-virtual {p0}, Le0/s$h;->e()Lx/b;

    move-result-object v1

    invoke-virtual {p1}, Le0/s$h;->e()Lx/b;

    move-result-object v3

    .line 3
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    invoke-virtual {p0}, Le0/s$h;->d()Le0/c;

    move-result-object v1

    invoke-virtual {p1}, Le0/s$h;->d()Le0/c;

    move-result-object p1

    .line 5
    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public f()Lx/b;
    .locals 1

    sget-object v0, Lx/b;->e:Lx/b;

    return-object v0
.end method

.method public g(IIII)Le0/s;
    .locals 0

    sget-object p1, Le0/s;->b:Le0/s;

    return-object p1
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Le0/s$h;->i()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Le0/s$h;->h()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p0}, Le0/s$h;->f()Lx/b;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-virtual {p0}, Le0/s$h;->e()Lx/b;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-virtual {p0}, Le0/s$h;->d()Le0/c;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 1
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
