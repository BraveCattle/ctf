.class public Landroidx/recyclerview/widget/k$j$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/recyclerview/widget/q$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/k$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/k$j;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/k$j;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/k$j$b;->a:Landroidx/recyclerview/widget/k$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j$b;->a:Landroidx/recyclerview/widget/k$j;

    .line 1
    iget v1, v0, Landroidx/recyclerview/widget/k$j;->l:I

    .line 2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$j;->t()I

    move-result v0

    sub-int/2addr v1, v0

    return v1
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j$b;->a:Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k$j;->w()I

    move-result v0

    return v0
.end method

.method public c(Landroid/view/View;)I
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/k$k;

    iget-object v1, p0, Landroidx/recyclerview/widget/k$j$b;->a:Landroidx/recyclerview/widget/k$j;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v1

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/k$k;

    iget-object p1, p1, Landroidx/recyclerview/widget/k$k;->a:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, p1

    .line 3
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v1, p1

    return v1
.end method

.method public d(Landroid/view/View;)I
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/k$k;

    iget-object v1, p0, Landroidx/recyclerview/widget/k$j$b;->a:Landroidx/recyclerview/widget/k$j;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/k$k;

    iget-object p1, p1, Landroidx/recyclerview/widget/k$k;->a:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, p1

    .line 3
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v1, p1

    return v1
.end method

.method public e(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k$j$b;->a:Landroidx/recyclerview/widget/k$j;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/k$j;->o(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
