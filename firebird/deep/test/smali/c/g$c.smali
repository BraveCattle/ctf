.class public Lc/g$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public a:Lf/a$a;

.field public final synthetic b:Lc/g;


# direct methods
.method public constructor <init>(Lc/g;Lf/a$a;)V
    .locals 0

    iput-object p1, p0, Lc/g$c;->b:Lc/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc/g$c;->a:Lf/a$a;

    return-void
.end method


# virtual methods
.method public a(Lf/a;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lc/g$c;->a:Lf/a$a;

    invoke-interface {v0, p1, p2}, Lf/a$a;->a(Lf/a;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public b(Lf/a;)V
    .locals 2

    iget-object v0, p0, Lc/g$c;->a:Lf/a$a;

    invoke-interface {v0, p1}, Lf/a$a;->b(Lf/a;)V

    iget-object p1, p0, Lc/g$c;->b:Lc/g;

    iget-object v0, p1, Lc/g;->q:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lc/g;->f:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lc/g$c;->b:Lc/g;

    iget-object v0, v0, Lc/g;->r:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Lc/g$c;->b:Lc/g;

    iget-object v0, p1, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lc/g;->I()V

    iget-object p1, p0, Lc/g$c;->b:Lc/g;

    iget-object v0, p1, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Le0/m;->a(Landroid/view/View;)Le0/o;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Le0/o;->a(F)Le0/o;

    iput-object v0, p1, Lc/g;->s:Le0/o;

    iget-object p1, p0, Lc/g$c;->b:Lc/g;

    iget-object p1, p1, Lc/g;->s:Le0/o;

    new-instance v0, Lc/g$c$a;

    invoke-direct {v0, p0}, Lc/g$c$a;-><init>(Lc/g$c;)V

    .line 1
    iget-object v1, p1, Le0/o;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_1

    invoke-virtual {p1, v1, v0}, Le0/o;->e(Landroid/view/View;Le0/p;)V

    .line 2
    :cond_1
    iget-object p1, p0, Lc/g$c;->b:Lc/g;

    iget-object v0, p1, Lc/g;->h:Lc/d;

    if-eqz v0, :cond_2

    iget-object p1, p1, Lc/g;->o:Lf/a;

    invoke-interface {v0, p1}, Lc/d;->e(Lf/a;)V

    :cond_2
    iget-object p1, p0, Lc/g$c;->b:Lc/g;

    const/4 v0, 0x0

    iput-object v0, p1, Lc/g;->o:Lf/a;

    iget-object p1, p1, Lc/g;->u:Landroid/view/ViewGroup;

    sget-object v0, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    return-void
.end method

.method public c(Lf/a;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lc/g$c;->a:Lf/a$a;

    invoke-interface {v0, p1, p2}, Lf/a$a;->c(Lf/a;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public d(Lf/a;Landroid/view/Menu;)Z
    .locals 2

    iget-object v0, p0, Lc/g$c;->b:Lc/g;

    iget-object v0, v0, Lc/g;->u:Landroid/view/ViewGroup;

    sget-object v1, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-virtual {v0}, Landroid/view/View;->requestApplyInsets()V

    .line 2
    iget-object v0, p0, Lc/g$c;->a:Lf/a$a;

    invoke-interface {v0, p1, p2}, Lf/a$a;->d(Lf/a;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
