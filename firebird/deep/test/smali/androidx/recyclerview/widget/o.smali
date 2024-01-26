.class public Landroidx/recyclerview/widget/o;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroidx/recyclerview/widget/k$s;Landroidx/recyclerview/widget/j;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/k$j;Z)I
    .locals 1

    invoke-virtual {p4}, Landroidx/recyclerview/widget/k$j;->p()I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$s;->a()I

    move-result p0

    if-eqz p0, :cond_2

    if-eqz p2, :cond_2

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p5, :cond_1

    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/j;->b(Landroid/view/View;)I

    move-result p0

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/j;->c(Landroid/view/View;)I

    move-result p2

    sub-int/2addr p0, p2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/j;->f()I

    move-result p1

    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0

    :cond_1
    invoke-virtual {p4, p2}, Landroidx/recyclerview/widget/k$j;->x(Landroid/view/View;)I

    const/4 p0, 0x0

    throw p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(Landroidx/recyclerview/widget/k$s;Landroidx/recyclerview/widget/j;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/k$j;ZZ)I
    .locals 0

    invoke-virtual {p4}, Landroidx/recyclerview/widget/k$j;->p()I

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$s;->a()I

    move-result p0

    if-eqz p0, :cond_1

    if-eqz p2, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p4, p2}, Landroidx/recyclerview/widget/k$j;->x(Landroid/view/View;)I

    const/4 p0, 0x0

    throw p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static c(Landroidx/recyclerview/widget/k$s;Landroidx/recyclerview/widget/j;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/k$j;Z)I
    .locals 1

    invoke-virtual {p4}, Landroidx/recyclerview/widget/k$j;->p()I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$s;->a()I

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_2

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    if-nez p5, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/k$s;->a()I

    move-result p0

    return p0

    :cond_1
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/j;->b(Landroid/view/View;)I

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/j;->c(Landroid/view/View;)I

    invoke-virtual {p4, p2}, Landroidx/recyclerview/widget/k$j;->x(Landroid/view/View;)I

    const/4 p0, 0x0

    throw p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method
