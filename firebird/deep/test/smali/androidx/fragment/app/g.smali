.class public final Landroidx/fragment/app/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/fragment/app/Fragment;

.field public final synthetic c:Landroidx/fragment/app/Fragment;

.field public final synthetic d:Z

.field public final synthetic e:Ll/a;

.field public final synthetic f:Landroid/view/View;

.field public final synthetic g:Lk0/o;

.field public final synthetic h:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLl/a;Landroid/view/View;Lk0/o;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/g;->b:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/Fragment;

    iput-boolean p3, p0, Landroidx/fragment/app/g;->d:Z

    iput-object p4, p0, Landroidx/fragment/app/g;->e:Ll/a;

    iput-object p5, p0, Landroidx/fragment/app/g;->f:Landroid/view/View;

    iput-object p6, p0, Landroidx/fragment/app/g;->g:Lk0/o;

    iput-object p7, p0, Landroidx/fragment/app/g;->h:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/g;->b:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v2, p0, Landroidx/fragment/app/g;->d:Z

    iget-object v3, p0, Landroidx/fragment/app/g;->e:Ll/a;

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/fragment/app/i;->c(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLl/a;Z)V

    iget-object v0, p0, Landroidx/fragment/app/g;->f:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/g;->g:Lk0/o;

    iget-object v2, p0, Landroidx/fragment/app/g;->h:Landroid/graphics/Rect;

    invoke-virtual {v1, v0, v2}, Lk0/o;->i(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_0
    return-void
.end method
