.class public Le0/s$d;
.super Le0/s$h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final b:Landroid/view/WindowInsets;

.field public c:Lx/b;


# direct methods
.method public constructor <init>(Le0/s;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1}, Le0/s$h;-><init>(Le0/s;)V

    const/4 p1, 0x0

    iput-object p1, p0, Le0/s$d;->c:Lx/b;

    iput-object p2, p0, Le0/s$d;->b:Landroid/view/WindowInsets;

    return-void
.end method


# virtual methods
.method public final f()Lx/b;
    .locals 4

    iget-object v0, p0, Le0/s$d;->c:Lx/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Le0/s$d;->b:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v0

    iget-object v1, p0, Le0/s$d;->b:Landroid/view/WindowInsets;

    invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v1

    iget-object v2, p0, Le0/s$d;->b:Landroid/view/WindowInsets;

    invoke-virtual {v2}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v2

    iget-object v3, p0, Le0/s$d;->b:Landroid/view/WindowInsets;

    invoke-virtual {v3}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lx/b;->a(IIII)Lx/b;

    move-result-object v0

    iput-object v0, p0, Le0/s$d;->c:Lx/b;

    :cond_0
    iget-object v0, p0, Le0/s$d;->c:Lx/b;

    return-object v0
.end method

.method public g(IIII)Le0/s;
    .locals 3

    iget-object v0, p0, Le0/s$d;->b:Landroid/view/WindowInsets;

    invoke-static {v0}, Le0/s;->h(Landroid/view/WindowInsets;)Le0/s;

    move-result-object v0

    .line 1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    new-instance v1, Le0/s$b;

    invoke-direct {v1, v0}, Le0/s$b;-><init>(Le0/s;)V

    goto :goto_0

    :cond_0
    new-instance v1, Le0/s$a;

    invoke-direct {v1, v0}, Le0/s$a;-><init>(Le0/s;)V

    .line 2
    :goto_0
    invoke-virtual {p0}, Le0/s$d;->f()Lx/b;

    move-result-object v0

    invoke-static {v0, p1, p2, p3, p4}, Le0/s;->f(Lx/b;IIII)Lx/b;

    move-result-object v0

    .line 3
    invoke-virtual {v1, v0}, Le0/s$c;->c(Lx/b;)V

    .line 4
    invoke-virtual {p0}, Le0/s$h;->e()Lx/b;

    move-result-object v0

    invoke-static {v0, p1, p2, p3, p4}, Le0/s;->f(Lx/b;IIII)Lx/b;

    move-result-object p1

    .line 5
    invoke-virtual {v1, p1}, Le0/s$c;->b(Lx/b;)V

    .line 6
    invoke-virtual {v1}, Le0/s$c;->a()Le0/s;

    move-result-object p1

    return-object p1
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Le0/s$d;->b:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isRound()Z

    move-result v0

    return v0
.end method
