.class public Landroidx/recyclerview/widget/n;
.super Le0/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/n$a;
    }
.end annotation


# instance fields
.field public final d:Landroidx/recyclerview/widget/k;

.field public final e:Le0/a;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/k;)V
    .locals 0

    invoke-direct {p0}, Le0/a;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/n;->d:Landroidx/recyclerview/widget/k;

    new-instance p1, Landroidx/recyclerview/widget/n$a;

    invoke-direct {p1, p0}, Landroidx/recyclerview/widget/n$a;-><init>(Landroidx/recyclerview/widget/n;)V

    iput-object p1, p0, Landroidx/recyclerview/widget/n;->e:Le0/a;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le0/a;->a:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    const-class v0, Landroidx/recyclerview/widget/k;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    instance-of v0, p1, Landroidx/recyclerview/widget/k;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/n;->d()Z

    move-result v0

    if-nez v0, :cond_0

    check-cast p1, Landroidx/recyclerview/widget/k;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k;->getLayoutManager()Landroidx/recyclerview/widget/k$j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k;->getLayoutManager()Landroidx/recyclerview/widget/k$j;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/k$j;->C(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_0
    return-void
.end method

.method public b(Landroid/view/View;Lf0/d;)V
    .locals 5

    .line 1
    iget-object v0, p0, Le0/a;->a:Landroid/view/View$AccessibilityDelegate;

    .line 2
    iget-object v1, p2, Lf0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 3
    invoke-virtual {v0, p1, v1}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 4
    const-class p1, Landroidx/recyclerview/widget/k;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    .line 5
    iget-object v0, p2, Lf0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/n;->d()Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Landroidx/recyclerview/widget/n;->d:Landroidx/recyclerview/widget/k;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k;->getLayoutManager()Landroidx/recyclerview/widget/k$j;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Landroidx/recyclerview/widget/n;->d:Landroidx/recyclerview/widget/k;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k;->getLayoutManager()Landroidx/recyclerview/widget/k$j;

    move-result-object p1

    .line 7
    iget-object v0, p1, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    iget-object v1, v0, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    iget-object v2, v0, Landroidx/recyclerview/widget/k;->b0:Landroidx/recyclerview/widget/k$s;

    const/4 v3, -0x1

    .line 8
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result v0

    const/4 v4, 0x1

    if-nez v0, :cond_0

    iget-object v0, p1, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/16 v0, 0x2000

    .line 9
    iget-object v3, p2, Lf0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 10
    iget-object v0, p2, Lf0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 11
    :cond_1
    iget-object v0, p1, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p1, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/16 v0, 0x1000

    .line 12
    iget-object v3, p2, Lf0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 13
    iget-object v0, p2, Lf0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 14
    :cond_3
    invoke-virtual {p1, v1, v2}, Landroidx/recyclerview/widget/k$j;->z(Landroidx/recyclerview/widget/k$p;Landroidx/recyclerview/widget/k$s;)I

    move-result v0

    invoke-virtual {p1, v1, v2}, Landroidx/recyclerview/widget/k$j;->q(Landroidx/recyclerview/widget/k$p;Landroidx/recyclerview/widget/k$s;)I

    move-result p1

    const/4 v1, 0x0

    .line 15
    invoke-static {v0, p1, v1, v1}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZI)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    move-result-object p1

    .line 16
    iget-object p2, p2, Lf0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    :cond_4
    return-void
.end method

.method public c(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 3

    invoke-super {p0, p1, p2, p3}, Le0/a;->c(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    const/4 p3, 0x1

    if-eqz p1, :cond_0

    return p3

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/n;->d()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_7

    iget-object p1, p0, Landroidx/recyclerview/widget/n;->d:Landroidx/recyclerview/widget/k;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k;->getLayoutManager()Landroidx/recyclerview/widget/k$j;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Landroidx/recyclerview/widget/n;->d:Landroidx/recyclerview/widget/k;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k;->getLayoutManager()Landroidx/recyclerview/widget/k$j;

    move-result-object p1

    .line 1
    iget-object v1, p1, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    iget-object v2, v1, Landroidx/recyclerview/widget/k;->b:Landroidx/recyclerview/widget/k$p;

    const/16 v2, 0x1000

    if-eq p2, v2, :cond_3

    const/16 v2, 0x2000

    if-eq p2, v2, :cond_1

    move p2, v0

    move v1, p2

    goto :goto_2

    :cond_1
    const/4 p2, -0x1

    .line 2
    invoke-virtual {v1, p2}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 3
    iget v1, p1, Landroidx/recyclerview/widget/k$j;->l:I

    .line 4
    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$j;->w()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$j;->t()I

    move-result v2

    sub-int/2addr v1, v2

    neg-int v1, v1

    goto :goto_0

    :cond_2
    move v1, v0

    :goto_0
    iget-object v2, p1, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    invoke-virtual {v2, p2}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 5
    iget p2, p1, Landroidx/recyclerview/widget/k$j;->k:I

    .line 6
    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$j;->u()I

    move-result v2

    sub-int/2addr p2, v2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$j;->v()I

    move-result v2

    sub-int/2addr p2, v2

    neg-int p2, p2

    goto :goto_2

    :cond_3
    invoke-virtual {v1, p3}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 7
    iget p2, p1, Landroidx/recyclerview/widget/k$j;->l:I

    .line 8
    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$j;->w()I

    move-result v1

    sub-int/2addr p2, v1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$j;->t()I

    move-result v1

    sub-int/2addr p2, v1

    move v1, p2

    goto :goto_1

    :cond_4
    move v1, v0

    :goto_1
    iget-object p2, p1, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    invoke-virtual {p2, p3}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 9
    iget p2, p1, Landroidx/recyclerview/widget/k$j;->k:I

    .line 10
    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$j;->u()I

    move-result v2

    sub-int/2addr p2, v2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/k$j;->v()I

    move-result v2

    sub-int/2addr p2, v2

    goto :goto_2

    :cond_5
    move p2, v0

    :goto_2
    if-nez v1, :cond_6

    if-nez p2, :cond_6

    move p3, v0

    goto :goto_3

    :cond_6
    iget-object p1, p1, Landroidx/recyclerview/widget/k$j;->b:Landroidx/recyclerview/widget/k;

    invoke-virtual {p1, p2, v1}, Landroidx/recyclerview/widget/k;->I(II)V

    :goto_3
    return p3

    :cond_7
    return v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/n;->d:Landroidx/recyclerview/widget/k;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->w()Z

    move-result v0

    return v0
.end method
