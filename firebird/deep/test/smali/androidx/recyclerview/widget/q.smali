.class public Landroidx/recyclerview/widget/q;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/q$b;,
        Landroidx/recyclerview/widget/q$a;
    }
.end annotation


# instance fields
.field public final a:Landroidx/recyclerview/widget/q$b;

.field public b:Landroidx/recyclerview/widget/q$a;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/q$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/q;->a:Landroidx/recyclerview/widget/q$b;

    new-instance p1, Landroidx/recyclerview/widget/q$a;

    invoke-direct {p1}, Landroidx/recyclerview/widget/q$a;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/q;->b:Landroidx/recyclerview/widget/q$a;

    return-void
.end method


# virtual methods
.method public a(IIII)Landroid/view/View;
    .locals 8

    iget-object v0, p0, Landroidx/recyclerview/widget/q;->a:Landroidx/recyclerview/widget/q$b;

    invoke-interface {v0}, Landroidx/recyclerview/widget/q$b;->b()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/q;->a:Landroidx/recyclerview/widget/q$b;

    invoke-interface {v1}, Landroidx/recyclerview/widget/q$b;->a()I

    move-result v1

    if-le p2, p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    :goto_0
    const/4 v3, 0x0

    :goto_1
    if-eq p1, p2, :cond_3

    iget-object v4, p0, Landroidx/recyclerview/widget/q;->a:Landroidx/recyclerview/widget/q$b;

    invoke-interface {v4, p1}, Landroidx/recyclerview/widget/q$b;->e(I)Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Landroidx/recyclerview/widget/q;->a:Landroidx/recyclerview/widget/q$b;

    invoke-interface {v5, v4}, Landroidx/recyclerview/widget/q$b;->d(Landroid/view/View;)I

    move-result v5

    iget-object v6, p0, Landroidx/recyclerview/widget/q;->a:Landroidx/recyclerview/widget/q$b;

    invoke-interface {v6, v4}, Landroidx/recyclerview/widget/q$b;->c(Landroid/view/View;)I

    move-result v6

    iget-object v7, p0, Landroidx/recyclerview/widget/q;->b:Landroidx/recyclerview/widget/q$a;

    .line 1
    iput v0, v7, Landroidx/recyclerview/widget/q$a;->b:I

    iput v1, v7, Landroidx/recyclerview/widget/q$a;->c:I

    iput v5, v7, Landroidx/recyclerview/widget/q$a;->d:I

    iput v6, v7, Landroidx/recyclerview/widget/q$a;->e:I

    const/4 v5, 0x0

    if-eqz p3, :cond_1

    .line 2
    iput v5, v7, Landroidx/recyclerview/widget/q$a;->a:I

    or-int/lit8 v6, p3, 0x0

    .line 3
    iput v6, v7, Landroidx/recyclerview/widget/q$a;->a:I

    .line 4
    invoke-virtual {v7}, Landroidx/recyclerview/widget/q$a;->a()Z

    move-result v6

    if-eqz v6, :cond_1

    return-object v4

    :cond_1
    if-eqz p4, :cond_2

    iget-object v6, p0, Landroidx/recyclerview/widget/q;->b:Landroidx/recyclerview/widget/q$a;

    .line 5
    iput v5, v6, Landroidx/recyclerview/widget/q$a;->a:I

    or-int/lit8 v5, p4, 0x0

    .line 6
    iput v5, v6, Landroidx/recyclerview/widget/q$a;->a:I

    .line 7
    invoke-virtual {v6}, Landroidx/recyclerview/widget/q$a;->a()Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v3, v4

    :cond_2
    add-int/2addr p1, v2

    goto :goto_1

    :cond_3
    return-object v3
.end method