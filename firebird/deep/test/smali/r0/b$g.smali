.class public Lr0/b$g;
.super Landroid/animation/AnimatorListenerAdapter;
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
.field private mViewBounds:Lr0/b$i;


# direct methods
.method public constructor <init>(Lr0/b;Lr0/b$i;)V
    .locals 0

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p2, p0, Lr0/b$g;->mViewBounds:Lr0/b$i;

    return-void
.end method
