.class public final Landroidx/recyclerview/widget/k$p;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "p"
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/k$v;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/k$v;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/k$v;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/k$v;",
            ">;"
        }
    .end annotation
.end field

.field public e:I

.field public f:I

.field public g:Landroidx/recyclerview/widget/k$o;

.field public final synthetic h:Landroidx/recyclerview/widget/k;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/k;)V
    .locals 1

    iput-object p1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/k$p;->a:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/k$p;->b:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/k$p;->c:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/k$p;->d:Ljava/util/List;

    const/4 p1, 0x2

    iput p1, p0, Landroidx/recyclerview/widget/k$p;->e:I

    iput p1, p0, Landroidx/recyclerview/widget/k$p;->f:I

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/k$v;Z)V
    .locals 4

    invoke-static {p1}, Landroidx/recyclerview/widget/k;->g(Landroidx/recyclerview/widget/k$v;)V

    const/16 v0, 0x4000

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/k$v;->f(I)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p1, v2, v0}, Landroidx/recyclerview/widget/k$v;->n(II)V

    invoke-static {v3, v3}, Le0/m;->f(Landroid/view/View;Le0/a;)V

    :cond_0
    if-eqz p2, :cond_2

    .line 1
    iget-object p2, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object p2, p2, Landroidx/recyclerview/widget/k;->l:Landroidx/recyclerview/widget/k$q;

    if-eqz p2, :cond_1

    invoke-interface {p2, p1}, Landroidx/recyclerview/widget/k$q;->a(Landroidx/recyclerview/widget/k$v;)V

    :cond_1
    iget-object p2, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object v0, p2, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    if-eqz v0, :cond_2

    iget-object p2, p2, Landroidx/recyclerview/widget/k;->f:Landroidx/recyclerview/widget/r;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/r;->a(Landroidx/recyclerview/widget/k$v;)V

    .line 2
    :cond_2
    iput-object v3, p1, Landroidx/recyclerview/widget/k$v;->n:Landroidx/recyclerview/widget/k;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$p;->d()Landroidx/recyclerview/widget/k$o;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-virtual {p2, v2}, Landroidx/recyclerview/widget/k$o;->a(I)Landroidx/recyclerview/widget/k$o$a;

    move-result-object v0

    iget-object v0, v0, Landroidx/recyclerview/widget/k$o$a;->a:Ljava/util/ArrayList;

    iget-object p2, p2, Landroidx/recyclerview/widget/k$o;->a:Landroid/util/SparseArray;

    invoke-virtual {p2, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/k$o$a;

    iget p2, p2, Landroidx/recyclerview/widget/k$o$a;->b:I

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gt p2, v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$v;->m()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$p;->e()V

    return-void
.end method

.method public c(I)I
    .locals 3

    if-ltz p1, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object v0, v0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$s;->a()I

    move-result v0

    if-ge p1, v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object v1, v0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    .line 1
    iget-boolean v1, v1, Landroidx/recyclerview/widget/k$s;->e:Z

    if-nez v1, :cond_0

    return p1

    .line 2
    :cond_0
    iget-object v0, v0, Landroidx/recyclerview/widget/k;->d:Landroidx/recyclerview/widget/a;

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/a;->a(II)I

    move-result p1

    return p1

    .line 4
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid position "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". State "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "item count is "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object p1, p1, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$s;->a()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    invoke-static {p1, v1}, Lp0/a;->a(Landroidx/recyclerview/widget/k;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Landroidx/recyclerview/widget/k$o;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->g:Landroidx/recyclerview/widget/k$o;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/recyclerview/widget/k$o;

    invoke-direct {v0}, Landroidx/recyclerview/widget/k$o;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/k$p;->g:Landroidx/recyclerview/widget/k$o;

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->g:Landroidx/recyclerview/widget/k$o;

    return-object v0
.end method

.method public e()V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, -0x1

    add-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/k$p;->f(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Landroidx/recyclerview/widget/k;->s0:[I

    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object v0, v0, Landroidx/recyclerview/widget/k;->a0:Landroidx/recyclerview/widget/e$b;

    .line 1
    iget-object v2, v0, Landroidx/recyclerview/widget/e$b;->c:[I

    if-eqz v2, :cond_1

    invoke-static {v2, v1}, Ljava/util/Arrays;->fill([II)V

    :cond_1
    const/4 v1, 0x0

    iput v1, v0, Landroidx/recyclerview/widget/e$b;->d:I

    return-void
.end method

.method public f(I)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/k$v;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/k$p;->a(Landroidx/recyclerview/widget/k$v;Z)V

    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public g(Landroid/view/View;)V
    .locals 3

    invoke-static {p1}, Landroidx/recyclerview/widget/k;->u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$v;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroidx/recyclerview/widget/k;->removeDetachedView(Landroid/view/View;Z)V

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$v;->j()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$v;->q()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$v;->c()V

    goto :goto_0

    .line 1
    :cond_1
    iget-object p1, v0, Landroidx/recyclerview/widget/k$v;->j:Landroidx/recyclerview/widget/k$p;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/k$p;->k(Landroidx/recyclerview/widget/k$v;)V

    .line 2
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/k$p;->h(Landroidx/recyclerview/widget/k$v;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public h(Landroidx/recyclerview/widget/k$v;)V
    .locals 1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$v;->j()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    throw v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    throw v0
.end method

.method public i(Landroid/view/View;)V
    .locals 4

    invoke-static {p1}, Landroidx/recyclerview/widget/k;->u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;

    move-result-object p1

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/k$v;->f(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$v;->l()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    .line 1
    iget-object v0, v0, Landroidx/recyclerview/widget/k;->H:Landroidx/recyclerview/widget/k$g;

    const/4 v2, 0x1

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$v;->e()Ljava/util/List;

    move-result-object v3

    check-cast v0, Landroidx/recyclerview/widget/c;

    .line 2
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 3
    iget-boolean v0, v0, Landroidx/recyclerview/widget/p;->g:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$v;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move v0, v1

    goto :goto_3

    :cond_3
    :goto_2
    move v0, v2

    :goto_3
    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    move v0, v1

    goto :goto_5

    :cond_5
    :goto_4
    move v0, v2

    :goto_5
    if-eqz v0, :cond_6

    goto :goto_6

    .line 4
    :cond_6
    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/k$p;->b:Ljava/util/ArrayList;

    .line 5
    :cond_7
    iput-object p0, p1, Landroidx/recyclerview/widget/k$v;->j:Landroidx/recyclerview/widget/k$p;

    iput-boolean v2, p1, Landroidx/recyclerview/widget/k$v;->k:Z

    .line 6
    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->b:Ljava/util/ArrayList;

    goto :goto_8

    :cond_8
    :goto_6
    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$v;->h()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$v;->i()Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_7

    :cond_9
    iget-object p1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    throw p1

    .line 7
    :cond_a
    :goto_7
    iput-object p0, p1, Landroidx/recyclerview/widget/k$v;->j:Landroidx/recyclerview/widget/k$p;

    iput-boolean v1, p1, Landroidx/recyclerview/widget/k$v;->k:Z

    .line 8
    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->a:Ljava/util/ArrayList;

    :goto_8
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public j(IZJ)Landroidx/recyclerview/widget/k$v;
    .locals 10

    if-ltz p1, :cond_25

    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object v0, v0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$s;->a()I

    move-result v0

    if-ge p1, v0, :cond_25

    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object v0, v0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    .line 1
    iget-boolean v0, v0, Landroidx/recyclerview/widget/k$s;->e:Z

    const/16 v1, 0x20

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_5

    .line 2
    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    move v5, v2

    :goto_0
    if-ge v5, v0, :cond_2

    iget-object v6, p0, Landroidx/recyclerview/widget/k$p;->b:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/recyclerview/widget/k$v;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/k$v;->q()Z

    move-result v7

    if-nez v7, :cond_1

    invoke-virtual {v6}, Landroidx/recyclerview/widget/k$v;->d()I

    move-result v7

    if-ne v7, p1, :cond_1

    invoke-virtual {v6, v1}, Landroidx/recyclerview/widget/k$v;->b(I)V

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw v3

    :cond_3
    :goto_1
    move-object v6, v3

    :goto_2
    if-eqz v6, :cond_4

    move v0, v4

    goto :goto_3

    :cond_4
    move v0, v2

    goto :goto_3

    :cond_5
    move v0, v2

    move-object v6, v3

    :goto_3
    if-nez v6, :cond_18

    .line 3
    iget-object v5, p0, Landroidx/recyclerview/widget/k$p;->a:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v6, v2

    :goto_4
    if-ge v6, v5, :cond_8

    iget-object v7, p0, Landroidx/recyclerview/widget/k$p;->a:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/k$v;

    invoke-virtual {v7}, Landroidx/recyclerview/widget/k$v;->q()Z

    move-result v8

    if-nez v8, :cond_7

    invoke-virtual {v7}, Landroidx/recyclerview/widget/k$v;->d()I

    move-result v8

    if-ne v8, p1, :cond_7

    invoke-virtual {v7}, Landroidx/recyclerview/widget/k$v;->h()Z

    move-result v8

    if-nez v8, :cond_7

    iget-object v8, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object v8, v8, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    iget-boolean v8, v8, Landroidx/recyclerview/widget/k$s;->e:Z

    if-nez v8, :cond_6

    invoke-virtual {v7}, Landroidx/recyclerview/widget/k$v;->i()Z

    move-result v8

    if-nez v8, :cond_7

    :cond_6
    invoke-virtual {v7, v1}, Landroidx/recyclerview/widget/k$v;->b(I)V

    move-object v6, v7

    goto/16 :goto_8

    :cond_7
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_8
    if-nez p2, :cond_e

    iget-object v1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object v1, v1, Landroidx/recyclerview/widget/k;->e:Landroidx/recyclerview/widget/b;

    .line 4
    iget-object v5, v1, Landroidx/recyclerview/widget/b;->c:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    move v6, v2

    :goto_5
    if-ge v6, v5, :cond_a

    iget-object v7, v1, Landroidx/recyclerview/widget/b;->c:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/view/View;

    iget-object v8, v1, Landroidx/recyclerview/widget/b;->a:Landroidx/recyclerview/widget/b$b;

    check-cast v8, Landroidx/recyclerview/widget/l;

    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-static {v7}, Landroidx/recyclerview/widget/k;->u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;

    move-result-object v8

    .line 6
    invoke-virtual {v8}, Landroidx/recyclerview/widget/k$v;->d()I

    move-result v9

    if-ne v9, p1, :cond_9

    invoke-virtual {v8}, Landroidx/recyclerview/widget/k$v;->h()Z

    move-result v9

    if-nez v9, :cond_9

    invoke-virtual {v8}, Landroidx/recyclerview/widget/k$v;->i()Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_6

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_a
    move-object v7, v3

    :goto_6
    if-eqz v7, :cond_e

    .line 7
    invoke-static {v7}, Landroidx/recyclerview/widget/k;->u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;

    move-result-object v1

    iget-object v5, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object v5, v5, Landroidx/recyclerview/widget/k;->e:Landroidx/recyclerview/widget/b;

    .line 8
    iget-object v6, v5, Landroidx/recyclerview/widget/b;->a:Landroidx/recyclerview/widget/b$b;

    check-cast v6, Landroidx/recyclerview/widget/l;

    .line 9
    iget-object v6, v6, Landroidx/recyclerview/widget/l;->a:Landroidx/recyclerview/widget/k;

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v6

    if-ltz v6, :cond_d

    .line 10
    iget-object v8, v5, Landroidx/recyclerview/widget/b;->b:Landroidx/recyclerview/widget/b$a;

    invoke-virtual {v8, v6}, Landroidx/recyclerview/widget/b$a;->d(I)Z

    move-result v8

    if-eqz v8, :cond_c

    iget-object v8, v5, Landroidx/recyclerview/widget/b;->b:Landroidx/recyclerview/widget/b$a;

    invoke-virtual {v8, v6}, Landroidx/recyclerview/widget/b$a;->a(I)V

    invoke-virtual {v5, v7}, Landroidx/recyclerview/widget/b;->h(Landroid/view/View;)Z

    .line 11
    iget-object v5, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object v5, v5, Landroidx/recyclerview/widget/k;->e:Landroidx/recyclerview/widget/b;

    invoke-virtual {v5, v7}, Landroidx/recyclerview/widget/b;->f(Landroid/view/View;)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_b

    iget-object v6, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object v6, v6, Landroidx/recyclerview/widget/k;->e:Landroidx/recyclerview/widget/b;

    invoke-virtual {v6, v5}, Landroidx/recyclerview/widget/b;->a(I)V

    invoke-virtual {p0, v7}, Landroidx/recyclerview/widget/k$p;->i(Landroid/view/View;)V

    const/16 v5, 0x2020

    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/k$v;->b(I)V

    move-object v6, v1

    goto :goto_8

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "layout index should not be -1 after unhiding a view:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    invoke-static {p3, p2}, Lp0/a;->a(Landroidx/recyclerview/widget/k;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_c
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "trying to unhide a view that was not hidden"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "view is not a child, cannot hide "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_e
    iget-object v1, p0, Landroidx/recyclerview/widget/k$p;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v5, v2

    :goto_7
    if-ge v5, v1, :cond_10

    iget-object v6, p0, Landroidx/recyclerview/widget/k$p;->c:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/recyclerview/widget/k$v;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/k$v;->h()Z

    move-result v7

    if-nez v7, :cond_f

    invoke-virtual {v6}, Landroidx/recyclerview/widget/k$v;->d()I

    move-result v7

    if-ne v7, p1, :cond_f

    if-nez p2, :cond_11

    iget-object v1, p0, Landroidx/recyclerview/widget/k$p;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_8

    :cond_f
    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_10
    move-object v6, v3

    :cond_11
    :goto_8
    if-eqz v6, :cond_18

    .line 14
    invoke-virtual {v6}, Landroidx/recyclerview/widget/k$v;->i()Z

    move-result v1

    if-eqz v1, :cond_16

    iget-object v1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object v1, v1, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    .line 15
    iget-boolean v1, v1, Landroidx/recyclerview/widget/k$s;->e:Z

    if-nez v1, :cond_15

    if-nez p2, :cond_14

    const/4 p1, 0x4

    .line 16
    invoke-virtual {v6, p1}, Landroidx/recyclerview/widget/k$v;->b(I)V

    invoke-virtual {v6}, Landroidx/recyclerview/widget/k$v;->j()Z

    move-result p1

    if-nez p1, :cond_12

    invoke-virtual {v6}, Landroidx/recyclerview/widget/k$v;->q()Z

    move-result p1

    if-eqz p1, :cond_13

    invoke-virtual {v6}, Landroidx/recyclerview/widget/k$v;->c()V

    goto :goto_9

    :cond_12
    iget-object p1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    invoke-virtual {p1, v3, v2}, Landroidx/recyclerview/widget/k;->removeDetachedView(Landroid/view/View;Z)V

    .line 17
    iget-object p1, v6, Landroidx/recyclerview/widget/k$v;->j:Landroidx/recyclerview/widget/k$p;

    invoke-virtual {p1, v6}, Landroidx/recyclerview/widget/k$p;->k(Landroidx/recyclerview/widget/k$v;)V

    .line 18
    :cond_13
    :goto_9
    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/k$p;->h(Landroidx/recyclerview/widget/k$v;)V

    throw v3

    :cond_14
    move-object v6, v3

    goto :goto_a

    :cond_15
    move v0, v4

    goto :goto_a

    .line 19
    :cond_16
    iget p1, v6, Landroidx/recyclerview/widget/k$v;->a:I

    if-ltz p1, :cond_17

    iget-object p1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw v3

    :cond_17
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Inconsistency detected. Invalid view holder adapter position"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    invoke-static {p3, p2}, Lp0/a;->a(Landroidx/recyclerview/widget/k;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    :goto_a
    if-nez v6, :cond_1a

    .line 20
    iget-object p2, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object p2, p2, Landroidx/recyclerview/widget/k;->d:Landroidx/recyclerview/widget/a;

    .line 21
    invoke-virtual {p2, p1, v2}, Landroidx/recyclerview/widget/a;->a(II)I

    move-result p2

    if-ltz p2, :cond_19

    .line 22
    iget-object p1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw v3

    :cond_19
    new-instance p3, Ljava/lang/IndexOutOfBoundsException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Inconsistency detected. Invalid item position "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "(offset:"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "state:"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object p1, p1, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$s;->a()I

    move-result p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    invoke-static {p1, p4}, Lp0/a;->a(Landroidx/recyclerview/widget/k;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_1a
    if-eqz v0, :cond_1c

    iget-object p2, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object p2, p2, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    .line 23
    iget-boolean p2, p2, Landroidx/recyclerview/widget/k$s;->e:Z

    if-nez p2, :cond_1c

    const/16 p2, 0x2000

    .line 24
    invoke-virtual {v6, p2}, Landroidx/recyclerview/widget/k$v;->f(I)Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-virtual {v6, v2, p2}, Landroidx/recyclerview/widget/k$v;->n(II)V

    iget-object p2, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object p2, p2, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    iget-boolean p2, p2, Landroidx/recyclerview/widget/k$s;->g:Z

    if-nez p2, :cond_1b

    goto :goto_b

    :cond_1b
    invoke-static {v6}, Landroidx/recyclerview/widget/k$g;->a(Landroidx/recyclerview/widget/k$v;)I

    iget-object p1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object p1, p1, Landroidx/recyclerview/widget/k;->H:Landroidx/recyclerview/widget/k$g;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/k$v;->e()Ljava/util/List;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    throw v3

    .line 26
    :cond_1c
    :goto_b
    iget-object p2, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object p2, p2, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    .line 27
    iget-boolean p2, p2, Landroidx/recyclerview/widget/k$s;->e:Z

    if-eqz p2, :cond_1e

    .line 28
    invoke-virtual {v6}, Landroidx/recyclerview/widget/k$v;->g()Z

    move-result p2

    if-nez p2, :cond_1d

    goto :goto_c

    :cond_1d
    iput p1, v6, Landroidx/recyclerview/widget/k$v;->d:I

    goto :goto_e

    :cond_1e
    :goto_c
    invoke-virtual {v6}, Landroidx/recyclerview/widget/k$v;->g()Z

    move-result p2

    if-eqz p2, :cond_20

    .line 29
    iget p2, v6, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1f

    move p2, v4

    goto :goto_d

    :cond_1f
    move p2, v2

    :goto_d
    if-nez p2, :cond_20

    .line 30
    invoke-virtual {v6}, Landroidx/recyclerview/widget/k$v;->h()Z

    move-result p2

    if-eqz p2, :cond_23

    :cond_20
    iget-object p2, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object p2, p2, Landroidx/recyclerview/widget/k;->d:Landroidx/recyclerview/widget/a;

    .line 31
    invoke-virtual {p2, p1, v2}, Landroidx/recyclerview/widget/a;->a(II)I

    .line 32
    iget-object p1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iput-object p1, v6, Landroidx/recyclerview/widget/k$v;->n:Landroidx/recyclerview/widget/k;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k;->getNanoTime()J

    move-result-wide p1

    const-wide v0, 0x7fffffffffffffffL

    cmp-long v0, p3, v0

    if-eqz v0, :cond_24

    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->g:Landroidx/recyclerview/widget/k$o;

    .line 33
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/k$o;->a(I)Landroidx/recyclerview/widget/k$o$a;

    move-result-object v0

    iget-wide v0, v0, Landroidx/recyclerview/widget/k$o$a;->d:J

    const-wide/16 v5, 0x0

    cmp-long v5, v0, v5

    if-eqz v5, :cond_21

    add-long/2addr p1, v0

    cmp-long p1, p1, p3

    if-gez p1, :cond_22

    :cond_21
    move v2, v4

    :cond_22
    if-nez v2, :cond_24

    .line 34
    :cond_23
    :goto_e
    throw v3

    .line 35
    :cond_24
    iget-object p1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw v3

    .line 36
    :cond_25
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Invalid item position "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, "("

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "). Item count:"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object p1, p1, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$s;->a()I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    invoke-static {p1, p3}, Lp0/a;->a(Landroidx/recyclerview/widget/k;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public k(Landroidx/recyclerview/widget/k$v;)V
    .locals 1

    iget-boolean v0, p1, Landroidx/recyclerview/widget/k$v;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->b:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->a:Ljava/util/ArrayList;

    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/recyclerview/widget/k$v;->j:Landroidx/recyclerview/widget/k$p;

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/recyclerview/widget/k$v;->k:Z

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$v;->c()V

    return-void
.end method

.method public l()V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->h:Landroidx/recyclerview/widget/k;

    iget-object v0, v0, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    iget v0, p0, Landroidx/recyclerview/widget/k$p;->e:I

    add-int/lit8 v0, v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/k$p;->f:I

    iget-object v0, p0, Landroidx/recyclerview/widget/k$p;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/k$p;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget v2, p0, Landroidx/recyclerview/widget/k$p;->f:I

    if-le v1, v2, :cond_0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/k$p;->f(I)V

    goto :goto_0

    :cond_0
    return-void
.end method
