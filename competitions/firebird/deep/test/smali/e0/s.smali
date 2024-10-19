.class public Le0/s;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le0/s$b;,
        Le0/s$a;,
        Le0/s$c;,
        Le0/s$g;,
        Le0/s$f;,
        Le0/s$e;,
        Le0/s$d;,
        Le0/s$h;
    }
.end annotation


# static fields
.field public static final b:Le0/s;


# instance fields
.field public final a:Le0/s$h;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Le0/s$b;

    invoke-direct {v0}, Le0/s$b;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Le0/s$a;

    invoke-direct {v0}, Le0/s$a;-><init>()V

    .line 2
    :goto_0
    invoke-virtual {v0}, Le0/s$c;->a()Le0/s;

    move-result-object v0

    .line 3
    iget-object v0, v0, Le0/s;->a:Le0/s$h;

    invoke-virtual {v0}, Le0/s$h;->a()Le0/s;

    move-result-object v0

    .line 4
    iget-object v0, v0, Le0/s;->a:Le0/s$h;

    invoke-virtual {v0}, Le0/s$h;->b()Le0/s;

    move-result-object v0

    .line 5
    iget-object v0, v0, Le0/s;->a:Le0/s$h;

    invoke-virtual {v0}, Le0/s$h;->c()Le0/s;

    move-result-object v0

    .line 6
    sput-object v0, Le0/s;->b:Le0/s;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Le0/s$g;

    invoke-direct {v0, p0, p1}, Le0/s$g;-><init>(Le0/s;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    new-instance v0, Le0/s$f;

    invoke-direct {v0, p0, p1}, Le0/s$f;-><init>(Le0/s;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_1
    new-instance v0, Le0/s$e;

    invoke-direct {v0, p0, p1}, Le0/s$e;-><init>(Le0/s;Landroid/view/WindowInsets;)V

    :goto_0
    iput-object v0, p0, Le0/s;->a:Le0/s$h;

    return-void
.end method

.method public constructor <init>(Le0/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Le0/s$h;

    invoke-direct {p1, p0}, Le0/s$h;-><init>(Le0/s;)V

    iput-object p1, p0, Le0/s;->a:Le0/s$h;

    return-void
.end method

.method public static f(Lx/b;IIII)Lx/b;
    .locals 5

    iget v0, p0, Lx/b;->a:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p0, Lx/b;->b:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, Lx/b;->c:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v4, p0, Lx/b;->d:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, v2, v3, v1}, Lx/b;->a(IIII)Lx/b;

    move-result-object p0

    return-object p0
.end method

.method public static h(Landroid/view/WindowInsets;)Le0/s;
    .locals 1

    new-instance v0, Le0/s;

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-direct {v0, p0}, Le0/s;-><init>(Landroid/view/WindowInsets;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    invoke-virtual {p0}, Le0/s;->e()Lx/b;

    move-result-object v0

    iget v0, v0, Lx/b;->d:I

    return v0
.end method

.method public b()I
    .locals 1

    invoke-virtual {p0}, Le0/s;->e()Lx/b;

    move-result-object v0

    iget v0, v0, Lx/b;->a:I

    return v0
.end method

.method public c()I
    .locals 1

    invoke-virtual {p0}, Le0/s;->e()Lx/b;

    move-result-object v0

    iget v0, v0, Lx/b;->c:I

    return v0
.end method

.method public d()I
    .locals 1

    invoke-virtual {p0}, Le0/s;->e()Lx/b;

    move-result-object v0

    iget v0, v0, Lx/b;->b:I

    return v0
.end method

.method public e()Lx/b;
    .locals 1

    iget-object v0, p0, Le0/s;->a:Le0/s$h;

    invoke-virtual {v0}, Le0/s$h;->f()Lx/b;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Le0/s;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Le0/s;

    iget-object v0, p0, Le0/s;->a:Le0/s$h;

    iget-object p1, p1, Le0/s;->a:Le0/s$h;

    .line 1
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public g()Landroid/view/WindowInsets;
    .locals 2

    iget-object v0, p0, Le0/s;->a:Le0/s$h;

    instance-of v1, v0, Le0/s$d;

    if-eqz v1, :cond_0

    check-cast v0, Le0/s$d;

    iget-object v0, v0, Le0/s$d;->b:Landroid/view/WindowInsets;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Le0/s;->a:Le0/s$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Le0/s$h;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method
