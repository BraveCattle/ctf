.class public final Lz0/a;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# instance fields
.field public final synthetic a:Lz0/d;


# direct methods
.method public constructor <init>(Lz0/d;)V
    .locals 0

    iput-object p1, p0, Lz0/a;->a:Lz0/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lz0/a;->a:Lz0/d;

    invoke-interface {p1}, Lz0/d;->a()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lz0/a;->a:Lz0/d;

    invoke-interface {p1}, Lz0/d;->b()V

    return-void
.end method
