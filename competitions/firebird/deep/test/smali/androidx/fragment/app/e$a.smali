.class public Landroidx/fragment/app/e$a;
.super La/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Landroidx/fragment/app/e;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/e;Z)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/e$a;->c:Landroidx/fragment/app/e;

    invoke-direct {p0, p2}, La/b;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/e$a;->c:Landroidx/fragment/app/e;

    .line 1
    invoke-virtual {v0}, Landroidx/fragment/app/e;->K()Z

    iget-object v1, v0, Landroidx/fragment/app/e;->k:La/b;

    .line 2
    iget-boolean v1, v1, La/b;->a:Z

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/e;->a()Z

    goto :goto_0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/e;->j:Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->a()V

    :goto_0
    return-void
.end method
