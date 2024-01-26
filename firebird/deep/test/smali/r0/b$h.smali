.class public Lr0/b$h;
.super Lr0/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/b;->k(Landroid/view/ViewGroup;Lr0/o;Lr0/o;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Lr0/b;Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p2, p0, Lr0/b$h;->a:Landroid/view/ViewGroup;

    invoke-direct {p0}, Lr0/j;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lr0/g;)V
    .locals 2

    iget-object v0, p0, Lr0/b$h;->a:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lr0/q;->a(Landroid/view/ViewGroup;Z)V

    invoke-virtual {p1, p0}, Lr0/g;->v(Lr0/g$d;)Lr0/g;

    return-void
.end method

.method public c(Lr0/g;)V
    .locals 1

    iget-object p1, p0, Lr0/b$h;->a:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lr0/q;->a(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public d(Lr0/g;)V
    .locals 1

    iget-object p1, p0, Lr0/b$h;->a:Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lr0/q;->a(Landroid/view/ViewGroup;Z)V

    return-void
.end method
