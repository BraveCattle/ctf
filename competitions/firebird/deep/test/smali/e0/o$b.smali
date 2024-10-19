.class public Le0/o$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le0/o;->f(Le0/r;)Le0/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Le0/r;


# direct methods
.method public constructor <init>(Le0/o;Le0/r;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, Le0/o$b;->a:Le0/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 0

    iget-object p1, p0, Le0/o$b;->a:Le0/r;

    check-cast p1, Lc/q$c;

    .line 1
    iget-object p1, p1, Lc/q$c;->a:Lc/q;

    iget-object p1, p1, Lc/q;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
