.class public Landroidx/activity/ComponentActivity;
.super Lu/f;
.source ""

# interfaces
.implements Lm0/l;
.implements Lq0/b;
.implements La/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/activity/ComponentActivity$b;
    }
.end annotation


# instance fields
.field public final c:Landroidx/lifecycle/e;

.field public final d:Lq0/a;

.field public e:Lm0/k;

.field public final f:Landroidx/activity/OnBackPressedDispatcher;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lu/f;-><init>()V

    new-instance v0, Landroidx/lifecycle/e;

    invoke-direct {v0, p0}, Landroidx/lifecycle/e;-><init>(Lm0/c;)V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->c:Landroidx/lifecycle/e;

    .line 1
    new-instance v1, Lq0/a;

    invoke-direct {v1, p0}, Lq0/a;-><init>(Lq0/b;)V

    .line 2
    iput-object v1, p0, Landroidx/activity/ComponentActivity;->d:Lq0/a;

    new-instance v1, Landroidx/activity/OnBackPressedDispatcher;

    new-instance v2, Landroidx/activity/ComponentActivity$a;

    invoke-direct {v2, p0}, Landroidx/activity/ComponentActivity$a;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-direct {v1, v2}, Landroidx/activity/OnBackPressedDispatcher;-><init>(Ljava/lang/Runnable;)V

    iput-object v1, p0, Landroidx/activity/ComponentActivity;->f:Landroidx/activity/OnBackPressedDispatcher;

    new-instance v1, Landroidx/activity/ComponentActivity$2;

    invoke-direct {v1, p0}, Landroidx/activity/ComponentActivity$2;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->a(Lm0/b;)V

    new-instance v1, Landroidx/activity/ComponentActivity$3;

    invoke-direct {v1, p0}, Landroidx/activity/ComponentActivity$3;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->a(Lm0/b;)V

    return-void
.end method

.method public static synthetic i(Landroidx/activity/ComponentActivity;)V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/c;
    .locals 1

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->c:Landroidx/lifecycle/e;

    return-object v0
.end method

.method public final b()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->f:Landroidx/activity/OnBackPressedDispatcher;

    return-object v0
.end method

.method public final c()Landroidx/savedstate/a;
    .locals 1

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->d:Lq0/a;

    .line 1
    iget-object v0, v0, Lq0/a;->b:Landroidx/savedstate/a;

    return-object v0
.end method

.method public d()Lm0/k;
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lm0/k;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/activity/ComponentActivity$b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/activity/ComponentActivity$b;->a:Lm0/k;

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lm0/k;

    :cond_0
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lm0/k;

    if-nez v0, :cond_1

    new-instance v0, Lm0/k;

    invoke-direct {v0}, Lm0/k;-><init>()V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lm0/k;

    :cond_1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lm0/k;

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->f:Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->a()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lu/f;->onCreate(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->d:Lq0/a;

    invoke-virtual {v0, p1}, Lq0/a;->a(Landroid/os/Bundle;)V

    invoke-static {p0}, Landroidx/lifecycle/g;->b(Landroid/app/Activity;)V

    return-void
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lm0/k;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/activity/ComponentActivity$b;

    if-eqz v1, :cond_0

    iget-object v0, v1, Landroidx/activity/ComponentActivity$b;->a:Lm0/k;

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v1, Landroidx/activity/ComponentActivity$b;

    invoke-direct {v1}, Landroidx/activity/ComponentActivity$b;-><init>()V

    iput-object v0, v1, Landroidx/activity/ComponentActivity$b;->a:Lm0/k;

    return-object v1
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->c:Landroidx/lifecycle/e;

    .line 2
    instance-of v1, v0, Landroidx/lifecycle/e;

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/lifecycle/c$b;->c:Landroidx/lifecycle/c$b;

    .line 3
    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->f(Landroidx/lifecycle/c$b;)V

    .line 4
    :cond_0
    invoke-super {p0, p1}, Lu/f;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->d:Lq0/a;

    invoke-virtual {v0, p1}, Lq0/a;->b(Landroid/os/Bundle;)V

    return-void
.end method
