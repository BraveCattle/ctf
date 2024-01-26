.class public Le0/o$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le0/o;->e(Landroid/view/View;Le0/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Le0/p;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(Le0/o;Le0/p;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, Le0/o$a;->a:Le0/p;

    iput-object p3, p0, Le0/o$a;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Le0/o$a;->a:Le0/p;

    iget-object v0, p0, Le0/o$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Le0/p;->c(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Le0/o$a;->a:Le0/p;

    iget-object v0, p0, Le0/o$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Le0/p;->a(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Le0/o$a;->a:Le0/p;

    iget-object v0, p0, Le0/o$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Le0/p;->b(Landroid/view/View;)V

    return-void
.end method
