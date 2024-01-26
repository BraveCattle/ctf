.class public final Lc/g$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/appcompat/view/menu/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "j"
.end annotation


# instance fields
.field public final synthetic b:Lc/g;


# direct methods
.method public constructor <init>(Lc/g;)V
    .locals 0

    iput-object p1, p0, Lc/g$j;->b:Lc/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroidx/appcompat/view/menu/e;Z)V
    .locals 4

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->k()Landroidx/appcompat/view/menu/e;

    move-result-object v0

    const/4 v1, 0x1

    if-eq v0, p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lc/g$j;->b:Lc/g;

    if-eqz v2, :cond_1

    move-object p1, v0

    :cond_1
    invoke-virtual {v3, p1}, Lc/g;->L(Landroid/view/Menu;)Lc/g$i;

    move-result-object p1

    if-eqz p1, :cond_3

    if-eqz v2, :cond_2

    iget-object p2, p0, Lc/g$j;->b:Lc/g;

    iget v2, p1, Lc/g$i;->a:I

    invoke-virtual {p2, v2, p1, v0}, Lc/g;->C(ILc/g$i;Landroid/view/Menu;)V

    iget-object p2, p0, Lc/g$j;->b:Lc/g;

    invoke-virtual {p2, p1, v1}, Lc/g;->E(Lc/g$i;Z)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lc/g$j;->b:Lc/g;

    invoke-virtual {v0, p1, p2}, Lc/g;->E(Lc/g$i;Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public c(Landroidx/appcompat/view/menu/e;)Z
    .locals 2

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->k()Landroidx/appcompat/view/menu/e;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lc/g$j;->b:Lc/g;

    iget-boolean v1, v0, Lc/g;->z:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lc/g;->O()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lc/g$j;->b:Lc/g;

    iget-boolean v1, v1, Lc/g;->L:Z

    if-nez v1, :cond_0

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
