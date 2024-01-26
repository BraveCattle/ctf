.class public Lk0/b$a;
.super Lk0/e;
.source ""

# interfaces
.implements Lm0/l;
.implements La/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk0/e<",
        "Lk0/b;",
        ">;",
        "Lm0/l;",
        "La/c;"
    }
.end annotation


# instance fields
.field public final synthetic g:Lk0/b;


# direct methods
.method public constructor <init>(Lk0/b;)V
    .locals 0

    iput-object p1, p0, Lk0/b$a;->g:Lk0/b;

    invoke-direct {p0, p1}, Lk0/e;-><init>(Lk0/b;)V

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/c;
    .locals 1

    iget-object v0, p0, Lk0/b$a;->g:Lk0/b;

    iget-object v0, v0, Lk0/b;->h:Landroidx/lifecycle/e;

    return-object v0
.end method

.method public b()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1

    iget-object v0, p0, Lk0/b$a;->g:Lk0/b;

    .line 1
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->f:Landroidx/activity/OnBackPressedDispatcher;

    return-object v0
.end method

.method public d()Lm0/k;
    .locals 1

    iget-object v0, p0, Lk0/b$a;->g:Lk0/b;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->d()Lm0/k;

    move-result-object v0

    return-object v0
.end method

.method public e(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lk0/b$a;->g:Lk0/b;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lk0/b$a;->g:Lk0/b;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g(Landroidx/fragment/app/Fragment;)V
    .locals 0

    iget-object p1, p0, Lk0/b$a;->g:Lk0/b;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public h(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1

    iget-object p2, p0, Lk0/b$a;->g:Lk0/b;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0, p3, p4}, Lk0/b;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public i()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/b$a;->g:Lk0/b;

    return-object v0
.end method

.method public j()Landroid/view/LayoutInflater;
    .locals 2

    iget-object v0, p0, Lk0/b$a;->g:Lk0/b;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lk0/b$a;->g:Lk0/b;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public k()V
    .locals 1

    iget-object v0, p0, Lk0/b$a;->g:Lk0/b;

    invoke-virtual {v0}, Lk0/b;->l()V

    return-void
.end method
