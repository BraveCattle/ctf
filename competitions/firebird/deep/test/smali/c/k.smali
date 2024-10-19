.class public Lc/k;
.super Le0/q;
.source ""


# instance fields
.field public final synthetic a:Lc/g;


# direct methods
.method public constructor <init>(Lc/g;)V
    .locals 0

    iput-object p1, p0, Lc/k;->a:Lc/g;

    invoke-direct {p0}, Le0/q;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lc/k;->a:Lc/g;

    iget-object p1, p1, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p1, p0, Lc/k;->a:Lc/g;

    iget-object p1, p1, Lc/g;->s:Le0/o;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Le0/o;->d(Le0/p;)Le0/o;

    iget-object p1, p0, Lc/k;->a:Lc/g;

    iput-object v0, p1, Lc/g;->s:Le0/o;

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lc/k;->a:Lc/g;

    iget-object p1, p1, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Lc/k;->a:Lc/g;

    iget-object p1, p1, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    iget-object p1, p0, Lc/k;->a:Lc/g;

    iget-object p1, p1, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc/k;->a:Lc/g;

    iget-object p1, p1, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    sget-object v0, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    :cond_0
    return-void
.end method
