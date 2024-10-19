.class public Lh/u;
.super Lh/g0;
.source ""


# instance fields
.field public final synthetic k:Lh/v$d;

.field public final synthetic l:Lh/v;


# direct methods
.method public constructor <init>(Lh/v;Landroid/view/View;Lh/v$d;)V
    .locals 0

    iput-object p1, p0, Lh/u;->l:Lh/v;

    iput-object p3, p0, Lh/u;->k:Lh/v$d;

    invoke-direct {p0, p2}, Lh/g0;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public b()Lg/f;
    .locals 1

    iget-object v0, p0, Lh/u;->k:Lh/v$d;

    return-object v0
.end method

.method public c()Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    iget-object v0, p0, Lh/u;->l:Lh/v;

    invoke-virtual {v0}, Lh/v;->getInternalPopup()Lh/v$f;

    move-result-object v0

    invoke-interface {v0}, Lh/v$f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lh/u;->l:Lh/v;

    invoke-virtual {v0}, Lh/v;->b()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
