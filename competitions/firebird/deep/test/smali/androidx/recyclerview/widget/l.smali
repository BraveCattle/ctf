.class public Landroidx/recyclerview/widget/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/recyclerview/widget/b$b;


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/k;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/l;->a:Landroidx/recyclerview/widget/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/l;->a:Landroidx/recyclerview/widget/k;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/l;->a:Landroidx/recyclerview/widget/k;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    return v0
.end method

.method public c(I)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/l;->a:Landroidx/recyclerview/widget/k;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/l;->a:Landroidx/recyclerview/widget/k;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-static {v0}, Landroidx/recyclerview/widget/k;->u(Landroid/view/View;)Landroidx/recyclerview/widget/k$v;

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/l;->a:Landroidx/recyclerview/widget/k;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    return-void
.end method
