.class public Lk0/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm0/c;


# instance fields
.field public b:Landroidx/lifecycle/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lk0/p;->b:Landroidx/lifecycle/e;

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/p;->b:Landroidx/lifecycle/e;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/e;

    invoke-direct {v0, p0}, Landroidx/lifecycle/e;-><init>(Lm0/c;)V

    iput-object v0, p0, Lk0/p;->b:Landroidx/lifecycle/e;

    .line 2
    :cond_0
    iget-object v0, p0, Lk0/p;->b:Landroidx/lifecycle/e;

    return-object v0
.end method
