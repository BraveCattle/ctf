.class public Landroidx/recyclerview/widget/k$u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "u"
.end annotation


# instance fields
.field public b:I

.field public c:I

.field public d:Landroid/widget/OverScroller;

.field public e:Landroid/view/animation/Interpolator;

.field public f:Z

.field public g:Z

.field public final synthetic h:Landroidx/recyclerview/widget/k;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/k;)V
    .locals 2

    iput-object p1, p0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroidx/recyclerview/widget/k;->v0:Landroid/view/animation/Interpolator;

    iput-object v0, p0, Landroidx/recyclerview/widget/k$u;->e:Landroid/view/animation/Interpolator;

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/recyclerview/widget/k$u;->f:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/k$u;->g:Z

    new-instance v1, Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v1, p0, Landroidx/recyclerview/widget/k$u;->d:Landroid/widget/OverScroller;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/k$u;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/k$u;->g:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    sget-object v1, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public run()V
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    iget-object v2, v1, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    if-nez v2, :cond_0

    .line 1
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, v0, Landroidx/recyclerview/widget/k$u;->d:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    return-void

    :cond_0
    const/4 v2, 0x0

    .line 2
    iput-boolean v2, v0, Landroidx/recyclerview/widget/k$u;->g:Z

    const/4 v3, 0x1

    iput-boolean v3, v0, Landroidx/recyclerview/widget/k$u;->f:Z

    .line 3
    invoke-virtual {v1}, Landroidx/recyclerview/widget/k;->i()V

    iget-object v1, v0, Landroidx/recyclerview/widget/k$u;->d:Landroid/widget/OverScroller;

    iget-object v4, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    iget-object v4, v4, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v4

    if-eqz v4, :cond_d

    iget-object v4, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    iget-object v4, v4, Landroidx/recyclerview/widget/k;->n0:[I

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v5

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v6

    iget v7, v0, Landroidx/recyclerview/widget/k$u;->b:I

    sub-int v11, v5, v7

    iget v7, v0, Landroidx/recyclerview/widget/k$u;->c:I

    sub-int v12, v6, v7

    iput v5, v0, Landroidx/recyclerview/widget/k$u;->b:I

    iput v6, v0, Landroidx/recyclerview/widget/k$u;->c:I

    iget-object v5, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    const/4 v9, 0x0

    const/4 v10, 0x1

    move v6, v11

    move v7, v12

    move-object v8, v4

    invoke-virtual/range {v5 .. v10}, Landroidx/recyclerview/widget/k;->l(II[I[II)Z

    move-result v5

    if-eqz v5, :cond_1

    aget v5, v4, v2

    sub-int/2addr v11, v5

    aget v4, v4, v3

    sub-int/2addr v12, v4

    :cond_1
    iget-object v4, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v17, 0x0

    const/16 v16, 0x0

    const/4 v15, 0x0

    const/4 v14, 0x0

    iget-object v4, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    iget-object v4, v4, Landroidx/recyclerview/widget/k;->m:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->invalidate()V

    :cond_2
    iget-object v4, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getOverScrollMode()I

    move-result v4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_3

    iget-object v4, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    invoke-virtual {v4, v11, v12}, Landroidx/recyclerview/widget/k;->h(II)V

    :cond_3
    iget-object v13, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    const/16 v18, 0x0

    const/16 v19, 0x1

    invoke-virtual/range {v13 .. v19}, Landroidx/recyclerview/widget/k;->m(IIII[II)Z

    iget-object v4, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    invoke-static {v4}, Landroidx/recyclerview/widget/k;->d(Landroidx/recyclerview/widget/k;)Z

    move-result v4

    if-nez v4, :cond_4

    iget-object v4, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->invalidate()V

    :cond_4
    if-eqz v12, :cond_5

    iget-object v4, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    iget-object v4, v4, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/k$j;->c()Z

    move-result v4

    if-eqz v4, :cond_5

    if-nez v12, :cond_5

    move v4, v3

    goto :goto_0

    :cond_5
    move v4, v2

    :goto_0
    if-eqz v11, :cond_6

    iget-object v5, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    iget-object v5, v5, Landroidx/recyclerview/widget/k;->k:Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v5}, Landroidx/recyclerview/widget/k$j;->b()Z

    move-result v5

    if-eqz v5, :cond_6

    if-nez v11, :cond_6

    move v5, v3

    goto :goto_1

    :cond_6
    move v5, v2

    :goto_1
    if-nez v11, :cond_7

    if-eqz v12, :cond_9

    :cond_7
    if-nez v5, :cond_9

    if-eqz v4, :cond_8

    goto :goto_2

    :cond_8
    move v4, v2

    goto :goto_3

    :cond_9
    :goto_2
    move v4, v3

    :goto_3
    invoke-virtual {v1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v1

    if-nez v1, :cond_b

    if-nez v4, :cond_a

    iget-object v1, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/k;->v(I)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/k$u;->a()V

    iget-object v1, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    iget-object v3, v1, Landroidx/recyclerview/widget/k;->W:Landroidx/recyclerview/widget/e;

    if-eqz v3, :cond_d

    invoke-virtual {v3, v1, v11, v12}, Landroidx/recyclerview/widget/e;->a(Landroidx/recyclerview/widget/k;II)V

    goto :goto_5

    :cond_b
    :goto_4
    iget-object v1, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/k;->setScrollState(I)V

    sget-object v1, Landroidx/recyclerview/widget/k;->s0:[I

    iget-object v1, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    iget-object v1, v1, Landroidx/recyclerview/widget/k;->a0:Landroidx/recyclerview/widget/e$b;

    .line 4
    iget-object v4, v1, Landroidx/recyclerview/widget/e$b;->c:[I

    if-eqz v4, :cond_c

    const/4 v5, -0x1

    invoke-static {v4, v5}, Ljava/util/Arrays;->fill([II)V

    :cond_c
    iput v2, v1, Landroidx/recyclerview/widget/e$b;->d:I

    .line 5
    iget-object v1, v0, Landroidx/recyclerview/widget/k$u;->h:Landroidx/recyclerview/widget/k;

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/k;->a(I)V

    .line 6
    :cond_d
    :goto_5
    iput-boolean v2, v0, Landroidx/recyclerview/widget/k$u;->f:Z

    iget-boolean v1, v0, Landroidx/recyclerview/widget/k$u;->g:Z

    if-eqz v1, :cond_e

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/k$u;->a()V

    :cond_e
    return-void
.end method
