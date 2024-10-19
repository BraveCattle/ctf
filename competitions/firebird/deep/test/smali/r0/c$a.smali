.class public Lr0/c$a;
.super Lr0/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/c;->K(Landroid/view/View;FF)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/View;


# direct methods
.method public constructor <init>(Lr0/c;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, Lr0/c$a;->a:Landroid/view/View;

    invoke-direct {p0}, Lr0/j;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lr0/g;)V
    .locals 3

    iget-object v0, p0, Lr0/c$a;->a:Landroid/view/View;

    .line 1
    sget-object v1, Lr0/r;->a:Lq/d;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v0, v2}, Lq/d;->c(Landroid/view/View;F)V

    .line 2
    invoke-virtual {p1, p0}, Lr0/g;->v(Lr0/g$d;)Lr0/g;

    return-void
.end method
