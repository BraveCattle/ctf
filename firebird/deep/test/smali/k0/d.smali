.class public Lk0/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr0/p;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk0/e<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk0/d;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lk0/d;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lk0/d;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p1

    iput-object p1, p0, Lk0/d;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lk0/e;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk0/d;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk0/d;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lk0/d;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewGroupOverlay;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lk0/d;->b:Ljava/lang/Object;

    check-cast v0, Lk0/e;

    iget-object v0, v0, Lk0/e;->f:Landroidx/fragment/app/e;

    invoke-virtual {v0}, Landroidx/fragment/app/e;->X()V

    return-void
.end method
