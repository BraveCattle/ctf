.class public Lr0/v;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# instance fields
.field public final synthetic a:Lr0/p;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(Lr0/w;Lr0/p;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, Lr0/v;->a:Lr0/p;

    iput-object p3, p0, Lr0/v;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lr0/v;->a:Lr0/p;

    iget-object v0, p0, Lr0/v;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lr0/p;->a(Landroid/view/View;)V

    return-void
.end method
