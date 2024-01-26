.class public Lc/g$c$a;
.super Le0/q;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/g$c;->b(Lf/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lc/g$c;


# direct methods
.method public constructor <init>(Lc/g$c;)V
    .locals 0

    iput-object p1, p0, Lc/g$c$a;->a:Lc/g$c;

    invoke-direct {p0}, Le0/q;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lc/g$c$a;->a:Lc/g$c;

    iget-object p1, p1, Lc/g$c;->b:Lc/g;

    iget-object p1, p1, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Lc/g$c$a;->a:Lc/g$c;

    iget-object p1, p1, Lc/g$c;->b:Lc/g;

    iget-object v0, p1, Lc/g;->q:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lc/g$c$a;->a:Lc/g$c;

    iget-object p1, p1, Lc/g$c;->b:Lc/g;

    iget-object p1, p1, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    sget-object v0, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 2
    :cond_1
    :goto_0
    iget-object p1, p0, Lc/g$c$a;->a:Lc/g$c;

    iget-object p1, p1, Lc/g$c;->b:Lc/g;

    iget-object p1, p1, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object p1, p0, Lc/g$c$a;->a:Lc/g$c;

    iget-object p1, p1, Lc/g$c;->b:Lc/g;

    iget-object p1, p1, Lc/g;->s:Le0/o;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Le0/o;->d(Le0/p;)Le0/o;

    iget-object p1, p0, Lc/g$c$a;->a:Lc/g$c;

    iget-object p1, p1, Lc/g$c;->b:Lc/g;

    iput-object v0, p1, Lc/g;->s:Le0/o;

    iget-object p1, p1, Lc/g;->u:Landroid/view/ViewGroup;

    sget-object v0, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    return-void
.end method
