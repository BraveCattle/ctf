.class public Lc/q$b;
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

    iput-object p1, p0, Lc/q$b;->a:Lc/q;

    invoke-direct {p0}, Le0/q;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lc/q$b;->a:Lc/q;

    const/4 v0, 0x0

    iput-object v0, p1, Lc/q;->t:Lf/h;

    iget-object p1, p1, Lc/q;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method
