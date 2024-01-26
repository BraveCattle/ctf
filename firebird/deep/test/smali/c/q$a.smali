.class public Lc/q$a;
.super Le0/q;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lc/q;


# direct methods
.method public constructor <init>(Lc/q;)V
    .locals 0

    iput-object p1, p0, Lc/q$a;->a:Lc/q;

    invoke-direct {p0}, Le0/q;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lc/q$a;->a:Lc/q;

    iget-boolean v0, p1, Lc/q;->p:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lc/q;->g:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Lc/q$a;->a:Lc/q;

    iget-object p1, p1, Lc/q;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    :cond_0
    iget-object p1, p0, Lc/q$a;->a:Lc/q;

    iget-object p1, p1, Lc/q;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object p1, p0, Lc/q$a;->a:Lc/q;

    iget-object p1, p1, Lc/q;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    iget-object p1, p0, Lc/q$a;->a:Lc/q;

    const/4 v0, 0x0

    iput-object v0, p1, Lc/q;->t:Lf/h;

    .line 1
    iget-object v1, p1, Lc/q;->k:Lf/a$a;

    if-eqz v1, :cond_1

    iget-object v2, p1, Lc/q;->j:Lf/a;

    invoke-interface {v1, v2}, Lf/a$a;->b(Lf/a;)V

    iput-object v0, p1, Lc/q;->j:Lf/a;

    iput-object v0, p1, Lc/q;->k:Lf/a$a;

    .line 2
    :cond_1
    iget-object p1, p0, Lc/q$a;->a:Lc/q;

    iget-object p1, p1, Lc/q;->c:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_2

    sget-object v0, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    :cond_2
    return-void
.end method
