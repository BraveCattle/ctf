.class public Landroidx/lifecycle/g;
.super Landroid/app/Fragment;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method public static b(Landroid/app/Activity;)V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    invoke-virtual {p0, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v1

    new-instance v2, Landroidx/lifecycle/g;

    invoke-direct {v2}, Landroidx/lifecycle/g;-><init>()V

    invoke-virtual {v1, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/c$a;)V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    instance-of v1, v0, Lm0/d;

    if-eqz v1, :cond_0

    check-cast v0, Lm0/d;

    invoke-interface {v0}, Lm0/d;->a()Landroidx/lifecycle/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/e;->d(Landroidx/lifecycle/c$a;)V

    return-void

    :cond_0
    instance-of v1, v0, Lm0/c;

    if-eqz v1, :cond_1

    check-cast v0, Lm0/c;

    invoke-interface {v0}, Lm0/c;->a()Landroidx/lifecycle/c;

    move-result-object v0

    instance-of v1, v0, Landroidx/lifecycle/e;

    if-eqz v1, :cond_1

    check-cast v0, Landroidx/lifecycle/e;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/e;->d(Landroidx/lifecycle/c$a;)V

    :cond_1
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    sget-object p1, Landroidx/lifecycle/c$a;->ON_CREATE:Landroidx/lifecycle/c$a;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/g;->a(Landroidx/lifecycle/c$a;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    sget-object v0, Landroidx/lifecycle/c$a;->ON_DESTROY:Landroidx/lifecycle/c$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/g;->a(Landroidx/lifecycle/c$a;)V

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    sget-object v0, Landroidx/lifecycle/c$a;->ON_PAUSE:Landroidx/lifecycle/c$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/g;->a(Landroidx/lifecycle/c$a;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    sget-object v0, Landroidx/lifecycle/c$a;->ON_RESUME:Landroidx/lifecycle/c$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/g;->a(Landroidx/lifecycle/c$a;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    sget-object v0, Landroidx/lifecycle/c$a;->ON_START:Landroidx/lifecycle/c$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/g;->a(Landroidx/lifecycle/c$a;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    sget-object v0, Landroidx/lifecycle/c$a;->ON_STOP:Landroidx/lifecycle/c$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/g;->a(Landroidx/lifecycle/c$a;)V

    return-void
.end method
