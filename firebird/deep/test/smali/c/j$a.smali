.class public Lc/j$a;
.super Le0/q;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/j;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lc/j;


# direct methods
.method public constructor <init>(Lc/j;)V
    .locals 0

    iput-object p1, p0, Lc/j$a;->a:Lc/j;

    invoke-direct {p0}, Le0/q;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lc/j$a;->a:Lc/j;

    iget-object p1, p1, Lc/j;->b:Lc/g;

    iget-object p1, p1, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p1, p0, Lc/j$a;->a:Lc/j;

    iget-object p1, p1, Lc/j;->b:Lc/g;

    iget-object p1, p1, Lc/g;->s:Le0/o;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Le0/o;->d(Le0/p;)Le0/o;

    iget-object p1, p0, Lc/j$a;->a:Lc/j;

    iget-object p1, p1, Lc/j;->b:Lc/g;

    iput-object v0, p1, Lc/g;->s:Le0/o;

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lc/j$a;->a:Lc/j;

    iget-object p1, p1, Lc/j;->b:Lc/g;

    iget-object p1, p1, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    return-void
.end method
