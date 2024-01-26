.class public abstract Landroidx/recyclerview/widget/j;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroidx/recyclerview/widget/k$j;

.field public b:I

.field public final c:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/k$j;Landroidx/recyclerview/widget/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p2, -0x80000000

    iput p2, p0, Landroidx/recyclerview/widget/j;->b:I

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/recyclerview/widget/j;->c:Landroid/graphics/Rect;

    iput-object p1, p0, Landroidx/recyclerview/widget/j;->a:Landroidx/recyclerview/widget/k$j;

    return-void
.end method

.method public static a(Landroidx/recyclerview/widget/k$j;I)Landroidx/recyclerview/widget/j;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1
    new-instance p1, Landroidx/recyclerview/widget/i;

    invoke-direct {p1, p0}, Landroidx/recyclerview/widget/i;-><init>(Landroidx/recyclerview/widget/k$j;)V

    return-object p1

    .line 2
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "invalid orientation"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 3
    :cond_1
    new-instance p1, Landroidx/recyclerview/widget/h;

    invoke-direct {p1, p0}, Landroidx/recyclerview/widget/h;-><init>(Landroidx/recyclerview/widget/k$j;)V

    return-object p1
.end method


# virtual methods
.method public abstract b(Landroid/view/View;)I
.end method

.method public abstract c(Landroid/view/View;)I
.end method

.method public abstract d()I
.end method

.method public abstract e()I
.end method

.method public abstract f()I
.end method
