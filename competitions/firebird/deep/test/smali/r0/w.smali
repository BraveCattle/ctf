.class public abstract Lr0/w;
.super Lr0/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr0/w$a;,
        Lr0/w$b;
    }
.end annotation


# static fields
.field public static final y:[Ljava/lang/String;


# instance fields
.field public x:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "android:visibility:visibility"

    const-string v1, "android:visibility:parent"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lr0/w;->y:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lr0/g;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lr0/w;->x:I

    return-void
.end method


# virtual methods
.method public final H(Lr0/o;)V
    .locals 3

    iget-object v0, p1, Lr0/o;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    iget-object v1, p1, Lr0/o;->a:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "android:visibility:visibility"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lr0/o;->a:Ljava/util/Map;

    iget-object v1, p1, Lr0/o;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const-string v2, "android:visibility:parent"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v1, p1, Lr0/o;->b:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p1, p1, Lr0/o;->a:Ljava/util/Map;

    const-string v1, "android:visibility:screenLocation"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final I(Lr0/o;Lr0/o;)Lr0/w$b;
    .locals 7

    new-instance v0, Lr0/w$b;

    invoke-direct {v0}, Lr0/w$b;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lr0/w$b;->a:Z

    iput-boolean v1, v0, Lr0/w$b;->b:Z

    const-string v2, "android:visibility:parent"

    const/4 v3, 0x0

    const/4 v4, -0x1

    const-string v5, "android:visibility:visibility"

    if-eqz p1, :cond_0

    iget-object v6, p1, Lr0/o;->a:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    iget-object v6, p1, Lr0/o;->a:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iput v6, v0, Lr0/w$b;->c:I

    iget-object v6, p1, Lr0/o;->a:Ljava/util/Map;

    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    iput-object v6, v0, Lr0/w$b;->e:Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    iput v4, v0, Lr0/w$b;->c:I

    iput-object v3, v0, Lr0/w$b;->e:Landroid/view/ViewGroup;

    :goto_0
    if-eqz p2, :cond_1

    iget-object v6, p2, Lr0/o;->a:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v3, p2, Lr0/o;->a:Ljava/util/Map;

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iput v3, v0, Lr0/w$b;->d:I

    iget-object v3, p2, Lr0/o;->a:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, v0, Lr0/w$b;->f:Landroid/view/ViewGroup;

    goto :goto_1

    :cond_1
    iput v4, v0, Lr0/w$b;->d:I

    iput-object v3, v0, Lr0/w$b;->f:Landroid/view/ViewGroup;

    :goto_1
    const/4 v2, 0x1

    if-eqz p1, :cond_6

    if-eqz p2, :cond_6

    iget p1, v0, Lr0/w$b;->c:I

    iget p2, v0, Lr0/w$b;->d:I

    if-ne p1, p2, :cond_2

    iget-object v3, v0, Lr0/w$b;->e:Landroid/view/ViewGroup;

    iget-object v4, v0, Lr0/w$b;->f:Landroid/view/ViewGroup;

    if-ne v3, v4, :cond_2

    return-object v0

    :cond_2
    if-eq p1, p2, :cond_4

    if-nez p1, :cond_3

    goto :goto_4

    :cond_3
    if-nez p2, :cond_8

    goto :goto_2

    :cond_4
    iget-object p1, v0, Lr0/w$b;->f:Landroid/view/ViewGroup;

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    iget-object p1, v0, Lr0/w$b;->e:Landroid/view/ViewGroup;

    if-nez p1, :cond_8

    goto :goto_2

    :cond_6
    if-nez p1, :cond_7

    iget p1, v0, Lr0/w$b;->d:I

    if-nez p1, :cond_7

    :goto_2
    iput-boolean v2, v0, Lr0/w$b;->b:Z

    :goto_3
    iput-boolean v2, v0, Lr0/w$b;->a:Z

    goto :goto_5

    :cond_7
    if-nez p2, :cond_8

    iget p1, v0, Lr0/w$b;->c:I

    if-nez p1, :cond_8

    :goto_4
    iput-boolean v1, v0, Lr0/w$b;->b:Z

    goto :goto_3

    :cond_8
    :goto_5
    return-object v0
.end method

.method public abstract J(Landroid/view/ViewGroup;Landroid/view/View;Lr0/o;Lr0/o;)Landroid/animation/Animator;
.end method

.method public d(Lr0/o;)V
    .locals 0

    invoke-virtual {p0, p1}, Lr0/w;->H(Lr0/o;)V

    return-void
.end method

.method public k(Landroid/view/ViewGroup;Lr0/o;Lr0/o;)Landroid/animation/Animator;
    .locals 9

    invoke-virtual {p0, p2, p3}, Lr0/w;->I(Lr0/o;Lr0/o;)Lr0/w$b;

    move-result-object v0

    iget-boolean v1, v0, Lr0/w$b;->a:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_16

    iget-object v1, v0, Lr0/w$b;->e:Landroid/view/ViewGroup;

    if-nez v1, :cond_0

    iget-object v1, v0, Lr0/w$b;->f:Landroid/view/ViewGroup;

    if-eqz v1, :cond_16

    :cond_0
    iget-boolean v1, v0, Lr0/w$b;->b:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_6

    .line 1
    iget p1, p0, Lr0/w;->x:I

    and-int/2addr p1, v4

    if-ne p1, v4, :cond_5

    if-nez p3, :cond_1

    goto :goto_2

    :cond_1
    if-nez p2, :cond_2

    iget-object p1, p3, Lr0/o;->b:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1, v3}, Lr0/g;->n(Landroid/view/View;Z)Lr0/o;

    move-result-object v0

    invoke-virtual {p0, p1, v3}, Lr0/g;->q(Landroid/view/View;Z)Lr0/o;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lr0/w;->I(Lr0/o;Lr0/o;)Lr0/w$b;

    move-result-object p1

    iget-boolean p1, p1, Lr0/w$b;->a:Z

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    iget-object p1, p3, Lr0/o;->b:Landroid/view/View;

    move-object p3, p0

    check-cast p3, Lr0/c;

    const/4 v0, 0x0

    if-eqz p2, :cond_3

    .line 2
    iget-object p2, p2, Lr0/o;->a:Ljava/util/Map;

    const-string v1, "android:fade:transitionAlpha"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    goto :goto_0

    :cond_3
    move p2, v0

    :goto_0
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v2, p2, v1

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    move v0, p2

    .line 3
    :goto_1
    invoke-virtual {p3, p1, v0, v1}, Lr0/c;->K(Landroid/view/View;FF)Landroid/animation/Animator;

    move-result-object v2

    :cond_5
    :goto_2
    return-object v2

    .line 4
    :cond_6
    iget v0, v0, Lr0/w$b;->d:I

    .line 5
    iget v1, p0, Lr0/w;->x:I

    const/4 v5, 0x2

    and-int/2addr v1, v5

    if-eq v1, v5, :cond_7

    goto/16 :goto_a

    :cond_7
    if-eqz p2, :cond_8

    iget-object v1, p2, Lr0/o;->b:Landroid/view/View;

    goto :goto_3

    :cond_8
    move-object v1, v2

    :goto_3
    if-eqz p3, :cond_9

    iget-object v6, p3, Lr0/o;->b:Landroid/view/View;

    goto :goto_4

    :cond_9
    move-object v6, v2

    :goto_4
    if-eqz v6, :cond_d

    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    if-nez v7, :cond_a

    goto :goto_6

    :cond_a
    const/4 v7, 0x4

    if-ne v0, v7, :cond_b

    goto :goto_5

    :cond_b
    if-ne v1, v6, :cond_c

    :goto_5
    move-object v1, v2

    goto :goto_9

    :cond_c
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    goto :goto_7

    :cond_d
    :goto_6
    if-eqz v6, :cond_e

    move-object v1, v6

    goto :goto_8

    :cond_e
    if-eqz v1, :cond_12

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    if-nez v6, :cond_f

    goto :goto_8

    :cond_f
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    instance-of v6, v6, Landroid/view/View;

    if-eqz v6, :cond_12

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    invoke-virtual {p0, v6, v4}, Lr0/g;->q(Landroid/view/View;Z)Lr0/o;

    move-result-object v7

    invoke-virtual {p0, v6, v4}, Lr0/g;->n(Landroid/view/View;Z)Lr0/o;

    move-result-object v8

    invoke-virtual {p0, v7, v8}, Lr0/w;->I(Lr0/o;Lr0/o;)Lr0/w$b;

    move-result-object v7

    iget-boolean v7, v7, Lr0/w$b;->a:Z

    if-nez v7, :cond_10

    :goto_7
    invoke-static {p1, v1, v6}, Lr0/n;->a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)Landroid/view/View;

    move-result-object v1

    goto :goto_8

    :cond_10
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_11

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v1

    const/4 v6, -0x1

    if-eq v1, v6, :cond_11

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    :cond_11
    move-object v1, v2

    :goto_8
    move-object v6, v2

    goto :goto_9

    :cond_12
    move-object v1, v2

    move-object v6, v1

    :goto_9
    if-eqz v1, :cond_14

    if-eqz p2, :cond_14

    iget-object v0, p2, Lr0/o;->a:Ljava/util/Map;

    const-string v2, "android:visibility:screenLocation"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    aget v2, v0, v3

    aget v0, v0, v4

    new-array v5, v5, [I

    invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    aget v3, v5, v3

    sub-int/2addr v2, v3

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/view/View;->offsetLeftAndRight(I)V

    aget v2, v5, v4

    sub-int/2addr v0, v2

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 6
    new-instance v0, Lk0/d;

    invoke-direct {v0, p1}, Lk0/d;-><init>(Landroid/view/ViewGroup;)V

    .line 7
    iget-object v2, v0, Lk0/d;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/ViewGroupOverlay;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 8
    invoke-virtual {p0, p1, v1, p2, p3}, Lr0/w;->J(Landroid/view/ViewGroup;Landroid/view/View;Lr0/o;Lr0/o;)Landroid/animation/Animator;

    move-result-object v2

    if-nez v2, :cond_13

    .line 9
    iget-object p1, v0, Lk0/d;->b:Ljava/lang/Object;

    check-cast p1, Landroid/view/ViewGroupOverlay;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    goto :goto_a

    .line 10
    :cond_13
    new-instance p1, Lr0/v;

    invoke-direct {p1, p0, v0, v1}, Lr0/v;-><init>(Lr0/w;Lr0/p;Landroid/view/View;)V

    invoke-virtual {v2, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_a

    :cond_14
    if-eqz v6, :cond_16

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v1

    invoke-static {v6, v3}, Lr0/r;->c(Landroid/view/View;I)V

    invoke-virtual {p0, p1, v6, p2, p3}, Lr0/w;->J(Landroid/view/ViewGroup;Landroid/view/View;Lr0/o;Lr0/o;)Landroid/animation/Animator;

    move-result-object v2

    if-eqz v2, :cond_15

    new-instance p1, Lr0/w$a;

    invoke-direct {p1, v6, v0, v4}, Lr0/w$a;-><init>(Landroid/view/View;IZ)V

    invoke-virtual {v2, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 11
    invoke-virtual {v2, p1}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    .line 12
    invoke-virtual {p0, p1}, Lr0/g;->a(Lr0/g$d;)Lr0/g;

    goto :goto_a

    :cond_15
    invoke-static {v6, v1}, Lr0/r;->c(Landroid/view/View;I)V

    :cond_16
    :goto_a
    return-object v2
.end method

.method public p()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lr0/w;->y:[Ljava/lang/String;

    return-object v0
.end method

.method public r(Lr0/o;Lr0/o;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    iget-object v1, p2, Lr0/o;->a:Ljava/util/Map;

    const-string v2, "android:visibility:visibility"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    iget-object v3, p1, Lr0/o;->a:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eq v1, v2, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lr0/w;->I(Lr0/o;Lr0/o;)Lr0/w$b;

    move-result-object p1

    iget-boolean p2, p1, Lr0/w$b;->a:Z

    if-eqz p2, :cond_3

    iget p2, p1, Lr0/w$b;->c:I

    if-eqz p2, :cond_2

    iget p1, p1, Lr0/w$b;->d:I

    if-nez p1, :cond_3

    :cond_2
    const/4 v0, 0x1

    :cond_3
    return v0
.end method
