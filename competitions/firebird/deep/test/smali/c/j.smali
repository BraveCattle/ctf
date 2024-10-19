.class public Lc/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/g;


# direct methods
.method public constructor <init>(Lc/g;)V
    .locals 0

    iput-object p1, p0, Lc/j;->b:Lc/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lc/j;->b:Lc/g;

    iget-object v1, v0, Lc/g;->q:Landroid/widget/PopupWindow;

    iget-object v0, v0, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v2, 0x37

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    iget-object v0, p0, Lc/j;->b:Lc/g;

    invoke-virtual {v0}, Lc/g;->I()V

    iget-object v0, p0, Lc/j;->b:Lc/g;

    invoke-virtual {v0}, Lc/g;->V()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/j;->b:Lc/g;

    iget-object v0, v0, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object v0, p0, Lc/j;->b:Lc/g;

    iget-object v2, v0, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v2}, Le0/m;->a(Landroid/view/View;)Le0/o;

    move-result-object v2

    invoke-virtual {v2, v1}, Le0/o;->a(F)Le0/o;

    iput-object v2, v0, Lc/g;->s:Le0/o;

    iget-object v0, p0, Lc/j;->b:Lc/g;

    iget-object v0, v0, Lc/g;->s:Le0/o;

    new-instance v1, Lc/j$a;

    invoke-direct {v1, p0}, Lc/j$a;-><init>(Lc/j;)V

    .line 1
    iget-object v2, v0, Le0/o;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2, v1}, Le0/o;->e(Landroid/view/View;Le0/p;)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lc/j;->b:Lc/g;

    iget-object v0, v0, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object v0, p0, Lc/j;->b:Lc/g;

    iget-object v0, v0, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method
