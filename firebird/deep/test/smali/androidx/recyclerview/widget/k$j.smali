.class public abstract Landroidx/recyclerview/widget/k$j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/k$j$c;
    }
.end annotation


# instance fields
.field public a:Landroidx/recyclerview/widget/b;

.field public b:Landroidx/recyclerview/widget/k;

.field public c:Landroidx/recyclerview/widget/q;

.field public d:Landroidx/recyclerview/widget/q;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:I

.field public l:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/recyclerview/widget/k$j$a;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/k$j$a;-><init>(Landroidx/recyclerview/widget/k$j;)V

    new-instance v1, Landroidx/recyclerview/widget/k$j$b;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/k$j$b;-><init>(Landroidx/recyclerview/widget/k$j;)V

    new-instance v2, Landroidx/recyclerview/widget/q;

    invoke-direct {v2, v0}, Landroidx/recyclerview/widget/q;-><init>(Landroidx/recyclerview/widget/q$b;)V

    iput-object v2, p0, Landroidx/recyclerview/widget/k$j;->c:Landroidx/recyclerview/widget/q;

    new-instance v0, Landroidx/recyclerview/widget/q;

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/q;-><init>(Landroidx/recyclerview/widget/q$b;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/k$j;->d:Landroidx/recyclerview/widget/q;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/k$j;->e:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/k$j;->f:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/k$j;->g:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/k$j;->h:Z

    return-void
.end method

.method public static e(III)I
    .locals 2

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p0

    :cond_0
    return p0

    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static y(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/k$j$c;
    .locals 2

    new-instance v0, Landroidx/recyclerview/widget/k$j$c;

    invoke-direct {v0}, Landroidx/recyclerview/widget/k$j$c;-><init>()V

    sget-object v1, Lo0/a;->a:[I

    invoke-virtual {p0, p1, v1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, v0, Landroidx/recyclerview/widget/k$j$c;->a:I

    const/16 p3, 0x9

    invoke-virtual {p0, p3, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, v0, Landroidx/recyclerview/widget/k$j$c;->b:I

    const/16 p2, 0x8

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, v0, Landroidx/recyclerview/widget/k$j$c;->c:Z

    const/16 p2, 0xa

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, v0, Landroidx/recyclerview/widget/k$j$c;->d:Z

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0
.end method


# virtual methods
.method public A()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public B(Landroidx/recyclerview/widget/k;Landroidx/recyclerview/widget/k$p;)V
    .locals 0

    return-void
.end method

.method public C(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    iget-object v1, v0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    iget-object v1, v0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    if-eqz v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    .line 1
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setScrollable(Z)V

    iget-object p1, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_1
    return-void
.end method

.method public D(Landroid/view/View;Lf0/d;)V
    .locals 2

    invoke-static {p1}, Landroidx/recyclerview/widget/k;->u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$v;->i()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->a:Landroidx/recyclerview/widget/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/b;->g(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    iget-object v1, v0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    iget-object v0, v0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    invoke-virtual {p0, v1, v0, p1, p2}, Landroidx/recyclerview/widget/k$j;->E(Landroidx/recyclerview/widget/k$p;Landroidx/recyclerview/widget/k$s;Landroid/view/View;Lf0/d;)V

    :cond_0
    return-void
.end method

.method public E(Landroidx/recyclerview/widget/k$p;Landroidx/recyclerview/widget/k$s;Landroid/view/View;Lf0/d;)V
    .locals 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$j;->c()Z

    move-result p1

    const/4 p2, 0x0

    if-nez p1, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$j;->b()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 v2, 0x0

    const/4 v1, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lf0/d$b;->a(IIIIZZ)Lf0/d$b;

    move-result-object p1

    invoke-virtual {p4, p1}, Lf0/d;->g(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/k$j;->x(Landroid/view/View;)I

    throw p2

    :cond_1
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/k$j;->x(Landroid/view/View;)I

    throw p2
.end method

.method public F(Landroid/os/Parcelable;)V
    .locals 0

    return-void
.end method

.method public G()Landroid/os/Parcelable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public H(I)V
    .locals 0

    return-void
.end method

.method public I(Landroidx/recyclerview/widget/k$p;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$j;->p()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/k$j;->o(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroidx/recyclerview/widget/k;->u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/k$v;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/k$j;->K(ILandroidx/recyclerview/widget/k$p;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    return-void
.end method

.method public J(Landroidx/recyclerview/widget/k$p;)V
    .locals 5

    .line 1
    iget-object v0, p1, Landroidx/recyclerview/widget/k$p;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    :goto_0
    if-ltz v1, :cond_3

    .line 2
    iget-object v2, p1, Landroidx/recyclerview/widget/k$p;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/k$v;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x0

    .line 3
    invoke-static {v2}, Landroidx/recyclerview/widget/k;->u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/recyclerview/widget/k$v;->p()Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroidx/recyclerview/widget/k$v;->o(Z)V

    invoke-virtual {v3}, Landroidx/recyclerview/widget/k$v;->k()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    invoke-virtual {v1, v2, v0}, Landroidx/recyclerview/widget/k;->removeDetachedView(Landroid/view/View;Z)V

    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    iget-object v1, v1, Landroidx/recyclerview/widget/k;->H:Landroidx/recyclerview/widget/k$g;

    if-eqz v1, :cond_2

    check-cast v1, Landroidx/recyclerview/widget/c;

    .line 4
    throw v2

    :cond_2
    const/4 v1, 0x1

    .line 5
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/k$v;->o(Z)V

    .line 6
    invoke-static {v2}, Landroidx/recyclerview/widget/k;->u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;

    move-result-object v1

    iput-object v2, v1, Landroidx/recyclerview/widget/k$v;->j:Landroidx/recyclerview/widget/k$p;

    iput-boolean v0, v1, Landroidx/recyclerview/widget/k$v;->k:Z

    invoke-virtual {v1}, Landroidx/recyclerview/widget/k$v;->c()V

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/k$p;->h(Landroidx/recyclerview/widget/k$v;)V

    throw v2

    .line 7
    :cond_3
    iget-object v1, p1, Landroidx/recyclerview/widget/k$p;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p1, Landroidx/recyclerview/widget/k$p;->b:Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    :cond_4
    if-lez v0, :cond_5

    .line 8
    iget-object p1, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->invalidate()V

    :cond_5
    return-void
.end method

.method public K(ILandroidx/recyclerview/widget/k$p;)V
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/k$j;->o(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/k$j;->L(I)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/k$p;->g(Landroid/view/View;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public L(I)V
    .locals 3

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/k$j;->o(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->a:Landroidx/recyclerview/widget/b;

    .line 1
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/b;->c(I)I

    move-result p1

    iget-object v1, v0, Landroidx/recyclerview/widget/b;->a:Landroidx/recyclerview/widget/b$b;

    check-cast v1, Landroidx/recyclerview/widget/l;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/l;->a(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v0, Landroidx/recyclerview/widget/b;->b:Landroidx/recyclerview/widget/b$a;

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/b$a;->e(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/b;->h(Landroid/view/View;)Z

    :cond_1
    iget-object v0, v0, Landroidx/recyclerview/widget/b;->a:Landroidx/recyclerview/widget/b$b;

    check-cast v0, Landroidx/recyclerview/widget/l;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/l;->c(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public M(Landroidx/recyclerview/widget/k;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 9

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$j;->u()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$j;->w()I

    move-result v2

    .line 2
    iget v3, p0, Landroidx/recyclerview/widget/k$j;->k:I

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$j;->v()I

    move-result v4

    sub-int/2addr v3, v4

    .line 4
    iget v4, p0, Landroidx/recyclerview/widget/k$j;->l:I

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$j;->t()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v5

    iget v6, p3, Landroid/graphics/Rect;->left:I

    add-int/2addr v5, v6

    invoke-virtual {p2}, Landroid/view/View;->getScrollX()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v6

    iget v7, p3, Landroid/graphics/Rect;->top:I

    add-int/2addr v6, v7

    invoke-virtual {p2}, Landroid/view/View;->getScrollY()I

    move-result p2

    sub-int/2addr v6, p2

    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    move-result p2

    add-int/2addr p2, v5

    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result p3

    add-int/2addr p3, v6

    sub-int/2addr v5, v1

    const/4 v1, 0x0

    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v7

    sub-int/2addr v6, v2

    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    move-result v2

    sub-int/2addr p2, v3

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result v3

    sub-int/2addr p3, v4

    invoke-static {v1, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$j;->s()I

    move-result v4

    const/4 v8, 0x1

    if-ne v4, v8, :cond_1

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v7, p2}, Ljava/lang/Math;->max(II)I

    move-result v3

    goto :goto_1

    :cond_1
    if-eqz v7, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    move-result v7

    :goto_0
    move v3, v7

    :goto_1
    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v6, p3}, Ljava/lang/Math;->min(II)I

    move-result v2

    :goto_2
    aput v3, v0, v1

    aput v2, v0, v8

    .line 6
    aget p2, v0, v1

    aget p3, v0, v8

    if-eqz p5, :cond_7

    .line 7
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object p5

    if-nez p5, :cond_5

    :cond_4
    :goto_3
    move p5, v1

    goto :goto_4

    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$j;->u()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$j;->w()I

    move-result v2

    .line 8
    iget v3, p0, Landroidx/recyclerview/widget/k$j;->k:I

    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$j;->v()I

    move-result v4

    sub-int/2addr v3, v4

    .line 10
    iget v4, p0, Landroidx/recyclerview/widget/k$j;->l:I

    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$j;->t()I

    move-result v5

    sub-int/2addr v4, v5

    iget-object v5, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    iget-object v5, v5, Landroidx/recyclerview/widget/k;->h:Landroid/graphics/Rect;

    invoke-virtual {p0, p5, v5}, Landroidx/recyclerview/widget/k$j;->r(Landroid/view/View;Landroid/graphics/Rect;)V

    iget p5, v5, Landroid/graphics/Rect;->left:I

    sub-int/2addr p5, p2

    if-ge p5, v3, :cond_4

    iget p5, v5, Landroid/graphics/Rect;->right:I

    sub-int/2addr p5, p2

    if-le p5, v0, :cond_4

    iget p5, v5, Landroid/graphics/Rect;->top:I

    sub-int/2addr p5, p3

    if-ge p5, v4, :cond_4

    iget p5, v5, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p5, p3

    if-gt p5, v2, :cond_6

    goto :goto_3

    :cond_6
    move p5, v8

    :goto_4
    if-eqz p5, :cond_8

    :cond_7
    if-nez p2, :cond_9

    if-eqz p3, :cond_8

    goto :goto_5

    :cond_8
    return v1

    :cond_9
    :goto_5
    if-eqz p4, :cond_a

    .line 12
    invoke-virtual {p1, p2, p3}, Landroidx/recyclerview/widget/k;->scrollBy(II)V

    goto :goto_6

    :cond_a
    invoke-virtual {p1, p2, p3}, Landroidx/recyclerview/widget/k;->I(II)V

    :goto_6
    return v8
.end method

.method public N()V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->requestLayout()V

    :cond_0
    return-void
.end method

.method public O(Landroidx/recyclerview/widget/k;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    iput-object p1, p0, Landroidx/recyclerview/widget/k$j;->a:Landroidx/recyclerview/widget/b;

    const/4 p1, 0x0

    iput p1, p0, Landroidx/recyclerview/widget/k$j;->k:I

    goto :goto_0

    :cond_0
    iput-object p1, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    iget-object v0, p1, Landroidx/recyclerview/widget/k;->e:Landroidx/recyclerview/widget/b;

    iput-object v0, p0, Landroidx/recyclerview/widget/k$j;->a:Landroidx/recyclerview/widget/b;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/k$j;->k:I

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result p1

    :goto_0
    iput p1, p0, Landroidx/recyclerview/widget/k$j;->l:I

    const/high16 p1, 0x40000000    # 2.0f

    iput p1, p0, Landroidx/recyclerview/widget/k$j;->i:I

    iput p1, p0, Landroidx/recyclerview/widget/k$j;->j:I

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/k;->e(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroidx/recyclerview/widget/k$k;)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f(Landroidx/recyclerview/widget/k$s;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public g(Landroidx/recyclerview/widget/k$s;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public h(Landroidx/recyclerview/widget/k$s;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public i(Landroidx/recyclerview/widget/k$s;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public j(Landroidx/recyclerview/widget/k$s;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public k(Landroidx/recyclerview/widget/k$s;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public abstract l()Landroidx/recyclerview/widget/k$k;
.end method

.method public m(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/k$k;
    .locals 1

    new-instance v0, Landroidx/recyclerview/widget/k$k;

    invoke-direct {v0, p1, p2}, Landroidx/recyclerview/widget/k$k;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public n(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/k$k;
    .locals 1

    instance-of v0, p1, Landroidx/recyclerview/widget/k$k;

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/recyclerview/widget/k$k;

    check-cast p1, Landroidx/recyclerview/widget/k$k;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/k$k;-><init>(Landroidx/recyclerview/widget/k$k;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    new-instance v0, Landroidx/recyclerview/widget/k$k;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/k$k;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_1
    new-instance v0, Landroidx/recyclerview/widget/k$k;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/k$k;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public o(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->a:Landroidx/recyclerview/widget/b;

    if-eqz v0, :cond_0

    .line 1
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/b;->c(I)I

    move-result p1

    iget-object v0, v0, Landroidx/recyclerview/widget/b;->a:Landroidx/recyclerview/widget/b$b;

    check-cast v0, Landroidx/recyclerview/widget/l;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/l;->a(I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public p()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->a:Landroidx/recyclerview/widget/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->b()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public q(Landroidx/recyclerview/widget/k$p;Landroidx/recyclerview/widget/k$s;)I
    .locals 0

    iget-object p1, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public r(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 6

    sget-object v0, Landroidx/recyclerview/widget/k;->s0:[I

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/k$k;

    iget-object v1, v0, Landroidx/recyclerview/widget/k$k;->a:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    iget v3, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v2, v3

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v3

    iget v4, v1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v3, v4

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v3, v4

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v4

    iget v5, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v5

    iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v4, v5

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    invoke-virtual {p2, v2, v3, v4, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public s()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    sget-object v1, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    return v0
.end method

.method public t()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public u()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public v()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public w()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public x(Landroid/view/View;)I
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/k$k;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    .line 1
    throw p1
.end method

.method public z(Landroidx/recyclerview/widget/k$p;Landroidx/recyclerview/widget/k$s;)I
    .locals 0

    iget-object p1, p0, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
