.class public Landroidx/appcompat/widget/a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public b:Landroidx/appcompat/widget/a$e;

.field public final synthetic c:Landroidx/appcompat/widget/a;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/a;Landroidx/appcompat/widget/a$e;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/a$c;->c:Landroidx/appcompat/widget/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/a$c;->b:Landroidx/appcompat/widget/a$e;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/a$c;->c:Landroidx/appcompat/widget/a;

    .line 1
    iget-object v0, v0, Landroidx/appcompat/view/menu/a;->d:Landroidx/appcompat/view/menu/e;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, v0, Landroidx/appcompat/view/menu/e;->e:Landroidx/appcompat/view/menu/e$a;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Landroidx/appcompat/view/menu/e$a;->a(Landroidx/appcompat/view/menu/e;)V

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/a$c;->c:Landroidx/appcompat/widget/a;

    .line 4
    iget-object v0, v0, Landroidx/appcompat/view/menu/a;->i:Landroidx/appcompat/view/menu/j;

    .line 5
    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/a$c;->b:Landroidx/appcompat/widget/a$e;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/h;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/a$c;->c:Landroidx/appcompat/widget/a;

    iget-object v1, p0, Landroidx/appcompat/widget/a$c;->b:Landroidx/appcompat/widget/a$e;

    iput-object v1, v0, Landroidx/appcompat/widget/a;->t:Landroidx/appcompat/widget/a$e;

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/a$c;->c:Landroidx/appcompat/widget/a;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/a;->v:Landroidx/appcompat/widget/a$c;

    return-void
.end method
