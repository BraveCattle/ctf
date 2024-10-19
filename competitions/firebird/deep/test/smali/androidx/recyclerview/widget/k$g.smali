.class public abstract Landroidx/recyclerview/widget/k$g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/k$g$c;,
        Landroidx/recyclerview/widget/k$g$a;,
        Landroidx/recyclerview/widget/k$g$b;
    }
.end annotation


# instance fields
.field public a:Landroidx/recyclerview/widget/k$g$b;

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/k$g$a;",
            ">;"
        }
    .end annotation
.end field

.field public c:J

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/k$g;->a:Landroidx/recyclerview/widget/k$g$b;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/k$g;->b:Ljava/util/ArrayList;

    const-wide/16 v0, 0x78

    iput-wide v0, p0, Landroidx/recyclerview/widget/k$g;->c:J

    iput-wide v0, p0, Landroidx/recyclerview/widget/k$g;->d:J

    const-wide/16 v0, 0xfa

    iput-wide v0, p0, Landroidx/recyclerview/widget/k$g;->e:J

    iput-wide v0, p0, Landroidx/recyclerview/widget/k$g;->f:J

    return-void
.end method

.method public static a(Landroidx/recyclerview/widget/k$v;)I
    .locals 4

    iget v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/lit8 v0, v0, 0xe

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$v;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x4

    return p0

    :cond_0
    and-int/lit8 v1, v0, 0x4

    if-nez v1, :cond_2

    .line 1
    iget v1, p0, Landroidx/recyclerview/widget/k$v;->b:I

    .line 2
    iget-object v2, p0, Landroidx/recyclerview/widget/k$v;->n:Landroidx/recyclerview/widget/k;

    const/4 v3, -0x1

    if-nez v2, :cond_1

    move p0, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v2, p0}, Landroidx/recyclerview/widget/k;->t(Landroidx/recyclerview/widget/k$v;)I

    move-result p0

    :goto_0
    if-eq v1, v3, :cond_2

    if-eq p0, v3, :cond_2

    if-eq v1, p0, :cond_2

    or-int/lit16 v0, v0, 0x800

    :cond_2
    return v0
.end method


# virtual methods
.method public final b(Landroidx/recyclerview/widget/k$v;)V
    .locals 8

    iget-object v0, p0, Landroidx/recyclerview/widget/k$g;->a:Landroidx/recyclerview/widget/k$g$b;

    if-eqz v0, :cond_5

    check-cast v0, Landroidx/recyclerview/widget/k$h;

    const/4 v1, 0x1

    .line 1
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/k$v;->o(Z)V

    iget-object v2, p1, Landroidx/recyclerview/widget/k$v;->e:Landroidx/recyclerview/widget/k$v;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iput-object v3, p1, Landroidx/recyclerview/widget/k$v;->e:Landroidx/recyclerview/widget/k$v;

    .line 2
    :cond_0
    iget v2, p1, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/lit8 v2, v2, 0x10

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    move v2, v1

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    if-nez v2, :cond_5

    .line 3
    iget-object v2, v0, Landroidx/recyclerview/widget/k$h;->a:Landroidx/recyclerview/widget/k;

    .line 4
    invoke-virtual {v2}, Landroidx/recyclerview/widget/k;->J()V

    iget-object v5, v2, Landroidx/recyclerview/widget/k;->e:Landroidx/recyclerview/widget/b;

    .line 5
    iget-object v6, v5, Landroidx/recyclerview/widget/b;->a:Landroidx/recyclerview/widget/b$b;

    check-cast v6, Landroidx/recyclerview/widget/l;

    .line 6
    iget-object v6, v6, Landroidx/recyclerview/widget/l;->a:Landroidx/recyclerview/widget/k;

    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_2

    .line 7
    invoke-virtual {v5, v3}, Landroidx/recyclerview/widget/b;->h(Landroid/view/View;)Z

    goto :goto_1

    :cond_2
    iget-object v7, v5, Landroidx/recyclerview/widget/b;->b:Landroidx/recyclerview/widget/b$a;

    invoke-virtual {v7, v6}, Landroidx/recyclerview/widget/b$a;->d(I)Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object v7, v5, Landroidx/recyclerview/widget/b;->b:Landroidx/recyclerview/widget/b$a;

    invoke-virtual {v7, v6}, Landroidx/recyclerview/widget/b$a;->e(I)Z

    invoke-virtual {v5, v3}, Landroidx/recyclerview/widget/b;->h(Landroid/view/View;)Z

    iget-object v5, v5, Landroidx/recyclerview/widget/b;->a:Landroidx/recyclerview/widget/b$b;

    check-cast v5, Landroidx/recyclerview/widget/l;

    invoke-virtual {v5, v6}, Landroidx/recyclerview/widget/l;->c(I)V

    goto :goto_1

    :cond_3
    move v1, v4

    :goto_1
    if-nez v1, :cond_4

    xor-int/lit8 v5, v1, 0x1

    .line 8
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/k;->L(Z)V

    if-nez v1, :cond_5

    .line 9
    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$v;->k()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, v0, Landroidx/recyclerview/widget/k$h;->a:Landroidx/recyclerview/widget/k;

    invoke-virtual {p1, v3, v4}, Landroidx/recyclerview/widget/k;->removeDetachedView(Landroid/view/View;Z)V

    goto :goto_2

    .line 10
    :cond_4
    invoke-static {v3}, Landroidx/recyclerview/widget/k;->u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;

    move-result-object p1

    iget-object v0, v2, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/k$p;->k(Landroidx/recyclerview/widget/k$v;)V

    iget-object v0, v2, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/k$p;->h(Landroidx/recyclerview/widget/k$v;)V

    throw v3

    :cond_5
    :goto_2
    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/k$g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Landroidx/recyclerview/widget/k$g;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/k$g$a;

    invoke-interface {v2}, Landroidx/recyclerview/widget/k$g$a;->a()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k$g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public abstract d()V
.end method

.method public abstract e()Z
.end method
