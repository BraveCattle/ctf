.class public Lc/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le0/k;


# instance fields
.field public final synthetic a:Lc/g;


# direct methods
.method public constructor <init>(Lc/g;)V
    .locals 0

    iput-object p1, p0, Lc/h;->a:Lc/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Le0/s;)Le0/s;
    .locals 6

    invoke-virtual {p2}, Le0/s;->d()I

    move-result v0

    iget-object v1, p0, Lc/h;->a:Lc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, p2, v2}, Lc/g;->X(Le0/s;Landroid/graphics/Rect;)I

    move-result v1

    if-eq v0, v1, :cond_1

    invoke-virtual {p2}, Le0/s;->b()I

    move-result v0

    invoke-virtual {p2}, Le0/s;->c()I

    move-result v2

    invoke-virtual {p2}, Le0/s;->a()I

    move-result v3

    .line 1
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-lt v4, v5, :cond_0

    new-instance v4, Le0/s$b;

    invoke-direct {v4, p2}, Le0/s$b;-><init>(Le0/s;)V

    goto :goto_0

    :cond_0
    new-instance v4, Le0/s$a;

    invoke-direct {v4, p2}, Le0/s$a;-><init>(Le0/s;)V

    .line 2
    :goto_0
    invoke-static {v0, v1, v2, v3}, Lx/b;->a(IIII)Lx/b;

    move-result-object p2

    .line 3
    invoke-virtual {v4, p2}, Le0/s$c;->c(Lx/b;)V

    .line 4
    invoke-virtual {v4}, Le0/s$c;->a()Le0/s;

    move-result-object p2

    .line 5
    :cond_1
    sget-object v0, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 6
    invoke-virtual {p2}, Le0/s;->g()Landroid/view/WindowInsets;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1, v0}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 7
    new-instance p2, Le0/s;

    invoke-direct {p2, p1}, Le0/s;-><init>(Landroid/view/WindowInsets;)V

    :cond_2
    return-object p2
.end method
